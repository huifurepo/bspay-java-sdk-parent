package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 分期证书配置
 *
 * @author sdk-generator
 * @Description
 */
public class V2PcreditCertificateConfigRequest extends BaseRequest {

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
     * 开发者的应用ID
     */
    @JSONField(name = "app_id")
    private String appId;
    /**
     * 证书文件列表
     */
    @JSONField(name = "file_list")
    private String fileList;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_PCREDIT_CERTIFICATE_CONFIG;
    }

    public V2PcreditCertificateConfigRequest() {
    }

    public V2PcreditCertificateConfigRequest(String reqSeqId, String reqDate, String appId, String fileList) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.appId = appId;
        this.fileList = fileList;
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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getFileList() {
        return fileList;
    }

    public void setFileList(String fileList) {
        this.fileList = fileList;
    }

}
