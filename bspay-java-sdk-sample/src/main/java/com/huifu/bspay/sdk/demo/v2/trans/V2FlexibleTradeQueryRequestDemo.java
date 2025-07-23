package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2FlexibleTradeQueryRequest;

/**
 * 灵工支付查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2FlexibleTradeQueryRequest.class)
public class V2FlexibleTradeQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2FlexibleTradeQueryRequest request = new V2FlexibleTradeQueryRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 原请求流水号原请求流水号与原请求全局流水号二选一必填，示例值：2021091708126665001
        request.setOrgReqSeqId("2025060916130548005test001");
        // 原请求日期原请求流水号必填则原请求日期必填，格式：yyyyMMdd；示例值：20210917
        request.setOrgReqDate("20250609");
        // 汇付商户号
        request.setHuifuId("6666000107740841");
        // 原交易全局流水号原请求流水号与原请求全局流水号二选一必填，  &lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值： 003100TOP1A230816150903P990ac139c0600000&lt;/font&gt;
        request.setOrgHfSeqId("2025060900000000000078864005");

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
