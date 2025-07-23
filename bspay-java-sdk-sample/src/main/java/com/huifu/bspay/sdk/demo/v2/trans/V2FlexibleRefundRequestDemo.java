package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2FlexibleRefundRequest;

/**
 * 灵工支付退款 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2FlexibleRefundRequest.class)
public class V2FlexibleRefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2FlexibleRefundRequest request = new V2FlexibleRefundRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 原请求日期
        request.setOrgReqDate("20250617");
        // 原灵工支付交易流水号&lt;font color&#x3D;&quot;green&quot;&gt;示例值：2021091708126665231&lt;/font&gt;
        request.setOrgReqSeqId("20250618710431811test001");
        // 原灵工支付汇付全局流水号与原灵工支付交易流水号必选其一&lt;font color&#x3D;&quot;green&quot;&gt;示例值：2021091708126665001&lt;/font&gt;
        request.setOrgHfSeqId("");
        // 发起方商户号
        request.setHuifuId("6666000108903745");
        // 支付金额
        request.setOrdAmt("10");

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
        // 备注
        extendInfoMap.put("remark", "备注11111");
        return extendInfoMap;
    }

}
