package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 交易结算对账文件配置
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBusiBillConfigRequest extends BaseRequest {

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
     * 汇付机构编号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 对账文件生成开关
     */
    @JSONField(name = "recon_send_flag")
    private String reconSendFlag;
    /**
     * 对账单类型
     */
    @JSONField(name = "file_type")
    private String fileType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BUSI_BILL_CONFIG;
    }

    public V2MerchantBusiBillConfigRequest() {
    }

    public V2MerchantBusiBillConfigRequest(String reqDate, String reqSeqId, String huifuId, String reconSendFlag, String fileType) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.reconSendFlag = reconSendFlag;
        this.fileType = fileType;
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

    public String getReconSendFlag() {
        return reconSendFlag;
    }

    public void setReconSendFlag(String reconSendFlag) {
        this.reconSendFlag = reconSendFlag;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

}
