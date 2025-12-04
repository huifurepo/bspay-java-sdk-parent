package com.huifu.bspay.sdk.demo.v4.payment.create;

import com.alibaba.fastjson.JSON;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.demo.v4.BaseCommonDemoV4;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.AcctInfo;
import com.huifu.dg.lightning.models.AcctSplitBunch;
import com.huifu.dg.lightning.models.AlipayData;
import com.huifu.dg.lightning.models.payment.TradePaymentCreateRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.SequenceTools;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
/**
 * @author bo.dong
 * @date 2025/10/13 11:23
 * @description 支付宝正扫支付及支付宝JS支付参考该demo
 */
public class A_JSAPITest {
    public static void main(String[] args) throws Exception {
        A_JSAPI_PROD();
    }
    public static void A_JSAPI_PROD() throws Exception{
        // 初始化商户配置（与v2一样都需要单独初始化一次）
        BaseCommonDemoV4.doInit(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentCreateRequest request = new TradePaymentCreateRequest();
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD()); // 请求日期
        request.setReqSeqId(SequenceTools.getReqSeqId32()); // 请求流水号
        request.setHuifuId("6666000109133323"); // 商户号
        request.setGoodsDesc("hibs自动化-通用版验证"); // 商品描述
        request.setTransAmt("0.05"); // 交易金额
        request.setRemark("alipay:ID:102"); // 交易备注
// 设置超时时间
//        request.setTimeExpire("20250916202931");
// 设置异步通知地址
        request.setNotifyUrl("https://www.demoSite.com/api/public/hf/smstorecallback");
// 延迟交易能力 延迟入账标识
        request.setDelayAcctFlag("N");

// 实时分账能力start 设置分账信息，需要分账权限
        // 通过对象方式拼装分账串
        AcctSplitBunch bunch = buildAcctSplitBunch();
        String acctSplitJson = JSON.toJSONString(bunch);
        //"{\"acct_infos\":[{\"div_amt\":\"4.00\",\"huifu_id\":\"666600016871111\"}," +
        //                "{\"div_amt\":\"16.00\",\"huifu_id\":\"6666000169391112\"}]}"
        //request.setAcctSplitBunch(acctSplitJson);
// 实时分账能力end

// 以下为支付宝JS支付需要的参数（由前端获取 openid/buyerId 等信息）
        String aliDataString = "";
        AlipayData alipayData = new AlipayData();
        // 需要前端获取 buyerId；buyerId 与 buyerLogonId 不能同时为空
        alipayData.setBuyerId("208870269990XXXX");
//        alipayData.setBuyerLogonId("string");
        // 支付宝参数说明参考官方文档：https://opendocs.alipay.com/mini/6039ed0c_alipay.trade.create
        aliDataString = JSON.toJSONString(alipayData);
        request.setTradeType("A_JSAPI"); // 交易类型 - 支付宝 JS

        // 传入支付宝扩展参数；notify_url 已通过 request.setNotifyUrl 设置，无需重复传入
        Map<String, Object> response = Factory.Payment.Common()
                .optional("method_expand", aliDataString)
                .create(request);
        System.out.println("A_JSAPI返回数据:" + JSON.toJSONString(response));
    }

    @NotNull
    private static AcctSplitBunch buildAcctSplitBunch() {
        java.util.List<AcctInfo> infos = new java.util.ArrayList<>();
        AcctInfo a = new AcctInfo();
        a.setHuifuId("666600016871111");
        a.setDivAmt("4.00");
        infos.add(a);
        AcctInfo b = new AcctInfo();
        b.setHuifuId("6666000169391112");
        b.setDivAmt("16.00");
        infos.add(b);
        AcctSplitBunch bunch = new AcctSplitBunch();
        bunch.setAcctInfos(infos);
        return bunch;
    }


}
