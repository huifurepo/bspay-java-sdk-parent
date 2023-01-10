package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantComplaintListInfoQueryRequest;

/**
 * 查询投诉单列表及详情 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantComplaintListInfoQueryRequest.class)
public class V2MerchantComplaintListInfoQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantComplaintListInfoQueryRequest request = new V2MerchantComplaintListInfoQueryRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 开始日期
        request.setBeginDate("2022-10-20");
        // 结束日期
        request.setEndDate("2022-10-20");

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
        // 分页开始位置
        extendInfoMap.put("offset", "");
        // 分页大小
        extendInfoMap.put("limit", "");
        // 被诉的汇付商户ID
        extendInfoMap.put("huifu_id", "");
        // 被诉的商户名称
        extendInfoMap.put("reg_name", "");
        // 微信订单号
        extendInfoMap.put("transaction_id", "");
        // 微信投诉单号
        extendInfoMap.put("complaint_id", "");
        // 投诉状态
        extendInfoMap.put("complaint_state", "");
        // 用户投诉次数
        extendInfoMap.put("user_complaint_times", "");
        // 是否有待回复的用户留言
        extendInfoMap.put("incoming_user_response", "0");
        return extendInfoMap;
    }

}
