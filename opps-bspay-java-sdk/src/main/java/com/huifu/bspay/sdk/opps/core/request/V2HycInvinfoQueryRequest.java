package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 开票信息查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2HycInvinfoQueryRequest extends BaseRequest {

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
     * 商户汇付id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 开票批次号
     */
    @JSONField(name = "invoice_batch")
    private String invoiceBatch;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_HYC_INVINFO_QUERY;
    }

    public V2HycInvinfoQueryRequest() {
    }

    public V2HycInvinfoQueryRequest(String reqSeqId, String reqDate, String huifuId, String invoiceBatch) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.invoiceBatch = invoiceBatch;
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

    public String getInvoiceBatch() {
        return invoiceBatch;
    }

    public void setInvoiceBatch(String invoiceBatch) {
        this.invoiceBatch = invoiceBatch;
    }

}
