package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V3TradePaymentMicropayRequest;

/**
 * 聚合反扫 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V3TradePaymentMicropayRequest.class)
public class V3TradePaymentMicropayRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V3TradePaymentMicropayRequest request = new V3TradePaymentMicropayRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 交易金额
        request.setTransAmt("1.01");
        // 商品描述
        request.setGoodsDesc("聚合反扫消费");
        // 支付授权码
        request.setAuthCode("131135212661863252");
        // 安全信息
        request.setRiskCheckData(getE02463d1F3ac4fd185f6Bd24cf501ecb());

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
        // 交易有效期
        // extendInfoMap.put("time_expire", "");
        // 手续费扣款标志
        // extendInfoMap.put("fee_flag", "");
        // 禁用支付方式
        // extendInfoMap.put("limit_pay_type", "");
        // 是否延迟交易
        // extendInfoMap.put("delay_acct_flag", "");
        // 渠道号
        // extendInfoMap.put("channel_no", "");
        // 补贴支付信息
        // extendInfoMap.put("combinedpay_data", getD189c8daF937403e94adB2dc377cd6f3());
        // 场景类型
        // extendInfoMap.put("pay_scene", "");
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", get952a291c2c2d4e7fAd7fB8c75a17d553());
        // 传入分帐遇到优惠的处理规则
        // extendInfoMap.put("term_div_coupon_type", "");
        // 聚合反扫微信参数集合
        // extendInfoMap.put("wx_data", get51a97cb269b946b9B82e5914fc3f6a27());
        // 支付宝扩展参数集合
        // extendInfoMap.put("alipay_data", getD45cb0c863e54be08f25361846e3ff85());
        // 银联参数集合
        // extendInfoMap.put("unionpay_data", get7edfab7e6c614384Bb2f533e62768584());
        // 设备信息
        // extendInfoMap.put("terminal_device_info", get09d5b65841d64f27B5bdD2683394cbd3());
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        // 交易备注
        // extendInfoMap.put("remark", "");
        // 账户号
        // extendInfoMap.put("acct_id", "");
        // 手续费补贴信息
        // extendInfoMap.put("trans_fee_allowance_info", getB2dbe76d86d948b9Ac3a4a6f0b746d2e());
        return extendInfoMap;
    }

    private static String getD189c8daF937403e94adB2dc377cd6f3() {
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

    private static JSON getA56f49b9844246c9B55fBf2472320755() {
        JSONObject dto = new JSONObject();
        // 分账接收方ID
        // dto.put("huifu_id", "test");
        // 分账金额
        // dto.put("div_amt", "");
        // 账户号
        // dto.put("acct_id", "");
        // 分账百分比%
        // dto.put("percentage_div", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get952a291c2c2d4e7fAd7fB8c75a17d553() {
        JSONObject dto = new JSONObject();
        // 分账明细
        // dto.put("acct_infos", getA56f49b9844246c9B55fBf2472320755());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static JSON get10b1cca5C03347feB177111ddd9d36a6() {
        JSONObject dto = new JSONObject();
        // 商品编码
        // dto.put("goods_id", "test");
        // 商品数量
        // dto.put("quantity", "test");
        // 商品名称
        // dto.put("goods_name", "");
        // 商品单价
        // dto.put("price", "");
        // 微信侧商品编码
        // dto.put("wxpay_goods_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON getA2c3e07bC8a14a008b0602fd5168e36f() {
        JSONObject dto = new JSONObject();
        // 单品列表
        // dto.put("goods_detail", get10b1cca5C03347feB177111ddd9d36a6());
        // 订单原价
        // dto.put("cost_price", "");
        // 商品小票ID
        // dto.put("receipt_id", "");

        return dto;
    }

    private static JSON get73010fa6565b457c8744B5bb6e7a01bd() {
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

    private static JSON get5e84ee5d6ea649579fe80ca194a2e26a() {
        JSONObject dto = new JSONObject();
        // 门店信息
        // dto.put("store_info", get73010fa6565b457c8744B5bb6e7a01bd());

        return dto;
    }

    private static String get51a97cb269b946b9B82e5914fc3f6a27() {
        JSONObject dto = new JSONObject();
        // 收款设备IP直联模式必填字段；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：192.168.2.2&lt;/font&gt;
        // dto.put("spbill_create_ip", "test");
        // 子商户公众账号id
        // dto.put("sub_appid", "");
        // 设备号
        // dto.put("device_info", "");
        // 订单优惠标记
        // dto.put("goods_tag", "");
        // 附加数据
        // dto.put("attach", "");
        // 商品详情
        // dto.put("detail", getA2c3e07bC8a14a008b0602fd5168e36f());
        // 场景信息
        // dto.put("scene_info", get5e84ee5d6ea649579fe80ca194a2e26a());
        // 单品优惠标识
        // dto.put("promotion_flag", "");
        // 电子发票入口开放标识
        // dto.put("receipt", "");

        return dto.toJSONString();
    }

    private static JSON get19fa5b18C0d94fc2B57977b3841c51a4() {
        JSONObject dto = new JSONObject();
        // 商品的编号
        // dto.put("goods_id", "test");
        // 商品名称
        // dto.put("goods_name", "test");
        // 商品数量
        // dto.put("quantity", "test");
        // 商品单价
        // dto.put("price", "test");
        // 商品类目树
        // dto.put("categories_tree", "");
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

    private static JSON getD81ce040C3eb4af0821e8f9d78eba159() {
        JSONObject dto = new JSONObject();
        // 卡类型
        // dto.put("card_type", "");
        // 支付宝点餐场景类型
        // dto.put("food_order_type", "");
        // 花呗分期数
        // dto.put("hb_fq_num", "");
        // 花呗卖家承担的手续费百分比
        // dto.put("hb_fq_seller_percent", "");
        // 行业数据回流信息
        // dto.put("industry_reflux_info", "");
        // 停车场id
        // dto.put("parking_id", "");
        // 系统商编号
        // dto.put("sys_service_provider_id", "");

        return dto;
    }

    private static JSON get63b7f4ecFfa2408f8bb475033858e953() {
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

    private static String getD45cb0c863e54be08f25361846e3ff85() {
        JSONObject dto = new JSONObject();
        // 支付宝的店铺编号
        // dto.put("alipay_store_id", "");
        // 订单包含的商品列表信息
        // dto.put("goods_detail", get19fa5b18C0d94fc2B57977b3841c51a4());
        // 业务扩展参数
        // dto.put("extend_params", getD81ce040C3eb4af0821e8f9d78eba159());
        // 商户操作员编号
        // dto.put("operator_id", "");
        // 商户门店编号
        // dto.put("store_id", "");
        // 外部指定买家
        // dto.put("ext_user_info", get63b7f4ecFfa2408f8bb475033858e953());
        // 商户业务信息
        // dto.put("ali_business_params", "");
        // 订单描述
        // dto.put("body", "");
        // 优惠明细参数
        // dto.put("ali_promo_params", "");

        return dto.toJSONString();
    }

    private static String get7edfab7e6c614384Bb2f533e62768584() {
        JSONObject dto = new JSONObject();
        // 币种
        // dto.put("currency_code", "");
        // 支持发票
        // dto.put("invoice_st", "");
        // 商户类别
        // dto.put("mer_cat_code", "");
        // 服务商机构标识码
        // dto.put("pnr_ins_id_cd", "");
        // 特殊计费信息
        // dto.put("specfeeinfo", "");
        // 终端号
        // dto.put("term_id", "");
        // 收款方附加数据
        // dto.put("addn_data", "");

        return dto.toJSONString();
    }

    private static String getE02463d1F3ac4fd185f6Bd24cf501ecb() {
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

    private static String get09d5b65841d64f27B5bdD2683394cbd3() {
        JSONObject dto = new JSONObject();
        // 商户设备类型
        // dto.put("mer_device_type", "test");
        // 汇付机具号
        // dto.put("devs_id", "test");
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
        // 商户终端应用程序版
        // dto.put("app_version", "");
        // 加密随机因子
        // dto.put("encrypt_rand_num", "");
        // SIM 卡卡号
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
        // 密文数据
        // dto.put("secret_text", "");
        // 商户终端序列号
        // dto.put("serial_num", "");

        return dto.toJSONString();
    }

    private static String getB2dbe76d86d948b9Ac3a4a6f0b746d2e() {
        JSONObject dto = new JSONObject();
        // 补贴手续费金额
        // dto.put("allowance_fee_amt", "");

        return dto.toJSONString();
    }

}
