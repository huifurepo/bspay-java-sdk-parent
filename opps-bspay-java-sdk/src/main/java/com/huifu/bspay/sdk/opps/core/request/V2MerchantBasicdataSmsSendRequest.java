package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 商户短信发送
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBasicdataSmsSendRequest extends BaseRequest {

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
     * 商户汇付Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 手机号
     */
    @JSONField(name = "phone")
    private String phone;
    /**
     * 验证类型
     */
    @JSONField(name = "verify_type")
    private String verifyType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BASICDATA_SMS_SEND;
    }

    public V2MerchantBasicdataSmsSendRequest() {
    }

    public V2MerchantBasicdataSmsSendRequest(String reqSeqId, String reqDate, String huifuId, String phone, String verifyType) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.phone = phone;
        this.verifyType = verifyType;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVerifyType() {
        return verifyType;
    }

    public void setVerifyType(String verifyType) {
        this.verifyType = verifyType;
    }

}
