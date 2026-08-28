package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 电子合同重发
 *
 * @author sdk-generator
 * @Description
 */
public class V2InvoiceContractrepeatRequest extends BaseRequest {

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
     * 协议编号
     */
    @JSONField(name = "agreement_id")
    private String agreementId;
    /**
     * 个人邮箱
     */
    @JSONField(name = "sign_user_email")
    private String signUserEmail;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_INVOICE_CONTRACTREPEAT;
    }

    public V2InvoiceContractrepeatRequest() {
    }

    public V2InvoiceContractrepeatRequest(String reqSeqId, String reqDate, String huifuId, String agreementId, String signUserEmail) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.agreementId = agreementId;
        this.signUserEmail = signUserEmail;
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

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public String getSignUserEmail() {
        return signUserEmail;
    }

    public void setSignUserEmail(String signUserEmail) {
        this.signUserEmail = signUserEmail;
    }

}
