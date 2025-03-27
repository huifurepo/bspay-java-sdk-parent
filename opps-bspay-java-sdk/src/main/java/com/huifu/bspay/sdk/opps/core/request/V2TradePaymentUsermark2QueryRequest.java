package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 获取银联用户标识接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePaymentUsermark2QueryRequest extends BaseRequest {

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 授权码
     */
    @JSONField(name = "auth_code")
    private String authCode;
    /**
     * 银联支付标识
     */
    @JSONField(name = "app_up_identifier")
    private String appUpIdentifier;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_USERMARK2_QUERY;
    }

    public V2TradePaymentUsermark2QueryRequest() {
    }

    public V2TradePaymentUsermark2QueryRequest(String reqDate, String reqSeqId, String huifuId, String authCode, String appUpIdentifier) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.authCode = authCode;
        this.appUpIdentifier = appUpIdentifier;
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

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getAppUpIdentifier() {
        return appUpIdentifier;
    }

    public void setAppUpIdentifier(String appUpIdentifier) {
        this.appUpIdentifier = appUpIdentifier;
    }

}
