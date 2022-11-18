package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 交易查询接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePaymentScanpayQueryRequest extends BaseRequest {

    /**
     * 原机构请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 商户订单号线下POS、扫码机具发起的交易需要提供；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：22577563652260773965&lt;/font&gt;
     */
    @JSONField(name = "mer_ord_id")
    private String merOrdId;
    /**
     * 交易返回的全局流水号org_hf_seq_id，org_req_seq_id，out_trans_id，party_order_id四选一；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：00290TOP1GR210919004230P853ac13262200000&lt;/font&gt;
     */
    @JSONField(name = "org_hf_seq_id")
    private String orgHfSeqId;
    /**
     * 原机构请求流水号org_hf_seq_id，org_req_seq_id，out_trans_id，party_order_id四选一；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：202110210012100005&lt;/font&gt;
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 用户账单上的交易订单号org_hf_seq_id，org_req_seq_id，out_trans_id，party_order_id四选一；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：092021091922001451301445517582&lt;/font&gt;；参见[用户账单说明](https://paas.huifu.com/partners/api/#/czsm/api_czsm_yhzd)
     */
    @JSONField(name = "out_trans_id")
    private String outTransId;
    /**
     * 用户账单上的商户订单号org_hf_seq_id，org_req_seq_id，out_trans_id，party_order_id四选一；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：03232109190255105603561&lt;/font&gt;；参见[用户账单说明](https://paas.huifu.com/partners/api/#/czsm/api_czsm_yhzd)
     */
    @JSONField(name = "party_order_id")
    private String partyOrderId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_SCANPAY_QUERY;
    }

    public V2TradePaymentScanpayQueryRequest() {
    }

    public V2TradePaymentScanpayQueryRequest(String orgReqDate, String huifuId, String merOrdId, String orgHfSeqId, String orgReqSeqId, String outTransId, String partyOrderId) {
        this.orgReqDate = orgReqDate;
        this.huifuId = huifuId;
        this.merOrdId = merOrdId;
        this.orgHfSeqId = orgHfSeqId;
        this.orgReqSeqId = orgReqSeqId;
        this.outTransId = outTransId;
        this.partyOrderId = partyOrderId;
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

    public String getMerOrdId() {
        return merOrdId;
    }

    public void setMerOrdId(String merOrdId) {
        this.merOrdId = merOrdId;
    }

    public String getOrgHfSeqId() {
        return orgHfSeqId;
    }

    public void setOrgHfSeqId(String orgHfSeqId) {
        this.orgHfSeqId = orgHfSeqId;
    }

    public String getOrgReqSeqId() {
        return orgReqSeqId;
    }

    public void setOrgReqSeqId(String orgReqSeqId) {
        this.orgReqSeqId = orgReqSeqId;
    }

    public String getOutTransId() {
        return outTransId;
    }

    public void setOutTransId(String outTransId) {
        this.outTransId = outTransId;
    }

    public String getPartyOrderId() {
        return partyOrderId;
    }

    public void setPartyOrderId(String partyOrderId) {
        this.partyOrderId = partyOrderId;
    }

}
