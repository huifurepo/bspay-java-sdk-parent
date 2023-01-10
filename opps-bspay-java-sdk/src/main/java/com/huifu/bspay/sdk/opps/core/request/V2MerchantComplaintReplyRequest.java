package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 回复用户
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantComplaintReplyRequest extends BaseRequest {

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
     * 回复内容
     */
    @JSONField(name = "response_content")
    private String responseContent;
    /**
     * 跳转链接
     */
    @JSONField(name = "jump_url")
    private String jumpUrl;
    /**
     * 跳转链接文案
     */
    @JSONField(name = "jump_url_text")
    private String jumpUrlText;
    /**
     * 微信商户号
     */
    @JSONField(name = "mch_id")
    private String mchId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_COMPLAINT_REPLY;
    }

    public V2MerchantComplaintReplyRequest() {
    }

    public V2MerchantComplaintReplyRequest(String reqSeqId, String reqDate, String complaintId, String complaintedMchid, String responseContent, String jumpUrl, String jumpUrlText, String mchId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.complaintId = complaintId;
        this.complaintedMchid = complaintedMchid;
        this.responseContent = responseContent;
        this.jumpUrl = jumpUrl;
        this.jumpUrlText = jumpUrlText;
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

    public String getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(String responseContent) {
        this.responseContent = responseContent;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    public String getJumpUrlText() {
        return jumpUrlText;
    }

    public void setJumpUrlText(String jumpUrlText) {
        this.jumpUrlText = jumpUrlText;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

}
