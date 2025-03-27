package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantAppealListQueryRequest;

/**
 * 申诉单列表查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantAppealListQueryRequest.class)
public class V2MerchantAppealListQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantAppealListQueryRequest request = new V2MerchantAppealListQueryRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 分页条数
        request.setPageSize("20");
        // 申诉创建开始日期
        request.setBeginDate("20240701");
        // 申诉创建结束日期
        request.setEndDate("20240731");

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
        // 分页页码
        extendInfoMap.put("page_num", "1");
        // 协查单号
        extendInfoMap.put("assist_id", "");
        // 渠道/代理/商户/用户编号
        extendInfoMap.put("huifu_id", "6666000108285670");
        // 商户名称
        extendInfoMap.put("mer_name", "");
        // 申诉状态
        extendInfoMap.put("appeal_node", "");
        // 审核结论
        extendInfoMap.put("audit_result", "");
        // 运营处理状态
        extendInfoMap.put("operation_status", "");
        // 汇付处置等级
        extendInfoMap.put("handle_degree", "");
        return extendInfoMap;
    }

}
