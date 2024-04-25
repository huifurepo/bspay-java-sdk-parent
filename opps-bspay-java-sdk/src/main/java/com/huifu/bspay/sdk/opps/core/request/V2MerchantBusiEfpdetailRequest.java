package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 全域资金管理配置查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBusiEfpdetailRequest extends BaseRequest {

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
     * 商户汇付id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 银行类型
     */
    @JSONField(name = "out_funds_gate_id")
    private String outFundsGateId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BUSI_EFPDETAIL;
    }

    public V2MerchantBusiEfpdetailRequest() {
    }

    public V2MerchantBusiEfpdetailRequest(String reqSeqId, String reqDate, String huifuId, String outFundsGateId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.outFundsGateId = outFundsGateId;
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

    public String getOutFundsGateId() {
        return outFundsGateId;
    }

    public void setOutFundsGateId(String outFundsGateId) {
        this.outFundsGateId = outFundsGateId;
    }

}
