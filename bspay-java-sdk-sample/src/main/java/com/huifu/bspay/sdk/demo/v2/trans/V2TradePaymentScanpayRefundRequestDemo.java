package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePaymentScanpayRefundRequest;

/**
 * 扫码交易退款 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePaymentScanpayRefundRequest.class)
public class V2TradePaymentScanpayRefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePaymentScanpayRefundRequest request = new V2TradePaymentScanpayRefundRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000108854952");
        // 申请退款金额
        request.setOrdAmt("0.01");
        // 原交易请求日期
        request.setOrgReqDate("20221107");

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
        extendInfoMap.put("org_hf_seq_id", "002900TOP3B221107142320P992ac139c0c00000");
        // 原交易微信支付宝的商户单号
        // extendInfoMap.put("org_party_order_id", "");
        // 原交易请求流水号
        // extendInfoMap.put("org_req_seq_id", "");
        // 安全信息
        // extendInfoMap.put("risk_check_data", getRiskCheckData());
        // 设备信息
        // extendInfoMap.put("terminal_device_data", getTerminalDeviceData());
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", getAcctSplitBunchRucan());
        // 数字货币扩展参数集合
        // extendInfoMap.put("digital_currency_data", getDigitalCurrencyData());
        // 备注
        // extendInfoMap.put("remark", "");
        // 异步通知地址
        // extendInfoMap.put("notify_url", "");
        // 是否垫资退款
        // extendInfoMap.put("loan_flag", "");
        // 垫资承担者
        // extendInfoMap.put("loan_undertaker", "");
        // 垫资账户类型
        // extendInfoMap.put("loan_acct_type", "");
        // 补贴支付信息
        // extendInfoMap.put("combinedpay_data", getCombinedpayData());
        return extendInfoMap;
    }

    private static String getRiskCheckData() {
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

    private static String getTerminalDeviceData() {
        JSONObject dto = new JSONObject();
        // 设备类型
        // dto.put("device_type", "");
        // 交易设备IP
        // dto.put("device_ip", "");
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

    private static JSON getAcctInfosRucan() {
        JSONObject dto = new JSONObject();
        // 分账金额
        // dto.put("div_amt", "test");
        // 被分账方ID
        // dto.put("huifu_id", "test");
        // 垫资金额
        // dto.put("part_loan_amt", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getAcctSplitBunchRucan() {
        JSONObject dto = new JSONObject();
        // 分账信息列表
        // dto.put("acct_infos", getAcctInfosRucan());

        return dto.toJSONString();
    }

    private static String getDigitalCurrencyData() {
        JSONObject dto = new JSONObject();
        // 退款原因
        // dto.put("refund_desc", "");

        return dto.toJSONString();
    }

    private static String getCombinedpayData() {
        JSONObject dto = new JSONObject();
        // 补贴方汇付编号
        // dto.put("huifu_id", "test");
        // 补贴方类型
        // dto.put("user_type", "test");
        // 补贴方账户号
        // dto.put("acct_id", "test");
        // 补贴金额
        // dto.put("amount", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
