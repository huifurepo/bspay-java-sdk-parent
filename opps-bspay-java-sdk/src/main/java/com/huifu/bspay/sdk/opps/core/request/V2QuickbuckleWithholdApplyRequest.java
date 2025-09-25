package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 代扣绑卡申请
 *
 * @author sdk-generator
 * @Description
 */
public class V2QuickbuckleWithholdApplyRequest extends BaseRequest {

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
     * 返回地址
     */
    @JSONField(name = "return_url")
    private String returnUrl;
    /**
     * 用户id
     */
    @JSONField(name = "out_cust_id")
    private String outCustId;
    /**
     * 绑卡订单号
     */
    @JSONField(name = "order_id")
    private String orderId;
    /**
     * 绑卡订单日期
     */
    @JSONField(name = "order_date")
    private String orderDate;
    /**
     * 银行卡号
     */
    @JSONField(name = "card_id")
    private String cardId;
    /**
     * 银行卡开户姓名
     */
    @JSONField(name = "card_name")
    private String cardName;
    /**
     * 银行卡绑定证件类型
     */
    @JSONField(name = "cert_type")
    private String certType;
    /**
     * 银行卡绑定身份证
     */
    @JSONField(name = "cert_id")
    private String certId;
    /**
     * 银行卡绑定手机号
     */
    @JSONField(name = "card_mp")
    private String cardMp;
    /**
     * 个人证件有效期类型
     */
    @JSONField(name = "cert_validity_type")
    private String certValidityType;
    /**
     * 个人证件有效期起始日
     */
    @JSONField(name = "cert_begin_date")
    private String certBeginDate;
    /**
     * 卡的借贷类型
     */
    @JSONField(name = "dc_type")
    private String dcType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_QUICKBUCKLE_WITHHOLD_APPLY;
    }

    public V2QuickbuckleWithholdApplyRequest() {
    }

    public V2QuickbuckleWithholdApplyRequest(String reqSeqId, String reqDate, String huifuId, String returnUrl, String outCustId, String orderId, String orderDate, String cardId, String cardName, String certType, String certId, String cardMp, String certValidityType, String certBeginDate, String dcType) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.returnUrl = returnUrl;
        this.outCustId = outCustId;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.cardId = cardId;
        this.cardName = cardName;
        this.certType = certType;
        this.certId = certId;
        this.cardMp = cardMp;
        this.certValidityType = certValidityType;
        this.certBeginDate = certBeginDate;
        this.dcType = dcType;
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

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getOutCustId() {
        return outCustId;
    }

    public void setOutCustId(String outCustId) {
        this.outCustId = outCustId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
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

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public String getCardMp() {
        return cardMp;
    }

    public void setCardMp(String cardMp) {
        this.cardMp = cardMp;
    }

    public String getCertValidityType() {
        return certValidityType;
    }

    public void setCertValidityType(String certValidityType) {
        this.certValidityType = certValidityType;
    }

    public String getCertBeginDate() {
        return certBeginDate;
    }

    public void setCertBeginDate(String certBeginDate) {
        this.certBeginDate = certBeginDate;
    }

    public String getDcType() {
        return dcType;
    }

    public void setDcType(String dcType) {
        this.dcType = dcType;
    }

}
