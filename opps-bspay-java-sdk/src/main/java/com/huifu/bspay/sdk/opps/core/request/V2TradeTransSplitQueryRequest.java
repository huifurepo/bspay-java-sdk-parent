package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 交易分账明细查询接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeTransSplitQueryRequest extends BaseRequest {

    /**
     * 分账交易汇付全局流水号
     */
    @JSONField(name = "hf_seq_id")
    private String hfSeqId;
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 交易类型
     */
    @JSONField(name = "ord_type")
    private String ordType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_TRANS_SPLIT_QUERY;
    }

    public V2TradeTransSplitQueryRequest() {
    }

    public V2TradeTransSplitQueryRequest(String hfSeqId, String huifuId, String ordType) {
        this.hfSeqId = hfSeqId;
        this.huifuId = huifuId;
        this.ordType = ordType;
    }

    public String getHfSeqId() {
        return hfSeqId;
    }

    public void setHfSeqId(String hfSeqId) {
        this.hfSeqId = hfSeqId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getOrdType() {
        return ordType;
    }

    public void setOrdType(String ordType) {
        this.ordType = ordType;
    }

}
