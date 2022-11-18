/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
package com.huifu.bspay.sdk.opps.client;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.huifu.bspay.sdk.opps.core.BasePay;
import com.huifu.bspay.sdk.opps.core.exception.BasePayException;
import com.huifu.bspay.sdk.opps.core.exception.FailureCode;
import com.huifu.bspay.sdk.opps.core.net.BasePayRequest;
import com.huifu.bspay.sdk.opps.core.request.BaseRequest;
import com.huifu.bspay.sdk.opps.core.utils.ObjectUtils;
import com.huifu.bspay.sdk.opps.core.utils.StringUtil;

import java.io.File;
import java.util.Map;

/**
 * @author kefeng.zheng
 * @version v 0.1
 */
public class BasePayClient {

    /**
     * 反扫
     *
     * @param request
     * @return
     * @throws BasePayException
     * @throws IllegalAccessException
     */
    public static Map<String, Object> request(BaseRequest request) throws BasePayException, IllegalAccessException {
        return request(request, request.getFunctionCode().getCode(), false);
    }

    public static Map<String, Object> request(BaseRequest request, boolean isPage) throws BasePayException, IllegalAccessException {
        return request(request, request.getFunctionCode().getCode(), isPage);
    }

    public static Map<String, Object> request(BaseRequest request, String funcCode, boolean isPage) throws BasePayException, IllegalAccessException {
        return request(request, funcCode, null, isPage);
    }

    public static Map<String, Object> request(BaseRequest request, String funcCode, String merchantKey, boolean isPage) throws BasePayException, IllegalAccessException {
        //1.把requset转为map，适应params<string,Object>
        Map<String, Object> params = ObjectUtils.objectToMap(request);
        //2.把reqest.extendInfos 里的键值，覆盖已有的
        if (request.getExtendInfos() != null && request.getExtendInfos().size() > 0) {
            params.putAll(request.getExtendInfos());
        }
        //3.调用接口
        return request(params, funcCode, merchantKey, isPage);
    }

    /**
     * 使用默认商户配置调用汇付接口
     *
     * @param params   接口参数集合
     * @param funcCode 功能编码
     * @return 返回参数集合
     * @throws BasePayException
     */
    public static Map<String, Object> request(Map<String, Object> params, String funcCode, boolean isPage) throws BasePayException {
        return request(params, funcCode, null, isPage);
    }

    /**
     * 使用指定商户配置调用汇付接口
     *
     * @param params      接口参数集合
     * @param funcCode    功能编码
     * @param merchantKey 商户配置名
     * @return 返回参数集合
     * @throws BasePayException
     */
    public static Map<String, Object> request(Map<String, Object> params, String funcCode, String merchantKey, boolean isPage) throws BasePayException {
        // 接口名必送检查
        if (StringUtil.isEmpty(funcCode)) {
            throw new BasePayException(FailureCode.REQUEST_PARAMETER_ERROR.getFailureCode(), "请指定要调用的接口的功能编码");
        }

        // 风控字段的特殊处理，如果上送的是对象，则转换为JSON字符串，如果是字符串则保持原样
        if (params.containsKey("risk_check_data")) {
            Object riskCheckInfo = params.get("risk_check_data");
            if (!(riskCheckInfo instanceof String)) {
                params.put("risk_check_data", JSON.toJSONString(riskCheckInfo));
            }
        }

        String interfaceUrl = funcCode.replaceAll("\\.", "/");
        return BasePayRequest.requestBasePay(interfaceUrl, params, merchantKey, isPage);
    }

    /**
     * 文件上传
     *
     * @param request 结构参数集合
     * @param file    要上传的文件对象
     * @return 文件上传结果
     * @throws BasePayException
     */
    public static Map<String, Object> upload(BaseRequest request, File file) throws BasePayException, IllegalAccessException {
        //1.把requset转为map，适应params<string,Object>
        Map<String, Object> params = ObjectUtils.objectToMap(request);
        //2.把reqest.extendInfos 里的键值，覆盖已有的
        if (request.getExtendInfos() != null && request.getExtendInfos().size() > 0) {
            params.putAll(request.getExtendInfos());
        }
        if (BasePay.debug) {
            System.out.println(">>" + JSONObject.toJSONString(params));
        }
        //3.调用接口
        return upload(params, file, request.getFunctionCode().getCode(), null);
    }

    /**
     * 文件上传
     *
     * @param params   结构参数集合
     * @param file     要上传的文件对象
     * @param funcCode 接口功能编码
     * @return 文件上传结果
     * @throws BasePayException
     */
    public static Map<String, Object> upload(Map<String, Object> params, File file, String funcCode) throws BasePayException {
        return upload(params, file, funcCode, null);
    }

    /**
     * 文件上传
     *
     * @param params      结构参数集合
     * @param file        要上传的文件对象
     * @param funcCode    要上传的文件对象
     * @param merchantKey 商户配置名
     * @return 文件上传结果
     * @throws BasePayException
     */
    public static Map<String, Object> upload(Map<String, Object> params, File file, String funcCode, String merchantKey) throws BasePayException {

        // 接口名必送检查
        if (StringUtil.isEmpty(funcCode)) {
            throw new BasePayException(FailureCode.REQUEST_PARAMETER_ERROR.getFailureCode(), "请指定要调用的接口的功能编码");
        }
        String interfaceUrl = funcCode.replaceAll("\\.", "/");
        // isPage true 客户端不做验签操作
        return BasePayRequest.requestBasePay(interfaceUrl, params, file, "file", merchantKey, true);
    }

}
