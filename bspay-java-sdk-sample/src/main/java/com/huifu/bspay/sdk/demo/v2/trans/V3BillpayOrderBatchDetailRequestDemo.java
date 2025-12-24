package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V3BillpayOrderBatchDetailRequest;

/**
 * 查询批量账单数据 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V3BillpayOrderBatchDetailRequest.class)
public class V3BillpayOrderBatchDetailRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V3BillpayOrderBatchDetailRequest request = new V3BillpayOrderBatchDetailRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000123123123");
        // 账单编号与原创建批量账单数据请求流水号二选一必填，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：BN2025091279190693&lt;/font&gt;;
        request.setBillNo("BN2025091279190693");
        // 原创建批量账单数据请求流水号原创建批量账单数据请求流水号，同一商户号当天唯一；与帐单编号二选一必填
        // request.setOriReqSeqId("test");
        // 原创建批量账单数据请求日期原创建批量账单数据日期格式：yyyyMMdd，以北京时间为准；与帐单编号二选一必填
        // request.setOriReqDate("test");

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
