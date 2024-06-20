package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeTransstatQueryRequest;

/**
 * 批量交易状态查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeTransstatQueryRequest.class)
public class V2TradeTransstatQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeTransstatQueryRequest request = new V2TradeTransstatQueryRequest();
        // 商户号
        request.setHuifuId("6666000109133323");
        // 页码
        request.setPageNo("1");
        // 页大小
        request.setPageSize("4");
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());

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
        // 请求订单
        extendInfoMap.put("reqseqid_list", "[\"295700155481522176\",\"20221108104817E93140\",\"20221108104800E93135\",\"20221108112153E93750\",\"20221108133737E96102\"]");
        return extendInfoMap;
    }

}
