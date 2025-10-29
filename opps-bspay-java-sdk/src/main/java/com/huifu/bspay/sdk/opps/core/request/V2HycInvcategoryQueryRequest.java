package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 开票类目查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2HycInvcategoryQueryRequest extends BaseRequest {

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
     * 落地公司机构号
     */
    @JSONField(name = "minor_agent_id")
    private String minorAgentId;
    /**
     * 商户号lg_platform_type为HXY或空时必填
     */
    @JSONField(name = "huifu_id")
    private String huifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_HYC_INVCATEGORY_QUERY;
    }

    public V2HycInvcategoryQueryRequest() {
    }

    public V2HycInvcategoryQueryRequest(String reqSeqId, String reqDate, String minorAgentId, String huifuId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.minorAgentId = minorAgentId;
        this.huifuId = huifuId;
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

    public String getMinorAgentId() {
        return minorAgentId;
    }

    public void setMinorAgentId(String minorAgentId) {
        this.minorAgentId = minorAgentId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

}
