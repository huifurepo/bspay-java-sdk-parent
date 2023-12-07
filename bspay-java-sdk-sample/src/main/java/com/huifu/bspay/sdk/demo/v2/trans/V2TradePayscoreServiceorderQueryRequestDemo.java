package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePayscoreServiceorderQueryRequest;

/**
 * 查询支付分订单 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePayscoreServiceorderQueryRequest.class)
public class V2TradePayscoreServiceorderQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePayscoreServiceorderQueryRequest request = new V2TradePayscoreServiceorderQueryRequest();
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
        extendInfoMap.put("out_order_no", "1234323JKHDFE1243252");
        // 汇付全局流水号
        // extendInfoMap.put("org_hf_seq_id", "");
        // 请求流水号
        // extendInfoMap.put("org_req_seq_id", "");
        return extendInfoMap;
    }

}
