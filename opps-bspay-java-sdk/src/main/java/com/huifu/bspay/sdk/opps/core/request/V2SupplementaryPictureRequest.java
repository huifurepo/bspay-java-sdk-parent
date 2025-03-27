package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 图片上传
 *
 * @author sdk-generator
 * @Description
 */
public class V2SupplementaryPictureRequest extends BaseRequest {

    /**
     * 业务请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 业务请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 图片类型
     */
    @JSONField(name = "file_type")
    private String fileType;
    /**
     * 图片名称
     */
    @JSONField(name = "picture")
    private String picture;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_SUPPLEMENTARY_PICTURE;
    }

    public V2SupplementaryPictureRequest() {
    }

    public V2SupplementaryPictureRequest(String reqSeqId, String reqDate, String fileType, String picture) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.fileType = fileType;
        this.picture = picture;
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

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

}
