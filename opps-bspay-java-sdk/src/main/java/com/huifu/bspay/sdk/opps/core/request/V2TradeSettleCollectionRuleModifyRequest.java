package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 修改归集配置
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeSettleCollectionRuleModifyRequest extends BaseRequest {

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
     * 转出方商户号
     */
    @JSONField(name = "out_huifu_id")
    private String outHuifuId;
    /**
     * 转出方账户号
     */
    @JSONField(name = "out_acct_id")
    private String outAcctId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_SETTLE_COLLECTION_RULE_MODIFY;
    }

    public V2TradeSettleCollectionRuleModifyRequest() {
    }

    public V2TradeSettleCollectionRuleModifyRequest(String reqDate, String reqSeqId, String outHuifuId, String outAcctId) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.outHuifuId = outHuifuId;
        this.outAcctId = outAcctId;
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

    public String getOutHuifuId() {
        return outHuifuId;
    }

    public void setOutHuifuId(String outHuifuId) {
        this.outHuifuId = outHuifuId;
    }

    public String getOutAcctId() {
        return outAcctId;
    }

    public void setOutAcctId(String outAcctId) {
        this.outAcctId = outAcctId;
    }

}
