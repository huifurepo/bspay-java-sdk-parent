package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 查询微信申请状态
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantDirectWechatQueryRequest extends BaseRequest {

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
     * 商户汇付Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 开发者的应用ID
     */
    @JSONField(name = "app_id")
    private String appId;
    /**
     * 微信商户号
     */
    @JSONField(name = "mch_id")
    private String mchId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_DIRECT_WECHAT_QUERY;
    }

    public V2MerchantDirectWechatQueryRequest() {
    }

    public V2MerchantDirectWechatQueryRequest(String reqSeqId, String reqDate, String huifuId, String appId, String mchId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.appId = appId;
        this.mchId = mchId;
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

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

}
