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
        request.setTerminalDeviceData(get0cb9901c063146159d7a806331eb313d());
        // 安全信息条件必填，当为银行大额支付时可不填，jsonObject格式
        request.setRiskCheckData(getC912c5b3F45e4eb5A7cf3acae7215dc3());

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
        // extendInfoMap.put("acct_split_bunch", get18a433263b5a4564Bb6b0413c84ff21d());
        // 备注
        // extendInfoMap.put("remark", "");
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        // 补贴支付信息
        // extendInfoMap.put("combinedpay_data", getB433aee155d6443eAe81F124df5ee516());
        // 大额转账支付账户信息数据
        // extendInfoMap.put("bank_info_data", getB3bf7acb5626425aB0bf32bd5fb389a7());
        return extendInfoMap;
    }

    private static JSON get6973815f508e4f2392720a95415fbd76() {
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

    private static String get18a433263b5a4564Bb6b0413c84ff21d() {
        JSONObject dto = new JSONObject();
        // 分账信息列表
        // dto.put("acct_infos", get6973815f508e4f2392720a95415fbd76());

        return dto.toJSONString();
    }

    private static String get0cb9901c063146159d7a806331eb313d() {
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

    private static String getC912c5b3F45e4eb5A7cf3acae7215dc3() {
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

    private static String getB433aee155d6443eAe81F124df5ee516() {
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

    private static String getB3bf7acb5626425aB0bf32bd5fb389a7() {
        JSONObject dto = new JSONObject();
        // 银行编号
        // dto.put("bank_code", "");
        // 付款方账户类型
        // dto.put("card_acct_type", "");

        return dto.toJSONString();
    }

}
