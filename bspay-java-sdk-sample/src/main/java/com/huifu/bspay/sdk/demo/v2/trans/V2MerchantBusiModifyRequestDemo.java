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
 * 商户业务开通修改(2022) - 示例
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
        extendInfoMap.put("auth_enturst_pic", "http://192.168.85.157:30031/sspm/testVirgo");
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
        // 补贴支付
        extendInfoMap.put("combine_pay_config", getCombinePayConfig());
        // 线上手续费承担方配置
        // extendInfoMap.put("online_pay_fee_conf_list", getOnlinePayFeeConfList());
        // 银行大额转账对象
        // extendInfoMap.put("bank_big_amt_pay_config", getBankBigAmtPayConfig());
        // 全域资金管理配置
        // extendInfoMap.put("out_order_funds_config", getOutOrderFundsConfig());
        // 汇总结算配置实体
        // extendInfoMap.put("collection_settle_config_list", getCollectionSettleConfigList());
        // 微信直连配置对象
        // extendInfoMap.put("wx_zl_conf", getWxZlConf());
        // 异步消息接收地址
        extendInfoMap.put("async_return_url", "http://www.baidu55.com/");
        // 业务开通结果异步消息接收地址
        extendInfoMap.put("busi_async_return_url", "");
        // 交易异步应答地址
        extendInfoMap.put("recon_resp_addr", "http://192.168.85.157:30031/sspm/testVirgo");
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
        // 商户经营类目[参见微信支付宝MCC](https://paas.huifu.com/partners/api/#/csfl/api_csfl_zfbmcc)；个体工商户、小微商户必填，企业使用fee_rule_id代替原有mcc
        dto.put("mcc", "5943");
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
        // 银联手机闪付借记卡手续费1000以上（%）
        dto.put("cloud_debit_fee_rate_up", "7");
        // 银联手机闪付借记卡封顶1000以上(元)
        dto.put("cloud_debit_fee_limit_up", "8.922");
        // 银联手机闪付贷记卡手续费1000以上（%）
        dto.put("cloud_credit_fee_rate_up", "4.86");
        // 银联手机闪付借记卡手续费1000以下（%）
        dto.put("cloud_debit_fee_rate_down", "0");
        // 银联手机闪付借记卡封顶1000以下(元)
        dto.put("cloud_debit_fee_limit_down", "10");
        // 银联手机闪付贷记卡手续费1000以下（%）
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

    private static String getOutOrderAcctCard() {
        JSONObject dto = new JSONObject();
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
        // 银行所在省
        // dto.put("prov_id", "");
        // 银行所在市
        // dto.put("area_id", "");
        // 银行编码
        // dto.put("bank_code", "");
        // 支行联行号
        // dto.put("branch_code", "");
        // 支行名称
        // dto.put("branch_name", "");
        // 持卡人证件有效期类型
        // dto.put("cert_validity_type", "");
        // 开户许可证核准号
        // dto.put("open_licence_no", "");

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
        // 开通状态
        // dto.put("switch_state", "test");
        // 自动入账开关
        // dto.put("out_order_auto_acct_flag", "test");
        // 批次入账时间10:00-10点批次入账&lt;br/&gt;16:00-16点批次入账&lt;/br&gt;开通批次入账时必填 ，多个批次使用逗号分隔；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：10:00,16:00&lt;/font&gt;
        // dto.put("batch_no", "test");
        // 全域资金平台商户ID全域资金平台商户ID，渠道商在银行开通的平台商账号，若为众邦银行则必填，否则不填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：XXXXXXXXX&lt;/font&gt;；
        // dto.put("platform_mer_id", "test");
        // 商户与其他支付机构签署的收单协议或证明材料acquiringMode：收单模式时填写；涉及文件类型：F504-(全域资金)商户与其他支付机构签署的收单协议或证明材料；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
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
        // 全域资金开户使用的银行卡信息
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
        // 功能开关
        // dto.put("switch_state", "");
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

    private static String getContactInfo() {
        JSONObject dto = new JSONObject();
        // 联系人类型
        // dto.put("contact_type", "test");
        // 联系人姓名联系人类型为经办人时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：张三&lt;/font&gt;
        // dto.put("contact_name", "test");
        // 联系人证件类型联系人类型为经办人时必填；00：身份证01:护照11：港澳台同胞通行证12：外国人居留证13：港澳居民证14：台湾居民证&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：00&lt;/font&gt;；
        // dto.put("cert_type", "test");
        // 联系人证件号码联系人类型为经办人时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：32090297512026402&lt;/font&gt;
        // dto.put("contact_cert_no", "test");
        // 联系人手机号
        // dto.put("contact_mobile_no", "test");
        // 联系人电子邮箱
        // dto.put("contact_email", "test");
        // 联系人资料联系人类型为经办人时必填F28-联系人身份证国徽面   F29-联系人身份证人像面F227-微信业务办理授权函&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：&lt;/font&gt;
        // dto.put("contact_file_list", getFileList());
        // 证件有效期类型
        // dto.put("contact_cert_validity_type", "test");
        // 证件有效期开始日期
        // dto.put("contact_cert_begin_date", "test");
        // 证件有效期截止日期
        // dto.put("contact_cert_end_date", "");

        return dto.toJSONString();
    }

    private static String getCertificateInfo() {
        JSONObject dto = new JSONObject();
        // 登记证书类型
        // dto.put("cert_type", "test");
        // 证书号
        // dto.put("cert_no", "test");
        // 证书商户名称
        // dto.put("cert_mer_name", "test");
        // 注册地址
        // dto.put("reg_detail", "test");
        // 法人姓名
        // dto.put("legal_name", "test");
        // 证书有效期类型
        // dto.put("cert_validity_type", "test");
        // 证书有效期开始日期
        // dto.put("cert_begin_date", "test");
        // 文件列表
        // dto.put("cert_file_list", getFileList());
        // 证书有效期截止日期
        // dto.put("cert_end_date", "");

        return dto.toJSONString();
    }

    private static String getUboInfoList() {
        JSONObject dto = new JSONObject();
        // 证件类型
        // dto.put("ubo_cert_type", "test");
        // 证件号码
        // dto.put("ubo_cert_no", "test");
        // 姓名
        // dto.put("ubo_name", "test");
        // 受益人证件居住地址
        // dto.put("ubo_cert_doc_address", "test");
        // 证件有效类型
        // dto.put("ubo_cert_validity_type", "test");
        // 证件有效期开始日期
        // dto.put("ubo_cert_begin_date", "test");
        // 文件列表
        // dto.put("ubo_file_list", getFileList());
        // 证件有效期截止日期
        // dto.put("ubo_cert_end_date", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getUboInfo() {
        JSONObject dto = new JSONObject();
        // 经营者/法人是否为受益人
        // dto.put("ubo_type", "test");
        // 受益人信息列表jsonArray格式,当ubo_type为Y时可不填
        // dto.put("ubo_info_list", getUboInfoList());

        return dto.toJSONString();
    }

    private static String getSalesInfo() {
        JSONObject dto = new JSONObject();
        // 经营场景类型
        // dto.put("sales_scenes_type", "test");
        // 功能费率仅支持渠道商传入该字段。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.06&lt;/font&gt;平台商户为子商户开通微信直连支付时，不支持该字段，取平台商户费率上送微信。
        // dto.put("fee_rate", "test");
        // 线下场所对应的商家公众号APPID开通线下门店场景时，填入。都填入时，取公众号的上送微信。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx51aa91a575359ff5&lt;/font&gt;
        // dto.put("biz_sub_jsapi_app_id", "test");
        // 线下场所对应的商家小程序APPID开通线下门店场景时，填入。都填入时，取公众号的上送微信。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wxea9c30a90fs8d3fe&lt;/font&gt;
        // dto.put("biz_sub_mini_app_id", "test");
        // 服务商公众号 ID开通公众号场景时，直连服务商和商户的公众号 APP ID，二选一填入。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx51aa91a575359ff5&lt;/font&gt;
        // dto.put("jsapi_app_id", "test");
        // 商家公众号APPID开通公众号场景时，直连服务商和商户的公众号 APP ID，二选一填入。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wxea9c30a90fs8d3fe&lt;/font&gt;
        // dto.put("jsapi_sub_app_id", "test");
        // 服务商小程序APPID开通小程序场景时，直连服务商和商户的小程序 APP ID，二选一填入。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx51aa91a575359ff5&lt;/font&gt;
        // dto.put("mini_app_id", "test");
        // 商家小程序APPID开通小程序场景时，直连服务商和商户的小程序 APP ID，二选一填入。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx51aa91a575359ff5&lt;/font&gt;
        // dto.put("mini_sub_app_id", "test");
        // 服务商应用APPID开通 APP 场景时，直连服务商和商户的 APP ID，二选一填入。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx51aa91a575359ff5&lt;/font&gt;
        // dto.put("app_app_id", "test");
        // 商家应用APPID开通 APP 场景时，直连服务商和商户的 APP ID，二选一填入。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx51aa91a575359ff5&lt;/font&gt;
        // dto.put("app_sub_app_id", "test");
        // 互联网网站域名开通互联网场景时填入；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：huifu.com&lt;/font&gt;
        // dto.put("web_domain", "test");
        // 互联网网站对应的商家APPID开通互联网场景时填入；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx51aa91a575359ff5&lt;/font&gt;
        // dto.put("web_app_id", "test");
        // 商家企业微信CorpID开通企业微信场景时填入；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：xxxxx&lt;/font&gt;
        // dto.put("sub_corp_id", "test");
        // 文件列表
        // dto.put("sales_scenes_file_list", getFileList());
        // 文件列表
        // dto.put("fee_rate_file_list", "");
        // 门店名称
        // dto.put("biz_store_name", "");
        // 门店省市编码
        // dto.put("biz_address_code", "");
        // 门店地址
        // dto.put("biz_store_address", "");

        return dto.toJSONString();
    }

    private static String getWxCardInfo() {
        JSONObject dto = new JSONObject();
        // 账户类型
        // dto.put("card_type", "test");
        // 开户名称
        // dto.put("card_name", "test");
        // 开户银行
        // dto.put("bank_code", "test");
        // 开户银行省编码
        // dto.put("prov_id", "test");
        // 开户银行市编码
        // dto.put("area_id", "test");
        // 开户银行联行号开户银行联行号与开户银行全称（含支行)二选一；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：102290026507&lt;/font&gt;
        // dto.put("branch_code", "test");
        // 开户银行全称（含支行)开户银行联行号与开户银行全称（含支行)二选一；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：中国工商银行股份有限公司上海市中山北路支行&lt;/font&gt;
        // dto.put("branch_name", "test");
        // 银行账号
        // dto.put("card_no", "test");

        return dto.toJSONString();
    }

    private static String getWxZlConf() {
        JSONObject dto = new JSONObject();
        // 微信子商户号
        // dto.put("sub_mch_id", "test");
        // 配置集合
        // dto.put("wx_zl_pay_conf_list", getWxZlPayConfList());
        // 操作类型ADD-新增， UPDATE-修改， 默认新增；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：ADD&lt;/font&gt;
        // dto.put("operate_type", "test");
        // 联系人信息jsonObject字符串,新增时必填
        // dto.put("contact_info", getContactInfo());
        // 特殊主体登记证书jsonObject字符串，商户营业执照类型为政府机关/事业单位/其他组织时，传入相应信息。新增时需填入
        // dto.put("certificate_info", getCertificateInfo());
        // 最终受益人信息jsonObject字符串，商户类型为企业时，微信侧必填。（如果基本信息里有的话，可以不传取 huifu_id 对应的信息）。新增时填入
        // dto.put("ubo_info", getUboInfo());
        // 经营场景jsonObject字符串，新增时填入
        // dto.put("sales_info", getSalesInfo());
        // 银行账户信息jsonObject字符串，该字段不填时，取商户在汇付系统录入的结算账号信息。新增或修改时填入，修改时必填
        // dto.put("wx_card_info", getWxCardInfo());
        // 补充说明信息
        // dto.put("business_addition_msg", "");
        // 补充说明文件列表
        // dto.put("addition_file_list", getFileList());

        return dto.toJSONString();
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
