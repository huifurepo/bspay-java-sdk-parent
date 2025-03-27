package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 用户补贴
 *
 * @author sdk-generator
 * @Description
 */
public class V2WalletTradeRechargeTransferRequest extends BaseRequest {

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
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 收款方用户号
     */
    @JSONField(name = "user_huifu_id")
    private String userHuifuId;
    /**
     * 转账金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_WALLET_TRADE_RECHARGE_TRANSFER;
    }

    public V2WalletTradeRechargeTransferRequest() {
    }

    public V2WalletTradeRechargeTransferRequest(String reqSeqId, String reqDate, String huifuId, String userHuifuId, String transAmt) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.userHuifuId = userHuifuId;
        this.transAmt = transAmt;
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

    public String getUserHuifuId() {
        return userHuifuId;
    }

    public void setUserHuifuId(String userHuifuId) {
        this.userHuifuId = userHuifuId;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

}
