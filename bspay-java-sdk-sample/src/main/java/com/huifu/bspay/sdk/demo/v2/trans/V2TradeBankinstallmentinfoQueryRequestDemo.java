package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeBankinstallmentinfoQueryRequest;

/**
 * 银行卡分期支持银行查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeBankinstallmentinfoQueryRequest.class)
public class V2TradeBankinstallmentinfoQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeBankinstallmentinfoQueryRequest request = new V2TradeBankinstallmentinfoQueryRequest();
        // 页码
        request.setPageNum("3");
        // 每页条数
        request.setPageSize("1");
        // 产品号
        // request.setProductId("test");

        // 设置非必填字段
        Map<String, Object> extendInfoMap = getExtendInfos();
        request.setExtendInfo(extendInfoMap);

        // 3. 发起API调用
        Map<String, Object> response = doExecute(request, true);
        System.out.println("返回数据:" + JSONObject.toJSONString(response));
    }

    /**
     * 非必填字段
     * @return
     */
    private static Map<String, Object> getExtendInfos() {
        // 设置非必填字段
        Map<String, Object> extendInfoMap = new HashMap<>();
        // 银行编码
        extendInfoMap.put("bank_code", "");
        // 银行名称
        extendInfoMap.put("bank_name", "");
        // 是否启用
        extendInfoMap.put("bank_enable", "");
        return extendInfoMap;
    }

}
