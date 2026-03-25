package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeHostingPaymentPreorderWxRequest;

/**
 * 微信小程序预下单接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeHostingPaymentPreorderWxRequest.class)
public class V2TradeHostingPaymentPreorderWxRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeHostingPaymentPreorderWxRequest request = new V2TradeHostingPaymentPreorderWxRequest();
        // 预下单类型
        request.setPreOrderType("3");
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 交易金额
        request.setTransAmt("0.13");
        // 商品描述
        request.setGoodsDesc("app跳微信消费");
        // 微信小程序扩展参数集合
        request.setMiniappData(get83e36167A9c24bb2A799F8b1882812b5());

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
        extendInfoMap.put("delay_acct_flag", "Y");
        // 是否拆单支付
        // extendInfoMap.put("split_pay_flag", "");
        // 拆单支付参数集合
        // extendInfoMap.put("split_pay_data", getD3738754Bc2a4a01828b42a77cea9188());
        // 分账对象
        extendInfoMap.put("acct_split_bunch", get7a4b7892242e4fc7Bc870ac5e8d05cb5());
        // 交易失效时间
        // extendInfoMap.put("time_expire", "");
        // 业务信息
        // extendInfoMap.put("biz_info", getD004cad4Bcc64aac8c9360e1a12e4f08());
        // 交易异步通知地址
        extendInfoMap.put("notify_url", "https://callback.service.com/xx");
        // 回调地址
        // extendInfoMap.put("callback_url", "");
        // 微信参数集合
        // extendInfoMap.put("wx_data", get4a41ea0dFe044216B4f6F0dee61573ce());
        // 设备信息
        // extendInfoMap.put("terminal_device_data", getF082d973186042248c80747394db30bd());
        // 手续费场景标识
        // extendInfoMap.put("fee_sign", "");
        return extendInfoMap;
    }

    private static String getD3738754Bc2a4a01828b42a77cea9188() {
        JSONObject dto = new JSONObject();
        // 商户贴息标记
        // dto.put("fq_mer_discount_flag", "");
        // 商户业务信息
        // dto.put("ali_business_params", "");

        return dto.toJSONString();
    }

    private static JSON get69bc8233102c45ba9fa24a5c6cd55967() {
        JSONObject dto = new JSONObject();
        // 分账金额
        dto.put("div_amt", "0.01");
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

    private static String get7a4b7892242e4fc7Bc870ac5e8d05cb5() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", get69bc8233102c45ba9fa24a5c6cd55967());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static String get83e36167A9c24bb2A799F8b1882812b5() {
        JSONObject dto = new JSONObject();
        // 是否生成scheme_code
        dto.put("need_scheme", "Y");
        // 应用ID
        dto.put("seq_id", "APP_2022100912694428");
        // 私有信息
        dto.put("private_info", "oppsHosting://");

        return dto.toJSONString();
    }

    private static JSON get5ab09a20179d40c9849d6e8f48d9f8e8() {
        JSONObject dto = new JSONObject();
        // 指定支付者
        // dto.put("limit_payer", "");
        // 微信实名验证
        // dto.put("real_name_flag", "");

        return dto;
    }

    private static JSON get466b5a79479948e2Bac5B39ca63d32e9() {
        JSONObject dto = new JSONObject();
        // 姓名
        // dto.put("name", "");
        // 证件类型
        // dto.put("cert_type", "");
        // 证件号
        // dto.put("cert_no", "");

        return dto;
    }

    private static String getD004cad4Bcc64aac8c9360e1a12e4f08() {
        JSONObject dto = new JSONObject();
        // 付款人验证（微信）
        // dto.put("payer_check_wx", get5ab09a20179d40c9849d6e8f48d9f8e8());
        // 个人付款人信息
        // dto.put("person_payer", get466b5a79479948e2Bac5B39ca63d32e9());

        return dto.toJSONString();
    }

    private static JSON get9ebc2a1632a04e4b80fbCaf9420954b6() {
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

    private static JSON get275d91ec3cc9432391cdA503fc3f39bc() {
        JSONObject dto = new JSONObject();
        // 单品列表
        // dto.put("goods_detail", get9ebc2a1632a04e4b80fbCaf9420954b6());
        // 订单原价(元)
        // dto.put("cost_price", "");
        // 商品小票ID
        // dto.put("receipt_id", "");

        return dto;
    }

    private static JSON get389150227eb942838035F4608dc5eaa6() {
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

    private static JSON get9caf1ada4e194334A3e08738ba1d1647() {
        JSONObject dto = new JSONObject();
        // 门店信息
        // dto.put("store_info", get389150227eb942838035F4608dc5eaa6());

        return dto;
    }

    private static String get4a41ea0dFe044216B4f6F0dee61573ce() {
        JSONObject dto = new JSONObject();
        // 子商户应用ID
        // dto.put("sub_appid", "");
        // 子商户用户标识
        // dto.put("sub_openid", "");
        // 附加数据
        // dto.put("attach", "");
        // 商品描述
        // dto.put("body", "");
        // 商品详情
        // dto.put("detail", get275d91ec3cc9432391cdA503fc3f39bc());
        // 设备号
        // dto.put("device_info", "");
        // 订单优惠标记
        // dto.put("goods_tag", "");
        // 实名支付
        // dto.put("identity", "");
        // 开发票入口开放标识
        // dto.put("receipt", "");
        // 场景信息
        // dto.put("scene_info", get9caf1ada4e194334A3e08738ba1d1647());
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

    private static String getF082d973186042248c80747394db30bd() {
        JSONObject dto = new JSONObject();
        // 汇付机具号
        // dto.put("devs_id", "test");

        return dto.toJSONString();
    }

}
