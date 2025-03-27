package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeAcctpaymentAcctlogQueryRequest;

/**
 * 账务流水查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeAcctpaymentAcctlogQueryRequest.class)
public class V2TradeAcctpaymentAcctlogQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeAcctpaymentAcctlogQueryRequest request = new V2TradeAcctpaymentAcctlogQueryRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 渠道/代理/商户/用户编号
        request.setHuifuId("6666000108854952");
        // 账务日期
        request.setAcctDate("20220816");

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
        // 每页条数
        extendInfoMap.put("page_size", "10");
        // 分页页码
        extendInfoMap.put("page_num", "1");
        // 账户号
        // extendInfoMap.put("acct_id", "");
        // 账户类型
        extendInfoMap.put("acct_type", "01");
        return extendInfoMap;
    }

}
