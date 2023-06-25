package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeOnlinepaymentTransferRemittanceorderRequest;

/**
 * 汇付入账查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeOnlinepaymentTransferRemittanceorderRequest.class)
public class V2TradeOnlinepaymentTransferRemittanceorderRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeOnlinepaymentTransferRemittanceorderRequest request = new V2TradeOnlinepaymentTransferRemittanceorderRequest();
        // 商户号
        request.setHuifuId("6666000003100615");
        // 原请求开始日期
        request.setOrgReqStartDate("20230110");
        // 原请求结束日期
        request.setOrgReqEndDate("20230110");

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
        // 原请求流水号
        extendInfoMap.put("org_req_seq_id", "20230110155433defaultit655128593");
        // 原请求日期
        extendInfoMap.put("org_req_date", "20230110");
        // 原汇款订单号
        extendInfoMap.put("org_remittance_order_id", "20230110155433defaultit655128591");
        // 每页条数
        extendInfoMap.put("page_size", "1");
        // 分页页码
        extendInfoMap.put("page_no", "1");
        // 入账批次号
        // extendInfoMap.put("org_batch_no", "");
        return extendInfoMap;
    }

}
