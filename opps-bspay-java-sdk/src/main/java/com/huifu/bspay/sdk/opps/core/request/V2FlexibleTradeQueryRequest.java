package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 灵工支付查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2FlexibleTradeQueryRequest extends BaseRequest {

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
     * 原请求流水号原请求流水号与原请求全局流水号二选一必填，示例值：2021091708126665001
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 原请求日期原请求流水号必填则原请求日期必填，格式：yyyyMMdd；示例值：20210917
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 原交易全局流水号原请求流水号与原请求全局流水号二选一必填，  &lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值： 003100TOP1A230816150903P990ac139c0600000&lt;/font&gt;
     */
    @JSONField(name = "org_hf_seq_id")
    private String orgHfSeqId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_FLEXIBLE_TRADE_QUERY;
    }

    public V2FlexibleTradeQueryRequest() {
    }

    public V2FlexibleTradeQueryRequest(String reqSeqId, String reqDate, String orgReqSeqId, String orgReqDate, String huifuId, String orgHfSeqId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.orgReqSeqId = orgReqSeqId;
        this.orgReqDate = orgReqDate;
        this.huifuId = huifuId;
        this.orgHfSeqId = orgHfSeqId;
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

    public String getOrgHfSeqId() {
        return orgHfSeqId;
    }

    public void setOrgHfSeqId(String orgHfSeqId) {
        this.orgHfSeqId = orgHfSeqId;
    }

}
