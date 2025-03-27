package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 钱包绑卡充值下单
 *
 * @author sdk-generator
 * @Description
 */
public class V2WalletTradeRechargeCardRequest extends BaseRequest {

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
     * 订单金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;
    /**
     * 微信充值信息微信充值必填
     */
    @JSONField(name = "wx_rechare_info")
    private String wxRechareInfo;
    /**
     * 支付宝充值信息支付宝充值必填
     */
    @JSONField(name = "alipay_recharge_info")
    private String alipayRechargeInfo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_WALLET_TRADE_RECHARGE_CARD;
    }

    public V2WalletTradeRechargeCardRequest() {
    }

    public V2WalletTradeRechargeCardRequest(String reqSeqId, String reqDate, String huifuId, String userHuifuId, String transAmt, String wxRechareInfo, String alipayRechargeInfo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.userHuifuId = userHuifuId;
        this.transAmt = transAmt;
        this.wxRechareInfo = wxRechareInfo;
        this.alipayRechargeInfo = alipayRechargeInfo;
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

    public String getWxRechareInfo() {
        return wxRechareInfo;
    }

    public void setWxRechareInfo(String wxRechareInfo) {
        this.wxRechareInfo = wxRechareInfo;
    }

    public String getAlipayRechargeInfo() {
        return alipayRechargeInfo;
    }

    public void setAlipayRechargeInfo(String alipayRechargeInfo) {
        this.alipayRechargeInfo = alipayRechargeInfo;
    }

}
