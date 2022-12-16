package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 余额支付
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeAcctpaymentPayRequest extends BaseRequest {

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
     * 出款方商户号
     */
    @JSONField(name = "out_huifu_id")
    private String outHuifuId;
    /**
     * 支付金额
     */
    @JSONField(name = "ord_amt")
    private String ordAmt;
    /**
     * 分账对象
     */
    @JSONField(name = "acct_split_bunch")
    private String acctSplitBunch;
    /**
     * 安全信息
     */
    @JSONField(name = "risk_check_data")
    private String riskCheckData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ACCTPAYMENT_PAY;
    }

    public V2TradeAcctpaymentPayRequest() {
    }

    public V2TradeAcctpaymentPayRequest(String reqSeqId, String reqDate, String outHuifuId, String ordAmt, String acctSplitBunch, String riskCheckData) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.outHuifuId = outHuifuId;
        this.ordAmt = ordAmt;
        this.acctSplitBunch = acctSplitBunch;
        this.riskCheckData = riskCheckData;
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

    public String getOutHuifuId() {
        return outHuifuId;
    }

    public void setOutHuifuId(String outHuifuId) {
        this.outHuifuId = outHuifuId;
    }

    public String getOrdAmt() {
        return ordAmt;
    }

    public void setOrdAmt(String ordAmt) {
        this.ordAmt = ordAmt;
    }

    public String getAcctSplitBunch() {
        return acctSplitBunch;
    }

    public void setAcctSplitBunch(String acctSplitBunch) {
        this.acctSplitBunch = acctSplitBunch;
    }

    public String getRiskCheckData() {
        return riskCheckData;
    }

    public void setRiskCheckData(String riskCheckData) {
        this.riskCheckData = riskCheckData;
    }

}
