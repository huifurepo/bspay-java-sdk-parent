package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2WalletTradeWithdrawalRequest;

/**
 * 钱包提现下单 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2WalletTradeWithdrawalRequest.class)
public class V2WalletTradeWithdrawalRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2WalletTradeWithdrawalRequest request = new V2WalletTradeWithdrawalRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000135653240");
        // 钱包用户ID
        request.setUserHuifuId("6666000136655020");
        // 银行卡序列号
        request.setTokenNo("10043478052");
        // 提现金额
        // request.setTransAmt("test");
        // 跳转地址
        request.setFrontUrl("http://www.huifu.com");
        // 异步通知地址
        request.setNotifyUrl("https://");
        // 到账日期类型
        request.setIntoAcctDateType("D0");

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
        return extendInfoMap;
    }

}
