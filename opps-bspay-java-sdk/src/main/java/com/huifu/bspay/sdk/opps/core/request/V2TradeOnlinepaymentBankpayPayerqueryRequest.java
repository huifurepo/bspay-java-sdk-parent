package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 网银付款银行账户查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeOnlinepaymentBankpayPayerqueryRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 原交易请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 原交易请求流水号
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
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
     * 原交易汇付全局流水号
     */
    @JSONField(name = "org_hf_seq_id")
    private String orgHfSeqId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ONLINEPAYMENT_BANKPAY_PAYERQUERY;
    }

    public V2TradeOnlinepaymentBankpayPayerqueryRequest() {
    }

    public V2TradeOnlinepaymentBankpayPayerqueryRequest(String huifuId, String orgReqDate, String orgReqSeqId, String reqDate, String reqSeqId, String orgHfSeqId) {
        this.huifuId = huifuId;
        this.orgReqDate = orgReqDate;
        this.orgReqSeqId = orgReqSeqId;
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.orgHfSeqId = orgHfSeqId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getOrgReqDate() {
        return orgReqDate;
    }

    public void setOrgReqDate(String orgReqDate) {
        this.orgReqDate = orgReqDate;
    }

    public String getOrgReqSeqId() {
        return orgReqSeqId;
    }

    public void setOrgReqSeqId(String orgReqSeqId) {
        this.orgReqSeqId = orgReqSeqId;
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

    public String getOrgHfSeqId() {
        return orgHfSeqId;
    }

    public void setOrgHfSeqId(String orgHfSeqId) {
        this.orgHfSeqId = orgHfSeqId;
    }

}
