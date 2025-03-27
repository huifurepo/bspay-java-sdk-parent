package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2WalletTradeRechargeTransferRequest;

/**
 * 用户补贴 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2WalletTradeRechargeTransferRequest.class)
public class V2WalletTradeRechargeTransferRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2WalletTradeRechargeTransferRequest request = new V2WalletTradeRechargeTransferRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 出款方商户号
        request.setHuifuId("6666000107309462");
        // 收款方用户号
        request.setUserHuifuId("6666000187364826");
        // 转账金额
        request.setTransAmt("0.01");

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
        // 出款方账户
        extendInfoMap.put("acct_id", "F00598600");
        // 转账描述
        extendInfoMap.put("description", "用户补贴");
        // 备注
        extendInfoMap.put("remark", "备注");
        return extendInfoMap;
    }

}
