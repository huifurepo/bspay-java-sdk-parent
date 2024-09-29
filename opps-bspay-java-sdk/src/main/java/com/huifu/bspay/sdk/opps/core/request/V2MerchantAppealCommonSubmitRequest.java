package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 提交申诉
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantAppealCommonSubmitRequest extends BaseRequest {

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
     * 商户经营模式
     */
    @JSONField(name = "business_pattern")
    private String businessPattern;
    /**
     * 协查单号
     */
    @JSONField(name = "assist_id")
    private String assistId;
    /**
     * 申诉单号
     */
    @JSONField(name = "appeal_id")
    private String appealId;
    /**
     * 商户类型
     */
    @JSONField(name = "mer_type")
    private String merType;
    /**
     * 申诉人姓名
     */
    @JSONField(name = "appeal_person_name")
    private String appealPersonName;
    /**
     * 申诉人身份证号
     */
    @JSONField(name = "appeal_person_cert_no")
    private String appealPersonCertNo;
    /**
     * 申诉人联系电话
     */
    @JSONField(name = "appeal_person_phone_no")
    private String appealPersonPhoneNo;
    /**
     * 法人姓名
     */
    @JSONField(name = "legal_name")
    private String legalName;
    /**
     * 法人身份证号
     */
    @JSONField(name = "legal_cert_no")
    private String legalCertNo;
    /**
     * 法人联系电话
     */
    @JSONField(name = "legal_phone_no")
    private String legalPhoneNo;
    /**
     * 商户主营业务
     */
    @JSONField(name = "main_business")
    private String mainBusiness;
    /**
     * 申诉理由
     */
    @JSONField(name = "appeal_desc")
    private String appealDesc;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_APPEAL_COMMON_SUBMIT;
    }

    public V2MerchantAppealCommonSubmitRequest() {
    }

    public V2MerchantAppealCommonSubmitRequest(String reqSeqId, String reqDate, String businessPattern, String assistId, String appealId, String merType, String appealPersonName, String appealPersonCertNo, String appealPersonPhoneNo, String legalName, String legalCertNo, String legalPhoneNo, String mainBusiness, String appealDesc) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.businessPattern = businessPattern;
        this.assistId = assistId;
        this.appealId = appealId;
        this.merType = merType;
        this.appealPersonName = appealPersonName;
        this.appealPersonCertNo = appealPersonCertNo;
        this.appealPersonPhoneNo = appealPersonPhoneNo;
        this.legalName = legalName;
        this.legalCertNo = legalCertNo;
        this.legalPhoneNo = legalPhoneNo;
        this.mainBusiness = mainBusiness;
        this.appealDesc = appealDesc;
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

    public String getBusinessPattern() {
        return businessPattern;
    }

    public void setBusinessPattern(String businessPattern) {
        this.businessPattern = businessPattern;
    }

    public String getAssistId() {
        return assistId;
    }

    public void setAssistId(String assistId) {
        this.assistId = assistId;
    }

    public String getAppealId() {
        return appealId;
    }

    public void setAppealId(String appealId) {
        this.appealId = appealId;
    }

    public String getMerType() {
        return merType;
    }

    public void setMerType(String merType) {
        this.merType = merType;
    }

    public String getAppealPersonName() {
        return appealPersonName;
    }

    public void setAppealPersonName(String appealPersonName) {
        this.appealPersonName = appealPersonName;
    }

    public String getAppealPersonCertNo() {
        return appealPersonCertNo;
    }

    public void setAppealPersonCertNo(String appealPersonCertNo) {
        this.appealPersonCertNo = appealPersonCertNo;
    }

    public String getAppealPersonPhoneNo() {
        return appealPersonPhoneNo;
    }

    public void setAppealPersonPhoneNo(String appealPersonPhoneNo) {
        this.appealPersonPhoneNo = appealPersonPhoneNo;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalCertNo() {
        return legalCertNo;
    }

    public void setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
    }

    public String getLegalPhoneNo() {
        return legalPhoneNo;
    }

    public void setLegalPhoneNo(String legalPhoneNo) {
        this.legalPhoneNo = legalPhoneNo;
    }

    public String getMainBusiness() {
        return mainBusiness;
    }

    public void setMainBusiness(String mainBusiness) {
        this.mainBusiness = mainBusiness;
    }

    public String getAppealDesc() {
        return appealDesc;
    }

    public void setAppealDesc(String appealDesc) {
        this.appealDesc = appealDesc;
    }

}
