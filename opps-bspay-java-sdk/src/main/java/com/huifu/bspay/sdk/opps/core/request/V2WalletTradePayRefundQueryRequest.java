package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 钱包支付退款查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2WalletTradePayRefundQueryRequest extends BaseRequest {

    /**
     * 原退款交易请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 原退款交易请求流水号
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_WALLET_TRADE_PAY_REFUND_QUERY;
    }

    public V2WalletTradePayRefundQueryRequest() {
    }

    public V2WalletTradePayRefundQueryRequest(String orgReqDate, String orgReqSeqId) {
        this.orgReqDate = orgReqDate;
        this.orgReqSeqId = orgReqSeqId;
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

}
