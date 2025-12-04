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
 * @author bo.dong
 * @date 2025/10/13 11:17
 * @description银联付款码demo
 */
public class T_MICROPAYTest {
    public static void main(String[] args) throws Exception {
        T_MICROPAY();
    }
    public  static void T_MICROPAY() throws Exception{
        BaseCommonDemoV4.doInit(OppsMerchantConfigDemo.getMerchantConfig());
        TradePaymentCreateRequest request = new TradePaymentCreateRequest();
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());// 请求日期
        request.setReqSeqId(SequenceTools.getReqSeqId32()); // 请求流水号
        request.setHuifuId("6666000109133323"); // 商户号
        request.setGoodsDesc("hibs自动化-通用版验证");// 商品描述
        request.setTransAmt("0.05"); // 交易金额
        request.setRemark("JSPAY:ID:102");//交易备注
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

//以下为微信小程序需要的参数
        String wxDataString="";
// {"sub_appid":"wxa350b4c0fd003192","sub_openid":"o4n3E6q8MOEQefCsGKVOAh40spNw"}
// {"openId":"ow-Xw5prGjuQlh6xjeOjY1ne2ks8"}"
        WxData wxData = new WxData();
        wxData.setSubOpenid("o8jhotzittQSeFF-N0Yj4Hz91Rqc");
        wxData.setAuthCode("131135212661863252");
//微信相关参数可参考官方文档 https://pay.weixin.qq.com/doc/v2/merchant/4011937125
//复杂示例{"authCode":"112345678765432","subAppid":"wx4f4f5a5f5a5f5a53332","subOpenid":"o8jhotzittQSetZ-11111","detail":{"wxGoodsDetail":[{"goodsId":"6948682505111","goodsName":"白公主抽纸8包装","price":"1300","quantity":1},{"goodsId":"6926265321111","goodsName":"上好佳八宝糖","price":"480","quantity":1}]}}
//微信付款码必传终端信息 TerminalDeviceData 对象
        request.setTerminalDeviceData("{\"device_ip\":\"172.28.52.52\",\"mer_device_type\":\"11\",\"devs_id\":\"SPINTP351420900692801\"}");
        wxDataString = JSON.toJSONString(wxData);
        request.setTradeType("T_MICROPAY"); // 交易类型
        Map<String, Object> response = Factory.Payment.Common()
                .optional("method_expand",wxDataString).create(request);
        System.out.println("T_MICROPAY返回数据:" + JSON.toJSONString(response));
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
