package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePayscoreDeductQueryRequest;

/**
 * 查询扣款信息 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePayscoreDeductQueryRequest.class)
public class V2TradePayscoreDeductQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePayscoreDeductQueryRequest request = new V2TradePayscoreDeductQueryRequest();
        // 汇付商户号
        request.setHuifuId("6666000108854952");

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
        // 汇付服务订单号
        // extendInfoMap.put("out_order_no", "");
        // 创建服务订单返回的汇付全局流水号
        // extendInfoMap.put("org_hf_seq_id", "");
        // 服务订单创建请求流水号
        // extendInfoMap.put("org_req_seq_id", "");
        return extendInfoMap;
    }

}