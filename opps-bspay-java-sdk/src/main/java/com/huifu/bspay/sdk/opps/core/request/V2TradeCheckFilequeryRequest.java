package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 交易、结算文件查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeCheckFilequeryRequest extends BaseRequest {

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
     * 文件生成日期
     */
    @JSONField(name = "file_date")
    private String fileDate;
    /**
     * 对账单类型
     */
    @JSONField(name = "check_order_type")
    private String checkOrderType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_CHECK_FILEQUERY;
    }

    public V2TradeCheckFilequeryRequest() {
    }

    public V2TradeCheckFilequeryRequest(String reqDate, String reqSeqId, String huifuId, String fileDate, String checkOrderType) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.fileDate = fileDate;
        this.checkOrderType = checkOrderType;
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

    public String getFileDate() {
        return fileDate;
    }

    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }

    public String getCheckOrderType() {
        return checkOrderType;
    }

    public void setCheckOrderType(String checkOrderType) {
        this.checkOrderType = checkOrderType;
    }

}
