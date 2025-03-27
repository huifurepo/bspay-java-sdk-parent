package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 交易确认查询接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePaymentDelaytransConfirmqueryRequest extends BaseRequest {

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
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_DELAYTRANS_CONFIRMQUERY;
    }

    public V2TradePaymentDelaytransConfirmqueryRequest() {
    }

    public V2TradePaymentDelaytransConfirmqueryRequest(String orgReqDate, String orgReqSeqId, String huifuId) {
        this.orgReqDate = orgReqDate;
        this.orgReqSeqId = orgReqSeqId;
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

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

}
