/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
package com.huifu.bspay.sdk.opps.core.config;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 商户配置
 *
 * @author kefeng.zheng
 * @version v 0.1
 */
public class MerConfig {
    /**
     * 商户私钥，用于商户给交易信息签名
     */
    @JSONField(name = "rsa_private_key")
    private String rsaPrivateKey;
    /**
     * 公钥，商户用公钥对汇付返回的信息进行验签
     */
    @JSONField(name = "rsa_public_key")
    private String rsaPublicKey;
    /**
     * 产品号，由汇付分配
     */
    @JSONField(name = "product_id")
    private String productId;
    /**
     * 系统号，由汇付分配
     */
    @JSONField(name = "sys_id")
    private String sysId;

    /**
     * 自定义连接超时时间
     */
    @JSONField(name = "custom_connect_timeout")
    private String customConnectTimeout;
    /**
     * 自定义连接请求超时时间
     */
    @JSONField(name = "custom_connection_request_timeout")
    private String customConnectionRequestTimeout;

    /**
     * 自定义请求超时时间
     */
    @JSONField(name = "custom_socket_timeout")
    private String customSocketTimeout;

    /**
     * skill来源版本
     */
    @JSONField(name = "skill_source")
    private String skillSource;

    /*
      * 签名类型，默认值RSA，可选SM2、RSA
     */
    @JSONField(name = "sign_type")
    private String signType;
    /**
     * 商户私钥，用于商户给交易信息签名
     */
    @JSONField(name = "sm2_private_key")
    private String sm2PrivateKey;
    /**
     * 公钥，商户用公钥对汇付返回的信息进行验签
     */
    @JSONField(name = "sm2_public_key")
    private String sm2PublicKey;


    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getSm2PrivateKey() {
        return sm2PrivateKey;
    }

    public void setSm2PrivateKey(String sm2PrivateKey) {
        this.sm2PrivateKey = sm2PrivateKey;
    }

    public String getSm2PublicKey() {
        return sm2PublicKey;
    }

    public void setSm2PublicKey(String sm2PublicKey) {
        this.sm2PublicKey = sm2PublicKey;
    }

    public String getSkillSource() {
        return skillSource;
    }

    public void setSkillSource(String skillSource) {
        this.skillSource = skillSource;
    }

    public String getCustomConnectTimeout() {
        return customConnectTimeout;
    }

    public void setCustomConnectTimeout(String customConnectTimeout) {
        this.customConnectTimeout = customConnectTimeout;
    }

    public String getCustomConnectionRequestTimeout() {
        return customConnectionRequestTimeout;
    }

    public void setCustomConnectionRequestTimeout(String customConnectionRequestTimeout) {
        this.customConnectionRequestTimeout = customConnectionRequestTimeout;
    }

    public String getCustomSocketTimeout() {
        return customSocketTimeout;
    }

    public void setCustomSocketTimeout(String customSocketTimeout) {
        this.customSocketTimeout = customSocketTimeout;
    }

    public String getRsaPrivateKey() {
        return rsaPrivateKey;
    }

    public void setRsaPrivateKey(String rsaPrivateKey) {
        this.rsaPrivateKey = rsaPrivateKey;
    }

    public String getRsaPublicKey() {
        return rsaPublicKey;
    }

    public void setRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public void setSkill() {
    }
}
