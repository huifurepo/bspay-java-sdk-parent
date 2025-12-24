package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 账单退款接口
 *
 * @author sdk-generator
 * @Description
 */
public class V3BillpayOrderPaymentRefundRequest extends BaseRequest {

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
    @JSONField(name = "ref_amt")
    private String refAmt;
    /**
     * 大额转账支付账户信息数据jsonObject格式；银行大额转账支付交易的退款申请,付款方账户类型为对公时必填
     */
    @JSONField(name = "bank_info_data")
    private String bankInfoData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V3_BILLPAY_ORDER_PAYMENT_REFUND;
    }

    public V3BillpayOrderPaymentRefundRequest() {
    }

    public V3BillpayOrderPaymentRefundRequest(String reqSeqId, String reqDate, String huifuId, String billNo, String refAmt, String bankInfoData) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.billNo = billNo;
        this.refAmt = refAmt;
        this.bankInfoData = bankInfoData;
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

    public String getRefAmt() {
        return refAmt;
    }

    public void setRefAmt(String refAmt) {
        this.refAmt = refAmt;
    }

    public String getBankInfoData() {
        return bankInfoData;
    }

    public void setBankInfoData(String bankInfoData) {
        this.bankInfoData = bankInfoData;
    }

}
