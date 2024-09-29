package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBusiOpenRequest;

/**
 * 商户业务开通(2022) - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantBusiOpenRequest.class)
public class V2MerchantBusiOpenRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBusiOpenRequest request = new V2MerchantBusiOpenRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付客户Id
        request.setHuifuId("6666000104778898");
        // 直属渠道号
        request.setUpperHuifuId("6666000003080000");

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
        extendInfoMap.put("short_name", "简称");
        // 税务登记证
        extendInfoMap.put("tax_reg_pic", "");
        // 公司照片一
        extendInfoMap.put("comp_pic1", "de2f6e1d-d9e9-3898-9b66-af2a96054193");
        // 公司照片二
        extendInfoMap.put("comp_pic2", "de2f6e1d-d9e9-3898-9b66-af2a96054193");
        // 公司照片三
        extendInfoMap.put("comp_pic3", "de2f6e1d-d9e9-3898-9b66-af2a96054193");
        // 法人身份证反面
        extendInfoMap.put("legal_cert_back_pic", "de2f6e1d-d9e9-3898-9b66-af2a96054193");
        // 法人身份证正面
        extendInfoMap.put("legal_cert_front_pic", "de2f6e1d-d9e9-3898-9b66-af2a96054193");
        // 营业执照图片
        extendInfoMap.put("license_pic", "de2f6e1d-d9e9-3898-9b66-af2a96054193");
        // 组织机构代码证
        extendInfoMap.put("org_code_pic", "");
        // 开户许可证
        extendInfoMap.put("reg_acct_pic", "de2f6e1d-d9e9-3898-9b66-af2a96054193");
        // 结算卡反面
        extendInfoMap.put("settle_card_back_pic", "");
        // 结算卡正面
        extendInfoMap.put("settle_card_front_pic", "");
        // 结算人身份证反面
        extendInfoMap.put("settle_cert_back_pic", "");
        // 结算人身份证正面
        extendInfoMap.put("settle_cert_front_pic", "");
        // 授权委托书
        extendInfoMap.put("auth_enturst_pic", "66d07a27-ccdd-3a0b-9288-8af099d6a3a8");
        // 协议信息实体
        extendInfoMap.put("agreement_info", getAgreementInfo());
        // 是否交易手续费外扣
        extendInfoMap.put("out_fee_flag", "2");
        // 交易手续费外扣汇付ID
        extendInfoMap.put("out_fee_huifuid", "");
        // 交易手续费外扣时的账户类型
        extendInfoMap.put("out_fee_acct_type", "");
        // 是否开通网银
        extendInfoMap.put("online_flag", "Y");
        // 是否开通快捷
        extendInfoMap.put("quick_flag", "Y");
        // 是否开通代扣
        extendInfoMap.put("withhold_flag", "Y");
        // 延迟入账开关
        extendInfoMap.put("delay_flag", "Y");
        // 商户开通强制延迟标记
        extendInfoMap.put("forced_delay_flag", "Y");
        // 是否开通预授权
        extendInfoMap.put("alipay_pre_auth_flag", "N");
        // 开通微信预授权
        extendInfoMap.put("wechatpay_pre_auth_flag", "N");
        // 商户业务类型
        // extendInfoMap.put("mer_bus_type", "");
        // 线上费率配置
        // extendInfoMap.put("online_fee_conf_list", getOnlineFeeConfList());
        // 支付宝配置对象
        extendInfoMap.put("ali_conf_list", getAliConfList());
        // 微信配置对象
        extendInfoMap.put("wx_conf_list", getWxConfList());
        // 银联二维码配置
        extendInfoMap.put("union_conf_list", getUnionConfList());
        // 银行卡业务配置
        extendInfoMap.put("bank_card_conf", getBankCardConf());
        // 银联小微入驻信息实体
        // extendInfoMap.put("union_micro_info", getUnionMicroInfo());
        // 余额支付配置实体
        extendInfoMap.put("balance_pay_config", getBalancePayConfig());
        // 补贴支付
        extendInfoMap.put("combine_pay_config", getCombinePayConfig());
        // 花呗分期费率配置实体
        extendInfoMap.put("hb_fq_fee_config", getHbFqFeeConfig());
        // 线上手续费承担方配置
        // extendInfoMap.put("online_pay_fee_conf_list", getOnlinePayFeeConfList());
        // 银行大额转账对象
        // extendInfoMap.put("bank_big_amt_pay_config", getBankBigAmtPayConfig());
        // 全域资金管理配置
        // extendInfoMap.put("out_order_funds_config", getOutOrderFundsConfig());
        // 汇总结算配置实体
        // extendInfoMap.put("collection_settle_config_list", getCollectionSettleConfigList());
        // 是否使用总部交易信息
        // extendInfoMap.put("use_chains_flag", "");
        // 异步消息接收地址
        extendInfoMap.put("async_return_url", "http://192.168.85.157:30031/sspm/testVirgo");
        // 业务开通结果异步消息接收地址
        extendInfoMap.put("busi_async_return_url", "");
        // 交易异步应答地址
        extendInfoMap.put("recon_resp_addr", "http://192.168.85.157:30031/sspm/testVirgo");
        // 微信直连配置对象
        // extendInfoMap.put("wx_zl_conf", getWxZlConf());
        // 支付宝直连配置对象
        // extendInfoMap.put("ali_zl_conf", getAliZlConf());
        // 开户费用值(元)
        // extendInfoMap.put("enter_fee", "");
        // 开户费用类型
        // extendInfoMap.put("enter_fee_flag", "");
        return extendInfoMap;
    }

    private static String getAgreementInfo() {
        JSONObject dto = new JSONObject();
        // 协议类型
        dto.put("agreement_type", "0");
        // 协议号
        dto.put("agreement_no", "202106070100000380");
        // 协议模板号
        dto.put("agreement_model", "202106070100000380");
        // 协议模板名称
        dto.put("agreement_name", "电子协议签约模板");
        // 签约日期
        dto.put("sign_date", "20200325");
        // 协议开始日期
        dto.put("agree_begin_date", "20200325");
        // 协议结束日期
        dto.put("agree_end_date", "20400325");

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
        // 支付场景
        dto.put("pay_scene", "1");
        // 手续费（%）
        dto.put("fee_rate", "0.38");
        // 商户经营类目
        dto.put("mcc", "2015091000052157");
        // 子渠道号
        dto.put("pay_channel_id", "JQF00001");
        // 拟申请的间联商户等级
        dto.put("indirect_level", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getWxConfList() {
        JSONObject dto = new JSONObject();
        // 支付场景
        dto.put("pay_scene", "1");
        // 手续费（%）
        dto.put("fee_rate", "0.38");
        // 费率规则号
        dto.put("fee_rule_id", "758");
        // 商户经营类目[参见微信支付宝MCC](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_zfbmcc)；个体工商户、小微商户必填；微信暂不支持修改；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：5411&lt;/font&gt;&lt;br/&gt;**企业使用fee_rule_id代替原有mcc**
        dto.put("mcc", "111");
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
        // 借记卡手续费1000以上（%）
        dto.put("debit_fee_rate_up", "0.55");
        // 银联二维码业务贷记卡手续费1000以上（%）
        dto.put("credit_fee_rate_up", "0.56");
        // 借记卡手续费1000以下（%）
        dto.put("debit_fee_rate_down", "0.38");
        // 银联二维码业务贷记卡手续费1000以下（%）
        dto.put("credit_fee_rate_down", "0.38");
        // 银联业务手续费类型
        dto.put("charge_cate_code", "03");
        // 借记卡封顶1000以上
        dto.put("debit_fee_limit_up", "20");
        // 借记卡封顶1000以下
        dto.put("debit_fee_limit_down", "10");
        // 商户经营类目
        dto.put("mcc", "5411");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getBankCardConf() {
        JSONObject dto = new JSONObject();
        // 借记卡手续费（%）
        dto.put("debit_fee_rate", "0.38");
        // 贷记卡手续费（%）
        dto.put("credit_fee_rate", "0.39");
        // 商户经营类目
        dto.put("mcc", "5411");
        // 银行业务手续费类型
        dto.put("charge_cate_code", "02");
        // 借记卡封顶值
        dto.put("debit_fee_limit", "0.56");
        // 银联手机闪付借记卡手续费1000以上（%）
        dto.put("cloud_debit_fee_rate_up", "0.56");
        // 银联手机闪付借记卡封顶1000以上(元)
        dto.put("cloud_debit_fee_limit_up", "12");
        // 银联手机闪付贷记卡手续费1000以上（%）
        dto.put("cloud_credit_fee_rate_up", "0.59");
        // 银联手机闪付借记卡手续费1000以下（%）
        dto.put("cloud_debit_fee_rate_down", "0.37");
        // 银联手机闪付借记卡封顶1000以下(元)
        dto.put("cloud_debit_fee_limit_down", "5");
        // 银联手机闪付贷记卡手续费1000以下（%）
        dto.put("cloud_credit_fee_rate_down", "0.36");
        // 是否开通小额双免
        dto.put("is_open_small_flag", "0");
        // 小额双免单笔限额(元)
        dto.put("small_free_amt", "1000");
        // 小额双免手续费（%）
        dto.put("small_fee_amt", "0.33");

        return dto.toJSONString();
    }

    private static String getUnionMicroInfo() {
        JSONObject dto = new JSONObject();
        // 银联商户类别
        // dto.put("mchnt_type", "test");
        // 商户经度
        // dto.put("mer_lng", "test");
        // 商户纬度
        // dto.put("mer_lat", "test");
        // 店铺名称
        // dto.put("shop_name", "test");
        // 商户经营类目
        // dto.put("mcc", "test");

        return dto.toJSONString();
    }

    private static String getBalancePayConfig() {
        JSONObject dto = new JSONObject();
        // 支付手续费(%)
        dto.put("fee_rate", "2");
        // 支付固定手续费(元)
        dto.put("fee_fix_amt", "1");
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

    private static String getHbFqFeeConfig() {
        JSONObject dto = new JSONObject();
        // 花呗收单分期3期（%）分期费率不为空时，收单费率必填，大于0，保留2位小数，不小于渠道商成本；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.0&lt;/font&gt;代表费率为1.00%
        dto.put("acq_three_period", "1.30");
        // 花呗收单分期6期（%）分期费率不为空时，收单费率必填，大于0，保留2位小数，不小于渠道商成本；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.0&lt;/font&gt;代表费率为1.00%
        dto.put("acq_six_period", "4.60");
        // 花呗收单分期12期（%）分期费率不为空时，收单费率必填，大于0，保留2位小数，不小于渠道商成本；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.0&lt;/font&gt;代表费率为1.00%
        dto.put("acq_twelve_period", "9.12");
        // 花呗分期3期（%）
        dto.put("three_period", "1.80");
        // 花呗分期6期（%）
        dto.put("six_period", "4.60");
        // 花呗分期12期（%）
        dto.put("twelve_period", "9.12");
        // 商户经营类目
        dto.put("ali_mcc", "5411");
        // 支付场景
        dto.put("pay_scene", "1");

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
        // 大额转账调账标识申请类型
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

    private static String getOutOrderAcctCard() {
        JSONObject dto = new JSONObject();
        // 支行联行号card_type为0时必填，参考：[银行支行编码](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_yhzhbm)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：102290026507&lt;/font&gt;
        // dto.put("branch_code", "test");
        // 支行名称card_type为0时必填 ,参考：[银行支行编码](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_yhzhbm)；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：中国工商银行上海市中山北路支行&lt;/font&gt;
        // dto.put("branch_name", "test");
        // 结算账户名
        // dto.put("card_name", "test");
        // 银行卡号
        // dto.put("card_no", "test");
        // 卡类型
        // dto.put("card_type", "test");
        // 持卡人证件类型00:身份证；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：00&lt;/font&gt;；card_type为1时选填。
        // dto.put("cert_type", "test");
        // 持卡人证件有效期（起始）card_type为1时选填；格式：yyyyMMdd，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20210830&lt;/font&gt;；&lt;br/&gt;若填写cert_no，cert_validity_type，cert_type需同时填写。
        // dto.put("cert_begin_date", "test");
        // 持卡人证件有效期（截止）cert_validity_type变更为0时必填，格式：yyyyMMdd；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20210830&lt;/font&gt;
        // dto.put("cert_end_date", "test");
        // 持卡人证件号码card_type为1时选填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：310112200001018888&lt;/font&gt;；
        // dto.put("cert_no", "test");
        // 银行卡绑定手机号
        // dto.put("mp", "test");
        // 开户许可证核准号
        // dto.put("open_licence_no", "test");
        // 银行所在省
        // dto.put("prov_id", "");
        // 银行所在市
        // dto.put("area_id", "");
        // 银行编码
        // dto.put("bank_code", "");
        // 持卡人证件有效期类型
        // dto.put("cert_validity_type", "");

        return dto.toJSONString();
    }

    private static String getOutOrderAcctOpenFees() {
        JSONObject dto = new JSONObject();
        // 开户手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 开户手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "test");
        // 开户手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "test");

        return dto.toJSONString();
    }

    private static String getOutOrderFundsConfig() {
        JSONObject dto = new JSONObject();
        // 自动入账开关
        // dto.put("out_order_auto_acct_flag", "test");
        // 批次入账时间10:00-10点批次入账&lt;br/&gt;16:00-16点批次入账&lt;/br&gt;开通批次入账时必填 ，多个批次使用逗号分隔；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：10:00,16:00&lt;/font&gt;
        // dto.put("batch_no", "test");
        // 全域资金平台商户ID全域资金平台商户ID，渠道商在银行开通的平台商账号，若为众邦银行则必填，否则不填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：XXXXXXXXX&lt;/font&gt;；
        // dto.put("platform_mer_id", "test");
        //  商户与其他支付机构签署的收单协议或证明材料acquiringMode：收单模式时填写；涉及文件类型：F504-(全域资金)商户与其他支付机构签署的收单协议或证明材料；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        // dto.put("other_payment_institutions_pic", "test");
        // 批量入账开关
        // dto.put("batch_auto_acct_flag", "");
        // 支付手续费(%)
        // dto.put("fee_rate", "");
        // 手续费最小值(元)
        // dto.put("fee_min_amt", "");
        // 交易手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");
        // 交易手续费外扣标记
        // dto.put("out_fee_flag", "");
        // 交易手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "");
        // 全域资金开户银行卡信息
        // dto.put("out_order_acct_card", getOutOrderAcctCard());
        // 全域资金开户手续费
        // dto.put("out_order_acct_open_fees", getOutOrderAcctOpenFees());
        // 全域支付业务模式
        // dto.put("business_model", "");

        return dto.toJSONString();
    }

    private static String getCollectionSettleConfigList() {
        JSONObject dto = new JSONObject();
        // 归集留存金(元)
        // dto.put("out_resv_amt", "test");
        // 转入商户号
        // dto.put("in_huifu_id", "test");
        // 转入账户
        // dto.put("in_acct_id", "test");
        // 生效日期
        // dto.put("valid_date", "test");
        // 转出账户
        // dto.put("out_acct_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
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

    private static String getFileList() {
        JSONObject dto = new JSONObject();
        // 文件类型
        // dto.put("file_type", "test");
        // 文件jfileId
        // dto.put("file_id", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getAliZlConf() {
        JSONObject dto = new JSONObject();
        // 申请类型
        // dto.put("apply_type", "test");
        // 商户支付宝账号
        // dto.put("account", "test");
        // 服务费率仅支持渠道商。平台商户调用不支持该字段服务费率（%），0.38~3之间，精确到0.01。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.06&lt;/font&gt;
        // dto.put("fee_rate", "test");
        // 文件列表
        // dto.put("file_list", getFileList());
        // 联系人姓名
        // dto.put("contact_name", "");
        // 联系人手机号
        // dto.put("contact_mobile_no", "");
        // 联系人电子邮箱
        // dto.put("contact_email", "");
        // 订单授权凭证
        // dto.put("order_ticket", "");
        // 营业执照编号
        // dto.put("license_code", "");
        // 营业执照有效期类型
        // dto.put("license_validity_type", "");
        // 营业执照有效期开始日期
        // dto.put("license_begin_date", "");
        // 营业执照有效期截止日期
        // dto.put("license_end_date", "");

        return dto.toJSONString();
    }

}
