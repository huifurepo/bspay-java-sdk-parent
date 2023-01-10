package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 更新退款审批结果
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantComplaintUpdateRefundprogressRequest extends BaseRequest {

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
     * 投诉单号
     */
    @JSONField(name = "complaint_id")
    private String complaintId;
    /**
     * 审批动作
     */
    @JSONField(name = "action")
    private String action;
    /**
     * 微信商户号
     */
    @JSONField(name = "mch_id")
    private String mchId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_COMPLAINT_UPDATE_REFUNDPROGRESS;
    }

    public V2MerchantComplaintUpdateRefundprogressRequest() {
    }

    public V2MerchantComplaintUpdateRefundprogressRequest(String reqSeqId, String reqDate, String complaintId, String action, String mchId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.complaintId = complaintId;
        this.action = action;
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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

}
