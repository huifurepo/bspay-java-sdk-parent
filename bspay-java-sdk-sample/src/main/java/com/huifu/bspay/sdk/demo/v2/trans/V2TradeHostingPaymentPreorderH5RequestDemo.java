package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeHostingPaymentPreorderH5Request;

/**
 * H5、PC预下单接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeHostingPaymentPreorderH5Request.class)
public class V2TradeHostingPaymentPreorderH5RequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeHostingPaymentPreorderH5Request request = new V2TradeHostingPaymentPreorderH5Request();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 交易金额
        request.setTransAmt("0.10");
        // 商品描述
        request.setGoodsDesc("个人电脑");
        // 预下单类型
        request.setPreOrderType("1");
        // 统一收银台扩展参数集合
        request.setHostingData(get6f5b57c568774d0299c228e6f4091b08());

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
        // 收款汇付账户号
        // extendInfoMap.put("acct_id", "");
        // 是否延迟交易
        extendInfoMap.put("delay_acct_flag", "N");
        // 是否支持切换支付方式
        // extendInfoMap.put("multi_pay_way_flag", "");
        // 分账对象
        extendInfoMap.put("acct_split_bunch", get433cd49d16be4a7eA70989990c2bd61f());
        // 交易失效时间
        // extendInfoMap.put("time_expire", "");
        // 业务信息
        extendInfoMap.put("biz_info", get4bee3e14F79f426398f14a8383e0b723());
        // 交易异步通知地址
        extendInfoMap.put("notify_url", "https://callback.service.com/xx");
        // 使用类型
        // extendInfoMap.put("usage_type", "");
        // 交易类型
        // extendInfoMap.put("trans_type", "");
        // 微信参数集合
        // extendInfoMap.put("wx_data", get0b9ec56122554c89A8406dee0d4ca398());
        // 支付宝参数集合
        // extendInfoMap.put("alipay_data", get4d35eb8132844ea4Bb28C502db6951a0());
        // 抖音参数集合
        // extendInfoMap.put("dy_data", get44c38738Bf2649b8Aa8e22e6865eec2c());
        // 银联参数集合
        // extendInfoMap.put("unionpay_data", get679d482aA4c8474fB43e42c534237b76());
        // 设备信息
        // extendInfoMap.put("terminal_device_data", get7259d42290ee414d9275411e468ce9bc());
        // 大额支付参数集合
        // extendInfoMap.put("largeamt_data", getFa26e3a2D80d410d80ad19246e8889a4());
        // 手续费场景标识
        // extendInfoMap.put("fee_sign", "");
        return extendInfoMap;
    }

    private static JSON get418f01ceC78549519daa0ebc9927f853() {
        JSONObject dto = new JSONObject();
        // 分账金额
        dto.put("div_amt", "0.08");
        // 分账接收方ID
        dto.put("huifu_id", "6666000111546360");
        // 收款汇付账户号
        // dto.put("acct_id", "");
        // 分账百分比%
        // dto.put("percentage_div", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get433cd49d16be4a7eA70989990c2bd61f() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", get418f01ceC78549519daa0ebc9927f853());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static String get6f5b57c568774d0299c228e6f4091b08() {
        JSONObject dto = new JSONObject();
        // 项目标题
        dto.put("project_title", "收银台标题");
        // 项目号
        dto.put("project_id", "PROJECTID2023101225142567");
        // 请求类型P:PC页面版，默认：P；M:H5页面版；指定交易类型时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：M&lt;/font&gt;
        // dto.put("request_type", "test");
        // 商户私有信息
        dto.put("private_info", "商户私有信息test");
        // 回调地址
        dto.put("callback_url", "https://paas.huifu.com");

        return dto.toJSONString();
    }

    private static JSON get7c9c87a845a14c12B2a1066740ef6880() {
        JSONObject dto = new JSONObject();
        // 是否提供校验身份信息
        dto.put("need_check_info", "T");
        // 允许的最小买家年龄
        dto.put("min_age", "12");
        // 是否强制校验付款人身份信息
        dto.put("fix_buyer", "F");

        return dto;
    }

    private static JSON getF01e18fa954f4a5799f09110d2c54147() {
        JSONObject dto = new JSONObject();
        // 指定支付者
        dto.put("limit_payer", "ADULT");
        // 微信实名验证
        dto.put("real_name_flag", "Y");

        return dto;
    }

    private static JSON getCe9b512aFb8b498498c6Ba586d5f74a8() {
        JSONObject dto = new JSONObject();
        // 姓名
        dto.put("name", "张三");
        // 证件类型
        dto.put("cert_type", "IDENTITY_CARD");
        // 证件号
        dto.put("cert_no", "OLOxrl809XmVIMmPRTIyIpJHxi4HFMJNmxGz1nhZAtps9xPEVDysU3UZPBZfsNFLFcXEMENPsJ+tymbYt42dNQ+76hyEtx+qz0BQhU8SKV8H5itrI4kaXpaJf+sV8OewrJkhDidPdz01vqMEDQRhaMnNwl8snHZxDdpu7HVUz5JwsLYfBbZP2Q4CZpVWS3NunQahZ8zHQ+8EhvYVH1vE7f/M6nJt1/4GoHz9C/UnuYudV0S2uBhlywbX+YkRGNMl/oz5+UNeMDA2jqhtTreSD4+w7S82L53rqKsAbosodOPo4OAMZk4/0QOH5LDbqFByVM97mzHfw7z+Tx/dsXJ8QQ==");
        // 手机号
        dto.put("mobile", "15012345678");

        return dto;
    }

    private static String get4bee3e14F79f426398f14a8383e0b723() {
        JSONObject dto = new JSONObject();
        // 付款人验证（支付宝）
        dto.put("payer_check_ali", get7c9c87a845a14c12B2a1066740ef6880());
        // 付款人验证（微信）
        dto.put("payer_check_wx", getF01e18fa954f4a5799f09110d2c54147());
        // 个人付款人信息
        dto.put("person_payer", getCe9b512aFb8b498498c6Ba586d5f74a8());

        return dto.toJSONString();
    }

    private static JSON get27ce73b3192f4eddBabf54dec9fbd475() {
        JSONObject dto = new JSONObject();
        // 商品编码
        // dto.put("goods_id", "");
        // 商品名称
        // dto.put("goods_name", "");
        // 商品单价(元)
        // dto.put("price", "");
        // 商品数量
        // dto.put("quantity", "");
        // 微信侧商品编码
        // dto.put("wxpay_goods_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON get94e673aa9bb84ea3999d9dca7a93b964() {
        JSONObject dto = new JSONObject();
        // 单品列表
        // dto.put("goods_detail", get27ce73b3192f4eddBabf54dec9fbd475());
        // 订单原价(元)
        // dto.put("cost_price", "");
        // 商品小票ID
        // dto.put("receipt_id", "");

        return dto;
    }

    private static JSON get5fb97a0cFa3c4cccB4cbC81e9b8143a3() {
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

    private static JSON get84eb4ca8D6d64ded899f0127354634ee() {
        JSONObject dto = new JSONObject();
        // 门店信息
        // dto.put("store_info", get5fb97a0cFa3c4cccB4cbC81e9b8143a3());

        return dto;
    }

    private static String get0b9ec56122554c89A8406dee0d4ca398() {
        JSONObject dto = new JSONObject();
        // 附加数据
        // dto.put("attach", "");
        // 商品详情
        // dto.put("detail", get94e673aa9bb84ea3999d9dca7a93b964());
        // 订单优惠标记
        // dto.put("goods_tag", "");
        // 开发票入口开放标识
        // dto.put("receipt", "");
        // 场景信息
        // dto.put("scene_info", get84eb4ca8D6d64ded899f0127354634ee());
        // 单品优惠标识
        // dto.put("promotion_flag", "");
        // 新增商品ID
        // dto.put("product_id", "");

        return dto.toJSONString();
    }

    private static JSON get952ea60e512e4ed3Bfc9483b4166042b() {
        JSONObject dto = new JSONObject();
        // 卡类型
        // dto.put("card_type", "");
        // 支付宝点餐场景类型
        // dto.put("food_order_type", "");
        // 花呗分期数
        // dto.put("hb_fq_num", "");
        // 花呗卖家手续费百分比
        // dto.put("hb_fq_seller_percent", "");
        // 行业数据回流信息
        // dto.put("industry_reflux_info", "");
        // 信用卡分期资产方式
        // dto.put("fq_channels", "");
        // 停车场id
        // dto.put("parking_id", "");
        // 系统商编号
        // dto.put("sys_service_provider_id", "");

        return dto;
    }

    private static JSON getAd71e726Cf2c4965B057Cc4743c67c75() {
        JSONObject dto = new JSONObject();
        // 商品的编号
        // dto.put("goods_id", "test");
        // 商品名称
        // dto.put("goods_name", "test");
        // 商品单价(元)
        // dto.put("price", "test");
        // 商品数量
        // dto.put("quantity", "test");
        // 商品描述信息
        // dto.put("body", "");
        // 商品类目树
        // dto.put("categories_tree", "");
        // 商品类目
        // dto.put("goods_category", "");
        // 商品的展示地址
        // dto.put("show_url", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get4d35eb8132844ea4Bb28C502db6951a0() {
        JSONObject dto = new JSONObject();
        // 支付宝的店铺编号
        // dto.put("alipay_store_id", "");
        // 业务扩展参数
        // dto.put("extend_params", get952ea60e512e4ed3Bfc9483b4166042b());
        // 订单包含的商品列表信息
        // dto.put("goods_detail", getAd71e726Cf2c4965B057Cc4743c67c75());
        // 商户原始订单号
        // dto.put("merchant_order_no", "");
        // 商户操作员编号
        // dto.put("operator_id", "");
        // 销售产品码
        // dto.put("product_code", "");
        // 卖家支付宝用户号
        // dto.put("seller_id", "");
        // 商户门店编号
        // dto.put("store_id", "");
        // 订单标题
        // dto.put("subject", "");
        // 商家门店名称
        // dto.put("store_name", "");
        // 商户业务信息
        // dto.put("ali_business_params", "");

        return dto.toJSONString();
    }

    private static JSON getBfa1f6ac21c4482984bb567a87d31805() {
        JSONObject dto = new JSONObject();
        // 场景类型
        // dto.put("type", "test");
        // 应用名称
        // dto.put("app_name", "");
        // 网站URL
        // dto.put("app_url", "");
        // iOS平台BundleID
        // dto.put("bundle_id", "");
        // Android平台PackageName
        // dto.put("package_name", "");

        return dto;
    }

    private static JSON get7de2e7c3715a4a2a897e5cc6eb82d037() {
        JSONObject dto = new JSONObject();
        // 用户终端IP
        // dto.put("payer_client_ip", "test");

        return dto;
    }

    private static String get44c38738Bf2649b8Aa8e22e6865eec2c() {
        JSONObject dto = new JSONObject();
        // 子商户应用ID
        // dto.put("sub_appid", "test");
        // H5场景信息
        // dto.put("h5_info", getBfa1f6ac21c4482984bb567a87d31805());
        // 场景信息
        // dto.put("scene_info", get7de2e7c3715a4a2a897e5cc6eb82d037());
        // 优惠标记
        // dto.put("coupon_info", "");

        return dto.toJSONString();
    }

    private static JSON get6b0066137be34e0d913fA123d87b6ecd() {
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

    private static String getD2810b7188724ceeAffdE9d1d6c9a3ff() {
        JSONObject dto = new JSONObject();
        // 服务商订单编号
        // dto.put("pnr_order_id", "");
        // 服务商密文
        // dto.put("pid_sct", "");
        // 场景标识
        // dto.put("trade_scene", "");

        return dto.toJSONString();
    }

    private static String get679d482aA4c8474fB43e42c534237b76() {
        JSONObject dto = new JSONObject();
        // 收款方附加数据
        // dto.put("addn_data", "");
        // 地区信息
        // dto.put("area_info", "");
        // 前台通知地址
        // dto.put("front_url", "");
        // 收款方附言
        // dto.put("payee_comments", "");
        // 收款方信息
        // dto.put("payee_info", get6b0066137be34e0d913fA123d87b6ecd());
        // 银联分配的服务商机构标识码
        // dto.put("pnr_ins_id_cd", "");
        // 请求方自定义域
        // dto.put("req_reserved", "");
        // 终端信息
        // dto.put("term_info", "");
        // 服务商信息
        // dto.put("pid_info", getD2810b7188724ceeAffdE9d1d6c9a3ff());

        return dto.toJSONString();
    }

    private static String get7259d42290ee414d9275411e468ce9bc() {
        JSONObject dto = new JSONObject();
        // 汇付机具号
        // dto.put("devs_id", "test");

        return dto.toJSONString();
    }

    private static String getFa26e3a2D80d410d80ad19246e8889a4() {
        JSONObject dto = new JSONObject();
        // 付款方名称
        // dto.put("certificate_name", "");
        // 付款方银行卡号
        // dto.put("bank_card_no", "");

        return dto.toJSONString();
    }

}
