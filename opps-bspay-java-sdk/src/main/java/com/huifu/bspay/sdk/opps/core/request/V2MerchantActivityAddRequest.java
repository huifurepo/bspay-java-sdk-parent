package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 商户活动报名
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantActivityAddRequest extends BaseRequest {

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
     * 汇付客户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 营业执照图片
     */
    @JSONField(name = "bl_photo")
    private String blPhoto;
    /**
     * 店内环境图片
     */
    @JSONField(name = "dh_photo")
    private String dhPhoto;
    /**
     * 手续费类型
     */
    @JSONField(name = "fee_type")
    private String feeType;
    /**
     * 整体门面图片（门头照）
     */
    @JSONField(name = "mm_photo")
    private String mmPhoto;
    /**
     * 收银台照片
     */
    @JSONField(name = "syt_photo")
    private String sytPhoto;
    /**
     * 支付通道
     */
    @JSONField(name = "pay_way")
    private String payWay;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_ACTIVITY_ADD;
    }

    public V2MerchantActivityAddRequest() {
    }

    public V2MerchantActivityAddRequest(String reqDate, String reqSeqId, String huifuId, String blPhoto, String dhPhoto, String feeType, String mmPhoto, String sytPhoto, String payWay) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.blPhoto = blPhoto;
        this.dhPhoto = dhPhoto;
        this.feeType = feeType;
        this.mmPhoto = mmPhoto;
        this.sytPhoto = sytPhoto;
        this.payWay = payWay;
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

    public String getBlPhoto() {
        return blPhoto;
    }

    public void setBlPhoto(String blPhoto) {
        this.blPhoto = blPhoto;
    }

    public String getDhPhoto() {
        return dhPhoto;
    }

    public void setDhPhoto(String dhPhoto) {
        this.dhPhoto = dhPhoto;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getMmPhoto() {
        return mmPhoto;
    }

    public void setMmPhoto(String mmPhoto) {
        this.mmPhoto = mmPhoto;
    }

    public String getSytPhoto() {
        return sytPhoto;
    }

    public void setSytPhoto(String sytPhoto) {
        this.sytPhoto = sytPhoto;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

}
