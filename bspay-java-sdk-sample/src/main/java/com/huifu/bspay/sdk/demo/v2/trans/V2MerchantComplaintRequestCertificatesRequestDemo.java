package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantComplaintRequestCertificatesRequest;

/**
 * 支付宝申诉请求凭证 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantComplaintRequestCertificatesRequest.class)
public class V2MerchantComplaintRequestCertificatesRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantComplaintRequestCertificatesRequest request = new V2MerchantComplaintRequestCertificatesRequest();
        // 请求汇付流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求汇付时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 支付宝推送流水号
        request.setRiskBizId("04a3d978689542ed6ba0295fbc2dc137-BANK");
        // 商户类型
        request.setMerchantType("个体工商户");
        // 商户经营模式
        request.setOperationType("线上");
        // 收款应用场景
        request.setPaymentScene("通过小程序收款");

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
