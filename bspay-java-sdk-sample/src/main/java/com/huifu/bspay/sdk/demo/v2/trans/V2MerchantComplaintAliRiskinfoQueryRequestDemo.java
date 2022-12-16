package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantComplaintAliRiskinfoQueryRequest;

/**
 * 支付宝投诉查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantComplaintAliRiskinfoQueryRequest.class)
public class V2MerchantComplaintAliRiskinfoQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantComplaintAliRiskinfoQueryRequest request = new V2MerchantComplaintAliRiskinfoQueryRequest();
        // 请求汇付流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求汇付时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 开始日期
        request.setBeginDate("20221115");
        // 结束日期
        request.setEndDate("20221115");

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
        // 分页开始位置
        extendInfoMap.put("offset", "1");
        // 分页大小
        extendInfoMap.put("limit", "5");
        // 通道风险类型
        extendInfoMap.put("risk_type", "");
        // 汇付商户号
        extendInfoMap.put("huifu_id", "");
        // 支付宝推送流水号
        extendInfoMap.put("risk_biz_id", "");
        // 是否可申诉
        extendInfoMap.put("support_appeal", "");
        return extendInfoMap;
    }

}
