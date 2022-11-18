package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 创建花呗分期方案
 *
 * @author sdk-generator
 * @Description
 */
public class V2PcreditSolutionCreateRequest extends BaseRequest {

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
     * 汇付客户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 花呗分期商家贴息活动名称
     */
    @JSONField(name = "activity_name")
    private String activityName;
    /**
     * 活动开始时间
     */
    @JSONField(name = "start_time")
    private String startTime;
    /**
     * 活动结束时间
     */
    @JSONField(name = "end_time")
    private String endTime;
    /**
     * 免息金额下限(元)
     */
    @JSONField(name = "min_money_limit")
    private String minMoneyLimit;
    /**
     * 免息金额上限(元)
     */
    @JSONField(name = "max_money_limit")
    private String maxMoneyLimit;
    /**
     * 花呗分期贴息预算金额
     */
    @JSONField(name = "amount_budget")
    private String amountBudget;
    /**
     * 花呗分期数集合
     */
    @JSONField(name = "install_num_str_list")
    private String installNumStrList;
    /**
     * 预算提醒金额(元)
     */
    @JSONField(name = "budget_warning_money")
    private String budgetWarningMoney;
    /**
     * 预算提醒邮件列表
     */
    @JSONField(name = "budget_warning_mail_list")
    private String budgetWarningMailList;
    /**
     * 预算提醒手机号列表
     */
    @JSONField(name = "budget_warning_mobile_no_list")
    private String budgetWarningMobileNoList;
    /**
     * 子门店信息集合
     */
    @JSONField(name = "sub_shop_info_list")
    private String subShopInfoList;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_PCREDIT_SOLUTION_CREATE;
    }

    public V2PcreditSolutionCreateRequest() {
    }

    public V2PcreditSolutionCreateRequest(String reqSeqId, String reqDate, String huifuId, String activityName, String startTime, String endTime, String minMoneyLimit, String maxMoneyLimit, String amountBudget, String installNumStrList, String budgetWarningMoney, String budgetWarningMailList, String budgetWarningMobileNoList, String subShopInfoList) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.activityName = activityName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.minMoneyLimit = minMoneyLimit;
        this.maxMoneyLimit = maxMoneyLimit;
        this.amountBudget = amountBudget;
        this.installNumStrList = installNumStrList;
        this.budgetWarningMoney = budgetWarningMoney;
        this.budgetWarningMailList = budgetWarningMailList;
        this.budgetWarningMobileNoList = budgetWarningMobileNoList;
        this.subShopInfoList = subShopInfoList;
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

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getMinMoneyLimit() {
        return minMoneyLimit;
    }

    public void setMinMoneyLimit(String minMoneyLimit) {
        this.minMoneyLimit = minMoneyLimit;
    }

    public String getMaxMoneyLimit() {
        return maxMoneyLimit;
    }

    public void setMaxMoneyLimit(String maxMoneyLimit) {
        this.maxMoneyLimit = maxMoneyLimit;
    }

    public String getAmountBudget() {
        return amountBudget;
    }

    public void setAmountBudget(String amountBudget) {
        this.amountBudget = amountBudget;
    }

    public String getInstallNumStrList() {
        return installNumStrList;
    }

    public void setInstallNumStrList(String installNumStrList) {
        this.installNumStrList = installNumStrList;
    }

    public String getBudgetWarningMoney() {
        return budgetWarningMoney;
    }

    public void setBudgetWarningMoney(String budgetWarningMoney) {
        this.budgetWarningMoney = budgetWarningMoney;
    }

    public String getBudgetWarningMailList() {
        return budgetWarningMailList;
    }

    public void setBudgetWarningMailList(String budgetWarningMailList) {
        this.budgetWarningMailList = budgetWarningMailList;
    }

    public String getBudgetWarningMobileNoList() {
        return budgetWarningMobileNoList;
    }

    public void setBudgetWarningMobileNoList(String budgetWarningMobileNoList) {
        this.budgetWarningMobileNoList = budgetWarningMobileNoList;
    }

    public String getSubShopInfoList() {
        return subShopInfoList;
    }

    public void setSubShopInfoList(String subShopInfoList) {
        this.subShopInfoList = subShopInfoList;
    }

}
