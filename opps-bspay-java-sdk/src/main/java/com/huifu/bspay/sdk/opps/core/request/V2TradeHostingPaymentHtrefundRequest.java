package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 托管交易退款
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeHostingPaymentHtrefundRequest extends BaseRequest {

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
     * 申请退款金额
     */
    @JSONField(name = "ord_amt")
    private String ordAmt;
    /**
     * 原交易请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 安全信息线上交易退款必填，参见线上退款接口；jsonObject字符串
     */
    @JSONField(name = "risk_check_data")
    private String riskCheckData;
    /**
     * 设备信息线上交易退款必填，参见线上退款接口；jsonObject字符串
     */
    @JSONField(name = "terminal_device_data")
    private String terminalDeviceData;
    /**
     * 大额转账支付账户信息数据jsonObject格式；银行大额转账支付交易退款申请时必填
     */
    @JSONField(name = "bank_info_data")
    private String bankInfoData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_HOSTING_PAYMENT_HTREFUND;
    }

    public V2TradeHostingPaymentHtrefundRequest() {
    }

    public V2TradeHostingPaymentHtrefundRequest(String reqDate, String reqSeqId, String huifuId, String ordAmt, String orgReqDate, String riskCheckData, String terminalDeviceData, String bankInfoData) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.ordAmt = ordAmt;
        this.orgReqDate = orgReqDate;
        this.riskCheckData = riskCheckData;
        this.terminalDeviceData = terminalDeviceData;
        this.bankInfoData = bankInfoData;
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

    public String getOrgReqDate() {
        return orgReqDate;
    }

    public void setOrgReqDate(String orgReqDate) {
        this.orgReqDate = orgReqDate;
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

    public String getBankInfoData() {
        return bankInfoData;
    }

    public void setBankInfoData(String bankInfoData) {
        this.bankInfoData = bankInfoData;
    }

}
