package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 查询账单计划详情
 *
 * @author sdk-generator
 * @Description
 */
public class V3BillpayPlanDetailRequest extends BaseRequest {

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
     * 账单计划编号与原请求流水号编号二选一必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：BP202412270001&lt;/font&gt;
     */
    @JSONField(name = "plan_no")
    private String planNo;
    /**
     * 原请求流水号原请求流水号，同一商户号当天唯一；与账单计划编号二选一必填
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 原请求日期原请求日期格式：yyyyMMdd，以北京时间为准；与账单编号二选一必填
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V3_BILLPAY_PLAN_DETAIL;
    }

    public V3BillpayPlanDetailRequest() {
    }

    public V3BillpayPlanDetailRequest(String reqSeqId, String reqDate, String huifuId, String planNo, String orgReqSeqId, String orgReqDate) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.planNo = planNo;
        this.orgReqSeqId = orgReqSeqId;
        this.orgReqDate = orgReqDate;
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

    public String getPlanNo() {
        return planNo;
    }

    public void setPlanNo(String planNo) {
        this.planNo = planNo;
    }

    public String getOrgReqSeqId() {
        return orgReqSeqId;
    }

    public void setOrgReqSeqId(String orgReqSeqId) {
        this.orgReqSeqId = orgReqSeqId;
    }

    public String getOrgReqDate() {
        return orgReqDate;
    }

    public void setOrgReqDate(String orgReqDate) {
        this.orgReqDate = orgReqDate;
    }

}
