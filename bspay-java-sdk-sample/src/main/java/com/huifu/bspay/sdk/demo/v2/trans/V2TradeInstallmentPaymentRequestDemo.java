package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeInstallmentPaymentRequest;

/**
 * 分期支付 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeInstallmentPaymentRequest.class)
public class V2TradeInstallmentPaymentRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeInstallmentPaymentRequest request = new V2TradeInstallmentPaymentRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000100000000");
        // 交易金额
        request.setTransAmt("100.00");
        // 分期数
        request.setInstallmentNum("3");
        // 商品描述
        request.setGoodsDesc("手机");
        // 安全信息
        request.setRiskCheckData(getRiskCheckData());
        // 京东白条分期信息trans_type&#x3D;JDBT时，必填jsonObject字符串，京东白条分期相关信息通过该参数集上送
        request.setJdbtData(getJdbtData());

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
        // 账户号
        // extendInfoMap.put("acct_id", "");
        // 交易类型
        // extendInfoMap.put("trans_type", "");
        // 支付场景
        // extendInfoMap.put("pay_scene", "");
        // 交易有效期
        extendInfoMap.put("time_expire", "20241008235959");
        // 手续费扣款标志
        // extendInfoMap.put("fee_flag", "");
        // 延时标识
        // extendInfoMap.put("delay_acct_flag", "");
        // 备注
        extendInfoMap.put("remark", "备注");
        // 异步通知地址
        extendInfoMap.put("notify_url", "https://www.baidu.com/onlineAsync");
        // 分账对象
        extendInfoMap.put("acct_split_bunch", getAcctSplitBunch());
        return extendInfoMap;
    }

    private static JSON getAcctInfosRc() {
        JSONObject dto = new JSONObject();
        // 商户号
        dto.put("huifu_id", "6666000100000000");
        // 分账金额
        dto.put("div_amt", "");
        // 分账百分比
        dto.put("percentage_div", "70.00");
        // 账户号
        dto.put("acct_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getAcctSplitBunch() {
        JSONObject dto = new JSONObject();
        // 百分比分账标志
        dto.put("percentage_flag", "Y");
        // 是否净值分账
        dto.put("is_clean_split", "N");
        // 分账明细
        dto.put("acct_infos", getAcctInfosRc());

        return dto.toJSONString();
    }

    private static String getRiskCheckData() {
        JSONObject dto = new JSONObject();
        // 经度
        dto.put("longitude", "126.630128");
        // 纬度
        dto.put("latitude", "126.630128");
        // 基站地址
        dto.put("base_station", "3");
        // IP地址
        dto.put("ip_addr", "182.33.21.4");

        return dto.toJSONString();
    }

    private static String getJdbtData() {
        JSONObject dto = new JSONObject();
        // 商品数量
        dto.put("goods_num", "3");
        // 下单来源
        dto.put("order_source", "微信APP扫一扫");
        // 请求来源类型
        dto.put("order_source_type", "H5");
        // 同步通知页面
        dto.put("callback_url", "https://www.baidu.com");

        return dto.toJSONString();
    }

}
