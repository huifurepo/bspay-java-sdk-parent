package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V3TradeHostingPaymentCombinedshippinginfoUploadRequest;

/**
 * 发货信息合单录入 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V3TradeHostingPaymentCombinedshippinginfoUploadRequest.class)
public class V3TradeHostingPaymentCombinedshippinginfoUploadRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V3TradeHostingPaymentCombinedshippinginfoUploadRequest request = new V3TradeHostingPaymentCombinedshippinginfoUploadRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000103334211");
        // 订单信息
        request.setOrderKey(getAa22aa8e4421431bBcbb03bf9ea6b08d());
        // 上传时间
        request.setUploadTime("20231112200913");
        // 支付者
        request.setPayer(getAeaf17f6D3934753A5f70c39ebdf7f85());

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
        // 子单物流详情
        extendInfoMap.put("sub_orders", get3614704a5b104be1906399e5c7076590());
        return extendInfoMap;
    }

    private static String getAa22aa8e4421431bBcbb03bf9ea6b08d() {
        JSONObject dto = new JSONObject();
        // 订单单号类型
        dto.put("order_number_type", "1");
        // 原支付交易对应的微信订单号
        // dto.put("transaction_id", "");
        // 支付下单商户的商户号
        dto.put("mchid", "fake-mchid-123");
        // 商户系统内部订单号
        dto.put("out_trade_no", "fake-tradeno-20221214190427-0");

        return dto.toJSONString();
    }

    private static String getAeaf17f6D3934753A5f70c39ebdf7f85() {
        JSONObject dto = new JSONObject();
        // 用户标识
        dto.put("openid", "ogqztkPsejM9MQAFfwCQSCi4oNg3");

        return dto.toJSONString();
    }

    private static JSON getFc965ab6287d405dAb325c90241f7b70() {
        JSONObject dto = new JSONObject();
        // 订单单号类型
        dto.put("order_number_type", "1");
        // 原支付交易对应的微信订单号
        // dto.put("transaction_id", "");
        // 支付下单商户的商户号
        dto.put("mchid", "fake-mchid-123");
        // 商户系统内部订单号
        dto.put("out_trade_no", "fake-tradeno-20221214190427-01");

        return dto;
    }

    private static JSON getAfc3fe0753a949889a8b3bac0ed4196a() {
        JSONObject dto = new JSONObject();
        // 寄件人联系方式
        dto.put("consignor_contact", "021-**34-12");
        // 收件人联系方式
        // dto.put("receiver_contact", "");

        return dto;
    }

    private static JSON getCc61a8ed21154bdd8231E4e48a2ae31a() {
        JSONObject dto = new JSONObject();
        // 商品信息
        dto.put("item_desc", "微信气泡狗零钱包*1");
        // 物流单号
        dto.put("tracking_no", "fake-trackingno-202212141904271");
        // 物流公司编码
        dto.put("express_company", "YD");
        // 联系方式
        dto.put("contact", getAfc3fe0753a949889a8b3bac0ed4196a());

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get3614704a5b104be1906399e5c7076590() {
        JSONObject dto = new JSONObject();
        // 需要上传物流详情的子单订单，订单类型与合单订单保持一致
        dto.put("order_key", getFc965ab6287d405dAb325c90241f7b70());
        // 物流模式
        dto.put("logistics_type", "1");
        // 发货模式
        dto.put("delivery_mode", "2");
        // 是否已全部发货完成
        dto.put("is_all_delivered", "true");
        // 子单物流信息列表
        dto.put("shipping_list", getCc61a8ed21154bdd8231E4e48a2ae31a());

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
