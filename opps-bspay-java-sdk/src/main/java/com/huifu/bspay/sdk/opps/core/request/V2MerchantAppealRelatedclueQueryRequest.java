package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 关联线索查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantAppealRelatedclueQueryRequest extends BaseRequest {

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
     * 分页条数
     */
    @JSONField(name = "page_size")
    private String pageSize;
    /**
     * 协查单号
     */
    @JSONField(name = "assist_id")
    private String assistId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_APPEAL_RELATEDCLUE_QUERY;
    }

    public V2MerchantAppealRelatedclueQueryRequest() {
    }

    public V2MerchantAppealRelatedclueQueryRequest(String reqSeqId, String reqDate, String pageSize, String assistId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.pageSize = pageSize;
        this.assistId = assistId;
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

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getAssistId() {
        return assistId;
    }

    public void setAssistId(String assistId) {
        this.assistId = assistId;
    }

}
