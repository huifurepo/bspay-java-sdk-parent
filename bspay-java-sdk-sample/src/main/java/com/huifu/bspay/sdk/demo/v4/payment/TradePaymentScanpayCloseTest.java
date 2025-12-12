package com.huifu.bspay.sdk.demo.v4.payment;

import com.alibaba.fastjson.JSONObject;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.demo.v4.BaseCommonDemoV4;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayCloseRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.Map;

/**
 *
 *   本示例代码仅用于展示如何聚合交易关单
 *      文档 https://paas.huifu.com/open/doc/lightning/#/api/扫码交易关单
 *      api https://api.huifu.com/v2/trade/payment/scanpay/close
 *   真实数据。Use at your own risk.
 *  */
public class TradePaymentScanpayCloseTest {
    public static void transCloseQuery() throws Exception {
        BaseCommonDemoV4.doInit(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentScanpayCloseRequest request = new TradePaymentScanpayCloseRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000003100616");
        request.setOrgReqDate("20200422");
        request.setOrgReqSeqId("1399999561616618");
        Map<String, Object> response = Factory.Payment.Common().close(request);
        System.out.println("返回数据:" + JSONObject.toJSONString(response));
    }

    public static void main(String[] args) throws Exception {
        transCloseQuery();
    }
}
