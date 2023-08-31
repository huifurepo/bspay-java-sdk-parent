package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 创建支付分订单
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePayscoreServiceorderCreateRequest extends BaseRequest {

    /**
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 商户申请单号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 服务信息
     */
    @JSONField(name = "service_introduction")
    private String serviceIntroduction;
    /**
     * 服务风险金
     */
    @JSONField(name = "risk_fund")
    private String riskFund;
    /**
     * 服务时间
     */
    @JSONField(name = "time_range")
    private String timeRange;
    /**
     * 商户回调地址
     */
    @JSONField(name = "notify_url")
    private String notifyUrl;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYSCORE_SERVICEORDER_CREATE;
    }

    public V2TradePayscoreServiceorderCreateRequest() {
    }

    public V2TradePayscoreServiceorderCreateRequest(String huifuId, String reqDate, String reqSeqId, String serviceIntroduction, String riskFund, String timeRange, String notifyUrl) {
        this.huifuId = huifuId;
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.serviceIntroduction = serviceIntroduction;
        this.riskFund = riskFund;
        this.timeRange = timeRange;
        this.notifyUrl = notifyUrl;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
    }

    public String getServiceIntroduction() {
        return serviceIntroduction;
    }

    public void setServiceIntroduction(String serviceIntroduction) {
        this.serviceIntroduction = serviceIntroduction;
    }

    public String getRiskFund() {
        return riskFund;
    }

    public void setRiskFund(String riskFund) {
        this.riskFund = riskFund;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

}
