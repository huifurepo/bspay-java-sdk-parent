package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2WalletTradePayBalanceRequest;

/**
 * 钱包支付下单 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2WalletTradePayBalanceRequest.class)
public class V2WalletTradePayBalanceRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2WalletTradePayBalanceRequest request = new V2WalletTradePayBalanceRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000135653240");
        // 钱包用户ID
        request.setUserHuifuId("6666000136655020");
        // 订单金额
        request.setTransAmt("0.02");
        // 跳转地址
        request.setFrontUrl("http://www.baidu.com");

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
        // 密码页面类型
        extendInfoMap.put("request_type", "M");
        // 备注
        extendInfoMap.put("remark", "remark11");
        // 商户扩展信息
        extendInfoMap.put("mer_priv", "mer_priv1");
        // 订单失效时间
        // extendInfoMap.put("time_expire", "");
        // 异步通知地址
        // extendInfoMap.put("notify_url", "");
        return extendInfoMap;
    }

}
