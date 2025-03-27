package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 全渠道资金提现申请
 *
 * @author sdk-generator
 * @Description
 */
public class V2EfpEncashRequest extends BaseRequest {

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
     * 商户汇付id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 交易金额.单位:元，2位小数
     */
    @JSONField(name = "cash_amt")
    private String cashAmt;
    /**
     * 取现卡序列号
     */
    @JSONField(name = "token_no")
    private String tokenNo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_EFP_ENCASH;
    }

    public V2EfpEncashRequest() {
    }

    public V2EfpEncashRequest(String reqSeqId, String reqDate, String huifuId, String cashAmt, String tokenNo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.cashAmt = cashAmt;
        this.tokenNo = tokenNo;
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

    public String getCashAmt() {
        return cashAmt;
    }

    public void setCashAmt(String cashAmt) {
        this.cashAmt = cashAmt;
    }

    public String getTokenNo() {
        return tokenNo;
    }

    public void setTokenNo(String tokenNo) {
        this.tokenNo = tokenNo;
    }

}
