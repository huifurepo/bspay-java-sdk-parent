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
        // *线上业务类型编码*开通快捷、网银、余额支付Pro版、分账必填；参见[线上业务类型编码及补充材料说明](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/kyc/KYC-%E7%BA%BF%E4%B8%8A%E4%B8%9A%E5%8A%A1%E7%B1%BB%E5%9E%8B%E7%BC%96%E7%A0%81%E5%8F%8A%E8%A1%A5%E5%85%85%E6%9D%90%E6%96%99%E8%AF%B4%E6%98%8E.xlsx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：H7999AL&lt;/font&gt;
        // request.setOnlineBusiType("test");
        // 签约人jsonObject字符串；agreement_info中选择电子签约时必填；个人商户填本人信息。
        // request.setSignUserInfo(get187580919021488aA758B8c20fb53591());

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
        extendInfoMap.put("short_name", "");
        // *协议信息实体*
        extendInfoMap.put("agreement_info", get74ee991957e9499d88b9Ac9fcebe7d71());
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
        // extendInfoMap.put("online_fee_conf_list", getE1007168Ffae4a84A3b03e4569a4ebdd());
        // 支付宝配置对象
        extendInfoMap.put("ali_conf_list", get11bbc9f47940462e8bfd2ad3aa61213e());
        // 微信配置对象
        extendInfoMap.put("wx_conf_list", get107a8c79B20540f9AedeBc2b0d4164a0());
        // 银联二维码配置对象
        extendInfoMap.put("union_conf_list", getE0b1cc7c4b154b6590beB87cc777f3af());
        // 银行卡支付配置信息
        extendInfoMap.put("bank_card_conf", getB6a81252A7374f0eB8deF97722e5dec7());
        // *余额支付配置对象*
        extendInfoMap.put("balance_pay_config", getF07ab1ccDc104597B2b2618f1b4404ab());
        // 补贴支付
        extendInfoMap.put("combine_pay_config", get78004ac117f44fefA892C9677557d229());
        // 线上手续费承担方配置
        // extendInfoMap.put("online_pay_fee_conf_list", get731d279e9d5148e593a8B6c549e84ec8());
        // 全域资金管理配置(华通银行)
        // extendInfoMap.put("out_order_funds_config", get1fa2aecc35284d499a1370a13302936f());
        // 汇总结算配置实体
        // extendInfoMap.put("collection_settle_config_list", get73a5b9f3662948f69c28408f91a5247e());
        // 异步消息接收地址
        extendInfoMap.put("async_return_url", "http://www.baidu55.com");
        // 业务开通结果异步消息接收地址
        extendInfoMap.put("busi_async_return_url", "");
        // 交易异步应答地址
        extendInfoMap.put("recon_resp_addr", "http://192.168.85.157:30031/sspm/testVirgo");
        // *运营媒介*
        // extendInfoMap.put("online_media_info_list", getA834bc5178da40f9A46e6b597822df2a());
        // *补充文件信息*
        // extendInfoMap.put("extended_material_list", get868f522a72244de388f6F85a86dca86c());
        // 商户开通强制延迟标记
        // extendInfoMap.put("forced_delay_flag", "");
        // 微信直连配置对象
        // extendInfoMap.put("wx_zl_conf", get2b0d76d33e3241b7B50fE685fb1af201());
        // 支付宝直连配置对象
        // extendInfoMap.put("ali_zl_conf", get34483c754d25401c92b35e4cc86c3992());
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
        // 分账配置信息
        // extendInfoMap.put("split_conf_info", get7b49a3e2C6a0471cB83f833b1c529f4b());
        // 银联线上收银台
        // extendInfoMap.put("uni_app_payment_config", get2494ca6295f04846B7b9Dc2148370959());
        // 资金归集开通标记
        // extendInfoMap.put("fund_collection_flag", "");
        // 代发配置
        // extendInfoMap.put("surrogate_config_list", get4c76384934614a989d97Ce4da6217514());
        // 大额支付配置
        // extendInfoMap.put("large_amt_pay_config", get0639fe517b5b451eB7350c76386647c5());
        // 托管支付开关
        // extendInfoMap.put("half_pay_host_flag", "");
        // 代发复核配置
        // extendInfoMap.put("agent_recheck_config", get1cc371641cb54a39Bc556e9132e2aeb5());
        // 商户开通网银充值开关
        // extendInfoMap.put("online_recharge_flag", "");
        // 是否开通垫资退款
        // extendInfoMap.put("refund_mend_open_flag", "");
        // 捷行付配置
        // extendInfoMap.put("jxf_conf_info", get66d0cfc0A82248e69b3835a3f1acb615());
        return extendInfoMap;
    }

    private static String get74ee991957e9499d88b9Ac9fcebe7d71() {
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

    private static String getE1007168Ffae4a84A3b03e4569a4ebdd() {
        JSONObject dto = new JSONObject();
        // 业务类型
        // dto.put("fee_type", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get57f62b4f8fc343e987b265b9d3f8d745() {
        JSONObject dto = new JSONObject();
        // 联系人身份证号码
        // dto.put("id_card_number", "test");
        // 联系人姓名
        // dto.put("name", "");
        // 联系人手机号
        // dto.put("mobile", "");

        return dto.toJSONString();
    }

    private static String get4968f95cBda747e184ff1c3b277642bd() {
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

    private static String getD73e8dc4Aedc4149Be9d927e6a7c461c() {
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
        // dto.put("contact_person_info", get57f62b4f8fc343e987b265b9d3f8d745());
        // 法人身份信息
        // dto.put("legal_person_info", get4968f95cBda747e184ff1c3b277642bd());

        return dto.toJSONString();
    }

    private static String get11bbc9f47940462e8bfd2ad3aa61213e() {
        JSONObject dto = new JSONObject();
        // 手续费（%）
        dto.put("fee_rate", "3.15");
        // 支付场景
        dto.put("pay_scene", "1");
        // *功能开关*
        // dto.put("switch_state", "test");
        // 最低收取手续费（元）
        // dto.put("fee_min_amt", "");
        // 商户经营类目
        dto.put("mcc", "2016062900190337");
        // 子渠道号
        dto.put("pay_channel_id", "10000001");
        // 是否需要实名认证
        // dto.put("is_check_real_name", "");
        // 实名认证信息
        // dto.put("al_real_name_info", getD73e8dc4Aedc4149Be9d927e6a7c461c());

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static JSON get97e724940241457fB26790037624e929() {
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

    private static String get107a8c79B20540f9AedeBc2b0d4164a0() {
        JSONObject dto = new JSONObject();
        // 开关状态
        // dto.put("switch_state", "test");
        // 手续费（%）
        dto.put("fee_rate", "2.15");
        // 支付场景
        dto.put("pay_scene", "10");
        // 最低收取手续费（元）
        // dto.put("fee_min_amt", "");
        // 费率规则ID
        dto.put("fee_rule_id", "765");
        // 子渠道号
        dto.put("pay_channel_id", "JP00001");
        // 申请服务
        dto.put("service_codes", "");
        // 是否需要实名认证
        // dto.put("is_check_real_name", "");
        // 实名认证信息
        // dto.put("wx_real_name_info", get97e724940241457fB26790037624e929());

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getE0b1cc7c4b154b6590beB87cc777f3af() {
        JSONObject dto = new JSONObject();
        // 借记卡手续费（%）
        // dto.put("debit_fee_rate", "test");
        // 贷记卡手续费1000以上（%）
        dto.put("credit_fee_rate_up", "6.566");
        // 贷记卡手续费1000及以下（%）
        dto.put("credit_fee_rate_down", "1");
        // 银行业务手续费类型
        dto.put("charge_cate_code", "");
        // 功能开关
        // dto.put("switch_state", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getB6a81252A7374f0eB8deF97722e5dec7() {
        JSONObject dto = new JSONObject();
        // 借记卡手续费（%）
        dto.put("debit_fee_rate", "3");
        // 贷记卡手续费（%）
        dto.put("credit_fee_rate", "6");
        // 银行业务手续费类型
        dto.put("charge_cate_code", "02");
        // 借记卡封顶值
        dto.put("debit_fee_limit", "5");
        // 是否开通小额双免
        dto.put("is_open_small_flag", "0");
        // 小额双免单笔限额(元)
        dto.put("small_free_amt", "500");
        // 小额双免手续费（%）
        dto.put("small_fee_amt", "1");
        // 功能开关
        // dto.put("switch_state", "");
        // 云闪付开通状态
        // dto.put("is_open_cloud_flag", "");

        return dto.toJSONString();
    }

    private static JSON get7d0a0c2104ad41fb9a0a9110216da0a5() {
        JSONObject dto = new JSONObject();
        // *业务模式说明*请详细说明商户的业务模式，包括不限于（业务参与方、各方的权利及义务关系等）。最大500个汉字，必填&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：商户向企业采购产品，并将其展示在其电商平台上，用户注册后购买其产品，产品主要有家电、服饰、鞋帽等，用户购买产品的资金作为商户所得，商户根据订单情况进行物流配送。&lt;/font&gt;
        // dto.put("busi_instruction", "test");
        // *资金流向说明*请详细说明商户的资金流向，包括但不限于（交易所涉及的各方账户、资金流入流出过程等）。最大500个汉字，必填&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：用户选购产品后根据订单支付给商户，商户根据结算周期，结算到对公账户。&lt;/font&gt;
        // dto.put("capital_instruction", "test");
        // *功能开通用途说明*请详述所申请功能的原因、场景、涉及对象类型。最大500个汉字，必填&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：企业工资代发&lt;/font&gt;
        // dto.put("function_instruction", "test");

        return dto;
    }

    private static String getF07ab1ccDc104597B2b2618f1b4404ab() {
        JSONObject dto = new JSONObject();
        // *业务模式*
        // dto.put("balance_model", "test");
        // *业务情况说明*
        // dto.put("description_info", get7d0a0c2104ad41fb9a0a9110216da0a5());
        // 支付手续费(%)
        dto.put("fee_rate", "2");
        // 支付固定手续费(元)
        dto.put("fee_fix_amt", "1");
        // 功能开关
        dto.put("switch_state", "1");
        // 交易手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");
        // 交易手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "");
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "");
        // 扣费模式
        // dto.put("charge_mode", "");
        // 余额支付模式
        // dto.put("pay_mode", "");

        return dto.toJSONString();
    }

    private static String get78004ac117f44fefA892C9677557d229() {
        JSONObject dto = new JSONObject();
        // 功能开关
        dto.put("switch_state", "0");
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "test");
        // 交易手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "test");
        // 支付手续费(%)
        dto.put("fee_rate", "10");
        // 支付固定手续费(元)
        dto.put("fee_fix_amt", "5");
        // 交易手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");

        return dto.toJSONString();
    }

    private static String get731d279e9d5148e593a8B6c549e84ec8() {
        JSONObject dto = new JSONObject();
        // 业务类型
        // dto.put("pay_type", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static JSON getB3b9cf40Dae845e6B40d6b00f712e3ed() {
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

        return dto;
    }

    private static JSON get2cb7bbaa8307415fAb0243b0d1e96882() {
        JSONObject dto = new JSONObject();
        // 开户手续费(元)
        // dto.put("fee_fix_amt", "test");
        // 开户手续费外扣时的账户类型01-基本户，05-充值户，09-营销户，不填默认01；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：01&lt;/font&gt;&lt;br/&gt;注：fee_fix_amt：开户手续费大于0时必填
        // dto.put("out_fee_acct_type", "test");
        // 开户手续费外扣汇付ID开通手续费外扣业务时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812123&lt;/font&gt;&lt;br/&gt;注：fee_fix_amt：开户手续费大于0时必填
        // dto.put("out_fee_huifuid", "test");

        return dto;
    }

    private static String get1fa2aecc35284d499a1370a13302936f() {
        JSONObject dto = new JSONObject();
        // 功能开关
        // dto.put("switch_state", "test");
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
        // 全域资金开户使用的银行卡信息
        // dto.put("out_order_acct_card", getB3b9cf40Dae845e6B40d6b00f712e3ed());
        // 全域资金开户手续费
        // dto.put("out_order_acct_open_fees", get2cb7bbaa8307415fAb0243b0d1e96882());
        // 全域支付业务模式
        // dto.put("business_model", "");

        return dto.toJSONString();
    }

    private static String get73a5b9f3662948f69c28408f91a5247e() {
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

    private static String getA834bc5178da40f9A46e6b597822df2a() {
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

    private static String get868f522a72244de388f6F85a86dca86c() {
        JSONObject dto = new JSONObject();
        // *文件id*
        // dto.put("file_id", "test");
        // *文件类型*
        // dto.put("file_type", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get187580919021488aA758B8c20fb53591() {
        JSONObject dto = new JSONObject();
        // 签约人类型
        // dto.put("type", "test");
        // 姓名签约人类型&#x3D;其他，必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：张三&lt;/font&gt;
        // dto.put("name", "test");
        // 手机号签约人类型&#x3D;法人/其他 ，必填；注意：**签约人会做姓名+身份证+手机号验证，请正确填写**；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：13917463536&lt;/font&gt;
        // dto.put("mobile_no", "test");
        // 身份证签约人类型&#x3D;联系人/其他，必填 ；注意：**签约人会做姓名+身份证+手机号验证，请正确填写**；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：320946195712025082&lt;/font&gt;
        // dto.put("cert_no", "test");
        // 邮箱
        // dto.put("email", "");

        return dto.toJSONString();
    }

    private static JSON getD5f0f8723fab438283578aca0296e010() {
        JSONObject dto = new JSONObject();
        // 文件类型
        // dto.put("file_type", "test");
        // 文件jfileId
        // dto.put("file_id", "test");

        return dto;
    }

    private static JSON get48b234a4Fa1d4a9f9c4f265d9e5355bd() {
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
        // dto.put("contact_file_list", getD5f0f8723fab438283578aca0296e010());
        // 证件有效期类型
        // dto.put("contact_cert_validity_type", "test");
        // 证件有效期开始日期
        // dto.put("contact_cert_begin_date", "test");
        // 证件有效期截止日期
        // dto.put("contact_cert_end_date", "");

        return dto;
    }

    private static JSON get464bf629Ed84415cBb1b8a3b93fc5644() {
        JSONObject dto = new JSONObject();
        // 文件类型
        // dto.put("file_type", "test");
        // 文件jfileId
        // dto.put("file_id", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON getF4f1d1ed7b7246eaBe83A4463721f3cc() {
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
        // dto.put("cert_file_list", get464bf629Ed84415cBb1b8a3b93fc5644());
        // 证书有效期截止日期
        // dto.put("cert_end_date", "");

        return dto;
    }

    private static JSON getC590a460E7784fe2900cF95fbc33da58() {
        JSONObject dto = new JSONObject();
        // 文件类型
        // dto.put("file_type", "test");
        // 文件jfileId
        // dto.put("file_id", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON get781fc74eD246446a9b246d05766cd859() {
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
        // dto.put("ubo_file_list", getC590a460E7784fe2900cF95fbc33da58());
        // 证件有效期截止日期
        // dto.put("ubo_cert_end_date", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON get517278d3Bce045ecA304C6c2ae61261c() {
        JSONObject dto = new JSONObject();
        // 经营者/法人是否为受益人
        // dto.put("ubo_type", "test");
        // 受益人信息列表jsonArray格式,当ubo_type为Y时可不填
        // dto.put("ubo_info_list", get781fc74eD246446a9b246d05766cd859());

        return dto;
    }

    private static JSON getEd340390A5dc4478Aeb722954ac9b32e() {
        JSONObject dto = new JSONObject();
        // 文件类型
        // dto.put("file_type", "test");
        // 文件jfileId
        // dto.put("file_id", "test");

        return dto;
    }

    private static JSON getA38ecee7E4fc4e6aA18aDe7a5779daa1() {
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
        // dto.put("sales_scenes_file_list", getEd340390A5dc4478Aeb722954ac9b32e());
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

    private static JSON get991a3fb95c27485e9bea0b6050636ac2() {
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

    private static JSON getD69c18bb57a14e81B9d9889285772b04() {
        JSONObject dto = new JSONObject();
        // 文件类型
        // dto.put("file_type", "test");
        // 文件jfileId
        // dto.put("file_id", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON get9dd3d66778df4093B6c5E5dc8a82b002() {
        JSONObject dto = new JSONObject();
        // 申请服务
        // dto.put("service_code", "test");
        // 功能服务appid
        // dto.put("sub_app_id", "test");
        // 功能开关
        // dto.put("switch_state", "test");
        // 功能费率(%)
        // dto.put("fee_rate", "test");
        // 操作类型ADD-新增， UPDATE-修改， 默认新增；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：ADD&lt;/font&gt;
        // dto.put("operate_type", "test");
        // 联系人信息jsonObject字符串,新增时必填
        // dto.put("contact_info", get48b234a4Fa1d4a9f9c4f265d9e5355bd());
        // 特殊主体登记证书jsonObject字符串，商户营业执照类型为政府机关/事业单位/其他组织时，传入相应信息。新增时需填入
        // dto.put("certificate_info", getF4f1d1ed7b7246eaBe83A4463721f3cc());
        // 最终受益人信息jsonObject字符串，商户类型为企业时，微信侧必填。（如果基本信息里有的话，可以不传取 huifu_id 对应的信息）。新增时填入
        // dto.put("ubo_info", get517278d3Bce045ecA304C6c2ae61261c());
        // 经营场景jsonObject字符串，新增时填入
        // dto.put("sales_info", getA38ecee7E4fc4e6aA18aDe7a5779daa1());
        // 银行账户信息jsonObject字符串，该字段不填时，取商户在汇付系统录入的结算账号信息。新增或修改时填入，修改时必填
        // dto.put("wx_card_info", get991a3fb95c27485e9bea0b6050636ac2());
        // 补充说明信息
        // dto.put("business_addition_msg", "");
        // 补充说明文件列表
        // dto.put("addition_file_list", getD69c18bb57a14e81B9d9889285772b04());

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get2b0d76d33e3241b7B50fE685fb1af201() {
        JSONObject dto = new JSONObject();
        // 微信子商户号
        // dto.put("sub_mch_id", "test");
        // 配置集合
        // dto.put("wx_zl_pay_conf_list", get9dd3d66778df4093B6c5E5dc8a82b002());

        return dto.toJSONString();
    }

    private static JSON getE4a80e0fC4a54582B958E571bda5fe45() {
        JSONObject dto = new JSONObject();
        // 文件类型
        // dto.put("file_type", "test");
        // 文件jfileId
        // dto.put("file_id", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get34483c754d25401c92b35e4cc86c3992() {
        JSONObject dto = new JSONObject();
        // 申请类型
        // dto.put("apply_type", "test");
        // 商户支付宝账号
        // dto.put("account", "test");
        // 服务费率仅支持渠道商。平台商户调用不支持该字段服务费率（%），0.38~3之间，精确到0.01。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.06&lt;/font&gt;
        // dto.put("fee_rate", "test");
        // 文件列表
        // dto.put("file_list", getE4a80e0fC4a54582B958E571bda5fe45());
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

    private static JSON get6cd0211d1a304565B91d17a5f9101db6() {
        JSONObject dto = new JSONObject();
        // 分账比例
        // dto.put("fee_rate", "test");
        // 汇付Id
        // dto.put("huifu_id", "test");

        return dto;
    }

    private static JSON get08b0dca8141c4333911e9b84a64a681e() {
        JSONObject dto = new JSONObject();
        // *业务模式说明*
        // dto.put("busi_instruction", "test");
        // *资金流向说明*
        // dto.put("capital_instruction", "test");
        // *功能开通用途说明*
        // dto.put("function_instruction", "test");

        return dto;
    }

    private static String get7b49a3e2C6a0471cB83f833b1c529f4b() {
        JSONObject dto = new JSONObject();
        // 分账规则来源
        // dto.put("rule_origin", "test");
        // 分账开关
        // dto.put("div_flag", "test");
        // 最大分账比例%
        // dto.put("apply_ratio", "test");
        // 生效类型
        // dto.put("start_type", "test");
        // 分账模式
        // dto.put("scene", "test");
        // 分账明细
        // dto.put("acct_split_bunch_list", get6cd0211d1a304565B91d17a5f9101db6());
        // 交易手续费外扣开关
        // dto.put("out_fee_flag", "");
        // 交易手续费外扣时的账户类型
        // dto.put("out_fee_acct_type", "");
        // 交易手续费外扣汇付ID
        // dto.put("out_fee_huifuid", "");
        // 手续费%
        // dto.put("split_fee_rate", "");
        // 固定手续费
        // dto.put("per_amt", "");
        // 业务情况说明
        // dto.put("split_ext_info", get08b0dca8141c4333911e9b84a64a681e());

        return dto.toJSONString();
    }

    private static String get2494ca6295f04846B7b9Dc2148370959() {
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

    private static String get4c76384934614a989d97Ce4da6217514() {
        JSONObject dto = new JSONObject();
        // 代发业务类型
        // dto.put("surrogate_type", "test");
        // 手续费（固定/元）手续费（固定/元），保留小数点后两位；fee_formula_type为05，06时必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;
        // dto.put("fix_amt", "test");
        // 手续费（百分比/%）手续费（百分比/%），保留小数点后两位；取值范围[0.00,100.00]；fee_formula_type为01，02，03，06时必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;
        // dto.put("fee_rate", "test");
        // 代发手续费计费模式01: 百分比手续费，无封顶值或保底值&lt;br/&gt;02: 百分比手续费，有保底值&lt;br/&gt;03: 百分比手续费，有封顶值&lt;br/&gt;05: 固定手续费 &lt;br/&gt;06: 固定手续费+百分比手续费&lt;br/&gt;为空默认06 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：06&lt;/font&gt;
        // dto.put("fee_formula_type", "test");
        // 手续费封顶值（固定/元）手续费封顶值（固定/元），保留小数点后两位；fee_formula_type为03时必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：100.00&lt;/font&gt;
        // dto.put("fee_max_amt", "test");
        // 手续费保底值（固定/元）手续费保底值（固定/元），保留小数点后两位；fee_formula_type为02时必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;
        // dto.put("fee_min_amt", "test");
        // 开通状态
        // dto.put("switch_state", "");
        // 是否交手续费外扣标记
        // dto.put("out_fee_flag", "");
        // 交易手续费外扣时账户类型
        // dto.put("out_fee_acct_type", "");
        // 交易手续费外扣汇付ID
        // dto.put("out_fee_huifu_id", "");
        // 是否允许对私代发
        // dto.put("surrogate_private_flag", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static JSON get7b9227a1950d45509679Dbf44ccdce8f() {
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

    private static String get0639fe517b5b451eB7350c76386647c5() {
        JSONObject dto = new JSONObject();
        // 大额支付配置列表
        // dto.put("large_amt_pay_config_info_list", get7b9227a1950d45509679Dbf44ccdce8f());
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

    private static JSON get1cc371641cb54a39Bc556e9132e2aeb5() {
        JSONObject dto = new JSONObject();
        // 代发复核开关
        // dto.put("agent_recheck_flag", "");
        // 复核授权商户号
        // dto.put("agent_recheck_huifu_id", "");
        // 复核类型
        // dto.put("agent_recheck_type", "");

        return dto;
    }

    private static JSON get6f4040b71caa4f07BbeaE60cf76f43c1() {
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

    private static JSON get66d0cfc0A82248e69b3835a3f1acb615() {
        JSONObject dto = new JSONObject();
        // 账户类型
        // dto.put("acct_type", "test");
        // 开通状态
        // dto.put("open_flag", "test");
        // 银行账户信息当账户类型为银行账户时必填
        // dto.put("jxf_bank_info", get6f4040b71caa4f07BbeaE60cf76f43c1());

        return dto;
    }

}
