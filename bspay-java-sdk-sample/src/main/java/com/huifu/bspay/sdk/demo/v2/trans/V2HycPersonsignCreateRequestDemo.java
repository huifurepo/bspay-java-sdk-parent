package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2HycPersonsignCreateRequest;

/**
 * 个人签约发起 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2HycPersonsignCreateRequest.class)
public class V2HycPersonsignCreateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2HycPersonsignCreateRequest request = new V2HycPersonsignCreateRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 用户汇付id
        request.setHuifuId("6666000145962643");
        // 落地公司机构号
        request.setMinorAgentId("L20231113140106443");
        // 乐接活请求参数jsonObject格式 合作平台为乐接活时必传
        // request.setLjhData(getDa04d656159b4ec89e2b3b57e7164683());

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
        // 合作平台
        // extendInfoMap.put("lg_platform_type", "");
        // 是否发送签约短信
        extendInfoMap.put("send_sms_flag", "Y");
        // 签约结果通知地址
        extendInfoMap.put("asyn_url", "");
        return extendInfoMap;
    }

    private static String getDa04d656159b4ec89e2b3b57e7164683() {
        JSONObject dto = new JSONObject();
        // 合同模板id合作平台为乐接活时必填 数字格式
        // dto.put("contract_template_id", "test");
        // 任务模板id合作平台为乐接活时必填 数字格式
        // dto.put("task_template_id", "test");
        // 税源地id合作平台为乐接活时必填 数字格式
        // dto.put("tax_area_id", "test");

        return dto.toJSONString();
    }

}
