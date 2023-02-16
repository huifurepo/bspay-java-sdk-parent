package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 一键绑卡
 *
 * @author sdk-generator
 * @Description
 */
public class V2QuickbuckleOnekeyCardbindRequest extends BaseRequest {

    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 请求时间
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 汇付Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 顾客用户号 
     */
    @JSONField(name = "out_cust_id")
    private String outCustId;
    /**
     * 银行号
     */
    @JSONField(name = "bank_id")
    private String bankId;
    /**
     * 银行卡开户姓名 
     */
    @JSONField(name = "card_name")
    private String cardName;
    /**
     * 银行卡绑定身份证
     */
    @JSONField(name = "cert_id")
    private String certId;
    /**
     * 银行卡绑定证件类型
     */
    @JSONField(name = "cert_type")
    private String certType;
    /**
     * 证件有效期到期日长期有效不填.格式：yyyyMMdd。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20311111&lt;/font&gt;
     */
    @JSONField(name = "cert_end_date")
    private String certEndDate;
    /**
     * 银行卡绑定手机号 
     */
    @JSONField(name = "card_mp")
    private String cardMp;
    /**
     * 卡的借贷类型
     */
    @JSONField(name = "dc_type")
    private String dcType;
    /**
     * 异步请求地址
     */
    @JSONField(name = "async_return_url")
    private String asyncReturnUrl;
    /**
     * 设备信息域
     */
    @JSONField(name = "trx_device_inf")
    private String trxDeviceInf;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_QUICKBUCKLE_ONEKEY_CARDBIND;
    }

    public V2QuickbuckleOnekeyCardbindRequest() {
    }

    public V2QuickbuckleOnekeyCardbindRequest(String reqSeqId, String reqDate, String huifuId, String outCustId, String bankId, String cardName, String certId, String certType, String certEndDate, String cardMp, String dcType, String asyncReturnUrl, String trxDeviceInf) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.outCustId = outCustId;
        this.bankId = bankId;
        this.cardName = cardName;
        this.certId = certId;
        this.certType = certType;
        this.certEndDate = certEndDate;
        this.cardMp = cardMp;
        this.dcType = dcType;
        this.asyncReturnUrl = asyncReturnUrl;
        this.trxDeviceInf = trxDeviceInf;
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

    public String getOutCustId() {
        return outCustId;
    }

    public void setOutCustId(String outCustId) {
        this.outCustId = outCustId;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertEndDate() {
        return certEndDate;
    }

    public void setCertEndDate(String certEndDate) {
        this.certEndDate = certEndDate;
    }

    public String getCardMp() {
        return cardMp;
    }

    public void setCardMp(String cardMp) {
        this.cardMp = cardMp;
    }

    public String getDcType() {
        return dcType;
    }

    public void setDcType(String dcType) {
        this.dcType = dcType;
    }

    public String getAsyncReturnUrl() {
        return asyncReturnUrl;
    }

    public void setAsyncReturnUrl(String asyncReturnUrl) {
        this.asyncReturnUrl = asyncReturnUrl;
    }

    public String getTrxDeviceInf() {
        return trxDeviceInf;
    }

    public void setTrxDeviceInf(String trxDeviceInf) {
        this.trxDeviceInf = trxDeviceInf;
    }

}
