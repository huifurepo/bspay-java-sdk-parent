package com.huifu.bspay.sdk.demo.v4;

import com.huifu.dg.lightning.biz.config.MerConfig;
import com.huifu.dg.lightning.utils.BasePay;

public class BaseCommonDemoV4 {
    public static void doInit(MerConfig merConfig) throws Exception {
        BasePay.initWithMerConfig(merConfig);
    }

    /**
     * 用户配置初始化兼容V2V3的MerConfig对象
     * @param merConfig
     * @throws Exception
     */
    public static void doInit(com.huifu.bspay.sdk.opps.core.config.MerConfig merConfig) throws Exception {
        com.huifu.dg.lightning.biz.config.MerConfig lightningMerConfig = new com.huifu.dg.lightning.biz.config.MerConfig();
        com.huifu.dg.lightning.utils.BasePay.debug = com.huifu.bspay.sdk.opps.core.BasePay.debug;
        com.huifu.dg.lightning.utils.BasePay.prodMode = com.huifu.bspay.sdk.opps.core.BasePay.prodMode;
        lightningMerConfig.setProductId(merConfig.getProcutId());
        lightningMerConfig.setSysId(merConfig.getSysId());
        lightningMerConfig.setRsaPrivateKey(merConfig.getRsaPrivateKey());
        lightningMerConfig.setRsaPublicKey(merConfig.getRsaPublicKey());
        lightningMerConfig.setCustomSocketTimeout(merConfig.getCustomSocketTimeout());
        lightningMerConfig.setCustomConnectTimeout(merConfig.getCustomConnectTimeout());
        lightningMerConfig.setCustomConnectionRequestTimeout(merConfig.getCustomConnectionRequestTimeout());
        BasePay.initWithMerConfig(lightningMerConfig);
    }
}
