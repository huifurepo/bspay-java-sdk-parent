package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 余额支付退款查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeAcctpaymentRefundQueryRequest extends BaseRequest {

    /**
     * 退款请求流水号
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 余额支付退款请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ACCTPAYMENT_REFUND_QUERY;
    }

    public V2TradeAcctpaymentRefundQueryRequest() {
    }

    public V2TradeAcctpaymentRefundQueryRequest(String orgReqSeqId, String orgReqDate, String huifuId) {
        this.orgReqSeqId = orgReqSeqId;
        this.orgReqDate = orgReqDate;
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

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

}
