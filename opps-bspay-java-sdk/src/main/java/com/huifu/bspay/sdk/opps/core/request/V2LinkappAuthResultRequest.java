package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 授权结果查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2LinkappAuthResultRequest extends BaseRequest {

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
     * 平台类型
     */
    @JSONField(name = "platform_type")
    private String platformType;
    /**
     * 授权请求ID
     */
    @JSONField(name = "auth_seq_id")
    private String authSeqId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_LINKAPP_AUTH_RESULT;
    }

    public V2LinkappAuthResultRequest() {
    }

    public V2LinkappAuthResultRequest(String reqSeqId, String reqDate, String huifuId, String platformType, String authSeqId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.platformType = platformType;
        this.authSeqId = authSeqId;
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

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getAuthSeqId() {
        return authSeqId;
    }

    public void setAuthSeqId(String authSeqId) {
        this.authSeqId = authSeqId;
    }

}
