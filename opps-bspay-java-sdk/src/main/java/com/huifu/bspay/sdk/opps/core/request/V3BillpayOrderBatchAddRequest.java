package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 创建批量账单数据
 *
 * @author sdk-generator
 * @Description
 */
public class V3BillpayOrderBatchAddRequest extends BaseRequest {

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
     * 账单项目编号
     */
    @JSONField(name = "project_no")
    private String projectNo;
    /**
     * 用户资料信息列表
     */
    @JSONField(name = "user_doc_info_list")
    private String userDocInfoList;
    /**
     * 账单收费项信息列表
     */
    @JSONField(name = "payment_info_list")
    private String paymentInfoList;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V3_BILLPAY_ORDER_BATCH_ADD;
    }

    public V3BillpayOrderBatchAddRequest() {
    }

    public V3BillpayOrderBatchAddRequest(String reqSeqId, String reqDate, String huifuId, String projectNo, String userDocInfoList, String paymentInfoList) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.projectNo = projectNo;
        this.userDocInfoList = userDocInfoList;
        this.paymentInfoList = paymentInfoList;
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

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getUserDocInfoList() {
        return userDocInfoList;
    }

    public void setUserDocInfoList(String userDocInfoList) {
        this.userDocInfoList = userDocInfoList;
    }

    public String getPaymentInfoList() {
        return paymentInfoList;
    }

    public void setPaymentInfoList(String paymentInfoList) {
        this.paymentInfoList = paymentInfoList;
    }

}
