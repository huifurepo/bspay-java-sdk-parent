package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 批量出金交易查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeBatchtranslogQueryRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 开始日期
     */
    @JSONField(name = "begin_date")
    private String beginDate;
    /**
     * 结束日期
     */
    @JSONField(name = "end_date")
    private String endDate;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_BATCHTRANSLOG_QUERY;
    }

    public V2TradeBatchtranslogQueryRequest() {
    }

    public V2TradeBatchtranslogQueryRequest(String huifuId, String beginDate, String endDate) {
        this.huifuId = huifuId;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
