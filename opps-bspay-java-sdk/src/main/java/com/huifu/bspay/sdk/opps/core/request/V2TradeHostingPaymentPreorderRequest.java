package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 支付宝小程序预下单接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeHostingPaymentPreorderRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 预下单类型
     */
    @JSONField(name = "pre_order_type")
    private String preOrderType;
    /**
     * 交易金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;
    /**
     * 商品描述
     */
    @JSONField(name = "goods_desc")
    private String goodsDesc;
    /**
     * app扩展参数集合
     */
    @JSONField(name = "app_data")
    private String appData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_HOSTING_PAYMENT_PREORDER;
    }

    public V2TradeHostingPaymentPreorderRequest() {
    }

    public V2TradeHostingPaymentPreorderRequest(String huifuId, String reqDate, String reqSeqId, String preOrderType, String transAmt, String goodsDesc, String appData) {
        this.huifuId = huifuId;
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.preOrderType = preOrderType;
        this.transAmt = transAmt;
        this.goodsDesc = goodsDesc;
        this.appData = appData;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
    }

    public String getPreOrderType() {
        return preOrderType;
    }

    public void setPreOrderType(String preOrderType) {
        this.preOrderType = preOrderType;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getAppData() {
        return appData;
    }

    public void setAppData(String appData) {
        this.appData = appData;
    }

}
