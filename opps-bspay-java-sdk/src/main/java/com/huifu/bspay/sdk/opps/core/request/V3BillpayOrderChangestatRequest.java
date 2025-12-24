package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 账单数据状态变更
 *
 * @author sdk-generator
 * @Description
 */
public class V3BillpayOrderChangestatRequest extends BaseRequest {

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
     * 变更状态
     */
    @JSONField(name = "bill_stat")
    private String billStat;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V3_BILLPAY_ORDER_CHANGESTAT;
    }

    public V3BillpayOrderChangestatRequest() {
    }

    public V3BillpayOrderChangestatRequest(String reqSeqId, String reqDate, String huifuId, String billNo, String billStat) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.billNo = billNo;
        this.billStat = billStat;
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

    public String getBillStat() {
        return billStat;
    }

    public void setBillStat(String billStat) {
        this.billStat = billStat;
    }

}
