package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 查询支付分订单
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePayscoreServiceorderQueryRequest extends BaseRequest {

    /**
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYSCORE_SERVICEORDER_QUERY;
    }

    public V2TradePayscoreServiceorderQueryRequest() {
    }

    public V2TradePayscoreServiceorderQueryRequest(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

}
