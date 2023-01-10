package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 图片下载
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantComplaintDownloadPictureRequest extends BaseRequest {

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
     * 下载图片的url
     */
    @JSONField(name = "media_url")
    private String mediaUrl;
    /**
     * 微信商户号
     */
    @JSONField(name = "mch_id")
    private String mchId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_COMPLAINT_DOWNLOAD_PICTURE;
    }

    public V2MerchantComplaintDownloadPictureRequest() {
    }

    public V2MerchantComplaintDownloadPictureRequest(String reqSeqId, String reqDate, String mediaUrl, String mchId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.mediaUrl = mediaUrl;
        this.mchId = mchId;
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

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

}
