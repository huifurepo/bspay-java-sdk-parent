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
 * 商户业务开通 - 示例
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
        // 签约人jsonObject字符串；agreement_info中选择电子签约时必填；个人商户填本人信息。
        // request.setSignUserInfo(getB6e83d7eC97c4d1982e788a8308c91db());
        // 线上业务类型编码基本信息入驻接口中scene_type&#x3D;ONLINE/ALL时必填；&lt;br/&gt;开通以下业务快捷、网银、余额支付Pro版、银行大额转账、分账比例&gt;30%需要提供补充材料，参见[线上业务类型编码及补充材料说明](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/kyc/KYC-%E7%BA%BF%E4%B8%8A%E4%B8%9A%E5%8A%A1%E7%B1%BB%E5%9E%8B%E7%BC%96%E7%A0%81%E5%8F%8A%E8%A1%A5%E5%85%85%E6%9D%90%E6%96%99%E8%AF%B4%E6%98%8E.xlsx)；材料通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传&lt;font color&#x3D;&quot;green&quot;&gt;示例值：H7999AL&lt;/font&gt;
        // request.setOnlineBusiType("test");
        // *协议信息实体*jsonObject字符串；[签约协议材料说明](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/kyc/KYC-%E5%95%86%E6%88%B7%E5%90%88%E5%90%8C%E7%AD%BE%E7%BA%A6%E8%A7%84%E5%88%99.xlsx) &lt;br/&gt;若未签署过协议的情况下，调用该接口时必填；&lt;br/&gt;若已签署过纸质或电子协议下，调用该接口时必填，且只可以选择纸质或电子协议；&lt;br/&gt;若已签署过挂网协议下，调用该接口时，选填。
        request.setAgreementInfo(get93e686fd95714354A54e604dc5866944());

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
        // 微信支付宝商户简称
        extendInfoMap.put("short_name", "简称");
        // 是否开通网银
        extendInfoMap.put("online_flag", "Y");
        // 是否开通快捷
        extendInfoMap.put("quick_flag", "Y");
        // 是否开通代扣
        extendInfoMap.put("withhold_flag", "Y");
        // 商户业务类型
        // extendInfoMap.put("mer_bus_type", "");
        // 是否交易手续费外扣
        extendInfoMap.put("out_fee_flag", "2");
        // 交易手续费外扣汇付ID
        extendInfoMap.put("out_fee_huifuid", "");
        // 交易手续费外扣时的账户类型
        extendInfoMap.put("out_fee_acct_type", "");
        // 支付宝配置对象
        extendInfoMap.put("ali_conf_list", getB1b1b5c47b604a7490bfCcf556ac2733());
        // 支付宝直连配置对象
        // extendInfoMap.put("ali_zl_conf", get8ce399cbC08346ea93d4Ce3814ca5e71());
        // 开通支付宝预授权
        extendInfoMap.put("alipay_pre_auth_flag", "N");
        // 微信配置对象
        extendInfoMap.put("wx_conf_list", getB669fddf34ab454785f46e4140e5e43b());
        // 微信直连配置对象
        // extendInfoMap.put("wx_zl_conf", getF4fac2e53a2c4fc99ce0278158ac7be6());
        // 开通微信预授权
        extendInfoMap.put("wechatpay_pre_auth_flag", "N");
        // 银联二维码配置
        extendInfoMap.put("union_conf_list", getCacad185A3844234Bc21D7a8baf09862());
        // 银行卡业务配置
        extendInfoMap.put("bank_card_conf", get4df6e0eaE26840f892037584595fc520());
        // 线上费率配置
        // extendInfoMap.put("online_fee_conf_list", get4fb88483Fe354325Bd559423cac50a59());
        // 线上手续费承担方配置
        // extendInfoMap.put("online_pay_fee_conf_list", get1a7db6ad675243239f5dE15e55094de4());
        // 运营媒介
        // extendInfoMap.put("online_media_info_list", get99349170B4204adcB5e8Da99d620c754());
        // *余额支付配置*
        extendInfoMap.put("balance_pay_config", get8198464b9d5a40e69f9dB6ac7726d573());
        // 全域资金管理配置(华通银行)
        // extendInfoMap.put("out_order_funds_config", getDb2aad74070146479fea120f7167811c());
        // 补贴支付
        extendInfoMap.put("combine_pay_config", get5dc2e3d49bac46e49c400d0dba3c91f0());
        // 花呗分期费率配置
        extendInfoMap.put("hb_fq_fee_config", get6125bb8dBea14eaaB3feAdc5a328317e());
        // 汇总结算配置
        // extendInfoMap.put("collection_settle_config_list", get6c7a364aC1e64d9a82822c3e24f59253());
        // 分账配置信息
        // extendInfoMap.put("split_conf_info", get691c39ac13fd4276A8ae1b50edc0fd0a());
        // 延迟入账开关
        extendInfoMap.put("delay_flag", "Y");
        // 商户开通强制延迟标记
        extendInfoMap.put("forced_delay_flag", "Y");
        // 使用上级微信、支付宝商户号发起交易
        // extendInfoMap.put("use_chains_flag", "");
        // *补充文件信息*
        // extendInfoMap.put("extended_material_list", get5b46783388754f0fAb86178e136e8186());
        // 开户费用值(元)
        // extendInfoMap.put("enter_fee", "");
        // 开户费用类型
        // extendInfoMap.put("enter_fee_flag", "");
        // 是否开通在线退款
        // extendInfoMap.put("online_refund", "");
        // 是否支持平台退款
        // extendInfoMap.put("platform_refund", "");
        // 是否支持撤销
        // extendInfoMap.put("support_revoke", "");
        // 异步消息接收地址
        extendInfoMap.put("async_return_url", "http://192.168.85.157:30031/sspm/testVirgo");
        // 业务开通结果异步消息接收地址
        extendInfoMap.put("busi_async_return_url", "");
        // 交易异步应答地址
        extendInfoMap.put("recon_resp_addr", "http://192.168.85.157:30031/sspm/testVirgo");
        // 银联线上收银台
        // extendInfoMap.put("uni_app_payment_config", get817fd026C9764e389a4eDea12ebd9fe8());
        // 资金归集开通标记
        // extendInfoMap.put("fund_collection_flag", "");
        // 代发配置
        // extendInfoMap.put("surrogate_config_list", get7bce094eC54947caA664C0303f211848());
        // 大额支付配置
        // extendInfoMap.put("large_amt_pay_config", get3eb9fd08566b44918d473a723cea37b5());
        // 托管支付开关
        // extendInfoMap.put("half_pay_host_flag", "");
        // 代发复核配置
        // extendInfoMap.put("agent_recheck_config", get3c520d21F4594dab8cea109be9606693());
        // 商户开通网银充值开关
        // extendInfoMap.put("online_recharge_flag", "");
        // 是否开通垫资退款
        // extendInfoMap.put("refund_mend_open_flag", "");
        // 捷行付配置
        // extendInfoMap.put("jxf_conf_info", getCe923151972f4d15A8a97d43a846a1c7());
        // 合单支付配置信息
        // extendInfoMap.put("merge_pay_config_info", get09ce87e146ac4f9dBdddAea2114bb47a());
        // 是否开通账单支付
        // extendInfoMap.put("bill_payment_flag", "");
        return extendInfoMap;
    }

    private static String getB6e83d7eC97c4d1982e788a8308c91db() {
        JSONObject dto = new JSONObject();
        // 签约人类型
        // dto.put("type", "test");
        // 姓名签约人类型&#x3D;其他，必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：张三&lt;/font&gt;
        // dto.put("name", "test");
        // 身份证签约人类型&#x3D;联系人/其他，必填 ；注意：**签约人会做姓名+身份证+手机号验证，请正确填写**；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：320946195712025082&lt;/font&gt;
        // dto.put("cert_no", "test");
        // 手机号签约人类型&#x3D;法人/其他 ，必填；注意：**签约人会做姓名+身份证+手机号验证，请正确填写**；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：13917463536&lt;/font&gt;
        // dto.put("mobile_no", "test");
        // 邮箱
        // dto.put("email", "");

        return dto.toJSONString();
    }

    private static String get789d563b964949268241B422fc5bb2c9() {
        JSONObject dto = new JSONObject();
        // 联系人身份证号码
        // dto.put("id_card_number", "test");
        // 联系人姓名
        // dto.put("name", "");
        // 联系人手机号
        // dto.put("mobile", "");

        return dto.toJSONString();
    }

    private static String getF3568ac04ad9448eA6d081ab506bd253() {
        JSONObject dto = new JSONObject();
        // 证件持有人类型
        // dto.put("legal_type", "");
        // 证件类型
        // dto.put("card_type", "");
        // 姓名
        // dto.put("person_name", "");
        // 证件号码
        // dto.put("card_no", "");
        // 证件生效时间
        // dto.put("effect_time", "");
        // 证件过期时间
        // dto.put("expire_time", "");
        // 证件正面照
        // dto.put("card_front_img", "");
        // 证件反面照
        // dto.put("card_back_img", "");
        // 授权函照片
        // dto.put("auth_letter_img", "");
        // 是否为受益人
        // dto.put("is_benefit_person", "");

        return dto.toJSONString();
    }

    private static JSON get63f800eaFb2e4faaA45762790aebeca7() {
        JSONObject dto = new JSONObject();
        // 是否金融机构
        // dto.put("finance_institution_flag", "");
        // 金融机构类型
        // dto.put("finance_type", "");
        // 证书类型
        // dto.put("cert_type", "");
        // 小微经营类型
        // dto.put("micro_biz_type", "");
        // 特殊行业id
        // dto.put("special_category_id", "");
        // 联系人信息对象
        // dto.put("contact_person_info", get789d563b964949268241B422fc5bb2c9());
        // 法人身份信息
        // dto.put("legal_person_info", getF3568ac04ad9448eA6d081ab506bd253());

        return dto;
    }

    private static String getB1b1b5c47b604a7490bfCcf556ac2733() {
        JSONObject dto = new JSONObject();
        // 支付场景
        dto.put("pay_scene", "1");
        // 手续费（%）
        dto.put("fee_rate", "0.38");
        // 子渠道号
        dto.put("pay_channel_id", "JQF00001");
        // 最低收取手续费（元）
        // dto.put("fee_min_amt", "");
        // 是否需要实名认证
        // dto.put("is_check_real_name", "");
        // 实名认证信息
        // dto.put("al_real_name_info", get63f800eaFb2e4faaA45762790aebeca7());
        // *商户经营类目*
        dto.put("mcc", "2015091000052157");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static JSON get44f2f366E715491bA601775f1787f5a4() {
        JSONObject dto = new JSONObject();
        // 文件类型
        // dto.put("file_type", "test");
        // 文件jfileId
        // dto.put("file_id", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get8ce399cbC08346ea93d4Ce3814ca5e71() {
        JSONObject dto = new JSONObject();
        // 申请类型
        // dto.put("apply_type", "test");
        // 商户支付宝账号
        // dto.put("account", "test");
        // 服务费率仅支持渠道商。平台商户调用不支持该字段服务费率（%），0.38~3之间，精确到0.01。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.06&lt;/font&gt;
        // dto.put("fee_rate", "test");
        // 文件列表
        // dto.put("file_list", get44f2f366E715491bA601775f1787f5a4());
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

    private static JSON get8f318ab9063d4c54B923208f87cb6a6c() {
        JSONObject dto = new JSONObject();
        // 联系人姓名联系人类型contact_type&#x3D;SUPER时必填。示例值：张三
        // dto.put("name", "test");
        // 联系人手机号联系人类型contact_type&#x3D;SUPER时必填。示例值：13917364538
        // dto.put("mobile", "test");
        // 联系人证件类型联系人类型contact_type&#x3D;SUPER时必填。&lt;br/&gt;枚举值参见《自然人证件类型》说明，示例值：00&lt;br/&gt;个体户/企业/事业单位/社会组织：可选择任一证件类型，政府机关仅支持身份证类型。
        // dto.put("contact_id_doc_type", "test");
        // 联系人证件号码联系人类型contact_type&#x3D;SUPER时必填。示例值：320936198512035017
        // dto.put("id_card_number", "test");
        // 联系人证件有效期开始时间联系人类型contact_type&#x3D;SUPER时必填&lt;br/&gt;格式：yyyy-MM-dd；示例值：2019-06-06
        // dto.put("contact_period_begin", "test");
        // 联系人证件有效期结束时间联系人类型contact_type&#x3D;SUPER时必填&lt;br/&gt;格式：yyyy-MM-dd；示例值：2029-06-06&lt;br/&gt;结束时间大于开始时间;若证件有效期为长期，请填写：长期
        // dto.put("contact_period_end", "test");
        // 是否金融机构
        // dto.put("finance_institution_flag", "");
        // 金融机构类型
        // dto.put("finance_type", "");
        // 证书类型
        // dto.put("cert_type", "");
        // 小微经营类型
        // dto.put("micro_biz_type", "");
        // 特殊行业id
        // dto.put("special_category_id", "");
        // 联系人类型
        // dto.put("contact_type", "");

        return dto;
    }

    private static String getB669fddf34ab454785f46e4140e5e43b() {
        JSONObject dto = new JSONObject();
        // 支付场景
        dto.put("pay_scene", "1");
        // 手续费（%）
        dto.put("fee_rate", "0.38");
        // *商户经营类目*
        dto.put("mcc", "111");
        // 费率规则号
        dto.put("fee_rule_id", "758");
        // 子渠道号
        dto.put("pay_channel_id", "JP00001");
        // 最低收取手续费（元）
        // dto.put("fee_min_amt", "");
        // 是否需要实名认证
        // dto.put("is_check_real_name", "");
        // 实名认证信息
        // dto.put("wx_real_name_info", get8f318ab9063d4c54B923208f87cb6a6c());

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static JSON get85d5b676191e40b48133Ec2501d25ec0() {
        JSONObject dto = new JSONObject();
        // 文件类型
        // dto.put("file_type", "test");
        // 文件jfileId
        // dto.put("file_id", "test");

        return dto;
    }

    private static JSON get20d5ee921e3b4b10A536C4d1e553b7e8() {
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
        // 联系人资料联系人类型为经办人时必填F28-联系人身份证国徽面   F29-联系人身份证人像面F227-微信业务办理授权函&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：&lt;/font&gt;
        // dto.put("contact_file_list", get85d5b676191e40b48133Ec2501d25ec0());
        // 证件有效期类型
        // dto.put("contact_cert_validity_type", "test");
        // 证件有效期开始日期
        // dto.put("contact_cert_begin_date", "test");
        // 证件有效期截止日期
        // dto.put("contact_cert_end_date", "");

        return dto;
    }

    private static JSON get3ed2ef30E5644c5bAef478b32ebb7d9f() {
        JSONObject dto = new JSONObject();
        // 文件类型
        // dto.put("file_type", "test");
        // 文件jfileId
        // dto.put("file_id", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON get9d3e09743c864ac5B668F59bbfe5099a() {
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
        // dto.put("ubo_file_list", get3ed2ef30E5644c5bAef478b32ebb7d9f());
        // 证件有效期截止日期
        // dto.put("ubo_cert_end_date", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON get8eac07e487864bd6B312E75392c394be() {
        JSONObject dto = new JSONObject();
        // 经营者/法人是否为受益人
        // dto.put("ubo_type", "test");
        // 受益人信息列表jsonArray格式,当ubo_type为Y时可不填
        // dto.put("ubo_info_list", get9d3e09743c864ac5B668F59bbfe5099a());

        return dto;
    }

    private static JSON get89854fb3A0e54cfa8805C45cb510e04a() {
        JSONObject dto = new JSONObject();
        // 文件类型
        // dto.put("file_type", "test");
        // 文件jfileId
        // dto.put("file_id", "test");

        return dto;
    }

    private static JSON getBa04b5fbAe6d4216A21f9a58a6fa9ccd() {
        JSONObject dto = new JSONObject();
        // 经营场景类型
        // dto.put("sales_scenes_type", "test");
        // 功能费率仅支持渠道商传入该字段。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.06&lt;/font&gt;平台商户为子商户开通微信直连支付时，不支持该字段，取平台商户费率上送微信。
        // dto.put("fee_rate", "test");
        // 线下场所对应的商家公众号APPID开通线下门店场景时，填入。都填入时，取公众号的上送微信。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx51aa91a575359ff5&lt;/font&gt;
        // dto.put("biz_sub_jsapi_app_id", "test");
        // 线下场所对应的商家小程序APPID开通线下门店场景时，填入。都填入时，取公众号的上送微信。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wxea9c30a90fs8d3fe&lt;/font&gt;
        // dto.put("biz_sub_mini_app_id", "test");
        // 服务商公众号 ID开通公众号场景时，直连服务商和商户的公众号 APP ID，二选一填入。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx51aa91a575359ff5&lt;/font&gt;
        // dto.put("jsapi_app_id", "test");
        // 商家公众号APPID开通公众号场景时，直连服务商和商户的公众号 APP ID，二选一填入。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wxea9c30a90fs8d3fe&lt;/font&gt;
        // dto.put("jsapi_sub_app_id", "test");
        // 服务商小程序APPID开通小程序场景时，直连服务商和商户的小程序 APP ID，二选一填入。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx51aa91a575359ff5&lt;/font&gt;
        // dto.put("mini_app_id", "test");
        // 商家小程序APPID开通小程序场景时，直连服务商和商户的小程序 APP ID，二选一填入。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx51aa91a575359ff5&lt;/font&gt;
        // dto.put("mini_sub_app_id", "test");
        // 服务商应用APPID开通 APP 场景时，直连服务商和商户的 APP ID，二选一填入。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx51aa91a575359ff5&lt;/font&gt;
        // dto.put("app_app_id", "test");
        // 商家应用APPID开通 APP 场景时，直连服务商和商户的 APP ID，二选一填入。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx51aa91a575359ff5&lt;/font&gt;
        // dto.put("app_sub_app_id", "test");
        // 互联网网站域名开通互联网场景时填入；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：huifu.com&lt;/font&gt;
        // dto.put("web_domain", "test");
        // 互联网网站对应的商家APPID开通互联网场景时填入；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx51aa91a575359ff5&lt;/font&gt;
        // dto.put("web_app_id", "test");
        // 商家企业微信CorpID开通企业微信场景时填入；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：xxxxx&lt;/font&gt;
        // dto.put("sub_corp_id", "test");
        // 文件列表
        // dto.put("sales_scenes_file_list", get89854fb3A0e54cfa8805C45cb510e04a());
        // 文件列表
        // dto.put("fee_rate_file_list", "");
        // 门店名称
        // dto.put("biz_store_name", "");
        // 门店省市编码
        // dto.put("biz_address_code", "");
        // 门店地址
        // dto.put("biz_store_address", "");

        return dto;
    }

    private static JSON getCafdf5740ad44b5782f34c42fdc0c55d() {
        JSONObject dto = new JSONObject();
        // 文件类型
        // dto.put("file_type", "test");
        // 文件jfileId
        // dto.put("file_id", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON getBeb331e634e6480189c805aadc9b5ba5() {
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
        // dto.put("cert_file_list", getCafdf5740ad44b5782f34c42fdc0c55d());
        // 证书有效期截止日期
        // dto.put("cert_end_date", "");

        return dto;
    }

    private static JSON get4cf6ea0b3abb434cA138A2f3eaeed6df() {
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

        return dto;
    }

    private static JSON get7c924e80101a4d528127021b85eb9fc5() {
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

    private static JSON get42fb9ef288234eecA3e1Ba2f00416263() {
        JSONObject dto = new JSONObject();
        // 文件类型
        // dto.put("file_type", "test");
        // 文件jfileId
        // dto.put("file_id", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getF4fac2e53a2c4fc99ce0278158ac7be6() {
        JSONObject dto = new JSONObject();
        // 微信子商户号微信支付分配的子商户号；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1632157057&lt;/font&gt;
        // dto.put("sub_mch_id", "test");
        // 联系人信息jsonObject字符串,新增时必填
        // dto.put("contact_info", get20d5ee921e3b4b10A536C4d1e553b7e8());
        // 最终受益人信息jsonObject字符串，商户类型为企业时，微信侧必填。（如果基本信息里有的话，可以不传取 huifu_id 对应的信息）。新增时填入
        // dto.put("ubo_info", get8eac07e487864bd6B312E75392c394be());
        // 经营场景jsonObject字符串，新增时填入
        // dto.put("sales_info", getBa04b5fbAe6d4216A21f9a58a6fa9ccd());
        // 特殊主体登记证书jsonObject字符串，商户营业执照类型为政府机关/事业单位/其他组织时，传入相应信息。新增时需填入
        // dto.put("certificate_info", getBeb331e634e6480189c805aadc9b5ba5());
        // 银行账户信息jsonObject字符串，该字段不填时，取商户在汇付系统录入的结算账号信息。新增或修改时填入，修改时必填
        // dto.put("wx_card_info", get4cf6ea0b3abb434cA138A2f3eaeed6df());
        // 配置集合对指定的sub_mch_id做配置
        // dto.put("wx_zl_pay_conf_list", get7c924e80101a4d528127021b85eb9fc5());
        // 操作类型ADD-新增， UPDATE-修改， 默认新增；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：ADD&lt;/font&gt;
        // dto.put("operate_type", "test");
        // 补充说明信息
        // dto.put("business_addition_msg", "");
        // 补充说明文件列表
        // dto.put("addition_file_list", get42fb9ef288234eecA3e1Ba2f00416263());

        return dto.toJSONString();
    }

    private static String getCacad185A3844234Bc21D7a8baf09862() {
        JSONObject dto = new JSONObject();
        // 借记卡手续费（%）
        // dto.put("debit_fee_rate", "test");
        // 贷记卡手续费1000以上（%）
        dto.put("credit_fee_rate_up", "0.56");
        // 贷记卡手续费1000及以下（%）
        dto.put("credit_fee_rate_down", "0.38");
        // 银联业务手续费类型
        dto.put("charge_cate_code", "03");
        // 商户经营类目
        dto.put("mcc", "5411");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get4df6e0eaE26840f892037584595fc520() {
        JSONObject dto = new JSONObject();
        // 借记卡手续费（%）
        dto.put("debit_fee_rate", "0.38");
        // 贷记卡手续费（%）
        dto.put("credit_fee_rate", "0.39");
        // *商户经营类目*
        dto.put("mcc", "5411");
        // 银行业务手续费类型
        dto.put("charge_cate_code", "02");
        // 借记卡封顶值
        dto.put("debit_fee_limit", "0.56");
        // 是否开通小额双免
        dto.put("is_open_small_flag", "0");
        // 小额双免单笔限额(元)
        dto.put("small_free_amt", "1000");
        // 小额双免手续费（%）
        dto.put("small_fee_amt", "0.33");
        // 云闪付开通状态
        // dto.put("is_open_cloud_flag", "");

        return dto.toJSONString();
    }

    private static String get4fb88483Fe354325Bd559423cac50a59() {
        JSONObject dto = new JSONObject();
        // 业务类型
        // dto.put("fee_type", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get1a7db6ad675243239f5dE15e55094de4() {
        JSONObject dto = new JSONObject();
        // 业务类型
        // dto.put("pay_type", "");
        // 手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");
        // 手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "");
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get99349170B4204adcB5e8Da99d620c754() {
        JSONObject dto = new JSONObject();
        // *运营媒介类型*
        // dto.put("media_type", "test");
        // *媒介名称*PC网站域名／APP名称／小程序名称／公众号名称；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：汇付服务&lt;/font&gt;&lt;br/&gt;运营媒介类型为 ：S1/S2/S3/S4时，必填；
        // dto.put("media_name", "test");
        // ICP备案/许可证号运营媒介类型为 ：S1时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：沪ICP备06046402号-28&lt;/font&gt;
        // dto.put("mer_icp", "test");
        // *其他有效信息*其他有效信息或链接地址/APP下载地址；类型为S5或S2必填&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：http://download.huifu.com&lt;/font&gt;
        // dto.put("other_info", "test");
        // *媒介主体与商户主体是否一致*Y/N；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：Y&lt;/font&gt;&lt;br/&gt;运营媒介为S1、S2、S3、S4且企业商户开通快捷或网银，或大额转账，或余额支付或分账业务（20%（不含）-100%），或为个人商户开通分账业务（10%（不含）-100%），必填&lt;br/&gt;若不一致，则需提供ICP备案/APP/微信公众号/小程序主体与商户的使用授权或开发证明材料；
        // dto.put("media_mer_common_flag", "test");
        // *授权或开发证明材料*运营媒介为S1、S2、S3、S4且媒介主体与商户主体不一致时，且企业商户开通快捷或网银，或大额转账，或余额支付或分账业务（20%（不含）-100%），或为个人商户开通分账业务（10%（不含）-100%），必填&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // dto.put("authorize_materials", "test");
        // 微信APP补充材料运营媒介为S2且开通微信下app支付时选填，具体见[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)
        // dto.put("other_material", "test");
        // appId运营媒介为S2且开通微信下app支付时必填
        // dto.put("app_id", "test");
        // appId认证主体名称运营媒介为S2且开通微信下app支付时必填
        // dto.put("app_name", "test");
        // 补充说明运营媒介为S2且开通微信下app支付时选填
        // dto.put("supplement", "test");
        // *测试账号*
        // dto.put("test_account", "");
        // *测试密码*
        // dto.put("test_secret", "");
        // *运营媒介-首页*
        // dto.put("media_front_page", "");
        // *运营媒介-服务/商品明细页面*
        // dto.put("media_service_page", "");
        // *运营媒介-下单场景页面*
        // dto.put("media_order_page", "");
        // *运营媒介-支付页面*
        // dto.put("media_pay_page", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static JSON get3dfe0dd9790740cdA3483476077f73df() {
        JSONObject dto = new JSONObject();
        // *业务模式说明*请详细说明商户的业务模式，包括不限于（业务参与方、各方的权利及义务关系等）。最大500个汉字，仅Pro版时必填&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：商户向企业采购产品，并将其展示在其电商平台上，用户注册后购买其产品，产品主要有家电、服饰、鞋帽等，用户购买产品的资金作为商户所得，商户根据订单情况进行物流配送。&lt;/font&gt;
        // dto.put("busi_instruction", "test");
        // *资金流向说明*请详细说明商户的资金流向，包括但不限于（交易所涉及的各方账户、资金流入流出过程等）。最大500个汉字，仅Pro版时必填&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：用户选购产品后根据订单支付给商户，商户根据结算周期，结算到对公账户。&lt;/font&gt;
        // dto.put("capital_instruction", "test");
        // *功能开通用途说明*请详述所申请功能的原因、场景、涉及对象类型。最大500个汉字，仅Pro版时必填&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：企业工资代发&lt;/font&gt;
        // dto.put("function_instruction", "test");

        return dto;
    }

    private static String get8198464b9d5a40e69f9dB6ac7726d573() {
        JSONObject dto = new JSONObject();
        // *业务模式*
        // dto.put("balance_model", "test");
        // 业务情况说明
        // dto.put("description_info", get3dfe0dd9790740cdA3483476077f73df());
        // 手续费(%)
        dto.put("fee_rate", "2");
        // 手续费（固定/元）
        dto.put("fee_fix_amt", "1");
        // 手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");
        // 手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "");
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "");
        // 扣费模式
        // dto.put("charge_mode", "");
        // 余额支付模式
        // dto.put("pay_mode", "");

        return dto.toJSONString();
    }

    private static JSON get15cec1475e894cb495beE1fdbc7486f2() {
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

        return dto;
    }

    private static JSON get7baacf6e8a3f45b5A073Ccaa5742140c() {
        JSONObject dto = new JSONObject();
        // 开户手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 开户手续费外扣时的账户类型01-基本户，05-充值户，09-营销户，不填默认01；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：01&lt;/font&gt;&lt;br/&gt;注：fee_fix_amt：开户手续费大于0时必填
        // dto.put("out_fee_acct_type", "test");
        // 开户手续费外扣汇付ID开通手续费外扣业务时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812123&lt;/font&gt;&lt;br/&gt;注：fee_fix_amt：开户手续费大于0时必填
        // dto.put("out_fee_huifuid", "test");

        return dto;
    }

    private static String getDb2aad74070146479fea120f7167811c() {
        JSONObject dto = new JSONObject();
        // 自动入账开关
        // dto.put("out_order_auto_acct_flag", "test");
        // 全渠道资金管理补充材料涉及文件类型：F504-全渠道资金管理补充材料；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        // dto.put("other_payment_institutions_pic", "test");
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
        // dto.put("out_order_acct_card", get15cec1475e894cb495beE1fdbc7486f2());
        // 全域资金开户手续费
        // dto.put("out_order_acct_open_fees", get7baacf6e8a3f45b5A073Ccaa5742140c());
        // 全域支付业务模式
        // dto.put("business_model", "");

        return dto.toJSONString();
    }

    private static String get5dc2e3d49bac46e49c400d0dba3c91f0() {
        JSONObject dto = new JSONObject();
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "test");
        // 手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "test");
        // 手续费(%)
        dto.put("fee_rate", "10");
        // 手续费（固定/元）
        dto.put("fee_fix_amt", "5");
        // 手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");

        return dto.toJSONString();
    }

    private static String get6125bb8dBea14eaaB3feAdc5a328317e() {
        JSONObject dto = new JSONObject();
        // 花呗收单分期3期（%）分期费率不为空时，收单费率必填，大于0，保留2位小数，不小于渠道商成本；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.0&lt;/font&gt;代表费率为1.00%
        dto.put("acq_three_period", "1.30");
        // 花呗收单分期6期（%）分期费率不为空时，收单费率必填，大于0，保留2位小数，不小于渠道商成本；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.0&lt;/font&gt;代表费率为1.00%
        dto.put("acq_six_period", "4.60");
        // 花呗收单分期12期（%）分期费率不为空时，收单费率必填，大于0，保留2位小数，不小于渠道商成本；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.0&lt;/font&gt;代表费率为1.00%
        dto.put("acq_twelve_period", "9.12");
        // 花呗收单分期24期（%）分期费率不为空时，收单费率必填，大于0，保留2位小数，不小于渠道商成本；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.0&lt;/font&gt;代表费率为1.00%
        // dto.put("acq_twentyfour_period", "test");
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
        // 花呗分期24期（%）
        // dto.put("twentyfour_period", "");

        return dto.toJSONString();
    }

    private static String get6c7a364aC1e64d9a82822c3e24f59253() {
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

    private static JSON get91eac6c511a44a3dA9153acc3b9fd7f7() {
        JSONObject dto = new JSONObject();
        // 分账比例
        // dto.put("fee_rate", "test");
        // 汇付Id
        // dto.put("huifu_id", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON get5da774e3E7454c9dB0a355a1d51eba60() {
        JSONObject dto = new JSONObject();
        // *业务模式说明*
        // dto.put("busi_instruction", "test");
        // *资金流向说明*
        // dto.put("capital_instruction", "test");
        // *功能开通用途说明*
        // dto.put("function_instruction", "test");

        return dto;
    }

    private static String get691c39ac13fd4276A8ae1b50edc0fd0a() {
        JSONObject dto = new JSONObject();
        // 分账开关
        // dto.put("div_flag", "test");
        // 分账规则来源
        // dto.put("rule_origin", "test");
        // 最大分账比例%
        // dto.put("apply_ratio", "test");
        // 生效类型
        // dto.put("start_type", "test");
        // 分账模式
        // dto.put("scene", "test");
        // 分账明细
        // dto.put("acct_split_bunch_list", get91eac6c511a44a3dA9153acc3b9fd7f7());
        // 手续费外扣开关
        // dto.put("out_fee_flag", "");
        // 手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");
        // 手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "");
        // 手续费%
        // dto.put("split_fee_rate", "");
        // 固定手续费
        // dto.put("per_amt", "");
        // 业务情况说明
        // dto.put("split_ext_info", get5da774e3E7454c9dB0a355a1d51eba60());

        return dto.toJSONString();
    }

    private static String get5b46783388754f0fAb86178e136e8186() {
        JSONObject dto = new JSONObject();
        // *文件id*
        // dto.put("file_id", "test");
        // *文件类型*
        // dto.put("file_type", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get93e686fd95714354A54e604dc5866944() {
        JSONObject dto = new JSONObject();
        // *协议类型*
        dto.put("agreement_type", "0");
        // *挂网协议地址*挂网协议必填；**必须按示例值填写**，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/PaymentServiceAgreement.htm&lt;/font&gt;；
        // dto.put("agreement_url", "test");
        // 纸质协议开始日期
        dto.put("agree_begin_date", "20200325");
        // 纸质协议结束日期
        dto.put("agree_end_date", "20400325");
        // 电子协议签约短信发送标识
        // dto.put("message_send_type", "");
        // 电子协议异步通知地址
        // dto.put("agreement_async_return_url", "");

        return dto.toJSONString();
    }

    private static String get817fd026C9764e389a4eDea12ebd9fe8() {
        JSONObject dto = new JSONObject();
        // 借记手续费（%）借记卡费率与贷记卡费率不能同时为空;保留2位小数，最大值100.00，最小值0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.02&lt;/font&gt;
        // dto.put("debit_fee_rate", "test");
        // 贷记手续费（%）借记卡费率与贷记卡费率不能同时为空;保留2位小数，最大值100.00，最小值0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.06&lt;/font&gt;
        // dto.put("credit_fee_rate", "test");
        // 状态开关
        // dto.put("switch_state", "");
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "");
        // 交易手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "");
        // 交易手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");
        // 云闪付免密支付开通标识
        // dto.put("cloud_quick_pass_secret_free_flag", "");

        return dto.toJSONString();
    }

    private static String get7bce094eC54947caA664C0303f211848() {
        JSONObject dto = new JSONObject();
        // 代发业务类型
        // dto.put("surrogate_type", "test");
        // 手续费（固定/元）手续费（固定/元），保留小数点后两位；fee_formula_type为05，06时必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;
        // dto.put("fix_amt", "test");
        // 手续费（百分比/%）手续费（百分比/%），保留小数点后两位；取值范围[0.00,100.00]；fee_formula_type为01，02，03，06时必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;
        // dto.put("fee_rate", "test");
        // 手续费封顶值（固定/元）手续费封顶值（固定/元），保留小数点后两位；fee_formula_type为03时必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：100.00&lt;/font&gt;
        // dto.put("fee_max_amt", "test");
        // 手续费保底值（固定/元）手续费保底值（固定/元），保留小数点后两位；fee_formula_type为02时必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;
        // dto.put("fee_min_amt", "test");
        // 是否交手续费外扣标记
        // dto.put("out_fee_flag", "");
        // 交易手续费外扣时账户类型
        // dto.put("out_fee_acct_type", "");
        // 交易手续费外扣汇付ID
        // dto.put("out_fee_huifu_id", "");
        // 是否允许对私代发
        // dto.put("surrogate_private_flag", "");
        // 代发手续费计费模式
        // dto.put("fee_formula_type", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static JSON get8157920dAac14a7a94e439e75e990e47() {
        JSONObject dto = new JSONObject();
        // 大额支付业务模式
        // dto.put("business_model", "test");
        // 费率（%）开通大额业务时必须填写一种收费方式；大于0,保留2位小数；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;
        // dto.put("fee_rate", "test");
        // 交易手续费（固定/元）开通大额业务时必须填写一种收费方式；大于0,保留2位小数；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：10.00&lt;/font&gt;
        // dto.put("fee_fix_amt", "test");
        // 功能开关
        // dto.put("switch_state", "");
        // 大额调账标识申请类型
        // dto.put("biz_type", "");
        // 是否允许绑卡支付
        // dto.put("mer_same_card_recharge_flag", "");
        // 是否允许用户入账
        // dto.put("allow_user_deposit_flag", "");
        // 备付金固定账号模式自动退款
        // dto.put("provisions_auto_refund_flag", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get3eb9fd08566b44918d473a723cea37b5() {
        JSONObject dto = new JSONObject();
        // 大额支付配置列表
        // dto.put("large_amt_pay_config_info_list", get8157920dAac14a7a94e439e75e990e47());
        // 交易手续费外扣huifuId交易手续费外扣时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000108854952&lt;/font&gt;
        // dto.put("out_fee_huifu_id", "test");
        // 交易手续费外扣账户号交易手续费外扣时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：F00598602&lt;/font&gt;
        // dto.put("out_fee_acct_id", "test");
        // 交易手续费外扣标记
        // dto.put("out_fee_flag", "");
        // 商户付款方卡类型
        // dto.put("mer_payer_card_type", "");

        return dto.toJSONString();
    }

    private static JSON get3c520d21F4594dab8cea109be9606693() {
        JSONObject dto = new JSONObject();
        // 代发复核开关
        // dto.put("agent_recheck_flag", "");
        // 复核授权商户号
        // dto.put("agent_recheck_huifu_id", "");
        // 复核类型
        // dto.put("agent_recheck_type", "");

        return dto;
    }

    private static JSON get436f7b4bA3484ab1Afb965042029d5fa() {
        JSONObject dto = new JSONObject();
        // 操作人姓名
        // dto.put("user_name", "test");
        // 操作人手机号
        // dto.put("operator_phone", "test");
        // 付款方账号
        // dto.put("acct_no", "test");
        // 付款方账户名称
        // dto.put("acct_name", "test");
        // 开户行联行号
        // dto.put("bank_branch_code", "test");
        // 开户行行名
        // dto.put("bank_branch_name", "test");
        // 签约申请生效日期
        // dto.put("sign_start_date", "test");
        // 签约申请失效日期
        // dto.put("sign_end_date", "test");
        // 机构编码
        // dto.put("org_code", "test");
        // 付款方账户类型
        // dto.put("acct_type", "");
        // 附言
        // dto.put("remark", "");

        return dto;
    }

    private static JSON getCe923151972f4d15A8a97d43a846a1c7() {
        JSONObject dto = new JSONObject();
        // 账户类型
        // dto.put("acct_type", "test");
        // 银行账户信息当账户类型为银行账户时必填
        // dto.put("jxf_bank_info", get436f7b4bA3484ab1Afb965042029d5fa());

        return dto;
    }

    private static JSON get93ced9809dc34be28cd3C45f54db4745() {
        JSONObject dto = new JSONObject();
        // 合单支付模式
        // dto.put("merge_pay_mode", "test");

        return dto;
    }

    private static JSON get09ce87e146ac4f9dBdddAea2114bb47a() {
        JSONObject dto = new JSONObject();
        // 合单支付开关
        // dto.put("merge_pay_flag", "test");
        // 合单支付配置合单支付配置 （当合单支付开关为开时必填）
        // dto.put("merge_pay_config", get93ced9809dc34be28cd3C45f54db4745());

        return dto;
    }

}
