package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 企业账单退款查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2BillEntRefundQueryRequest extends BaseRequest {

    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 请求时间
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 退款请求时间
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 退款请求流水号
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_BILL_ENT_REFUND_QUERY;
    }

    public V2BillEntRefundQueryRequest() {
    }

    public V2BillEntRefundQueryRequest(String reqSeqId, String reqDate, String huifuId, String orgReqDate, String orgReqSeqId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.orgReqDate = orgReqDate;
        this.orgReqSeqId = orgReqSeqId;
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
