package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 账务流水查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeAcctpaymentAcctlogQueryRequest extends BaseRequest {

    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 渠道/代理/商户/用户编号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 账务日期
     */
    @JSONField(name = "acct_date")
    private String acctDate;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ACCTPAYMENT_ACCTLOG_QUERY;
    }

    public V2TradeAcctpaymentAcctlogQueryRequest() {
    }

    public V2TradeAcctpaymentAcctlogQueryRequest(String reqSeqId, String huifuId, String acctDate) {
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.acctDate = acctDate;
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

    public String getAcctDate() {
        return acctDate;
    }

    public void setAcctDate(String acctDate) {
        this.acctDate = acctDate;
    }

}
