package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 完结支付分订单
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePayscoreServiceorderCompleteRequest extends BaseRequest {

    /**
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 汇付订单号
     */
    @JSONField(name = "out_order_no")
    private String outOrderNo;
    /**
     * 完结金额
     */
    @JSONField(name = "ord_amt")
    private String ordAmt;
    /**
     * 服务时间
     */
    @JSONField(name = "time_range")
    private String timeRange;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYSCORE_SERVICEORDER_COMPLETE;
    }

    public V2TradePayscoreServiceorderCompleteRequest() {
    }

    public V2TradePayscoreServiceorderCompleteRequest(String huifuId, String outOrderNo, String ordAmt, String timeRange) {
        this.huifuId = huifuId;
        this.outOrderNo = outOrderNo;
        this.ordAmt = ordAmt;
        this.timeRange = timeRange;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getOrdAmt() {
        return ordAmt;
    }

    public void setOrdAmt(String ordAmt) {
        this.ordAmt = ordAmt;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

}
