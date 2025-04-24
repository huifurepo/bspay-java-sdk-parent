package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 银联统一在线收银台签解约查询接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeOnlinepaymentUnionsignqueryRequest extends BaseRequest {

    /**
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 原请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 原请求流水号
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ONLINEPAYMENT_UNIONSIGNQUERY;
    }

    public V2TradeOnlinepaymentUnionsignqueryRequest() {
    }

    public V2TradeOnlinepaymentUnionsignqueryRequest(String huifuId, String orgReqDate, String orgReqSeqId) {
        this.huifuId = huifuId;
        this.orgReqDate = orgReqDate;
        this.orgReqSeqId = orgReqSeqId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getOrgReqDate() {
        return orgReqDate;
    }

    public void setOrgReqDate(String orgReqDate) {
        this.orgReqDate = orgReqDate;
    }

    public String getOrgReqSeqId() {
        return orgReqSeqId;
    }

    public void setOrgReqSeqId(String orgReqSeqId) {
        this.orgReqSeqId = orgReqSeqId;
    }

}
