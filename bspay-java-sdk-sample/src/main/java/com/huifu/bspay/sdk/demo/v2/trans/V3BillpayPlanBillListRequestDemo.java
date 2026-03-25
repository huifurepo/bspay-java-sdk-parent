package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V3BillpayPlanBillListRequest;

/**
 * 查询账单计划下已生成账单数据 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V3BillpayPlanBillListRequest.class)
public class V3BillpayPlanBillListRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V3BillpayPlanBillListRequest request = new V3BillpayPlanBillListRequest();
        // 客户请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 客户请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付商户号
        request.setHuifuId("6666000123123123");
        // 账单计划编号
        request.setPlanNo("BP202412270001");
        // 页码
        request.setPageNum("1");

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
