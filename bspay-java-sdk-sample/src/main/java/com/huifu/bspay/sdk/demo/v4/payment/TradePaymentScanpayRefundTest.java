package com.huifu.bspay.sdk.demo.v4.payment;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.demo.v4.BaseCommonDemoV4;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.TerminalDeviceData;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayRefundRequest;
import com.huifu.dg.lightning.utils.BasePay;

import java.util.Map;

/**
 *
 *   本示例代码仅用于展示如何交易退款查询
 *      文档 https://paas.huifu.com/open/doc/lightning/#/api/交易退款查询
 *      api https://api.huifu.com/v4/trade/payment/scanpay/refundquery
 *   真实数据。Use at your own risk.
 *  */
public class TradePaymentScanpayRefundTest {
    public static void transRefund() throws Exception {
        BaseCommonDemoV4.doInit(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentScanpayRefundRequest request = new TradePaymentScanpayRefundRequest();
        // 请求日期
        request.setReqDate("20250828");
        // 请求流水号
        request.setReqSeqId("20250828154349459562250tt");
        // 商户号
        request.setHuifuId("6666000104590764");
        request.setOrgReqDate("20250828");
        request.setOrgReqSeqId("20250828154349459562250");
        request.setOrdAmt("0.50");
        Map<String, Object> response = Factory.Payment.Common()
                .optional("terminal_device_data", getTerminalDeviceData())
                .refund(request);
        System.out.println("返回数据:" + JSONObject.toJSONString(response));
    }

    private static String getTerminalDeviceData() throws Exception{
        TerminalDeviceData terminalDeviceData = new TerminalDeviceData();
        terminalDeviceData.setDeviceIp("172.28.52.52");
        terminalDeviceData.setDevsId("660035730205200164801");
        return JSON.toJSONString(terminalDeviceData);
    }


    public static void main(String[] args) throws Exception {
        transRefund();
    }
}
