package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 分期交易退款查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePayafteruseInstallmentRefundqueryRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYAFTERUSE_INSTALLMENT_REFUNDQUERY;
    }

    public V2TradePayafteruseInstallmentRefundqueryRequest() {
    }

    public V2TradePayafteruseInstallmentRefundqueryRequest(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

}
