package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeCloudmisOrderDetailRequest;

/**
 * 云MIS订单详情查询接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeCloudmisOrderDetailRequest.class)
public class V2TradeCloudmisOrderDetailRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeCloudmisOrderDetailRequest request = new V2TradeCloudmisOrderDetailRequest();
        // 原MIS请求商户号
        request.setOrgHuifuId("6666000141203565");
        // 原MIS请求终端号
        request.setOrgDeviceId("310000011015000063677");
        // 原MIS请求日期
        request.setOrgReqDate("20240715");

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
        // 原MIS请求流水号
        extendInfoMap.put("org_req_id", "reqId20240624091729005");
        // 原MIS请求jsonData中的三方单号
        extendInfoMap.put("org_third_order_id", "20240313115926539uf7cqcmwxl30");
        return extendInfoMap;
    }

}
