package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 确认收货提醒
 *
 * @author sdk-generator
 * @Description
 */
public class V3TradeHostingPaymentReceiptConfirmRequest extends BaseRequest {

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
     * 快递签收时间
     */
    @JSONField(name = "received_time")
    private String receivedTime;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V3_TRADE_HOSTING_PAYMENT_RECEIPT_CONFIRM;
    }

    public V3TradeHostingPaymentReceiptConfirmRequest() {
    }

    public V3TradeHostingPaymentReceiptConfirmRequest(String reqDate, String reqSeqId, String huifuId, String receivedTime) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.receivedTime = receivedTime;
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

    public String getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(String receivedTime) {
        this.receivedTime = receivedTime;
    }

}
