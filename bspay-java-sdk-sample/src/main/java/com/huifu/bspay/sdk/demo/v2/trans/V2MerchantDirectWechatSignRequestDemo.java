package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantDirectWechatSignRequest;

/**
 * 微信特约商户进件 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantDirectWechatSignRequest.class)
public class V2MerchantDirectWechatSignRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantDirectWechatSignRequest request = new V2MerchantDirectWechatSignRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户汇付Id
        request.setHuifuId("6666000003134509");
        // 渠道商汇付Id
        request.setUpperHuifuId("6666000003134508");
        // 开发者的应用ID
        request.setAppId("20200506780602902");
        // 商户号
        request.setMchId("748851385");
        // 经营者/法人是否为受益人
        request.setOwner("Y");
        // 超级管理员信息
        request.setContactInfo(getContactInfo());
        // 经营场景类型
        request.setSalesScenesType("SALES_SCENES_STORE,SALES_SCENES_MP,SALES_SCENES_MINI_PROGRAM,SALES_SCENES_WEB,SALES_SCENES_APP,SALES_SCENES_WEWORK");
        // 经营场景
        request.setSalesInfo(getSalesInfo());
        // 结算信息
        request.setSettlementInfo(getSettlementInfo());

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
        // 服务商微信公众号APPID对应密钥
        extendInfoMap.put("wx_woa_secret", "1234567890");
        // 公司类型
        extendInfoMap.put("ent_type", "2");
        // 登记证书
        extendInfoMap.put("certificate_info", getCertificateInfo());
        // 最终受益人信息
        extendInfoMap.put("ubo_info", getUboInfo());
        // 银行账户信息
        extendInfoMap.put("bank_account_info", getBankAccountInfo());
        // 补充说明
        extendInfoMap.put("business_addition_msg", "补充说明");
        // 文件列表
        extendInfoMap.put("file_list", getFileList());
        return extendInfoMap;
    }

    private static String getSettlementInfo() {
        JSONObject dto = new JSONObject();
        // 入驻结算规则ID
        dto.put("settlement_id", "716");
        // 所属行业
        dto.put("qualification_type", "餐饮");
        // 文件列表
        dto.put("file_list", getFileList());
        // 优惠费率活动ID
        dto.put("activities_id", "20191030111cff5b5e");
        // 优惠费率活动值
        dto.put("activities_rate", "0.60");

        return dto.toJSONString();
    }

    private static String getBankAccountInfo() {
        JSONObject dto = new JSONObject();
        // 账户类型
        dto.put("bank_account_type", "BANK_ACCOUNT_TYPE_CORPORATE");
        // 开户名称
        dto.put("account_name", "门店名称");
        // 开户银行
        dto.put("account_bank", "中国农业银行");
        // 开户银行省市编码
        dto.put("bank_address_code", "01030000");
        // 开户银行联行号1、17家直连银行无需填写，如为其他银行，则开户银行全称（含支行）和开户银行联行号二选一。&lt;br/&gt;2、详细参见[开户银行全称（含支行）对照表](https://pay.weixin.qq.com/wiki/doc/apiv3/terms_definition/chapter1_1_3.shtml#part-6)。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：102100020270&lt;/font&gt;
        dto.put("bank_branch_id", "102110001296");
        // 开户银行全称（含支行)1、17家直连银行无需填写，如为其他银行，则开户银行全称（含支行）和 开户银行联行号二选一。&lt;br/&gt;2、需填写银行全称，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：中国工商银行北京海运仓支行&lt;/font&gt;，详细参见[开户银行全称（含支行）对照表](https://pay.weixin.qq.com/wiki/doc/apiv3/terms_definition/chapter1_1_3.shtml#part-6)。
        dto.put("bank_name", "102110001296");
        // 银行账号
        dto.put("account_number", "102110001296");

        return dto.toJSONString();
    }

    private static String getFileList() {
        JSONObject dto = new JSONObject();
        // 文件类型
        dto.put("file_type", "F85");
        // 文件jfileID
        dto.put("file_id", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 文件名称
        dto.put("file_name", "微信直连额外补充材料一");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getCertificateInfo() {
        JSONObject dto = new JSONObject();
        // 登记证书类型
        dto.put("cert_type", "所有场景类型");
        // 证书号
        dto.put("cert_no", "证书号");
        // 证书商户名称
        dto.put("cert_mer_name", "证书商户名称");
        // 注册地址
        dto.put("reg_detail", "注册地址");
        // 法人姓名
        dto.put("legal_name", "法人姓名");
        // 证书有效期类型
        dto.put("cert_validity_type", "1");
        // 证书有效期开始日期
        dto.put("cert_begin_date", "20200420");
        // 文件列表
        // dto.put("file_list", getFileList());
        // 证书有效期截止日期
        dto.put("cert_end_date", "20400420");

        return dto.toJSONString();
    }

    private static String getSalesInfo() {
        JSONObject dto = new JSONObject();
        // 服务商公众号APPID公众号场景必传(与mp_sub_appid二选一) 。可填写当前服务商商户号已绑定的公众号APPID。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx5934540532 &lt;/font&gt;
        dto.put("mp_appid", "服务商公众号APPID");
        // 商家公众号APPID公众号场景必传(与mp_appid二选一)。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx5934540532 &lt;/font&gt; &lt;br/&gt;1、可填写与商家主体一致且已认证的公众号APPID，需是 已认证的服务号、政府或媒体类型的订阅号。&lt;br/&gt;2、审核通过后，系统将发起特约商家商户号与该AppID的 绑定（即配置为sub_appid），服务商随后可在发起支付时 选择传入该appid，以完成支付，并获取sub_openid用于数 据统计，营销等业务场景 。
        dto.put("mp_sub_appid", "商家公众号APPID");
        // 服务商小程序APPID小程序场景必传(与mmini_program_sub_appid二选一)。 可填写当前服务商商户号已绑定的小程序APPID。&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx852a790f100000fe&lt;/font&gt;
        dto.put("mini_program_appid", "服务商小程序APPID");
        // 商家小程序APPID小程序场景必传(与mini_program_appid二选一)，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx852a790f100000fe&lt;/font&gt; &lt;br/&gt;1、可填写与商家主体一致且已认证的小程序APPID，需是 已认证的小程序。&lt;br/&gt; 2、审核通过后，系统将发起特约商家商户号与该AppID的 绑定（即配置为sub_appid），服务商随后可在发起支付时 选择传入该appid，以完成支付，并获取sub_openid用于数 据统计，营销等业务场景。
        dto.put("mini_program_sub_appid", "商家小程序APPID");
        // 服务商应用APPIDAPP场景必传(与 app_sub_appid 二选一)。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx852a790f100000fe&lt;/font&gt;&lt;br/&gt; 可填写当前服务商商户号已绑定的应用APPID。
        dto.put("app_appid", "服务商应用APPID");
        // 商家应用APPIDAPP场景必传(与app_appid二选一);&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx852a790f100000fe&lt;/font&gt; &lt;br/&gt;1、可填写与商家主体一致且已认证的应用APPID，需是已 认证的APP。 &lt;br/&gt;2、审核通过后，系统将发起特约商家商户号与该AppID的 绑定（即配置为sub_appid），服务商随后可在发起支付时 选择传入该appid，以完成支付，并获取sub_openid用于数 据统计，营销等业务场景。
        dto.put("app_sub_appid", "商家应用APPID");
        // 文件列表
        dto.put("file_list", getFileList());
        // 门店名称
        dto.put("biz_store_name", "门店名称");
        // 门店省市编码
        dto.put("biz_address_code", "门店省市编码");
        // 门店地址
        dto.put("biz_store_address", "门店地址");
        // 线下场所对应的商家APPID
        dto.put("biz_sub_appid", "线下场所对应的商家APPID");
        // 互联网网站域名
        dto.put("domain", "互联网网站域名");
        // 互联网网站对应的商家APPID
        dto.put("web_appid", "互联网网站对应的商家APPID");
        // 商家企业微信CorpID
        dto.put("sub_corp_id", "商家企业微信CorpID");

        return dto.toJSONString();
    }

    private static String getContactInfo() {
        JSONObject dto = new JSONObject();
        // 超级管理员姓名
        dto.put("contact_name", "超级管理员姓名7586");
        // 超级管理员证件号码&lt;font color&#x3D;&quot;green&quot;&gt;示例值：320926198512025834&lt;/font&gt;&lt;br/&gt;1、“超级管理员证件号码”与“超级管理员微信openid”，二选一必填。&lt;br/&gt;2、超级管理员签约时，校验微信号绑定的银行卡实名信息，是否与该证件号码一致。&lt;br/&gt;3、可传身份证、来往内地通行证、来往大陆通行证、护照等证件号码。
        dto.put("contact_cert_no", "530102198206242725");
        // 超级管理员微信openid&lt;font color&#x3D;&quot;green&quot;&gt;示例值：oGhiSxIAPtEnPfe9Xo000000A&lt;/font&gt;&lt;br/&gt;1、“超级管理员身份证件号码”与“超级管理员微信openid”，二选一必填。&lt;br/&gt;2、超级管理员签约时，校验微信号是否与该微信openid一致。
        dto.put("openid", "openid");
        // 超级管理员手机号
        dto.put("contact_mobile_no", "13778851762");
        // 超级管理员电子邮箱
        dto.put("contact_email", "89007865@qq.com");
        // 超级管理员证件类型
        dto.put("cert_type", "00");

        return dto.toJSONString();
    }

    private static String getUboInfo() {
        JSONObject dto = new JSONObject();
        // 证件类型
        dto.put("cert_type", "00");
        // 证件号码
        dto.put("cert_no", "530102198206242725");
        // 姓名
        dto.put("name", "姓名");
        // 证件有效类型
        dto.put("cert_validity_type", "1");
        // 证件有效期开始日期
        dto.put("cert_begin_date", "20200420");
        // 文件列表
        dto.put("file_list", getFileList());
        // 证件有效期截止日期
        dto.put("cert_end_date", "20400420");

        return dto.toJSONString();
    }

}
