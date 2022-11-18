package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 卡bin信息查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeCardbinQueryRequest extends BaseRequest {

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
     * 银行卡号密文
     */
    @JSONField(name = "bank_card_no_crypt")
    private String bankCardNoCrypt;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_CARDBIN_QUERY;
    }

    public V2TradeCardbinQueryRequest() {
    }

    public V2TradeCardbinQueryRequest(String reqDate, String reqSeqId, String bankCardNoCrypt) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.bankCardNoCrypt = bankCardNoCrypt;
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

    public String getBankCardNoCrypt() {
        return bankCardNoCrypt;
    }

    public void setBankCardNoCrypt(String bankCardNoCrypt) {
        this.bankCardNoCrypt = bankCardNoCrypt;
    }

}
