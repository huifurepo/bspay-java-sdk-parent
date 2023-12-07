package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 代扣支付
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeOnlinepaymentWithholdpayRequest extends BaseRequest {

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 用户客户号
     */
    @JSONField(name = "user_huifu_id")
    private String userHuifuId;
    /**
     * 绑卡id
     */
    @JSONField(name = "card_bind_id")
    private String cardBindId;
    /**
     * 订单金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;
    /**
     * 商品描述
     */
    @JSONField(name = "goods_desc")
    private String goodsDesc;
    /**
     * 代扣类型
     */
    @JSONField(name = "withhold_type")
    private String withholdType;
    /**
     * 银行扩展数据
     */
    @JSONField(name = "extend_pay_data")
    private String extendPayData;
    /**
     * 风控信息
     */
    @JSONField(name = "risk_check_data")
    private String riskCheckData;
    /**
     * 设备信息数据
     */
    @JSONField(name = "terminal_device_data")
    private String terminalDeviceData;
    /**
     * 异步通知地址
     */
    @JSONField(name = "notify_url")
    private String notifyUrl;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ONLINEPAYMENT_WITHHOLDPAY;
    }

    public V2TradeOnlinepaymentWithholdpayRequest() {
    }

    public V2TradeOnlinepaymentWithholdpayRequest(String reqDate, String reqSeqId, String huifuId, String userHuifuId, String cardBindId, String transAmt, String goodsDesc, String withholdType, String extendPayData, String riskCheckData, String terminalDeviceData, String notifyUrl) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.userHuifuId = userHuifuId;
        this.cardBindId = cardBindId;
        this.transAmt = transAmt;
        this.goodsDesc = goodsDesc;
        this.withholdType = withholdType;
        this.extendPayData = extendPayData;
        this.riskCheckData = riskCheckData;
        this.terminalDeviceData = terminalDeviceData;
        this.notifyUrl = notifyUrl;
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

    public String getUserHuifuId() {
        return userHuifuId;
    }

    public void setUserHuifuId(String userHuifuId) {
        this.userHuifuId = userHuifuId;
    }

    public String getCardBindId() {
        return cardBindId;
    }

    public void setCardBindId(String cardBindId) {
        this.cardBindId = cardBindId;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getWithholdType() {
        return withholdType;
    }

    public void setWithholdType(String withholdType) {
        this.withholdType = withholdType;
    }

    public String getExtendPayData() {
        return extendPayData;
    }

    public void setExtendPayData(String extendPayData) {
        this.extendPayData = extendPayData;
    }

    public String getRiskCheckData() {
        return riskCheckData;
    }

    public void setRiskCheckData(String riskCheckData) {
        this.riskCheckData = riskCheckData;
    }

    public String getTerminalDeviceData() {
        return terminalDeviceData;
    }

    public void setTerminalDeviceData(String terminalDeviceData) {
        this.terminalDeviceData = terminalDeviceData;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

}
