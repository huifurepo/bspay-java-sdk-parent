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
        extendInfoMap.put("wx_data", get73a9cb1aC28c430eB33c414cdc00a7fb());
        // 支付宝参数集合
        extendInfoMap.put("alipay_data", get63ad7bd4A91946cf9d47E7e04541d892());
        // 银联参数集合
        extendInfoMap.put("unionpay_data", get1e92dc2b9aa64f4193a4Aad643e9f72c());
        // 数字人民币参数集合
        // extendInfoMap.put("dc_data", get1d7f7c5b280c458a8e67F364851286e1());
        // 抖音参数集合
        // extendInfoMap.put("dy_data", get02ffe4bbFd4742ed9ebc6e8b8b6a83a4());
        // 是否延迟交易
        extendInfoMap.put("delay_acct_flag", "N");
        // 手续费扣款标志
        // extendInfoMap.put("fee_flag", "");
        // 分账对象
        extendInfoMap.put("acct_split_bunch", getAb9deee601ef483b80339487052b0f86());
        // 传入分账遇到优惠的处理规则
        extendInfoMap.put("term_div_coupon_type", "0");
        // 补贴支付信息
        // extendInfoMap.put("combinedpay_data", getE08a61622d4946b1A337444dd2d5635d());
        // 补贴支付手续费承担方信息
        // extendInfoMap.put("combinedpay_data_fee_info", getF889e9a4Fc1049b9Aac8A8ca85e6a217());
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
        extendInfoMap.put("risk_check_data", get59f6ef0d8f054cfc941d040e89f062e9());
        // 设备信息
        extendInfoMap.put("terminal_device_data", getE090f351Df9f409e803cEbb3736ba266());
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        // 手续费补贴信息
        // extendInfoMap.put("trans_fee_allowance_info", get5b265ccf4ad9484a8fc635cc5776aec0());
        // 手续费场景标识
        // extendInfoMap.put("fee_sign", "");
        return extendInfoMap;
    }

    private static JSON get4ef55171Fbe84c77Aab559a00e1e05d7() {
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

    private static JSON get7f306b16C47f4c12A08d35ee0d8928c6() {
        JSONObject dto = new JSONObject();
        // 单品列表
        dto.put("goods_detail", get4ef55171Fbe84c77Aab559a00e1e05d7());
        // 订单原价(元)
        dto.put("cost_price", "43.00");
        // 商品小票ID
        dto.put("receipt_id", "20220628132043853798");

        return dto;
    }

    private static JSON getE62e315313ca4aadA9cbF02b4388c166() {
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

    private static JSON get3a2ee917C08f4fee981cCcc3ed69a69f() {
        JSONObject dto = new JSONObject();
        // 门店信息
        // dto.put("store_info", getE62e315313ca4aadA9cbF02b4388c166());

        return dto;
    }

    private static String get73a9cb1aC28c430eB33c414cdc00a7fb() {
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
        dto.put("detail", get7f306b16C47f4c12A08d35ee0d8928c6());
        // 设备号
        // dto.put("device_info", "");
        // 订单优惠标记
        // dto.put("goods_tag", "");
        // 实名支付
        // dto.put("identity", "");
        // 开发票入口开放标识
        // dto.put("receipt", "");
        // 场景信息
        dto.put("scene_info", get3a2ee917C08f4fee981cCcc3ed69a69f());
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

    private static JSON get9476a04cD35042a087a8Cc1bde9a277d() {
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
        // 支卡通相关参数
        // dto.put("preset_pay_tool", "");

        return dto;
    }

    private static JSON getC49dc264E4c4427cB0f526d0824d2266() {
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

    private static JSON get5c1c98d01d174eb5Be82Aa2f920cef82() {
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

    private static String get63ad7bd4A91946cf9d47E7e04541d892() {
        JSONObject dto = new JSONObject();
        // 支付宝的店铺编号
        dto.put("alipay_store_id", "");
        // 买家的支付宝唯一用户号
        dto.put("buyer_id", "208870269990XXXX");
        // 买家支付宝账号
        dto.put("buyer_logon_id", "string");
        // 业务扩展参数
        dto.put("extend_params", get9476a04cD35042a087a8Cc1bde9a277d());
        // 订单包含的商品列表信息
        dto.put("goods_detail", getC49dc264E4c4427cB0f526d0824d2266());
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
        // dto.put("ext_user_info", get5c1c98d01d174eb5Be82Aa2f920cef82());
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

    private static JSON getDeb02c1eC77f482fA2e978d4c6e75986() {
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

    private static String get3c1da181B87a4104A54744cf58589069() {
        JSONObject dto = new JSONObject();
        // 服务商订单编号
        // dto.put("pnr_order_id", "");
        // 服务商密文
        // dto.put("pid_sct", "");
        // 场景标识
        // dto.put("trade_scene", "");

        return dto.toJSONString();
    }

    private static String get1e92dc2b9aa64f4193a4Aad643e9f72c() {
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
        // dto.put("payee_info", getDeb02c1eC77f482fA2e978d4c6e75986());
        // 银联分配的服务商机构标识码
        // dto.put("pnr_ins_id_cd", "");
        // 请求方自定义域
        // dto.put("req_reserved", "");
        // 终端信息
        // dto.put("term_info", "");
        // 银联用户标识
        // dto.put("user_id", "");
        // 服务商信息
        // dto.put("pid_info", get3c1da181B87a4104A54744cf58589069());
        // 银联支付标识
        // dto.put("app_up_identifier", "");
        // 交易支付渠道
        // dto.put("pay_channel", "");
        // 第三方公众账号ID
        // dto.put("third_part_app_id", "");
        // 第三方用户标识
        // dto.put("third_part_open_id", "");

        return dto.toJSONString();
    }

    private static String get1d7f7c5b280c458a8e67F364851286e1() {
        JSONObject dto = new JSONObject();
        // 数字货币银行编号
        // dto.put("digital_bank_no", "");

        return dto.toJSONString();
    }

    private static String get1a2a840948274af4Bb795d7baceed87a() {
        JSONObject dto = new JSONObject();
        // 场景类型
        // dto.put("type", "");
        // 应用名称
        // dto.put("app_name", "");
        // 网站URL
        // dto.put("app_url", "");
        // iOS平台BundleID
        // dto.put("bundle_id", "");
        // Android平台PackageName
        // dto.put("package_name", "");

        return dto.toJSONString();
    }

    private static String get02ffe4bbFd4742ed9ebc6e8b8b6a83a4() {
        JSONObject dto = new JSONObject();
        // 子商户应用ID
        // dto.put("sub_appid", "");
        // 订单优惠标记
        // dto.put("goods_tag", "");
        // 终端ip
        // dto.put("order_ip", "");
        // 抖音H5支付请求信息
        // dto.put("h5_info", get1a2a840948274af4Bb795d7baceed87a());

        return dto.toJSONString();
    }

    private static JSON get57d67a04217c4cdb9a15678c08d87c53() {
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

    private static String getAb9deee601ef483b80339487052b0f86() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", get57d67a04217c4cdb9a15678c08d87c53());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static String getE08a61622d4946b1A337444dd2d5635d() {
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

    private static String getF889e9a4Fc1049b9Aac8A8ca85e6a217() {
        JSONObject dto = new JSONObject();
        // 补贴支付手续费承担方汇付编号
        // dto.put("huifu_id", "");
        // 补贴支付手续费承担方账户号
        // dto.put("acct_id", "");

        return dto.toJSONString();
    }

    private static String get59f6ef0d8f054cfc941d040e89f062e9() {
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

    private static String getE090f351Df9f409e803cEbb3736ba266() {
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

    private static String get5b265ccf4ad9484a8fc635cc5776aec0() {
        JSONObject dto = new JSONObject();
        // 补贴手续费金额
        // dto.put("allowance_fee_amt", "");

        return dto.toJSONString();
    }

}
