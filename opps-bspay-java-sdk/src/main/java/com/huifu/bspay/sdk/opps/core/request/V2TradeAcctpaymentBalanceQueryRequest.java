package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 账户余额信息查询接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeAcctpaymentBalanceQueryRequest extends BaseRequest {

    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ACCTPAYMENT_BALANCE_QUERY;
    }

    public V2TradeAcctpaymentBalanceQueryRequest() {
    }

    public V2TradeAcctpaymentBalanceQueryRequest(String reqDate, String huifuId) {
        this.reqDate = reqDate;
        this.huifuId = huifuId;
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

}
