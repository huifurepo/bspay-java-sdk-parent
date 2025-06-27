package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2OcoOrderListRequest;

/**
 * 全渠道订单分账查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2OcoOrderListRequest.class)
public class V2OcoOrderListRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2OcoOrderListRequest request = new V2OcoOrderListRequest();
        // 请求流水号
        // request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        // request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        // request.setHuifuId("test");
        // 分账数据源
        // request.setBusiSource("test");
        // 交易时间
        // request.setTransDate("test");
        // 页码
        // request.setPageNum("test");
        // 每页大小
        // request.setPageSize("test");

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
