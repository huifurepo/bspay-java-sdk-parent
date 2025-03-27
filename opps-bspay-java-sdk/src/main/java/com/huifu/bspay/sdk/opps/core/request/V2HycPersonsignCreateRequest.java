package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 个人签约发起
 *
 * @author sdk-generator
 * @Description
 */
public class V2HycPersonsignCreateRequest extends BaseRequest {

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
     * 用户汇付id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 落地公司机构号
     */
    @JSONField(name = "minor_agent_id")
    private String minorAgentId;
    /**
     * 乐接活请求参数jsonObject格式 合作平台为乐接活时必传
     */
    @JSONField(name = "ljh_data")
    private String ljhData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_HYC_PERSONSIGN_CREATE;
    }

    public V2HycPersonsignCreateRequest() {
    }

    public V2HycPersonsignCreateRequest(String reqSeqId, String reqDate, String huifuId, String minorAgentId, String ljhData) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.minorAgentId = minorAgentId;
        this.ljhData = ljhData;
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

    public String getMinorAgentId() {
        return minorAgentId;
    }

    public void setMinorAgentId(String minorAgentId) {
        this.minorAgentId = minorAgentId;
    }

    public String getLjhData() {
        return ljhData;
    }

    public void setLjhData(String ljhData) {
        this.ljhData = ljhData;
    }

}
