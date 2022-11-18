package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2PcreditSolutionCreateRequest;

/**
 * 创建花呗分期方案 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2PcreditSolutionCreateRequest.class)
public class V2PcreditSolutionCreateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2PcreditSolutionCreateRequest request = new V2PcreditSolutionCreateRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付客户Id
        request.setHuifuId("6666000003084836");
        // 花呗分期商家贴息活动名称
        request.setActivityName("花呗分期商家贴息活动名称");
        // 活动开始时间
        request.setStartTime("2019-07-08 00:00:00");
        // 活动结束时间
        request.setEndTime("2039-07-10 00:00:00");
        // 免息金额下限(元)
        request.setMinMoneyLimit("1000");
        // 免息金额上限(元)
        request.setMaxMoneyLimit("3000");
        // 花呗分期贴息预算金额
        request.setAmountBudget("60000");
        // 花呗分期数集合
        request.setInstallNumStrList("3");
        // 预算提醒金额(元)
        request.setBudgetWarningMoney("58000");
        // 预算提醒邮件列表
        request.setBudgetWarningMailList("111@alipay.com");
        // 预算提醒手机号列表
        request.setBudgetWarningMobileNoList("13940001100");
        // 子门店信息集合
        request.setSubShopInfoList(getSubShopInfoList());

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
        // 开发者的应用ID
        extendInfoMap.put("app_id", "");
        return extendInfoMap;
    }

    private static String getSubShopInfoList() {
        JSONObject dto = new JSONObject();
        // 二级商户号
        dto.put("sub_mer_id", "A4854135335181517376");
        // 二级商户名
        dto.put("sub_mer_name", "预二人");
        // 费率
        dto.put("fee_type", "02");
        // 店铺名称
        dto.put("mer_name", "盈盈超市");
        // 省份
        dto.put("province", "浙江省");
        // 市名
        dto.put("city", "杭州市");
        // 区、县
        dto.put("county", "西湖区");
        // 地址详情
        dto.put("detail", "古荡街道西溪路556号蚂蚁Z空间");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
