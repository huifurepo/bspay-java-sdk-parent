欢迎使用 斗拱SDK for Java 。

斗拱SDK for Java让您不用复杂编程即可访斗拱开放平台开放的各项能力，SDK可以自动帮您满足能力调用过程中所需的证书校验、加签、验签、发送HTTP请求等非功能性要求。
同时，斗拱dg-lightning-sdk提供聚合支付快速接入能力，能大大提升商户接入效率，可以参考dougong-java-lightning-sdk项目，主要包括交易创建、交易查询、交易关闭、交易退款、交易关闭查询、交易退款查询。

## 环境要求
1.  斗拱SDK for Java 需要使用`JKD 1.8`或其以上版本。
2.  SDK接入准备
   - 提交商户材料完成进件及相关业务配置；
   - 登录控台获取/配置密钥，参见[《商户密钥操作说明》](http://paas.huifutest.com/partners/devtools/#/sdk_java_myczsm)；
3.  准备工作完成后，注意保存如下信息，后续将作为使用SDK的输入。`商户的私钥`、`商户的公钥`、`汇付的公钥`；

## 安装依赖
推荐通过Maven来管理项目依赖，您只需在项目的`pom.xml`文件中声明如下依赖
        
        <dependency>
          <groupId>com.huifu.bspay.sdk</groupId>
          <artifactId>dg-java-sdk</artifactId>
          <version>3.0.2</version>
        </dependency>
        <dependency>
            <groupId>com.huifu.dg.lightning.sdk</groupId>
            <artifactId>dg-lightning-sdk</artifactId>
            <version>1.0.3</version>
        </dependency>
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>fastjson</artifactId>
            <version>1.2.70</version>
        </dependency>

        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpclient</artifactId>
            <version>4.5.2</version>
        </dependency>

        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpmime</artifactId>
            <version>4.5.2</version>
        </dependency>

        <!-- util -->
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.6</version>
        </dependency>

        <!-- okhttp -->
        <dependency>
            <groupId>com.squareup.okhttp3</groupId>
            <artifactId>okhttp</artifactId>
            <version>4.9.1</version>
        </dependency>

## 快速使用
1. 安装好依赖库保证运行环境没问题，可直接运行SDK demo，如调用商户详细信息查询正常返回说明运行环境配置成功；
2. 改商户配置信息(商户号、私钥)，看下单是否成功，如能成功，说明商户配置成功，否则请检查商户控台配置；
3. 部署服务端服务：安装并部署服务端服务到您的服务器，前端应用调用SDK；
4. 前端应用对接：前端应用通过网络请求获取到应用服务端从SDK获取的支付信息。在前端页面或者APP内处理后，发起支付。

以下这段代码示例向您展示了使用斗拱SDK for Java调用一个API的3个主要步骤：  
1. 初始化商户参数，完成Client实例并初始化。系统初始化时只需做一次； 
2. 创建API请求对象并设置Model参数。必填参数用set方法，非必填参数用addExtendInfo()方法设置；
3. 发起请求并处理响应或异常。

```java
 public static void main(String[] args) throws Exception {
        // 1. 设置商户参数（全局只需设置一次）
        doInit(OppsMerchantConfigDemo.getMerchantConfig());
        // 2. 组装交易参数
        TradePaymentMicropayRequest request = new TradePaymentMicropayRequest();
        //请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        //请求流水号（保证唯一）
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        //交易金额（单位元）
        request.setTransAmt("0.01");
        //条形码
        request.setAuthCode("287606928207260511");
        //商品描述
        request.setGoodsDesc("测试商品");
        //商户id
        request.setHuifuId("6666000103124174");
        // 3.拓展参数 (可选)
        // 该笔交易的异步通知地址（http/https异步通知地址，必须以virgo://开头）
        request.addExtendInfo("notify_url", "virgo://http://www.baidu.com");
        try {
            // 3. 发起API调用
            Map<String, Object> response = doExecute(request);
            System.out.println("返回数据:" + JSONObject.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

**异步消息说明**   
接口如果有异步返回，请参考斗拱API文档[异步消息说明](https://paas.huifu.com/partners/api/#/ybxx/api_ybxx)

## 文档

[SDK文档首页](http://paas.huifutest.com/partners/devtools/#/sdk_java)