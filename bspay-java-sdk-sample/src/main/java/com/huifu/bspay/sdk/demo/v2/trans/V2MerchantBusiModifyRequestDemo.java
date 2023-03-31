package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBusiModifyRequest;

/**
 * 商户业务开通修改 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantBusiModifyRequest.class)
public class V2MerchantBusiModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBusiModifyRequest request = new V2MerchantBusiModifyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付客户Id
        request.setHuifuId("6666000103668046");

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
        // 经营简称
        extendInfoMap.put("short_name", "");
        // 税务登记证
        extendInfoMap.put("tax_reg_pic", "");
        // 公司照片一
        extendInfoMap.put("comp_pic1", "");
        // 公司照片二
        extendInfoMap.put("comp_pic2", "");
        // 公司照片三
        extendInfoMap.put("comp_pic3", "");
        // 法人身份证反面
        extendInfoMap.put("legal_cert_back_pic", "");
        // 法人身份证正面
        extendInfoMap.put("legal_cert_front_pic", "");
        // 营业执照图片
        extendInfoMap.put("license_pic", "");
        // 组织机构代码证
        extendInfoMap.put("org_code_pic", "");
        // 商务协议
        extendInfoMap.put("ba_pic", "");
        // 开户许可证
        extendInfoMap.put("reg_acct_pic", "");
        // 结算卡反面
        extendInfoMap.put("settle_card_back_pic", "");
        // 结算卡正面
        extendInfoMap.put("settle_card_front_pic", "");
        // 结算人身份证反面
        extendInfoMap.put("settle_cert_back_pic", "");
        // 结算人身份证正面
        extendInfoMap.put("settle_cert_front_pic", "");
        // 授权委托书
        extendInfoMap.put("auth_enturst_pic", "[http://192.168.85.157:30031/sspm/testVirgo](http://192.168.85.157:30031/sspm/testVirgo)");
        // 协议信息实体
        extendInfoMap.put("agreement_info", getAgreementInfo());
        // 是否交易手续费外扣
        extendInfoMap.put("out_fee_flag", "2");
        // 交易手续费外扣汇付ID
        extendInfoMap.put("out_fee_huifuid", "");
        // 交易手续费外扣时的账户类型
        extendInfoMap.put("out_fee_acct_type", "");
        // 是否开通网银
        extendInfoMap.put("online_flag", "");
        // 是否开通快捷
        extendInfoMap.put("quick_flag", "");
        // 是否开通代扣
        extendInfoMap.put("withhold_flag", "");
        // 延迟入账开关
        extendInfoMap.put("delay_flag", "Y");
        // 开通支付宝预授权
        extendInfoMap.put("alipay_pre_auth_flag", "Y");
        // 开通微信预授权
        // extendInfoMap.put("wechatpay_pre_auth_flag", "");
        // 商户业务类型
        // extendInfoMap.put("mer_bus_type", "");
        // 线上费率配置
        // extendInfoMap.put("online_fee_conf_list", getOnlineFeeConfList());
        // 支付宝配置对象
        extendInfoMap.put("ali_conf_list", getAliConfList());
        // 微信配置对象
        extendInfoMap.put("wx_conf_list", getWxConfList());
        // 银联二维码配置对象
        extendInfoMap.put("union_conf_list", getUnionConfList());
        // 银行卡支付配置信息
        extendInfoMap.put("bank_card_conf", getBankCardConf());
        // 余额支付配置对象
        extendInfoMap.put("balance_pay_config", getBalancePayConfig());
        // 营销补贴
        extendInfoMap.put("combine_pay_config", getCombinePayConfig());
        // 线上手续费承担方配置
        // extendInfoMap.put("online_pay_fee_conf_list", getOnlinePayFeeConfList());
        // 银行大额转账对象
        // extendInfoMap.put("bank_big_amt_pay_config", getBankBigAmtPayConfig());
        // 微信直连配置对象
        // extendInfoMap.put("wx_zl_conf", getWxZlConf());
        // 异步消息接收地址
        extendInfoMap.put("async_return_url", "[http://www.baidu55.com](http://www.baidu55.com/)");
        // 业务开通结果异步消息接收地址
        extendInfoMap.put("busi_async_return_url", "");
        // 交易异步应答地址
        extendInfoMap.put("recon_resp_addr", "[http://192.168.85.157:30031/sspm/testVirgo](http://192.168.85.157:30031/sspm/testVirgo)");
        // 平台收款资金归集配置
        // extendInfoMap.put("out_order_funds_config", getOutOrderFundsConfig());
        return extendInfoMap;
    }

    private static String getAgreementInfo() {
        JSONObject dto = new JSONObject();
        // 协议类型
        dto.put("agreement_type", "0");
        // 协议开始日期
        dto.put("agree_begin_date", "20200325");
        // 协议结束日期
        dto.put("agree_end_date", "20400325");
        // 协议模板号
        dto.put("agreement_model", "202106070100000380");
        // 协议模板名称
        dto.put("agreement_name", "电子协议签约模板");
        // 协议号
        dto.put("agreement_no", "202106070100000380");
        // 签约日期
        dto.put("sign_date", "20200325");

        return dto.toJSONString();
    }

    private static String getOnlineFeeConfList() {
        JSONObject dto = new JSONObject();
        // 业务类型
        // dto.put("fee_type", "test");
        // 银行编码
        // dto.put("bank_id", "test");
        // 借贷标志
        // dto.put("dc_flag", "test");
        // 费率状态
        // dto.put("stat_flag", "test");
        // 手续费（固定/元）
        // dto.put("fix_amt", "");
        // 费率（百分比/%）
        // dto.put("fee_rate", "");
        // 银行名称
        // dto.put("bank_name", "");
        // 银行中文简称
        // dto.put("bank_short_chn", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getAliConfList() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        dto.put("fee_rate", "3.15");
        // 支付场景
        dto.put("pay_scene", "1");
        // 商户经营类目
        dto.put("mcc", "2016062900190337");
        // 子渠道号
        dto.put("pay_channel_id", "10000001");
        // 拟申请的间联商户等级
        dto.put("indirect_level", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getWxConfList() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        dto.put("fee_rate", "2.15");
        // 支付场景
        dto.put("pay_scene", "10");
        // ~~商户经营类目~~
        // dto.put("~~mcc~~", "");
        // 费率规则ID
        dto.put("fee_rule_id", "765");
        // 子渠道号
        dto.put("pay_channel_id", "JP00001");
        // 申请服务
        dto.put("service_codes", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getUnionConfList() {
        JSONObject dto = new JSONObject();
        // 银联二维码1000以上借记卡费率
        dto.put("debit_fee_rate_up", "6");
        // 银联二维码1000以下借记卡费率
        dto.put("debit_fee_rate_down", "2.55");
        // 银联二维码1000以下贷记卡费率
        dto.put("credit_fee_rate_down", "1");
        // 银联二维码1000以上贷记卡费率
        dto.put("credit_fee_rate_up", "6.566");
        // 银行业务手续费类型
        dto.put("charge_cate_code", "");
        // 银联二维码1000以上借记卡费率封顶值
        dto.put("debit_fee_limit_up", "641");
        // 银联二维码1000以下借记卡费率封顶值
        dto.put("debit_fee_limit_down", "11.3");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getBankCardConf() {
        JSONObject dto = new JSONObject();
        // 借记卡手续费（%）
        dto.put("debit_fee_rate", "3");
        // 贷记卡手续费（%）
        dto.put("credit_fee_rate", "6");
        // 银行业务手续费类型
        dto.put("charge_cate_code", "02");
        // 借记卡封顶值
        dto.put("debit_fee_limit", "5");
        // 云闪付借记卡手续费1000以上（%）
        dto.put("cloud_debit_fee_rate_up", "7");
        // 云闪付借记卡封顶1000以上(元)
        dto.put("cloud_debit_fee_limit_up", "8.922");
        // 云闪付贷记卡手续费1000以上（%）
        dto.put("cloud_credit_fee_rate_up", "4.86");
        // 云闪付借记卡手续费1000以下（%）
        dto.put("cloud_debit_fee_rate_down", "0");
        // 云闪付借记卡封顶1000以下(元)
        dto.put("cloud_debit_fee_limit_down", "10");
        // 云闪付贷记卡手续费1000以下（%）
        dto.put("cloud_credit_fee_rate_down", "2");
        // 是否开通小额双免
        dto.put("is_open_small_flag", "0");
        // 小额双免单笔限额(元)
        dto.put("small_free_amt", "500");
        // 小额双免手续费（%）
        dto.put("small_fee_amt", "1");

        return dto.toJSONString();
    }

    private static String getBalancePayConfig() {
        JSONObject dto = new JSONObject();
        // 支付手续费(%)
        dto.put("fee_rate", "2");
        // 支付固定手续费(元)
        dto.put("fee_fix_amt", "1");
        // 费率开关
        dto.put("switch_state", "1");
        // 交易手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");
        // 交易手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "");
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "");

        return dto.toJSONString();
    }

    private static String getCombinePayConfig() {
        JSONObject dto = new JSONObject();
        // 开通状态
        dto.put("switch_state", "0");
        // 支付手续费(%)
        dto.put("fee_rate", "10");
        // 支付固定手续费(元)
        dto.put("fee_fix_amt", "5");
        // 交易手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");
        // 交易手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "");
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "");

        return dto.toJSONString();
    }

    private static String getOnlinePayFeeConfList() {
        JSONObject dto = new JSONObject();
        // 业务类型
        // dto.put("pay_type", "");
        // 交易手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");
        // 交易手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "");
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getBankBigAmtPayConfig() {
        JSONObject dto = new JSONObject();
        // 开关状态
        // dto.put("switch_state", "");
        // 大额调账标识申请类型
        // dto.put("biz_type", "");
        // 费率（百分比/%）
        // dto.put("fee_rate", "");
        // 交易手续费（固定/元）
        // dto.put("fee_fix_amt", "");
        // 手续费外扣标记
        // dto.put("out_fee_flag", "");
        // 手续费外扣时的汇付ID
        // dto.put("out_fee_huifuid", "");
        // 外扣手续费费承担账户号
        // dto.put("out_fee_acct_id", "");
        // 银行大额转账单笔额度
        // dto.put("big_amt_limit_per_time", "");
        // 银行大额转账单日额度
        // dto.put("big_amt_limit_per_day", "");

        return dto.toJSONString();
    }

    private static JSON getWxZlPayConfList() {
        JSONObject dto = new JSONObject();
        // 申请服务
        // dto.put("service_code", "test");
        // 功能服务appid
        // dto.put("sub_app_id", "test");
        // 功能开关
        // dto.put("switch_state", "test");
        // 功能费率(%)
        // dto.put("fee_rate", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getWxZlConf() {
        JSONObject dto = new JSONObject();
        // 微信子商户号
        // dto.put("sub_mch_id", "test");
        // 配置集合
        // dto.put("wx_zl_pay_conf_list", getWxZlPayConfList());

        return dto.toJSONString();
    }

    private static String getOutOrderFundsConfig() {
        JSONObject dto = new JSONObject();
        // 开通状态
        // dto.put("switch_state", "test");
        // 自动入账开关
        // dto.put("out_order_auto_acct_flag", "test");
        // 支付手续费(%)
        // dto.put("fee_rate", "");
        // 支付固定手续费(元)
        // dto.put("fee_fix_amt", "");
        // 交易手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");
        // 交易手续费外扣标记
        // dto.put("out_fee_flag", "");
        // 交易手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "");

        return dto.toJSONString();
    }

}
