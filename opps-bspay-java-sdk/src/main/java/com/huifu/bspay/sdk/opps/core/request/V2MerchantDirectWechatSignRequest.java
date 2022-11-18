package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 微信特约商户进件
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantDirectWechatSignRequest extends BaseRequest {

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
     * 商户汇付Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 渠道商汇付Id
     */
    @JSONField(name = "upper_huifu_id")
    private String upperHuifuId;
    /**
     * 开发者的应用ID
     */
    @JSONField(name = "app_id")
    private String appId;
    /**
     * 商户号
     */
    @JSONField(name = "mch_id")
    private String mchId;
    /**
     * 经营者/法人是否为受益人
     */
    @JSONField(name = "owner")
    private String owner;
    /**
     * 超级管理员信息
     */
    @JSONField(name = "contact_info")
    private String contactInfo;
    /**
     * 经营场景类型
     */
    @JSONField(name = "sales_scenes_type")
    private String salesScenesType;
    /**
     * 经营场景
     */
    @JSONField(name = "sales_info")
    private String salesInfo;
    /**
     * 结算信息
     */
    @JSONField(name = "settlement_info")
    private String settlementInfo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_DIRECT_WECHAT_SIGN;
    }

    public V2MerchantDirectWechatSignRequest() {
    }

    public V2MerchantDirectWechatSignRequest(String reqSeqId, String reqDate, String huifuId, String upperHuifuId, String appId, String mchId, String owner, String contactInfo, String salesScenesType, String salesInfo, String settlementInfo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.upperHuifuId = upperHuifuId;
        this.appId = appId;
        this.mchId = mchId;
        this.owner = owner;
        this.contactInfo = contactInfo;
        this.salesScenesType = salesScenesType;
        this.salesInfo = salesInfo;
        this.settlementInfo = settlementInfo;
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

    public String getUpperHuifuId() {
        return upperHuifuId;
    }

    public void setUpperHuifuId(String upperHuifuId) {
        this.upperHuifuId = upperHuifuId;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getSalesScenesType() {
        return salesScenesType;
    }

    public void setSalesScenesType(String salesScenesType) {
        this.salesScenesType = salesScenesType;
    }

    public String getSalesInfo() {
        return salesInfo;
    }

    public void setSalesInfo(String salesInfo) {
        this.salesInfo = salesInfo;
    }

    public String getSettlementInfo() {
        return settlementInfo;
    }

    public void setSettlementInfo(String settlementInfo) {
        this.settlementInfo = settlementInfo;
    }

}
