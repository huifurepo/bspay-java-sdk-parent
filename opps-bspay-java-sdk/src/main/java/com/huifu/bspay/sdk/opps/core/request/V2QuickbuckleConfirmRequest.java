package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 快捷/代扣绑卡确认接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2QuickbuckleConfirmRequest extends BaseRequest {

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
     * 汇付商户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 用户id
     */
    @JSONField(name = "out_cust_id")
    private String outCustId;
    /**
     * 订单号
     */
    @JSONField(name = "order_id")
    private String orderId;
    /**
     * 订单日期
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
     * 验证码
     */
    @JSONField(name = "verify_code")
    private String verifyCode;
    /**
     * CVV2信用卡代扣专用需要密文传输，使用商户RSA私钥加密(加密前3位，加密后最长2048位）&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：Ly+fnExeyPOTzfOtgRRur77nJB9TAe4PGgK9MB96o3LW2xINIxSA+B1jXDyvKNmJ5iE3wL+bbNoGd6tQXn6fmrY4vgeX8diCtP0PQVyS4UZkXzH4w8twgI+FduIukqTTl7o5/rrnL3H1HaP/Vutw3yBWrGq0l0NTebfc6XJXZss&#x3D;&lt;/font&gt;
     */
    @JSONField(name = "vip_code")
    private String vipCode;
    /**
     * 卡有效期信用卡代扣专用，格式：MMYY，需要密文传输。&lt;br/&gt;使用商户RSA私钥加密(加密前4位，加密后最长2048位）&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：Ly+fnExeyPOTzfOtgRRur77nJB9TAe4PGgK9MB96o3LW2xINIxSA+B1jXDyvKNmJ5iE3wL+bbNoGd6tQXn6fmrY4vgeX8diCtP0PQVyS4UZkXzH4w8twgI+FduIukqTTl7o5/rrnL3H1HaP/Vutw3yBWrGq0l0NTebfc6XJXZss&#x3D;&lt;/font&gt;
     */
    @JSONField(name = "expiration")
    private String expiration;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_QUICKBUCKLE_CONFIRM;
    }

    public V2QuickbuckleConfirmRequest() {
    }

    public V2QuickbuckleConfirmRequest(String reqDate, String reqSeqId, String huifuId, String outCustId, String orderId, String orderDate, String cardId, String cardName, String certType, String certId, String cardMp, String verifyCode, String vipCode, String expiration) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.outCustId = outCustId;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.cardId = cardId;
        this.cardName = cardName;
        this.certType = certType;
        this.certId = certId;
        this.cardMp = cardMp;
        this.verifyCode = verifyCode;
        this.vipCode = vipCode;
        this.expiration = expiration;
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

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getVipCode() {
        return vipCode;
    }

    public void setVipCode(String vipCode) {
        this.vipCode = vipCode;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

}
