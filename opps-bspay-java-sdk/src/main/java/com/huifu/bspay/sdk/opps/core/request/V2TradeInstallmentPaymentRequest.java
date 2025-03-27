package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 分期支付
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeInstallmentPaymentRequest extends BaseRequest {

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
     * 交易金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;
    /**
     * 分期数
     */
    @JSONField(name = "installment_num")
    private String installmentNum;
    /**
     * 商品描述
     */
    @JSONField(name = "goods_desc")
    private String goodsDesc;
    /**
     * 安全信息
     */
    @JSONField(name = "risk_check_data")
    private String riskCheckData;
    /**
     * 京东白条分期信息trans_type&#x3D;JDBT时，必填jsonObject字符串，京东白条分期相关信息通过该参数集上送
     */
    @JSONField(name = "jdbt_data")
    private String jdbtData;
    /**
     * 银联聚分期信息trans_type&#x3D;YLJFQ-银联聚分期时，必填jsonObject字符串，银联聚分期相关信息通过该参数集上送
     */
    @JSONField(name = "yljfq_data")
    private String yljfqData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_INSTALLMENT_PAYMENT;
    }

    public V2TradeInstallmentPaymentRequest() {
    }

    public V2TradeInstallmentPaymentRequest(String reqDate, String reqSeqId, String huifuId, String transAmt, String installmentNum, String goodsDesc, String riskCheckData, String jdbtData, String yljfqData) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.transAmt = transAmt;
        this.installmentNum = installmentNum;
        this.goodsDesc = goodsDesc;
        this.riskCheckData = riskCheckData;
        this.jdbtData = jdbtData;
        this.yljfqData = yljfqData;
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

    public String getInstallmentNum() {
        return installmentNum;
    }

    public void setInstallmentNum(String installmentNum) {
        this.installmentNum = installmentNum;
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

    public String getJdbtData() {
        return jdbtData;
    }

    public void setJdbtData(String jdbtData) {
        this.jdbtData = jdbtData;
    }

    public String getYljfqData() {
        return yljfqData;
    }

    public void setYljfqData(String yljfqData) {
        this.yljfqData = yljfqData;
    }

}
