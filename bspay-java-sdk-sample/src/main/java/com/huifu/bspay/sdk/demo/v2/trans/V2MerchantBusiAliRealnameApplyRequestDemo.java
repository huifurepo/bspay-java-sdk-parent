package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBusiAliRealnameApplyRequest;

/**
 * 支付宝实名申请提交 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantBusiAliRealnameApplyRequest.class)
public class V2MerchantBusiAliRealnameApplyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBusiAliRealnameApplyRequest request = new V2MerchantBusiAliRealnameApplyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付ID
        request.setHuifuId("6666000105418240");
        // 主体信息
        request.setAuthIdentityInfo(getAuthIdentityInfo());
        // 联系人信息
        request.setContactPersonInfo(getContactPersonInfo());

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
        // 子渠道号
        extendInfoMap.put("pay_channel_id", "10000001");
        // 业务开通类型
        extendInfoMap.put("pay_scene", "1");
        // 法人身份信息
        extendInfoMap.put("legal_person_info", getLegalPersonInfo());
        // 受益人信息
        extendInfoMap.put("ubo_info", getUboInfo());
        return extendInfoMap;
    }

    private static String getCertificateInfo() {
        JSONObject dto = new JSONObject();
        // 登记证书类型**证照类型为登记证书时(certificate_type&#x3D;REGISTER_CERT)必填**。枚举：&lt;br/&gt;统一社会信用代码证书(CERTIFICATE_TYPE_2389)&lt;br/&gt;慈善组织公开募捐资格证书(CERTIFICATE_TYPE_2397)&lt;br/&gt;社会团体法人登记证书(CERTIFICATE_TYPE_2394)&lt;br/&gt;民办非企业单位登记证书(CERTIFICATE_TYPE_2395)&lt;br/&gt;基金会法人登记证书(CERTIFICATE_TYPE_2396)&lt;br/&gt;农民专业合作社法人营业执照(CERTIFICATE_TYPE_2398)&lt;br/&gt;宗教活动场所登记证(CERTIFICATE_TYPE_2399)&lt;br/&gt;其他证书/批文/证明(CERTIFICATE_TYPE_2400)&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：CERTIFICATE_TYPE_2389&lt;/font&gt;
        dto.put("cert_type", "CERTIFICATE_TYPE_2389");
        // 证照编号
        dto.put("cert_number", "9111000071093465XC");
        // 证照图片
        dto.put("cert_copy", "afce08c5-1548-30f8-bf70-1752c3012f66");
        // 证照商户名称
        dto.put("cert_merchant_name", "新新饭店");
        // 证照法人姓名
        dto.put("cert_legal_person", "李四");
        // 证照注册地址
        dto.put("cert_company_address", "浙江省杭州市西湖区1街道10号");
        // 证照生效时间
        dto.put("effect_time", "19990101");
        // 证照过期时间
        dto.put("expire_time", "长期");

        return dto.toJSONString();
    }

    private static String getSupportCredentials() {
        JSONObject dto = new JSONObject();
        // 小微经营类型
        dto.put("micro_biz_type", "MICRO_TYPE_STORE");
        // 门店名称
        dto.put("store_name", "张三");
        // 门店省市编码
        dto.put("province_code", "310000");
        // 门店省份
        dto.put("province", "上海");
        // 门店市行政区号
        dto.put("city_code", "310100");
        // 门店城市
        dto.put("city", "上海市");
        // 门店街道区号
        dto.put("district_code", "310107");
        // 门店街道
        dto.put("district", "普陀区");
        // 门店场所填写门店详细地址
        dto.put("store_address", "消息路");
        // 门店门头照信息或摊位照
        dto.put("store_door_img", "afce08c5-1548-30f8-bf70-1752c3012f66");
        // 门店店内照片或者摊位照侧面
        dto.put("store_inner_img", "51dd13bb-6268-36d0-ac84-c4cdc19eccba");

        return dto.toJSONString();
    }

    private static String getQualificationInfoList() {
        JSONObject dto = new JSONObject();
        // 行业类目id
        dto.put("mcc_code", "2015050700000000");
        // 行业经营许可证资质照片
        dto.put("image_list", "a5d373f6-3e79-405f-9993-fb7ea051c372");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getAuthIdentityInfo() {
        JSONObject dto = new JSONObject();
        // 主体类型
        dto.put("business_type", "2");
        // 是否金融机构
        dto.put("finance_institution_flag", "N");
        // 金融机构类型
        dto.put("financial_type", "INST");
        // 金融机构许可证图片
        dto.put("finance_license_pics", "a5d373f6-3e79-405f-9993-fb7ea051c372");
        // 证照类型
        dto.put("certificate_type", "BUSINESS_CERT");
        // 登记证书信息
        dto.put("certificate_info", getCertificateInfo());
        // 单位证明函照片
        dto.put("company_prove_copy", "71da066c-5d15-3658-a86d-4e85ee67808a");
        // 辅助证明材料信息
        dto.put("support_credentials", getSupportCredentials());
        // 经营许可证
        dto.put("qualification_info_list", getQualificationInfoList());

        return dto.toJSONString();
    }

    private static String getLegalPersonInfo() {
        JSONObject dto = new JSONObject();
        // 证件持有人类型
        dto.put("legal_type", "SUPER");
        // 证件类型
        dto.put("card_type", "00");
        // 法人姓名
        dto.put("person_name", "李四");
        // 证件号码
        dto.put("card_no", "110101199909291419");
        // 证件生效时间
        dto.put("effect_time", "19990101");
        // 证件过期时间
        dto.put("expire_time", "长期");
        // 证件人像面
        dto.put("card_front_img", "afce08c5-1548-30f8-bf70-1752c3012f66");
        // 证件国徽面
        dto.put("card_back_img", "51dd13bb-6268-36d0-ac84-c4cdc19eccba");
        // 授权函照片
        dto.put("auth_letter_img", "51dd13bb-6268-36d0-ac84-c4cdc19eccba");
        // 是否为受益人
        dto.put("is_benefit_person", "N");

        return dto.toJSONString();
    }

    private static String getContactPersonInfo() {
        JSONObject dto = new JSONObject();
        // 联系人身份证号码
        dto.put("id_card_number", "120103198507275017");
        // 联系人姓名
        dto.put("name", "谢季");
        // 联系人手机号
        dto.put("mobile", "18900400032");

        return dto.toJSONString();
    }

    private static String getUboInfo() {
        JSONObject dto = new JSONObject();
        // 证件姓名
        dto.put("ubo_id_doc_name", "消化");
        // 证件类型
        dto.put("ubo_id_doc_type", "00");
        // 证件号码
        dto.put("ubo_id_doc_number", "110101199909291419");
        // 证件有效期开始时间
        dto.put("ubo_period_begin", "19990101");
        // 证件有效期结束时间
        dto.put("ubo_period_end", "20260606");
        // 证件人像面
        dto.put("ubo_id_doc_copy", "afce08c5-1548-30f8-bf70-1752c3012f66");
        // 证件国徽面
        dto.put("ubo_id_doc_copy_back", "51dd13bb-6268-36d0-ac84-c4cdc19eccba");

        return dto.toJSONString();
    }

}
