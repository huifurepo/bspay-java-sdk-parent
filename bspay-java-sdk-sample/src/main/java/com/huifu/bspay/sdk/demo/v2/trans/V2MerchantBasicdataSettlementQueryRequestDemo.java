package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBasicdataSettlementQueryRequest;

/**
 * 结算记录查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantBasicdataSettlementQueryRequest.class)
public class V2MerchantBasicdataSettlementQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBasicdataSettlementQueryRequest request = new V2MerchantBasicdataSettlementQueryRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付客户Id
        request.setHuifuId("6666000111938435");
        // 结算开始日期
        request.setBeginDate("20200810");
        // 结算结束日期
        request.setEndDate("20200810");
        // 分页条数
        request.setPageSize("10");

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
        // 结算方式
        extendInfoMap.put("settle_cycle", "");
        // 分页页码
        extendInfoMap.put("page_num", "1");
        // 交易状态
        extendInfoMap.put("trans_stat", "I");
        // 排序字段
        extendInfoMap.put("sort_column", "10");
        // 排序顺序
        extendInfoMap.put("sort_order", "DESC");
        return extendInfoMap;
    }

}
