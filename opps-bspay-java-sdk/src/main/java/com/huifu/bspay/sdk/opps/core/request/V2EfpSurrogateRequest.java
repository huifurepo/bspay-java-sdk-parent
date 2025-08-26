package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 全渠道资金付款申请
 *
 * @author sdk-generator
 * @Description
 */
public class V2EfpSurrogateRequest extends BaseRequest {

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
     * 商户汇付id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 交易金额.单位:元，2位小数
     */
    @JSONField(name = "cash_amt")
    private String cashAmt;
    /**
     * 银行账号使用斗拱系统的公钥对银行账号进行RSA加密得到秘文；  示例值：b9LE5RccVVLChrHgo9lvp……PhWhjKrWg2NPfbe0mkQ&#x3D;&#x3D; 到账类型标识为E或P时必填
     */
    @JSONField(name = "card_no")
    private String cardNo;
    /**
     * 银行编号银行编号 到账类型标识为E或P时必填
     */
    @JSONField(name = "bank_code")
    private String bankCode;
    /**
     * 银行卡用户名银行卡用户名 到账类型标识为E或P时必填
     */
    @JSONField(name = "card_name")
    private String cardName;
    /**
     * 到账类型标识
     */
    @JSONField(name = "card_acct_type")
    private String cardAcctType;
    /**
     * 省份到账类型标识为E或P时必填
     */
    @JSONField(name = "prov_id")
    private String provId;
    /**
     * 地区到账类型标识为E或P时必填
     */
    @JSONField(name = "area_id")
    private String areaId;
    /**
     * 手机号对私必填，使用斗拱系统的公钥对手机号进行RSA加密得到秘文；  示例值：b9LE5RccVVLChrHgo9lvp……PhWhjKrWg2NPfbe0mkUDd
     */
    @JSONField(name = "mobile_no")
    private String mobileNo;
    /**
     * 证件类型证件类型01：身份证  03：护照  06：港澳通行证  07：台湾通行证  09：外国人居留证  11：营业执照  12：组织机构代码证  14：统一社会信用代码  99：其他  示例值：14 到账类型标识为E或P时必填
     */
    @JSONField(name = "cert_type")
    private String certType;
    /**
     * 证件号使用斗拱系统的公钥对证件号进行RSA加密得到秘文；  示例值：b9LE5RccVVLChrHgo9lvp……PhWhjKrWg2NPfbe0mkQ 到账类型标识为P时必填
     */
    @JSONField(name = "cert_no")
    private String certNo;
    /**
     * 统一社会信用代码到账类型标识为E时必填
     */
    @JSONField(name = "licence_code")
    private String licenceCode;
    /**
     * 入账接收方对象json格式,到账类型标识为H时必填
     */
    @JSONField(name = "acct_split_bunch")
    private String acctSplitBunch;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_EFP_SURROGATE;
    }

    public V2EfpSurrogateRequest() {
    }

    public V2EfpSurrogateRequest(String reqSeqId, String reqDate, String huifuId, String cashAmt, String cardNo, String bankCode, String cardName, String cardAcctType, String provId, String areaId, String mobileNo, String certType, String certNo, String licenceCode, String acctSplitBunch) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.cashAmt = cashAmt;
        this.cardNo = cardNo;
        this.bankCode = bankCode;
        this.cardName = cardName;
        this.cardAcctType = cardAcctType;
        this.provId = provId;
        this.areaId = areaId;
        this.mobileNo = mobileNo;
        this.certType = certType;
        this.certNo = certNo;
        this.licenceCode = licenceCode;
        this.acctSplitBunch = acctSplitBunch;
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

    public String getCashAmt() {
        return cashAmt;
    }

    public void setCashAmt(String cashAmt) {
        this.cashAmt = cashAmt;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardAcctType() {
        return cardAcctType;
    }

    public void setCardAcctType(String cardAcctType) {
        this.cardAcctType = cardAcctType;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getLicenceCode() {
        return licenceCode;
    }

    public void setLicenceCode(String licenceCode) {
        this.licenceCode = licenceCode;
    }

    public String getAcctSplitBunch() {
        return acctSplitBunch;
    }

    public void setAcctSplitBunch(String acctSplitBunch) {
        this.acctSplitBunch = acctSplitBunch;
    }

}
