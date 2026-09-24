package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V3TradeHostingPaymentReceiptConfirmRequest;

/**
 * 确认收货提醒 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V3TradeHostingPaymentReceiptConfirmRequest.class)
public class V3TradeHostingPaymentReceiptConfirmRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V3TradeHostingPaymentReceiptConfirmRequest request = new V3TradeHostingPaymentReceiptConfirmRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 快递签收时间
        request.setReceivedTime("1670829139");

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
        // 原支付交易对应的微信订单号
        extendInfoMap.put("transaction_id", "fake-transid-20221209132531-44");
        // 支付下单商户的商户号
        extendInfoMap.put("merchant_id", "fake-mchid-123");
        // 二级商户号
        // extendInfoMap.put("sub_merchant_id", "");
        // 商户系统内部订单号
        extendInfoMap.put("merchant_trade_no", "fake-tradeno-20221209132531-44");
        return extendInfoMap;
    }

}
