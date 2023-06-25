package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 代扣绑卡查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2QuickbuckleWithholdQueryRequest extends BaseRequest {

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
     * 汇付Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 客户系统用户id 
     */
    @JSONField(name = "out_cust_id")
    private String outCustId;
    /**
     * 绑卡订单号
     */
    @JSONField(name = "order_id")
    private String orderId;
    /**
     * 绑卡订单日期
     */
    @JSONField(name = "order_date")
    private String orderDate;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_QUICKBUCKLE_WITHHOLD_QUERY;
    }

    public V2QuickbuckleWithholdQueryRequest() {
    }

    public V2QuickbuckleWithholdQueryRequest(String reqSeqId, String reqDate, String huifuId, String outCustId, String orderId, String orderDate) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.outCustId = outCustId;
        this.orderId = orderId;
        this.orderDate = orderDate;
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

    public String getOutCustId() {
        return outCustId;
    }

    public void setOutCustId(String outCustId) {
        this.outCustId = outCustId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

}
