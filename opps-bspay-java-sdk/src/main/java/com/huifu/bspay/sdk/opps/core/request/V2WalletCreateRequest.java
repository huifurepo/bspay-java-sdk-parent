package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 钱包开户
 *
 * @author sdk-generator
 * @Description
 */
public class V2WalletCreateRequest extends BaseRequest {

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 个人姓名钱包账户开户人的本人真实姓名；wallet_type&#x3D;1时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：张三&lt;/font&gt;
     */
    @JSONField(name = "name")
    private String name;
    /**
     * 钱包绑定手机号
     */
    @JSONField(name = "mobile_no")
    private String mobileNo;
    /**
     * 手机短信验证码
     */
    @JSONField(name = "verify_code")
    private String verifyCode;
    /**
     * 短信验证流水号
     */
    @JSONField(name = "verify_seq_id")
    private String verifySeqId;
    /**
     * 跳转地址
     */
    @JSONField(name = "front_url")
    private String frontUrl;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_WALLET_CREATE;
    }

    public V2WalletCreateRequest() {
    }

    public V2WalletCreateRequest(String reqSeqId, String reqDate, String huifuId, String name, String mobileNo, String verifyCode, String verifySeqId, String frontUrl) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.name = name;
        this.mobileNo = mobileNo;
        this.verifyCode = verifyCode;
        this.verifySeqId = verifySeqId;
        this.frontUrl = frontUrl;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getVerifySeqId() {
        return verifySeqId;
    }

    public void setVerifySeqId(String verifySeqId) {
        this.verifySeqId = verifySeqId;
    }

    public String getFrontUrl() {
        return frontUrl;
    }

    public void setFrontUrl(String frontUrl) {
        this.frontUrl = frontUrl;
    }

}
