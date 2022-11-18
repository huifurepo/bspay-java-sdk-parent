package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 微信小程序预下单接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeHostingPaymentPreorderWxRequest extends BaseRequest {

    /**
     * 预下单类型
     */
    @JSONField(name = "pre_order_type")
    private String preOrderType;
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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
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
     * 微信小程序扩展参数集合
     */
    @JSONField(name = "miniapp_data")
    private String miniappData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_HOSTING_PAYMENT_PREORDER;
    }

    public V2TradeHostingPaymentPreorderWxRequest() {
    }

    public V2TradeHostingPaymentPreorderWxRequest(String preOrderType, String reqDate, String reqSeqId, String huifuId, String transAmt, String goodsDesc, String miniappData) {
        this.preOrderType = preOrderType;
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.transAmt = transAmt;
        this.goodsDesc = goodsDesc;
        this.miniappData = miniappData;
    }

    public String getPreOrderType() {
        return preOrderType;
    }

    public void setPreOrderType(String preOrderType) {
        this.preOrderType = preOrderType;
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

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
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

    public String getMiniappData() {
        return miniappData;
    }

    public void setMiniappData(String miniappData) {
        this.miniappData = miniappData;
    }

}
