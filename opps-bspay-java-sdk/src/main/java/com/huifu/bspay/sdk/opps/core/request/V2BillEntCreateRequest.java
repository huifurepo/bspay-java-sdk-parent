package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 创建企业账单
 *
 * @author sdk-generator
 * @Description
 */
public class V2BillEntCreateRequest extends BaseRequest {

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 付款人
     */
    @JSONField(name = "payer_id")
    private String payerId;
    /**
     * 账单名称
     */
    @JSONField(name = "bill_name")
    private String billName;
    /**
     * 账单金额
     */
    @JSONField(name = "bill_amt")
    private String billAmt;
    /**
     * 可支持的付款方式
     */
    @JSONField(name = "support_pay_type")
    private String supportPayType;
    /**
     * 账单截止日期
     */
    @JSONField(name = "bill_end_date")
    private String billEndDate;
    /**
     * 收款人信息
     */
    @JSONField(name = "payee_info")
    private String payeeInfo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_BILL_ENT_CREATE;
    }

    public V2BillEntCreateRequest() {
    }

    public V2BillEntCreateRequest(String reqSeqId, String reqDate, String huifuId, String payerId, String billName, String billAmt, String supportPayType, String billEndDate, String payeeInfo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.payerId = payerId;
        this.billName = billName;
        this.billAmt = billAmt;
        this.supportPayType = supportPayType;
        this.billEndDate = billEndDate;
        this.payeeInfo = payeeInfo;
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

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(String billAmt) {
        this.billAmt = billAmt;
    }

    public String getSupportPayType() {
        return supportPayType;
    }

    public void setSupportPayType(String supportPayType) {
        this.supportPayType = supportPayType;
    }

    public String getBillEndDate() {
        return billEndDate;
    }

    public void setBillEndDate(String billEndDate) {
        this.billEndDate = billEndDate;
    }

    public String getPayeeInfo() {
        return payeeInfo;
    }

    public void setPayeeInfo(String payeeInfo) {
        this.payeeInfo = payeeInfo;
    }

}
