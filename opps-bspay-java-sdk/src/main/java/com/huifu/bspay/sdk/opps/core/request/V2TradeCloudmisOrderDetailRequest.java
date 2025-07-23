package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 云MIS订单详情查询接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeCloudmisOrderDetailRequest extends BaseRequest {

    /**
     * 请求流水号
     */
    @JSONField(name = "req_id")
    private String reqId;
    /**
     * 原MIS请求商户号
     */
    @JSONField(name = "org_huifu_id")
    private String orgHuifuId;
    /**
     * 原MIS请求终端号
     */
    @JSONField(name = "org_device_id")
    private String orgDeviceId;
    /**
     * 原MIS请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_CLOUDMIS_ORDER_DETAIL;
    }

    public V2TradeCloudmisOrderDetailRequest() {
    }

    public V2TradeCloudmisOrderDetailRequest(String reqId, String orgHuifuId, String orgDeviceId, String orgReqDate) {
        this.reqId = reqId;
        this.orgHuifuId = orgHuifuId;
        this.orgDeviceId = orgDeviceId;
        this.orgReqDate = orgReqDate;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getOrgHuifuId() {
        return orgHuifuId;
    }

    public void setOrgHuifuId(String orgHuifuId) {
        this.orgHuifuId = orgHuifuId;
    }

    public String getOrgDeviceId() {
        return orgDeviceId;
    }

    public void setOrgDeviceId(String orgDeviceId) {
        this.orgDeviceId = orgDeviceId;
    }

    public String getOrgReqDate() {
        return orgReqDate;
    }

    public void setOrgReqDate(String orgReqDate) {
        this.orgReqDate = orgReqDate;
    }

}
