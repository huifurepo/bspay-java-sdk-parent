package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeOnlinepaymentWappayRequest;

/**
 * 手机WAP支付 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeOnlinepaymentWappayRequest.class)
public class V2TradeOnlinepaymentWappayRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeOnlinepaymentWappayRequest request = new V2TradeOnlinepaymentWappayRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000103124174");
        // 交易金额
        request.setTransAmt("300.01");
        // 分期期数分期支付时必填；支持：03、06、12、24；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：03&lt;/font&gt;；&lt;br/&gt;空值时是wap支付；
        request.setInstalmentsNum("03");
        // 银行卡号instalments_num不为空时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6228480031509440000&lt;/font&gt;
        request.setBankCardNo("6222021102043040313");
        // 网联扩展数据
        request.setExtendPayData(getExtendPayData());
        // 安全信息
        request.setRiskCheckData(getRiskCheckData());
        // 设备信息
        request.setTerminalDeviceData(getTerminalDeviceData());
        // 页面跳转地址
        request.setFrontUrl("http://www.baidu.com");
        // 异步通知地址
        request.setNotifyUrl("virgo://http://192.168.25.213:30030/sspc/onlineAsync");

        // 设置非必填字段
        Map<String, Object> extendInfoMap = getExtendInfos();
        request.setExtendInfo(extendInfoMap);

        // 3. 发起API调用
        Map<String, Object> response = doExecute(request, true);
        System.out.println("返回数据:" + JSONObject.toJSONString(response));
    }

    /**
     * 非必填字段
     * @return
     */
    private static Map<String, Object> getExtendInfos() {
        // 设置非必填字段
        Map<String, Object> extendInfoMap = new HashMap<>();
        // 延时标记
        extendInfoMap.put("delay_acct_flag", "N");
        // 交易有效期
        extendInfoMap.put("time_expire", "20220406210038");
        // 分账对象
        extendInfoMap.put("acct_split_bunch", getAcctSplitBunchRucan());
        // 备注
        extendInfoMap.put("remark", "");
        // 页面失败跳转地址
        extendInfoMap.put("front_fail_url", "http://www.baidu.com");
        return extendInfoMap;
    }

    private static String getExtendPayData() {
        JSONObject dto = new JSONObject();
        // 商品简称
        dto.put("goods_short_name", "一般商品");
        // 网关支付受理渠道
        dto.put("gw_chnnl_tp", "01");
        // 业务种类
        dto.put("biz_tp", "123456");

        return dto.toJSONString();
    }

    private static JSON getAcctInfos() {
        JSONObject dto = new JSONObject();
        // 支付金额
        // dto.put("div_amt", "");
        // 分账接收方ID
        // dto.put("huifu_id", "");
        // 账户号
        // dto.put("acct_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getAcctSplitBunchRucan() {
        JSONObject dto = new JSONObject();
        // 分账信息列表
        dto.put("acct_infos", getAcctInfos());

        return dto.toJSONString();
    }

    private static String getRiskCheckData() {
        JSONObject dto = new JSONObject();
        // ip地址
        dto.put("ip_addr", "111");
        // 基站地址
        // dto.put("base_station", "");
        // 纬度
        // dto.put("latitude", "");
        // 经度
        // dto.put("longitude", "");

        return dto.toJSONString();
    }

    private static String getTerminalDeviceData() {
        JSONObject dto = new JSONObject();
        // 交易设备ip
        dto.put("device_ip", "127.0.0.1");
        // 设备类型
        dto.put("device_type", "1");
        // 交易设备gps
        // dto.put("device_gps", "");
        // 交易设备iccid
        // dto.put("device_icc_id", "");
        // 交易设备imei
        // dto.put("device_imei", "");
        // 交易设备imsi
        // dto.put("device_imsi", "");
        // 交易设备mac
        // dto.put("device_mac", "");
        // 交易设备wifimac
        // dto.put("device_wifi_mac", "");

        return dto.toJSONString();
    }

}
