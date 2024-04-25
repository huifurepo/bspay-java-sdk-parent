package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeOnlinepaymentTransferAccountRequest;

/**
 * 银行大额支付 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeOnlinepaymentTransferAccountRequest.class)
public class V2TradeOnlinepaymentTransferAccountRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeOnlinepaymentTransferAccountRequest request = new V2TradeOnlinepaymentTransferAccountRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 收款方商户号
        request.setHuifuId("6666000003100616");
        // 交易金额
        request.setTransAmt("10.00");
        // 商品描述
        request.setGoodsDesc("商品描述001");

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
        // 收款方用户客户号
        extendInfoMap.put("user_huifu_id", "6666000103905031");
        // 收款方账户号
        extendInfoMap.put("acct_id", "A01199826");
        // 付款方名称
        extendInfoMap.put("certificate_name", "沈显龙");
        // 付款方银行卡号
        extendInfoMap.put("bank_card_no", "Xmjm1RB4AAOaFYQ+PgjBlpugXbd8VAYAGB3J2zrbLfC42Bh5xiB47OOV1EdXyGpBq4H8je7mB/MlyEEs6O8PX6aoI4QHumr8VglrLM6uzbVNCIc3S5RPSmi2M+9+EdIQ6nlWd5+XQ7RJXX5Uvnegn74XzQBcN1d4gd04buwKbLpUPV3tWd1qjQwEE8w4gwEtH3L5AP75Mynz+wHFrUKJF3BTiW2/zJlcq5GJomOl06GEW52AZkXwn6U2suP3a0ySd0Rxbf1yQ1lj3SP56NeeEzuBaFLQWB7mEqJfZF3pE9MHNfi6tR1xwLdcxt98bdIqlteKdNAmgfQzcS13UcwH+w==");
        // 订单类型
        // extendInfoMap.put("order_type", "");
        // 备注
        extendInfoMap.put("remark", "标记123");
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.huifu.com/getResp");
        // 入账模式
        // extendInfoMap.put("acct_mode", "");
        // 银行模式
        // extendInfoMap.put("bank_mode", "");
        return extendInfoMap;
    }

}
