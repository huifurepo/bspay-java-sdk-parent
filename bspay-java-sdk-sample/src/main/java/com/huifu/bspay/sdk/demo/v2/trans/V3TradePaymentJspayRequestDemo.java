package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V3TradePaymentJspayRequest;

/**
 * 应用场景 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V3TradePaymentJspayRequest.class)
public class V3TradePaymentJspayRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V3TradePaymentJspayRequest request = new V3TradePaymentJspayRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 商品描述
        request.setGoodsDesc("hibs自动化-通用版验证");
        // 交易类型
        request.setTradeType("A_NATIVE");
        // 交易金额
        request.setTransAmt("0.10");

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
        // 账户号
        // extendInfoMap.put("acct_id", "");
        // 交易有效期
        extendInfoMap.put("time_expire", "20250518235959");
        // 微信参数集合
        extendInfoMap.put("wx_data", get34dff1117b3d4b27Bb3a3008d1385a3b());
        // 支付宝参数集合
        extendInfoMap.put("alipay_data", get28071c3dCc3a4138Bb93B53b837d1cdf());
        // 银联参数集合
        extendInfoMap.put("unionpay_data", getEa0b07b621664848Be1e04aaca89faac());
        // 数字人民币参数集合
        // extendInfoMap.put("dc_data", get2e3e0476D8db4f9581a0Aed52599fcf0());
        // 是否延迟交易
        extendInfoMap.put("delay_acct_flag", "N");
        // 手续费扣款标志
        // extendInfoMap.put("fee_flag", "");
        // 分账对象
        extendInfoMap.put("acct_split_bunch", getFf4d5a9c4eaa4b21A7506e25c22c0d53());
        // 传入分账遇到优惠的处理规则
        extendInfoMap.put("term_div_coupon_type", "0");
        // 补贴支付信息
        // extendInfoMap.put("combinedpay_data", getC26c8071286f429eB3aeC03ea7829128());
        // 禁用信用卡标记
        extendInfoMap.put("limit_pay_type", "NO_CREDIT");
        // 商户贴息标记
        extendInfoMap.put("fq_mer_discount_flag", "N");
        // 渠道号
        extendInfoMap.put("channel_no", "");
        // 场景类型
        extendInfoMap.put("pay_scene", "02");
        // 备注
        extendInfoMap.put("remark", "string");
        // 安全信息
        extendInfoMap.put("risk_check_data", get4eb45e7eD9844eac90378cd4e494a1f0());
        // 设备信息
        extendInfoMap.put("terminal_device_data", get09c5df58509a4737941606d5a11a639e());
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        // 手续费补贴信息
        // extendInfoMap.put("trans_fee_allowance_info", getC805c7554acd47419b994955bef7d73f());
        return extendInfoMap;
    }

    private static JSON get990d443c980a428e805bEf11f3022ab6() {
        JSONObject dto = new JSONObject();
        // 商品编码
        dto.put("goods_id", "6934572310301");
        // 商品名称
        dto.put("goods_name", "太龙双黄连口服液");
        // 商品单价(元)
        dto.put("price", "43.00");
        // 商品数量
        dto.put("quantity", "1");
        // 微信侧商品编码
        dto.put("wxpay_goods_id", "12235413214070356458058");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON getA413a09d56b3469cB0ec46dda8bd1aa8() {
        JSONObject dto = new JSONObject();
        // 单品列表
        dto.put("goods_detail", get990d443c980a428e805bEf11f3022ab6());
        // 订单原价(元)
        dto.put("cost_price", "43.00");
        // 商品小票ID
        dto.put("receipt_id", "20220628132043853798");

        return dto;
    }

    private static JSON get2812fc764a1c43bbB5a711e1eb2ec245() {
        JSONObject dto = new JSONObject();
        // 门店id
        // dto.put("id", "");
        // 门店名称
        // dto.put("name", "");
        // 门店行政区划码
        // dto.put("area_code", "");
        // 门店详细地址
        // dto.put("address", "");

        return dto;
    }

    private static JSON get6427e4d1C5b04033A009Ed75137a47c1() {
        JSONObject dto = new JSONObject();
        // 门店信息
        // dto.put("store_info", get2812fc764a1c43bbB5a711e1eb2ec245());

        return dto;
    }

    private static String get34dff1117b3d4b27Bb3a3008d1385a3b() {
        JSONObject dto = new JSONObject();
        // 子商户应用ID
        dto.put("sub_appid", "wxdfe9a5d141f96685");
        // 子商户用户标识
        dto.put("sub_openid", "o8jhotzittQSetZ-N0Yj4Hz91Rqc");
        // 附加数据
        // dto.put("attach", "");
        // 商品描述
        // dto.put("body", "");
        // 商品详情
        dto.put("detail", getA413a09d56b3469cB0ec46dda8bd1aa8());
        // 设备号
        // dto.put("device_info", "");
        // 订单优惠标记
        // dto.put("goods_tag", "");
        // 实名支付
        // dto.put("identity", "");
        // 开发票入口开放标识
        // dto.put("receipt", "");
        // 场景信息
        dto.put("scene_info", get6427e4d1C5b04033A009Ed75137a47c1());
        // 终端ip
        // dto.put("spbill_create_ip", "");
        // 单品优惠标识
        // dto.put("promotion_flag", "");
        // 新增商品ID
        // dto.put("product_id", "");
        // 指定支付者
        // dto.put("limit_payer", "");

        return dto.toJSONString();
    }

    private static JSON getAdb91d85B07f4236Ace45638f9b662b8() {
        JSONObject dto = new JSONObject();
        // 卡类型
        dto.put("card_type", "");
        // 支付宝点餐场景类型
        dto.put("food_order_type", "qr_order");
        // 花呗分期数
        dto.put("hb_fq_num", "");
        // 花呗卖家手续费百分比
        dto.put("hb_fq_seller_percent", "");
        // 行业数据回流信息
        dto.put("industry_reflux_info", "string");
        // 信用卡分期资产方式
        // dto.put("fq_channels", "");
        // 停车场id
        dto.put("parking_id", "123wsx");
        // 系统商编号
        dto.put("sys_service_provider_id", "1111111");

        return dto;
    }

    private static JSON get2bcdeef090ce43a0Ae4eAc0081d748ea() {
        JSONObject dto = new JSONObject();
        // 商品的编号
        dto.put("goods_id", "12312321");
        // 商品名称
        dto.put("goods_name", "汇付");
        // 商品单价(元)
        dto.put("price", "43.00");
        // 商品数量
        dto.put("quantity", "20");
        // 商品描述信息
        dto.put("body", "");
        // 商品类目树
        dto.put("categories_tree", "string");
        // 商品的展示地址
        dto.put("show_url", "");
        // 商品类目
        dto.put("goods_category", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON get6b063f1564c248ecA7c7063379f288a6() {
        JSONObject dto = new JSONObject();
        // 姓名
        // dto.put("name", "");
        // 手机号
        // dto.put("mobile", "");
        // 证件类型
        // dto.put("cert_type", "");
        // 证件号
        // dto.put("cert_no", "");
        // 允许的最小买家年龄
        // dto.put("min_age", "");
        // 是否强制校验付款人身份信息
        // dto.put("fix_buyer", "");
        // 是否强制校验身份信息
        // dto.put("need_check_info", "");

        return dto;
    }

    private static String get28071c3dCc3a4138Bb93B53b837d1cdf() {
        JSONObject dto = new JSONObject();
        // 买家的支付宝唯一用户号
        dto.put("buyer_id", "2088702699908257");
        // 支付宝的店铺编号
        dto.put("alipay_store_id", "");
        // 买家支付宝账号
        dto.put("buyer_logon_id", "string");
        // 业务扩展参数
        dto.put("extend_params", getAdb91d85B07f4236Ace45638f9b662b8());
        // 订单包含的商品列表信息
        dto.put("goods_detail", get2bcdeef090ce43a0Ae4eAc0081d748ea());
        // 商户原始订单号
        dto.put("merchant_order_no", "string");
        // 商户操作员编号
        dto.put("operator_id", "123213213");
        // 销售产品码
        dto.put("product_code", "string");
        // 卖家支付宝用户号
        dto.put("seller_id", "string");
        // 商户门店编号
        dto.put("store_id", "");
        // 外部指定买家
        // dto.put("ext_user_info", get6b063f1564c248ecA7c7063379f288a6());
        // 订单标题
        // dto.put("subject", "");
        // 商家门店名称
        // dto.put("store_name", "");
        // 小程序应用的appid
        // dto.put("op_app_id", "");
        // 商户业务信息
        // dto.put("ali_business_params", "");
        // 订单描述
        // dto.put("body", "");
        // 优惠明细参数
        // dto.put("ali_promo_params", "");

        return dto.toJSONString();
    }

    private static JSON get5a98aa4f669240eeB5c328ec1d900bd5() {
        JSONObject dto = new JSONObject();
        // 商户类别
        // dto.put("mer_cat_code", "");
        // 二级商户代码
        // dto.put("sub_id", "");
        // 二级商户名称
        // dto.put("sub_name", "");
        // 终端号
        // dto.put("term_id", "");

        return dto;
    }

    private static String getEa0b07b621664848Be1e04aaca89faac() {
        JSONObject dto = new JSONObject();
        // 二维码
        // dto.put("qr_code", "");
        // 收款方附加数据
        // dto.put("addn_data", "");
        // 地区信息
        // dto.put("area_info", "");
        // 持卡人ip
        // dto.put("customer_ip", "");
        // 前台通知地址
        // dto.put("front_url", "");
        // 订单描述
        // dto.put("order_desc", "");
        // 收款方附言
        // dto.put("payee_comments", "");
        // 收款方信息
        // dto.put("payee_info", get5a98aa4f669240eeB5c328ec1d900bd5());
        // 银联分配的服务商机构标识码
        // dto.put("pnr_ins_id_cd", "");
        // 请求方自定义域
        // dto.put("req_reserved", "");
        // 终端信息
        // dto.put("term_info", "");
        // 银联用户标识
        // dto.put("user_id", "");

        return dto.toJSONString();
    }

    private static String get2e3e0476D8db4f9581a0Aed52599fcf0() {
        JSONObject dto = new JSONObject();
        // 数字货币银行编号
        // dto.put("digital_bank_no", "");

        return dto.toJSONString();
    }

    private static JSON get640c6e89E59a4de5Ad6fEa579780754c() {
        JSONObject dto = new JSONObject();
        // 分账接收方ID
        dto.put("huifu_id", "6666000109133323");
        // 分账金额
        dto.put("div_amt", "0.10");
        // 账户号
        // dto.put("acct_id", "");
        // 分账百分比%
        // dto.put("percentage_div", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getFf4d5a9c4eaa4b21A7506e25c22c0d53() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", get640c6e89E59a4de5Ad6fEa579780754c());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static String getC26c8071286f429eB3aeC03ea7829128() {
        JSONObject dto = new JSONObject();
        // 补贴方汇付商户号
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

    private static String get4eb45e7eD9844eac90378cd4e494a1f0() {
        JSONObject dto = new JSONObject();
        // ip地址
        dto.put("ip_addr", "180.167.105.130");
        // 基站地址
        dto.put("base_station", "192.168.1.1");
        // 纬度
        dto.put("latitude", "33.3");
        // 经度
        dto.put("longitude", "33.3");

        return dto.toJSONString();
    }

    private static String get09c5df58509a4737941606d5a11a639e() {
        JSONObject dto = new JSONObject();
        // 商户设备类型
        // dto.put("mer_device_type", "test");
        // 汇付机具号
        dto.put("devs_id", "SPINTP357338300264411");
        // 设备类型
        dto.put("device_type", "1");
        // 交易设备IP
        dto.put("device_ip", "10.10.0.1");
        // 交易设备MAC
        dto.put("device_mac", "");
        // 交易设备IMEI
        dto.put("device_imei", "");
        // 交易设备IMSI
        dto.put("device_imsi", "");
        // 交易设备ICCID
        dto.put("device_icc_id", "");
        // 交易设备WIFIMAC
        dto.put("device_wifi_mac", "");
        // 交易设备GPS
        dto.put("device_gps", "192.168.0.0");
        // 商户终端应用程序版本
        // dto.put("app_version", "");
        // SIM卡卡号
        // dto.put("icc_id", "");
        // 商户终端实时经纬度信息
        // dto.put("location", "");
        // 商户交易设备IP
        // dto.put("mer_device_ip", "");
        // 移动国家代码
        // dto.put("mobile_country_cd", "");
        // 移动网络号码
        // dto.put("mobile_net_num", "");
        // 商户终端入网认证编号
        // dto.put("network_license", "");
        // 商户终端序列号
        // dto.put("serial_num", "");

        return dto.toJSONString();
    }

    private static String getC805c7554acd47419b994955bef7d73f() {
        JSONObject dto = new JSONObject();
        // 补贴手续费金额
        // dto.put("allowance_fee_amt", "");

        return dto.toJSONString();
    }

}
