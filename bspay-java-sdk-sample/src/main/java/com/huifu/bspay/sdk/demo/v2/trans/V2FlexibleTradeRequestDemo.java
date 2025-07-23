package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2FlexibleTradeRequest;

/**
 * 灵工支付 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2FlexibleTradeRequest.class)
public class V2FlexibleTradeRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2FlexibleTradeRequest request = new V2FlexibleTradeRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 出款方商户号
        request.setOutHuifuId("6666000108903745");
        // 出款方账户号
        request.setOutAcctId("C03117654");
        // 交易阶段操作类型
        request.setStageOperationType("FIRST_STAGE");
        // 前段交易流水号** 当交易阶段操作类型为02时，该字段必填。填写的是交易阶段操作类型为01时交易已完成的交易全局流水号。 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：20250620112533115566896&lt;/font&gt;
        request.setPhaseHfSeqId("");
        // 支付金额
        request.setOrdAmt("20");

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
        // 备注
        extendInfoMap.put("remark", "");
        // 分账对象
        extendInfoMap.put("acct_split_bunch", getD5cc6c3fD3854f9fB3eeF736df9fbbf8());
        return extendInfoMap;
    }

    private static JSON get3fc17817Caf445dc8f13A2c315f6d1e8() {
        JSONObject dto = new JSONObject();
        // 分账金额
        dto.put("div_amt", "20.00");
        // 分账接收方ID
        dto.put("huifu_id", "6666000108898793");
        // 账户号
        dto.put("acct_id", "C03113649");

        return dto;
    }

    private static JSON getD5cc6c3fD3854f9fB3eeF736df9fbbf8() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_info", get3fc17817Caf445dc8f13A2c315f6d1e8());

        return dto;
    }

}
