package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeOnlinepaymentQuickpayFrontpayRequest;

/**
 * 快捷支付页面版 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeOnlinepaymentQuickpayFrontpayRequest.class)
public class V2TradeOnlinepaymentQuickpayFrontpayRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeOnlinepaymentQuickpayFrontpayRequest request = new V2TradeOnlinepaymentQuickpayFrontpayRequest();
        // 业务请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 订单金额
        request.setTransAmt("0.01");
        // 银行扩展信息
        request.setExtendPayData(getA5a44257248146f586ec9275ef51ed56());
        // 设备信息
        request.setTerminalDeviceData(get843a86e56f334304Ac7c38c6524abd82());
        // 安全信息
        request.setRiskCheckData(getE7f925f2Ab5041919687F439e2fba4ad());
        // 异步通知地址
        request.setNotifyUrl("http://www.baidu.com");

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
        // extendInfoMap.put("user_huifu_id", "");
        // 订单类型
        extendInfoMap.put("order_type", "P");
        // 订单失效时间
        extendInfoMap.put("time_expire", "");
        // 商品描述
        extendInfoMap.put("goods_desc", "快捷支付接口");
        // 请求类型
        extendInfoMap.put("request_type", "P");
        // 延时标记
        // extendInfoMap.put("delay_acct_flag", "");
        // 分账串
        extendInfoMap.put("acct_split_bunch", get82800b8cE35d42b9B688260754e5deef());
        // 手续费扣款标志
        extendInfoMap.put("fee_flag", "2");
        // 备注
        extendInfoMap.put("remark", "remark快捷支付接口");
        // 页面跳转地址
        extendInfoMap.put("front_url", "http://www.baidu.com");
        return extendInfoMap;
    }

    private static JSON getDef0a935D6a343269064019353c3caf5() {
        JSONObject dto = new JSONObject();
        // 分账接收方ID
        dto.put("huifu_id", "6666000109133323");
        // 分账金额
        dto.put("div_amt", "0.01");
        // 账户号
        // dto.put("acct_id", "");
        // 分账百分比%
        // dto.put("percentage_div", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get82800b8cE35d42b9B688260754e5deef() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", getDef0a935D6a343269064019353c3caf5());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static String getA5a44257248146f586ec9275ef51ed56() {
        JSONObject dto = new JSONObject();
        // 商品简称
        dto.put("goods_short_name", "01");
        // 业务种类
        dto.put("biz_tp", "123451");
        // 网关支付受理渠道
        dto.put("gw_chnnl_tp", "02");

        return dto.toJSONString();
    }

    private static String get843a86e56f334304Ac7c38c6524abd82() {
        JSONObject dto = new JSONObject();
        // 设备类型
        dto.put("device_type", "1");
        // 交易设备IP
        dto.put("device_ip", "127.0.0.1");
        // 交易设备MAC
        // dto.put("device_mac", "");
        // 交易设备IMEI
        // dto.put("device_imei", "");
        // 交易设备IMSI
        // dto.put("device_imsi", "");
        // 交易设备ICCID
        // dto.put("device_icc_id", "");
        // 交易设备WIFIMAC
        // dto.put("device_wifi_mac", "");
        // 交易设备GPS
        // dto.put("device_gps", "");

        return dto.toJSONString();
    }

    private static String getE7f925f2Ab5041919687F439e2fba4ad() {
        JSONObject dto = new JSONObject();
        // ip地址
        dto.put("ip_addr", "127.0.0.1");
        // 基站地址
        // dto.put("base_station", "");
        // 纬度
        // dto.put("latitude", "");
        // 经度
        // dto.put("longitude", "");

        return dto.toJSONString();
    }

}
