package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePaymentScanpayRefundRequest;

/**
 * 扫码交易退款 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePaymentScanpayRefundRequest.class)
public class V2TradePaymentScanpayRefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePaymentScanpayRefundRequest request = new V2TradePaymentScanpayRefundRequest();
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
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", getDe44bbe09b23407c803428fb32ec77f2());
        // 聚合正扫微信拓展参数集合
        // extendInfoMap.put("wx_data", get306ab7a74a214b9685bf9f8b803d0799());
        // 数字货币扩展参数集合
        // extendInfoMap.put("digital_currency_data", get275b21c978344c1a8e42D801d27cc946());
        // 补贴支付信息
        // extendInfoMap.put("combinedpay_data", get4c09223048e044e3885fC33b82bc6824());
        // 备注
        // extendInfoMap.put("remark", "");
        // 是否垫资退款
        // extendInfoMap.put("loan_flag", "");
        // 垫资承担者
        // extendInfoMap.put("loan_undertaker", "");
        // 垫资账户类型
        // extendInfoMap.put("loan_acct_type", "");
        // 安全信息
        // extendInfoMap.put("risk_check_data", get57d1c866D0554233975688940a9456ee());
        // 设备信息
        // extendInfoMap.put("terminal_device_data", get12d1a96eBb384ca6A52c497be48f399a());
        // 异步通知地址
        // extendInfoMap.put("notify_url", "");
        // 银联参数集合
        // extendInfoMap.put("unionpay_data", get0a1da7886929470c9e95Fb2789cec338());
        return extendInfoMap;
    }

    private static JSON get6fd50ab7Ff504f34B69cCfd37afa62c6() {
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

    private static String getDe44bbe09b23407c803428fb32ec77f2() {
        JSONObject dto = new JSONObject();
        // 分账信息列表
        // dto.put("acct_infos", get6fd50ab7Ff504f34B69cCfd37afa62c6());

        return dto.toJSONString();
    }

    private static JSON getAedeead20c724363A574D8b7611a331c() {
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

    private static JSON getD8986f4e6d8c4855A8f06f1fd2afb044() {
        JSONObject dto = new JSONObject();
        // 商品详情列表
        // dto.put("goods_detail", getAedeead20c724363A574D8b7611a331c());

        return dto;
    }

    private static String get306ab7a74a214b9685bf9f8b803d0799() {
        JSONObject dto = new JSONObject();
        // 退款商品详情
        // dto.put("detail", getD8986f4e6d8c4855A8f06f1fd2afb044());

        return dto.toJSONString();
    }

    private static String get275b21c978344c1a8e42D801d27cc946() {
        JSONObject dto = new JSONObject();
        // 退款原因
        // dto.put("refund_desc", "");

        return dto.toJSONString();
    }

    private static String get4c09223048e044e3885fC33b82bc6824() {
        JSONObject dto = new JSONObject();
        // 补贴方汇付编号
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

    private static String get57d1c866D0554233975688940a9456ee() {
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

    private static String get12d1a96eBb384ca6A52c497be48f399a() {
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

    private static String get0a1da7886929470c9e95Fb2789cec338() {
        JSONObject dto = new JSONObject();
        // 收款方附加数据
        // dto.put("addn_data", "");

        return dto.toJSONString();
    }

}
