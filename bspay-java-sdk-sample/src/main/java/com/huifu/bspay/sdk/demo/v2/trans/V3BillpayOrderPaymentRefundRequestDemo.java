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
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000108432796");
        // 账单编号
        request.setBillNo("BN2026052236198530");
        // 退款金额
        request.setRefAmt("100.00");
        // 大额转账支付账户信息数据jsonObject格式；银行大额转账支付交易的退款申请,付款方账户类型为对公时必填
        request.setBankInfoData(get39a3f6ccD87e496fB6ac4a9211667d6f());

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
        extendInfoMap.put("reason", "退货");
        // 异步通知地址
        // extendInfoMap.put("notify_url", "");
        return extendInfoMap;
    }

    private static String get39a3f6ccD87e496fB6ac4a9211667d6f() {
        JSONObject dto = new JSONObject();
        // 省份
        dto.put("province", "0013");
        // 地区
        dto.put("area", "1301");
        // 银行编号
        dto.put("bank_code", "01040000");
        // 联行号
        dto.put("correspondent_code", "102290026507");
        // 付款方账户类型
        dto.put("card_acct_type", "E");

        return dto.toJSONString();
    }

}
