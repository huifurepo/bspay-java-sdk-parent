/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
package com.huifu.bspay.sdk.opps.core.net;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *
 * @author kefeng.zheng
 * @version v 0.1
 */
public class BaseRequest {
    @JSONField(name="data")
    private String data;
    @JSONField(name="sign")
    private String sign;
    @JSONField(name="sys_id")
    private String sysId;
    @JSONField(name="sign_type")
    private String signType;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }
}
