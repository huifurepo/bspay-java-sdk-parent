package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePayafteruseInstallmentRefundRequest;

/**
 * 分期交易退款 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePayafteruseInstallmentRefundRequest.class)
public class V2TradePayafteruseInstallmentRefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePayafteruseInstallmentRefundRequest request = new V2TradePayafteruseInstallmentRefundRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000108281250");
        // 申请退款金额
        request.setOrdAmt("0.01");
        // 原请求日期
        request.setOrgReqDate("20241010");

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
        // 分账串
        // extendInfoMap.put("acct_split_bunch", getF7787e9670d544d18daf492c5188d4b8());
        // 原请求流水号
        extendInfoMap.put("org_req_seq_id", "20241010test10000111qccrr");
        // 原全局流水号
        // extendInfoMap.put("org_hf_seq_id", "");
        // 交易备注
        // extendInfoMap.put("remark", "");
        // 异步通知地址
        // extendInfoMap.put("notify_url", "");
        return extendInfoMap;
    }

    private static JSON get78d9342b81254eae998c1de697882410() {
        JSONObject dto = new JSONObject();
        // 分账金额
        // dto.put("div_amt", "test");
        // 分账接收方商户号
        // dto.put("huifu_id", "test");
        // 分账接收方账户号
        // dto.put("acct_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getF7787e9670d544d18daf492c5188d4b8() {
        JSONObject dto = new JSONObject();
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");
        // 分账明细
        // dto.put("acct_infos", get78d9342b81254eae998c1de697882410());

        return dto.toJSONString();
    }

}
