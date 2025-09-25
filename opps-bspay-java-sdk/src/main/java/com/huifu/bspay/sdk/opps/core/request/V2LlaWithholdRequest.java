package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 代运营佣金代扣
 *
 * @author sdk-generator
 * @Description
 */
public class V2LlaWithholdRequest extends BaseRequest {

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
     * 代运营汇付id
     */
    @JSONField(name = "agency_huifu_id")
    private String agencyHuifuId;
    /**
     * 商家汇付id
     */
    @JSONField(name = "merchant_huifu_id")
    private String merchantHuifuId;
    /**
     * 平台
     */
    @JSONField(name = "platform_type")
    private String platformType;
    /**
     * 提现id
     */
    @JSONField(name = "encash_seq_id")
    private String encashSeqId;
    /**
     * 绑卡id
     */
    @JSONField(name = "token_no")
    private String tokenNo;
    /**
     * 抽佣金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;
    /**
     * 银行扩展数据
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
        return FunctionCodeEnum.V2_LLA_WITHHOLD;
    }

    public V2LlaWithholdRequest() {
    }

    public V2LlaWithholdRequest(String reqSeqId, String reqDate, String agencyHuifuId, String merchantHuifuId, String platformType, String encashSeqId, String tokenNo, String transAmt, String extendPayData, String terminalDeviceData, String riskCheckData) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.agencyHuifuId = agencyHuifuId;
        this.merchantHuifuId = merchantHuifuId;
        this.platformType = platformType;
        this.encashSeqId = encashSeqId;
        this.tokenNo = tokenNo;
        this.transAmt = transAmt;
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

    public String getAgencyHuifuId() {
        return agencyHuifuId;
    }

    public void setAgencyHuifuId(String agencyHuifuId) {
        this.agencyHuifuId = agencyHuifuId;
    }

    public String getMerchantHuifuId() {
        return merchantHuifuId;
    }

    public void setMerchantHuifuId(String merchantHuifuId) {
        this.merchantHuifuId = merchantHuifuId;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getEncashSeqId() {
        return encashSeqId;
    }

    public void setEncashSeqId(String encashSeqId) {
        this.encashSeqId = encashSeqId;
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
