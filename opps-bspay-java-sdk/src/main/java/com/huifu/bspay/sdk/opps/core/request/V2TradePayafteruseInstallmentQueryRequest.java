package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 分期扣款查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePayafteruseInstallmentQueryRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYAFTERUSE_INSTALLMENT_QUERY;
    }

    public V2TradePayafteruseInstallmentQueryRequest() {
    }

    public V2TradePayafteruseInstallmentQueryRequest(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

}
