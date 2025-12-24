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
        // extendInfoMap.put("ali_conf_list", get913c1602480a4d3f9272Ec0e767d7aeb());
        // 微信配置对象
        // extendInfoMap.put("wx_conf_list", get7c4de91918c54844A91660cc790a6279());
        // 银联二维码配置对象
        // extendInfoMap.put("union_conf_list", get5bb3480e73e74c89A5b8E8d55fcd727f());
        // 银联卡配置对象
        // extendInfoMap.put("bank_card_config", get43610f0c07234fd6Aaa572407a3afc14());
        // 分账配置对象
        // extendInfoMap.put("split_config", get6966f9e50a5440a58786Ff2442383ca1());
        // 微信直连配置对象
        // extendInfoMap.put("wx_zl_conf_list", getB9b15afd4a8845c68a93E1842aff41af());
        // 支付宝直连配置对象
        // extendInfoMap.put("ali_zl_conf", getA690bc363cdd4dd98ff27380d9a5e3ad());
        // 线上配置对象
        // extendInfoMap.put("online_fee_conf_list", getF65bded5Bed64adfB2b93e7b63e655ef());
        // 余额支付配置对象
        // extendInfoMap.put("balance_pay_config", getE2ea5610E72a4eb7BcbfB22e421f2280());
        // 补贴支付配置对象
        // extendInfoMap.put("combine_pay_config", get954e91de94c1460c84a09c566d830256());
        // 银行大额转账配置对象
        // extendInfoMap.put("bank_big_amt_pay_config", getF455cd9778ea4b56994dF548ccc8f072());
        // 全域资金管理配置对象（华通银行）
        // extendInfoMap.put("out_order_funds_config", getD7cd57bdAdb745cfA5dd146451d79cfa());
        // 全域资金管理配置(XW银行)
        // extendInfoMap.put("out_order_funds_new_net_config", getBf284cc60b5b4672887749ad39dc8524());
        // 结算配置对象
        // extendInfoMap.put("settle_config_list", getE6d4b7d816ee4f47887fDdd12d36aa23());
        // 取现配置对象
        // extendInfoMap.put("cash_config_list", get5d6c5e557bb04748B1254a84df2d23ef());
        // 外扣配置对象
        // extendInfoMap.put("out_fee_config", get4ad35a9b5ff64f65A4e1A84915733f4d());
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
        // extendInfoMap.put("large_amt_pay_config_list", get91761c415cb347e59369Ada12376ef40());
        // 全域资金管理配置(苏商)
        // extendInfoMap.put("out_order_funds_su_shang_config", getD8d27591E0424fc9B36115f70c06480b());
        // 托管支付开关
        // extendInfoMap.put("half_pay_host_flag", "");
        // 全域资金费用配置对象
        // extendInfoMap.put("out_order_funds_fee_list", getE42011c14cae453788fb872edae6a744());
        // 本地生活生活配置对象
        // extendInfoMap.put("lla_withhold_config", getEd96185593a44f3480a2F84da188b3ee());
        return extendInfoMap;
    }

    private static String get913c1602480a4d3f9272Ec0e767d7aeb() {
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

    private static String get7c4de91918c54844A91660cc790a6279() {
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

    private static String get5bb3480e73e74c89A5b8E8d55fcd727f() {
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

    private static String get43610f0c07234fd6Aaa572407a3afc14() {
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

    private static String get6966f9e50a5440a58786Ff2442383ca1() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 允许开通分账业务
        // dto.put("open_flag", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "");

        return dto.toJSONString();
    }

    private static String getB9b15afd4a8845c68a93E1842aff41af() {
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

    private static String getA690bc363cdd4dd98ff27380d9a5e3ad() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 允许开通支付宝直连业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String getF65bded5Bed64adfB2b93e7b63e655ef() {
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

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getE2ea5610E72a4eb7BcbfB22e421f2280() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通余额支付业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String get954e91de94c1460c84a09c566d830256() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通补贴支付业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String getF455cd9778ea4b56994dF548ccc8f072() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 固定手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 允许开通大额转账业务
        // dto.put("open_flag", "test");

        return dto.toJSONString();
    }

    private static String getD7cd57bdAdb745cfA5dd146451d79cfa() {
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

    private static String getBf284cc60b5b4672887749ad39dc8524() {
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

    private static String getE6d4b7d816ee4f47887fDdd12d36aa23() {
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

    private static String get5d6c5e557bb04748B1254a84df2d23ef() {
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

    private static String get4ad35a9b5ff64f65A4e1A84915733f4d() {
        JSONObject dto = new JSONObject();
        // 支持结算手续费外扣
        // dto.put("settle_out_fee_flag", "test");
        // 支持交易手续费外扣
        // dto.put("trans_fee_out_flag", "test");
        // 支持取现手续费外扣
        // dto.put("cash_out_fee_flag", "test");

        return dto.toJSONString();
    }

    private static String get91761c415cb347e59369Ada12376ef40() {
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

    private static String getD8d27591E0424fc9B36115f70c06480b() {
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

    private static String getE42011c14cae453788fb872edae6a744() {
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

    private static JSON getEd96185593a44f3480a2F84da188b3ee() {
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
