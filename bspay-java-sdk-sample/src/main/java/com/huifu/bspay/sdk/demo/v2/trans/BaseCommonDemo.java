package com.huifu.bspay.sdk.demo.v2.trans;

import com.huifu.bspay.sdk.opps.client.BasePayClient;
import com.huifu.bspay.sdk.opps.core.BasePay;
import com.huifu.bspay.sdk.opps.core.config.MerConfig;
import com.huifu.bspay.sdk.opps.core.request.BaseRequest;

import java.io.File;
import java.util.Map;

/***
 * @Description 功能描述：公共的参数封装DEMO
 * @Date 2021/4/19 15:41
 */
public class BaseCommonDemo {
    /***
     * @Description: 初始化设置商户公共参数（全局只需设置一次）
     * @param merConfig
     * @throws Exception
     * @date: 2021年7月5日17:59:33
     */
    public static void doInit(MerConfig merConfig) throws Exception {
        BasePay.initWithMerConfig(merConfig);
    }

    /***
     * @Description: 执行API调用
     * @param request
     * @throws Exception  Map<String,Object>
     * @date: 2021年7月5日17:59:37
     */
    public static Map<String, Object> doExecute(BaseRequest request) throws Exception {
        return BasePayClient.request(request, false);
    }

    /***
     * @Description: 执行API调用
     * @param request 请求参数
     * @param isPage 是否是页面版本
     * @throws Exception  Map<String,Object>
     * @date: 2021年11月12日15:13:56
     */
    public static Map<String, Object> doExecute(BaseRequest request, boolean isPage) throws Exception {
        return BasePayClient.request(request, isPage);
    }

    /**
     * 执行API调用
     *
     * @param request 请求参数
     * @param file    待上传文件
     * @return
     * @throws Exception
     */
    public static Map<String, Object> doExecute(BaseRequest request, File file) throws Exception {
        return BasePayClient.upload(request, file);
    }

    public static final String REQUEST_SUCC_CODE = "00000000";
}
