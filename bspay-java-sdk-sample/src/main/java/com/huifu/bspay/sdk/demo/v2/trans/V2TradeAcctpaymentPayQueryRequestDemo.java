package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeAcctpaymentPayQueryRequest;

/**
 * 余额支付查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeAcctpaymentPayQueryRequest.class)
public class V2TradeAcctpaymentPayQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeAcctpaymentPayQueryRequest request = new V2TradeAcctpaymentPayQueryRequest();
        // 商户号
        request.setHuifuId("6666000018344461");
        // 原交易请求日期
        request.setOrgReqDate("20211021");

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
        // 原交易请求流水号
        extendInfoMap.put("org_req_seq_id", "202110210012100005");
        // 原交易全局流水号
        extendInfoMap.put("org_hf_seq_id", "");
        return extendInfoMap;
    }

}
