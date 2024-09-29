package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 商户注册
 *
 * @author sdk-generator
 * @Description
 */
public class V2InvoiceMerRegRequest extends BaseRequest {

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
     * 开票方汇付ID
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 纳税人识别号
     */
    @JSONField(name = "tax_payer_id")
    private String taxPayerId;
    /**
     * 销方名称
     */
    @JSONField(name = "tax_payer_name")
    private String taxPayerName;
    /**
     * 公司电话
     */
    @JSONField(name = "tel_no")
    private String telNo;
    /**
     * 公司地址
     */
    @JSONField(name = "reg_address")
    private String regAddress;
    /**
     * 开户银行
     */
    @JSONField(name = "bank_name")
    private String bankName;
    /**
     * 开户账户
     */
    @JSONField(name = "account_no")
    private String accountNo;
    /**
     * 联系人手机号
     */
    @JSONField(name = "contact_phone_no")
    private String contactPhoneNo;
    /**
     * 开票方式
     */
    @JSONField(name = "open_mode")
    private String openMode;
    /**
     * 所属省
     */
    @JSONField(name = "prov_id")
    private String provId;
    /**
     * 所属市
     */
    @JSONField(name = "city_id")
    private String cityId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_INVOICE_MER_REG;
    }

    public V2InvoiceMerRegRequest() {
    }

    public V2InvoiceMerRegRequest(String reqSeqId, String reqDate, String huifuId, String taxPayerId, String taxPayerName, String telNo, String regAddress, String bankName, String accountNo, String contactPhoneNo, String openMode, String provId, String cityId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.taxPayerId = taxPayerId;
        this.taxPayerName = taxPayerName;
        this.telNo = telNo;
        this.regAddress = regAddress;
        this.bankName = bankName;
        this.accountNo = accountNo;
        this.contactPhoneNo = contactPhoneNo;
        this.openMode = openMode;
        this.provId = provId;
        this.cityId = cityId;
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

    public String getTaxPayerId() {
        return taxPayerId;
    }

    public void setTaxPayerId(String taxPayerId) {
        this.taxPayerId = taxPayerId;
    }

    public String getTaxPayerName() {
        return taxPayerName;
    }

    public void setTaxPayerName(String taxPayerName) {
        this.taxPayerName = taxPayerName;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getContactPhoneNo() {
        return contactPhoneNo;
    }

    public void setContactPhoneNo(String contactPhoneNo) {
        this.contactPhoneNo = contactPhoneNo;
    }

    public String getOpenMode() {
        return openMode;
    }

    public void setOpenMode(String openMode) {
        this.openMode = openMode;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

}
