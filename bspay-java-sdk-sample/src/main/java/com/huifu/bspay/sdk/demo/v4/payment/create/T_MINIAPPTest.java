package com.huifu.bspay.sdk.demo.v4.payment.create;

import com.alibaba.fastjson.JSON;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.demo.v4.BaseCommonDemoV4;
import com.huifu.dg.lightning.factory.Factory;
import com.huifu.dg.lightning.models.AcctInfo;
import com.huifu.dg.lightning.models.AcctSplitBunch;
import com.huifu.dg.lightning.models.WxData;
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
public class T_MINIAPPTest {

    public static void main(String[] args) throws Exception {
        T_MINIAPP_PROD();
    }


    public static void T_MINIAPP_PROD() throws Exception{
        BaseCommonDemoV4.doInit(OppsMerchantConfigDemo.getMerchantConfig());


        TradePaymentCreateRequest request = new TradePaymentCreateRequest();
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());// 请求日期
        request.setReqSeqId(SequenceTools.getReqSeqId32()); // 请求流水号
        request.setHuifuId("6666000109133323"); // 商户号
        request.setGoodsDesc("hibs自动化-通用版验证");// 商品描述
        request.setTransAmt("0.04"); // 交易金额
        request.setRemark("JSPAY:ID:102");//交易备注
        request.setNotifyUrl("https:/www.demoSite.com/api/public/hf/smstorecallback");
// 实时分账能力start 设置分账信息，需要分账权限
        // 通过对象方式拼装分账串
        AcctSplitBunch bunch = buildAcctSplitBunch();
        String acctSplitJson = JSON.toJSONString(bunch);
        //"{\"acct_infos\":[{\"div_amt\":\"4.00\",\"huifu_id\":\"666600016871111\"}," +
        //                "{\"div_amt\":\"16.00\",\"huifu_id\":\"6666000169391112\"}]}"
        //request.setAcctSplitBunch(acctSplitJson);
// 实时分账能力end


        request.setTradeType("T_MINIAPP"); // 交易类型 - 微信小程序
        //以下为微信小程序需要的参数
        String wxDataString="";
        WxData wxData = new WxData();
        wxData.setSubOpenid("o8jhotzittQSetZ-N0Yj4Hz91Rqc");
        wxData.setSubAppid("wxdfe9a5d141f96685");
        //微信相关参数可参考官方文档 https://pay.weixin.qq.com/doc/v2/merchant/4011935214
        //复杂{"body":"香土鸡餐馆：线下支付","detail":{"cost_price":"1.0","goods_detail":[{"goods_id":"1967776038541551111","goods_name":"香土鸡餐馆：线下支付","price":"1.0","quantity":1}],"receipt_id":"1970743410445500000"},"scene_info":{"store_info":{"id":"1967776038541550000","name":"香土鸡餐馆：线下支付"}},"sub_appid":"wx969f2ef2df1111","sub_openid":"oqVX87O2I2U3rT-BBBBBBBB-YsU"}
        wxDataString = JSON.toJSONString(wxData);

        Map<String, Object> response = Factory.Payment.Common()
                .optional("method_expand", wxDataString).create(request);
        System.out.println("T_MINIAPP返回数据:" +  JSON.toJSONString(response));
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
