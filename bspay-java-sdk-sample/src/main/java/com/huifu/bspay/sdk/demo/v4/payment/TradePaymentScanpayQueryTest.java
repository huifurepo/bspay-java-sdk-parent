package com.huifu.bspay.sdk.demo.v4.payment;

import com.alibaba.fastjson.JSONObject;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.demo.v4.BaseCommonDemoV4;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayQueryRequest;
import com.huifu.dg.lightning.utils.BasePay;

import java.util.Map;

/**
 *
 *   本示例代码仅用于展示如何聚合交易查询
 *      文档 https://paas.huifu.com/open/doc/lightning/#/api/聚合交易查询
 *      api https://api.huifu.com/v4/trade/payment/scanpay/query
 *   真实数据。Use at your own risk.
 *  */
public class TradePaymentScanpayQueryTest {
    public static void transQueryPord() throws Exception {
        BaseCommonDemoV4.doInit(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentScanpayQueryRequest request = new TradePaymentScanpayQueryRequest();
        // 请求日期
        request.setReqDate("20251017");
        // 商户号
        request.setHuifuId("6666000109133323");
        request.setHfSeqId("002900TOP2A251017152703P414ac139c4a00000");//请求的HF订单序列号
        Map<String, Object> response = Factory.Payment.Common().query(request);
        System.out.println("返回数据:" + JSONObject.toJSONString(response));
    }

    public static void main(String[] args) throws Exception {
        transQueryPord();
    }
}
