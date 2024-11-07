package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 不明来账列表查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePaymentZxeUnknownincomeQueryRequest extends BaseRequest {

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 交易开始日期
     */
    @JSONField(name = "trans_start_date")
    private String transStartDate;
    /**
     * 交易结束日期
     */
    @JSONField(name = "trans_end_date")
    private String transEndDate;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_ZXE_UNKNOWNINCOME_QUERY;
    }

    public V2TradePaymentZxeUnknownincomeQueryRequest() {
    }

    public V2TradePaymentZxeUnknownincomeQueryRequest(String reqSeqId, String reqDate, String huifuId, String transStartDate, String transEndDate) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.transStartDate = transStartDate;
        this.transEndDate = transEndDate;
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

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getTransStartDate() {
        return transStartDate;
    }

    public void setTransStartDate(String transStartDate) {
        this.transStartDate = transStartDate;
    }

    public String getTransEndDate() {
        return transEndDate;
    }

    public void setTransEndDate(String transEndDate) {
        this.transEndDate = transEndDate;
    }

}
