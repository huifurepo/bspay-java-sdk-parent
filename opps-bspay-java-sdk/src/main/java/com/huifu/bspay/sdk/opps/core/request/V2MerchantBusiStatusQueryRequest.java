package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 统一进件页面版查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBusiStatusQueryRequest extends BaseRequest {

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
     * 门店号
     */
    @JSONField(name = "store_id")
    private String storeId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BUSI_STATUS_QUERY;
    }

    public V2MerchantBusiStatusQueryRequest() {
    }

    public V2MerchantBusiStatusQueryRequest(String reqSeqId, String reqDate, String storeId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.storeId = storeId;
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

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

}
