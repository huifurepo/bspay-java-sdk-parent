package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 查询账单计划下已生成账单数据
 *
 * @author sdk-generator
 * @Description
 */
public class V3BillpayPlanBillListRequest extends BaseRequest {

    /**
     * 客户请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 客户请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 账单计划编号
     */
    @JSONField(name = "plan_no")
    private String planNo;
    /**
     * 页码
     */
    @JSONField(name = "page_num")
    private String pageNum;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V3_BILLPAY_PLAN_BILL_LIST;
    }

    public V3BillpayPlanBillListRequest() {
    }

    public V3BillpayPlanBillListRequest(String reqSeqId, String reqDate, String huifuId, String planNo, String pageNum) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.planNo = planNo;
        this.pageNum = pageNum;
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

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

}
