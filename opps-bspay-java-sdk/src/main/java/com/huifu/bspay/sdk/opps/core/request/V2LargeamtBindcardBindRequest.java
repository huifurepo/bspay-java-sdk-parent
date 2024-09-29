package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 银行大额支付绑卡
 *
 * @author sdk-generator
 * @Description
 */
public class V2LargeamtBindcardBindRequest extends BaseRequest {

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
     * 卡类型
     */
    @JSONField(name = "card_type")
    private String cardType;
    /**
     * 银行账户名
     */
    @JSONField(name = "card_name")
    private String cardName;
    /**
     * 银行卡号密文
     */
    @JSONField(name = "card_no")
    private String cardNo;
    /**
     * 银行编码
     */
    @JSONField(name = "bank_code")
    private String bankCode;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_LARGEAMT_BINDCARD_BIND;
    }

    public V2LargeamtBindcardBindRequest() {
    }

    public V2LargeamtBindcardBindRequest(String reqSeqId, String reqDate, String huifuId, String cardType, String cardName, String cardNo, String bankCode) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.cardType = cardType;
        this.cardName = cardName;
        this.cardNo = cardNo;
        this.bankCode = bankCode;
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

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
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

}
