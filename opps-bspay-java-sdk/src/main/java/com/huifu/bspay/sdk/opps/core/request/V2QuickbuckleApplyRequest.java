package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 快捷绑卡申请接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2QuickbuckleApplyRequest extends BaseRequest {

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
     * 汇付客户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 商户用户id
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
     * 个人证件有效期到期日长期有效不填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20420905&lt;/font&gt;
     */
    @JSONField(name = "cert_end_date")
    private String certEndDate;
    /**
     * 银行卡绑定手机号
     */
    @JSONField(name = "card_mp")
    private String cardMp;
    /**
     * CVV2信用卡交易专用需要密文传输。&lt;br/&gt;使用商户RSA私钥加密(加密前3位，加密后最长2048位），[参见参考文档](https://paas.huifu.com/partners/guide/#/api_jiami_jiemi)；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：Ly+fnExeyPOTzfOtgRRur77nJB9TAe4PGgK9M……fc6XJXZss&#x3D;&lt;/font&gt;
     */
    @JSONField(name = "vip_code")
    private String vipCode;
    /**
     * 卡有效期信用卡交易专用，格式：MMYY，需要密文传输；&lt;br/&gt;使用商户RSA私钥加密(加密前4位，加密后最长2048位），[参见参考文档](https://paas.huifu.com/partners/guide/#/api_jiami_jiemi)；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：Ly+fnExeyPOTzfOtgRRur77nJB9TAe4PGgK9M……fc6XJXZss&#x3D;JXZss&#x3D;&lt;/font&gt;
     */
    @JSONField(name = "expiration")
    private String expiration;
    /**
     * 挂网协议编号授权信息(招行绑卡需要上送)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：34463343&lt;/font&gt;
     */
    @JSONField(name = "protocol_no")
    private String protocolNo;
    /**
     * 设备信息域 
     */
    @JSONField(name = "trx_device_inf")
    private String trxDeviceInf;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_QUICKBUCKLE_APPLY;
    }

    public V2QuickbuckleApplyRequest() {
    }

    public V2QuickbuckleApplyRequest(String reqDate, String reqSeqId, String huifuId, String outCustId, String orderId, String orderDate, String cardId, String cardName, String certType, String certId, String certValidityType, String certBeginDate, String certEndDate, String cardMp, String vipCode, String expiration, String protocolNo, String trxDeviceInf) {
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
        this.certValidityType = certValidityType;
        this.certBeginDate = certBeginDate;
        this.certEndDate = certEndDate;
        this.cardMp = cardMp;
        this.vipCode = vipCode;
        this.expiration = expiration;
        this.protocolNo = protocolNo;
        this.trxDeviceInf = trxDeviceInf;
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

    public String getProtocolNo() {
        return protocolNo;
    }

    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
    }

    public String getTrxDeviceInf() {
        return trxDeviceInf;
    }

    public void setTrxDeviceInf(String trxDeviceInf) {
        this.trxDeviceInf = trxDeviceInf;
    }

}
