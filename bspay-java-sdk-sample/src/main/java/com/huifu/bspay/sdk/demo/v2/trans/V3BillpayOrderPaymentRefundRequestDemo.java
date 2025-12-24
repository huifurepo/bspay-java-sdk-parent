package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V3BillpayOrderPaymentRefundRequest;

/**
 * 账单退款接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V3BillpayOrderPaymentRefundRequest.class)
public class V3BillpayOrderPaymentRefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V3BillpayOrderPaymentRefundRequest request = new V3BillpayOrderPaymentRefundRequest();
        // 请求流水号
        // request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        // request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        // request.setHuifuId("test");
        // 账单编号
        // request.setBillNo("test");
        // 退款金额
        // request.setRefAmt("test");
        // 大额转账支付账户信息数据jsonObject格式；银行大额转账支付交易的退款申请,付款方账户类型为对公时必填
        // request.setBankInfoData(get1d68b0833d9146359c7eAb5f4dbf001b());

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
        // 退款原因
        // extendInfoMap.put("reason", "");
        // 异步通知地址
        // extendInfoMap.put("notify_url", "");
        return extendInfoMap;
    }

    private static String get1d68b0833d9146359c7eAb5f4dbf001b() {
        JSONObject dto = new JSONObject();
        // 省份付款方为对公账户时必填,参见[代发省市地区码](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/area/%E6%96%97%E6%8B%B1%E4%BB%A3%E5%8F%91%E7%9C%81%E4%BB%BD%E5%9C%B0%E5%8C%BA%E7%BC%96%E7%A0%81.xlsx#代发省市地区码);&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0013&lt;/font&gt;
        // dto.put("province", "test");
        // 地区付款方为对公账户时必填，,参见[代发省市地区码](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/area/%E6%96%97%E6%8B%B1%E4%BB%A3%E5%8F%91%E7%9C%81%E4%BB%BD%E5%9C%B0%E5%8C%BA%E7%BC%96%E7%A0%81.xlsx#代发省市地区码)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1301&lt;/font&gt;
        // dto.put("area", "test");
        // 银行编号付款方为对公账户时必填,参见[银行编码](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_yhbm#银行编码);&lt;font color&#x3D;&quot;green&quot;&gt;示例值：01040000&lt;/font&gt;
        // dto.put("bank_code", "test");
        // 联行号付款方为对公账户时必填,参见[银行支行编码](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_yhzhbm#银行支行编码);&lt;font color&#x3D;&quot;green&quot;&gt;示例值：102290026507&lt;/font&gt;
        // dto.put("correspondent_code", "test");
        // 付款方账户类型
        // dto.put("card_acct_type", "");

        return dto.toJSONString();
    }

}
