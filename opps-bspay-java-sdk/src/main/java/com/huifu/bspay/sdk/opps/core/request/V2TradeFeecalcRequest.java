package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 手续费试算
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeFeecalcRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
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
     * 交易类型
     */
    @JSONField(name = "trade_type")
    private String tradeType;
    /**
     * 交易金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_FEECALC;
    }

    public V2TradeFeecalcRequest() {
    }

    public V2TradeFeecalcRequest(String huifuId, String reqDate, String reqSeqId, String tradeType, String transAmt) {
        this.huifuId = huifuId;
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.tradeType = tradeType;
        this.transAmt = transAmt;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
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

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

}
