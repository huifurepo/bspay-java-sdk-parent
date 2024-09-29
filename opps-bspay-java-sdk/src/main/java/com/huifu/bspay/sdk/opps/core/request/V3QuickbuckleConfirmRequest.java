package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 快捷绑卡确认接口
 *
 * @author sdk-generator
 * @Description
 */
public class V3QuickbuckleConfirmRequest extends BaseRequest {

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
     * 汇付商户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 原申请流水号
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 原申请日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 验证码
     */
    @JSONField(name = "verify_code")
    private String verifyCode;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V3_QUICKBUCKLE_CONFIRM;
    }

    public V3QuickbuckleConfirmRequest() {
    }

    public V3QuickbuckleConfirmRequest(String reqDate, String reqSeqId, String huifuId, String orgReqSeqId, String orgReqDate, String verifyCode) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.orgReqSeqId = orgReqSeqId;
        this.orgReqDate = orgReqDate;
        this.verifyCode = verifyCode;
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

    public String getOrgReqSeqId() {
        return orgReqSeqId;
    }

    public void setOrgReqSeqId(String orgReqSeqId) {
        this.orgReqSeqId = orgReqSeqId;
    }

    public String getOrgReqDate() {
        return orgReqDate;
    }

    public void setOrgReqDate(String orgReqDate) {
        this.orgReqDate = orgReqDate;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

}