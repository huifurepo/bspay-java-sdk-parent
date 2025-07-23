package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 灵工支付
 *
 * @author sdk-generator
 * @Description
 */
public class V2FlexibleTradeRequest extends BaseRequest {

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
     * 出款方商户号
     */
    @JSONField(name = "out_huifu_id")
    private String outHuifuId;
    /**
     * 出款方账户号
     */
    @JSONField(name = "out_acct_id")
    private String outAcctId;
    /**
     * 交易阶段操作类型
     */
    @JSONField(name = "stage_operation_type")
    private String stageOperationType;
    /**
     * 前段交易流水号** 当交易阶段操作类型为02时，该字段必填。填写的是交易阶段操作类型为01时交易已完成的交易全局流水号。 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：20250620112533115566896&lt;/font&gt;
     */
    @JSONField(name = "phase_hf_seq_id")
    private String phaseHfSeqId;
    /**
     * 支付金额
     */
    @JSONField(name = "ord_amt")
    private String ordAmt;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_FLEXIBLE_TRADE;
    }

    public V2FlexibleTradeRequest() {
    }

    public V2FlexibleTradeRequest(String reqSeqId, String reqDate, String outHuifuId, String outAcctId, String stageOperationType, String phaseHfSeqId, String ordAmt) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.outHuifuId = outHuifuId;
        this.outAcctId = outAcctId;
        this.stageOperationType = stageOperationType;
        this.phaseHfSeqId = phaseHfSeqId;
        this.ordAmt = ordAmt;
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

    public String getOutHuifuId() {
        return outHuifuId;
    }

    public void setOutHuifuId(String outHuifuId) {
        this.outHuifuId = outHuifuId;
    }

    public String getOutAcctId() {
        return outAcctId;
    }

    public void setOutAcctId(String outAcctId) {
        this.outAcctId = outAcctId;
    }

    public String getStageOperationType() {
        return stageOperationType;
    }

    public void setStageOperationType(String stageOperationType) {
        this.stageOperationType = stageOperationType;
    }

    public String getPhaseHfSeqId() {
        return phaseHfSeqId;
    }

    public void setPhaseHfSeqId(String phaseHfSeqId) {
        this.phaseHfSeqId = phaseHfSeqId;
    }

    public String getOrdAmt() {
        return ordAmt;
    }

    public void setOrdAmt(String ordAmt) {
        this.ordAmt = ordAmt;
    }

}
