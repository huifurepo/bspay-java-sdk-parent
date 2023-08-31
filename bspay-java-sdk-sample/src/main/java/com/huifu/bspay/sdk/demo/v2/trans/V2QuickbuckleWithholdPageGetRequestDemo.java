package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2QuickbuckleWithholdPageGetRequest;

/**
 * 代扣绑卡页面版 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2QuickbuckleWithholdPageGetRequest.class)
public class V2QuickbuckleWithholdPageGetRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2QuickbuckleWithholdPageGetRequest request = new V2QuickbuckleWithholdPageGetRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付Id
        request.setHuifuId("6666000103422897");
        // 订单号
        request.setOrderId("SAS20230807102136898274149");
        // 订单日期
        request.setOrderDate("20230807");

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
        // 页面有效期
        extendInfoMap.put("expire_time", "20");
        // 页面跳转地址
        extendInfoMap.put("return_url", "https://api.huifu.com");
        // 客户用户号
        extendInfoMap.put("out_cust_id", "Q837467382819");
        // 用户汇付号
        extendInfoMap.put("user_huifu_id", "6666000107386236");
        // 异步通知地址
        extendInfoMap.put("notify_url", "https://api.huifu.com");
        // 设备信息域
        extendInfoMap.put("trx_device_info", getTrxDeviceInfo());
        // 风控信息
        extendInfoMap.put("risk_info", getRiskInfo());
        return extendInfoMap;
    }

    private static String getTrxDeviceInfo() {
        JSONObject dto = new JSONObject();
        // 银行预留手机号
        dto.put("trx_mobile_num", "13428722321");
        // 设备类型
        dto.put("trx_device_type", "1");
        // 交易设备IP
        dto.put("trx_device_ip", "192.168.1.1");
        // 交易设备MAC
        dto.put("trx_device_mac", "10.10.0.1");
        // 交易设备IMEI
        dto.put("trx_device_imei", "imei");
        // 交易设备IMSI
        dto.put("trx_device_imsi", "imsi");
        // 交易设备ICCID
        dto.put("trx_device_icc_id", "icc");
        // 交易设备WIFIMAC
        dto.put("trx_device_wfifi_mac", "wfifi");
        // 交易设备GPS
        dto.put("trx_device_gps", "gps");

        return dto.toJSONString();
    }

    private static String getRiskInfo() {
        JSONObject dto = new JSONObject();
        // IP类型
        dto.put("ip_type", "04");
        // IP值
        dto.put("source_ip", "1.1.1.1");
        // 设备标识
        dto.put("device_id", "");
        // 设备类型
        dto.put("device_type", "");
        // 银行预留手机号
        dto.put("mobile", "");

        return dto.toJSONString();
    }

}
