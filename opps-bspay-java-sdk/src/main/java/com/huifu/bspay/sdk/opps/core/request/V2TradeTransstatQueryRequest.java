package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 批量交易状态查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeTransstatQueryRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 页码
     */
    @JSONField(name = "page_no")
    private String pageNo;
    /**
     * 页大小
     */
    @JSONField(name = "page_size")
    private String pageSize;
    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_TRANSSTAT_QUERY;
    }

    public V2TradeTransstatQueryRequest() {
    }

    public V2TradeTransstatQueryRequest(String huifuId, String pageNo, String pageSize, String reqDate) {
        this.huifuId = huifuId;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.reqDate = reqDate;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

}
