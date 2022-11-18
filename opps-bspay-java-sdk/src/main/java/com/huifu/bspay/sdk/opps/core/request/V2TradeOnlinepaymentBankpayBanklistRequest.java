package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 网银支持银行列表查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeOnlinepaymentBankpayBanklistRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 网关支付类型
     */
    @JSONField(name = "gate_type")
    private String gateType;
    /**
     * 订单类型
     */
    @JSONField(name = "order_type")
    private String orderType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ONLINEPAYMENT_BANKPAY_BANKLIST;
    }

    public V2TradeOnlinepaymentBankpayBanklistRequest() {
    }

    public V2TradeOnlinepaymentBankpayBanklistRequest(String huifuId, String gateType, String orderType) {
        this.huifuId = huifuId;
        this.gateType = gateType;
        this.orderType = orderType;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getGateType() {
        return gateType;
    }

    public void setGateType(String gateType) {
        this.gateType = gateType;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

}
