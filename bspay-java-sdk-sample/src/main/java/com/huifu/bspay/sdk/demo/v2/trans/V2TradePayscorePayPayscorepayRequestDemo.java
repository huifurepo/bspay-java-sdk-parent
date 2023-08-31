package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePayscorePayPayscorepayRequest;

/**
 * 支付分扣款 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePayscorePayPayscorepayRequest.class)
public class V2TradePayscorePayPayscorepayRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePayscorePayPayscorepayRequest request = new V2TradePayscorePayPayscorepayRequest();
        // 微信扣款单号
        // request.setOutTradeNo("test");
        // 商品描述
        // request.setGoodsDesc("test");
        // 商户号
        request.setHuifuId("6666000108854952");
        // 安全信息
        // request.setRiskCheckData("test");

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
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", getAcctSplitBunch());
        // 扣款登记返回的汇付全局流水号
        // extendInfoMap.put("deduct_hf_seq_id", "");
        // 扣款登记创建请求流水号
        // extendInfoMap.put("deduct_req_seq_id", "");
        // 是否延迟交易
        // extendInfoMap.put("delay_acct_flag", "");
        // 商户回调地址
        // extendInfoMap.put("notify_url", "");
        // 交易备注
        // extendInfoMap.put("remark", "");
        // 请求日期
        extendInfoMap.put("req_date", DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        extendInfoMap.put("req_seq_id", SequenceTools.getReqSeqId32());
        // 设备信息
        // extendInfoMap.put("terminal_device_info", getTerminalDeviceInfo());
        // 聚合反扫微信参数集合
        // extendInfoMap.put("wx_data", getWxData());
        return extendInfoMap;
    }

    private static JSON getAcctInfos() {
        JSONObject dto = new JSONObject();
        // 分账金额
        // dto.put("div_amt", "test");
        // 分账商户号
        // dto.put("huifu_id", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getAcctSplitBunch() {
        JSONObject dto = new JSONObject();
        // 分账明细
        // dto.put("acct_infos", getAcctInfos());

        return dto.toJSONString();
    }

    private static String getTerminalDeviceInfo() {
        JSONObject dto = new JSONObject();
        // 设备类型
        // dto.put("device_type", "");
        // 交易设备IP
        // dto.put("device_ip", "");
        // 交易设备MAC
        // dto.put("device_mac", "");
        // 交易设备IMEI
        // dto.put("device_imei", "");
        // 交易设备IMSI
        // dto.put("device_imsi", "");
        // 交易设备ICCID
        // dto.put("device_icc_id", "");
        // 交易设备WIFIMAC
        // dto.put("device_wifi_mac", "");
        // 交易设备GPS
        // dto.put("device_gps", "");
        // 商户终端应用程序版
        // dto.put("app_version", "");

        return dto.toJSONString();
    }

    private static String getWxData() {
        JSONObject dto = new JSONObject();
        // 子商户公众账号id
        // dto.put("sub_appid", "");
        // 用户标识
        // dto.put("openid", "");
        // 子商户用户标识
        // dto.put("sub_openid", "");
        // 设备号
        // dto.put("device_info", "");

        return dto.toJSONString();
    }

}
