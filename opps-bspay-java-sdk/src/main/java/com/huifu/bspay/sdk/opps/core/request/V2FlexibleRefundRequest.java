package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 灵工支付退款
 *
 * @author sdk-generator
 * @Description
 */
public class V2FlexibleRefundRequest extends BaseRequest {

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
     * 原请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 原灵工支付交易流水号&lt;font color&#x3D;&quot;green&quot;&gt;示例值：2021091708126665231&lt;/font&gt;
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 原灵工支付汇付全局流水号与原灵工支付交易流水号必选其一&lt;font color&#x3D;&quot;green&quot;&gt;示例值：2021091708126665001&lt;/font&gt;
     */
    @JSONField(name = "org_hf_seq_id")
    private String orgHfSeqId;
    /**
     * 发起方商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 支付金额
     */
    @JSONField(name = "ord_amt")
    private String ordAmt;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_FLEXIBLE_REFUND;
    }

    public V2FlexibleRefundRequest() {
    }

    public V2FlexibleRefundRequest(String reqSeqId, String reqDate, String orgReqDate, String orgReqSeqId, String orgHfSeqId, String huifuId, String ordAmt) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.orgReqDate = orgReqDate;
        this.orgReqSeqId = orgReqSeqId;
        this.orgHfSeqId = orgHfSeqId;
        this.huifuId = huifuId;
        this.ordAmt = ordAmt;
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

    public String getOrgHfSeqId() {
        return orgHfSeqId;
    }

    public void setOrgHfSeqId(String orgHfSeqId) {
        this.orgHfSeqId = orgHfSeqId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getOrdAmt() {
        return ordAmt;
    }

    public void setOrdAmt(String ordAmt) {
        this.ordAmt = ordAmt;
    }

}
