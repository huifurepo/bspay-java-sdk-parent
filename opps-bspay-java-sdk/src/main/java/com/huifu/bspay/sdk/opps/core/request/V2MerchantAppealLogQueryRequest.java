package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 操作日志查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantAppealLogQueryRequest extends BaseRequest {

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
     * 申诉单号
     */
    @JSONField(name = "appeal_id")
    private String appealId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_APPEAL_LOG_QUERY;
    }

    public V2MerchantAppealLogQueryRequest() {
    }

    public V2MerchantAppealLogQueryRequest(String reqSeqId, String reqDate, String pageSize, String appealId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.pageSize = pageSize;
        this.appealId = appealId;
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

    public String getAppealId() {
        return appealId;
    }

    public void setAppealId(String appealId) {
        this.appealId = appealId;
    }

}
