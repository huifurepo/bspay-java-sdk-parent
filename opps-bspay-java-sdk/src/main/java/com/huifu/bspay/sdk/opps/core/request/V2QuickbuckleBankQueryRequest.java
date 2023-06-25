package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 银行列表查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2QuickbuckleBankQueryRequest extends BaseRequest {

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
     * 商户汇付Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 业务类型
     */
    @JSONField(name = "biz_type")
    private String bizType;
    /**
     * 借贷类型
     */
    @JSONField(name = "dc_type")
    private String dcType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_QUICKBUCKLE_BANK_QUERY;
    }

    public V2QuickbuckleBankQueryRequest() {
    }

    public V2QuickbuckleBankQueryRequest(String reqSeqId, String reqDate, String huifuId, String bizType, String dcType) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.bizType = bizType;
        this.dcType = dcType;
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

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getDcType() {
        return dcType;
    }

    public void setDcType(String dcType) {
        this.dcType = dcType;
    }

}
