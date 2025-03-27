package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * E账户账务明细查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePaymentZxeAcctdetailQueryRequest extends BaseRequest {

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
     * 商户号/用户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 交易日期
     */
    @JSONField(name = "trans_date")
    private String transDate;
    /**
     * 交易类型
     */
    @JSONField(name = "trans_type")
    private String transType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_ZXE_ACCTDETAIL_QUERY;
    }

    public V2TradePaymentZxeAcctdetailQueryRequest() {
    }

    public V2TradePaymentZxeAcctdetailQueryRequest(String reqDate, String reqSeqId, String huifuId, String transDate, String transType) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.transDate = transDate;
        this.transType = transType;
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

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

}
