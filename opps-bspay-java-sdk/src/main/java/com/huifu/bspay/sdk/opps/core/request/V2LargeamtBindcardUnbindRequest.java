package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 银行大额支付解绑
 *
 * @author sdk-generator
 * @Description
 */
public class V2LargeamtBindcardUnbindRequest extends BaseRequest {

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
     * 银行卡号密文
     */
    @JSONField(name = "card_no")
    private String cardNo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_LARGEAMT_BINDCARD_UNBIND;
    }

    public V2LargeamtBindcardUnbindRequest() {
    }

    public V2LargeamtBindcardUnbindRequest(String reqSeqId, String reqDate, String huifuId, String cardNo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.cardNo = cardNo;
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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

}
