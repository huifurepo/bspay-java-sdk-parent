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
        extendInfoMap.put("wx_data", get8194d036Aa394b229ff8Cb91dbc361da());
        // 支付宝参数集合
        extendInfoMap.put("alipay_data", get2e4f3c663d114fb0A65b7088b33cd763());
        // 银联参数集合
        extendInfoMap.put("unionpay_data", get2064d5ec4cb54396B78f14efb8c09cc9());
        // 数字人民币参数集合
        // extendInfoMap.put("dc_data", getBaec2df8412c4410861eBce2a6c2f8c5());
        // 是否延迟交易
        extendInfoMap.put("delay_acct_flag", "N");
        // 手续费扣款标志
        // extendInfoMap.put("fee_flag", "");
        // 分账对象
        extendInfoMap.put("acct_split_bunch", get72aa730583494c0aB4ce378376d8abd6());
        // 传入分账遇到优惠的处理规则
        extendInfoMap.put("term_div_coupon_type", "0");
        // 补贴支付信息
        // extendInfoMap.put("combinedpay_data", get9b1c0dccDbd34c43B601E57ff80eb6ba());
        // 补贴支付手续费承担方信息
        // extendInfoMap.put("combinedpay_data_fee_info", getF2b3db97Ef154e659831307b460221a9());
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
        extendInfoMap.put("risk_check_data", get2301f8906087429b8a6eA0b932d791a6());
        // 设备信息
        extendInfoMap.put("terminal_device_data", getCda8904950194bdb9e2543d53e097b90());
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        // 手续费补贴信息
        // extendInfoMap.put("trans_fee_allowance_info", getA309dceb477c423cBf8bBd50a609a0c9());
        // 手续费场景标识
        // extendInfoMap.put("fee_sign", "");
        return extendInfoMap;
    }

    private static JSON getF1c3314814d046eaB7c31d3d734c7cca() {
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

    private static JSON get4b15be5344e2410f9c115130fbeee6ce() {
        JSONObject dto = new JSONObject();
        // 单品列表
        dto.put("goods_detail", getF1c3314814d046eaB7c31d3d734c7cca());
        // 订单原价(元)
        dto.put("cost_price", "43.00");
        // 商品小票ID
        dto.put("receipt_id", "20220628132043853798");

        return dto;
    }

    private static JSON getBda1638c5e0b42d593140c89c3b7fbc1() {
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

    private static JSON get741ac59cD59c482e81e87153ad034dcb() {
        JSONObject dto = new JSONObject();
        // 门店信息
        // dto.put("store_info", getBda1638c5e0b42d593140c89c3b7fbc1());

        return dto;
    }

    private static String get8194d036Aa394b229ff8Cb91dbc361da() {
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
        dto.put("detail", get4b15be5344e2410f9c115130fbeee6ce());
        // 设备号
        // dto.put("device_info", "");
        // 订单优惠标记
        // dto.put("goods_tag", "");
        // 实名支付
        // dto.put("identity", "");
        // 开发票入口开放标识
        // dto.put("receipt", "");
        // 场景信息
        dto.put("scene_info", get741ac59cD59c482e81e87153ad034dcb());
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

    private static JSON get578684f41f754f4eBc3b816d000209e4() {
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

    private static JSON getA964b0898be84176A751878168058c43() {
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

    private static JSON getD74ca5bdE2364d3580335129dd10e53a() {
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

    private static String get2e4f3c663d114fb0A65b7088b33cd763() {
        JSONObject dto = new JSONObject();
        // 支付宝的店铺编号
        dto.put("alipay_store_id", "");
        // 买家的支付宝唯一用户号
        dto.put("buyer_id", "208870269990XXXX");
        // 买家支付宝账号
        dto.put("buyer_logon_id", "string");
        // 业务扩展参数
        dto.put("extend_params", get578684f41f754f4eBc3b816d000209e4());
        // 订单包含的商品列表信息
        dto.put("goods_detail", getA964b0898be84176A751878168058c43());
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
        // dto.put("ext_user_info", getD74ca5bdE2364d3580335129dd10e53a());
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

    private static JSON get8fb14b4dFb2d446dB9b3E98685087d6d() {
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

    private static String get4c3a3c66486d4867A5d478e70760ed3b() {
        JSONObject dto = new JSONObject();
        // 服务商订单编号
        // dto.put("pnr_order_id", "");
        // 服务商密文
        // dto.put("pid_sct", "");
        // 场景标识
        // dto.put("trade_scene", "");

        return dto.toJSONString();
    }

    private static String get2064d5ec4cb54396B78f14efb8c09cc9() {
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
        // dto.put("payee_info", get8fb14b4dFb2d446dB9b3E98685087d6d());
        // 银联分配的服务商机构标识码
        // dto.put("pnr_ins_id_cd", "");
        // 请求方自定义域
        // dto.put("req_reserved", "");
        // 终端信息
        // dto.put("term_info", "");
        // 银联用户标识
        // dto.put("user_id", "");
        // 服务商信息
        // dto.put("pid_info", get4c3a3c66486d4867A5d478e70760ed3b());
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

    private static String getBaec2df8412c4410861eBce2a6c2f8c5() {
        JSONObject dto = new JSONObject();
        // 数字货币银行编号
        // dto.put("digital_bank_no", "");

        return dto.toJSONString();
    }

    private static JSON get0bcbc0970f044ab79724Cc5bd461d92d() {
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

    private static String get72aa730583494c0aB4ce378376d8abd6() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", get0bcbc0970f044ab79724Cc5bd461d92d());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static String get9b1c0dccDbd34c43B601E57ff80eb6ba() {
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

    private static String getF2b3db97Ef154e659831307b460221a9() {
        JSONObject dto = new JSONObject();
        // 补贴支付手续费承担方汇付编号
        // dto.put("huifu_id", "");
        // 补贴支付手续费承担方账户号
        // dto.put("acct_id", "");

        return dto.toJSONString();
    }

    private static String get2301f8906087429b8a6eA0b932d791a6() {
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

    private static String getCda8904950194bdb9e2543d53e097b90() {
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

    private static String getA309dceb477c423cBf8bBd50a609a0c9() {
        JSONObject dto = new JSONObject();
        // 补贴手续费金额
        // dto.put("allowance_fee_amt", "");

        return dto.toJSONString();
    }

}
