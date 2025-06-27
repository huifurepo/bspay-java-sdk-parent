package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeInstallmentPaymentRequest;

/**
 * 分期支付 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeInstallmentPaymentRequest.class)
public class V2TradeInstallmentPaymentRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeInstallmentPaymentRequest request = new V2TradeInstallmentPaymentRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000100000000");
        // 交易金额
        request.setTransAmt("100.00");
        // 分期数
        request.setInstallmentNum("3");
        // 商品描述
        request.setGoodsDesc("手机");
        // 安全信息
        request.setRiskCheckData(get1257a32f2ef14be2B961Db0c19b3d9f2());
        // 京东白条分期信息trans_type&#x3D;JDBT时，必填jsonObject字符串，京东白条分期相关信息通过该参数集上送
        request.setJdbtData(get8c5acd7aCf444fc2Bc680dd4aee003b4());
        // 银联聚分期信息trans_type&#x3D;YLJFQ-银联聚分期时，必填jsonObject字符串，银联聚分期相关信息通过该参数集上送
        // request.setYljfqData(getDddbce9400d34548Aa28C4b1e2065d66());

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
        // 交易类型
        // extendInfoMap.put("trans_type", "");
        // 支付场景
        // extendInfoMap.put("pay_scene", "");
        // 交易有效期
        extendInfoMap.put("time_expire", "20241008235959");
        // 手续费扣款标志
        // extendInfoMap.put("fee_flag", "");
        // 延时标识
        // extendInfoMap.put("delay_acct_flag", "");
        // 备注
        extendInfoMap.put("remark", "备注");
        // 异步通知地址
        extendInfoMap.put("notify_url", "https://www.baidu.com/onlineAsync");
        // 商户贴息标记
        // extendInfoMap.put("fq_mer_discount_flag", "");
        // 分账对象
        extendInfoMap.put("acct_split_bunch", getD4fa236f35a2438d92a3E082b9201759());
        return extendInfoMap;
    }

    private static JSON get98bef6f0C9c94035A281E381ea90aa2e() {
        JSONObject dto = new JSONObject();
        // 商户号
        dto.put("huifu_id", "6666000100000000");
        // 分账金额
        dto.put("div_amt", "");
        // 分账百分比
        dto.put("percentage_div", "70.00");
        // 账户号
        dto.put("acct_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getD4fa236f35a2438d92a3E082b9201759() {
        JSONObject dto = new JSONObject();
        // 百分比分账标志
        dto.put("percentage_flag", "Y");
        // 是否净值分账
        dto.put("is_clean_split", "N");
        // 分账明细
        dto.put("acct_infos", get98bef6f0C9c94035A281E381ea90aa2e());

        return dto.toJSONString();
    }

    private static String get1257a32f2ef14be2B961Db0c19b3d9f2() {
        JSONObject dto = new JSONObject();
        // 经度
        dto.put("longitude", "126.630128");
        // 纬度
        dto.put("latitude", "126.630128");
        // 基站地址
        dto.put("base_station", "3");
        // IP地址
        dto.put("ip_addr", "182.33.21.4");

        return dto.toJSONString();
    }

    private static String get8c5acd7aCf444fc2Bc680dd4aee003b4() {
        JSONObject dto = new JSONObject();
        // 商品数量
        dto.put("goods_num", "3");
        // 下单来源
        dto.put("order_source", "微信APP扫一扫");
        // 请求来源类型
        dto.put("order_source_type", "H5");
        // 同步通知页面
        dto.put("callback_url", "https://www.baidu.com");

        return dto.toJSONString();
    }

    private static JSON get3e5c04694365421bA9f34d0688df02b4() {
        JSONObject dto = new JSONObject();
        // 证件类型
        // dto.put("certify_type", "test");
        // 证件号码原文最大为20位，密文最大长度为2048；使用斗拱公钥做RSA加密；示例值：b9LE5RccVVLChrHgo9lvp……PhWhjKrWg2NPfbe0mkQ&#x3D;&#x3D;
        // dto.put("certify_no", "test");
        // 姓名
        // dto.put("customer_name", "test");

        return dto;
    }

    private static JSON get5b725ca8698d42779af34d580d28300a() {
        JSONObject dto = new JSONObject();
        // 标记类型
        // dto.put("token_type", "test");
        // 标记请求id
        // dto.put("token_id", "test");
        // 支付标记
        // dto.put("token", "test");

        return dto;
    }

    private static String getDddbce9400d34548Aa28C4b1e2065d66() {
        JSONObject dto = new JSONObject();
        // 限定付款银行卡号原文最大为20位，密文最大长度为2048；使用斗拱公钥做RSA加密；限定付款银行卡号与限定付款银行卡号掩码仅需上送一个,若限定了卡号信息该笔订单无法在pay_info拉起支付页面更换卡号支付示例值：b9LE5RccVVLChrHgo9lvp……PhWhjKrWg2NPfbe0mkQ&#x3D;&#x3D;
        // dto.put("limit_pay_card_no", "test");
        // 限定付款银行卡号掩码商户限定付款银行卡号掩码支付，需同时上送用户手机号码，仅在scene_flag&#x3D;02联合登陆场景下使用。卡号与卡号掩码仅需上送一个(掩码卡号必须是前六后四中间6个\*)
        // dto.put("limit_pay_card_no_mask", "test");
        // 手机号原文最大为11位，密文最大长度为2048；使用斗拱公钥做RSA加密；联合登陆场景下上送用户手机号(白名单商户才能支持联登)示例值：b9LE5RccVVLChrHgo9lvp……PhWhjKrWg2NPfbe0mkQ&#x3D;&#x3D;
        // dto.put("phone_no", "test");
        // 限定付款卡号银行代码简称商户想指定银行分期支付，则填上该值，取值银行代码简称，多个银行代码用&amp;分开。若上送了卡号或卡号掩码无需上送改字段，若上送需与卡号对应银行保持一致。银行代码简称：ICBC
        // dto.put("limit_bank_name", "test");
        // 场景标识01-保险实名认证：仅对保险商户使用，聚分期在持卡人分期付款前获取用户授权同意后向通过“保险实名验证接口”向商户加密传输实名信息，由保险商户验证是否与保单实名信息一致，若一致继续付款。（保险实名验证场景下无法进行联合登陆）02-联合登陆：商户侧对持卡人完成了登陆验证且为银联可信商户，聚分期对持卡人不进行登陆验证。在该场景下需同时上送登陆状态。03-限定身份信息：商户上送持卡人实名信息（customer_info）（需同时上送姓名、证件类型、证件号），银联会校验持卡人付款卡号的实名信息与商户上送的是否一致，若不一致则无法支付。若在联合登陆场景下使用限定身份信息功能，则场景标志为03-限定身份信息，同时上送登陆状态及手机号。
        // dto.put("scene_flag", "test");
        // 登录状态N-未登录，Y-已登录，登录状态：联合登陆场景下上送登陆状态，表明用户在商户侧的登陆状态，不上送默认为N。
        // dto.put("login_state", "test");
        // 门店标识用来标识商户的门店信息
        // dto.put("store_info", "test");
        // 门店名称用于前端展示商户门店名称。（需与store_info一起上送该字段，不能单独上送），不能超过15个汉字和字符
        // dto.put("store_name", "test");
        // 身份信息身份信息：场景标识为“01-实名认证”情况下，必须上送实名信息；场景标识为“02-联合登陆”下，可选上送。注：（1）实名认证场景下需同时上送姓名及证件号码（2）联合登录场景下可选上送姓名及证件号码（3）限定身份信息场景下必须上送姓名，证件号码可选上送，支持上送全量证件。
        // dto.put("customer_info", get3e5c04694365421bA9f34d0688df02b4());
        // 商品详细信息
        // dto.put("body_info", "");
        // 同步通知页面
        // dto.put("callback_url", "");
        // 标记化支付信息
        // dto.put("token_pay_info", get5b725ca8698d42779af34d580d28300a());

        return dto.toJSONString();
    }

}
