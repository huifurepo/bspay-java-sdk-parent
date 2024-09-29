package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 企业账单退款
 *
 * @author sdk-generator
 * @Description
 */
public class V2BillEntRefundRequest extends BaseRequest {

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
     * 账单编号
     */
    @JSONField(name = "bill_no")
    private String billNo;
    /**
     * 退款金额
     */
    @JSONField(name = "refund_amt")
    private String refundAmt;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_BILL_ENT_REFUND;
    }

    public V2BillEntRefundRequest() {
    }

    public V2BillEntRefundRequest(String reqSeqId, String reqDate, String huifuId, String billNo, String refundAmt) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.billNo = billNo;
        this.refundAmt = refundAmt;
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

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getRefundAmt() {
        return refundAmt;
    }

    public void setRefundAmt(String refundAmt) {
        this.refundAmt = refundAmt;
    }

}
