package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 用户列表查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2UserListQueryRequest extends BaseRequest {

    /**
     * 法人证件号
     */
    @JSONField(name = "legal_cert_no")
    private String legalCertNo;
    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_USER_LIST_QUERY;
    }

    public V2UserListQueryRequest() {
    }

    public V2UserListQueryRequest(String legalCertNo, String reqDate, String reqSeqId) {
        this.legalCertNo = legalCertNo;
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
    }

    public String getLegalCertNo() {
        return legalCertNo;
    }

    public void setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
    }

}
