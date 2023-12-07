package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePayscoreServiceorderCreateRequest;

/**
 * 创建支付分订单 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePayscoreServiceorderCreateRequest.class)
public class V2TradePayscoreServiceorderCreateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePayscoreServiceorderCreateRequest request = new V2TradePayscoreServiceorderCreateRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户申请单号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 汇付商户号
        request.setHuifuId("6666000108854952");
        // 服务信息
        // request.setServiceIntroduction("test");
        // 服务风险金
        // request.setRiskFund(getRiskFund());
        // 服务时间
        // request.setTimeRange(getTimeRange());
        // 商户回调地址
        // request.setNotifyUrl("test");

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
        // 服务ID
        // extendInfoMap.put("service_id", "");
        // 子商户公众号ID
        // extendInfoMap.put("sub_appid", "");
        // 场景类型
        // extendInfoMap.put("trade_scene", "");
        // 费率类型
        // extendInfoMap.put("pay_scene", "");
        // 从业机构公众号下的用户标识
        // extendInfoMap.put("openid", "");
        // 子商户公众号下的用户标识
        // extendInfoMap.put("sub_openid", "");
        // 后付费项目
        // extendInfoMap.put("post_payments", getPostPayments());
        // 商户优惠
        // extendInfoMap.put("post_discounts", getPostDiscounts());
        // 服务位置
        // extendInfoMap.put("location", getLocation());
        // 附加数据
        // extendInfoMap.put("attach", "");
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

    private static String getRiskFund() {
        JSONObject dto = new JSONObject();
        // 风险名称
        // dto.put("name", "");
        // 风险金额
        // dto.put("amount", "");
        // 风险说明
        // dto.put("description", "");

        return dto.toJSONString();
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
