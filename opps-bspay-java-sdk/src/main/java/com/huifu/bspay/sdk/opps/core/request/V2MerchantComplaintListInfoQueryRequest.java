package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 查询投诉单列表及详情
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantComplaintListInfoQueryRequest extends BaseRequest {

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
     * 开始日期
     */
    @JSONField(name = "begin_date")
    private String beginDate;
    /**
     * 结束日期
     */
    @JSONField(name = "end_date")
    private String endDate;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_COMPLAINT_LIST_INFO_QUERY;
    }

    public V2MerchantComplaintListInfoQueryRequest() {
    }

    public V2MerchantComplaintListInfoQueryRequest(String reqSeqId, String reqDate, String beginDate, String endDate) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.beginDate = beginDate;
        this.endDate = endDate;
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

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
