package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 快捷支付页面版接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeOnlinepaymentQuickpayFrontpayRequest extends BaseRequest {

    /**
     * 业务请求流水号
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
     * 银行扩展信息
     */
    @JSONField(name = "extend_pay_data")
    private String extendPayData;
    /**
     * 设备信息
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
        return FunctionCodeEnum.V2_TRADE_ONLINEPAYMENT_QUICKPAY_FRONTPAY;
    }

    public V2TradeOnlinepaymentQuickpayFrontpayRequest() {
    }

    public V2TradeOnlinepaymentQuickpayFrontpayRequest(String reqSeqId, String reqDate, String huifuId, String transAmt, String notifyUrl, String extendPayData, String terminalDeviceData, String riskCheckData) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.transAmt = transAmt;
        this.notifyUrl = notifyUrl;
        this.extendPayData = extendPayData;
        this.terminalDeviceData = terminalDeviceData;
        this.riskCheckData = riskCheckData;
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

    public String getExtendPayData() {
        return extendPayData;
    }

    public void setExtendPayData(String extendPayData) {
        this.extendPayData = extendPayData;
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
