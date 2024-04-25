package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 一键绑卡-工行卡号查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2QuickbuckleBindCardinfoQueryRequest extends BaseRequest {

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
     * 产品Id
     */
    @JSONField(name = "product_id")
    private String productId;
    /**
     * 银行卡开户姓名
     */
    @JSONField(name = "card_name")
    private String cardName;
    /**
     * 身份证类型
     */
    @JSONField(name = "cert_type")
    private String certType;
    /**
     * 银行卡绑定身份证
     */
    @JSONField(name = "cert_no")
    private String certNo;
    /**
     * 银行卡绑定手机号
     */
    @JSONField(name = "card_mobile")
    private String cardMobile;
    /**
     * 回调地址
     */
    @JSONField(name = "notify_url")
    private String notifyUrl;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_QUICKBUCKLE_BIND_CARDINFO_QUERY;
    }

    public V2QuickbuckleBindCardinfoQueryRequest() {
    }

    public V2QuickbuckleBindCardinfoQueryRequest(String reqSeqId, String reqDate, String huifuId, String productId, String cardName, String certType, String certNo, String cardMobile, String notifyUrl) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.productId = productId;
        this.cardName = cardName;
        this.certType = certType;
        this.certNo = certNo;
        this.cardMobile = cardMobile;
        this.notifyUrl = notifyUrl;
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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
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

    public String getCardMobile() {
        return cardMobile;
    }

    public void setCardMobile(String cardMobile) {
        this.cardMobile = cardMobile;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

}
