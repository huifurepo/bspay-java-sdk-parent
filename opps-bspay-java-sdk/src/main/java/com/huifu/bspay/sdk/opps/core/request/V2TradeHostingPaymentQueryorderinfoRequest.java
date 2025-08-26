package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 托管交易查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeHostingPaymentQueryorderinfoRequest extends BaseRequest {

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
     * 商户号开户自动生成；商户号不填时必填party_order_id；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123&lt;/font&gt;
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 原交易请求日期请求格式：yyyyMMdd；该字段不填时必填party_order_id；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20221023&lt;/font&gt;
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 原交易请求流水号该字段不填时必填party_order_id；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：rQ2021121311173944&lt;/font&gt;
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 用户账单上的商户订单号该字段不填时，商户号、原交易请求日期、原交易请求流水号必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：03232109190255105603561&lt;/font&gt;
     */
    @JSONField(name = "party_order_id")
    private String partyOrderId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_HOSTING_PAYMENT_QUERYORDERINFO;
    }

    public V2TradeHostingPaymentQueryorderinfoRequest() {
    }

    public V2TradeHostingPaymentQueryorderinfoRequest(String reqDate, String reqSeqId, String huifuId, String orgReqDate, String orgReqSeqId, String partyOrderId) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.orgReqDate = orgReqDate;
        this.orgReqSeqId = orgReqSeqId;
        this.partyOrderId = partyOrderId;
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

    public String getPartyOrderId() {
        return partyOrderId;
    }

    public void setPartyOrderId(String partyOrderId) {
        this.partyOrderId = partyOrderId;
    }

}
