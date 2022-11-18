package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 终端解绑
 *
 * @author sdk-generator
 * @Description
 */
public class V2TerminaldeviceManageUnbindRequest extends BaseRequest {

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
     * 汇付ID
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 终端号
     */
    @JSONField(name = "device_id")
    private String deviceId;
    /**
     * 解绑原因
     */
    @JSONField(name = "reason")
    private String reason;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TERMINALDEVICE_MANAGE_UNBIND;
    }

    public V2TerminaldeviceManageUnbindRequest() {
    }

    public V2TerminaldeviceManageUnbindRequest(String reqSeqId, String reqDate, String huifuId, String deviceId, String reason) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.deviceId = deviceId;
        this.reason = reason;
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

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
