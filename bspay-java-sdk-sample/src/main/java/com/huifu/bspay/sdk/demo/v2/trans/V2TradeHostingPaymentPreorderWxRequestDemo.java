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
        request.setMiniappData(getD9703d52B92d48238f2f8efaffc683a8());

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
        // extendInfoMap.put("split_pay_data", getA9b4116c348246a09256Cb92ff1468a1());
        // 分账对象
        extendInfoMap.put("acct_split_bunch", getB56e94c601784737Bd351f6915482693());
        // 统一收银台扩展参数集合
        // extendInfoMap.put("hosting_data", get1e3a25fa77f145358744D9607c3d5c6d());
        // 交易失效时间
        // extendInfoMap.put("time_expire", "");
        // 业务信息
        // extendInfoMap.put("biz_info", get2b8f9b9dDd5e4bbd8ebb3b814144f1c8());
        // 交易异步通知地址
        extendInfoMap.put("notify_url", "https://callback.service.com/xx");
        // 微信参数集合
        // extendInfoMap.put("wx_data", getA5c774deD00546ab866d5fe1d69040e5());
        // 设备信息
        // extendInfoMap.put("terminal_device_data", getA090526f7e75421a9c50E1cf7710783d());
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

    private static String getA9b4116c348246a09256Cb92ff1468a1() {
        JSONObject dto = new JSONObject();
        // 商户贴息标记
        // dto.put("fq_mer_discount_flag", "");
        // 商户业务信息
        // dto.put("ali_business_params", "");

        return dto.toJSONString();
    }

    private static JSON get148c81120b084d9fBd7f36f2c211ff9b() {
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

    private static String getB56e94c601784737Bd351f6915482693() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", get148c81120b084d9fBd7f36f2c211ff9b());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static String get1e3a25fa77f145358744D9607c3d5c6d() {
        JSONObject dto = new JSONObject();
        // 项目号
        // dto.put("project_id", "");

        return dto.toJSONString();
    }

    private static String getD9703d52B92d48238f2f8efaffc683a8() {
        JSONObject dto = new JSONObject();
        // 是否生成scheme_code
        dto.put("need_scheme", "Y");
        // 应用ID
        dto.put("seq_id", "APP_2022100912694428");
        // 私有信息
        dto.put("private_info", "oppsHosting://");

        return dto.toJSONString();
    }

    private static JSON get1c48675d4a224883A357C3cbbfa7b30f() {
        JSONObject dto = new JSONObject();
        // 指定支付者
        // dto.put("limit_payer", "");
        // 微信实名验证
        // dto.put("real_name_flag", "");

        return dto;
    }

    private static JSON getFcc910e32d31434eBa686cdfe1c93169() {
        JSONObject dto = new JSONObject();
        // 姓名
        // dto.put("name", "");
        // 证件类型
        // dto.put("cert_type", "");
        // 证件号
        // dto.put("cert_no", "");

        return dto;
    }

    private static String get2b8f9b9dDd5e4bbd8ebb3b814144f1c8() {
        JSONObject dto = new JSONObject();
        // 付款人验证（微信）
        // dto.put("payer_check_wx", get1c48675d4a224883A357C3cbbfa7b30f());
        // 个人付款人信息
        // dto.put("person_payer", getFcc910e32d31434eBa686cdfe1c93169());

        return dto.toJSONString();
    }

    private static JSON getFd43fd8f56b04805994c660c8ab819f6() {
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

    private static JSON get008abb5d9f31431aA8531bc2d077d9cf() {
        JSONObject dto = new JSONObject();
        // 单品列表
        // dto.put("goods_detail", getFd43fd8f56b04805994c660c8ab819f6());
        // 订单原价(元)
        // dto.put("cost_price", "");
        // 商品小票ID
        // dto.put("receipt_id", "");

        return dto;
    }

    private static JSON get984fc4b21ed145b396b00461b6b1f98d() {
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

    private static JSON get749cbf43F8bd452688d19b44ecf68848() {
        JSONObject dto = new JSONObject();
        // 门店信息
        // dto.put("store_info", get984fc4b21ed145b396b00461b6b1f98d());

        return dto;
    }

    private static String getA5c774deD00546ab866d5fe1d69040e5() {
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
        // dto.put("detail", get008abb5d9f31431aA8531bc2d077d9cf());
        // 设备号
        // dto.put("device_info", "");
        // 订单优惠标记
        // dto.put("goods_tag", "");
        // 实名支付
        // dto.put("identity", "");
        // 开发票入口开放标识
        // dto.put("receipt", "");
        // 场景信息
        // dto.put("scene_info", get749cbf43F8bd452688d19b44ecf68848());
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

    private static String getA090526f7e75421a9c50E1cf7710783d() {
        JSONObject dto = new JSONObject();
        // 汇付机具号
        // dto.put("devs_id", "test");

        return dto.toJSONString();
    }

}
