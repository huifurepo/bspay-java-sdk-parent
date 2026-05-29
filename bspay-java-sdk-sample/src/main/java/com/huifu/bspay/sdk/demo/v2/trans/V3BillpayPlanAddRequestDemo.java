package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V3BillpayPlanAddRequest;

/**
 * 创建账单计划 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V3BillpayPlanAddRequest.class)
public class V3BillpayPlanAddRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V3BillpayPlanAddRequest request = new V3BillpayPlanAddRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000123123123");
        // 账单项目编号
        // request.setProjectNo("test");
        // 账单周期
        request.setPlanCycle("MONTH");
        // 账单日
        request.setBillDay("15");
        // 补发当前周期账单标志枚举:Y-是、N-否；指定账单日时，必填；若填写是，则立即生成当前系统时间所在周期的账单； 滚动账单日时，此字段无效
        request.setReissueBillFlag("Y");
        // 代扣信息jsonObject格式；账单计划需自动代扣时必填
        request.setWithholdInfoData(getE99cbc55Ce184380A307475a77220ad4());
        // 用户资料信息列表
        request.setUserDocInfoList(getFe462f13Ed914741B68b51220c62772f());
        // 账单收费项信息列表
        request.setPaymentInfoList(get429cef58C12b49b7B98dAa9a14b2a395());

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
        // 账单计划有效期
        extendInfoMap.put("plan_expire_date", "20251231");
        return extendInfoMap;
    }

    private static String getE99cbc55Ce184380A307475a77220ad4() {
        JSONObject dto = new JSONObject();
        // 卡令牌
        dto.put("token_no", "CT202412270001");
        // 是否发送代扣前短信通知
        dto.put("sms_notify_flag", "Y");

        return dto.toJSONString();
    }

    private static String getFe462f13Ed914741B68b51220c62772f() {
        JSONObject dto = new JSONObject();
        // 账单表单字段属性ID
        dto.put("key_no", "userName");
        // 账单表单字段属性值
        dto.put("key_value", "张三");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get429cef58C12b49b7B98dAa9a14b2a395() {
        JSONObject dto = new JSONObject();
        // 账单表单字段属性ID
        dto.put("key_no", "propertyFee");
        // 账单表单字段属性值
        dto.put("key_value", "500.00");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
