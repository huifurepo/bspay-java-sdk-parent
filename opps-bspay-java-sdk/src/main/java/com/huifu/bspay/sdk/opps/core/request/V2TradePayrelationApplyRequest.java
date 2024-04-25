package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 付款关系提交
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePayrelationApplyRequest extends BaseRequest {

    /**
     * 出款方商户号
     */
    @JSONField(name = "out_huifu_id")
    private String outHuifuId;
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
     * 付款关系明细
     */
    @JSONField(name = "pay_relations")
    private String payRelations;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYRELATION_APPLY;
    }

    public V2TradePayrelationApplyRequest() {
    }

    public V2TradePayrelationApplyRequest(String outHuifuId, String reqDate, String reqSeqId, String payRelations) {
        this.outHuifuId = outHuifuId;
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.payRelations = payRelations;
    }

    public String getOutHuifuId() {
        return outHuifuId;
    }

    public void setOutHuifuId(String outHuifuId) {
        this.outHuifuId = outHuifuId;
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

    public String getPayRelations() {
        return payRelations;
    }

    public void setPayRelations(String payRelations) {
        this.payRelations = payRelations;
    }

}
