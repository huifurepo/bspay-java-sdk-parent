package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 新增快捷/代扣解绑接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2QuickbuckleUnbindRequest extends BaseRequest {

    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 汇付商户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 用户ID
     */
    @JSONField(name = "out_cust_id")
    private String outCustId;
    /**
     * 卡令牌
     */
    @JSONField(name = "token_no")
    private String tokenNo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_QUICKBUCKLE_UNBIND;
    }

    public V2QuickbuckleUnbindRequest() {
    }

    public V2QuickbuckleUnbindRequest(String reqDate, String reqSeqId, String huifuId, String outCustId, String tokenNo) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.outCustId = outCustId;
        this.tokenNo = tokenNo;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getOutCustId() {
        return outCustId;
    }

    public void setOutCustId(String outCustId) {
        this.outCustId = outCustId;
    }

    public String getTokenNo() {
        return tokenNo;
    }

    public void setTokenNo(String tokenNo) {
        this.tokenNo = tokenNo;
    }

}
