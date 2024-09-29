package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 申诉单详情查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantAppealDetailQueryRequest extends BaseRequest {

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
     * 申诉单号
     */
    @JSONField(name = "appeal_id")
    private String appealId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_APPEAL_DETAIL_QUERY;
    }

    public V2MerchantAppealDetailQueryRequest() {
    }

    public V2MerchantAppealDetailQueryRequest(String reqSeqId, String reqDate, String appealId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.appealId = appealId;
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

    public String getAppealId() {
        return appealId;
    }

    public void setAppealId(String appealId) {
        this.appealId = appealId;
    }

}
