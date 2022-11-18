package com.huifu.bspay.sdk.opps.core.request;

import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 支付基础参数
 * @Author: lj
 * @Date 2021/6/22 18:10
 */
public abstract class BaseRequest {

    /**
     * 其他拓展信息
     */
    protected Map<String, Object> extendInfos = new HashMap<>();

    public Map<String, Object> getExtendInfos() {
        return extendInfos;
    }

    /**
     * 新增拓展参数
     *
     * @return
     */
    public void setExtendInfo(Map<String, Object> extendInfos) {
        this.extendInfos.putAll(extendInfos);
    }

    /**
     * 新增拓展参数
     *
     * @param key
     * @param value
     * @return
     */
    public void addExtendInfo(String key, Object value) {
        this.extendInfos.put(key, value);
    }

    /**
     * functionCode对应接口url
     *
     * @return
     */
    public abstract FunctionCodeEnum getFunctionCode();

    public BaseRequest() {
    }

}
