package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 商户公域授权
 *
 * @author sdk-generator
 * @Description
 */
public class V2LinkappAuthDoRequest extends BaseRequest {

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
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 平台类型
     */
    @JSONField(name = "platform_type")
    private String platformType;
    /**
     * 协议地址
     */
    @JSONField(name = "contract_url")
    private String contractUrl;
    /**
     * 签约商户名称
     */
    @JSONField(name = "contract_mer_name")
    private String contractMerName;
    /**
     * 签约时间
     */
    @JSONField(name = "contract_time")
    private String contractTime;
    /**
     * 登录用手机号第一次登录有需要手机验证码的情况;（需要授权手机安装一个转发短信的应用）
     */
    @JSONField(name = "phone_number")
    private String phoneNumber;
    /**
     * 商户类型商户类型：0个人店 1企业 2个体工商户 3其他(目前固定填3即可)
     */
    @JSONField(name = "merchant_type")
    private String merchantType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_LINKAPP_AUTH_DO;
    }

    public V2LinkappAuthDoRequest() {
    }

    public V2LinkappAuthDoRequest(String reqSeqId, String reqDate, String huifuId, String platformType, String contractUrl, String contractMerName, String contractTime, String phoneNumber, String merchantType) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.platformType = platformType;
        this.contractUrl = contractUrl;
        this.contractMerName = contractMerName;
        this.contractTime = contractTime;
        this.phoneNumber = phoneNumber;
        this.merchantType = merchantType;
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

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getContractUrl() {
        return contractUrl;
    }

    public void setContractUrl(String contractUrl) {
        this.contractUrl = contractUrl;
    }

    public String getContractMerName() {
        return contractMerName;
    }

    public void setContractMerName(String contractMerName) {
        this.contractMerName = contractMerName;
    }

    public String getContractTime() {
        return contractTime;
    }

    public void setContractTime(String contractTime) {
        this.contractTime = contractTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

}
