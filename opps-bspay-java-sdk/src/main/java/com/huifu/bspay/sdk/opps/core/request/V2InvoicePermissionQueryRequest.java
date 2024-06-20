package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 电子发票业务开通查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2InvoicePermissionQueryRequest extends BaseRequest {

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
     * 商户汇付Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 是否包含下级
     */
    @JSONField(name = "include_sub_flag")
    private String includeSubFlag;
    /**
     * 当前页
     */
    @JSONField(name = "page_num")
    private String pageNum;
    /**
     * 分页大小
     */
    @JSONField(name = "page_size")
    private String pageSize;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_INVOICE_PERMISSION_QUERY;
    }

    public V2InvoicePermissionQueryRequest() {
    }

    public V2InvoicePermissionQueryRequest(String reqSeqId, String reqDate, String huifuId, String includeSubFlag, String pageNum, String pageSize) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.includeSubFlag = includeSubFlag;
        this.pageNum = pageNum;
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

    public String getIncludeSubFlag() {
        return includeSubFlag;
    }

    public void setIncludeSubFlag(String includeSubFlag) {
        this.includeSubFlag = includeSubFlag;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

}
