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
        // 直属渠道号该商户进件完成后归属的渠道商huifu_id；；&lt;br/&gt;sys_id主体为渠道商时填写； &lt;br/&gt;sys_id主体为总部商户时选填；&lt;br/&gt; 示例值：6666000123123123
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
        // extendInfoMap.put("ali_conf_list", get07d6ff82Beb54cf094b6B52166e60f7b());
        // 微信配置对象
        // extendInfoMap.put("wx_conf_list", get94b6a493C6724010930e3bf4dc34bb29());
        // 银联二维码配置对象
        // extendInfoMap.put("union_conf_list", get1475a7ed1d2e4510Bc09A09f26b54dfa());
        // 银联卡配置对象
        // extendInfoMap.put("bank_card_config", getFce5d3d208b8438488f31419e620cb70());
        // 分账配置对象
        // extendInfoMap.put("split_config", get44dae04187c14e0b8ccaA691579014b7());
        // 微信直连配置对象
        // extendInfoMap.put("wx_zl_conf_list", get30707e5cD2c94d7eA88f6cd4946e19b1());
        // 支付宝直连配置对象
        // extendInfoMap.put("ali_zl_conf", get095926d8B6cd4a2aAc24Baedac640395());
        // 线上配置对象
        // extendInfoMap.put("online_fee_conf_list", getA15dcae3B8d64f109fb7898f1a0ed516());
        // 余额支付配置对象
        // extendInfoMap.put("balance_pay_config", get1db9d6945fd74dc69eac7134dfe56ba9());
        // 补贴支付配置对象
        // extendInfoMap.put("combine_pay_config", get074c69670ee344c8Be9278da591948b0());
        // 银行大额转账配置对象
        // extendInfoMap.put("bank_big_amt_pay_config", getB2f910957390410bBb900f5899c1c777());
        // 全域资金管理配置对象（华通银行）
        // extendInfoMap.put("out_order_funds_config", getCb6b104cDc5a41319c5796827f18b765());
        // 全域资金管理配置(XW银行)
        // extendInfoMap.put("out_order_funds_new_net_config", get00af1fa4E041414aBa50Cf7168e09929());
        // 结算配置对象
        // extendInfoMap.put("settle_config_list", get81430adc38ec41e5A966D412c25d806a());
        // 取现配置对象
        // extendInfoMap.put("cash_config_list", get31237263E68b4c1fB2ff7d49b26d5cf8());
        // 外扣配置对象
        // extendInfoMap.put("out_fee_config", getB6aa2527743a4abd972f23e80c596f94());
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
        // extendInfoMap.put("large_amt_pay_config_list", getE8ebec06915d4c80Aa66B2a217bedab6());
        // 全域资金管理配置(苏商)
        // extendInfoMap.put("out_order_funds_su_shang_config", getAd06a9ce737141c5B7ca9f4f22a9e371());
        // 统一收银台开关
        // extendInfoMap.put("half_pay_host_flag", "");
        // 全域资金费用配置对象
        // extendInfoMap.put("out_order_funds_fee_list", get519d4b5eE3674b40Ab08253f389c6862());
        // 本地生活生活配置对象
        // extendInfoMap.put("lla_withhold_config", get6be428825dad439aA8a0C3976d2daea9());
        // 是否开通账单支付
        // extendInfoMap.put("bill_payment_flag", "");
        return extendInfoMap;
    }

    private static String get07d6ff82Beb54cf094b6B52166e60f7b() {
        JSONObject dto = new JSONObject();
        // 支付场景
        // dto.put("pay_scene", "test");
        // 手续费
        // dto.put("fee_rate", "test");
        // 允许开通该业务
        // dto.put("open_flag", "test");
        // 最低收取手续费（元）
        // dto.put("fee_min_amt", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get94b6a493C6724010930e3bf4dc34bb29() {
        JSONObject dto = new JSONObject();
        // 支付场景
        // dto.put("pay_scene", "test");
        // 手续费
        // dto.put("fee_rate", "test");
        // 允许开通该场景业务
        // dto.put("open_flag", "test");
        // 最低收取手续费（元）
        // dto.put("fee_min_amt", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get1475a7ed1d2e4510Bc09A09f26b54dfa() {
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

    private static String getFce5d3d208b8438488f31419e620cb70() {
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

    private static String get44dae04187c14e0b8ccaA691579014b7() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 允许开通分账业务
        // dto.put("open_flag", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "");

        return dto.toJSONString();
    }

    private static String get30707e5cD2c94d7eA88f6cd4946e19b1() {
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

    private static String get095926d8B6cd4a2aAc24Baedac640395() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 允许开通支付宝直连业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String getA15dcae3B8d64f109fb7898f1a0ed516() {
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
        // 手续费最小值（元）
        // dto.put("fee_min_amt", "");
        // 代扣手续费计费模式
        // dto.put("fee_formula_type", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get1db9d6945fd74dc69eac7134dfe56ba9() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通余额支付业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String get074c69670ee344c8Be9278da591948b0() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通补贴支付业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String getB2f910957390410bBb900f5899c1c777() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通大额转账业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String getCb6b104cDc5a41319c5796827f18b765() {
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

    private static String get00af1fa4E041414aBa50Cf7168e09929() {
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

    private static String get81430adc38ec41e5A966D412c25d806a() {
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

    private static String get31237263E68b4c1fB2ff7d49b26d5cf8() {
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

    private static String getB6aa2527743a4abd972f23e80c596f94() {
        JSONObject dto = new JSONObject();
        // 支持结算手续费外扣
        // dto.put("settle_out_fee_flag", "test");
        // 支持交易手续费外扣
        // dto.put("trans_fee_out_flag", "test");
        // 支持取现手续费外扣
        // dto.put("cash_out_fee_flag", "test");

        return dto.toJSONString();
    }

    private static String getE8ebec06915d4c80Aa66B2a217bedab6() {
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

    private static String getAd06a9ce737141c5B7ca9f4f22a9e371() {
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

    private static String get519d4b5eE3674b40Ab08253f389c6862() {
        JSONObject dto = new JSONObject();
        // 业务类型
        // dto.put("bus_type", "test");
        // 手续费（百分比/%）
        // dto.put("fee_rate", "test");
        // 手续费（固定/元）
        // dto.put("fee_fix_amt", "test");
        // 是否允许开通
        // dto.put("open_flag", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static JSON get6be428825dad439aA8a0C3976d2daea9() {
        JSONObject dto = new JSONObject();
        // 本地生活开关
        // dto.put("llaWithholdFlag", "test");
        // 佣金收取手续费率
        // dto.put("fee_rate", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

}
