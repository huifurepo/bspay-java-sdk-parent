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
        request.setHostingData(get29ce328014e44a04Ba34089b50c93254());

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
        extendInfoMap.put("acct_split_bunch", get005c7da916154564851790c84fa499d8());
        // 交易失效时间
        // extendInfoMap.put("time_expire", "");
        // 业务信息
        extendInfoMap.put("biz_info", getAe2838a976da4a67927f0013169b2972());
        // 交易异步通知地址
        extendInfoMap.put("notify_url", "https://callback.service.com/xx");
        // 使用类型
        // extendInfoMap.put("usage_type", "");
        // 交易类型
        // extendInfoMap.put("trans_type", "");
        // 微信参数集合
        // extendInfoMap.put("wx_data", get74b1cc9b796348d6Bd4d162a489b37d2());
        // 支付宝参数集合
        // extendInfoMap.put("alipay_data", get546f7a5344f4490eB3b9D40b41fd6718());
        // 抖音参数集合
        // extendInfoMap.put("dy_data", get0ee9ad37Af094c979cbbD3543fcb5814());
        // 银联参数集合
        // extendInfoMap.put("unionpay_data", get50d967093e184280B38262a6fb5fd16a());
        // 设备信息
        // extendInfoMap.put("terminal_device_data", get07df0303Af0f43479da035683eadf683());
        // 大额支付参数集合
        // extendInfoMap.put("largeamt_data", get0cbbfab1Dc17405eBae9606a530f5312());
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
        // 
        // extendInfoMap.put("", "");
        return extendInfoMap;
    }

    private static JSON get731f1620F32e47cc82102a6511caa6cc() {
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

    private static String get005c7da916154564851790c84fa499d8() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", get731f1620F32e47cc82102a6511caa6cc());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static String get29ce328014e44a04Ba34089b50c93254() {
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

    private static JSON getFffccda98ffc4cbfAdad8b9d3cbee2c4() {
        JSONObject dto = new JSONObject();
        // 是否提供校验身份信息
        dto.put("need_check_info", "T");
        // 允许的最小买家年龄
        dto.put("min_age", "12");
        // 是否强制校验付款人身份信息
        dto.put("fix_buyer", "F");

        return dto;
    }

    private static JSON get5615d9b54e8542c7A0161308c69246a8() {
        JSONObject dto = new JSONObject();
        // 指定支付者
        dto.put("limit_payer", "ADULT");
        // 微信实名验证
        dto.put("real_name_flag", "Y");

        return dto;
    }

    private static JSON get3600ab5f99ad4cea92d3770e80b647c5() {
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

    private static String getAe2838a976da4a67927f0013169b2972() {
        JSONObject dto = new JSONObject();
        // 付款人验证（支付宝）
        dto.put("payer_check_ali", getFffccda98ffc4cbfAdad8b9d3cbee2c4());
        // 付款人验证（微信）
        dto.put("payer_check_wx", get5615d9b54e8542c7A0161308c69246a8());
        // 个人付款人信息
        dto.put("person_payer", get3600ab5f99ad4cea92d3770e80b647c5());

        return dto.toJSONString();
    }

    private static JSON getF2e57e8e206a49a2B2274b1b5377c67c() {
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

    private static JSON getA93f7ae5B9844237821d1c86240dc6ba() {
        JSONObject dto = new JSONObject();
        // 单品列表
        // dto.put("goods_detail", getF2e57e8e206a49a2B2274b1b5377c67c());
        // 订单原价(元)
        // dto.put("cost_price", "");
        // 商品小票ID
        // dto.put("receipt_id", "");

        return dto;
    }

    private static JSON getB6eb8ca3832f4f48A86d17abbb0ae6aa() {
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

    private static JSON get62dbf1f58573482aBd61D3d86d2dd878() {
        JSONObject dto = new JSONObject();
        // 门店信息
        // dto.put("store_info", getB6eb8ca3832f4f48A86d17abbb0ae6aa());

        return dto;
    }

    private static String get74b1cc9b796348d6Bd4d162a489b37d2() {
        JSONObject dto = new JSONObject();
        // 附加数据
        // dto.put("attach", "");
        // 商品详情
        // dto.put("detail", getA93f7ae5B9844237821d1c86240dc6ba());
        // 订单优惠标记
        // dto.put("goods_tag", "");
        // 开发票入口开放标识
        // dto.put("receipt", "");
        // 场景信息
        // dto.put("scene_info", get62dbf1f58573482aBd61D3d86d2dd878());
        // 单品优惠标识
        // dto.put("promotion_flag", "");
        // 新增商品ID
        // dto.put("product_id", "");

        return dto.toJSONString();
    }

    private static JSON get7fe45454C92e4a2cB2deD99bd5cc6ccc() {
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

    private static JSON get2330dbbbC2814cc89ee574dd672b17d5() {
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

    private static String get546f7a5344f4490eB3b9D40b41fd6718() {
        JSONObject dto = new JSONObject();
        // 支付宝的店铺编号
        // dto.put("alipay_store_id", "");
        // 业务扩展参数
        // dto.put("extend_params", get7fe45454C92e4a2cB2deD99bd5cc6ccc());
        // 订单包含的商品列表信息
        // dto.put("goods_detail", get2330dbbbC2814cc89ee574dd672b17d5());
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
        // 商户贴息标记
        // dto.put("fq_mer_discount_flag", "");

        return dto.toJSONString();
    }

    private static JSON getBeba017b8c6d49ffB843097fe9dd835a() {
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

    private static JSON get5fa98f68993745fdA8d2Ff02c378ecb4() {
        JSONObject dto = new JSONObject();
        // 用户终端IP
        // dto.put("payer_client_ip", "test");

        return dto;
    }

    private static String get0ee9ad37Af094c979cbbD3543fcb5814() {
        JSONObject dto = new JSONObject();
        // 子商户应用ID
        // dto.put("sub_appid", "test");
        // H5场景信息
        // dto.put("h5_info", getBeba017b8c6d49ffB843097fe9dd835a());
        // 场景信息
        // dto.put("scene_info", get5fa98f68993745fdA8d2Ff02c378ecb4());
        // 优惠标记
        // dto.put("coupon_info", "");

        return dto.toJSONString();
    }

    private static JSON get3b19e57c8e76420383679950003a7739() {
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

    private static String get426ad9f717b241bf916e9756b0f9a126() {
        JSONObject dto = new JSONObject();
        // 服务商订单编号
        // dto.put("pnr_order_id", "");
        // 服务商密文
        // dto.put("pid_sct", "");
        // 场景标识
        // dto.put("trade_scene", "");

        return dto.toJSONString();
    }

    private static String get50d967093e184280B38262a6fb5fd16a() {
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
        // dto.put("payee_info", get3b19e57c8e76420383679950003a7739());
        // 银联分配的服务商机构标识码
        // dto.put("pnr_ins_id_cd", "");
        // 请求方自定义域
        // dto.put("req_reserved", "");
        // 终端信息
        // dto.put("term_info", "");
        // 服务商信息
        // dto.put("pid_info", get426ad9f717b241bf916e9756b0f9a126());

        return dto.toJSONString();
    }

    private static String get07df0303Af0f43479da035683eadf683() {
        JSONObject dto = new JSONObject();
        // 汇付机具号
        // dto.put("devs_id", "test");

        return dto.toJSONString();
    }

    private static String get0cbbfab1Dc17405eBae9606a530f5312() {
        JSONObject dto = new JSONObject();
        // 付款方名称
        // dto.put("certificate_name", "");
        // 付款方银行卡号
        // dto.put("bank_card_no", "");

        return dto.toJSONString();
    }

}
