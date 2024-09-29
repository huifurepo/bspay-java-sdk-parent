package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2BillEntChangestatRequest;

/**
 * 企业账单状态变更 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2BillEntChangestatRequest.class)
public class V2BillEntChangestatRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2BillEntChangestatRequest request = new V2BillEntChangestatRequest();
        // 请求流水号
        // request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        // request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        // request.setHuifuId("test");
        // 账单编号
        request.setBillNo("ZD2024082686348233");
        // 变更状态
        // request.setBillStat("test");

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
        // 变更原因
        extendInfoMap.put("remark", "测试");
        return extendInfoMap;
    }

}
