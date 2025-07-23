package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 灵工支付退款查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2FlexibleRefundQueryRequest extends BaseRequest {

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
     * 退款请求流水号
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 退款请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_FLEXIBLE_REFUND_QUERY;
    }

    public V2FlexibleRefundQueryRequest() {
    }

    public V2FlexibleRefundQueryRequest(String reqSeqId, String reqDate, String orgReqSeqId, String orgReqDate, String huifuId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.orgReqSeqId = orgReqSeqId;
        this.orgReqDate = orgReqDate;
        this.huifuId = huifuId;
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

}
