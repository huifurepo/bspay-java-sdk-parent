package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 电子账户资金清分结果查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeSettlementClearingQueryRequest extends BaseRequest {

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

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_SETTLEMENT_CLEARING_QUERY;
    }

    public V2TradeSettlementClearingQueryRequest() {
    }

    public V2TradeSettlementClearingQueryRequest(String reqDate, String reqSeqId, String fileId) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.fileId = fileId;
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

}
