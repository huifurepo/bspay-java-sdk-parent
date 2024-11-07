package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 不明来账处理结果查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePaymentZxeUnknownincomeDisposequeryRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_ZXE_UNKNOWNINCOME_DISPOSEQUERY;
    }

    public V2TradePaymentZxeUnknownincomeDisposequeryRequest() {
    }

    public V2TradePaymentZxeUnknownincomeDisposequeryRequest(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

}
