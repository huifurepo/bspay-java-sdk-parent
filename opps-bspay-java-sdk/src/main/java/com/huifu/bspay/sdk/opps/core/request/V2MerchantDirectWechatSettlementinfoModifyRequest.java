package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 微信直连-修改微信结算帐号
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantDirectWechatSettlementinfoModifyRequest extends BaseRequest {

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
     * 汇付ID
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 开发者的应用ID
     */
    @JSONField(name = "app_id")
    private String appId;
    /**
     * 微信商户号
     */
    @JSONField(name = "mch_id")
    private String mchId;
    /**
     * 特约商户号
     */
    @JSONField(name = "sub_mchid")
    private String subMchid;
    /**
     * 账户类型
     */
    @JSONField(name = "account_type")
    private String accountType;
    /**
     * 开户银行
     */
    @JSONField(name = "account_bank")
    private String accountBank;
    /**
     * 开户银行省市编码
     */
    @JSONField(name = "bank_address_code")
    private String bankAddressCode;
    /**
     * 银行账号
     */
    @JSONField(name = "account_number")
    private String accountNumber;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_DIRECT_WECHAT_SETTLEMENTINFO_MODIFY;
    }

    public V2MerchantDirectWechatSettlementinfoModifyRequest() {
    }

    public V2MerchantDirectWechatSettlementinfoModifyRequest(String reqSeqId, String reqDate, String huifuId, String appId, String mchId, String subMchid, String accountType, String accountBank, String bankAddressCode, String accountNumber) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.appId = appId;
        this.mchId = mchId;
        this.subMchid = subMchid;
        this.accountType = accountType;
        this.accountBank = accountBank;
        this.bankAddressCode = bankAddressCode;
        this.accountNumber = accountNumber;
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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getSubMchid() {
        return subMchid;
    }

    public void setSubMchid(String subMchid) {
        this.subMchid = subMchid;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank;
    }

    public String getBankAddressCode() {
        return bankAddressCode;
    }

    public void setBankAddressCode(String bankAddressCode) {
        this.bankAddressCode = bankAddressCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
