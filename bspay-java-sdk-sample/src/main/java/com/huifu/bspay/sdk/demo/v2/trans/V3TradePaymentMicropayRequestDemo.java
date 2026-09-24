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
        request.setRiskCheckData(getE13f8fbb15fe4d3c9581Be60ff226677());

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
        // extendInfoMap.put("combinedpay_data", get191c33e77e6847a5Afce3e3be8444255());
        // 补贴支付手续费承担方信息
        // extendInfoMap.put("combinedpay_data_fee_info", get33011ac3A50b446aA5a8Ef349798b2f8());
        // 场景类型
        // extendInfoMap.put("pay_scene", "");
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", getEab22234Ef6c45e4BbcfDf0d849739d3());
        // 传入分帐遇到优惠的处理规则
        // extendInfoMap.put("term_div_coupon_type", "");
        // 聚合反扫微信参数集合
        // extendInfoMap.put("wx_data", getFef810c4D386412eB5f6C57e5934b110());
        // 支付宝扩展参数集合
        // extendInfoMap.put("alipay_data", get878dc1c6A6964ce08fbeB8f19c9b8a63());
        // 银联参数集合
        // extendInfoMap.put("unionpay_data", getF26675d383584df5A229B47d53ad9d49());
        // 设备信息
        // extendInfoMap.put("terminal_device_info", getB4767a856f084ffb809a9e229376eafa());
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        // 交易备注
        // extendInfoMap.put("remark", "");
        // 账户号
        // extendInfoMap.put("acct_id", "");
        // 手续费补贴信息
        // extendInfoMap.put("trans_fee_allowance_info", get8e6baf9c00984e8bB766Eb3763a3ae04());
        // 手续费场景标识
        // extendInfoMap.put("fee_sign", "");
        return extendInfoMap;
    }

    private static String get191c33e77e6847a5Afce3e3be8444255() {
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

    private static String get33011ac3A50b446aA5a8Ef349798b2f8() {
        JSONObject dto = new JSONObject();
        // 补贴支付手续费承担方汇付编号
        // dto.put("huifu_id", "");
        // 补贴支付手续费承担方账户号
        // dto.put("acct_id", "");

        return dto.toJSONString();
    }

    private static JSON get34675139B1604bc8B68b2e187609d828() {
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

    private static String getEab22234Ef6c45e4BbcfDf0d849739d3() {
        JSONObject dto = new JSONObject();
        // 分账明细
        // dto.put("acct_infos", get34675139B1604bc8B68b2e187609d828());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static JSON getE2b24e3f04d84c78Bd7b1dbfa41341a2() {
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

    private static JSON getB01d44d2E29844d89a320e46fe6377e1() {
        JSONObject dto = new JSONObject();
        // 单品列表
        // dto.put("goods_detail", getE2b24e3f04d84c78Bd7b1dbfa41341a2());
        // 订单原价
        // dto.put("cost_price", "");
        // 商品小票ID
        // dto.put("receipt_id", "");

        return dto;
    }

    private static JSON get00c474d52f8a4d3aBdf34930d33e75e2() {
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

    private static JSON get4a80551414c848bb84df8d258e598620() {
        JSONObject dto = new JSONObject();
        // 门店信息
        // dto.put("store_info", get00c474d52f8a4d3aBdf34930d33e75e2());

        return dto;
    }

    private static String getFef810c4D386412eB5f6C57e5934b110() {
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
        // dto.put("detail", getB01d44d2E29844d89a320e46fe6377e1());
        // 场景信息
        // dto.put("scene_info", get4a80551414c848bb84df8d258e598620());
        // 单品优惠标识
        // dto.put("promotion_flag", "");
        // 电子发票入口开放标识
        // dto.put("receipt", "");

        return dto.toJSONString();
    }

    private static JSON getF8dc09d67846469b93b63cceb127fca6() {
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

    private static JSON getA6f91920685b47a9B3283f9913baaa3d() {
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
        // 支卡通相关参数
        // dto.put("preset_pay_tool", "");

        return dto;
    }

    private static JSON get8737bf12119842fdB3dfD3ec20a755b0() {
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

    private static String get878dc1c6A6964ce08fbeB8f19c9b8a63() {
        JSONObject dto = new JSONObject();
        // 支付宝的店铺编号
        // dto.put("alipay_store_id", "");
        // 订单包含的商品列表信息
        // dto.put("goods_detail", getF8dc09d67846469b93b63cceb127fca6());
        // 业务扩展参数
        // dto.put("extend_params", getA6f91920685b47a9B3283f9913baaa3d());
        // 商户操作员编号
        // dto.put("operator_id", "");
        // 商户门店编号
        // dto.put("store_id", "");
        // 外部指定买家
        // dto.put("ext_user_info", get8737bf12119842fdB3dfD3ec20a755b0());
        // 商户业务信息
        // dto.put("ali_business_params", "");
        // 订单描述
        // dto.put("body", "");
        // 优惠明细参数
        // dto.put("ali_promo_params", "");

        return dto.toJSONString();
    }

    private static String get29e3254834694859946851d2043315b3() {
        JSONObject dto = new JSONObject();
        // 服务商订单编号
        // dto.put("pnr_order_id", "");
        // 服务商密文
        // dto.put("pid_sct", "");
        // 场景标识
        // dto.put("trade_scene", "");

        return dto.toJSONString();
    }

    private static String getF26675d383584df5A229B47d53ad9d49() {
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
        // 服务商信息
        // dto.put("pid_info", get29e3254834694859946851d2043315b3());

        return dto.toJSONString();
    }

    private static String getE13f8fbb15fe4d3c9581Be60ff226677() {
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

    private static String getB4767a856f084ffb809a9e229376eafa() {
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

    private static String get8e6baf9c00984e8bB766Eb3763a3ae04() {
        JSONObject dto = new JSONObject();
        // 补贴手续费金额
        // dto.put("allowance_fee_amt", "");

        return dto.toJSONString();
    }

}
