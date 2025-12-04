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
 * @description: 扫码交易关单
 * @author: wang.hu_c
 * @date: 2025年08月28日
 */
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
