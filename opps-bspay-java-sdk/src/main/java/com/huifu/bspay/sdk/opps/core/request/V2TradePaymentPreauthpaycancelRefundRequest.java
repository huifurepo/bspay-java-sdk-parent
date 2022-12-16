package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 微信支付宝预授权完成撤销
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePaymentPreauthpaycancelRefundRequest extends BaseRequest {

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
     * 原预授权完成交易请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 完成撤销金额
     */
    @JSONField(name = "ord_amt")
    private String ordAmt;
    /**
     * 风控信息
     */
    @JSONField(name = "risk_check_info")
    private String riskCheckInfo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_PREAUTHPAYCANCEL_REFUND;
    }

    public V2TradePaymentPreauthpaycancelRefundRequest() {
    }

    public V2TradePaymentPreauthpaycancelRefundRequest(String reqDate, String reqSeqId, String huifuId, String orgReqDate, String ordAmt, String riskCheckInfo) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.orgReqDate = orgReqDate;
        this.ordAmt = ordAmt;
        this.riskCheckInfo = riskCheckInfo;
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

    public String getOrgReqDate() {
        return orgReqDate;
    }

    public void setOrgReqDate(String orgReqDate) {
        this.orgReqDate = orgReqDate;
    }

    public String getOrdAmt() {
        return ordAmt;
    }

    public void setOrdAmt(String ordAmt) {
        this.ordAmt = ordAmt;
    }

    public String getRiskCheckInfo() {
        return riskCheckInfo;
    }

    public void setRiskCheckInfo(String riskCheckInfo) {
        this.riskCheckInfo = riskCheckInfo;
    }

}
