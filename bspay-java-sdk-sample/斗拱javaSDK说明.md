[toc]
# 简介

为了提高客户接入的便捷性，本系统提供 SDK 方式介入，使用本 SDK 将极大的简化开发者的工作，开发者将无需考虑通信、签名、验签等，只需要关注业务参数的输入。

# 下载地址

[SDK下载](https://paas.huifu.com/docs/partners/devtools/#/README)

# 版本记录

| 版本 | 日期 | 版本说明 | 
| --- | --- | --- | 
|v1.0.0 |	2021/04/22| 	初始版本
|v1.0.1 |	2021/04/29 |	增加商户进件类接口支持、结构调整
|v1.1.0 	|2021/07/30 	|增加通用接口支持、结构调整
|v1.1.1 	|2021/08/11 	|SDK版本升级
|v2.0.0 	|2021/10/08 |	更新斗拱SDK及对应demo
|v2.1.0 	|2021/11/08 |	更新斗拱SDK及对应demo(主要变化，BasePay.prodMode从boolean变成String：MODE_PROD = "prod"; // 生产环境；MODE_TEST = "test"; // 线上联调环境(针对商户联调测试)；MODE_INNER_TEST = "inner_test"; // 内部测试(针对开发测试使用))
|v2.2.0 	|2021/11/24 |	增加商户分账配置接口，修复取现配置注解bug
# 版本要求

JDK 版本 8.0 及以上

# SDK 包结构说明

- **dg-java-sdk-*.jar、spin-java-sdk.jar** 为待添加到项目中的文件；
- **dg-demo-sources.jar** 为示例DEMO项目，供接入时参考使用；

# 使用方法
1. 将 **dg-demo-sources.jar** 解压缩后，内容整体复制到您的项目工程内；
2. 在您的项目创建 SDK 初始化的入口文件，完成如下配置：  
   2.1 进行相关环境及调试参数的配置  

    ```
		// SDK初始化
		# debug 模式，开启后有详细的日志
		BasePay.debug = false;
		MerConfig merConfig = new MerConfig();
        merConfig.setProcutId(产品号);
        merConfig.setSysId(系统号);
        merConfig.setRsaPrivateKey(私钥);
        merConfig.setRsaPublicKey(公钥);
        merConfig.setHuifuId(商户号);
		
    ```

   2.2 完成 sdk 初始化

    ```
    # 加载 SDK 初始化文件
    BasePay.initWithMerConfig(merConfig);
    ```

3. 在业务代码中进行 SDK 的调用

   3.1 基本必要参数封装

    ```
    #基本参数封装
    AuthCodePayRequest request = new AuthCodePayRequest(reqDate, reqSeqId,
                transAmt, authCode, goodsDesc);
    ```
   
   3.2 非必要参数、可扩展参数封装
   
    拓展参数 (可选)
    request.addExtendInfo( , );

   3.3 发起业务请求
    #发起请求
    BasePayClient.request(request)

4. 其他调用方式

   为了应对接口变化后sdk更新的滞后性，以及sdk使用习惯不同等因素；
   同时提供灵活可扩展的调用方式
   ```
        # 参数组装
        Map<String, Object> dataMap = new HashMap<String, Object>();
        // 请求流水号，需保证当天商户下唯一，推荐采用日期时间+几位流水号的形式
        dataMap.put("req_seq_id", nowStr + "01234567890");
        // 请求日期，请求接口的日期，因服务器时间可能有差异，允许前后1天
        dataMap.put("req_date", "20210422");
        // 分配商户号
        dataMap.put("huifu_id", DemoConstants.DEMO_HUIFU_ID);
        // 出款商户号
        dataMap.put("out_huifu_id", DemoConstants.DEMO_HUIFU_ID);
        // 订单金额
        dataMap.put("ord_amt", "0.01");
        Map<String, Object> acctPayment = new HashMap<>();
        System.out.println("余额支付请求参数：" + JSON.toJSONString(dataMap));
		#发起请求
        acctPayment = BasePayClient.request(dataMap, "topat.acctPayment");

5. 银行卡、手机号、证件号、银行卡有效期，银行卡CVV2等信息加解密：
	为了安全性考虑，接口参数铭感数据需要进行密文，及调用方拿到密文后进行明文显示，对此，需要使用汇付提供的加解密工具
	如下：
		
		工具类文件：com.huifu.bspay.sdk.opps.core.utils.RsaUtils
		RSA公钥加密方法：encrypt(明文,汇付提供的公钥(调用方公钥));
		RSA私钥解密方法：decrypt(密文,汇付提供的私钥(汇付私钥));
	
```