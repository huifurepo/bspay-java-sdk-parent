package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 银行大额转账关单
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeOnlinepaymentTransferAccountCloseRequest extends BaseRequest {

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
     * 原请求流水号
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 原请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 入账标识
     */
    @JSONField(name = "in_acct_flag")
    private String inAcctFlag;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ONLINEPAYMENT_TRANSFER_ACCOUNT_CLOSE;
    }

    public V2TradeOnlinepaymentTransferAccountCloseRequest() {
    }

    public V2TradeOnlinepaymentTransferAccountCloseRequest(String reqSeqId, String reqDate, String huifuId, String orgReqSeqId, String orgReqDate, String inAcctFlag) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.orgReqSeqId = orgReqSeqId;
        this.orgReqDate = orgReqDate;
        this.inAcctFlag = inAcctFlag;
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

    public String getOrgReqSeqId() {
        return orgReqSeqId;
    }

    public void setOrgReqSeqId(String orgReqSeqId) {
        this.orgReqSeqId = orgReqSeqId;
    }

    public String getOrgReqDate() {
        return orgReqDate;
    }

    public void setOrgReqDate(String orgReqDate) {
        this.orgReqDate = orgReqDate;
    }

    public String getInAcctFlag() {
        return inAcctFlag;
    }

    public void setInAcctFlag(String inAcctFlag) {
        this.inAcctFlag = inAcctFlag;
    }

}
