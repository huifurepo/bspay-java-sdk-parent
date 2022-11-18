package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 终端自助申请单创建
 *
 * @author sdk-generator
 * @Description
 */
public class V2TerminaldeviceOrderCreateRequest extends BaseRequest {

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
     * 订单状态
     */
    @JSONField(name = "order_status")
    private String orderStatus;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TERMINALDEVICE_ORDER_CREATE;
    }

    public V2TerminaldeviceOrderCreateRequest() {
    }

    public V2TerminaldeviceOrderCreateRequest(String reqSeqId, String reqDate, String orderStatus) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.orderStatus = orderStatus;
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

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

}
