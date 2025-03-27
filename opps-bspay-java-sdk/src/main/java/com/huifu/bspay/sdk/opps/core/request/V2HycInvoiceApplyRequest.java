package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 申请开票
 *
 * @author sdk-generator
 * @Description
 */
public class V2HycInvoiceApplyRequest extends BaseRequest {

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
     * 商户汇付id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 交易流水列表
     */
    @JSONField(name = "batch_list")
    private String batchList;
    /**
     * 接收人手机号
     */
    @JSONField(name = "receive_mobile")
    private String receiveMobile;
    /**
     * 接收人姓名
     */
    @JSONField(name = "receive_name")
    private String receiveName;
    /**
     * 快递地址
     */
    @JSONField(name = "courier_address")
    private String courierAddress;
    /**
     * 开票类目
     */
    @JSONField(name = "invoice_category")
    private String invoiceCategory;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_HYC_INVOICE_APPLY;
    }

    public V2HycInvoiceApplyRequest() {
    }

    public V2HycInvoiceApplyRequest(String reqSeqId, String reqDate, String huifuId, String batchList, String receiveMobile, String receiveName, String courierAddress, String invoiceCategory) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.batchList = batchList;
        this.receiveMobile = receiveMobile;
        this.receiveName = receiveName;
        this.courierAddress = courierAddress;
        this.invoiceCategory = invoiceCategory;
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

    public String getBatchList() {
        return batchList;
    }

    public void setBatchList(String batchList) {
        this.batchList = batchList;
    }

    public String getReceiveMobile() {
        return receiveMobile;
    }

    public void setReceiveMobile(String receiveMobile) {
        this.receiveMobile = receiveMobile;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public String getCourierAddress() {
        return courierAddress;
    }

    public void setCourierAddress(String courierAddress) {
        this.courierAddress = courierAddress;
    }

    public String getInvoiceCategory() {
        return invoiceCategory;
    }

    public void setInvoiceCategory(String invoiceCategory) {
        this.invoiceCategory = invoiceCategory;
    }

}
