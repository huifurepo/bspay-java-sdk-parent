package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePayafteruseInstallmentPayRequest;

/**
 * 分期扣款 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePayafteruseInstallmentPayRequest.class)
public class V2TradePayafteruseInstallmentPayRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePayafteruseInstallmentPayRequest request = new V2TradePayafteruseInstallmentPayRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 客户号
        request.setHuifuId("6666000108281250");
        // 交易金额
        request.setTransAmt("0.01");
        // 商品描述
        request.setGoodsDesc("聚合反扫消费");
        // 风控信息
        request.setRiskCheckData(get217763f244c74d4f9f6e0976741d47af());
        // 支付宝扩展参数集合
        request.setAlipayData(getB1c390dfB189490aAeb41d9cf8494335());

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
        // 入账账户号
        extendInfoMap.put("acct_id", "C02682415");
        // 交易备注
        extendInfoMap.put("remark", "");
        // 是否延迟交易
        // extendInfoMap.put("delay_acct_flag", "");
        // 分账串
        // extendInfoMap.put("acct_split_bunch", get4c088b857a3c4ba38a93A3e19ae54eed());
        // 设备信息
        extendInfoMap.put("terminal_device_info", getC9018f09676e4a9d8ff20e82c776a8d2());
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        return extendInfoMap;
    }

    private static JSON getBb0eaeb0451a4e16Ba1095925f7b0cc5() {
        JSONObject dto = new JSONObject();
        // 分账接收方商户号
        // dto.put("huifu_id", "test");
        // 分账金额
        // dto.put("div_amt", "");
        // 分账接收方账户号
        // dto.put("acct_id", "");
        // 分账百分比%
        // dto.put("percentage_div", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get4c088b857a3c4ba38a93A3e19ae54eed() {
        JSONObject dto = new JSONObject();
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");
        // 分账明细
        // dto.put("acct_infos", getBb0eaeb0451a4e16Ba1095925f7b0cc5());

        return dto.toJSONString();
    }

    private static String get217763f244c74d4f9f6e0976741d47af() {
        JSONObject dto = new JSONObject();
        // IP地址
        // dto.put("ip_addr", "test");
        // 经度
        dto.put("longitude", "1");
        // 纬度
        dto.put("latitude", "2");

        return dto.toJSONString();
    }

    private static String getC9018f09676e4a9d8ff20e82c776a8d2() {
        JSONObject dto = new JSONObject();
        // 商户设备类型
        dto.put("mer_device_type", "01");
        // 商户终端实时经纬度信息
        dto.put("location", "+32.10520/+118.80593");
        // 商户交易设备IP
        dto.put("mer_device_ip", "10.11.12.13");
        // 设备类型
        dto.put("device_type", "1");
        // 交易设备IP
        dto.put("device_ip", "10.10.0.1");
        // 交易设备MAC
        dto.put("device_mac", "F0E1D2C3B4A5");
        // 交易设备GPS
        dto.put("device_gps", "20.346790");
        // 交易设备IMEI
        dto.put("device_imei", "660035730311000126101");
        // 交易设备IMSI
        dto.put("device_imsi", "460030912121001");
        // 交易设备ICCID
        dto.put("device_icc_id", "660035730311000126101");
        // 交易设备WIFIMAC
        dto.put("device_wifi_mac", "968778695A4B");

        return dto.toJSONString();
    }

    private static JSON getD00a3da6E2774af9A886Ce75da002699() {
        JSONObject dto = new JSONObject();
        // 商品的编号
        // dto.put("goods_id", "test");
        // 商品名称
        // dto.put("goods_name", "test");
        // 商品数量
        // dto.put("quantity", "test");
        // 商品单价
        // dto.put("price", "test");
        // 商品类目
        // dto.put("goods_category", "");
        // 商品描述信息
        // dto.put("body", "");
        // 商品的展示地址
        // dto.put("show_url", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get7450295cC01444418648417b36ccfa18() {
        JSONObject dto = new JSONObject();
        // 业务主单号
        dto.put("trade_component_order_id", "2024101001502300000002570023887054");
        // 分期履约单号
        dto.put("tc_installment_order_id", "2024101001502301900002570004797346");
        // 系统商编号
        // dto.put("sys_service_provider_id", "");
        // 行业场景类型
        // dto.put("business_type", "");

        return dto.toJSONString();
    }

    private static String getB1c390dfB189490aAeb41d9cf8494335() {
        JSONObject dto = new JSONObject();
        // 业务扩展参数
        dto.put("extend_params", get7450295cC01444418648417b36ccfa18());
        // 支付宝的店铺编号
        dto.put("alipay_store_id", "");
        // 商户操作员编号
        // dto.put("operator_id", "");
        // 商户业务信息
        // dto.put("ali_business_params", "");
        // 订单包含的商品列表信息
        // dto.put("goods_detail", getD00a3da6E2774af9A886Ce75da002699());

        return dto.toJSONString();
    }

}
