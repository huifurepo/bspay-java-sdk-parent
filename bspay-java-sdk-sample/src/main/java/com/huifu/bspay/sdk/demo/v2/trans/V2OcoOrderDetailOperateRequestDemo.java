package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2OcoOrderDetailOperateRequest;

/**
 * 全渠道订单分账明细操作 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2OcoOrderDetailOperateRequest.class)
public class V2OcoOrderDetailOperateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2OcoOrderDetailOperateRequest request = new V2OcoOrderDetailOperateRequest();
        // 请求流水号
        // request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        // request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        // request.setHuifuId("test");
        // 分账数据源
        // request.setBusiSource("test");
        // 业务订单号
        // request.setOcoOrderId("test");
        // 操作类型
        // request.setOperateType("test");
        // 支付方式枚举：BALANCE-余额支付 EFP-全域资金付款；备注：当operate_type&#x3D;SPLIT 立即分账时，pay_type必填，且若为退款，按原交易类型原路返回；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：BALANCE&lt;/font&gt;
        // request.setPayType("test");

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
        // 分账接收方编号
        // extendInfoMap.put("in_huifu_id", "");
        return extendInfoMap;
    }

}
