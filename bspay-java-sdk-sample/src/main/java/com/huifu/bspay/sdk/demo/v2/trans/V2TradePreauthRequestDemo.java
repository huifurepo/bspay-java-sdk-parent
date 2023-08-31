package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePreauthRequest;

/**
 * 微信支付宝预授权 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePreauthRequest.class)
public class V2TradePreauthRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePreauthRequest request = new V2TradePreauthRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000108854952");
        // 交易金额
        request.setTransAmt("0.02");
        // 商品描述
        request.setGoodsDesc("123213213");
        // 支付授权码
        request.setAuthCode("280426995846228615");
        // 安全信息
        request.setRiskCheckData(getRiskCheckData());

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
        // 外部订单号
        extendInfoMap.put("out_ord_id", "2021031722001427671459048436");
        // 交易发起时间
        extendInfoMap.put("send_time", "12345678901234567");
        // 交易失效时间
        extendInfoMap.put("time_expire", "20221130121212");
        // 禁用信用卡标记
        extendInfoMap.put("limit_pay_type", "NO_CREDIT");
        // 场景类型
        extendInfoMap.put("pay_scene", "02");
        // 渠道号
        extendInfoMap.put("channel_no", "");
        // 传入分帐遇到优惠的处理规则
        extendInfoMap.put("term_div_coupon_type", "1");
        // 支付宝扩展参数集合
        extendInfoMap.put("alipay_data", getAlipayData());
        // 微信扩展参数集合
        extendInfoMap.put("wx_data", getWxData());
        // 商户扩展域
        extendInfoMap.put("mer_priv", "{\"callType\":\"01\",\"lc\":\"12345678901234567890123456789012123\",\"softVersion\":\"6.5.3\"}");
        // 备注
        extendInfoMap.put("remark", "123213132132");
        // 授权号
        extendInfoMap.put("auth_no", "608467");
        // 批次号
        extendInfoMap.put("batch_id", "987654");
        // 商户操作员号
        extendInfoMap.put("mer_oper_id", "12345678901234567890123456789012");
        // 输入密码提示
        // extendInfoMap.put("password_trade", "");
        // 设备信息
        extendInfoMap.put("terminal_device_data", getTerminalDeviceData());
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        return extendInfoMap;
    }

    private static String getExtendParams() {
        JSONObject dto = new JSONObject();
        // 卡类型
        dto.put("card_type", "");
        // 支付宝点餐场景类型
        dto.put("food_order_type", "qr_order");
        // 花呗分期数
        dto.put("hb_fq_num", "");
        // 手续费百分比
        dto.put("hb_fq_seller_percent", "");
        // 行业数据回流信息
        dto.put("industry_reflux_info", "");
        // 系统商编号
        dto.put("sys_service_provider_id", "");

        return dto.toJSONString();
    }

    private static JSON getAliGoodsDetail() {
        JSONObject dto = new JSONObject();
        // 商品的编号
        dto.put("goods_id", "12345678901234567890123456789012");
        // 商品名称
        dto.put("goods_name", "111");
        // 商品单价
        dto.put("price", "1.01");
        // 商品数量
        dto.put("quantity", "1");
        // 商品描述信息
        dto.put("body", "");
        // 商品类目树
        dto.put("categories_tree", "");
        // 商品类目
        dto.put("goods_category", "");
        // 商品的展示地址
        dto.put("show_url", "321313");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getAlipayData() {
        JSONObject dto = new JSONObject();
        // 支付宝的店铺编号
        dto.put("alipay_store_id", "");
        // 业务扩展参数
        dto.put("extend_params", getExtendParams());
        // 订单包含的商品列表信息
        dto.put("goods_detail", getAliGoodsDetail());
        // 商户操作员编号
        dto.put("operator_id", "1234567890123456789012345678");
        // 商户门店编号
        dto.put("store_id", "");

        return dto.toJSONString();
    }

    private static JSON getWxGoodsDetailRucan() {
        JSONObject dto = new JSONObject();
        // 商品编码
        dto.put("goods_id", "1232131");
        // 商品名称
        dto.put("goods_name", "汇付天下");
        // 商品单价
        dto.put("price", "0.50");
        // 商品数量
        dto.put("quantity", 0);
        // 微信侧商品编码
        dto.put("wxpay_goods_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON getWxGoodsRucan() {
        JSONObject dto = new JSONObject();
        // 单品列表
        dto.put("goods_detail", getWxGoodsDetailRucan());
        // 订单原价
        dto.put("cost_price", "1");
        // 商品小票ID
        dto.put("receipt_id", "");

        return dto;
    }

    private static JSON getWxStoreRucan() {
        JSONObject dto = new JSONObject();
        // 门店详细地址
        dto.put("address", "汇付天下桂林路");
        // 门店行政区划码
        dto.put("area_code", "310");
        // 门店id
        dto.put("id", "1232131");
        // 门店名称
        dto.put("name", "测试");

        return dto;
    }

    private static JSON getWxSceneRucan() {
        JSONObject dto = new JSONObject();
        // 门店信息
        dto.put("store_info", getWxStoreRucan());

        return dto;
    }

    private static String getWxData() {
        JSONObject dto = new JSONObject();
        // 附加数据
        dto.put("attach", "");
        // 商品详情
        dto.put("detail", getWxGoodsRucan());
        // 设备号
        dto.put("device_info", "");
        // 订单优惠标记
        dto.put("goods_tag", "12321312");
        // 场景信息
        dto.put("scene_info", getWxSceneRucan());
        // 子商户公众账号ID
        dto.put("sub_appid", "wx48abf94e085e98e1");

        return dto.toJSONString();
    }

    private static String getRiskCheckData() {
        JSONObject dto = new JSONObject();
        // 基站地址
        dto.put("base_station", "192.168.1.1");
        // ip地址
        dto.put("ip_addr", "180.167.105.130");
        // 纬度
        dto.put("latitude", "33.3");
        // 经度
        dto.put("longitude", "33.3");

        return dto.toJSONString();
    }

    private static String getTerminalDeviceData() {
        JSONObject dto = new JSONObject();
        // 商户终端版本号
        dto.put("app_version", "");
        // 交易设备GPS
        dto.put("device_gps", "");
        // 交易设备ICCID
        dto.put("device_icc_id", "");
        // 交易设备IMEI
        dto.put("device_imei", "");
        // 交易设备IMSI
        dto.put("device_imsi", "");
        // 交易设备IP
        dto.put("device_ip", "10.10.0.1");
        // 交易设备MAC
        dto.put("device_mac", "");
        // 设备类型
        dto.put("device_type", "1");
        // 交易设备WIFIMAC
        dto.put("device_wifi_mac", "");
        // 汇付机具号
        dto.put("devs_id", "SPINTP366020000360401");
        // ICCID
        dto.put("icc_id", "");
        // 商户终端实时经纬度信息
        dto.put("location", "+32.10520/+118.80593");
        // 商户交易设备IP
        dto.put("mer_device_ip", "");
        // 商户设备类型
        dto.put("mer_device_type", "01");
        // 移动国家代码
        dto.put("mobile_country_cd", "");
        // 移动网络号码
        dto.put("mobile_net_num", "");
        // 商户终端入网认证编号
        dto.put("network_license", "P3111");
        // 商户终端序列号
        dto.put("serial_num", "");

        return dto.toJSONString();
    }

}
