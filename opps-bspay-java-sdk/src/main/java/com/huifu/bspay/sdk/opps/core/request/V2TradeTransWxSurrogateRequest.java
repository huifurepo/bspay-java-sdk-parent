package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 微信代发
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeTransWxSurrogateRequest extends BaseRequest {

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
     * 出账商户号
     */
    @JSONField(name = "out_huifu_id")
    private String outHuifuId;
    /**
     * 代发金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;
    /**
     * 收款用户openid
     */
    @JSONField(name = "open_id")
    private String openId;
    /**
     * 微信收款用户姓名
     */
    @JSONField(name = "user_name")
    private String userName;
    /**
     * 代发备注
     */
    @JSONField(name = "remark")
    private String remark;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_TRANS_WX_SURROGATE;
    }

    public V2TradeTransWxSurrogateRequest() {
    }

    public V2TradeTransWxSurrogateRequest(String reqSeqId, String reqDate, String outHuifuId, String transAmt, String openId, String userName, String remark) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.outHuifuId = outHuifuId;
        this.transAmt = transAmt;
        this.openId = openId;
        this.userName = userName;
        this.remark = remark;
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

    public String getOutHuifuId() {
        return outHuifuId;
    }

    public void setOutHuifuId(String outHuifuId) {
        this.outHuifuId = outHuifuId;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
