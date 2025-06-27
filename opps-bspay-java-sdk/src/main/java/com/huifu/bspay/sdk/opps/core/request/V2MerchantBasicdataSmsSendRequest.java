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
     * 手机号verify_type&#x3D;&#39;elecAcctSign&#39;时，手机号为空，系统自动取联系人手机号; &lt;font color&#x3D;&quot;green&quot;&gt;示例值：13911111111&lt;/font&gt;
     */
    @JSONField(name = "phone")
    private String phone;
    /**
     * 验证类型
     */
    @JSONField(name = "verify_type")
    private String verifyType;
    /**
     * 操作类型verify_type&#x3D;&#39;elecAcctSign&#39;时必填；枚举值：sendSmsCode-发送验证码；identitySmsCode-验证码核实；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：sendSmsCode&lt;/font&gt;
     */
    @JSONField(name = "operation_type")
    private String operationType;
    /**
     * 验证码verify_type&#x3D;&#39;elecAcctSign&#39;且operation_type&#x3D;&#39;identitySmsCode&#39;时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：123456&lt;/font&gt;
     */
    @JSONField(name = "verify_code")
    private String verifyCode;
    /**
     * 中信签约流水号verify_type&#x3D;&#39;elecAcctSign&#39;且operation_type&#x3D;&#39;identitySmsCode&#39;时必填；值为中信E管家签约发送短信时返回值；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：EMSSBPG2504284593690058431260676&lt;/font&gt;
     */
    @JSONField(name = "elec_acct_sign_seq_id")
    private String elecAcctSignSeqId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BASICDATA_SMS_SEND;
    }

    public V2MerchantBasicdataSmsSendRequest() {
    }

    public V2MerchantBasicdataSmsSendRequest(String reqSeqId, String reqDate, String huifuId, String phone, String verifyType, String operationType, String verifyCode, String elecAcctSignSeqId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.phone = phone;
        this.verifyType = verifyType;
        this.operationType = operationType;
        this.verifyCode = verifyCode;
        this.elecAcctSignSeqId = elecAcctSignSeqId;
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

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getElecAcctSignSeqId() {
        return elecAcctSignSeqId;
    }

    public void setElecAcctSignSeqId(String elecAcctSignSeqId) {
        this.elecAcctSignSeqId = elecAcctSignSeqId;
    }

}
