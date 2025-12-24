package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2FlexibleEntRequest;

/**
 * 灵工企业商户进件接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2FlexibleEntRequest.class)
public class V2FlexibleEntRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2FlexibleEntRequest request = new V2FlexibleEntRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 渠道商号
        request.setUpperHuifuId("6666000108406684");
        // 商户角色
        // request.setMerRole("test");
        // 落地公司类型当选择落地公司时，必填;SELF-自有，COOPERATE-合作
        // request.setLocalCompanyType("test");
        // 商户名称
        request.setRegName("圆务铁白事");
        // 商户简称
        request.setShortName("沈桂英");
        // 证照图片
        request.setLicensePic("f6fc539b-73ff-3645-8539-ad318971cc48");
        // 证照编号
        request.setLicenseCode("91440101MA20250618");
        // 证照有效期类型
        request.setLicenseValidityType("1");
        // 证照有效期开始日期
        request.setLicenseBeginDate("20240314");
        // 证照有效期截止日期格式：yyyyMMdd。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;  当license_validity_type&#x3D;0时必填；当license_validity_type&#x3D;1时为空；
        request.setLicenseEndDate("");
        // 成立时间
        request.setFoundDate("20240314");
        // 注册区
        request.setRegDistrictId("310104");
        // 注册详细地址
        request.setRegDetail("方立全气气目队得形");
        // 法人姓名
        request.setLegalName("天天优先");
        // 法人证件类型
        request.setLegalCertType("00");
        // 法人证件号码
        request.setLegalCertNo("110101199003072551");
        // 法人证件有效期类型
        request.setLegalCertValidityType("1");
        // 法人证件有效期开始日期
        request.setLegalCertBeginDate("19710718");
        // 法人证件有效期截止日期日期格式：yyyyMMdd， &lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;当legal_cert_validity_type&#x3D;0时必填；&lt;br/&gt;当legal_cert_validity_type&#x3D;1时为空；&lt;br/&gt;
        request.setLegalCertEndDate("");
        // 法人证件地址
        request.setLegalAddr("信约候再研情其常");
        // 法人身份证国徽面
        request.setLegalCertBackPic("f6fc539b-73ff-3645-8539-ad318971cc48");
        // 法人身份证人像面
        request.setLegalCertFrontPic("f6fc539b-73ff-3645-8539-ad318971cc48");
        // 店铺门头照
        request.setStoreHeaderPic("f6fc539b-73ff-3645-8539-ad318971cc48");
        // 联系人手机号
        request.setContactMobileNo("13074561767");
        // 联系人电子邮箱
        request.setContactEmail("c.vwpjkqx@urgr.be");
        // 管理员账号
        request.setLoginName("req2025061853130071");
        // 银行卡信息配置
        request.setCardInfo(getCff4727cC05a40fcA9b602e2f00fedaa());
        // 签约人jsonObject格式；协议类型&#x3D;电子合同时，必填；
        // request.setSignUserInfo(getF32bb9080f5f4bee9931109c8b31f8ec());

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
        // 商户通知标识
        extendInfoMap.put("sms_send_flag", "1");
        // 证照类型
        extendInfoMap.put("license_type", "NATIONAL_LEGAL_MERGE");
        // 注册省
        extendInfoMap.put("reg_prov_id", "310000");
        // 注册市
        extendInfoMap.put("reg_area_id", "310100");
        // 法人手机号
        extendInfoMap.put("legal_mobile_no", "13074561767");
        // 联系人姓名
        extendInfoMap.put("contact_name", "文超");
        // 取现业务配置
        // extendInfoMap.put("cash_config", get82680182D37042b7Ab797c407741c176());
        // 大额支付配置
        // extendInfoMap.put("large_amt_pay_config", get0c99d8834baf4f3792a7A78c13417cec());
        // 是否开通网银充值
        // extendInfoMap.put("online_recharge_flag", "");
        // 线上费率配置
        // extendInfoMap.put("online_fee_conf_list", getE90021b991164973820f25f5e7975a43());
        // 线上手续费承担方配置
        // extendInfoMap.put("online_pay_fee_conf_list", get0782b7d7Cd794386B2dd9b29b024cbf2());
        // 灵工支付配置
        // extendInfoMap.put("flexible_pay_config", getCa56ed7d7f644d34B6a3D2f7defd468a());
        // 协议类型
        // extendInfoMap.put("agreement_type", "");
        // 电子协议异步通知地址
        // extendInfoMap.put("agreement_async_return_url", "");
        // 异步请求地址
        // extendInfoMap.put("async_return_url", "");
        // 业务开通结果异步消息接收地址
        // extendInfoMap.put("busi_async_return_url", "");
        // 扩展资料包
        // extendInfoMap.put("extended_material_list", get1470e580Dd1447238c4d648a5b9df5a2());
        return extendInfoMap;
    }

    private static String getCff4727cC05a40fcA9b602e2f00fedaa() {
        JSONObject dto = new JSONObject();
        // 银行账户名
        dto.put("card_name", "圆务铁白事");
        // 银行账号
        dto.put("card_no", "6222021287358404424");
        // 银行所在市
        dto.put("area_id", "310100");
        // 银行编码
        dto.put("bank_code", "01050000");
        // 联行号
        dto.put("branch_code", "105290071050");
        // 银行所在省
        dto.put("prov_id", "310000");

        return dto.toJSONString();
    }

    private static String get82680182D37042b7Ab797c407741c176() {
        JSONObject dto = new JSONObject();
        // 取现手续费（固定/元）fix_amt与fee_rate至少填写一项， 需保留小数点后两位，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;注：当cash_type&#x3D;D1时为节假日取现手续费；当cash_type&#x3D;T1时为工作日取现手续费
        // dto.put("fix_amt", "test");
        // 取现手续费率（%）fix_amt与fee_rate至少填写一项，需保留小数点后两位，取值范围[0.00,100.00]，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;注：1、如果fix_amt与fee_rate都填写了则手续费&#x3D;fix_amt+支付金额\*fee_rate2、当cash_type&#x3D;D1时为节假日取现手续费；当cash_type&#x3D;T1时为工作日取现手续费
        // dto.put("fee_rate", "test");
        // D1工作日取现手续费固定金额单位元，需保留小数点后两位。不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;cash_type&#x3D;T1时，不生效 ；cash_type取现类型为D1时，遇工作日按此费率结算，若未配置则默认按照节假日手续费计算
        // dto.put("weekday_fix_amt", "test");
        // D1工作日取现手续费率单位%，需保留小数点后两位。取值范围[0.00，100.00]，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;cash_type&#x3D;T1时，不生效 ；cash_type取现类型为D1时，遇工作日按此费率结算 ，若未配置则默认按照节假日手续费计算
        // dto.put("weekday_fee_rate", "test");
        // 手续费承担方手续费外扣时必需指定手续费承担方ID ；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123&lt;/font&gt;
        // dto.put("out_fee_huifu_id", "test");
        // 取现类型
        // dto.put("cash_type", "");
        // 是否取现手续费外扣
        // dto.put("out_fee_flag", "");
        // 手续费外扣的账户类型
        // dto.put("out_fee_acct_type", "");
        // 是否优先到账
        // dto.put("is_priority_receipt", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static JSON get5fcdf21dF035449393d0A1078791a92f() {
        JSONObject dto = new JSONObject();
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

    private static String get0c99d8834baf4f3792a7A78c13417cec() {
        JSONObject dto = new JSONObject();
        // 大额支付配置列表
        // dto.put("large_amt_pay_config_info_list", get5fcdf21dF035449393d0A1078791a92f());
        // 交易手续费外扣huifuId交易手续费外扣时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000108854952&lt;/font&gt;
        // dto.put("out_fee_huifu_id", "test");
        // 交易手续费外扣账户号交易手续费外扣时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：F00598602&lt;/font&gt;
        // dto.put("out_fee_acct_id", "test");
        // 交易手续费外扣标记
        // dto.put("out_fee_flag", "");

        return dto.toJSONString();
    }

    private static String getE90021b991164973820f25f5e7975a43() {
        JSONObject dto = new JSONObject();
        // 银行编码
        // dto.put("bank_id", "test");
        // 功能开关状态
        // dto.put("stat_flag", "test");
        // 借贷标志
        // dto.put("dc_flag", "test");
        // 银行名称
        // dto.put("bank_name", "");
        // 银行中文简称
        // dto.put("bank_short_chn", "");
        // 手续费（固定/元）
        // dto.put("fix_amt", "");
        // 费率（%）
        // dto.put("fee_rate", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get0782b7d7Cd794386B2dd9b29b024cbf2() {
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

    private static String getCa56ed7d7f644d34B6a3D2f7defd468a() {
        JSONObject dto = new JSONObject();
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "test");
        // 手续费(%)
        // dto.put("fee_rate", "");
        // 手续费（固定/元）
        // dto.put("fix_amt", "");
        // 外扣规则
        // dto.put("out_charge_mode", "");
        // 手续费外扣时的账户ID
        // dto.put("out_fee_acct_id", "");
        // 手续费外扣汇付ID
        // dto.put("out_fee_huifu_id", "");

        return dto.toJSONString();
    }

    private static String getF32bb9080f5f4bee9931109c8b31f8ec() {
        JSONObject dto = new JSONObject();
        // 签约人类型协议类型&#x3D;电子合同时，必填。LEGAL-法人、CONTACT-联系人。商户角色&#x3D;落地公司，则仅支持法人。&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：LEGAL&lt;/font&gt;
        // dto.put("type", "test");
        // 姓名签约人类型&#x3D;联系人（经办人），必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：张三&lt;/font&gt;
        // dto.put("name", "test");
        // 身份证签约人类型&#x3D;联系人（经办人），必填 ；注意：**签约人会做姓名+身份证+手机号验证，请正确填写**；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：320946195712025082&lt;/font&gt;
        // dto.put("cert_no", "test");
        // 手机号电子合同且签约人类型&#x3D;法人 ，必填；注意：**签约人会做姓名+身份证+手机号验证，请正确填写**；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：13917463536&lt;/font&gt;
        // dto.put("mobile_no", "test");

        return dto.toJSONString();
    }

    private static String get1470e580Dd1447238c4d648a5b9df5a2() {
        JSONObject dto = new JSONObject();
        // 文件id
        // dto.put("file_id", "test");
        // 文件类型
        // dto.put("file_type", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
