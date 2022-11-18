package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantDirectWechatSettlementinfoModifyRequest;

/**
 * 微信直连-修改微信结算帐号 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantDirectWechatSettlementinfoModifyRequest.class)
public class V2MerchantDirectWechatSettlementinfoModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantDirectWechatSettlementinfoModifyRequest request = new V2MerchantDirectWechatSettlementinfoModifyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付ID
        request.setHuifuId("6666000003098550");
        // 开发者的应用ID
        request.setAppId("wxd2da4051c9e32b86");
        // 微信商户号
        request.setMchId("1552470931");
        // 特约商户号
        request.setSubMchid("10888880");
        // 账户类型
        request.setAccountType("ACCOUNT_TYPE_BUSINESS");
        // 开户银行
        request.setAccountBank("农业银行");
        // 开户银行省市编码
        request.setBankAddressCode("310100");
        // 银行账号
        request.setAccountNumber("6235012141000002900");

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
        // 开户银行全称（含支行）
        extendInfoMap.put("bank_name", "中国农业银行股份有限公司上海马当路支行");
        // 开户银行联行号
        extendInfoMap.put("bank_branch_id", "103290040169");
        return extendInfoMap;
    }

}
