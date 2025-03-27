package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeSettleCollectionRuleModifyRequest;

/**
 * 修改归集配置 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeSettleCollectionRuleModifyRequest.class)
public class V2TradeSettleCollectionRuleModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeSettleCollectionRuleModifyRequest request = new V2TradeSettleCollectionRuleModifyRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 转出方商户号
        request.setOutHuifuId("6666000152758213");
        // 转出方账户号
        request.setOutAcctId("F03142591");

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
        // 转出方账户留存金额
        extendInfoMap.put("remained_amt", "0.00");
        // 是否关闭
        extendInfoMap.put("close", "");
        return extendInfoMap;
    }

}
