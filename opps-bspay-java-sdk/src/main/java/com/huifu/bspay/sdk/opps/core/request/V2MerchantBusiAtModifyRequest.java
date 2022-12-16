package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 微信支付宝入驻信息修改
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBusiAtModifyRequest extends BaseRequest {

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
     * AT信息修改列表
     */
    @JSONField(name = "at_reg_list")
    private String atRegList;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BUSI_AT_MODIFY;
    }

    public V2MerchantBusiAtModifyRequest() {
    }

    public V2MerchantBusiAtModifyRequest(String reqSeqId, String reqDate, String atRegList) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.atRegList = atRegList;
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

    public String getAtRegList() {
        return atRegList;
    }

    public void setAtRegList(String atRegList) {
        this.atRegList = atRegList;
    }

}
