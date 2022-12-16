package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 支付宝申诉查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantComplaintQueryStatusRequest extends BaseRequest {

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
     * 申诉的商户
     */
    @JSONField(name = "bank_mer_code")
    private String bankMerCode;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_COMPLAINT_QUERY_STATUS;
    }

    public V2MerchantComplaintQueryStatusRequest() {
    }

    public V2MerchantComplaintQueryStatusRequest(String reqSeqId, String reqDate, String riskBizId, String bankMerCode) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.riskBizId = riskBizId;
        this.bankMerCode = bankMerCode;
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

    public String getBankMerCode() {
        return bankMerCode;
    }

    public void setBankMerCode(String bankMerCode) {
        this.bankMerCode = bankMerCode;
    }

}
