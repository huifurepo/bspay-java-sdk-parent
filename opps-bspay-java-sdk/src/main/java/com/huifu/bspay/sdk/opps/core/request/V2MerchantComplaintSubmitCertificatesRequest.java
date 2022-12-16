package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 支付宝申诉提交凭证
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantComplaintSubmitCertificatesRequest extends BaseRequest {

    /**
     * 请求汇付流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 请求汇付时间
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 支付宝推送流水号
     */
    @JSONField(name = "risk_biz_id")
    private String riskBizId;
    /**
     * 申诉解限的唯一ID
     */
    @JSONField(name = "relieving_id")
    private String relievingId;
    /**
     * 解限风险类型
     */
    @JSONField(name = "relieve_risk_type")
    private String relieveRiskType;
    /**
     * 提交的凭证数据
     */
    @JSONField(name = "relieve_cert_data_list")
    private String relieveCertDataList;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_COMPLAINT_SUBMIT_CERTIFICATES;
    }

    public V2MerchantComplaintSubmitCertificatesRequest() {
    }

    public V2MerchantComplaintSubmitCertificatesRequest(String reqSeqId, String reqDate, String riskBizId, String relievingId, String relieveRiskType, String relieveCertDataList) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.riskBizId = riskBizId;
        this.relievingId = relievingId;
        this.relieveRiskType = relieveRiskType;
        this.relieveCertDataList = relieveCertDataList;
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

    public String getRiskBizId() {
        return riskBizId;
    }

    public void setRiskBizId(String riskBizId) {
        this.riskBizId = riskBizId;
    }

    public String getRelievingId() {
        return relievingId;
    }

    public void setRelievingId(String relievingId) {
        this.relievingId = relievingId;
    }

    public String getRelieveRiskType() {
        return relieveRiskType;
    }

    public void setRelieveRiskType(String relieveRiskType) {
        this.relieveRiskType = relieveRiskType;
    }

    public String getRelieveCertDataList() {
        return relieveCertDataList;
    }

    public void setRelieveCertDataList(String relieveCertDataList) {
        this.relieveCertDataList = relieveCertDataList;
    }

}
