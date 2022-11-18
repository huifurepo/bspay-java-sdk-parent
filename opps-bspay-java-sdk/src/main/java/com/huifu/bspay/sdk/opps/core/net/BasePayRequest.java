/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
package com.huifu.bspay.sdk.opps.core.net;

import java.io.File;
import java.util.Map;

import com.huifu.bspay.sdk.opps.core.BasePay;
import com.huifu.bspay.sdk.opps.core.config.MerConfig;
import com.huifu.bspay.sdk.opps.core.enums.ServerTypeEnum;
import com.huifu.bspay.sdk.opps.core.exception.BasePayException;
import com.huifu.bspay.sdk.opps.core.exception.FailureCode;

/**
 *
 * @author kefeng.zheng
 * @version v 0.1
 */
public class BasePayRequest
        extends AbstractRequest {
    public static Map<String, Object> requestBasePay(String uri, Map<String, Object> params)
            throws BasePayException {
        return requestBasePay(uri, params, "default", false);
    }

    public static Map<String, Object> requestBasePay(String uri, Map<String, Object> params, ServerTypeEnum serverType)
            throws BasePayException {
        return requestBasePay(uri, params, "default", serverType,false);
    }

    public static Map<String, Object> requestBasePay(String uri, Map<String, Object> params, String merchantKey ,boolean isPage)
            throws BasePayException {
        return requestBasePay(uri, params, (File) null, (String) null, merchantKey, isPage);
    }

    public static Map<String, Object> requestBasePay(String uri, Map<String, Object> params, String merchantKey, ServerTypeEnum serverType, boolean isPage)
            throws BasePayException {
        return requestBasePay(uri, params, (File) null, (String) null, merchantKey, serverType,isPage);
    }

    public static Map<String, Object> requestBasePay(String uri, Map<String, Object> params, File file, String fileParam, String merchantKey, boolean isPage)
            throws BasePayException {
        return requestBasePay(uri, params, file, fileParam, merchantKey, null, isPage);
    }

    public static Map<String, Object> requestBasePay(String uri, Map<String, Object> params, File file, String fileParam, String merchantKey, ServerTypeEnum serverType, boolean isPage)
            throws BasePayException {
        MerConfig config = BasePay.getConfig(merchantKey);
        if (null == config) {
            throw new BasePayException(FailureCode.CONFIG_EXCEPTION.getFailureCode(), "未找到对应" + merchantKey + "商户配置");
        }

        return requestBasePayCore(AbstractRequest.RequestMethod.POST, uri, params, file, fileParam, config, serverType, isPage);
    }

    public static Map<String, Object> getRequestBasePay(String uri, Map<String, Object> params, boolean isPage)
            throws BasePayException {
        return getRequestBasePay(uri, params, "default", isPage);
    }

    public static Map<String, Object> getRequestBasePay(String uri, Map<String, Object> params, ServerTypeEnum serverType, boolean isPage)
            throws BasePayException {
        return getRequestBasePay(uri, params, "default", serverType, isPage);
    }

    public static Map<String, Object> getRequestBasePay(String uri, Map<String, Object> params, String merchantKey, boolean isPage)
            throws BasePayException {
        MerConfig config = BasePay.getConfig(merchantKey);
        if (null == config) {
            throw new BasePayException(FailureCode.CONFIG_EXCEPTION.getFailureCode(), "未找到对应" + merchantKey + "的商户配置");
        }

        return requestBasePayCore(RequestMethod.POST, uri, params, config, isPage);
    }

    public static Map<String, Object> getRequestBasePay(String uri, Map<String, Object> params, String merchantKey, ServerTypeEnum serverType, boolean isPage)
            throws BasePayException {
        MerConfig config = BasePay.getConfig(merchantKey);
        if (null == config) {
            throw new BasePayException(FailureCode.CONFIG_EXCEPTION.getFailureCode(), "未找到对应" + merchantKey + "的商户配置");
        }

        return requestBasePayCore(RequestMethod.POST, uri, params, config, serverType, isPage);
    }
}
