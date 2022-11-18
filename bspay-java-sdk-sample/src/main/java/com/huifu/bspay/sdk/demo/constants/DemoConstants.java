/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
package com.huifu.bspay.sdk.demo.constants;

/**
 *
 * @author kefeng.zheng
 * @version v 0.1
 */
public class DemoConstants {
    /**
     * 汇付分配的产品号
     */
    public static final String DEMO_PRODUCT_ID = "SPIN";
    /**
     * 汇付分配的系统号
     */
    public static final String DEMO_SYS_ID = "6666000018269234";
    /**
     * 商户进件后获得的商户号
     */
    public static final String DEMO_HUIFU_ID = "6666000106120347";

    /**
     * 汇付分配的私钥，用于调用接口时进行签名
     */
    public static final String DEMO_RSA_PRIVATE_KEY = "";

    /**
     * 汇付分配的公钥，用于对汇付返回报文进行签名验证
     */
    public static final String DEMO_RSA_PUBLIC_KEY = "";

    /**
     * 微信分配的商户公众账号ID
     */
    public static final String WX_SUB_APP_ID = "wx5110d8e12d8b5a46";
    /**
     * 用户在商户appid下的唯一标识，由商户自行调用微信接口通过授权码换取的openid
     */
    public static final String WX_SUB_OPEN_ID = "oQZ4-5d_jng3kdM1rSNzGh-MXMj4";

    /**
     * 用户在商户appid下的唯一标识，由商户自行调用微信接口通过授权码换取的openid
     */
    public static final String ALI_BUYER_ID = "2088002007965465";

    /**
     * 银联用户唯一标识
     */
    public static final String UNIONPAY_USER_ID = "cs/GRNlPCZbwPZ56UxhW32cefcRECkjucWZrI2dSQU9vRYtLCxmQDxojXCAh63pr";

    /**
     * 支付宝用户展示的付款二维码
     */
    public static final String ALIPAY_AUTH_CODE = "287051579656962267";

    /**
     * 微信用户展示的付款二维码
     */
    public static final String WX_AUTH_CODE = "135544956454558898";

    /**
     * 银联用户展示的付款二维码
     */
    public static final String UNIONPAY_AUTH_CODE = "6226765919984381928";

    /**
     * 银联用户授权码
     */
    public static final String UNIONPAY_USER_AUTH_CODE = "6j2MZY3YShmGFn4NHfQqeA==";

    /**
     * 手机网页支付银行卡号
     */
    public static final String WAP_PAY_CARD_NO = "6226021791540124";

    /**
     * 异步通知地址
     */
    public static final String NOTICE_URL = "virgo://http://www.xxx.com/getResp";

    /**
     * 分账商户号
     */
    public static final String DIV_HUIFU_ID = "6666000106120347";


    /**
     * 取现卡序列号
     */
    public static final String TOKEN_NO = "10010356033";

    // 银行卡分期测试信息
    public static final String BANK_NO = "03050000";
    public static final String CARD_NAME = "";
    public static final String CARD_NO = "";
    public static final String CARD_MOBILE = "";
    public static final String ID_NO = "";
    public static final String CVV2 = "";
    public static final String VALID_DATE = "";
    public static final String CARD_TYPE = "";
    public static final String TRANS_AMT = "100.00";
}
