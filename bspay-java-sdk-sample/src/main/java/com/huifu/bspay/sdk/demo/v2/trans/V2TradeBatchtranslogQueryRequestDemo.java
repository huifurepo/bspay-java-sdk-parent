package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeBatchtranslogQueryRequest;

/**
 * 批量出金交易查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeBatchtranslogQueryRequest.class)
public class V2TradeBatchtranslogQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeBatchtranslogQueryRequest request = new V2TradeBatchtranslogQueryRequest();
        // 商户号
        request.setHuifuId("6666000000041651");
        // 开始日期
        request.setBeginDate("20230315");
        // 结束日期
        request.setEndDate("20230316");

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
        // 交易类型
        extendInfoMap.put("batch_trans_type", "");
        // 分页页码
        extendInfoMap.put("page_num", "1");
        // 分页条数
        extendInfoMap.put("page_size", "10");
        return extendInfoMap;
    }

}
