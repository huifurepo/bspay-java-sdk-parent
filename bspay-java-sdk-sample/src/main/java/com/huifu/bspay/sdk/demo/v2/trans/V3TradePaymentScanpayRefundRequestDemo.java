package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V3TradePaymentScanpayRefundRequest;

/**
 * 扫码交易退款 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V3TradePaymentScanpayRefundRequest.class)
public class V3TradePaymentScanpayRefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V3TradePaymentScanpayRefundRequest request = new V3TradePaymentScanpayRefundRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000108854952");
        // 申请退款金额
        request.setOrdAmt("0.01");
        // 原交易请求日期
        request.setOrgReqDate("20221107");

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
        // 原交易全局流水号
        extendInfoMap.put("org_hf_seq_id", "002900TOP3B221107142320P992ac139c0c00000");
        // 原交易微信支付宝的商户单号
        // extendInfoMap.put("org_party_order_id", "");
        // 原交易请求流水号
        // extendInfoMap.put("org_req_seq_id", "");
        // 退款微信号
        // extendInfoMap.put("platform_refund_order_id", "");
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", getC8bb3d08Aa6e426dB81468578c90bf58());
        // 微信拓展参数集合
        // extendInfoMap.put("wx_data", get22f840e4Fb5d4244A6d3D671241ef391());
        // 数字货币拓展参数集合
        // extendInfoMap.put("digital_currency_data", get0b544a7b58aa464eA869254f8b6a19f3());
        // 抖音拓展参数集合
        // extendInfoMap.put("dy_data", getD9df184dDd6a41ddB7101e7bcf85f4d7());
        // 补贴支付信息
        // extendInfoMap.put("combinedpay_data", get5f3c61b7Fb85403083c3362eaf492d41());
        // 补贴支付手续费承担方信息
        // extendInfoMap.put("combinedpay_data_fee_info", getDac09693Aca44263803f96ebfa7dd907());
        // 备注
        // extendInfoMap.put("remark", "");
        // 是否垫资退款
        // extendInfoMap.put("loan_flag", "");
        // 垫资承担者
        // extendInfoMap.put("loan_undertaker", "");
        // 垫资账户类型
        // extendInfoMap.put("loan_acct_type", "");
        // 安全信息
        // extendInfoMap.put("risk_check_data", get98fe3d362936415f8f0d6e7521a876d5());
        // 设备信息
        // extendInfoMap.put("terminal_device_data", get42cf982bC44f4b94B00cA3e439a3bd47());
        // 异步通知地址
        // extendInfoMap.put("notify_url", "");
        // 银联参数集合
        // extendInfoMap.put("unionpay_data", getFcd859dc6a954c6dB5797fe76e2dd18a());
        return extendInfoMap;
    }

    private static JSON getDef13c54C8ad465090462093b0b42b06() {
        JSONObject dto = new JSONObject();
        // 分账金额
        // dto.put("div_amt", "test");
        // 分账接收方ID
        // dto.put("huifu_id", "test");
        // 垫资金额
        // dto.put("part_loan_amt", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getC8bb3d08Aa6e426dB81468578c90bf58() {
        JSONObject dto = new JSONObject();
        // 分账信息列表
        // dto.put("acct_infos", getDef13c54C8ad465090462093b0b42b06());

        return dto.toJSONString();
    }

    private static JSON get77b6ae5304fa4aad9369Da7ae715f5f7() {
        JSONObject dto = new JSONObject();
        // 商品编码
        // dto.put("goods_id", "test");
        // 商品退款金额
        // dto.put("refund_amt", "test");
        // 商品退款数量
        // dto.put("refund_quantity", "test");
        // 商品单价
        // dto.put("price", "test");
        // 微信支付商品编码
        // dto.put("wxpay_goods_id", "");
        // 商品名称
        // dto.put("goods_name", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON get6f350cd6F97148e084f6763ac82810b5() {
        JSONObject dto = new JSONObject();
        // 商品详情列表
        // dto.put("goods_detail", get77b6ae5304fa4aad9369Da7ae715f5f7());

        return dto;
    }

    private static String get22f840e4Fb5d4244A6d3D671241ef391() {
        JSONObject dto = new JSONObject();
        // 退款商品详情
        // dto.put("detail", get6f350cd6F97148e084f6763ac82810b5());
        // 退款原因
        // dto.put("refund_desc", "");

        return dto.toJSONString();
    }

    private static String get0b544a7b58aa464eA869254f8b6a19f3() {
        JSONObject dto = new JSONObject();
        // 退款原因
        // dto.put("refund_desc", "");

        return dto.toJSONString();
    }

    private static String getD9df184dDd6a41ddB7101e7bcf85f4d7() {
        JSONObject dto = new JSONObject();
        // 退款原因
        // dto.put("refund_desc", "");

        return dto.toJSONString();
    }

    private static String get5f3c61b7Fb85403083c3362eaf492d41() {
        JSONObject dto = new JSONObject();
        // 汇付商户号
        // dto.put("huifu_id", "test");
        // 补贴方类型
        // dto.put("user_type", "test");
        // 补贴方账户号
        // dto.put("acct_id", "test");
        // 补贴金额
        // dto.put("amount", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getDac09693Aca44263803f96ebfa7dd907() {
        JSONObject dto = new JSONObject();
        // 补贴支付手续费承担方汇付编号
        // dto.put("huifu_id", "");
        // 补贴支付手续费承担方账户号
        // dto.put("acct_id", "");

        return dto.toJSONString();
    }

    private static String get98fe3d362936415f8f0d6e7521a876d5() {
        JSONObject dto = new JSONObject();
        // ip地址
        // dto.put("ip_addr", "");
        // 基站地址
        // dto.put("base_station", "");
        // 纬度
        // dto.put("latitude", "");
        // 经度
        // dto.put("longitude", "");

        return dto.toJSONString();
    }

    private static String get42cf982bC44f4b94B00cA3e439a3bd47() {
        JSONObject dto = new JSONObject();
        // 设备类型
        // dto.put("device_type", "");
        // 交易设备IP
        // dto.put("device_ip", "");
        // 交易设备MAC
        // dto.put("device_mac", "");
        // 交易设备IMEI
        // dto.put("device_imei", "");
        // 交易设备IMSI
        // dto.put("device_imsi", "");
        // 交易设备ICCID
        // dto.put("device_icc_id", "");
        // 交易设备WIFIMAC
        // dto.put("device_wifi_mac", "");
        // 交易设备GPS
        // dto.put("device_gps", "");

        return dto.toJSONString();
    }

    private static String getFcd859dc6a954c6dB5797fe76e2dd18a() {
        JSONObject dto = new JSONObject();
        // 收款方附加数据
        // dto.put("addn_data", "");

        return dto.toJSONString();
    }

}
