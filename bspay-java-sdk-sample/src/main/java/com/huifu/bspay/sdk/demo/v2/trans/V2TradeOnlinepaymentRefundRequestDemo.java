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
        request.setTerminalDeviceData(get3ba8cd4255da4c76A5a60100bb3040ff());
        // 安全信息条件必填，当为银行大额支付时可不填，jsonObject格式
        request.setRiskCheckData(get6a7f1ffdEf724ff0A6765874e1e91420());

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
        // extendInfoMap.put("acct_split_bunch", get7f63f0d677364d0eB8649895a46917a5());
        // 备注
        // extendInfoMap.put("remark", "");
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        // 补贴支付信息
        // extendInfoMap.put("combinedpay_data", get87e4d75491d645cf979c17fe801e6149());
        // 大额转账支付账户信息数据
        // extendInfoMap.put("bank_info_data", get74759bdbA37549d1B0ee19208bf9bfa9());
        // 是否垫资
        // extendInfoMap.put("loan_flag", "");
        // 垫资承担者
        // extendInfoMap.put("loan_undertaker", "");
        // 垫资账户类型
        // extendInfoMap.put("loan_acct_type", "");
        return extendInfoMap;
    }

    private static JSON get64dd7d8a7c1a4f868adeF0c135e59ab8() {
        JSONObject dto = new JSONObject();
        // 商户号
        // dto.put("huifu_id", "test");
        // 支付金额
        // dto.put("div_amt", "");
        // 账户号
        // dto.put("acct_id", "");
        // 垫资金额
        // dto.put("part_loan_amt", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get7f63f0d677364d0eB8649895a46917a5() {
        JSONObject dto = new JSONObject();
        // 分账信息列表
        // dto.put("acct_infos", get64dd7d8a7c1a4f868adeF0c135e59ab8());

        return dto.toJSONString();
    }

    private static String get3ba8cd4255da4c76A5a60100bb3040ff() {
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
        // 终端设备号
        // dto.put("device_id", "");

        return dto.toJSONString();
    }

    private static String get6a7f1ffdEf724ff0A6765874e1e91420() {
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

    private static String get87e4d75491d645cf979c17fe801e6149() {
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

    private static String get74759bdbA37549d1B0ee19208bf9bfa9() {
        JSONObject dto = new JSONObject();
        // 银行编号
        // dto.put("bank_code", "test");
        // 付款方账户类型
        // dto.put("card_acct_type", "test");

        return dto.toJSONString();
    }

}
