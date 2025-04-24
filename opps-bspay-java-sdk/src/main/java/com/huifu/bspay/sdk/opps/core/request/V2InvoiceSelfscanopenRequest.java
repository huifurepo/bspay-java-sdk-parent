package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 自助扫码开票
 *
 * @author sdk-generator
 * @Description
 */
public class V2InvoiceSelfscanopenRequest extends BaseRequest {

    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 请求时间
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 发票类型
     */
    @JSONField(name = "ivc_type")
    private String ivcType;
    /**
     * 开票类型
     */
    @JSONField(name = "open_type")
    private String openType;
    /**
     * 含税合计金额（元）
     */
    @JSONField(name = "order_amt")
    private String orderAmt;
    /**
     * 开票商品信息
     */
    @JSONField(name = "goods_infos")
    private String goodsInfos;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_INVOICE_SELFSCANOPEN;
    }

    public V2InvoiceSelfscanopenRequest() {
    }

    public V2InvoiceSelfscanopenRequest(String reqSeqId, String reqDate, String huifuId, String ivcType, String openType, String orderAmt, String goodsInfos) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.ivcType = ivcType;
        this.openType = openType;
        this.orderAmt = orderAmt;
        this.goodsInfos = goodsInfos;
    }

    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getIvcType() {
        return ivcType;
    }

    public void setIvcType(String ivcType) {
        this.ivcType = ivcType;
    }

    public String getOpenType() {
        return openType;
    }

    public void setOpenType(String openType) {
        this.openType = openType;
    }

    public String getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(String orderAmt) {
        this.orderAmt = orderAmt;
    }

    public String getGoodsInfos() {
        return goodsInfos;
    }

    public void setGoodsInfos(String goodsInfos) {
        this.goodsInfos = goodsInfos;
    }

}
