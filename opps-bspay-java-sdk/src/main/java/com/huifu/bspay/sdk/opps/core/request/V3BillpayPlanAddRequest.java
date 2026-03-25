package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 创建账单计划
 *
 * @author sdk-generator
 * @Description
 */
public class V3BillpayPlanAddRequest extends BaseRequest {

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
     * 账单周期
     */
    @JSONField(name = "plan_cycle")
    private String planCycle;
    /**
     * 账单日
     */
    @JSONField(name = "bill_day")
    private String billDay;
    /**
     * 补发当前周期账单标志枚举:Y-是、N-否；指定账单日时，必填；若填写是，则立即生成当前系统时间所在周期的账单； 滚动账单日时，此字段无效
     */
    @JSONField(name = "reissue_bill_flag")
    private String reissueBillFlag;
    /**
     * 代扣信息jsonObject格式；账单计划需自动代扣时必填
     */
    @JSONField(name = "withhold_info_data")
    private String withholdInfoData;
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
        return FunctionCodeEnum.V3_BILLPAY_PLAN_ADD;
    }

    public V3BillpayPlanAddRequest() {
    }

    public V3BillpayPlanAddRequest(String reqSeqId, String reqDate, String huifuId, String projectNo, String planCycle, String billDay, String reissueBillFlag, String withholdInfoData, String userDocInfoList, String paymentInfoList) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.projectNo = projectNo;
        this.planCycle = planCycle;
        this.billDay = billDay;
        this.reissueBillFlag = reissueBillFlag;
        this.withholdInfoData = withholdInfoData;
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

    public String getPlanCycle() {
        return planCycle;
    }

    public void setPlanCycle(String planCycle) {
        this.planCycle = planCycle;
    }

    public String getBillDay() {
        return billDay;
    }

    public void setBillDay(String billDay) {
        this.billDay = billDay;
    }

    public String getReissueBillFlag() {
        return reissueBillFlag;
    }

    public void setReissueBillFlag(String reissueBillFlag) {
        this.reissueBillFlag = reissueBillFlag;
    }

    public String getWithholdInfoData() {
        return withholdInfoData;
    }

    public void setWithholdInfoData(String withholdInfoData) {
        this.withholdInfoData = withholdInfoData;
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
