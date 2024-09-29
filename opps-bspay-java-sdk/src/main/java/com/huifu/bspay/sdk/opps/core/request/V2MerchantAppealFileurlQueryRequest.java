package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 申诉文件url查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantAppealFileurlQueryRequest extends BaseRequest {

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
     * 申诉文件Id
     */
    @JSONField(name = "file_id")
    private String fileId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_APPEAL_FILEURL_QUERY;
    }

    public V2MerchantAppealFileurlQueryRequest() {
    }

    public V2MerchantAppealFileurlQueryRequest(String reqSeqId, String reqDate, String fileId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.fileId = fileId;
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

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

}
