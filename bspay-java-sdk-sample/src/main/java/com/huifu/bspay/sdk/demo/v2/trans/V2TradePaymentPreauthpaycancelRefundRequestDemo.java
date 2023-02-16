package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePaymentPreauthpaycancelRefundRequest;

/**
 * 微信支付宝预授权完成撤销 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePaymentPreauthpaycancelRefundRequest.class)
public class V2TradePaymentPreauthpaycancelRefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePaymentPreauthpaycancelRefundRequest request = new V2TradePaymentPreauthpaycancelRefundRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 客户号
        request.setHuifuId("6666000108854952");
        // 原预授权完成交易请求日期
        request.setOrgReqDate("20221031");
        // 完成撤销金额
        request.setOrdAmt("0.02");
        // 风控信息
        request.setRiskCheckInfo(getRiskCheckInfo());

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
        // 原预授权完成交易请求流水号
        extendInfoMap.put("org_req_seq_id", "20211667205111");
        // 交易发起时间
        extendInfoMap.put("send_time", "312321321321");
        // 商品描述
        extendInfoMap.put("good_desc", "商户描述商户描述商户描述商户描述商户描述");
        // 是否人工介入
        extendInfoMap.put("is_manual_process", "Y");
        // 备注
        extendInfoMap.put("remark", "商户描述商户描述商户描述商户描述商户描述");
        // 汇付机具号
        extendInfoMap.put("devs_id", "SPINTP366061800405501");
        // 商户操作员号
        // extendInfoMap.put("mer_oper_id", "");
        // 批次号
        // extendInfoMap.put("batch_id", "");
        // 扩展域
        // extendInfoMap.put("mer_priv", "");
        // 设备信息
        extendInfoMap.put("terminal_device_info", getTerminalDeviceInfo());
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        return extendInfoMap;
    }

    private static String getRiskCheckInfo() {
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

    private static JSON getTerminalDeviceInfo() {
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

        return dto;
    }

}
