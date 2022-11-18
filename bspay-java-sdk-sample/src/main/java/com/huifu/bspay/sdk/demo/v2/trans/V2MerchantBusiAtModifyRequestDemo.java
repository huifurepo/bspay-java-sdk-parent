package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBusiAtModifyRequest;

/**
 * 商户AT入驻信息修改 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantBusiAtModifyRequest.class)
public class V2MerchantBusiAtModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBusiAtModifyRequest request = new V2MerchantBusiAtModifyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // AT信息修改列表
        request.setAtRegList(getAtRegList());

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
        // 业务开通结果异步消息接收地址
        extendInfoMap.put("busi_async_return_url", "http://service.example.com/to/path");
        return extendInfoMap;
    }

    private static String getAtRegList() {
        JSONObject dto = new JSONObject();
        // 商户汇付ID
        dto.put("huifu_id", "6666000***456098");
        // 产品号
        dto.put("product_id", "ZDTEST");
        // 业务开通类型
        dto.put("fee_type", "03");
        // 支付通道
        dto.put("pay_way", "W");
        // 子渠道号
        dto.put("pay_channel_id", "JP00001");
        // 经营简称
        dto.put("short_name", "盈盈超市3.0");
        // 客服电话
        dto.put("service_phone", "1752***5001");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
