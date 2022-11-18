package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeOnlinepaymentQuickpayPageinfoRequest;

/**
 * 快捷支付页面版接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeOnlinepaymentQuickpayPageinfoRequest.class)
public class V2TradeOnlinepaymentQuickpayPageinfoRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeOnlinepaymentQuickpayPageinfoRequest request = new V2TradeOnlinepaymentQuickpayPageinfoRequest();
        // 业务请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000108854952");
        // 订单金额
        request.setTransAmt("1.02");
        // 设备信息
        request.setTerminalDeviceData(getTerminalDeviceData());
        // 银行扩展信息
        request.setExtendPayData(getExtendPayData());
        // 安全信息
        request.setRiskCheckData(getRiskCheckData());
        // 异步通知地址
        request.setNotifyUrl("http://www.chinapnr.com");

        // 设置非必填字段
        Map<String, Object> extendInfoMap = getExtendInfos();
        request.setExtendInfo(extendInfoMap);

        // 3. 发起API调用
        Map<String, Object> response = doExecute(request);
        System.out.println("返回数据:" + JSONObject.toJSONString(response));
    }

    /**
     * 非必填字段
     * @return
     */
    private static Map<String, Object> getExtendInfos() {
        // 设置非必填字段
        Map<String, Object> extendInfoMap = new HashMap<>();
        // 用户客户号
        extendInfoMap.put("user_huifu_id", "");
        // 订单类型
        extendInfoMap.put("order_type", "P");
        // 请求类型
        extendInfoMap.put("request_type", "P");
        // 订单失效时间
        extendInfoMap.put("time_expire", "");
        // 备注
        extendInfoMap.put("remark", "remark快捷支付接口");
        // 分账串
        extendInfoMap.put("acct_split_bunch", getAcctSplitBunchRucan());
        // 页面跳转地址
        extendInfoMap.put("front_url", "http://www.chinapnr.com");
        return extendInfoMap;
    }

    private static String getTerminalDeviceData() {
        JSONObject dto = new JSONObject();
        // 设备类型
        dto.put("device_type", "1");
        // 交易设备IP
        dto.put("device_ip", "127.0.0.1");
        // 交易设备MAC
        dto.put("device_mac", "");
        // 交易设备IMEI
        dto.put("device_imei", "");
        // 交易设备IMSI
        dto.put("device_imsi", "");
        // 交易设备ICCID
        dto.put("device_icc_id", "");
        // 交易设备WIFIMAC
        dto.put("device_wifi_mac", "");
        // 交易设备GPS
        dto.put("device_gps", "");

        return dto.toJSONString();
    }

    private static String getRiskCheckData() {
        JSONObject dto = new JSONObject();
        // ip地址
        dto.put("ip_addr", "127.0.0.1");
        // 基站地址
        dto.put("base_atation", "");
        // 纬度
        dto.put("latitude", "");
        // 经度
        dto.put("longitude", "");

        return dto.toJSONString();
    }

    private static JSON getAcctInfos() {
        JSONObject dto = new JSONObject();
        // 被分账对象ID
        dto.put("huifu_id", "test");
        // 分账金额
        dto.put("div_amt", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getExtendPayData() {
        JSONObject dto = new JSONObject();
        // 网关支付受理渠道
        dto.put("gw_chnnl_tp", "02");
        // 商品简称
        dto.put("goods_short_name", "01");
        // 业务种类
        dto.put("biz_tp", "123451");

        return dto.toJSONString();
    }

    private static String getAcctSplitBunchRucan() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", getAcctInfos());

        return dto.toJSONString();
    }

}
