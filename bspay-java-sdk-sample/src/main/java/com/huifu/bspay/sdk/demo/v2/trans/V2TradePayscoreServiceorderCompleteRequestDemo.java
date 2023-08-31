package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePayscoreServiceorderCompleteRequest;

/**
 * 完结支付分订单 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePayscoreServiceorderCompleteRequest.class)
public class V2TradePayscoreServiceorderCompleteRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePayscoreServiceorderCompleteRequest request = new V2TradePayscoreServiceorderCompleteRequest();
        // 汇付商户号
        request.setHuifuId("6666000108854952");
        // 汇付订单号
        // request.setOutOrderNo("test");
        // 完结金额
        // request.setOrdAmt("test");
        // 服务时间
        // request.setTimeRange(getTimeRange());

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
        // 创建服务订单返回的汇付全局流水号
        // extendInfoMap.put("org_hf_seq_id", "");
        // 服务订单创建请求流水号
        // extendInfoMap.put("org_req_seq_id", "");
        // 后付费项目
        // extendInfoMap.put("post_payments", getPostPayments());
        // 商户优惠
        // extendInfoMap.put("post_discounts", getPostDiscounts());
        // 服务位置
        // extendInfoMap.put("location", getLocation());
        // 完结服务时间
        // extendInfoMap.put("complete_time", "");
        return extendInfoMap;
    }

    private static String getPostPayments() {
        JSONObject dto = new JSONObject();
        // 付费名称
        // dto.put("name", "");
        // 付费金额
        // dto.put("amount", "");
        // 付费说明
        // dto.put("description", "");
        // 付费数量
        // dto.put("count", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getPostDiscounts() {
        JSONObject dto = new JSONObject();
        // 优惠名称
        // dto.put("name", "");
        // 优惠金额
        // dto.put("amount", "");
        // 优惠说明
        // dto.put("description", "");
        // 优惠数量
        // dto.put("count", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getTimeRange() {
        JSONObject dto = new JSONObject();
        // 服务开始时间
        // dto.put("start_time", "");
        // 服务结束时间
        // dto.put("end_time", "");
        // 服务开始时间备注
        // dto.put("start_time_remark", "");
        // 服务结束时间备注
        // dto.put("end_time_remark", "");

        return dto.toJSONString();
    }

    private static String getLocation() {
        JSONObject dto = new JSONObject();
        // 服务开始地点
        // dto.put("start_location", "");
        // 服务结束地点
        // dto.put("end_location", "");

        return dto.toJSONString();
    }

}
