package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeHostingPaymentPreorderAliRequest;

/**
 * 支付宝小程序预下单接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeHostingPaymentPreorderAliRequest.class)
public class V2TradeHostingPaymentPreorderAliRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeHostingPaymentPreorderAliRequest request = new V2TradeHostingPaymentPreorderAliRequest();
        // 商户号
        request.setHuifuId("6666000109133323");
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 预下单类型
        request.setPreOrderType("2");
        // 交易金额
        request.setTransAmt("0.10");
        // 商品描述
        request.setGoodsDesc("app跳支付宝消费");
        // app扩展参数集合
        request.setAppData(get89f3467bBa2b465bA6cbAd07b1addac7());

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
        // 分账对象
        extendInfoMap.put("acct_split_bunch", get486d5b405abf43a6B7df5c4fc862c1bf());
        // 统一收银台扩展参数集合
        // extendInfoMap.put("hosting_data", getC87c3e10B0b14733A25aB61f89739b74());
        // 交易失效时间
        // extendInfoMap.put("time_expire", "");
        // 业务信息
        // extendInfoMap.put("biz_info", get6719a7ebE69543218767F50aee6a9beb());
        // 异步通知地址
        extendInfoMap.put("notify_url", "https://callback.service.com/xx");
        // 支付宝参数集合
        // extendInfoMap.put("alipay_data", getA35c28a9F4c641cbB33dEcd8b6f3c3ba());
        // 设备信息
        // extendInfoMap.put("terminal_device_data", get606d3239Badf48efA8b90053fd268ad0());
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

    private static JSON get111355cc120e4fcf8f419413ca47503d() {
        JSONObject dto = new JSONObject();
        // 分账金额
        dto.put("div_amt", "0.08");
        // 分账接收方ID
        dto.put("huifu_id", "6666000109133323");
        // 收款汇付账户号
        // dto.put("acct_id", "");
        // 分账百分比%
        // dto.put("percentage_div", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get486d5b405abf43a6B7df5c4fc862c1bf() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", get111355cc120e4fcf8f419413ca47503d());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static String getC87c3e10B0b14733A25aB61f89739b74() {
        JSONObject dto = new JSONObject();
        // 项目号
        // dto.put("project_id", "");

        return dto.toJSONString();
    }

    private static String get89f3467bBa2b465bA6cbAd07b1addac7() {
        JSONObject dto = new JSONObject();
        // 小程序返回码
        dto.put("app_schema", "app跳转链接");
        // 支付宝小程序ID
        // dto.put("appid", "");
        // 私有信息
        // dto.put("private_info", "");

        return dto.toJSONString();
    }

    private static JSON getBcb041f4F48b41648104A27e3a9a32a6() {
        JSONObject dto = new JSONObject();
        // 是否提供校验身份信息
        // dto.put("need_check_info", "");
        // 允许的最小买家年龄
        // dto.put("min_age", "");
        // 是否强制校验付款人身份信息
        // dto.put("fix_buyer", "");

        return dto;
    }

    private static JSON get1fb821f7C1a7400cB4abDc6918c77f74() {
        JSONObject dto = new JSONObject();
        // 姓名
        // dto.put("name", "");
        // 证件类型
        // dto.put("cert_type", "");
        // 证件号
        // dto.put("cert_no", "");
        // 手机号
        // dto.put("mobile", "");

        return dto;
    }

    private static String get6719a7ebE69543218767F50aee6a9beb() {
        JSONObject dto = new JSONObject();
        // 付款人验证（支付宝）
        // dto.put("payer_check_ali", getBcb041f4F48b41648104A27e3a9a32a6());
        // 个人付款人信息
        // dto.put("person_payer", get1fb821f7C1a7400cB4abDc6918c77f74());

        return dto.toJSONString();
    }

    private static JSON get142b4c38F14849f3Bd96Cdee8566a0be() {
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

    private static JSON getEab0a717017844c6Aa4655151bea0d91() {
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

    private static String getA35c28a9F4c641cbB33dEcd8b6f3c3ba() {
        JSONObject dto = new JSONObject();
        // 支付宝的店铺编号
        // dto.put("alipay_store_id", "");
        // 业务扩展参数
        // dto.put("extend_params", get142b4c38F14849f3Bd96Cdee8566a0be());
        // 订单包含的商品列表信息
        // dto.put("goods_detail", getEab0a717017844c6Aa4655151bea0d91());
        // 商户原始订单号
        // dto.put("merchant_order_no", "");
        // 商户操作员编号
        // dto.put("operator_id", "");
        // 产品码
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

    private static String get606d3239Badf48efA8b90053fd268ad0() {
        JSONObject dto = new JSONObject();
        // 汇付机具号
        // dto.put("devs_id", "test");

        return dto.toJSONString();
    }

}
