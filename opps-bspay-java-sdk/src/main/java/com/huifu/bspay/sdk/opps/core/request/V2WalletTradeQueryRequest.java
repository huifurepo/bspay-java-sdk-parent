package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 钱包交易查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2WalletTradeQueryRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 原交易请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 原交易请求流水号
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 交易类型
     */
    @JSONField(name = "trans_type")
    private String transType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_WALLET_TRADE_QUERY;
    }

    public V2WalletTradeQueryRequest() {
    }

    public V2WalletTradeQueryRequest(String huifuId, String orgReqDate, String orgReqSeqId, String transType) {
        this.huifuId = huifuId;
        this.orgReqDate = orgReqDate;
        this.orgReqSeqId = orgReqSeqId;
        this.transType = transType;
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

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

}
