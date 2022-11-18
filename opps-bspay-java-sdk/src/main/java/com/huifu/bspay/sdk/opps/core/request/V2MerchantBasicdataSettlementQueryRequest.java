package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 结算记录查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBasicdataSettlementQueryRequest extends BaseRequest {

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
     * 汇付客户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 结算开始日期
     */
    @JSONField(name = "begin_date")
    private String beginDate;
    /**
     * 结算结束日期
     */
    @JSONField(name = "end_date")
    private String endDate;
    /**
     * 分页条数
     */
    @JSONField(name = "page_size")
    private String pageSize;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BASICDATA_SETTLEMENT_QUERY;
    }

    public V2MerchantBasicdataSettlementQueryRequest() {
    }

    public V2MerchantBasicdataSettlementQueryRequest(String reqSeqId, String reqDate, String huifuId, String beginDate, String endDate, String pageSize) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.pageSize = pageSize;
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

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
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

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

}
