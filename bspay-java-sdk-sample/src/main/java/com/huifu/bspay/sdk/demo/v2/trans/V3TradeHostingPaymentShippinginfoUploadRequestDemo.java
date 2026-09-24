package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V3TradeHostingPaymentShippinginfoUploadRequest;

/**
 * 发货信息录入 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V3TradeHostingPaymentShippinginfoUploadRequest.class)
public class V3TradeHostingPaymentShippinginfoUploadRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V3TradeHostingPaymentShippinginfoUploadRequest request = new V3TradeHostingPaymentShippinginfoUploadRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000103334211");
        // 订单信息
        request.setOrderKey(get7c40df27Fc134b61B0c7Edce6d8f621b());
        // 物流模式
        request.setLogisticsType("1");
        // 发货模式
        request.setDeliveryMode("1");
        // 否已全部发货完成分拆发货模式时必填，用于标识分拆发货模式下是否已全部发货完成，只有全部发货完成的情况下才会向用户推送发货完成通知。&lt;br/&gt;枚举值: true，false&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：true&lt;/font&gt;
        // request.setIsAllDelivered("test");
        // 上传时间
        request.setUploadTime("20260831101212");

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
        // 物流信息列表
        extendInfoMap.put("shipping_list", get12b9768650294e6cAafb18f939d1ae02());
        // 支付者
        extendInfoMap.put("payer", getD4934e1e62bc4c09B037875617dbf057());
        return extendInfoMap;
    }

    private static String get7c40df27Fc134b61B0c7Edce6d8f621b() {
        JSONObject dto = new JSONObject();
        // 订单单号类型
        dto.put("order_number_type", 2);
        // 原支付交易对应的微信订单号
        dto.put("transaction_id", "fake-transid-20221214190427-1");
        // 支付下单商户的商户号
        // dto.put("mchid", "");
        // 商户系统内部订单号
        // dto.put("out_trade_no", "");

        return dto.toJSONString();
    }

    private static JSON getC48dfa9850104f4c83c360f466f5fb81() {
        JSONObject dto = new JSONObject();
        // 寄件人联系方式
        dto.put("consignor_contact", "+86-177****1234");
        // 收件人联系方式
        // dto.put("receiver_contact", "");

        return dto;
    }

    private static String get12b9768650294e6cAafb18f939d1ae02() {
        JSONObject dto = new JSONObject();
        // 商品信息
        dto.put("item_desc", "微信气泡狗集线器*1");
        // 物流单号
        dto.put("tracking_no", "fake-trackingno-2022121419042711");
        // 物流公司编码，快递公司ID
        dto.put("express_company", "STO");
        // 联系方式
        dto.put("contact", getC48dfa9850104f4c83c360f466f5fb81());

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getD4934e1e62bc4c09B037875617dbf057() {
        JSONObject dto = new JSONObject();
        // 用户标识
        dto.put("openid", "ogqztkPsejM9MQAFfwCQSCi4oNg3");

        return dto.toJSONString();
    }

}
