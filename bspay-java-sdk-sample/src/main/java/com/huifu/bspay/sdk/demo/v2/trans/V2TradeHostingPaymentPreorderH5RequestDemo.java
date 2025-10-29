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
        request.setGoodsDesc("支付托管消费");
        // 预下单类型
        request.setPreOrderType("1");
        // 半支付托管扩展参数集合
        request.setHostingData(get1e8acadc6fdc437d924301f529cd63d1());

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
        // 收银台样式
        // extendInfoMap.put("style_id", "");
        // 是否延迟交易
        extendInfoMap.put("delay_acct_flag", "N");
        // 分账对象
        extendInfoMap.put("acct_split_bunch", get6aaa622dC05741489a24535e5b82b99e());
        // 交易失效时间
        // extendInfoMap.put("time_expire", "");
        // 业务信息
        extendInfoMap.put("biz_info", get37e20504E1214db9Ac571bcde55dda3b());
        // 交易异步通知地址
        extendInfoMap.put("notify_url", "https://callback.service.com/xx");
        // 使用类型
        // extendInfoMap.put("usage_type", "");
        // 交易类型
        // extendInfoMap.put("trans_type", "");
        // 微信参数集合
        // extendInfoMap.put("wx_data", getD8a35cd51dbb4b1799a5078dd16d794b());
        // 支付宝参数集合
        // extendInfoMap.put("alipay_data", get7462d7ef7358431b9dd40716cba62e82());
        // 银联参数集合
        // extendInfoMap.put("unionpay_data", get64e25a801c014bcfB722A3161947b191());
        // 设备信息
        // extendInfoMap.put("terminal_device_data", getD177b96cB0f94a3e8595F04fa644ac8b());
        // 大额支付参数集合
        // extendInfoMap.put("largeamt_data", getF76d1606Cdbc4b0c800c20a5de0f311c());
        return extendInfoMap;
    }

    private static JSON get71ab5f815f144fe9B7e388460db1238a() {
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

    private static String get6aaa622dC05741489a24535e5b82b99e() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", get71ab5f815f144fe9B7e388460db1238a());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static String get1e8acadc6fdc437d924301f529cd63d1() {
        JSONObject dto = new JSONObject();
        // 项目标题
        dto.put("project_title", "收银台标题");
        // 半支付托管项目号
        dto.put("project_id", "PROJECTID2023101225142567");
        // 请求类型P:PC页面版，默认：P；M:H5页面版；指定交易类型时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：M&lt;/font&gt;
        // dto.put("request_type", "test");
        // 商户私有信息
        dto.put("private_info", "商户私有信息test");
        // 回调地址
        dto.put("callback_url", "https://paas.huifu.com");

        return dto.toJSONString();
    }

    private static JSON getD403b82e5aa44b21B39974b6192422a3() {
        JSONObject dto = new JSONObject();
        // 是否提供校验身份信息
        dto.put("need_check_info", "T");
        // 允许的最小买家年龄
        dto.put("min_age", "12");
        // 是否强制校验付款人身份信息
        dto.put("fix_buyer", "F");

        return dto;
    }

    private static JSON get2c5f3e3a08b74869869e4eec2287cb45() {
        JSONObject dto = new JSONObject();
        // 指定支付者
        dto.put("limit_payer", "ADULT");
        // 微信实名验证
        dto.put("real_name_flag", "Y");

        return dto;
    }

    private static JSON get28437a3d21f54b2a899dBc310e632e50() {
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

    private static String get37e20504E1214db9Ac571bcde55dda3b() {
        JSONObject dto = new JSONObject();
        // 付款人验证（支付宝）
        dto.put("payer_check_ali", getD403b82e5aa44b21B39974b6192422a3());
        // 付款人验证（微信）
        dto.put("payer_check_wx", get2c5f3e3a08b74869869e4eec2287cb45());
        // 个人付款人信息
        dto.put("person_payer", get28437a3d21f54b2a899dBc310e632e50());

        return dto.toJSONString();
    }

    private static JSON getDf3ec4aaC53e4cb3B569Cd8e44e16021() {
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

    private static JSON getD432172e2d674608A5f5Edcb2d60860b() {
        JSONObject dto = new JSONObject();
        // 单品列表
        // dto.put("goods_detail", getDf3ec4aaC53e4cb3B569Cd8e44e16021());
        // 订单原价(元)
        // dto.put("cost_price", "");
        // 商品小票ID
        // dto.put("receipt_id", "");

        return dto;
    }

    private static JSON getEdfbb33e522d41a38ea0376b4257003b() {
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

    private static JSON getD36cb51963164276Bb1fE85625c1d8fd() {
        JSONObject dto = new JSONObject();
        // 门店信息
        // dto.put("store_info", getEdfbb33e522d41a38ea0376b4257003b());

        return dto;
    }

    private static String getD8a35cd51dbb4b1799a5078dd16d794b() {
        JSONObject dto = new JSONObject();
        // 附加数据
        // dto.put("attach", "");
        // 商品详情
        // dto.put("detail", getD432172e2d674608A5f5Edcb2d60860b());
        // 订单优惠标记
        // dto.put("goods_tag", "");
        // 开发票入口开放标识
        // dto.put("receipt", "");
        // 场景信息
        // dto.put("scene_info", getD36cb51963164276Bb1fE85625c1d8fd());
        // 单品优惠标识
        // dto.put("promotion_flag", "");
        // 新增商品ID
        // dto.put("product_id", "");

        return dto.toJSONString();
    }

    private static JSON getA67aa70243cd42e898ce68f05c9b7f49() {
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

    private static JSON getD2e6935496b042919191Fc96db8735f1() {
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

    private static String get7462d7ef7358431b9dd40716cba62e82() {
        JSONObject dto = new JSONObject();
        // 支付宝的店铺编号
        // dto.put("alipay_store_id", "");
        // 业务扩展参数
        // dto.put("extend_params", getA67aa70243cd42e898ce68f05c9b7f49());
        // 订单包含的商品列表信息
        // dto.put("goods_detail", getD2e6935496b042919191Fc96db8735f1());
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

    private static JSON getE077e443C0d2414bA82337c4b549fc3d() {
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

    private static String get64e25a801c014bcfB722A3161947b191() {
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
        // dto.put("payee_info", getE077e443C0d2414bA82337c4b549fc3d());
        // 银联分配的服务商机构标识码
        // dto.put("pnr_ins_id_cd", "");
        // 请求方自定义域
        // dto.put("req_reserved", "");
        // 终端信息
        // dto.put("term_info", "");

        return dto.toJSONString();
    }

    private static String getD177b96cB0f94a3e8595F04fa644ac8b() {
        JSONObject dto = new JSONObject();
        // 汇付机具号
        // dto.put("devs_id", "test");

        return dto.toJSONString();
    }

    private static String getF76d1606Cdbc4b0c800c20a5de0f311c() {
        JSONObject dto = new JSONObject();
        // 付款方名称
        // dto.put("certificate_name", "");
        // 付款方银行卡号
        // dto.put("bank_card_no", "");

        return dto.toJSONString();
    }

}
