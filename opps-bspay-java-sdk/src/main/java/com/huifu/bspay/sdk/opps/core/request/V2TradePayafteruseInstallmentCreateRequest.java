package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 分期单创建
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePayafteruseInstallmentCreateRequest extends BaseRequest {

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 分期金额
     */
    @JSONField(name = "fq_amt")
    private String fqAmt;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYAFTERUSE_INSTALLMENT_CREATE;
    }

    public V2TradePayafteruseInstallmentCreateRequest() {
    }

    public V2TradePayafteruseInstallmentCreateRequest(String reqSeqId, String reqDate, String huifuId, String fqAmt) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.fqAmt = fqAmt;
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

    public String getFqAmt() {
        return fqAmt;
    }

    public void setFqAmt(String fqAmt) {
        this.fqAmt = fqAmt;
    }

}
