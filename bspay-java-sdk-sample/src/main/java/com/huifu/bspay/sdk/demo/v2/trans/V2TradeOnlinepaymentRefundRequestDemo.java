package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeOnlinepaymentRefundRequest;

/**
 * 线上交易退款 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeOnlinepaymentRefundRequest.class)
public class V2TradeOnlinepaymentRefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeOnlinepaymentRefundRequest request = new V2TradeOnlinepaymentRefundRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 退款金额
        request.setOrdAmt("0.01");
        // 设备信息条件必填，当为银行大额支付时可不填，jsonObject格式
        request.setTerminalDeviceData(get3875e406Fbd34508A04a334eb92da82a());
        // 安全信息条件必填，当为银行大额支付时可不填，jsonObject格式
        request.setRiskCheckData(getE8e44aaf76484b72B83fE1c7f081b40b());

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
        // 原交易请求日期
        extendInfoMap.put("org_req_date", "20240401");
        // 原交易全局流水号
        extendInfoMap.put("org_hf_seq_id", "");
        // 原交易请求流水号
        extendInfoMap.put("org_req_seq_id", "295700155481522176");
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", get3c0b1469C829446a816d42c76304b250());
        // 备注
        // extendInfoMap.put("remark", "");
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        // 补贴支付信息
        // extendInfoMap.put("combinedpay_data", get4865eb8f0a3045f9B9ecE003a27b7391());
        // 大额转账支付账户信息数据
        // extendInfoMap.put("bank_info_data", getAd211f65098943119bdbC070a9366c76());
        return extendInfoMap;
    }

    private static JSON getAcc12f300d964c559afdD701a3fad84f() {
        JSONObject dto = new JSONObject();
        // 商户号
        // dto.put("huifu_id", "test");
        // 支付金额
        // dto.put("div_amt", "");
        // 账户号
        // dto.put("acct_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get3c0b1469C829446a816d42c76304b250() {
        JSONObject dto = new JSONObject();
        // 分账信息列表
        // dto.put("acct_infos", getAcc12f300d964c559afdD701a3fad84f());

        return dto.toJSONString();
    }

    private static String get3875e406Fbd34508A04a334eb92da82a() {
        JSONObject dto = new JSONObject();
        // 交易设备ip
        dto.put("device_ip", "172.31.31.145");
        // 设备类型
        dto.put("device_type", "1");
        // 交易设备gps
        dto.put("device_gps", "07");
        // 交易设备iccid
        dto.put("device_icc_id", "05");
        // 交易设备imei
        dto.put("device_imei", "02");
        // 交易设备imsi
        dto.put("device_imsi", "03");
        // 交易设备mac
        dto.put("device_mac", "01");
        // 交易设备wifimac
        dto.put("device_wifi_mac", "06");

        return dto.toJSONString();
    }

    private static String getE8e44aaf76484b72B83fE1c7f081b40b() {
        JSONObject dto = new JSONObject();
        // 经度
        // dto.put("longitude", "test");
        // 纬度
        // dto.put("latitude", "test");
        // 基站地址
        // dto.put("base_station", "test");
        // ip地址
        dto.put("ip_addr", "172.1.1.1");

        return dto.toJSONString();
    }

    private static String get4865eb8f0a3045f9B9ecE003a27b7391() {
        JSONObject dto = new JSONObject();
        // 补贴方汇付编号
        // dto.put("huifu_id", "test");
        // 补贴方类型
        // dto.put("user_type", "test");
        // 补贴方账户号
        // dto.put("acct_id", "test");
        // 补贴金额
        // dto.put("amount", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getAd211f65098943119bdbC070a9366c76() {
        JSONObject dto = new JSONObject();
        // 银行编号
        // dto.put("bank_code", "");
        // 付款方账户类型
        // dto.put("card_acct_type", "");

        return dto.toJSONString();
    }

}
