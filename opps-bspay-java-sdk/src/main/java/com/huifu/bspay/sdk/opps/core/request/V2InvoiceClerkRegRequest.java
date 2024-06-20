package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 开票员登记
 *
 * @author sdk-generator
 * @Description
 */
public class V2InvoiceClerkRegRequest extends BaseRequest {

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
     * 开票员登录身份
     */
    @JSONField(name = "clerk_identity")
    private String clerkIdentity;
    /**
     * 登录账号
     */
    @JSONField(name = "login_account")
    private String loginAccount;
    /**
     * 登录密码
     */
    @JSONField(name = "login_password")
    private String loginPassword;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_INVOICE_CLERK_REG;
    }

    public V2InvoiceClerkRegRequest() {
    }

    public V2InvoiceClerkRegRequest(String reqSeqId, String reqDate, String huifuId, String clerkIdentity, String loginAccount, String loginPassword) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.clerkIdentity = clerkIdentity;
        this.loginAccount = loginAccount;
        this.loginPassword = loginPassword;
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

    public String getClerkIdentity() {
        return clerkIdentity;
    }

    public void setClerkIdentity(String clerkIdentity) {
        this.clerkIdentity = clerkIdentity;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

}
