package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeSettleCollectionRuleAddRequest;

/**
 * 新增归集配置 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeSettleCollectionRuleAddRequest.class)
public class V2TradeSettleCollectionRuleAddRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeSettleCollectionRuleAddRequest request = new V2TradeSettleCollectionRuleAddRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 转入方商户号
        request.setInHuifuId("6666000143571659");
        // 转出方商户号
        request.setOutHuifuId("6666000152758213");
        // 签约人手机号协议类型为电子协议时必填，必须为法人手机号。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：13911111111&lt;/font&gt;
        request.setSignUserMobileNo("");
        // 协议文件Id协议类型为纸质协议时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        request.setFileId("f80a4c17-d7c5-3e31-9e70-daf2bd6be29e");

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
        // 转入方账户号
        extendInfoMap.put("in_acct_id", "");
        // 转出方账户号
        extendInfoMap.put("out_acct_id", "");
        // 转出方账户留存金额
        extendInfoMap.put("remained_amt", "1.01");
        // 协议类型
        extendInfoMap.put("agreement_type", "1");
        // 异步消息接收地址
        extendInfoMap.put("async_return_url", "http://service.testexample.com/to/path");
        return extendInfoMap;
    }

}
