package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePaymentPreauthcancelRefundRequest;

/**
 * 微信支付宝预授权撤销 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePaymentPreauthcancelRefundRequest.class)
public class V2TradePaymentPreauthcancelRefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePaymentPreauthcancelRefundRequest request = new V2TradePaymentPreauthcancelRefundRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 客户号
        request.setHuifuId("6666000108854952");
        // 原交易请求日期
        request.setOrgReqDate("20221031");
        // 撤销金额
        request.setOrdAmt("0.02");
        // 风控信息
        request.setRiskCheckInfo(getBa2f25bc65d74cb3988e7e446466b598());

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
        extendInfoMap.put("out_ord_Id", "");
        // 原授权号
        extendInfoMap.put("org_auth_no", "");
        // 原交易请求流水号
        extendInfoMap.put("org_req_seq_id", "");
        // 原预授权全局流水号
        extendInfoMap.put("pre_auth_hf_seq_id", "0029000topB221031162644P959c0a8305400000");
        // 批次号
        extendInfoMap.put("batch_id", "");
        // 商品描述
        extendInfoMap.put("good_desc", "");
        // 备注
        extendInfoMap.put("remark", "");
        // 交易发起时间
        extendInfoMap.put("send_time", "");
        // 是否人工介入
        extendInfoMap.put("is_manual_process", "Y");
        // 汇付机具号
        extendInfoMap.put("devs_id", "SPINTP366020000360401");
        // 商户操作员号
        // extendInfoMap.put("mer_oper_id", "");
        // 扩展域
        // extendInfoMap.put("mer_priv", "");
        // 设备信息
        extendInfoMap.put("terminal_device_info", get79fb2f88C61b423e8bd8B4696ecef9d7());
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        return extendInfoMap;
    }

    private static String getBa2f25bc65d74cb3988e7e446466b598() {
        JSONObject dto = new JSONObject();
        // 基站地址
        dto.put("base_station", "192.168.1.1");
        // ip地址
        dto.put("ip_addr", "192.168.1.1");
        // 纬度
        dto.put("latitude", "33.3");
        // 经度
        dto.put("longitude", "33.3");

        return dto.toJSONString();
    }

    private static String get79fb2f88C61b423e8bd8B4696ecef9d7() {
        JSONObject dto = new JSONObject();
        // 交易设备GPS
        dto.put("device_gps", "192.168.0.0");
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
        dto.put("devs_id", "SPINTP366061800405501");
        // 操作员号
        dto.put("mer_oper_id", "");
        // 逻辑终端号
        dto.put("pnr_dev_id", "");

        return dto.toJSONString();
    }

}
