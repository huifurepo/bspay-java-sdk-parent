package com.huifu.bspay.sdk.opps.core.net;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.huifu.bspay.sdk.opps.core.BasePay;
import com.huifu.bspay.sdk.opps.core.config.MerConfig;
import com.huifu.bspay.sdk.opps.core.enums.ServerTypeEnum;
import com.huifu.bspay.sdk.opps.core.exception.BasePayException;
import com.huifu.bspay.sdk.opps.core.exception.FailureCode;
import com.huifu.bspay.sdk.opps.core.sign.JsonUtils;
import com.huifu.bspay.sdk.opps.core.utils.HttpClientUtils;
import com.huifu.bspay.sdk.opps.core.utils.RsaUtils;
import com.huifu.bspay.sdk.opps.core.utils.StringUtil;

import java.io.File;
import java.util.*;

/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
public abstract class AbstractRequest {

    public static final String SDK_VERSION = "3.0.14";

    protected static enum RequestMethod {
        GET, POST, DELETE, PUT;

        private RequestMethod() {
        }
    }

    protected static Map<String, Object> requestBasePayCore(RequestMethod method, String uri, Map<String, Object> params, MerConfig config, boolean isPage)
            throws BasePayException {
        return requestBasePayCore(method, uri, params, null, null, config, null, isPage);
    }

    protected static Map<String, Object> requestBasePayCore(RequestMethod method, String uri, Map<String, Object> params, MerConfig config, ServerTypeEnum serverType, boolean isPage)
            throws BasePayException {
        return requestBasePayCore(method, uri, params, null, null, config, serverType, isPage);
    }

    public static String getUrl() {
        String baseUrl;
        switch (BasePay.prodMode) {
            case BasePay.MODE_TEST:
                baseUrl = BasePay.apiBaseTest;
                break;
            case BasePay.MODE_INNER_TEST:
                baseUrl = BasePay.apiBaseMock;
                break;
            default:
                baseUrl = BasePay.apiBase;
                break;
        }
        return baseUrl;
    }

    protected static Map<String, Object> requestBasePayCore(RequestMethod method, String uri, Map<String, Object> params, File file, String fileParam, MerConfig config, ServerTypeEnum serverType, boolean isPage) throws BasePayException {
        String baseUrl = getUrl();
        if (ServerTypeEnum.PAGE.equals(serverType)) {
            baseUrl = getUrl();
        }
        StringBuilder requestUrl = new StringBuilder(baseUrl);
        if (!baseUrl.endsWith("/")) {
            requestUrl.append("/");
        }
        requestUrl.append(uri);
        String back = null;
        Map<String, String> headers = new HashMap<>(4);
        // 传递SDK版本
        headers.put("sdk_version", "javaSDK_" + SDK_VERSION);
        String reqData = JSONObject.toJSONString(params);

        String privateKey = config.getRsaPrivateKey();
        if (BasePay.debug) {
            System.out.println("PRIVATE_KEY=" + privateKey);
        }
        String requestSign;
        try {
            String sortedData = JsonUtils.sort4JsonString(reqData, 0);
            requestSign = RsaUtils.sign(sortedData, privateKey);
        } catch (Exception e) {
            if (BasePay.debug) {
                e.printStackTrace();
            }
            requestSign = null;
        }
        if ((requestSign == null) || (requestSign.length() == 0)) {
            throw new BasePayException(FailureCode.SECURITY_EXCEPTION.getFailureCode(), "Sign error. Please check your privateKey.");
        }
        if (BasePay.debug) {
            System.out.println("request sign=" + requestSign);
        }
        Map<String, Object> request = new HashMap<>();
        request.put("sys_id", config.getSysId());
        request.put("data", JSONObject.parseObject(reqData));
        request.put("sign", requestSign);
        request.put("product_id", config.getProcutId());

        String requestBody = JSON.toJSONString(request);
        if (BasePay.debug) {
            System.out.println("request data = " + JSONObject.parseObject(reqData));
            System.out.println("requestBody param = " + requestBody);
        }
        if ((RequestMethod.POST == method) && (file == null)) {
            headers.put("Content-type", "application/json");
//            back = OkHttpClientTools.httpPost(requestUrl.toString(), requestBody, config.getProcutId());
            back = HttpClientUtils.httpPostJson(requestUrl.toString(), headers, requestBody);
        } else if ((RequestMethod.POST == method) && (file != null)) {
//            back = OkHttpClientTools.httpPostFile(requestUrl.toString(), requestBody, config.getProcutId(),file);
            back = HttpClientUtils.httpPostFile(requestUrl.toString(), headers, request, file, fileParam);
        } else if (RequestMethod.GET == method) {
//            back = OkHttpClientTools.httpGet(requestUrl.toString(), requestBody, config.getProcutId());
            back = HttpClientUtils.httpGet(requestUrl.toString(), headers, params);
        }
        if (BasePay.debug) {
            System.out.println("response string=" + back);
        }
        if ((back == null) || (back.length() == 0)) {
            throw new BasePayException(FailureCode.SYSTEM_EXCEPTION.getFailureCode(), "Request no response. Please check your network.");
        }
        if (BasePay.debug) {
            System.out.println("Is a version of the page=" + isPage);
        }
        if (isPage) {
            // 页面版本支付，需要将页面直接返回给
            JSONObject data = new JSONObject();
            data.put("data", back);
            return data;
        }

        JSONObject jo = JSON.parseObject(back);
        JSONObject data = jo.getJSONObject("data");
        String sign = jo.getString("sign");
        String publicKey = config.getRsaPublicKey();
        if (StringUtil.isEmpty(publicKey)) {
            publicKey = BasePay.HUIFU_DEFAULT_PUBLIC_KEY;
        }
        if (BasePay.debug) {
            System.out.println("PUBLIC_KEY=" + publicKey);
            System.out.println("response data=" + data);
            System.out.println("response sign:" + sign);
        }
        boolean checkSign;
        try {
            String sortedData = JsonUtils.sort4JsonString(JSONObject.toJSONString(data), 5);
            checkSign = RsaUtils.verify(sortedData, publicKey, sign);
        } catch (Exception e) {
            if (BasePay.debug) {
                e.printStackTrace();
            }
            checkSign = false;
        }
        if (!checkSign) {
            if (BasePay.debug) {
                System.out.println("验证签名失败");
            }
            throw new BasePayException(FailureCode.SECURITY_EXCEPTION.getFailureCode(), "Response sign check error. Please check your pubkey.");
        }
        return data;
    }

    public static String getOriginalStr(Map<String, Object> map) {
        List<String> listKeys = new ArrayList<>(map.keySet());
        Collections.sort(listKeys);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < listKeys.size(); i++) {
            if ((map.get(listKeys.get(i)) != null) && (map.get(listKeys.get(i)).toString().length() != 0)) {
                stringBuilder.append((String) listKeys.get(i)).append("=").append(map.get(listKeys.get(i))).append("&");
            }
        }
        return stringBuilder.length() == 0 ? "" : stringBuilder.toString().substring(0, stringBuilder.length() - 1);
    }
}
