package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 申诉单列表查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantAppealListQueryRequest extends BaseRequest {

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
     * 申诉创建开始日期
     */
    @JSONField(name = "begin_date")
    private String beginDate;
    /**
     * 申诉创建结束日期
     */
    @JSONField(name = "end_date")
    private String endDate;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_APPEAL_LIST_QUERY;
    }

    public V2MerchantAppealListQueryRequest() {
    }

    public V2MerchantAppealListQueryRequest(String reqSeqId, String reqDate, String pageSize, String beginDate, String endDate) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.pageSize = pageSize;
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

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
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
