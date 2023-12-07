package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeHostingPaymentPreorderAliRequest;

/**
 * 支付宝小程序预下单接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeHostingPaymentPreorderAliRequest.class)
public class V2TradeHostingPaymentPreorderAliRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeHostingPaymentPreorderAliRequest request = new V2TradeHostingPaymentPreorderAliRequest();
        // 商户号
        request.setHuifuId("6666000111546360");
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 预下单类型
        request.setPreOrderType("2");
        // 交易金额
        request.setTransAmt("0.10");
        // 商品描述
        request.setGoodsDesc("app跳支付宝消费");
        // app扩展参数集合
        request.setAppData(getAppData());

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
        // 收银台ID
        extendInfoMap.put("checkout_id", "");
        // 是否延迟交易
        extendInfoMap.put("delay_acct_flag", "N");
        // 分账对象
        extendInfoMap.put("acct_split_bunch", getAcctSplitBunchRucan());
        // 交易失效时间
        // extendInfoMap.put("time_expire", "");
        // 业务信息
        // extendInfoMap.put("biz_info", getBizInfo());
        // 异步通知地址
        extendInfoMap.put("notify_url", "https://callback.service.com/xx");
        return extendInfoMap;
    }

    private static JSON getAcctInfosRucan() {
        JSONObject dto = new JSONObject();
        // 分账金额
        dto.put("div_amt", "0.08");
        // 被分账方ID
        dto.put("huifu_id", "6666000111546360");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getAcctSplitBunchRucan() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", getAcctInfosRucan());

        return dto.toJSONString();
    }

    private static String getAppData() {
        JSONObject dto = new JSONObject();
        // 小程序返回码
        dto.put("app_schema", "app跳转链接");
        // 私有信息
        // dto.put("private_info", "");

        return dto.toJSONString();
    }

    private static JSON getPayerCheckAli() {
        JSONObject dto = new JSONObject();
        // 是否提供校验身份信息
        // dto.put("need_check_info", "");
        // 允许的最小买家年龄
        // dto.put("min_age", "");
        // 是否强制校验付款人身份信息
        // dto.put("fix_buyer", "");

        return dto;
    }

    private static JSON getPersonPayer() {
        JSONObject dto = new JSONObject();
        // 姓名
        // dto.put("name", "");
        // 证件类型
        // dto.put("cert_type", "");
        // 证件号
        // dto.put("cert_no", "");
        // 手机号
        // dto.put("mobile", "");

        return dto;
    }

    private static String getBizInfo() {
        JSONObject dto = new JSONObject();
        // 付款人验证（支付宝）
        // dto.put("payer_check_ali", getPayerCheckAli());
        // 个人付款人信息
        // dto.put("person_payer", getPersonPayer());

        return dto.toJSONString();
    }

}
