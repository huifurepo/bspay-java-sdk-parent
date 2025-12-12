package com.huifu.bspay.sdk.demo.v4.payment;

import com.alibaba.fastjson.JSONObject;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.demo.v4.BaseCommonDemoV4;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.payment.TradePaymentScanpayClosequeryRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.SequenceTools;

import java.util.Map;

/**
 *
 *
 *
 *   本示例代码仅用于展示如何聚合交易关单查询
 *      文档 https://paas.huifu.com/open/doc/lightning/#/api/聚合交易关单查询
 *      api https://api.huifu.com/v2/trade/payment/scanpay/closequery
 *   真实数据。Use at your own risk.
 *  */
public class TradePaymentScanpayCloseQueryTest {
    public static void transClose() throws Exception {
        BaseCommonDemoV4.doInit(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentScanpayClosequeryRequest request = new TradePaymentScanpayClosequeryRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000003141435");
        request.setOrgReqDate("20210916");
        request.setOrgReqSeqId("20210916165555E35877");
        request.setOrgHfSeqId("0036000topA210916165555P153c0a8559500000");
        Map<String, Object> response = Factory.Payment.Common().closeQuery(request);
        System.out.println("返回数据:" + JSONObject.toJSONString(response));
    }

    public static void main(String[] args) throws Exception {
        transClose();
    }
}
