package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 电子账户资金清分
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeSettlementClearingAddRequest extends BaseRequest {

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
     * 清分文件ID
     */
    @JSONField(name = "file_id")
    private String fileId;
    /**
     * 交易日期
     */
    @JSONField(name = "trans_date")
    private String transDate;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_SETTLEMENT_CLEARING_ADD;
    }

    public V2TradeSettlementClearingAddRequest() {
    }

    public V2TradeSettlementClearingAddRequest(String reqDate, String reqSeqId, String fileId, String transDate) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.fileId = fileId;
        this.transDate = transDate;
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

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

}
