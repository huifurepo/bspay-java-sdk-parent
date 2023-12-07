package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeHostingPaymentPreorderH5Request;

/**
 * H5、PC预下单接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeHostingPaymentPreorderH5Request.class)
public class V2TradeHostingPaymentPreorderH5RequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeHostingPaymentPreorderH5Request request = new V2TradeHostingPaymentPreorderH5Request();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000111546360");
        // 交易金额
        request.setTransAmt("0.10");
        // 商品描述
        request.setGoodsDesc("支付托管消费");
        // 预下单类型
        request.setPreOrderType("1");
        // 半支付托管扩展参数集合
        request.setHostingData(getHostingData());

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
        extendInfoMap.put("acct_split_bunch", getAcctSplitBunch());
        // 交易失效时间
        // extendInfoMap.put("time_expire", "");
        // 业务信息
        extendInfoMap.put("biz_info", getBizInfo());
        // 交易异步通知地址
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

    private static String getAcctSplitBunch() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", getAcctInfosRucan());

        return dto.toJSONString();
    }

    private static String getHostingData() {
        JSONObject dto = new JSONObject();
        // 项目标题
        dto.put("project_title", "收银台标题");
        // 半支付托管项目号
        dto.put("project_id", "PROJECTID2022032912492559");
        // 商户私有信息
        dto.put("private_info", "商户私有信息test");
        // 回调地址
        dto.put("callback_url", "https://paas.huifu.com");

        return dto.toJSONString();
    }

    private static JSON getPayerCheckAli() {
        JSONObject dto = new JSONObject();
        // 是否提供校验身份信息
        dto.put("need_check_info", "T");
        // 允许的最小买家年龄
        dto.put("min_age", "12");
        // 是否强制校验付款人身份信息
        dto.put("fix_buyer", "F");

        return dto;
    }

    private static JSON getPayerCheckWx() {
        JSONObject dto = new JSONObject();
        // 指定支付者
        dto.put("limit_payer", "ADULT");
        // 微信实名验证
        dto.put("real_name_flag", "Y");

        return dto;
    }

    private static JSON getPersonPayer() {
        JSONObject dto = new JSONObject();
        // 姓名
        dto.put("name", "张三");
        // 证件类型
        dto.put("cert_type", "IDENTITY_CARD");
        // 证件号
        dto.put("cert_no", "Mc5pjf+b/Keyi/t/wnHJtJYPHd1xXntq6tau0j8SjLzJx+q2xL2mOmKRDAYHu4uY1JSoPbWBhq9b7gT7Kxb1CYnkj7vmSlTYl8tVKfOPFyauOE66ew9cmkhmUzjzVTM1quoR63pP8+ESvZZrRPFE4YY9PXO9It9JINo8bjX22fQEFZKmXaEcqnSDcl2LUuJguvQ0LejI6zbxCJhfSHbz7HhHTIZTUchkWpKoy8YlfG27FumjXHU3rIjbrgmc+8pXbyndTNlui1+lTu6deibGKq/CpShA8z5FkHsn6/1O9ZEjLcnPnSLUwCnu75UlVVk66g+hR1OGdRrFMfYQnK7Lzw==");
        // 手机号
        dto.put("mobile", "15012345678");

        return dto;
    }

    private static String getBizInfo() {
        JSONObject dto = new JSONObject();
        // 付款人验证（支付宝）
        dto.put("payer_check_ali", getPayerCheckAli());
        // 付款人验证（微信）
        dto.put("payer_check_wx", getPayerCheckWx());
        // 个人付款人信息
        dto.put("person_payer", getPersonPayer());

        return dto.toJSONString();
    }

}
