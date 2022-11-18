package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 支付宝直连-换取应用授权令牌
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantDirectAlipayAppauthtokenExchangeRequest extends BaseRequest {

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
     * 汇付ID
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 开发者的应用ID
     */
    @JSONField(name = "app_id")
    private String appId;
    /**
     * 操作类型
     */
    @JSONField(name = "oper_type")
    private String operType;
    /**
     * 授权码授权码，操作类型为0-换取令牌时必填，其它选填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：123&lt;/font&gt;
     */
    @JSONField(name = "app_auth_code")
    private String appAuthCode;
    /**
     * 应用授权令牌应用授权令牌，操作类型为1-刷新令牌时，且该字段有值，将与数据库值进行校验；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：202208200312104378&lt;/font&gt;
     */
    @JSONField(name = "app_auth_token")
    private String appAuthToken;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_DIRECT_ALIPAY_APPAUTHTOKEN_EXCHANGE;
    }

    public V2MerchantDirectAlipayAppauthtokenExchangeRequest() {
    }

    public V2MerchantDirectAlipayAppauthtokenExchangeRequest(String reqSeqId, String reqDate, String huifuId, String appId, String operType, String appAuthCode, String appAuthToken) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.appId = appId;
        this.operType = operType;
        this.appAuthCode = appAuthCode;
        this.appAuthToken = appAuthToken;
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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public String getAppAuthCode() {
        return appAuthCode;
    }

    public void setAppAuthCode(String appAuthCode) {
        this.appAuthCode = appAuthCode;
    }

    public String getAppAuthToken() {
        return appAuthToken;
    }

    public void setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
    }

}
