package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 企业用户基本信息开户
 *
 * @author sdk-generator
 * @Description
 */
public class V2UserBasicdataEntRequest extends BaseRequest {

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
     * 企业用户名称
     */
    @JSONField(name = "reg_name")
    private String regName;
    /**
     * 营业执照编号
     */
    @JSONField(name = "license_code")
    private String licenseCode;
    /**
     * 证照有效期类型
     */
    @JSONField(name = "license_validity_type")
    private String licenseValidityType;
    /**
     * 证照有效期起始日期
     */
    @JSONField(name = "license_begin_date")
    private String licenseBeginDate;
    /**
     * 证照有效期结束日期日期格式：yyyyMMdd; 非长期有效时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20320905&lt;/font&gt;
     */
    @JSONField(name = "license_end_date")
    private String licenseEndDate;
    /**
     * 注册地址(省)
     */
    @JSONField(name = "reg_prov_id")
    private String regProvId;
    /**
     * 注册地址(市)
     */
    @JSONField(name = "reg_area_id")
    private String regAreaId;
    /**
     * 注册地址(区)
     */
    @JSONField(name = "reg_district_id")
    private String regDistrictId;
    /**
     * 注册地址(详细信息)
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
     * 法人证件有效期截止日期日期格式：yyyyMMdd; 非长期有效时必填，长期有效为空；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20320905&lt;/font&gt;
     */
    @JSONField(name = "legal_cert_end_date")
    private String legalCertEndDate;
    /**
     * 联系人姓名
     */
    @JSONField(name = "contact_name")
    private String contactName;
    /**
     * 联系人手机号
     */
    @JSONField(name = "contact_mobile")
    private String contactMobile;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_USER_BASICDATA_ENT;
    }

    public V2UserBasicdataEntRequest() {
    }

    public V2UserBasicdataEntRequest(String reqSeqId, String reqDate, String regName, String licenseCode, String licenseValidityType, String licenseBeginDate, String licenseEndDate, String regProvId, String regAreaId, String regDistrictId, String regDetail, String legalName, String legalCertType, String legalCertNo, String legalCertValidityType, String legalCertBeginDate, String legalCertEndDate, String contactName, String contactMobile) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.regName = regName;
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
        this.contactName = contactName;
        this.contactMobile = contactMobile;
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

    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
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

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

}
