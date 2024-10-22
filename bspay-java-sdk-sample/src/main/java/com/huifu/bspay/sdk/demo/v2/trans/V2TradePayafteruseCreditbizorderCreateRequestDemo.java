package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePayafteruseCreditbizorderCreateRequest;

/**
 * 服务单创建 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePayafteruseCreditbizorderCreateRequest.class)
public class V2TradePayafteruseCreditbizorderCreateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePayafteruseCreditbizorderCreateRequest request = new V2TradePayafteruseCreditbizorderCreateRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000108281250");
        // 订单总金额
        request.setTransAmt("0.01");
        // 追踪ID
        request.setSourceId("MjA4ODcwMjY5OTkwODI1N3wyMDIxMDAzMTUwNjM4MTE2fDE3Mjg1NDk3OTU0OTl8ZmFsc2V8VE9LRU5fSVNfTlVMTA==");
        // 支付宝用户ID
        request.setBuyerId("2088000000000000");
        // 订单标题
        request.setTitle("测试001");
        // 订单类型
        request.setMerchantBizType("INDIRECT_CHARGE_WITHHOLD");
        // 订单详情地址
        request.setPath("https://www.baidu.com/");
        // 芝麻信用服务ID
        request.setZmServiceId("2024081500001003000081751200");
        // 商品详细信息
        request.setItemInfos(getItemInfos());

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
        // 异步通知地址
        extendInfoMap.put("notify_url", "https://mock.uutool.cn/4pga0jqv8vv0");
        // 支付宝交易号
        extendInfoMap.put("trade_no", "2024092722001408251414114417");
        // 代扣协议签约场景
        extendInfoMap.put("deduct_sign_scene", "INDUSTRY|XIANXIANG_BIKE_CHARGE");
        // 芝麻信用外部类⽬
        extendInfoMap.put("zm_category_id", "credit_pay_for_battery_charging");
        return extendInfoMap;
    }

    private static JSON getItemInstallmentInfo() {
        JSONObject dto = new JSONObject();
        // 总分期数
        dto.put("period_num", 1);
        // 每期最大金额
        dto.put("period_max_price", 0.30);
        // 每期金额
        // dto.put("period_price", "");

        return dto;
    }

    private static String getItemInfos() {
        JSONObject dto = new JSONObject();
        // 商户商品ID
        dto.put("out_item_id", "1234567");
        // 商品名称
        dto.put("goods_name", "快充");
        // 商品数量
        dto.put("item_cnt", "1");
        // 商品单价
        dto.put("sale_price", "0.30");
        // 商品的编号
        dto.put("goods_id", "Ldkc00001");
        // 商品分期信息
        dto.put("item_installment_info", getItemInstallmentInfo());

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
