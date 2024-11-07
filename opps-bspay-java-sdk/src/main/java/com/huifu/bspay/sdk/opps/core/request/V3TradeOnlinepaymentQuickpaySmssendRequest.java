package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 快捷短信发送
 *
 * @author sdk-generator
 * @Description
 */
public class V3TradeOnlinepaymentQuickpaySmssendRequest extends BaseRequest {

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 用户客户号
     */
    @JSONField(name = "user_huifu_id")
    private String userHuifuId;
    /**
     * 绑卡id
     */
    @JSONField(name = "card_bind_id")
    private String cardBindId;
    /**
     * 订单金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;
    /**
     * 异步通知地址
     */
    @JSONField(name = "notify_url")
    private String notifyUrl;
    /**
     * 网联数据
     */
    @JSONField(name = "nucc_data")
    private String nuccData;
    /**
     * 设备数据
     */
    @JSONField(name = "terminal_device_data")
    private String terminalDeviceData;
    /**
     * 安全信息
     */
    @JSONField(name = "risk_check_data")
    private String riskCheckData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V3_TRADE_ONLINEPAYMENT_QUICKPAY_SMSSEND;
    }

    public V3TradeOnlinepaymentQuickpaySmssendRequest() {
    }

    public V3TradeOnlinepaymentQuickpaySmssendRequest(String reqDate, String reqSeqId, String huifuId, String userHuifuId, String cardBindId, String transAmt, String notifyUrl, String nuccData, String terminalDeviceData, String riskCheckData) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.userHuifuId = userHuifuId;
        this.cardBindId = cardBindId;
        this.transAmt = transAmt;
        this.notifyUrl = notifyUrl;
        this.nuccData = nuccData;
        this.terminalDeviceData = terminalDeviceData;
        this.riskCheckData = riskCheckData;
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

    public String getCardBindId() {
        return cardBindId;
    }

    public void setCardBindId(String cardBindId) {
        this.cardBindId = cardBindId;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getNuccData() {
        return nuccData;
    }

    public void setNuccData(String nuccData) {
        this.nuccData = nuccData;
    }

    public String getTerminalDeviceData() {
        return terminalDeviceData;
    }

    public void setTerminalDeviceData(String terminalDeviceData) {
        this.terminalDeviceData = terminalDeviceData;
    }

    public String getRiskCheckData() {
        return riskCheckData;
    }

    public void setRiskCheckData(String riskCheckData) {
        this.riskCheckData = riskCheckData;
    }

}
