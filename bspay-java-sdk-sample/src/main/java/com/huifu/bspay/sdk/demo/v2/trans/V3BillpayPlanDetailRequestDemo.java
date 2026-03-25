package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V3BillpayPlanDetailRequest;

/**
 * 查询账单计划详情 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V3BillpayPlanDetailRequest.class)
public class V3BillpayPlanDetailRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V3BillpayPlanDetailRequest request = new V3BillpayPlanDetailRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000123123123");
        // 账单计划编号与原请求流水号编号二选一必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：BP202412270001&lt;/font&gt;
        // request.setPlanNo("test");
        // 原请求流水号原请求流水号，同一商户号当天唯一；与账单计划编号二选一必填
        request.setOrgReqSeqId("2022012614120615001");
        // 原请求日期原请求日期格式：yyyyMMdd，以北京时间为准；与账单编号二选一必填
        request.setOrgReqDate("20220125");

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
