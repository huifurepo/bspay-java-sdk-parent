package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 灵工个人用户修改
 *
 * @author sdk-generator
 * @Description
 */
public class V2FlexibleIndvModifyRequest extends BaseRequest {

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
     * 渠道商/商户汇付Id
     */
    @JSONField(name = "upper_huifu_id")
    private String upperHuifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_FLEXIBLE_INDV_MODIFY;
    }

    public V2FlexibleIndvModifyRequest() {
    }

    public V2FlexibleIndvModifyRequest(String reqSeqId, String reqDate, String upperHuifuId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.upperHuifuId = upperHuifuId;
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

    public String getUpperHuifuId() {
        return upperHuifuId;
    }

    public void setUpperHuifuId(String upperHuifuId) {
        this.upperHuifuId = upperHuifuId;
    }

}
