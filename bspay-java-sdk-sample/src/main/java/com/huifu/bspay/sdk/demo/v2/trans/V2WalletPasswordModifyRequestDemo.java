package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2WalletPasswordModifyRequest;

/**
 * 钱包密码修改 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2WalletPasswordModifyRequest.class)
public class V2WalletPasswordModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2WalletPasswordModifyRequest request = new V2WalletPasswordModifyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000107309462");
        // 钱包用户ID
        request.setUserHuifuId("6666000107355468");
        // 手机短信验证码
        request.setVerifyNo("011363");
        // 短信验证流水号
        request.setVerifySeqId("WALLET0000000054024907");
        // 跳转地址
        request.setFrontUrl("https://www.huifu.com/products-services/");

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
        // 请求失效时间
        extendInfoMap.put("time_expired", "");
        return extendInfoMap;
    }

}
