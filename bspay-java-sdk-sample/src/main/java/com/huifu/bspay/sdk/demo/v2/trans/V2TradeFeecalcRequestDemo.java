package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeFeecalcRequest;

/**
 * 手续费试算 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeFeecalcRequest.class)
public class V2TradeFeecalcRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeFeecalcRequest request = new V2TradeFeecalcRequest();
        // 商户号
        request.setHuifuId("6666000109133323");
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 交易类型
        request.setTradeType("ONLINE_PAY");
        // 交易金额
        request.setTransAmt("1000.00");

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
        // 网银交易类型
        extendInfoMap.put("online_trans_type", "3000");
        // 付款方银行编号
        extendInfoMap.put("bank_id", "01020000");
        // 卡类型
        extendInfoMap.put("card_type", "D");
        // 渠道号
        extendInfoMap.put("channel_no", "10000001");
        // 数字货币银行编号
        extendInfoMap.put("digital_bank_no", "01002");
        // 取现到账类型
        extendInfoMap.put("encash_type", "T0");
        // 场景类型
        extendInfoMap.put("pay_scene", "01");
        return extendInfoMap;
    }

}
