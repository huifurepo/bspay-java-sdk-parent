package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 银联统一在线收银台
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeOnlinepaymentUnionpayRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
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
     * 订单金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;
    /**
     * 商品描述
     */
    @JSONField(name = "order_desc")
    private String orderDesc;
    /**
     * 安全信息
     */
    @JSONField(name = "risk_check_data")
    private String riskCheckData;
    /**
     * 三方支付数据jsonObject&lt;br/&gt;pay_scene&#x3D;U_JSAPI或pay_scene&#x3D;U_MINIAPP时，必填
     */
    @JSONField(name = "third_pay_data")
    private String thirdPayData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ONLINEPAYMENT_UNIONPAY;
    }

    public V2TradeOnlinepaymentUnionpayRequest() {
    }

    public V2TradeOnlinepaymentUnionpayRequest(String huifuId, String reqDate, String reqSeqId, String transAmt, String orderDesc, String riskCheckData, String thirdPayData) {
        this.huifuId = huifuId;
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.transAmt = transAmt;
        this.orderDesc = orderDesc;
        this.riskCheckData = riskCheckData;
        this.thirdPayData = thirdPayData;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
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

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public String getRiskCheckData() {
        return riskCheckData;
    }

    public void setRiskCheckData(String riskCheckData) {
        this.riskCheckData = riskCheckData;
    }

    public String getThirdPayData() {
        return thirdPayData;
    }

    public void setThirdPayData(String thirdPayData) {
        this.thirdPayData = thirdPayData;
    }

}
