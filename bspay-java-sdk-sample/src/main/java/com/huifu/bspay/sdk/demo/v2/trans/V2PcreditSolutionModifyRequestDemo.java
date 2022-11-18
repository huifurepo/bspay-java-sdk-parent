package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2PcreditSolutionModifyRequest;

/**
 * 更新花呗分期方案 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2PcreditSolutionModifyRequest.class)
public class V2PcreditSolutionModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2PcreditSolutionModifyRequest request = new V2PcreditSolutionModifyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付客户Id
        request.setHuifuId("6666000110468104");
        // 创建成功后返回的贴息活动方案id
        request.setSolutionId("1515");

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
        // 开发者的应用ID
        extendInfoMap.put("app_id", "2019090666961966");
        // 花呗分期商家贴息活动名称
        extendInfoMap.put("activity_name", "");
        // 活动开始时间
        extendInfoMap.put("start_time", "2019-07-08 00:00:00");
        // 活动结束时间
        extendInfoMap.put("end_time", "2029-07-10 00:00:00");
        return extendInfoMap;
    }

}
