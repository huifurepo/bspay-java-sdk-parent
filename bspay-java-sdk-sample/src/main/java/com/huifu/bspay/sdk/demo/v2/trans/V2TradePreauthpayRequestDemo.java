package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePreauthpayRequest;

/**
 * 微信支付宝预授权完成 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePreauthpayRequest.class)
public class V2TradePreauthpayRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePreauthpayRequest request = new V2TradePreauthpayRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000108854952");
        // 原交易请求日期
        request.setOrgReqDate("20221031");
        // 交易金额
        request.setTransAmt("0.02");
        // 商品描述
        request.setGoodsDesc("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567");
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
        // 外部订单号
        extendInfoMap.put("out_ord_id", "12345678901234567890123456789012");
        // 原授权号
        extendInfoMap.put("org_auth_no", "");
        // 原预授权交易请求流水号
        extendInfoMap.put("org_req_seq_id", "");
        // 预授权汇付全局流水号
        extendInfoMap.put("pre_auth_hf_seq_id", "0029000topB221031163126P798c0a8305400000");
        // 备注
        extendInfoMap.put("remark", "123451111");
        // 批次号
        // extendInfoMap.put("batch_id", "");
        // 商户操作员号
        // extendInfoMap.put("mer_oper_id", "");
        // 扩展域
        // extendInfoMap.put("mer_priv", "");
        // 设备信息
        extendInfoMap.put("terminal_device_data", getTerminalDeviceData());
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        return extendInfoMap;
    }

    private static String getRiskCheckData() {
        JSONObject dto = new JSONObject();
        // 基站地址
        dto.put("base_station", "192.168.1.1");
        // ip地址
        dto.put("ip_addr", "180.167.105.130");
        // 纬度
        dto.put("latitude", "33.3");
        // 经度
        dto.put("longitude", "33.3");

        return dto.toJSONString();
    }

    private static String getTerminalDeviceData() {
        JSONObject dto = new JSONObject();
        // 商户终端序列号
        dto.put("app_version", "");
        // 交易设备GPS
        dto.put("device_gps", "");
        // 交易设备ICCID
        dto.put("device_icc_id", "");
        // 交易设备IMEI
        dto.put("device_imei", "");
        // 交易设备IMSI
        dto.put("device_imsi", "");
        // 交易设备IP
        dto.put("device_ip", "10.10.0.1");
        // 交易设备MAC
        dto.put("device_mac", "");
        // 设备类型
        dto.put("device_type", "1");
        // 交易设备WIFIMAC
        dto.put("device_wifi_mac", "");
        // 汇付机具号
        dto.put("devs_id", "");
        // ICCID
        dto.put("icc_id", "");
        // 商户终端实时经纬度信息
        dto.put("location", "+32.10520/+118.80593");
        // 商户交易设备IP
        dto.put("mer_device_ip", "");
        // 商户设备类型
        dto.put("mer_device_type", "01");
        // 移动国家代码
        dto.put("mobile_country_cd", "");
        // 移动网络号码
        dto.put("mobile_net_num", "");
        // 商户终端入网认证编号
        dto.put("network_license", "P3111");
        // 商户终端序列号
        dto.put("serial_num", "");

        return dto.toJSONString();
    }

}
