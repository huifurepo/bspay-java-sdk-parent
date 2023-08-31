package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 银行卡代发
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeSettlementSurrogateRequest extends BaseRequest {

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 代发金额
     */
    @JSONField(name = "cash_amt")
    private String cashAmt;
    /**
     * 代发用途描述
     */
    @JSONField(name = "purpose_desc")
    private String purposeDesc;
    /**
     * 省份选填，参见[代发省市地区码](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/area/%E6%96%97%E6%8B%B1%E4%BB%A3%E5%8F%91%E7%9C%81%E4%BB%BD%E5%9C%B0%E5%8C%BA%E7%BC%96%E7%A0%81.xlsx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0013&lt;/font&gt;&lt;br/&gt;对公代发(省份+地区)与联行号信息二选一填入；对私代发非必填；
     */
    @JSONField(name = "province")
    private String province;
    /**
     * 地区选填，参见[代发省市地区码](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/area/%E6%96%97%E6%8B%B1%E4%BB%A3%E5%8F%91%E7%9C%81%E4%BB%BD%E5%9C%B0%E5%8C%BA%E7%BC%96%E7%A0%81.xlsx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1301&lt;/font&gt;&lt;br/&gt;对公代发(省份+地区)与联行号信息二选一填入；对私代发非必填；
     */
    @JSONField(name = "area")
    private String area;
    /**
     * 银行编号
     */
    @JSONField(name = "bank_code")
    private String bankCode;
    /**
     * 联行号选填，参见：[银行支行编码](https://paas.huifu.com/partners/api/#/csfl/api_csfl_yhzhbm) &lt;font color&#x3D;&quot;green&quot;&gt;示例值：102290026507&lt;/font&gt;&lt;br/&gt;对公代发(省份+地区)与联行号信息二选一填入；对私代发非必填；
     */
    @JSONField(name = "correspondent_code")
    private String correspondentCode;
    /**
     * 银行卡用户名
     */
    @JSONField(name = "bank_account_name")
    private String bankAccountName;
    /**
     * 对公对私标识
     */
    @JSONField(name = "card_acct_type")
    private String cardAcctType;
    /**
     * 银行账号密文
     */
    @JSONField(name = "bank_card_no_crypt")
    private String bankCardNoCrypt;
    /**
     * 证件号密文
     */
    @JSONField(name = "certificate_no_crypt")
    private String certificateNoCrypt;
    /**
     * 证件类型
     */
    @JSONField(name = "certificate_type")
    private String certificateType;
    /**
     * 手机号密文
     */
    @JSONField(name = "mobile_no_crypt")
    private String mobileNoCrypt;
    /**
     * 到账日期类型
     */
    @JSONField(name = "into_acct_date_type")
    private String intoAcctDateType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_SETTLEMENT_SURROGATE;
    }

    public V2TradeSettlementSurrogateRequest() {
    }

    public V2TradeSettlementSurrogateRequest(String reqSeqId, String reqDate, String huifuId, String cashAmt, String purposeDesc, String province, String area, String bankCode, String correspondentCode, String bankAccountName, String cardAcctType, String bankCardNoCrypt, String certificateNoCrypt, String certificateType, String mobileNoCrypt, String intoAcctDateType) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.cashAmt = cashAmt;
        this.purposeDesc = purposeDesc;
        this.province = province;
        this.area = area;
        this.bankCode = bankCode;
        this.correspondentCode = correspondentCode;
        this.bankAccountName = bankAccountName;
        this.cardAcctType = cardAcctType;
        this.bankCardNoCrypt = bankCardNoCrypt;
        this.certificateNoCrypt = certificateNoCrypt;
        this.certificateType = certificateType;
        this.mobileNoCrypt = mobileNoCrypt;
        this.intoAcctDateType = intoAcctDateType;
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

    public String getPurposeDesc() {
        return purposeDesc;
    }

    public void setPurposeDesc(String purposeDesc) {
        this.purposeDesc = purposeDesc;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCorrespondentCode() {
        return correspondentCode;
    }

    public void setCorrespondentCode(String correspondentCode) {
        this.correspondentCode = correspondentCode;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getCardAcctType() {
        return cardAcctType;
    }

    public void setCardAcctType(String cardAcctType) {
        this.cardAcctType = cardAcctType;
    }

    public String getBankCardNoCrypt() {
        return bankCardNoCrypt;
    }

    public void setBankCardNoCrypt(String bankCardNoCrypt) {
        this.bankCardNoCrypt = bankCardNoCrypt;
    }

    public String getCertificateNoCrypt() {
        return certificateNoCrypt;
    }

    public void setCertificateNoCrypt(String certificateNoCrypt) {
        this.certificateNoCrypt = certificateNoCrypt;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getMobileNoCrypt() {
        return mobileNoCrypt;
    }

    public void setMobileNoCrypt(String mobileNoCrypt) {
        this.mobileNoCrypt = mobileNoCrypt;
    }

    public String getIntoAcctDateType() {
        return intoAcctDateType;
    }

    public void setIntoAcctDateType(String intoAcctDateType) {
        this.intoAcctDateType = intoAcctDateType;
    }

}
