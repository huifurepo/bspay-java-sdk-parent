package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 发票开具申请查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2InvoiceQueryapplyRequest extends BaseRequest {

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
     * 渠道号汇付商户号为空时，必传；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812124&lt;/font&gt;
     */
    @JSONField(name = "channel_id")
    private String channelId;
    /**
     * 流水号
     */
    @JSONField(name = "seq_id")
    private String seqId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_INVOICE_QUERYAPPLY;
    }

    public V2InvoiceQueryapplyRequest() {
    }

    public V2InvoiceQueryapplyRequest(String reqSeqId, String reqDate, String channelId, String seqId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.channelId = channelId;
        this.seqId = seqId;
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

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

}
