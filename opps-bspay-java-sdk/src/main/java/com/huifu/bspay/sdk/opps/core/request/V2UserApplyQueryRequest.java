package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 用户申请单状态查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2UserApplyQueryRequest extends BaseRequest {

    /**
     * 汇付客户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
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
     * 申请单号
     */
    @JSONField(name = "apply_no")
    private String applyNo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_USER_APPLY_QUERY;
    }

    public V2UserApplyQueryRequest() {
    }

    public V2UserApplyQueryRequest(String huifuId, String reqSeqId, String reqDate, String applyNo) {
        this.huifuId = huifuId;
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.applyNo = applyNo;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
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

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

}
