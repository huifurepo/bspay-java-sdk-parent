package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V3BillpayOrderBatchAddRequest;

/**
 * 创建批量账单数据 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V3BillpayOrderBatchAddRequest.class)
public class V3BillpayOrderBatchAddRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V3BillpayOrderBatchAddRequest request = new V3BillpayOrderBatchAddRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000123123123");
        // 账单项目编号
        request.setProjectNo("BN2025091279190693");
        // 用户资料信息列表
        // request.setUserDocInfoList(get5c2e7c16296940238d680181de1820b9());
        // 账单收费项信息列表
        // request.setPaymentInfoList(get892c7e04F78848c79b53333c9ca3135a());

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
        // 是否生效
        // extendInfoMap.put("effective_flag", "");
        return extendInfoMap;
    }

    private static String get5c2e7c16296940238d680181de1820b9() {
        JSONObject dto = new JSONObject();
        // 账单表单字段属性ID
        // dto.put("key_no", "test");
        // 账单表单字段属性值
        // dto.put("key_value", "");

        return dto.toJSONString();
    }

    private static String get892c7e04F78848c79b53333c9ca3135a() {
        JSONObject dto = new JSONObject();
        // 账单表单字段属性ID
        // dto.put("key_no", "test");
        // 账单表单字段属性值
        // dto.put("key_value", "");

        return dto.toJSONString();
    }

}
