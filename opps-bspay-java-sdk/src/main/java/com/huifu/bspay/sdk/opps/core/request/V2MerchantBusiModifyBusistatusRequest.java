package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 商户状态变更
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBusiModifyBusistatusRequest extends BaseRequest {

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
     * 汇付客户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 状态
     */
    @JSONField(name = "status")
    private String status;
    /**
     * 状态变更原因
     */
    @JSONField(name = "upd_status_reason")
    private String updStatusReason;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BUSI_MODIFY_BUSISTATUS;
    }

    public V2MerchantBusiModifyBusistatusRequest() {
    }

    public V2MerchantBusiModifyBusistatusRequest(String reqDate, String reqSeqId, String huifuId, String status, String updStatusReason) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.status = status;
        this.updStatusReason = updStatusReason;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdStatusReason() {
        return updStatusReason;
    }

    public void setUpdStatusReason(String updStatusReason) {
        this.updStatusReason = updStatusReason;
    }

}
