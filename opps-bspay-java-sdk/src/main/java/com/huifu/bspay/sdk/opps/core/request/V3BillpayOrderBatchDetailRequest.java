package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 查询批量账单数据
 *
 * @author sdk-generator
 * @Description
 */
public class V3BillpayOrderBatchDetailRequest extends BaseRequest {

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
     * 账单编号与原创建批量账单数据请求流水号二选一必填，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：BN2025091279190693&lt;/font&gt;;
     */
    @JSONField(name = "bill_no")
    private String billNo;
    /**
     * 原创建批量账单数据请求流水号原创建批量账单数据请求流水号，同一商户号当天唯一；与帐单编号二选一必填
     */
    @JSONField(name = "ori_req_seq_id")
    private String oriReqSeqId;
    /**
     * 原创建批量账单数据请求日期原创建批量账单数据日期格式：yyyyMMdd，以北京时间为准；与帐单编号二选一必填
     */
    @JSONField(name = "ori_req_date")
    private String oriReqDate;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V3_BILLPAY_ORDER_BATCH_DETAIL;
    }

    public V3BillpayOrderBatchDetailRequest() {
    }

    public V3BillpayOrderBatchDetailRequest(String reqSeqId, String reqDate, String huifuId, String billNo, String oriReqSeqId, String oriReqDate) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.billNo = billNo;
        this.oriReqSeqId = oriReqSeqId;
        this.oriReqDate = oriReqDate;
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

    public String getOriReqSeqId() {
        return oriReqSeqId;
    }

    public void setOriReqSeqId(String oriReqSeqId) {
        this.oriReqSeqId = oriReqSeqId;
    }

    public String getOriReqDate() {
        return oriReqDate;
    }

    public void setOriReqDate(String oriReqDate) {
        this.oriReqDate = oriReqDate;
    }

}
