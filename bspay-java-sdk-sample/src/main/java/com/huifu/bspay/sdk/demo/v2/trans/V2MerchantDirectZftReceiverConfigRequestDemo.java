package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantDirectZftReceiverConfigRequest;

/**
 * 直付通分账关系绑定解绑 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantDirectZftReceiverConfigRequest.class)
public class V2MerchantDirectZftReceiverConfigRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantDirectZftReceiverConfigRequest request = new V2MerchantDirectZftReceiverConfigRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付ID
        request.setHuifuId("6666000103886183");
        // 开发者的应用ID
        request.setAppId("2021002171607880");
        // 分账开关
        request.setSplitFlag("1");
        // 分账接收方列表
        request.setZftSplitReceiverList(getZftSplitReceiverList());
        // 状态
        request.setStatus("0");

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
        return extendInfoMap;
    }

    private static String getZftSplitReceiverList() {
        JSONObject dto = new JSONObject();
        // 分账接收方方类型
        dto.put("split_type", "loginName");
        // 分账接收方账号
        dto.put("account", "739100190@qq.com");
        // 分账接收方真实姓名新增分账关系时必填。解绑分账关系时非必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：张三&lt;/font&gt;
        dto.put("name", "邵文");
        // 分账关系描述
        dto.put("memo", "M20220820032239499098320");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
