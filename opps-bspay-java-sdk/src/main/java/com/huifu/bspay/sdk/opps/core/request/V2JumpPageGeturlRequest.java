package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 获取控台页面跳转链接
 *
 * @author sdk-generator
 * @Description
 */
public class V2JumpPageGeturlRequest extends BaseRequest {

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
     * 外部系统用户标识
     */
    @JSONField(name = "external_user_id")
    private String externalUserId;
    /**
     * 功能菜单
     */
    @JSONField(name = "jump_function_type")
    private String jumpFunctionType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_JUMP_PAGE_GETURL;
    }

    public V2JumpPageGeturlRequest() {
    }

    public V2JumpPageGeturlRequest(String reqSeqId, String reqDate, String huifuId, String externalUserId, String jumpFunctionType) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.externalUserId = externalUserId;
        this.jumpFunctionType = jumpFunctionType;
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

    public String getExternalUserId() {
        return externalUserId;
    }

    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }

    public String getJumpFunctionType() {
        return jumpFunctionType;
    }

    public void setJumpFunctionType(String jumpFunctionType) {
        this.jumpFunctionType = jumpFunctionType;
    }

}
