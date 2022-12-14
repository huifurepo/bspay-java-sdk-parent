package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeAcctpaymentRefundQueryRequest;

/**
 * 余额支付退款查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeAcctpaymentRefundQueryRequest.class)
public class V2TradeAcctpaymentRefundQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeAcctpaymentRefundQueryRequest request = new V2TradeAcctpaymentRefundQueryRequest();
        // 退款请求流水号
        request.setOrgReqSeqId("20211021787214848332");
        // 余额支付退款请求日期
        request.setOrgReqDate("20211021");
        // 商户号
        request.setHuifuId("6666000018344461");

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
