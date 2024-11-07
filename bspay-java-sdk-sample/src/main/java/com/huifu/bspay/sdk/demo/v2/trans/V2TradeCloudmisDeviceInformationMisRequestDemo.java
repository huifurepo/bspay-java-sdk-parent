package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeCloudmisDeviceInformationMisRequest;

/**
 * 终端云MIS交易 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeCloudmisDeviceInformationMisRequest.class)
public class V2TradeCloudmisDeviceInformationMisRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeCloudmisDeviceInformationMisRequest request = new V2TradeCloudmisDeviceInformationMisRequest();
        // 终端设备号
        request.setDeviceId("310000011015000063677");
        // 商户号
        request.setHuifuId("6666000141203565");
        // 交易信息
        request.setJsonData("{\"transAmount\":\"11\",\"interfaceType\":\"SALE\",\"bgRetUrl\":\"virgo://https://shop.91lpp.com/api/common/huifu/posCallback\",\"thirdOrderId\":\"20240313115926539uf7cqcmwxl30\" }");

        // 设置非必填字段
        Map<String, Object> extendInfoMap = getExtendInfos();
        request.setExtendInfo(extendInfoMap);

        // 3. 发起API调用
        Map<String, Object> response = doExecute(request);
        System.out.println("返回数据:" + JSONObject.toJSONString(response));
    }

    /**
     * 非必填字段
     * @return
     */
    private static Map<String, Object> getExtendInfos() {
        // 设置非必填字段
        Map<String, Object> extendInfoMap = new HashMap<>();
        return extendInfoMap;
    }

}
