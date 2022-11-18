package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 个人用户基本信息开户
 *
 * @author sdk-generator
 * @Description
 */
public class V2UserBasicdataIndvRequest extends BaseRequest {

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
     * 个人姓名
     */
    @JSONField(name = "name")
    private String name;
    /**
     * 个人证件类型
     */
    @JSONField(name = "cert_type")
    private String certType;
    /**
     * 个人证件号码
     */
    @JSONField(name = "cert_no")
    private String certNo;
    /**
     * 个人证件有效期类型
     */
    @JSONField(name = "cert_validity_type")
    private String certValidityType;
    /**
     * 个人证件有效期开始日期
     */
    @JSONField(name = "cert_begin_date")
    private String certBeginDate;
    /**
     * 手机号
     */
    @JSONField(name = "mobile_no")
    private String mobileNo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_USER_BASICDATA_INDV;
    }

    public V2UserBasicdataIndvRequest() {
    }

    public V2UserBasicdataIndvRequest(String reqSeqId, String reqDate, String name, String certType, String certNo, String certValidityType, String certBeginDate, String mobileNo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.name = name;
        this.certType = certType;
        this.certNo = certNo;
        this.certValidityType = certValidityType;
        this.certBeginDate = certBeginDate;
        this.mobileNo = mobileNo;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCertValidityType() {
        return certValidityType;
    }

    public void setCertValidityType(String certValidityType) {
        this.certValidityType = certValidityType;
    }

    public String getCertBeginDate() {
        return certBeginDate;
    }

    public void setCertBeginDate(String certBeginDate) {
        this.certBeginDate = certBeginDate;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

}
