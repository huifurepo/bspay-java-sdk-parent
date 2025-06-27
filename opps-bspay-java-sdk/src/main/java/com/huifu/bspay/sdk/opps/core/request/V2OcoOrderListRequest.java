package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 全渠道订单分账查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2OcoOrderListRequest extends BaseRequest {

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 分账数据源
     */
    @JSONField(name = "busi_source")
    private String busiSource;
    /**
     * 交易时间
     */
    @JSONField(name = "trans_date")
    private String transDate;
    /**
     * 页码
     */
    @JSONField(name = "page_num")
    private String pageNum;
    /**
     * 每页大小
     */
    @JSONField(name = "page_size")
    private String pageSize;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_OCO_ORDER_LIST;
    }

    public V2OcoOrderListRequest() {
    }

    public V2OcoOrderListRequest(String reqSeqId, String reqDate, String huifuId, String busiSource, String transDate, String pageNum, String pageSize) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.busiSource = busiSource;
        this.transDate = transDate;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
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

    public String getBusiSource() {
        return busiSource;
    }

    public void setBusiSource(String busiSource) {
        this.busiSource = busiSource;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

}
