package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBusiHeadConfigRequest;

/**
 * 开通下级商户权限配置接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantBusiHeadConfigRequest.class)
public class V2MerchantBusiHeadConfigRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBusiHeadConfigRequest request = new V2MerchantBusiHeadConfigRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付客户Id
        request.setHuifuId("6666000108854952");
        // 产品编号
        // request.setProductId("test");
        // 直属渠道号
        // request.setUpperHuifuId("test");

        // 设置非必填字段
        Map<String, Object> extendInfoMap = getExtendInfos();
        request.setExtendInfo(extendInfoMap);

        // 3. 发起API调用
        Map<String, Object> response = doExecute(request);
        System.out.println("返回数据:" + JSONObject.toJSONString(response));
    }

    /**
     * 非必填字段
     * @return
     */
    private static Map<String, Object> getExtendInfos() {
        // 设置非必填字段
        Map<String, Object> extendInfoMap = new HashMap<>();
        // 支付宝配置对象
        // extendInfoMap.put("ali_conf_list", get3914bf384f3e4c9591b8893e9fb4f9ee());
        // 微信配置对象
        // extendInfoMap.put("wx_conf_list", get91cc2a27888c46de9614Dbb4516cc335());
        // 银联二维码配置对象
        // extendInfoMap.put("union_conf_list", get9c1d666eCe3e4aceBea5B208d80d57b2());
        // 银联卡配置对象
        // extendInfoMap.put("bank_card_config", getEd80633aEa7c4a5d928fD074dc506928());
        // 分账配置对象
        // extendInfoMap.put("split_config", get1676b226Cda745048669B065d29e072c());
        // 微信直连配置对象
        // extendInfoMap.put("wx_zl_conf_list", getA4020a4f009f414f9cf5668882108c30());
        // 支付宝直连配置对象
        // extendInfoMap.put("ali_zl_conf", get127ca5f5933b4b8e9876D7a515151d35());
        // 线上配置对象
        // extendInfoMap.put("online_fee_conf_list", getE483094bF909460c8a17De0b3f59b4c4());
        // 余额支付配置对象
        // extendInfoMap.put("balance_pay_config", get715836aeC6334963A7fb2ffc149cf4e8());
        // 补贴支付配置对象
        // extendInfoMap.put("combine_pay_config", get43f1b7b2Fb304ac6Bf74297a35a6d6d9());
        // 银行大额转账配置对象
        // extendInfoMap.put("bank_big_amt_pay_config", get5b7059499f8846c7Ad482d1d04be7ed1());
        // 全域资金管理配置对象（华通银行）
        // extendInfoMap.put("out_order_funds_config", getD5931f96E86d48ad8f4e37a2020a3697());
        // 全域资金管理配置(XW银行)
        // extendInfoMap.put("out_order_funds_new_net_config", getC3f087d6779a41e2Bd7b3be55fd71d60());
        // 结算配置对象
        // extendInfoMap.put("settle_config_list", get5b4da856D6d24c03Ad2085a10a50b664());
        // 取现配置对象
        // extendInfoMap.put("cash_config_list", get3049a308Bf07410bAac6A8b4126c73d7());
        // 外扣配置对象
        // extendInfoMap.put("out_fee_config", getD691f7c180444b7bB2c64a1547bd9208());
        // 允许开通支付宝预授权
        // extendInfoMap.put("alipay_pre_auth_flag", "");
        // 允许开通微信预授权
        // extendInfoMap.put("wechatpay_pre_auth_flag", "");
        // 允许开通商户定时结算
        // extendInfoMap.put("mer_timing_settle_flag", "");
        // 允许开通商户优先结算
        // extendInfoMap.put("mer_prior_settle_flag", "");
        // 允许使用上级商户经营信息
        // extendInfoMap.put("use_upper_mer_auth_flag", "");
        // 允许使用上级商户号发起AT交易
        // extendInfoMap.put("use_upper_mer_at_trans_flag", "");
        // 大额支付配置
        // extendInfoMap.put("large_amt_pay_config_list", get289f1fdaE59244d0B99c447fcd1b5fd1());
        // 全域资金管理配置(苏商)
        // extendInfoMap.put("out_order_funds_su_shang_config", get942bf7c5D69d489194e4218efa3bfcd3());
        // 托管支付开关
        // extendInfoMap.put("half_pay_host_flag", "");
        return extendInfoMap;
    }

    private static String get3914bf384f3e4c9591b8893e9fb4f9ee() {
        JSONObject dto = new JSONObject();
        // 支付场景
        // dto.put("pay_scene", "test");
        // 手续费
        // dto.put("fee_rate", "test");
        // 允许开通该业务
        // dto.put("open_flag", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get91cc2a27888c46de9614Dbb4516cc335() {
        JSONObject dto = new JSONObject();
        // 支付场景
        // dto.put("pay_scene", "test");
        // 手续费
        // dto.put("fee_rate", "test");
        // 允许开通该场景业务
        // dto.put("open_flag", "test");
        // 最低收取手续费（元）
        // dto.put("fee_min_amt", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get9c1d666eCe3e4aceBea5B208d80d57b2() {
        JSONObject dto = new JSONObject();
        // 借记卡手续费1000以上(%)
        // dto.put("debit_fee_rate_up", "test");
        // 银联二维码业务贷记卡手续费1000以上(%)
        // dto.put("credit_fee_rate_up", "test");
        // 借记卡手续费1000以下(%)
        // dto.put("debit_fee_rate_down", "test");
        // 银联二维码业务贷记卡手续费1000以下(%)
        // dto.put("credit_fee_rate_down", "test");
        // 允许开通银联二维码业务
        // dto.put("open_flag", "test");
        // 银联业务手续费类型
        // dto.put("charge_cate_code", "");
        // 借记卡封顶1000以上（元）
        // dto.put("debit_fee_limit_up", "");
        // 借记卡封顶1000以下（元）
        // dto.put("debit_fee_limit_down", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getEd80633aEa7c4a5d928fD074dc506928() {
        JSONObject dto = new JSONObject();
        // 借记卡手续费（%）
        // dto.put("debit_fee_rate", "test");
        // 贷记卡手续费（%）
        // dto.put("credit_fee_rate", "test");
        // 允许开通银行卡业务
        // dto.put("open_flag", "test");
        // 借记卡封顶值
        // dto.put("debit_fee_limit", "");
        // 银联手机闪付借记卡手续费1000以上（%）
        // dto.put("cloud_debit_fee_rate_up", "");
        // 银联手机闪付借记卡封顶1000以上（元）
        // dto.put("cloud_debit_fee_limit_up", "");
        // 银联手机闪付贷记卡手续费1000以上（%）
        // dto.put("cloud_credit_fee_rate_up", "");
        // 银联手机闪付借记卡手续费1000以下（%）
        // dto.put("cloud_debit_fee_rate_down", "");
        // 银联手机闪付借记卡封顶1000以下（元）
        // dto.put("cloud_debit_fee_limit_down", "");
        // 银联手机闪付贷记卡手续费1000以下（%）
        // dto.put("cloud_credit_fee_rate_down", "");

        return dto.toJSONString();
    }

    private static String get1676b226Cda745048669B065d29e072c() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 允许开通分账业务
        // dto.put("open_flag", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "");

        return dto.toJSONString();
    }

    private static String getA4020a4f009f414f9cf5668882108c30() {
        JSONObject dto = new JSONObject();
        // 支付场景
        // dto.put("pay_scene", "test");
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 允许开通微信直连业务
        // dto.put("open_flag", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get127ca5f5933b4b8e9876D7a515151d35() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 允许开通支付宝直连业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String getE483094bF909460c8a17De0b3f59b4c4() {
        JSONObject dto = new JSONObject();
        // 业务类型
        // dto.put("bus_type", "test");
        // 借贷记标识
        // dto.put("dc_flag", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 银行号
        // dto.put("bank_code", "test");
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 允许开通线上支付业务
        // dto.put("open_flag", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get715836aeC6334963A7fb2ffc149cf4e8() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通余额支付业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String get43f1b7b2Fb304ac6Bf74297a35a6d6d9() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通补贴支付业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String get5b7059499f8846c7Ad482d1d04be7ed1() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通大额转账业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String getD5931f96E86d48ad8f4e37a2020a3697() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 开户手续费（元）
        // dto.put("open_fee_fix_amt", "test");
        // 保底手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通全域资金业务（华通）
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String getC3f087d6779a41e2Bd7b3be55fd71d60() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 保底手续费(元)
        // dto.put("fee_min_amt", "test");
        // 对公固定手续费(元)
        // dto.put("public_fee_fix_amt", "test");
        // 对私固定手续费(元)
        // dto.put("private_fee_fix_amt", "test");
        // 允许开通全域资金业务(XW)
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String get5b4da856D6d24c03Ad2085a10a50b664() {
        JSONObject dto = new JSONObject();
        // 业务类型
        // dto.put("bus_type", "test");
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通结算配置
        // dto.put("open_flag", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get3049a308Bf07410bAac6A8b4126c73d7() {
        JSONObject dto = new JSONObject();
        // 业务类型
        // dto.put("bus_type", "test");
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通取现配置
        // dto.put("open_flag", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getD691f7c180444b7bB2c64a1547bd9208() {
        JSONObject dto = new JSONObject();
        // 支持结算手续费外扣
        // dto.put("settle_out_fee_flag", "test");
        // 支持交易手续费外扣
        // dto.put("trans_fee_out_flag", "test");
        // 支持取现手续费外扣
        // dto.put("cash_out_fee_flag", "test");

        return dto.toJSONString();
    }

    private static String get289f1fdaE59244d0B99c447fcd1b5fd1() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通大额转账业务
        // dto.put("open_flag", "test");
        // 大额支付业务模式
        // dto.put("business_model", "test");
        // 允许用户入账
        // dto.put("allow_user_deposit_flag", "");
        // 银行卡绑定支付权限
        // dto.put("mer_same_card_recharge_flag", "");
        // 备付金固定账号模式自动退款
        // dto.put("provisions_auto_refund_flag", "");

        return dto.toJSONString();
    }

    private static String get942bf7c5D69d489194e4218efa3bfcd3() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 保底手续费(元)
        // dto.put("fee_min_amt", "test");
        // 对公固定手续费(元)
        // dto.put("public_fee_fix_amt", "test");
        // 对私固定手续费(元)
        // dto.put("private_fee_fix_amt", "test");
        // 允许开通全域资金业务(苏商)
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

}
