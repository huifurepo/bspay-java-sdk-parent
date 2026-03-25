package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V3BillpayPlanModifyRequest;

/**
 * 账单计划变更 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V3BillpayPlanModifyRequest.class)
public class V3BillpayPlanModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V3BillpayPlanModifyRequest request = new V3BillpayPlanModifyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000123123123");
        // 账单计划编号
        request.setPlanNo("BP202412270001");

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
        // 账单计划有效期
        extendInfoMap.put("plan_expire_date", "20251231");
        // 是否发送代扣前短信通知
        extendInfoMap.put("sms_notify_flag", "Y");
        // 账单计划状态
        extendInfoMap.put("plan_status", "PROGRESS");
        return extendInfoMap;
    }

}
