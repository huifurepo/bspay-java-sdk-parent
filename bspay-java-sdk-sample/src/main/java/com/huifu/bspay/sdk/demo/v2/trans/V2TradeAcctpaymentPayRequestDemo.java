package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeAcctpaymentPayRequest;

/**
 * 余额支付 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeAcctpaymentPayRequest.class)
public class V2TradeAcctpaymentPayRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeAcctpaymentPayRequest request = new V2TradeAcctpaymentPayRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000018344461");
        // 出款方商户号
        request.setOutHuifuId("6666000018344461");
        // 支付金额
        request.setOrdAmt("0.01");
        // 分账对象
        request.setAcctSplitBunch(getAcctSplitBunch());
        // 安全信息
        request.setRiskCheckData(getRiskCheckData());

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
        // 商品描述
        extendInfoMap.put("good_desc", "");
        // 备注
        extendInfoMap.put("remark", "");
        // 是否延迟交易
        extendInfoMap.put("delay_acct_flag", "");
        // 设备信息
        extendInfoMap.put("terminal_device_data", getTerminalDeviceData());
        return extendInfoMap;
    }

    private static String getTerminalDeviceData() {
        JSONObject dto = new JSONObject();
        // 设备类型
        dto.put("device_type", "1");
        // 交易设备IP
        dto.put("device_ip", "10.10.0.1");
        // 交易设备MAC
        dto.put("device_mac", "");
        // 交易设备GPS
        dto.put("device_gps", "");
        // 交易设备IMEI
        dto.put("device_imei", "");
        // 交易设备IMSI
        dto.put("device_imsi", "");
        // 交易设备ICCID
        dto.put("device_icc_id", "");
        // 交易设备WIFIMAC
        dto.put("device_wifi_mac", "");

        return dto.toJSONString();
    }

    private static String getAcctSplitBunch() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", getAcctInfos());

        return dto.toJSONString();
    }

    private static String getRiskCheckData() {
        JSONObject dto = new JSONObject();
        // 转账原因
        dto.put("transfer_type", "04");
        // 产品子类
        dto.put("sub_product", "1");
        // 纬度
        dto.put("latitude", "");
        // 经度
        dto.put("longitude", "");
        // 基站地址
        dto.put("base_atation", "");
        // IP地址
        dto.put("ip_addr", "");

        return dto.toJSONString();
    }

    private static JSON getAcctInfos() {
        JSONObject dto = new JSONObject();
        // 分账金额
        dto.put("div_amt", "0.01");
        // 被分账方ID
        dto.put("huifu_id", "6666000018344461");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

}
