package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantIntegrateUpdateRequest;

/**
 * 商户统一变更接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantIntegrateUpdateRequest.class)
public class V2MerchantIntegrateUpdateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantIntegrateUpdateRequest request = new V2MerchantIntegrateUpdateRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付ID
        request.setHuifuId("6666000105240784");
        // 渠道商汇付ID
        request.setUpperHuifuId("6666000105215341");
        // 业务处理类型
        request.setDealType("1");

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
        // 商户基本信息
        extendInfoMap.put("basic_info", getBasicInfo());
        // 卡信息配置实体
        // extendInfoMap.put("card_info", getCardInfo());
        // 协议信息实体
        // extendInfoMap.put("agreement_info", getAgreementInfo());
        // 补贴支付
        // extendInfoMap.put("combine_pay_config", getCombinePayConfig());
        // 取现配置列表
        // extendInfoMap.put("cash_config", getCashConfig());
        // 结算配置实体
        // extendInfoMap.put("settle_config", getSettleConfig());
        // 业务开关对象
        // extendInfoMap.put("biz_conf", getBizConf());
        // 微信配置对象
        // extendInfoMap.put("wx_conf_list", getWxConfList());
        // 实名认证信息
        // extendInfoMap.put("wx_realname_info", getWxRealnameInfo());
        // 支付宝配置对象
        // extendInfoMap.put("ali_conf_list", getAliConfList());
        // 银联小微入驻信息实体
        // extendInfoMap.put("union_micro_info", getUnionMicroInfo());
        // 银联二维码配置
        // extendInfoMap.put("union_conf_list", getUnionConfList());
        // 银行卡业务配置实体
        // extendInfoMap.put("bank_card_conf", getBankCardConf());
        // 余额支付配置实体
        // extendInfoMap.put("balance_pay_config", getBalancePayConfig());
        // 花呗分期费率配置实体
        // extendInfoMap.put("hb_fq_fee_config", getHbFqFeeConfig());
        // 商户业务类型
        // extendInfoMap.put("mer_bus_type", "");
        // 线上费率配置
        // extendInfoMap.put("online_fee_conf_list", getOnlineFeeConfList());
        // 线上手续费承担方配置
        // extendInfoMap.put("online_pay_fee_conf_list", getOnlinePayFeeConfList());
        // 文件列表
        // extendInfoMap.put("file_info", getFileInfo());
        // 异步消息接收地址(审核)
        extendInfoMap.put("async_return_url", "");
        // 业务开通结果异步消息接收地址
        extendInfoMap.put("busi_async_return_url", "");
        // 交易异步应答地址
        extendInfoMap.put("recon_resp_addr", "");
        return extendInfoMap;
    }

    private static String getLegalInfo() {
        JSONObject dto = new JSONObject();
        // 法人姓名
        // dto.put("legal_name", "test");
        // 法人证件类型
        // dto.put("legal_cert_type", "test");
        // 法人证件号码
        // dto.put("legal_cert_no", "test");
        // 法人证件有效期类型
        // dto.put("legal_cert_validity_type", "test");
        // 法人证件有效期开始日期
        // dto.put("legal_cert_begin_date", "test");
        // 法人证件有效期截止日期
        // dto.put("legal_cert_end_date", "");

        return dto.toJSONString();
    }

    private static String getContactInfo() {
        JSONObject dto = new JSONObject();
        // 联系人姓名
        // dto.put("contact_name", "test");
        // 联系人手机号
        // dto.put("contact_mobile_no", "test");
        // 联系人电子邮箱
        // dto.put("contact_email", "test");
        // 联系人身份证号
        // dto.put("contact_cert_no", "");

        return dto.toJSONString();
    }

    private static String getSignUserInfo() {
        JSONObject dto = new JSONObject();
        // 签约人类型
        // dto.put("type", "test");
        // 姓名
        // dto.put("sign_name", "");
        // 手机号
        // dto.put("sign_mobile_no", "");
        // 身份证
        // dto.put("sign_cert_no", "");

        return dto.toJSONString();
    }

    private static String getBasicInfo() {
        JSONObject dto = new JSONObject();
        // 经营简称
        dto.put("short_name", "张三");
        // 小票名称
        dto.put("receipt_name", "");
        // 商户英文名称
        dto.put("mer_en_name", "");
        // 所属行业
        dto.put("mcc", "");
        // 营业执照类型
        dto.put("license_type", "");
        // 营业执照有效期开始日期
        dto.put("license_begin_date", "");
        // 营业执照有效期截止日期
        dto.put("license_end_date", "");
        // 营业执照有效期类型
        dto.put("license_validity_type", "");
        // 注册详细地址
        dto.put("reg_detail", "");
        // 注册省
        dto.put("reg_prov_id", "");
        // 注册市
        dto.put("reg_area_id", "");
        // 注册区
        dto.put("reg_district_id", "");
        // 经营详细地址
        dto.put("detail_addr", "");
        // 经营省
        dto.put("prov_id", "");
        // 经营市
        dto.put("area_id", "");
        // 经营区
        dto.put("district_id", "");
        // 客服电话
        dto.put("service_phone", "");
        // 商户主页URL
        dto.put("mer_url", "");
        // 商户ICP备案编号
        dto.put("mer_icp", "");
        // 开户许可证核准号
        dto.put("open_licence_no", "");
        // 法人信息
        // dto.put("legal_info", getLegalInfo());
        // 联系人信息
        // dto.put("contact_info", getContactInfo());
        // 签约人
        // dto.put("sign_user_info", getSignUserInfo());

        return dto.toJSONString();
    }

    private static String getCardInfo() {
        JSONObject dto = new JSONObject();
        // 结算类型
        // dto.put("card_type", "test");
        // 银行所在省参考银行省份编码；参考[地区码](https://paas.huifu.com/partners/api/#/csfl/api_csfl_dqbm)，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：310000&lt;/font&gt;；如修改省市要级联修改&lt;br/&gt;当card_type&#x3D;0时非必填， 当card_type&#x3D;1或2时必填
        // dto.put("prov_id", "test");
        // 银行所在市参考省市区编码；参考[地区码](https://paas.huifu.com/partners/api/#/csfl/api_csfl_dqbm)，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：310100 &lt;/font&gt;；如修改省市要级联修改&lt;br/&gt;当card_type&#x3D;0时非必填， 当card_type&#x3D;1或2时必填
        // dto.put("area_id", "test");
        // 结算账户名
        // dto.put("card_name", "test");
        // 结算账号
        // dto.put("card_no", "test");
        // 银行编码
        // dto.put("bank_code", "");
        // 联行号
        // dto.put("branch_code", "");
        // 支行名称
        // dto.put("branch_name", "");
        // 持卡人证件有效期类型
        // dto.put("cert_validity_type", "");
        // 持卡人证件有效期（起始）
        // dto.put("cert_begin_date", "");
        // 持卡人证件有效期（截止）
        // dto.put("cert_end_date", "");
        // 持卡人证件号码
        // dto.put("cert_no", "");
        // 持卡人证件类型
        // dto.put("cert_type", "");
        // 结算人手机号
        // dto.put("mp", "");

        return dto.toJSONString();
    }

    private static String getAgreementInfo() {
        JSONObject dto = new JSONObject();
        // 协议类型
        // dto.put("agreement_type", "test");
        // 纸质协议开始日期&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220822&lt;/font&gt;
        // dto.put("agree_begin_date", "test");
        // 纸质协议结束日期&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20230822&lt;/font&gt;
        // dto.put("agree_end_date", "test");
        // 协议号
        // dto.put("agreement_no", "");
        // 纸质协议模板号
        // dto.put("agreement_model", "");
        // 纸质协议模板名称
        // dto.put("agreement_name", "");
        // 纸质签约日期
        // dto.put("sign_date", "");

        return dto.toJSONString();
    }

    private static String getCombinePayConfig() {
        JSONObject dto = new JSONObject();
        // 支付手续费(%)
        // dto.put("fee_rate", "");
        // 支付固定手续费(元)
        // dto.put("fee_fix_amt", "");
        // 交易手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");
        // 交易手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "");
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "");

        return dto.toJSONString();
    }

    private static String getCashConfig() {
        JSONObject dto = new JSONObject();
        // 是否开通取现
        // dto.put("switch_state", "test");
        // 业务类型
        // dto.put("cash_type", "test");
        // 取现手续费率（%）fix_amt与fee_rate至少填写一项，单位%，需保留小数点后两位，取值范围[0.00,100.00]，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;&lt;br/&gt;注：如果fix_amt与fee_rate都填写了则手续费&#x3D;fix_amt+支付金额*fee_rate
        // dto.put("fee_rate", "test");
        // 提现手续费（固定/元）
        // dto.put("fix_amt", "");
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "");
        // 手续费承担方
        // dto.put("out_fee_huifu_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getSettleConfig() {
        JSONObject dto = new JSONObject();
        // 结算周期
        // dto.put("settle_cycle", "test");
        // 节假日结算手续费率
        // dto.put("fixed_ratio", "");
        // 起结金额
        // dto.put("min_amt", "");
        // 结算手续费外扣时的账户类型
        // dto.put("out_settle_acct_type", "");
        // 结算手续费外扣时的汇付ID
        // dto.put("out_settle_huifuid", "");
        // 手续费外扣标记
        // dto.put("out_settle_flag", "");
        // 留存金额
        // dto.put("remained_amt", "");
        // 结算摘要
        // dto.put("settle_abstract", "");
        // 结算批次号
        // dto.put("settle_batch_no", "");
        // 结算方式
        // dto.put("settle_pattern", "");
        // 是否优先到账
        // dto.put("is_priority_receipt", "");
        // 自定义结算处理时间
        // dto.put("settle_time", "");

        return dto.toJSONString();
    }

    private static String getBizConf() {
        JSONObject dto = new JSONObject();
        // 延迟入账开关
        // dto.put("delay_flag", "");
        // 商户开通强制延迟标记
        // dto.put("forced_delay_flag", "");
        // 是否开通网银
        // dto.put("online_flag", "");
        // 是否开通快捷
        // dto.put("quick_flag", "");
        // 是否开通代扣
        // dto.put("withhold_flag", "");
        // 是否开通微信预授权
        // dto.put("wechatpay_pre_auth_flag", "");
        // 是否开通支付宝预授权
        // dto.put("alipay_pre_auth_flag", "");
        // 是否开通补贴支付
        // dto.put("combine_pay_flag", "");
        // 是否开通余额支付
        // dto.put("balance_pay_flag", "");
        // 是否开通结算
        // dto.put("settle_flag", "");

        return dto.toJSONString();
    }

    private static String getWxConfList() {
        JSONObject dto = new JSONObject();
        // 支付场景
        // dto.put("pay_scene", "test");
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // ~~商户经营类目~~
        // dto.put("~~mcc~~", "");
        // 子渠道号
        // dto.put("pay_channel_id", "");
        // 费率规则id
        // dto.put("fee_rule_id", "");
        // 公众号支付Appid
        // dto.put("wx_woa_app_id", "");
        // 微信公众号授权目录
        // dto.put("wx_woa_path", "");
        // 微信小程序APPID
        // dto.put("wx_applet_app_id", "");
        // 微信公众号APPID对应的秘钥
        // dto.put("wx_woa_secret", "");
        // 微信小程序APPID对应的秘钥
        // dto.put("wx_applet_secret", "");
        // 申请服务 
        // dto.put("service_codes", "");
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

    private static String getUboInfo() {
        JSONObject dto = new JSONObject();
        // 证件类型
        // dto.put("ubo_id_doc_type", "test");
        // 证件正面照片
        // dto.put("ubo_id_doc_copy", "test");
        // 证件姓名
        // dto.put("ubo_id_doc_name", "test");
        // 证件号码
        // dto.put("ubo_id_doc_number", "test");
        // 证件居住地址
        // dto.put("ubo_id_doc_address", "test");
        // 证件有效期开始时间
        // dto.put("ubo_period_begin", "test");
        // 证件有效期结束时间
        // dto.put("ubo_period_end", "test");
        // 证件反面照片
        // dto.put("ubo_id_doc_copy_back", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getWxRealnameInfo() {
        JSONObject dto = new JSONObject();
        // 支付场景
        // dto.put("pay_scene", "test");
        // 联系人姓名
        // dto.put("name", "test");
        // 联系人手机号
        // dto.put("mobile", "test");
        // 联系人证件号码
        // dto.put("contact_id_card_number", "test");
        // 实名认证类型
        // dto.put("realname_info_type", "");
        // 子渠道号
        // dto.put("pay_channel_id", "");
        // 联系人类型
        // dto.put("contact_type", "");
        // 联系人证件类型
        // dto.put("contact_id_doc_type", "");
        // 联系人证件有效期开始时间
        // dto.put("contact_period_begin_date", "");
        // 联系人证件有效期结束时间
        // dto.put("contact_period_end_date", "");
        // 证书类型
        // dto.put("cert_type", "");
        // 证书编号
        // dto.put("cert_number", "");
        // 经营者/法人是否为受益人
        // dto.put("owner", "");
        // 法人证件居住地址
        // dto.put("legal_identification_address", "");
        // 小微经营类型
        // dto.put("micro_biz_type", "");
        // 门店名称
        // dto.put("store_name", "");
        // 门店省市编码
        // dto.put("store_address_code", "");
        // 门店地址
        // dto.put("store_address", "");
        // 特殊行业Id
        // dto.put("category_id", "");
        // 是否金融机构
        // dto.put("finance_institution_flag", "");
        // 金融机构类型
        // dto.put("finance_type", "");
        // 受益人信息
        // dto.put("ubo_info_list", getUboInfo());

        return dto.toJSONString();
    }

    private static String getAliConfList() {
        JSONObject dto = new JSONObject();
        // 支付场景
        // dto.put("pay_scene", "test");
        // 手续费（%）
        // dto.put("fee_rate", "test");
        // 商户经营类目
        // dto.put("mcc", "");
        // 子渠道号
        // dto.put("pay_channel_id", "");
        // 拟申请的间联商户等级
        // dto.put("indirect_level", "");
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

    private static String getUnionConfList() {
        JSONObject dto = new JSONObject();
        // 借记卡手续费1000以上（%）
        // dto.put("debit_fee_rate_up", "test");
        // 银联二维码业务贷记卡手续费1000以上（%）
        // dto.put("credit_fee_rate_up", "test");
        // 借记卡手续费1000以下（%）
        // dto.put("debit_fee_rate_down", "test");
        // 银联二维码业务贷记卡手续费1000以下（%）
        // dto.put("credit_fee_rate_down", "test");
        // 银联业务手续费类型
        // dto.put("charge_cate_code", "");
        // 借记卡封顶1000以上（元）
        // dto.put("debit_fee_limit_up", "");
        // 借记卡封顶1000以下（元）
        // dto.put("debit_fee_limit_down", "");
        // 商户经营类目
        // dto.put("mcc", "");
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

    private static String getBankCardConf() {
        JSONObject dto = new JSONObject();
        // 借记卡手续费（%）
        // dto.put("debit_fee_rate", "test");
        // 贷记卡手续费（%）
        // dto.put("credit_fee_rate", "test");
        // 商户经营类目
        // dto.put("mcc", "test");
        // 银行业务手续费类型
        // dto.put("charge_cate_code", "");
        // 借记卡封顶值
        // dto.put("debit_fee_limit", "");
        // 云闪付借记卡手续费1000以上（%）
        // dto.put("cloud_debit_fee_rate_up", "");
        // 云闪付借记卡封顶1000以上(元)
        // dto.put("cloud_debit_fee_limit_up", "");
        // 云闪付贷记卡手续费1000以上（%）
        // dto.put("cloud_credit_fee_rate_up", "");
        // 云闪付借记卡手续费1000以下（%）
        // dto.put("cloud_debit_fee_rate_down", "");
        // 云闪付借记卡封顶1000以下(元)
        // dto.put("cloud_debit_fee_limit_down", "");
        // 云闪付贷记卡手续费1000以下（%）
        // dto.put("cloud_credit_fee_rate_down", "");
        // 是否开通小额双免
        // dto.put("is_open_small_flag", "");
        // 小额双免单笔限额(元)
        // dto.put("small_free_amt", "");
        // 小额双免手续费（%）
        // dto.put("small_fee_amt", "");
        // 交易手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");
        // 交易手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "");
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "");

        return dto.toJSONString();
    }

    private static String getBalancePayConfig() {
        JSONObject dto = new JSONObject();
        // 支付手续费(%)
        // dto.put("fee_rate", "");
        // 支付固定手续费(元)
        // dto.put("fee_fix_amt", "");
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
        // dto.put("acq_three_period", "test");
        // 花呗收单分期6期（%）分期费率不为空时，收单费率必填，大于0，保留2位小数，不小于渠道商成本；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.0&lt;/font&gt;代表费率为1.00%
        // dto.put("acq_six_period", "test");
        // 花呗收单分期12期（%）分期费率不为空时，收单费率必填，大于0，保留2位小数，不小于渠道商成本；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.0&lt;/font&gt;代表费率为1.00%
        // dto.put("acq_twelve_period", "test");
        // 花呗分期3期（%）
        // dto.put("three_period", "");
        // 花呗分期6期（%）
        // dto.put("six_period", "");
        // 花呗分期12期（%）
        // dto.put("twelve_period", "");
        // 商户经营类目
        // dto.put("ali_mcc", "");
        // 支付场景
        // dto.put("pay_scene", "");
        // 交易手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");
        // 交易手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "");
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "");

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

    private static String getFileInfo() {
        JSONObject dto = new JSONObject();
        // D1结算协议图片文件
        // dto.put("settle_agree_pic", "");
        // 授权委托书
        // dto.put("auth_enturst_pic", "");
        // 商务协议
        // dto.put("ba_pic", "");
        // 公司照片一
        // dto.put("store_header_pic", "");
        // 公司照片二
        // dto.put("store_indoor_pic", "");
        // 公司照片三
        // dto.put("store_cashier_desk_pic", "");
        // 法人身份证人像面
        // dto.put("legal_cert_back_pic", "");
        // 法人身份证国徽面
        // dto.put("legal_cert_front_pic", "");
        // 营业执照图片
        // dto.put("license_pic", "");
        // 组织机构代码证
        // dto.put("org_code_pic", "");
        // 开户许可证
        // dto.put("reg_acct_pic", "");
        // 结算卡反面
        // dto.put("settle_card_back_pic", "");
        // 结算卡正面
        // dto.put("settle_card_front_pic", "");
        // 结算人身份证人像面
        // dto.put("settle_cert_back_pic", "");
        // 结算人身份证国徽面
        // dto.put("settle_cert_front_pic", "");
        // 税务登记证
        // dto.put("tax_reg_pic", "");
        // 实名登记证书照片
        // dto.put("cert_pic", "");
        // 个人商户身份证件正面照片
        // dto.put("identification_front_pic", "");
        // 个人商户身份证件反面照片
        // dto.put("identification_back_pic", "");
        // 单位证明函照片
        // dto.put("company_prove_pic", "");
        // 金融机构许可证图片1
        // dto.put("finance_license_pic1", "");
        // 金融机构许可证图片2
        // dto.put("finance_license_pic2", "");
        // 金融机构许可证图片3
        // dto.put("finance_license_pic3", "");
        // 金融机构许可证图片4
        // dto.put("finance_license_pic4", "");
        // 金融机构许可证图片5
        // dto.put("finance_license_pic5", "");
        // 联系人身份证国徽面
        // dto.put("contact_id_front_pic", "");
        // 联系人身份证人像面照
        // dto.put("contact_id_back_pic", "");
        // 联系人护照人像面
        // dto.put("contact_passport_img_pic", "");
        // 联系人证件照正面
        // dto.put("contact_cert_front_pic", "");
        // 联系人证件照反面
        // dto.put("contact_cert_back_pic", "");
        // 微信业务办理授权函
        // dto.put("contact_wx_busi_auth_pic", "");
        // 行业经营许可证资质照片一
        // dto.put("industry_busi_license_pic1", "");
        // 行业经营许可证资质照片二
        // dto.put("industry_busi_license_pic2", "");
        // 行业经营许可证资质照片三
        // dto.put("industry_busi_license_pic3", "");
        // 行业经营许可证资质照片四
        // dto.put("industry_busi_license_pic4", "");
        // 行业经营许可证资质照片五
        // dto.put("industry_busi_license_pic5", "");
        // 行业经营许可证资质照片六
        // dto.put("industry_busi_license_pic6", "");
        // 法人护照人像面
        // dto.put("legal_passport_img_pic", "");
        // 法人港澳台通行证正面
        // dto.put("legal_hk_aom_front_pic", "");
        // 法人其他证件照片
        // dto.put("legal_other_cert_pic", "");
        // 持卡人身份证人像面
        // dto.put("cert_front_pic", "");
        // 持卡人身份证国徽面
        // dto.put("cert_back_pic", "");
        // 持卡人护照人像面
        // dto.put("cert_passport_img_pic", "");
        // 持卡人港澳台通行证正面
        // dto.put("cert_hk_aom_front_pic", "");
        // 持卡人其它证件照片
        // dto.put("cert_other_pic", "");
        // 收银台照片
        // dto.put("cashier_desk_pic", "");
        // 店铺内景照
        // dto.put("indoor_pic", "");
        // 门头照
        // dto.put("header_pic", "");
        // 变更申请表文件
        // dto.put("modify_apply_pic", "");
        // 签约人身份证照片-人像面
        // dto.put("sign_identity_front_file_id", "");
        // 签约人身份证照片-国徽面
        // dto.put("sign_identity_back_file_id", "");
        // 签约人法人授权书
        // dto.put("sign_auth_file_id", "");
        // 支付宝授权函照片
        // dto.put("contact_ali_busi_auth_pic", "");

        return dto.toJSONString();
    }

}
