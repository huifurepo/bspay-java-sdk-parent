package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 钱包提现下单
 *
 * @author sdk-generator
 * @Description
 */
public class V2WalletTradeWithdrawalRequest extends BaseRequest {

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
     * 钱包用户ID
     */
    @JSONField(name = "user_huifu_id")
    private String userHuifuId;
    /**
     * 银行卡序列号
     */
    @JSONField(name = "token_no")
    private String tokenNo;
    /**
     * 提现金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;
    /**
     * 跳转地址
     */
    @JSONField(name = "front_url")
    private String frontUrl;
    /**
     * 异步通知地址
     */
    @JSONField(name = "notify_url")
    private String notifyUrl;
    /**
     * 到账日期类型
     */
    @JSONField(name = "into_acct_date_type")
    private String intoAcctDateType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_WALLET_TRADE_WITHDRAWAL;
    }

    public V2WalletTradeWithdrawalRequest() {
    }

    public V2WalletTradeWithdrawalRequest(String reqSeqId, String reqDate, String huifuId, String userHuifuId, String tokenNo, String transAmt, String frontUrl, String notifyUrl, String intoAcctDateType) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.userHuifuId = userHuifuId;
        this.tokenNo = tokenNo;
        this.transAmt = transAmt;
        this.frontUrl = frontUrl;
        this.notifyUrl = notifyUrl;
        this.intoAcctDateType = intoAcctDateType;
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

    public String getTokenNo() {
        return tokenNo;
    }

    public void setTokenNo(String tokenNo) {
        this.tokenNo = tokenNo;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getFrontUrl() {
        return frontUrl;
    }

    public void setFrontUrl(String frontUrl) {
        this.frontUrl = frontUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getIntoAcctDateType() {
        return intoAcctDateType;
    }

    public void setIntoAcctDateType(String intoAcctDateType) {
        this.intoAcctDateType = intoAcctDateType;
    }

}
