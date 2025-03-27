package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2WalletTradeRechargeCardRequest;

/**
 * 钱包绑卡充值下单 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2WalletTradeRechargeCardRequest.class)
public class V2WalletTradeRechargeCardRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2WalletTradeRechargeCardRequest request = new V2WalletTradeRechargeCardRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000003100615");
        // 钱包用户ID
        request.setUserHuifuId("6666000108133109");
        // 订单金额
        request.setTransAmt("10.00");
        // 微信充值信息微信充值必填
        // request.setWxRechareInfo(get5aab43a511384703Aee9A17b6d476396());
        // 支付宝充值信息支付宝充值必填
        // request.setAlipayRechargeInfo(get1a9a249fFf56429c8a73E7a93ef80c2b());

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
        // 订单失效时间
        extendInfoMap.put("time_expire", "");
        // 备注
        extendInfoMap.put("remark", "remark11");
        // 充值方式
        extendInfoMap.put("recharge_type", "A01");
        // 绑定卡充值信息
        extendInfoMap.put("bank_recharge_info", get0994fa46Ea53463295f1Db4d35a9e9ed());
        // 异步通知地址
        extendInfoMap.put("notify_url", "archer://C_TOPAT_NOTIFY");
        return extendInfoMap;
    }

    private static String get718333af8b7c4fffAe5a25a0c20f8d7e() {
        JSONObject dto = new JSONObject();
        // 业务种类编码
        dto.put("biz_tp", "100099");
        // 商品简称
        dto.put("goods_short_name", "个人电脑");
        // 支付页面类型
        dto.put("gw_chnnl_tp", "02");

        return dto.toJSONString();
    }

    private static String getCecd9a03C90045d6881d47baf8ff4e54() {
        JSONObject dto = new JSONObject();
        // 交易设备类型
        dto.put("device_type", "3");
        // 交易设备IP
        dto.put("device_ip", "172.31.31.145");
        // 交易设备MAC
        dto.put("device_mac", "F0E1D2C3B4A5");
        // 交易终端设备IMEI
        dto.put("device_imei", "460030912121001");
        // 交易设备IMSI
        dto.put("device_imsi", "460030912121001");
        // 交易设备ICCID
        dto.put("device_icc_id", "898600680113F0123014");
        // 交易设备WIFI MAC
        dto.put("device_wifi_mac", "968778695A4B");
        // 交易设备经纬度
        dto.put("device_gps", "20.346790,-4.654321");

        return dto.toJSONString();
    }

    private static String getA619b5347d694307A1a8C1ef90627a60() {
        JSONObject dto = new JSONObject();
        // 经度
        dto.put("longitude", "2");
        // 纬度
        dto.put("latitude", "1");
        // 基站地址
        dto.put("base_station", "460001039217563");
        // IP地址
        dto.put("ip_addr", "172.28.52.52");

        return dto.toJSONString();
    }

    private static String get0994fa46Ea53463295f1Db4d35a9e9ed() {
        JSONObject dto = new JSONObject();
        // 银行卡序列号
        dto.put("token_no", "10000136685");
        // 跳转地址
        dto.put("front_url", "http://www.baidu.com");
        // 网联扩展数据
        dto.put("extend_pay_data", get718333af8b7c4fffAe5a25a0c20f8d7e());
        // 设备信息
        dto.put("terminal_device_data", getCecd9a03C90045d6881d47baf8ff4e54());
        // 安全信息
        dto.put("risk_check_data", getA619b5347d694307A1a8C1ef90627a60());
        // 密码页面类型
        dto.put("request_type", "M");

        return dto.toJSONString();
    }

    private static String get5aab43a511384703Aee9A17b6d476396() {
        JSONObject dto = new JSONObject();
        // 交易类型
        // dto.put("trade_type", "test");
        // 子商户公众账号ID
        // dto.put("sub_appid", "");
        // 用户标识
        // dto.put("openid", "");
        // 子商户用户标识
        // dto.put("sub_openid", "");
        // 渠道号
        // dto.put("channel_no", "");
        // 场景类型
        // dto.put("pay_scene", "");

        return dto.toJSONString();
    }

    private static String get1a9a249fFf56429c8a73E7a93ef80c2b() {
        JSONObject dto = new JSONObject();
        // 交易类型
        // dto.put("trade_type", "test");
        // 买家的支付宝唯一用户号
        // dto.put("buyer_id", "test");
        // 支付宝的店铺编号
        // dto.put("alipay_store_id", "");
        // 渠道号
        // dto.put("channel_no", "");
        // 场景类型
        // dto.put("pay_scene", "");

        return dto.toJSONString();
    }

}
