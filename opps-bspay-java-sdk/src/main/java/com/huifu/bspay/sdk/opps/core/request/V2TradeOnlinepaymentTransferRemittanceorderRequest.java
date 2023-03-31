package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 汇付入账查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeOnlinepaymentTransferRemittanceorderRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 原请求开始日期
     */
    @JSONField(name = "org_req_start_date")
    private String orgReqStartDate;
    /**
     * 原请求结束日期
     */
    @JSONField(name = "org_req_end_date")
    private String orgReqEndDate;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ONLINEPAYMENT_TRANSFER_REMITTANCEORDER;
    }

    public V2TradeOnlinepaymentTransferRemittanceorderRequest() {
    }

    public V2TradeOnlinepaymentTransferRemittanceorderRequest(String huifuId, String orgReqStartDate, String orgReqEndDate) {
        this.huifuId = huifuId;
        this.orgReqStartDate = orgReqStartDate;
        this.orgReqEndDate = orgReqEndDate;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getOrgReqStartDate() {
        return orgReqStartDate;
    }

    public void setOrgReqStartDate(String orgReqStartDate) {
        this.orgReqStartDate = orgReqStartDate;
    }

    public String getOrgReqEndDate() {
        return orgReqEndDate;
    }

    public void setOrgReqEndDate(String orgReqEndDate) {
        this.orgReqEndDate = orgReqEndDate;
    }

}
