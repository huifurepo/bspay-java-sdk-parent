package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 终端云MIS交易
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeCloudmisDeviceInformationMisRequest extends BaseRequest {

    /**
     * 请求流水号
     */
    @JSONField(name = "req_id")
    private String reqId;
    /**
     * 终端设备号
     */
    @JSONField(name = "device_id")
    private String deviceId;
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 交易信息
     */
    @JSONField(name = "json_data")
    private String jsonData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_CLOUDMIS_DEVICE_INFORMATION_MIS;
    }

    public V2TradeCloudmisDeviceInformationMisRequest() {
    }

    public V2TradeCloudmisDeviceInformationMisRequest(String reqId, String deviceId, String huifuId, String jsonData) {
        this.reqId = reqId;
        this.deviceId = deviceId;
        this.huifuId = huifuId;
        this.jsonData = jsonData;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

}
