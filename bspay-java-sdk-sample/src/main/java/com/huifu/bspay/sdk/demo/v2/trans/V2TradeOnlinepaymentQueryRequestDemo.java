package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeOnlinepaymentQueryRequest;

/**
 * 线上交易查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeOnlinepaymentQueryRequest.class)
public class V2TradeOnlinepaymentQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeOnlinepaymentQueryRequest request = new V2TradeOnlinepaymentQueryRequest();
        // 商户号
        request.setHuifuId("6666000109133323");
        // 原交易请求日期
        request.setOrgReqDate("20240401");
        // 原交易返回的全局流水号原交易请求流水号、原交易返回的全局流水号至少要送其中一项；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：00290TOP1GR210919004230P853ac13262200000&lt;/font&gt;
        request.setOrgHfSeqId("00600000000240401100725P864ac13645d00000");
        // 原交易请求流水号原交易请求流水号、原交易返回的全局流水号至少要送其中一项；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：2021091708126665001&lt;/font&gt;
        request.setOrgReqSeqId("295700155481522176");
        // 原交易支付类型QUICK_PAY：快捷支付、快捷充值(查询快捷交易必填)&lt;br/&gt;ONLINE_PAY：网银支付、网银充值&lt;br/&gt;WAP_PAY：手机WAP支付&lt;br/&gt;UNION_PAY：银联APP统一支付&lt;br/&gt;QUICK_PAY_APPLY：银行卡分期申请&lt;br/&gt;QUICK_PAY_CONFIRM：银行卡分期确认&lt;br/&gt;TRANSFER_ACCT：网银转账&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：TRANSFER_ACCT&lt;/font&gt;&lt;br/&gt;注意：**不支持聚合扫码接口生成的微信、支付宝、银联二维码等交易的查询。**
        request.setPayType("QUICK_PAY");

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
        return extendInfoMap;
    }

}
