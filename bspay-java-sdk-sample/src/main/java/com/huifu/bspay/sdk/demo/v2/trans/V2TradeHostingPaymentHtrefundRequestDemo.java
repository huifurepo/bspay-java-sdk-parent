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
 * 统一收银台交易退款 - 示例
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
        request.setRiskCheckData(get7f70e439E8f340f3Aac98f26d2971bd4());
        // 设备信息线上交易退款必填，参见线上退款接口；jsonObject字符串
        request.setTerminalDeviceData(getF76c79c938b7435085942a78867054da());
        // 大额转账支付账户信息数据jsonObject格式；银行大额转账支付交易退款申请时必填
        // request.setBankInfoData(get7ce83f339ef6473e8e203eeb203e15fd());

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
        extendInfoMap.put("acct_split_bunch", get9439c978Ac09445589fc798a88275b20());
        // 备注
        // extendInfoMap.put("remark", "");
        // 是否垫资退款
        // extendInfoMap.put("loan_flag", "");
        // 垫资承担者
        // extendInfoMap.put("loan_undertaker", "");
        // 垫资账户类型
        // extendInfoMap.put("loan_acct_type", "");
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        // 抖音拓展参数集合
        // extendInfoMap.put("dy_data", getB307963107c54ada8bad0a0c4e1d9cd8());
        return extendInfoMap;
    }

    private static JSON get27ca349c55d04639B266C96deda3910d() {
        JSONObject dto = new JSONObject();
        // 分账金额
        dto.put("div_amt", "0.12");
        // 分账接收方ID
        dto.put("huifu_id", "6666000003100616");
        // 垫资金额
        // dto.put("part_loan_amt", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get9439c978Ac09445589fc798a88275b20() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", get27ca349c55d04639B266C96deda3910d());

        return dto.toJSONString();
    }

    private static String get7f70e439E8f340f3Aac98f26d2971bd4() {
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

    private static String getF76c79c938b7435085942a78867054da() {
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

    private static String get7ce83f339ef6473e8e203eeb203e15fd() {
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

    private static String getB307963107c54ada8bad0a0c4e1d9cd8() {
        JSONObject dto = new JSONObject();
        // 退款原因
        // dto.put("refund_desc", "");

        return dto.toJSONString();
    }

}
