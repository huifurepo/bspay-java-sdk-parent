package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 取消支付分订单
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePayscoreServiceorderCancelRequest extends BaseRequest {

    /**
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 取消服务订单原因
     */
    @JSONField(name = "reason")
    private String reason;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYSCORE_SERVICEORDER_CANCEL;
    }

    public V2TradePayscoreServiceorderCancelRequest() {
    }

    public V2TradePayscoreServiceorderCancelRequest(String huifuId, String reason) {
        this.huifuId = huifuId;
        this.reason = reason;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
