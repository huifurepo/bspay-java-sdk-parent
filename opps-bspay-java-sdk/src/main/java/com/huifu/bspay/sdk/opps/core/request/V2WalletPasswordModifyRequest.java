package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 钱包密码修改
 *
 * @author sdk-generator
 * @Description
 */
public class V2WalletPasswordModifyRequest extends BaseRequest {

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
     * 钱包用户ID
     */
    @JSONField(name = "user_huifu_id")
    private String userHuifuId;
    /**
     * 手机短信验证码
     */
    @JSONField(name = "verify_no")
    private String verifyNo;
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
        return FunctionCodeEnum.V2_WALLET_PASSWORD_MODIFY;
    }

    public V2WalletPasswordModifyRequest() {
    }

    public V2WalletPasswordModifyRequest(String reqSeqId, String reqDate, String huifuId, String userHuifuId, String verifyNo, String verifySeqId, String frontUrl) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.userHuifuId = userHuifuId;
        this.verifyNo = verifyNo;
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

    public String getUserHuifuId() {
        return userHuifuId;
    }

    public void setUserHuifuId(String userHuifuId) {
        this.userHuifuId = userHuifuId;
    }

    public String getVerifyNo() {
        return verifyNo;
    }

    public void setVerifyNo(String verifyNo) {
        this.verifyNo = verifyNo;
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
