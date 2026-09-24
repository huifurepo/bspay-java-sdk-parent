package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 发货信息合单录入
 *
 * @author sdk-generator
 * @Description
 */
public class V3TradeHostingPaymentCombinedshippinginfoUploadRequest extends BaseRequest {

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
     * 订单信息
     */
    @JSONField(name = "order_key")
    private String orderKey;
    /**
     * 上传时间
     */
    @JSONField(name = "upload_time")
    private String uploadTime;
    /**
     * 支付者
     */
    @JSONField(name = "payer")
    private String payer;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V3_TRADE_HOSTING_PAYMENT_COMBINEDSHIPPINGINFO_UPLOAD;
    }

    public V3TradeHostingPaymentCombinedshippinginfoUploadRequest() {
    }

    public V3TradeHostingPaymentCombinedshippinginfoUploadRequest(String reqDate, String reqSeqId, String huifuId, String orderKey, String uploadTime, String payer) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.orderKey = orderKey;
        this.uploadTime = uploadTime;
        this.payer = payer;
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

    public String getOrderKey() {
        return orderKey;
    }

    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

}
