package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 支付分扣款
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePayscorePayPayscorepayRequest extends BaseRequest {

    /**
     * 微信扣款单号
     */
    @JSONField(name = "out_trade_no")
    private String outTradeNo;
    /**
     * 商品描述
     */
    @JSONField(name = "goods_desc")
    private String goodsDesc;
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 安全信息
     */
    @JSONField(name = "risk_check_data")
    private String riskCheckData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYSCORE_PAY_PAYSCOREPAY;
    }

    public V2TradePayscorePayPayscorepayRequest() {
    }

    public V2TradePayscorePayPayscorepayRequest(String outTradeNo, String goodsDesc, String huifuId, String riskCheckData) {
        this.outTradeNo = outTradeNo;
        this.goodsDesc = goodsDesc;
        this.huifuId = huifuId;
        this.riskCheckData = riskCheckData;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getRiskCheckData() {
        return riskCheckData;
    }

    public void setRiskCheckData(String riskCheckData) {
        this.riskCheckData = riskCheckData;
    }

}
