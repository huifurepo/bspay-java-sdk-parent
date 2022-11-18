package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 手机网页支付
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeOnlinepaymentWappayRequest extends BaseRequest {

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
     * 交易金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;
    /**
     * 网联扩展数据
     */
    @JSONField(name = "extend_pay_data")
    private String extendPayData;
    /**
     * 安全信息
     */
    @JSONField(name = "risk_check_data")
    private String riskCheckData;
    /**
     * 设备信息
     */
    @JSONField(name = "terminal_device_data")
    private String terminalDeviceData;
    /**
     * 银行卡号
     */
    @JSONField(name = "bank_card_no")
    private String bankCardNo;
    /**
     * 页面跳转地址
     */
    @JSONField(name = "front_url")
    private String frontUrl;
    /**
     * 异步通知地址
     */
    @JSONField(name = "notify_url")
    private String notifyUrl;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ONLINEPAYMENT_WAPPAY;
    }

    public V2TradeOnlinepaymentWappayRequest() {
    }

    public V2TradeOnlinepaymentWappayRequest(String reqDate, String reqSeqId, String huifuId, String transAmt, String extendPayData, String riskCheckData, String terminalDeviceData, String bankCardNo, String frontUrl, String notifyUrl) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.transAmt = transAmt;
        this.extendPayData = extendPayData;
        this.riskCheckData = riskCheckData;
        this.terminalDeviceData = terminalDeviceData;
        this.bankCardNo = bankCardNo;
        this.frontUrl = frontUrl;
        this.notifyUrl = notifyUrl;
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

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getExtendPayData() {
        return extendPayData;
    }

    public void setExtendPayData(String extendPayData) {
        this.extendPayData = extendPayData;
    }

    public String getRiskCheckData() {
        return riskCheckData;
    }

    public void setRiskCheckData(String riskCheckData) {
        this.riskCheckData = riskCheckData;
    }

    public String getTerminalDeviceData() {
        return terminalDeviceData;
    }

    public void setTerminalDeviceData(String terminalDeviceData) {
        this.terminalDeviceData = terminalDeviceData;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
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

}
