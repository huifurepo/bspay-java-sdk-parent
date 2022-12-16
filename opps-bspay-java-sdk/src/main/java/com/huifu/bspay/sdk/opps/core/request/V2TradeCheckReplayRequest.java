package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 交易结算对账文件重新生成
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeCheckReplayRequest extends BaseRequest {

    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 交易日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 汇付机构编号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 文件类型
     */
    @JSONField(name = "file_type")
    private String fileType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_CHECK_REPLAY;
    }

    public V2TradeCheckReplayRequest() {
    }

    public V2TradeCheckReplayRequest(String reqSeqId, String reqDate, String huifuId, String fileType) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.fileType = fileType;
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

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

}
