package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 线上交易退款
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeOnlinepaymentRefundRequest extends BaseRequest {

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
     * 退款金额
     */
    @JSONField(name = "ord_amt")
    private String ordAmt;
    /**
     * 设备信息条件必填，当为银行大额支付时可不填，jsonObject格式
     */
    @JSONField(name = "terminal_device_data")
    private String terminalDeviceData;
    /**
     * 安全信息条件必填，当为银行大额支付时可不填，jsonObject格式
     */
    @JSONField(name = "risk_check_data")
    private String riskCheckData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ONLINEPAYMENT_REFUND;
    }

    public V2TradeOnlinepaymentRefundRequest() {
    }

    public V2TradeOnlinepaymentRefundRequest(String reqDate, String reqSeqId, String huifuId, String ordAmt, String terminalDeviceData, String riskCheckData) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.ordAmt = ordAmt;
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

    public String getOrdAmt() {
        return ordAmt;
    }

    public void setOrdAmt(String ordAmt) {
        this.ordAmt = ordAmt;
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
