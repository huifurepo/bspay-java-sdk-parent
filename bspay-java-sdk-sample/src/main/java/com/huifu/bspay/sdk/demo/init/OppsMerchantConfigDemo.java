/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
package com.huifu.bspay.sdk.demo.init;


import com.huifu.bspay.sdk.demo.constants.DemoTestConstants;
import com.huifu.bspay.sdk.opps.core.BasePay;
import com.huifu.bspay.sdk.opps.core.config.MerConfig;


/**
 * 配置实例
 *
 * <p>
 * 使用本SDK需要进行商户配置，配置由汇付分配的产品号、系统号、及对应加签、验签的密钥信息。
 * </p>
 *
 * @author kefeng.zheng
 * @version v 0.1
 */
public class OppsMerchantConfigDemo {
    public static MerConfig getMerchantConfig() {
        /** debug 模式，开启后有详细的日志
         */
        BasePay.debug = true;

        /**
         * prodMode 模式，默认为生产模式
         * MODE_PROD = "prod"; // 生产环境
         * MODE_TEST = "test"; // 线上联调环境(针对商户联调测试)
         */
        BasePay.prodMode = BasePay.MODE_INNER_TEST;

        /**
         * 单商户模式
         */
        MerConfig merConfig = new MerConfig();
        merConfig.setProcutId(DemoTestConstants.DEMO_PRODUCT_ID);
        merConfig.setSysId(DemoTestConstants.DEMO_SYS_ID);
        merConfig.setRsaPrivateKey(DemoTestConstants.DEMO_RSA_PRIVATE_KEY);
        merConfig.setRsaPublicKey(DemoTestConstants.DEMO_RSA_PUBLIC_KEY);
        return merConfig;
    }
}
