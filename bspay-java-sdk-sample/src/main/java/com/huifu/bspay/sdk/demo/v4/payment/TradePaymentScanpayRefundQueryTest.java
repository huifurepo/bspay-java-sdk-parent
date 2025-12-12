package com.huifu.bspay.sdk.demo.v4.payment;

import com.alibaba.fastjson.JSONObject;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.demo.v4.BaseCommonDemoV4;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayRefundQueryRequest;
import com.huifu.dg.lightning.utils.BasePay;

import java.util.Map;

/**
 *
 *   本示例代码仅用于展示如何聚合退款查询
 *      文档 https://paas.huifu.com/open/doc/lightning/#/api/交易退款查询
 *      api https://api.huifu.com/v4/trade/payment/scanpay/refundquery
 *   真实数据。Use at your own risk.
 *  */
public class TradePaymentScanpayRefundQueryTest {

    public static void scanpayRefundQuery() throws Exception {
        BaseCommonDemoV4.doInit(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentScanpayRefundQueryRequest request = new TradePaymentScanpayRefundQueryRequest();
        // 商户号
        request.setHuifuId("6666000103334211");
        request.setMerOrdId("2025082610443155900102tt");
        Map<String, Object> response = Factory.Payment.Common().refundQuery(request);
        System.out.println("返回数据:" + JSONObject.toJSONString(response));
    }

    public static void main(String[] args) throws Exception {
        scanpayRefundQuery();
    }
}
