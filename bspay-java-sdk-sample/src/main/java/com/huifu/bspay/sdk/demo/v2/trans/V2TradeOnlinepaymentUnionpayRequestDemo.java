package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeOnlinepaymentUnionpayRequest;

/**
 * 银联统一在线收银台 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeOnlinepaymentUnionpayRequest.class)
public class V2TradeOnlinepaymentUnionpayRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeOnlinepaymentUnionpayRequest request = new V2TradeOnlinepaymentUnionpayRequest();
        // 商户号
        request.setHuifuId("6666000109133323");
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 订单金额
        request.setTransAmt("0.11");
        // 商品描述
        request.setOrderDesc("通用性商品1");
        // 安全信息
        request.setRiskCheckData(get24cac05aE51448a1960b54ff953dcaf2());
        // 三方支付数据jsonObject；pay_scene为云闪付公众号与云闪付小程序时必填
        // request.setThirdPayData(get7945798a32654321Bea45a70676268d8());

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
        // 卡号锁定标识
        extendInfoMap.put("card_number_lock", "");
        // 直通模式的银行标识
        extendInfoMap.put("ebank_en_abbr", "");
        // 交易银行卡卡号
        extendInfoMap.put("pay_card_no", "");
        // 支付卡类型
        // extendInfoMap.put("pay_card_type", "");
        // 订单失效时间
        extendInfoMap.put("time_expire", "");
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", get4629873c1e2342f689ccE0172d96371f());
        // 前端跳转地址
        extendInfoMap.put("front_url", "https://www.service.com/getresp");
        // 异步通知地址
        extendInfoMap.put("notify_url", "https://www.service.com/getresp");
        // 备注
        extendInfoMap.put("remark", "merPriv11");
        // 支付场景
        // extendInfoMap.put("pay_scene", "");
        // 签约令牌号
        // extendInfoMap.put("sign_token_no", "");
        // 延时标记
        extendInfoMap.put("delay_acct_flag", "Y");
        return extendInfoMap;
    }

    private static JSON get10d0f278Ee0e4dedB75b4d7f64376944() {
        JSONObject dto = new JSONObject();
        // 分账金额
        // dto.put("div_amt", "");
        // 分账接收方ID
        // dto.put("huifu_id", "");
        // 账户号
        // dto.put("acct_id", "");
        // 分账百分比%
        // dto.put("percentage_div", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get4629873c1e2342f689ccE0172d96371f() {
        JSONObject dto = new JSONObject();
        // 分账明细
        // dto.put("acct_infos", get10d0f278Ee0e4dedB75b4d7f64376944());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static String get24cac05aE51448a1960b54ff953dcaf2() {
        JSONObject dto = new JSONObject();
        // 基站地址
        dto.put("base_station", "7");
        // ip地址
        dto.put("ip_addr", "172.28.52.52");
        // 纬度
        dto.put("latitude", "4");
        // 经度
        dto.put("longitude", "3");

        return dto.toJSONString();
    }

    private static String get7945798a32654321Bea45a70676268d8() {
        JSONObject dto = new JSONObject();
        // 小程序id
        // dto.put("app_id", "");

        return dto.toJSONString();
    }

}
