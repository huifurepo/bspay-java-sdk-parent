package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 上传短信验证码
 *
 * @author sdk-generator
 * @Description
 */
public class V2InvoiceMerVerifycodeUploadRequest extends BaseRequest {

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
     * 开票方汇付ID
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 校验类型
     */
    @JSONField(name = "verify_type")
    private String verifyType;
    /**
     * 流水号
     */
    @JSONField(name = "serial_num")
    private String serialNum;
    /**
     * 验证码
     */
    @JSONField(name = "verify_code")
    private String verifyCode;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_INVOICE_MER_VERIFYCODE_UPLOAD;
    }

    public V2InvoiceMerVerifycodeUploadRequest() {
    }

    public V2InvoiceMerVerifycodeUploadRequest(String reqSeqId, String reqDate, String huifuId, String verifyType, String serialNum, String verifyCode) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.verifyType = verifyType;
        this.serialNum = serialNum;
        this.verifyCode = verifyCode;
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

    public String getVerifyType() {
        return verifyType;
    }

    public void setVerifyType(String verifyType) {
        this.verifyType = verifyType;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

}
