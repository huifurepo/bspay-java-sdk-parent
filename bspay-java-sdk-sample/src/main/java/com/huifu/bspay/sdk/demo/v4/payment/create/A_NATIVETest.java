package com.huifu.bspay.sdk.demo.v4.payment.create;

import com.alibaba.fastjson.JSON;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.demo.v4.BaseCommonDemoV4;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.AcctInfo;
import com.huifu.dg.lightning.models.AcctSplitBunch;
import com.huifu.dg.lightning.models.payment.TradePaymentCreateRequest;
import com.huifu.dg.lightning.utils.BasePay;
import com.huifu.dg.lightning.utils.DateTools;
import com.huifu.dg.lightning.utils.SequenceTools;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 *
 * 本示例代码仅用于展示如何访问
 *    文档 https://paas.huifu.com/open/doc/lightning/#/api/聚合支付下单
 *    api https://api.huifu.com/v4/trade/payment/create
 * 真实数据。Use at your own risk.
 */
public class A_NATIVETest {
    public static void main(String[] args) throws Exception {
        A_NATIVE_PROD();
    }

    public static void A_NATIVE_PROD() throws Exception{
        BaseCommonDemoV4.doInit(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentCreateRequest request = new TradePaymentCreateRequest();
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());// 请求日期
        request.setReqSeqId(SequenceTools.getReqSeqId32()); // 请求流水号
        request.setHuifuId("6666000109133323"); // 商户号
        request.setGoodsDesc("api_test");// 商品描述
        request.setTransAmt("0.03"); // 交易金额
        request.setRemark("alipay:ID:102");//交易备注
// 设置超时时间
//        request.setTimeExpire("20250916202931");
// 设置异步通知地址
        request.setNotifyUrl("https:/www.demoSite.com/api/public/hf/smstorecallback");
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

//以下为支付宝JS支付需要的参数
        String aliDataString="";
//        AlipayData alipayData = new AlipayData();
//        alipayData.setBuyerId("2088111111111111");
//支付宝相关参数可参考官方文档 https://opendocs.alipay.com/mini/6039ed0c_alipay.trade.create?scene=de4d6a1e0c6e423b9eefa7c3a6dcb7a5&pathHash=779dc517
//        aliDataString = JSON.toJSONString(alipayData);
        request.setTradeType("A_NATIVE"); // 交易类型 - 支付宝js
        Map<String, Object> response = Factory.Payment.Common()
                .optional("method_expand", JSON.toJSONString(aliDataString)).create(request);
        System.out.println("A_NATIVE返回数据:" +  JSON.toJSONString(response));
        System.out.println("请用复制到浏览器显示二维码，然后用支付宝扫描： " + " https://quickchart.io/qr?text= " + response.get("qr_code") + "&size=300");
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
