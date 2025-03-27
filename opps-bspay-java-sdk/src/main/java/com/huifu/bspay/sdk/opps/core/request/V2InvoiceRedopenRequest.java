package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 红字发票开具接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2InvoiceRedopenRequest extends BaseRequest {

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
     * 原发票号码
     */
    @JSONField(name = "ori_ivc_number")
    private String oriIvcNumber;
    /**
     * 红冲原因
     */
    @JSONField(name = "red_apply_reason")
    private String redApplyReason;
    /**
     * 红冲申请来源
     */
    @JSONField(name = "red_apply_source")
    private String redApplySource;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_INVOICE_REDOPEN;
    }

    public V2InvoiceRedopenRequest() {
    }

    public V2InvoiceRedopenRequest(String reqSeqId, String reqDate, String huifuId, String oriIvcNumber, String redApplyReason, String redApplySource) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.oriIvcNumber = oriIvcNumber;
        this.redApplyReason = redApplyReason;
        this.redApplySource = redApplySource;
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

    public String getOriIvcNumber() {
        return oriIvcNumber;
    }

    public void setOriIvcNumber(String oriIvcNumber) {
        this.oriIvcNumber = oriIvcNumber;
    }

    public String getRedApplyReason() {
        return redApplyReason;
    }

    public void setRedApplyReason(String redApplyReason) {
        this.redApplyReason = redApplyReason;
    }

    public String getRedApplySource() {
        return redApplySource;
    }

    public void setRedApplySource(String redApplySource) {
        this.redApplySource = redApplySource;
    }

}
