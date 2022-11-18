/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
package com.huifu.bspay.sdk.opps.core;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.huifu.bspay.sdk.opps.core.config.MerConfig;

/**
 * @author kefeng.zheng
 * @version v 0.1
 */
public class BasePay {
	/**
	 * 是否使用默认的httpClient
	 */
	public static volatile boolean userDefaultCloseableHttpClient = true;
	/**
	 * 调试模式，打开可以输出更多调试日志
	 */
	public static volatile boolean debug = true;
	

    public static final String MODE_PROD = "prod"; // 生产环境
    public static final String MODE_TEST = "test"; // 线上联调环境(针对商户联调测试)
    public static final String MODE_INNER_TEST = "inner_test"; // 内部测试(针对开发测试使用)
	/**
	 * 生产模式
	 */
	public static volatile String prodMode = MODE_PROD;
    
	/**
	 * 接口生产域名
	 */
	public static final String apiBase = "https://api.huifu.com";
	/**
	 * 接口集成测试域名
	 */
	public static final String apiBaseMock = "https://spin-test.cloudpnr.com";
	public static final String apiBaseTest = "https://opps-stbmertest.testpnr.com";

	/**
	 * 汇付固定公钥，当未配置汇付侧发送数据的公私钥时，将默认使用此公钥验签
	 */
	public static volatile String HUIFU_DEFAULT_PUBLIC_KEY = "";

	private static volatile Map<String, MerConfig> configMap = new HashMap<String, MerConfig>();

	public static void addMerConfig(MerConfig merConfig, String merchantKey) throws Exception {
		configMap.put(merchantKey, merConfig);
	}

	public static void initWithMerConfig(MerConfig merConfig) throws Exception {

		if (merConfig == null) {
			throw new Exception("配置不能为空");
		}

		configMap.put("default", merConfig);
	}

	public static void initWithMerConfigs(Map<String, MerConfig> multiConfigs) throws Exception {

		if (multiConfigs == null) {
			throw new Exception("配置信息不能为空");
		}
		if (multiConfigs.size() > 0) {
			for (Map.Entry<String, MerConfig> entry : multiConfigs.entrySet()) {
				try {
					configMap.put(entry.getKey(), entry.getValue());
				} catch (Exception e) {
					System.out.println("初始化校验配置出现错误，常见是秘钥不匹配," + ((MerConfig) entry.getValue()).getSysId());
				}
			}
		} else {
			throw new Exception("配置信息不能为空");
		}
	}
	
	/***
	 * @Description: 动态设置参数
	 * @param huifId 商户号
	 * @param configs 配置
	 * @throws Exception 
	 * @author: xianlong.shen
	 * @date: 2021年6月29日下午6:46:06
	 */
	public static void putMerConfigs(String huifId, MerConfig configs) throws Exception {

		if (StringUtils.isBlank(huifId) || null == configs) {
			throw new Exception("配置信息不能为空");
		}
		
		configMap.put(huifId, configs);
		
	}

	public static MerConfig getConfig(String sysId) {
		if (sysId == null || "".equals(sysId.trim())) {
			sysId = "default";
		}
		return configMap.get(sysId);
	}
}
