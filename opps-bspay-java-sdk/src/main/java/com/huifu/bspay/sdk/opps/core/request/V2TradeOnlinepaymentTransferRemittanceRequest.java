package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 汇付入账确认
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeOnlinepaymentTransferRemittanceRequest extends BaseRequest {

    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
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
     * 异步通知地址
     */
    @JSONField(name = "notify_url")
    private String notifyUrl;
    /**
     * 原汇付通道流水号
     */
    @JSONField(name = "org_remittance_order_id")
    private String orgRemittanceOrderId;
    /**
     * 商品描述
     */
    @JSONField(name = "goods_desc")
    private String goodsDesc;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ONLINEPAYMENT_TRANSFER_REMITTANCE;
    }

    public V2TradeOnlinepaymentTransferRemittanceRequest() {
    }

    public V2TradeOnlinepaymentTransferRemittanceRequest(String reqSeqId, String reqDate, String huifuId, String transAmt, String notifyUrl, String orgRemittanceOrderId, String goodsDesc) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.transAmt = transAmt;
        this.notifyUrl = notifyUrl;
        this.orgRemittanceOrderId = orgRemittanceOrderId;
        this.goodsDesc = goodsDesc;
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

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getOrgRemittanceOrderId() {
        return orgRemittanceOrderId;
    }

    public void setOrgRemittanceOrderId(String orgRemittanceOrderId) {
        this.orgRemittanceOrderId = orgRemittanceOrderId;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

}
