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
    private String procutId;
    /**
     * 系统号，由汇付分配
     */
    @JSONField(name = "sys_id")
    private String sysId;

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

    public String getProcutId() {
        return procutId;
    }

    public void setProcutId(String procutId) {
        this.procutId = procutId;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

}
