package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 分期扣款
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePayafteruseInstallmentPayRequest extends BaseRequest {

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
     * 客户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 交易金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;
    /**
     * 商品描述
     */
    @JSONField(name = "goods_desc")
    private String goodsDesc;
    /**
     * 风控信息
     */
    @JSONField(name = "risk_check_data")
    private String riskCheckData;
    /**
     * 交易有效期
     */
    @JSONField(name = "time_expire")
    private String timeExpire;
    /**
     * 支付宝扩展参数集合
     */
    @JSONField(name = "alipay_data")
    private String alipayData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYAFTERUSE_INSTALLMENT_PAY;
    }

    public V2TradePayafteruseInstallmentPayRequest() {
    }

    public V2TradePayafteruseInstallmentPayRequest(String reqDate, String reqSeqId, String huifuId, String transAmt, String goodsDesc, String riskCheckData, String timeExpire, String alipayData) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.transAmt = transAmt;
        this.goodsDesc = goodsDesc;
        this.riskCheckData = riskCheckData;
        this.timeExpire = timeExpire;
        this.alipayData = alipayData;
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

    public String getRiskCheckData() {
        return riskCheckData;
    }

    public void setRiskCheckData(String riskCheckData) {
        this.riskCheckData = riskCheckData;
    }

    public String getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    public String getAlipayData() {
        return alipayData;
    }

    public void setAlipayData(String alipayData) {
        this.alipayData = alipayData;
    }

}
