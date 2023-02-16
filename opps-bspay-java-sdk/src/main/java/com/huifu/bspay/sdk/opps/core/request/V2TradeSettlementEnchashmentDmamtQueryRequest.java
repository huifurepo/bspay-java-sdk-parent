package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * DM取现额度查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeSettlementEnchashmentDmamtQueryRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_SETTLEMENT_ENCHASHMENT_DMAMT_QUERY;
    }

    public V2TradeSettlementEnchashmentDmamtQueryRequest() {
    }

    public V2TradeSettlementEnchashmentDmamtQueryRequest(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

}
