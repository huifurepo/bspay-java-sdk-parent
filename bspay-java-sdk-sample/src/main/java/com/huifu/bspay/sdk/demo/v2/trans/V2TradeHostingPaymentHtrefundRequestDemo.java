package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeHostingPaymentHtrefundRequest;

/**
 * 托管交易退款 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeHostingPaymentHtrefundRequest.class)
public class V2TradeHostingPaymentHtrefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeHostingPaymentHtrefundRequest request = new V2TradeHostingPaymentHtrefundRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000003100616");
        // 申请退款金额
        request.setOrdAmt("0.01");
        // 原交易请求日期
        request.setOrgReqDate("20240229");
        // 安全信息线上交易退款必填，参见线上退款接口；jsonObject字符串
        request.setRiskCheckData(get195595a868964f2bB023E9566fcd0297());
        // 设备信息线上交易退款必填，参见线上退款接口；jsonObject字符串
        request.setTerminalDeviceData(get8d8843c250f94e9b80a253d37ec6f80a());
        // 大额转账支付账户信息数据jsonObject格式；银行大额转账支付交易退款申请时必填
        // request.setBankInfoData(getAa3a4591240343e2Bad5D6a0764f06dc());

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
        // 原交易全局流水号
        extendInfoMap.put("org_hf_seq_id", "");
        // 原交易微信支付宝的商户单号
        extendInfoMap.put("org_party_order_id", "");
        // 原交易请求流水号
        extendInfoMap.put("org_req_seq_id", "202207099803123123199941");
        // 分账对象
        extendInfoMap.put("acct_split_bunch", get4a68d378Cb6e41dfA9405a589b476160());
        // 备注
        // extendInfoMap.put("remark", "");
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        return extendInfoMap;
    }

    private static JSON get33a52525B1614d3bBc18Ff7d935b2bca() {
        JSONObject dto = new JSONObject();
        // 分账金额
        dto.put("div_amt", "0.12");
        // 分账接收方ID
        dto.put("huifu_id", "6666000003100616");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get4a68d378Cb6e41dfA9405a589b476160() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", get33a52525B1614d3bBc18Ff7d935b2bca());

        return dto.toJSONString();
    }

    private static String get195595a868964f2bB023E9566fcd0297() {
        JSONObject dto = new JSONObject();
        // ip地址
        // dto.put("ip_addr", "");
        // 基站地址
        // dto.put("base_station", "");
        // 纬度
        // dto.put("latitude", "");
        // 经度
        // dto.put("longitude", "");

        return dto.toJSONString();
    }

    private static String get8d8843c250f94e9b80a253d37ec6f80a() {
        JSONObject dto = new JSONObject();
        // 设备类型
        dto.put("device_type", "4");
        // 交易设备IP
        // dto.put("device_ip", "");
        // 交易设备MAC
        // dto.put("device_mac", "");
        // 交易设备GPS
        // dto.put("device_gps", "");
        // 交易设备IMEI
        // dto.put("device_imei", "");
        // 交易设备IMSI
        // dto.put("device_imsi", "");
        // 交易设备ICCID
        // dto.put("device_icc_id", "");
        // 交易设备WIFIMAC
        // dto.put("device_wifi_mac", "");

        return dto.toJSONString();
    }

    private static String getAa3a4591240343e2Bad5D6a0764f06dc() {
        JSONObject dto = new JSONObject();
        // 省份付款方为对公账户时必填，参见省市地区码；示例值：0013
        // dto.put("province", "test");
        // 地区付款方为对公账户时必填，参见省市地区码；示例值：1301
        // dto.put("area", "test");
        // 银行编号付款方为对公账户时必填，参考：银行编码； 示例值：01040000
        // dto.put("bank_code", "test");
        // 联行号付款方为对公账户时必填，参见：银行支行编码； 示例值：102290026507
        // dto.put("correspondent_code", "test");
        // 付款方账户类型
        // dto.put("card_acct_type", "");

        return dto.toJSONString();
    }

}
