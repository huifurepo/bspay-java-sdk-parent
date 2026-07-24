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
        request.setHostingData(get55a89ca8A7864034B7362380e4799a7c());

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
        extendInfoMap.put("acct_split_bunch", get722a0623A8824bf5Be5313f6560c12f0());
        // 交易失效时间
        // extendInfoMap.put("time_expire", "");
        // 业务信息
        extendInfoMap.put("biz_info", get473c41ddA3b048b7A9dc3daedd75a29c());
        // 交易异步通知地址
        extendInfoMap.put("notify_url", "https://callback.service.com/xx");
        // 使用类型
        // extendInfoMap.put("usage_type", "");
        // 交易类型
        // extendInfoMap.put("trans_type", "");
        // 微信参数集合
        // extendInfoMap.put("wx_data", getDd876d66396740d8Bda007be9033c8a5());
        // 支付宝参数集合
        // extendInfoMap.put("alipay_data", get662b6f55C0914109Bd0c850eec1859d0());
        // 抖音参数集合
        // extendInfoMap.put("dy_data", get5d938de9471b44f4Aa56B8752460142d());
        // 银联参数集合
        // extendInfoMap.put("unionpay_data", getC5717ae4A3b94710A1a14a8b436b2abd());
        // 设备信息
        // extendInfoMap.put("terminal_device_data", get579991a9Da744250Ae846be102982586());
        // 大额支付参数集合
        // extendInfoMap.put("largeamt_data", get405fcb5c8c2f48a2A9f2Da1394109d86());
        // 手续费场景标识
        // extendInfoMap.put("fee_sign", "");
        // 是否交易手续费分摊
        // extendInfoMap.put("fee_split_flag", "");
        // 手续费扣款标志
        // extendInfoMap.put("fee_flag", "");
        // 渠道号
        // extendInfoMap.put("channel_no", "");
        // 场景类型
        // extendInfoMap.put("pay_scene", "");
        return extendInfoMap;
    }

    private static JSON getCa72edc12ea7421fA01c10504df9b4df() {
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

    private static String get722a0623A8824bf5Be5313f6560c12f0() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", getCa72edc12ea7421fA01c10504df9b4df());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static String get55a89ca8A7864034B7362380e4799a7c() {
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

    private static JSON get4be0d37dC8664727Beec001b768ecebe() {
        JSONObject dto = new JSONObject();
        // 是否提供校验身份信息
        dto.put("need_check_info", "T");
        // 允许的最小买家年龄
        dto.put("min_age", "12");
        // 是否强制校验付款人身份信息
        dto.put("fix_buyer", "F");

        return dto;
    }

    private static JSON getEb00a55f7b1d4ae98b36D0d6c7ab7730() {
        JSONObject dto = new JSONObject();
        // 指定支付者
        dto.put("limit_payer", "ADULT");
        // 微信实名验证
        dto.put("real_name_flag", "Y");

        return dto;
    }

    private static JSON getCc1a83350dd14e2093f9Ce73d99cf139() {
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

    private static String get473c41ddA3b048b7A9dc3daedd75a29c() {
        JSONObject dto = new JSONObject();
        // 付款人验证（支付宝）
        dto.put("payer_check_ali", get4be0d37dC8664727Beec001b768ecebe());
        // 付款人验证（微信）
        dto.put("payer_check_wx", getEb00a55f7b1d4ae98b36D0d6c7ab7730());
        // 个人付款人信息
        dto.put("person_payer", getCc1a83350dd14e2093f9Ce73d99cf139());

        return dto.toJSONString();
    }

    private static JSON get99d8f43fE8144991A2a5Ec08975ff98e() {
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

    private static JSON get8f0ce6d66cd7432d93baC65e7d74b69b() {
        JSONObject dto = new JSONObject();
        // 单品列表
        // dto.put("goods_detail", get99d8f43fE8144991A2a5Ec08975ff98e());
        // 订单原价(元)
        // dto.put("cost_price", "");
        // 商品小票ID
        // dto.put("receipt_id", "");

        return dto;
    }

    private static JSON get31d6f2aaF07940c59f9970d66db325aa() {
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

    private static JSON get0debc34d042e428aB2a213b312d2e0e9() {
        JSONObject dto = new JSONObject();
        // 门店信息
        // dto.put("store_info", get31d6f2aaF07940c59f9970d66db325aa());

        return dto;
    }

    private static String getDd876d66396740d8Bda007be9033c8a5() {
        JSONObject dto = new JSONObject();
        // 附加数据
        // dto.put("attach", "");
        // 商品详情
        // dto.put("detail", get8f0ce6d66cd7432d93baC65e7d74b69b());
        // 订单优惠标记
        // dto.put("goods_tag", "");
        // 开发票入口开放标识
        // dto.put("receipt", "");
        // 场景信息
        // dto.put("scene_info", get0debc34d042e428aB2a213b312d2e0e9());
        // 单品优惠标识
        // dto.put("promotion_flag", "");
        // 新增商品ID
        // dto.put("product_id", "");

        return dto.toJSONString();
    }

    private static JSON get9be16e701ec044ceBec36b287f7812ba() {
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

    private static JSON get2e482a4393e34a93Aba07fda9f6766cf() {
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

    private static String get662b6f55C0914109Bd0c850eec1859d0() {
        JSONObject dto = new JSONObject();
        // 支付宝的店铺编号
        // dto.put("alipay_store_id", "");
        // 业务扩展参数
        // dto.put("extend_params", get9be16e701ec044ceBec36b287f7812ba());
        // 订单包含的商品列表信息
        // dto.put("goods_detail", get2e482a4393e34a93Aba07fda9f6766cf());
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

    private static JSON getFe5b871f6d374a5aAa9c6c6ae38ebc8a() {
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

    private static JSON get4ba01a1f0eb34149A94617a8e0e6a4a8() {
        JSONObject dto = new JSONObject();
        // 用户终端IP
        // dto.put("payer_client_ip", "test");

        return dto;
    }

    private static String get5d938de9471b44f4Aa56B8752460142d() {
        JSONObject dto = new JSONObject();
        // 子商户应用ID
        // dto.put("sub_appid", "test");
        // H5场景信息
        // dto.put("h5_info", getFe5b871f6d374a5aAa9c6c6ae38ebc8a());
        // 场景信息
        // dto.put("scene_info", get4ba01a1f0eb34149A94617a8e0e6a4a8());
        // 优惠标记
        // dto.put("coupon_info", "");

        return dto.toJSONString();
    }

    private static JSON getD799a736Bcf34aae8129Fc7ab7ce7cac() {
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

    private static String get06eee1b328af4ea99a59436cada93ba0() {
        JSONObject dto = new JSONObject();
        // 服务商订单编号
        // dto.put("pnr_order_id", "");
        // 服务商密文
        // dto.put("pid_sct", "");
        // 场景标识
        // dto.put("trade_scene", "");

        return dto.toJSONString();
    }

    private static String getC5717ae4A3b94710A1a14a8b436b2abd() {
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
        // dto.put("payee_info", getD799a736Bcf34aae8129Fc7ab7ce7cac());
        // 银联分配的服务商机构标识码
        // dto.put("pnr_ins_id_cd", "");
        // 请求方自定义域
        // dto.put("req_reserved", "");
        // 终端信息
        // dto.put("term_info", "");
        // 服务商信息
        // dto.put("pid_info", get06eee1b328af4ea99a59436cada93ba0());

        return dto.toJSONString();
    }

    private static String get579991a9Da744250Ae846be102982586() {
        JSONObject dto = new JSONObject();
        // 汇付机具号
        // dto.put("devs_id", "test");

        return dto.toJSONString();
    }

    private static String get405fcb5c8c2f48a2A9f2Da1394109d86() {
        JSONObject dto = new JSONObject();
        // 付款方名称
        // dto.put("certificate_name", "");
        // 付款方银行卡号
        // dto.put("bank_card_no", "");

        return dto.toJSONString();
    }

}
