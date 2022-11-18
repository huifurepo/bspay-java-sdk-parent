package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 企业商户基本信息入驻
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBasicdataEntRequest extends BaseRequest {

    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 上级主体ID
     */
    @JSONField(name = "upper_huifu_id")
    private String upperHuifuId;
    /**
     * 商户名称
     */
    @JSONField(name = "reg_name")
    private String regName;
    /**
     * 商户简称
     */
    @JSONField(name = "short_name")
    private String shortName;
    /**
     * 公司类型
     */
    @JSONField(name = "ent_type")
    private String entType;
    /**
     * 营业执照编号
     */
    @JSONField(name = "license_code")
    private String licenseCode;
    /**
     * 营业执照有效期类型
     */
    @JSONField(name = "license_validity_type")
    private String licenseValidityType;
    /**
     * 营业执照有效期开始日期
     */
    @JSONField(name = "license_begin_date")
    private String licenseBeginDate;
    /**
     * 营业执照有效期截止日期日期格式：yyyyMMdd，以北京时间为准。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;  当license_validity_type&#x3D;0时必填  ;当license_validity_type&#x3D;1时为空；当使用总部资质时不填
     */
    @JSONField(name = "license_end_date")
    private String licenseEndDate;
    /**
     * 注册省
     */
    @JSONField(name = "reg_prov_id")
    private String regProvId;
    /**
     * 注册市
     */
    @JSONField(name = "reg_area_id")
    private String regAreaId;
    /**
     * 注册区
     */
    @JSONField(name = "reg_district_id")
    private String regDistrictId;
    /**
     * 注册详细地址
     */
    @JSONField(name = "reg_detail")
    private String regDetail;
    /**
     * 法人姓名
     */
    @JSONField(name = "legal_name")
    private String legalName;
    /**
     * 法人证件类型
     */
    @JSONField(name = "legal_cert_type")
    private String legalCertType;
    /**
     * 法人证件号码
     */
    @JSONField(name = "legal_cert_no")
    private String legalCertNo;
    /**
     * 法人证件有效期类型
     */
    @JSONField(name = "legal_cert_validity_type")
    private String legalCertValidityType;
    /**
     * 法人证件有效期开始日期
     */
    @JSONField(name = "legal_cert_begin_date")
    private String legalCertBeginDate;
    /**
     * 法人证件有效期截止日期日期格式：yyyyMMdd，以北京时间为准。  &lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;当legal_cert_validity_type&#x3D;0时必填 ；当legal_cert_validity_type&#x3D;1时为空 ；当使用总部资质时不填
     */
    @JSONField(name = "legal_cert_end_date")
    private String legalCertEndDate;
    /**
     * 经营省
     */
    @JSONField(name = "prov_id")
    private String provId;
    /**
     * 经营市
     */
    @JSONField(name = "area_id")
    private String areaId;
    /**
     * 经营区
     */
    @JSONField(name = "district_id")
    private String districtId;
    /**
     * 经营详细地址
     */
    @JSONField(name = "detail_addr")
    private String detailAddr;
    /**
     * 联系人姓名
     */
    @JSONField(name = "contact_name")
    private String contactName;
    /**
     * 联系人手机号
     */
    @JSONField(name = "contact_mobile_no")
    private String contactMobileNo;
    /**
     * 联系人电子邮箱
     */
    @JSONField(name = "contact_email")
    private String contactEmail;
    /**
     * 客服电话
     */
    @JSONField(name = "service_phone")
    private String servicePhone;
    /**
     * 经营类型
     */
    @JSONField(name = "busi_type")
    private String busiType;
    /**
     * 小票名称
     */
    @JSONField(name = "receipt_name")
    private String receiptName;
    /**
     * 所属行业
     */
    @JSONField(name = "mcc")
    private String mcc;
    /**
     * 结算卡信息配置
     */
    @JSONField(name = "card_info")
    private String cardInfo;
    /**
     * 基本存款账户编号或核准号基本存款账户信息请填写基本存款账户编号；开户许可证请填写核准号 ；&lt;br/&gt;当注册地址或经营地址为如下地区时必填：浙江,海南,重庆,河南,江苏,宁波市,黑龙江,吉林,湖南,贵州,陕西,湖北 &lt;br/&gt;当使用总部资质时不填 ；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：J2900123456789&lt;/font&gt;
     */
    @JSONField(name = "open_licence_no")
    private String openLicenceNo;
    /**
     * 总部汇付Id如果headOfficeFlag&#x3D;0，useHeadInfoFlag&#x3D;Y,且head_huifu_id不为空则基本信息部分复用总部的基本信息。&lt;br/&gt;如果head_office_flag&#x3D;0，则字段必填,如果head_office_flag&#x3D;1，总部汇付Id不可传&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123&lt;/font&gt;
     */
    @JSONField(name = "head_huifu_id")
    private String headHuifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BASICDATA_ENT;
    }

    public V2MerchantBasicdataEntRequest() {
    }

    public V2MerchantBasicdataEntRequest(String reqSeqId, String reqDate, String upperHuifuId, String regName, String shortName, String entType, String licenseCode, String licenseValidityType, String licenseBeginDate, String licenseEndDate, String regProvId, String regAreaId, String regDistrictId, String regDetail, String legalName, String legalCertType, String legalCertNo, String legalCertValidityType, String legalCertBeginDate, String legalCertEndDate, String provId, String areaId, String districtId, String detailAddr, String contactName, String contactMobileNo, String contactEmail, String servicePhone, String busiType, String receiptName, String mcc, String cardInfo, String openLicenceNo, String headHuifuId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.upperHuifuId = upperHuifuId;
        this.regName = regName;
        this.shortName = shortName;
        this.entType = entType;
        this.licenseCode = licenseCode;
        this.licenseValidityType = licenseValidityType;
        this.licenseBeginDate = licenseBeginDate;
        this.licenseEndDate = licenseEndDate;
        this.regProvId = regProvId;
        this.regAreaId = regAreaId;
        this.regDistrictId = regDistrictId;
        this.regDetail = regDetail;
        this.legalName = legalName;
        this.legalCertType = legalCertType;
        this.legalCertNo = legalCertNo;
        this.legalCertValidityType = legalCertValidityType;
        this.legalCertBeginDate = legalCertBeginDate;
        this.legalCertEndDate = legalCertEndDate;
        this.provId = provId;
        this.areaId = areaId;
        this.districtId = districtId;
        this.detailAddr = detailAddr;
        this.contactName = contactName;
        this.contactMobileNo = contactMobileNo;
        this.contactEmail = contactEmail;
        this.servicePhone = servicePhone;
        this.busiType = busiType;
        this.receiptName = receiptName;
        this.mcc = mcc;
        this.cardInfo = cardInfo;
        this.openLicenceNo = openLicenceNo;
        this.headHuifuId = headHuifuId;
    }

    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getUpperHuifuId() {
        return upperHuifuId;
    }

    public void setUpperHuifuId(String upperHuifuId) {
        this.upperHuifuId = upperHuifuId;
    }

    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getEntType() {
        return entType;
    }

    public void setEntType(String entType) {
        this.entType = entType;
    }

    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    public String getLicenseValidityType() {
        return licenseValidityType;
    }

    public void setLicenseValidityType(String licenseValidityType) {
        this.licenseValidityType = licenseValidityType;
    }

    public String getLicenseBeginDate() {
        return licenseBeginDate;
    }

    public void setLicenseBeginDate(String licenseBeginDate) {
        this.licenseBeginDate = licenseBeginDate;
    }

    public String getLicenseEndDate() {
        return licenseEndDate;
    }

    public void setLicenseEndDate(String licenseEndDate) {
        this.licenseEndDate = licenseEndDate;
    }

    public String getRegProvId() {
        return regProvId;
    }

    public void setRegProvId(String regProvId) {
        this.regProvId = regProvId;
    }

    public String getRegAreaId() {
        return regAreaId;
    }

    public void setRegAreaId(String regAreaId) {
        this.regAreaId = regAreaId;
    }

    public String getRegDistrictId() {
        return regDistrictId;
    }

    public void setRegDistrictId(String regDistrictId) {
        this.regDistrictId = regDistrictId;
    }

    public String getRegDetail() {
        return regDetail;
    }

    public void setRegDetail(String regDetail) {
        this.regDetail = regDetail;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalCertType() {
        return legalCertType;
    }

    public void setLegalCertType(String legalCertType) {
        this.legalCertType = legalCertType;
    }

    public String getLegalCertNo() {
        return legalCertNo;
    }

    public void setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
    }

    public String getLegalCertValidityType() {
        return legalCertValidityType;
    }

    public void setLegalCertValidityType(String legalCertValidityType) {
        this.legalCertValidityType = legalCertValidityType;
    }

    public String getLegalCertBeginDate() {
        return legalCertBeginDate;
    }

    public void setLegalCertBeginDate(String legalCertBeginDate) {
        this.legalCertBeginDate = legalCertBeginDate;
    }

    public String getLegalCertEndDate() {
        return legalCertEndDate;
    }

    public void setLegalCertEndDate(String legalCertEndDate) {
        this.legalCertEndDate = legalCertEndDate;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getDetailAddr() {
        return detailAddr;
    }

    public void setDetailAddr(String detailAddr) {
        this.detailAddr = detailAddr;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMobileNo() {
        return contactMobileNo;
    }

    public void setContactMobileNo(String contactMobileNo) {
        this.contactMobileNo = contactMobileNo;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getReceiptName() {
        return receiptName;
    }

    public void setReceiptName(String receiptName) {
        this.receiptName = receiptName;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }

    public String getOpenLicenceNo() {
        return openLicenceNo;
    }

    public void setOpenLicenceNo(String openLicenceNo) {
        this.openLicenceNo = openLicenceNo;
    }

    public String getHeadHuifuId() {
        return headHuifuId;
    }

    public void setHeadHuifuId(String headHuifuId) {
        this.headHuifuId = headHuifuId;
    }

}
