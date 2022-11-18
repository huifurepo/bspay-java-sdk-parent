package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TerminaldeviceManageQueryRequest;

/**
 * 服务商终端列表查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TerminaldeviceManageQueryRequest.class)
public class V2TerminaldeviceManageQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TerminaldeviceManageQueryRequest request = new V2TerminaldeviceManageQueryRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());

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
        // 渠道商号
        extendInfoMap.put("upper_huifu_id", "6666000104633228");
        // 终端号
        extendInfoMap.put("deviceId", "");
        // 绑定状态
        extendInfoMap.put("is_bind", "Y");
        // 当前页码
        extendInfoMap.put("page_num", "1");
        // 每页条数
        extendInfoMap.put("page_size", "1");
        return extendInfoMap;
    }

}
