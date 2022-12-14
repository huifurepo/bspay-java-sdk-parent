package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 反馈处理完成
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantComplaintCompleteRequest extends BaseRequest {

    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 请求时间
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 微信投诉单号
     */
    @JSONField(name = "complaint_id")
    private String complaintId;
    /**
     * 被诉商户微信号
     */
    @JSONField(name = "complainted_mchid")
    private String complaintedMchid;
    /**
     * 微信商户号
     */
    @JSONField(name = "mch_id")
    private String mchId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_COMPLAINT_COMPLETE;
    }

    public V2MerchantComplaintCompleteRequest() {
    }

    public V2MerchantComplaintCompleteRequest(String reqSeqId, String reqDate, String complaintId, String complaintedMchid, String mchId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.complaintId = complaintId;
        this.complaintedMchid = complaintedMchid;
        this.mchId = mchId;
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

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getComplaintedMchid() {
        return complaintedMchid;
    }

    public void setComplaintedMchid(String complaintedMchid) {
        this.complaintedMchid = complaintedMchid;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

}
