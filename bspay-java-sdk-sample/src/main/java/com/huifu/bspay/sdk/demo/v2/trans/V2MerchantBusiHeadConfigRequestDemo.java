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
        // extendInfoMap.put("ali_conf_list", get916e568b03b4448b8442Bc59607f55a9());
        // 微信配置对象
        // extendInfoMap.put("wx_conf_list", get91a6f3c897084daaA750D460c4223fdd());
        // 银联二维码配置对象
        // extendInfoMap.put("union_conf_list", get11f18154070b4ef3B79c6bd7442b51bd());
        // 银联卡配置对象
        // extendInfoMap.put("bank_card_config", getD38dbb2fA005448eAefa2631e82a43bd());
        // 分账配置对象
        // extendInfoMap.put("split_config", getD74f8d2cAb1345d7B05859cbc476ef6e());
        // 微信直连配置对象
        // extendInfoMap.put("wx_zl_conf_list", get5a0a3440F93241359adcC4c7bd515643());
        // 支付宝直连配置对象
        // extendInfoMap.put("ali_zl_conf", getD624c523351a4f1f995f73e7862d4f5c());
        // 线上配置对象
        // extendInfoMap.put("online_fee_conf_list", get5ed15ef0B2e847f8A438A8c88a7bab1f());
        // 余额支付配置对象
        // extendInfoMap.put("balance_pay_config", get78b6d2f909434f408f929dd15fee6672());
        // 补贴支付配置对象
        // extendInfoMap.put("combine_pay_config", get019b2ffc8bb04a42Aa4f87623ed4ee78());
        // 银行大额转账配置对象
        // extendInfoMap.put("bank_big_amt_pay_config", getDdb760be91d245959c0c57e3795c2e75());
        // 全域资金管理配置对象（华通银行）
        // extendInfoMap.put("out_order_funds_config", get029b9aa1Ef7c445eAee78f34392d75a1());
        // 全域资金管理配置(XW银行)
        // extendInfoMap.put("out_order_funds_new_net_config", get11de5eefC8bc4ddd9bc091896e59685a());
        // 结算配置对象
        // extendInfoMap.put("settle_config_list", getB3273ffb43614889855bF0effa4c544e());
        // 取现配置对象
        // extendInfoMap.put("cash_config_list", getAb8250102ee14d688a3c697ded75df88());
        // 外扣配置对象
        // extendInfoMap.put("out_fee_config", get3a66f24451584846865293177b71f238());
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
        // extendInfoMap.put("large_amt_pay_config_list", getD8c6d0c002ca46cfB9efD110095bd83a());
        // 全域资金管理配置(苏商)
        // extendInfoMap.put("out_order_funds_su_shang_config", getD31e7929847346248e31C3f56fb221a4());
        // 托管支付开关
        // extendInfoMap.put("half_pay_host_flag", "");
        return extendInfoMap;
    }

    private static String get916e568b03b4448b8442Bc59607f55a9() {
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

    private static String get91a6f3c897084daaA750D460c4223fdd() {
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

    private static String get11f18154070b4ef3B79c6bd7442b51bd() {
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

    private static String getD38dbb2fA005448eAefa2631e82a43bd() {
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

    private static String getD74f8d2cAb1345d7B05859cbc476ef6e() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 允许开通分账业务
        // dto.put("open_flag", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "");

        return dto.toJSONString();
    }

    private static String get5a0a3440F93241359adcC4c7bd515643() {
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

    private static String getD624c523351a4f1f995f73e7862d4f5c() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 允许开通支付宝直连业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String get5ed15ef0B2e847f8A438A8c88a7bab1f() {
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

    private static String get78b6d2f909434f408f929dd15fee6672() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通余额支付业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String get019b2ffc8bb04a42Aa4f87623ed4ee78() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通补贴支付业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String getDdb760be91d245959c0c57e3795c2e75() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通大额转账业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String get029b9aa1Ef7c445eAee78f34392d75a1() {
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

    private static String get11de5eefC8bc4ddd9bc091896e59685a() {
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

    private static String getB3273ffb43614889855bF0effa4c544e() {
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

    private static String getAb8250102ee14d688a3c697ded75df88() {
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

    private static String get3a66f24451584846865293177b71f238() {
        JSONObject dto = new JSONObject();
        // 支持结算手续费外扣
        // dto.put("settle_out_fee_flag", "test");
        // 支持交易手续费外扣
        // dto.put("trans_fee_out_flag", "test");
        // 支持取现手续费外扣
        // dto.put("cash_out_fee_flag", "test");

        return dto.toJSONString();
    }

    private static String getD8c6d0c002ca46cfB9efD110095bd83a() {
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

    private static String getD31e7929847346248e31C3f56fb221a4() {
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
