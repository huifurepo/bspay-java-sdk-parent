package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 图片上传
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeElectronReceiptsPictureUploadRequest extends BaseRequest {

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
     * 三方通道类型
     */
    @JSONField(name = "third_channel_type")
    private String thirdChannelType;
    /**
     * 文件名称
     */
    @JSONField(name = "file_name")
    private String fileName;
    /**
     * 图片内容
     */
    @JSONField(name = "image_content")
    private String imageContent;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ELECTRON_RECEIPTS_PICTURE_UPLOAD;
    }

    public V2TradeElectronReceiptsPictureUploadRequest() {
    }

    public V2TradeElectronReceiptsPictureUploadRequest(String reqSeqId, String reqDate, String huifuId, String thirdChannelType, String fileName, String imageContent) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.thirdChannelType = thirdChannelType;
        this.fileName = fileName;
        this.imageContent = imageContent;
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

    public String getThirdChannelType() {
        return thirdChannelType;
    }

    public void setThirdChannelType(String thirdChannelType) {
        this.thirdChannelType = thirdChannelType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getImageContent() {
        return imageContent;
    }

    public void setImageContent(String imageContent) {
        this.imageContent = imageContent;
    }

}
