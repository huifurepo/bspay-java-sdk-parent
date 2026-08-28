package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 电子合同申请列表查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2InvoiceQueryecmsapplylistRequest extends BaseRequest {

    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 协议类型
     */
    @JSONField(name = "agreement_type")
    private String agreementType;
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
        return FunctionCodeEnum.V2_INVOICE_QUERYECMSAPPLYLIST;
    }

    public V2InvoiceQueryecmsapplylistRequest() {
    }

    public V2InvoiceQueryecmsapplylistRequest(String reqDate, String reqSeqId, String huifuId, String agreementType, String pageNum, String pageSize) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.agreementType = agreementType;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(String agreementType) {
        this.agreementType = agreementType;
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
