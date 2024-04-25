package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 银行大额支付
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeOnlinepaymentTransferAccountRequest extends BaseRequest {

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
     * 收款方商户号
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

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ONLINEPAYMENT_TRANSFER_ACCOUNT;
    }

    public V2TradeOnlinepaymentTransferAccountRequest() {
    }

    public V2TradeOnlinepaymentTransferAccountRequest(String reqSeqId, String reqDate, String huifuId, String transAmt, String goodsDesc) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.transAmt = transAmt;
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

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

}
