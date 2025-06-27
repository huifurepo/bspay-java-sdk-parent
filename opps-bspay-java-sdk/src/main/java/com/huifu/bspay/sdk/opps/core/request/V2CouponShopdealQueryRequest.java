package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 美团非餐饮获取团购信息
 *
 * @author sdk-generator
 * @Description
 */
public class V2CouponShopdealQueryRequest extends BaseRequest {

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
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 门店绑定流水号
     */
    @JSONField(name = "bind_id")
    private String bindId;
    /**
     * 页码
     */
    @JSONField(name = "offset")
    private String offset;
    /**
     * 页大小
     */
    @JSONField(name = "limit")
    private String limit;
    /**
     * 售卖平台
     */
    @JSONField(name = "source")
    private String source;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_COUPON_SHOPDEAL_QUERY;
    }

    public V2CouponShopdealQueryRequest() {
    }

    public V2CouponShopdealQueryRequest(String reqSeqId, String reqDate, String huifuId, String bindId, String offset, String limit, String source) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.bindId = bindId;
        this.offset = offset;
        this.limit = limit;
        this.source = source;
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

    public String getBindId() {
        return bindId;
    }

    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
