package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 银行转账资金流水查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeOnlinepaymentTransferAccountQueryRequest extends BaseRequest {

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
        return FunctionCodeEnum.V2_TRADE_ONLINEPAYMENT_TRANSFER_ACCOUNT_QUERY;
    }

    public V2TradeOnlinepaymentTransferAccountQueryRequest() {
    }

    public V2TradeOnlinepaymentTransferAccountQueryRequest(String reqSeqId, String reqDate, String huifuId, String orgReqSeqId, String orgReqDate, String inAcctFlag, String transStartDate, String transEndDate) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.orgReqSeqId = orgReqSeqId;
        this.orgReqDate = orgReqDate;
        this.inAcctFlag = inAcctFlag;
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
