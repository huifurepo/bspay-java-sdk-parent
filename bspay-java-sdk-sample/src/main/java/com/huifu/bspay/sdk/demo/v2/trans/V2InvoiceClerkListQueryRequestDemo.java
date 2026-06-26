package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2InvoiceClerkListQueryRequest;

/**
 * 开票员查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2InvoiceClerkListQueryRequest.class)
public class V2InvoiceClerkListQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2InvoiceClerkListQueryRequest request = new V2InvoiceClerkListQueryRequest();
        // 汇付商户号
        request.setHuifuId("6666000103334211");

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
        // 请求流水号
        extendInfoMap.put("req_seq_id", SequenceTools.getReqSeqId32());
        // 请求日期
        extendInfoMap.put("req_date", DateTools.getCurrentDateYYYYMMDD());
        // 登记状态
       // extendInfoMap.put("clerk_state_list", ["S","F","I","P"]);
        return extendInfoMap;
    }

}
