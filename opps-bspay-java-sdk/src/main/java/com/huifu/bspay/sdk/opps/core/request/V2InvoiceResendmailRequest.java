package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 发票邮件重发接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2InvoiceResendmailRequest extends BaseRequest {

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
     * 发票号码
     */
    @JSONField(name = "ivc_number")
    private String ivcNumber;
    /**
     * 重发邮箱地址
     */
    @JSONField(name = "mail_addr")
    private String mailAddr;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_INVOICE_RESENDMAIL;
    }

    public V2InvoiceResendmailRequest() {
    }

    public V2InvoiceResendmailRequest(String reqSeqId, String reqDate, String huifuId, String ivcNumber, String mailAddr) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.ivcNumber = ivcNumber;
        this.mailAddr = mailAddr;
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

    public String getIvcNumber() {
        return ivcNumber;
    }

    public void setIvcNumber(String ivcNumber) {
        this.ivcNumber = ivcNumber;
    }

    public String getMailAddr() {
        return mailAddr;
    }

    public void setMailAddr(String mailAddr) {
        this.mailAddr = mailAddr;
    }

}
