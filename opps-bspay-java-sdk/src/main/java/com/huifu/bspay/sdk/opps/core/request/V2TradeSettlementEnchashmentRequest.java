package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 取现接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeSettlementEnchashmentRequest extends BaseRequest {

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
     * 取现金额
     */
    @JSONField(name = "cash_amt")
    private String cashAmt;
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 到账日期类型
     */
    @JSONField(name = "into_acct_date_type")
    private String intoAcctDateType;
    /**
     * 取现卡序列号
     */
    @JSONField(name = "token_no")
    private String tokenNo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_SETTLEMENT_ENCHASHMENT;
    }

    public V2TradeSettlementEnchashmentRequest() {
    }

    public V2TradeSettlementEnchashmentRequest(String reqDate, String reqSeqId, String cashAmt, String huifuId, String intoAcctDateType, String tokenNo) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.cashAmt = cashAmt;
        this.huifuId = huifuId;
        this.intoAcctDateType = intoAcctDateType;
        this.tokenNo = tokenNo;
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

    public String getCashAmt() {
        return cashAmt;
    }

    public void setCashAmt(String cashAmt) {
        this.cashAmt = cashAmt;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getIntoAcctDateType() {
        return intoAcctDateType;
    }

    public void setIntoAcctDateType(String intoAcctDateType) {
        this.intoAcctDateType = intoAcctDateType;
    }

    public String getTokenNo() {
        return tokenNo;
    }

    public void setTokenNo(String tokenNo) {
        this.tokenNo = tokenNo;
    }

}
