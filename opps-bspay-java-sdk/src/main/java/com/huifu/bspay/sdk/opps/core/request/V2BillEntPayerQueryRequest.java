package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 付款人查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2BillEntPayerQueryRequest extends BaseRequest {

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 付款人
     */
    @JSONField(name = "payer_id")
    private String payerId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_BILL_ENT_PAYER_QUERY;
    }

    public V2BillEntPayerQueryRequest() {
    }

    public V2BillEntPayerQueryRequest(String reqSeqId, String reqDate, String huifuId, String payerId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.payerId = payerId;
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

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

}
