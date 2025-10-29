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
        request.setRiskCheckData(get72948c317e164ae79d4a93cef8895c95());
        // 三方支付数据jsonObject&lt;br/&gt;pay_scene&#x3D;U_JSAPI或pay_scene&#x3D;U_MINIAPP时，必填
        // request.setThirdPayData(getE6adb6f3591a41ec9c6137c27ca2398d());

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
        // 手续费扣款标志
        // extendInfoMap.put("fee_flag", "");
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", get938f9796E5bd4f85A4cf2ce4a306837d());
        // 设备信息数据
        // extendInfoMap.put("terminal_device_data", get86e6396a54f5492cB3b06678723bed4b());
        return extendInfoMap;
    }

    private static JSON get0aa0431065074e9f92016d99005ce03e() {
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

    private static String get938f9796E5bd4f85A4cf2ce4a306837d() {
        JSONObject dto = new JSONObject();
        // 分账明细
        // dto.put("acct_infos", get0aa0431065074e9f92016d99005ce03e());
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");

        return dto.toJSONString();
    }

    private static String get72948c317e164ae79d4a93cef8895c95() {
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

    private static String getE6adb6f3591a41ec9c6137c27ca2398d() {
        JSONObject dto = new JSONObject();
        // 小程序id
        // dto.put("app_id", "");

        return dto.toJSONString();
    }

    private static String get86e6396a54f5492cB3b06678723bed4b() {
        JSONObject dto = new JSONObject();
        // 终端设备号
        // dto.put("device_id", "test");

        return dto.toJSONString();
    }

}
