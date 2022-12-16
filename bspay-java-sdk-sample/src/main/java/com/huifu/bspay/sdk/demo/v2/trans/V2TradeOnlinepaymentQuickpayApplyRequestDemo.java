package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeOnlinepaymentQuickpayApplyRequest;

/**
 * 快捷支付申请 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeOnlinepaymentQuickpayApplyRequest.class)
public class V2TradeOnlinepaymentQuickpayApplyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeOnlinepaymentQuickpayApplyRequest request = new V2TradeOnlinepaymentQuickpayApplyRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000119640000");
        // 订单金额
        request.setTransAmt("1980.00");
        // 绑卡id
        request.setCardBindId("10032850000");
        // 异步通知地址
        request.setNotifyUrl("http://tianyi.demo.test.cn/core/extend/BsPaySdk/notify_quick.php");
        // 用户客户号
        request.setUserHuifuId("6666000121370000");
        // 安全信息
        request.setRiskCheckData(getRiskCheckData());
        // 设备数据
        request.setTerminalDeviceData(getTerminalDeviceData());
        // 银行扩展字段
        request.setExtendPayData(getExtendPayData());

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
        // 订单类型
        // extendInfoMap.put("order_type", "");
        // 备注
        // extendInfoMap.put("remark", "");
        // 订单失效时间
        // extendInfoMap.put("time_expire", "");
        // 营销补贴信息
        // extendInfoMap.put("combinedpay_data", getCombinedpayData());
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", getAcctSplitBunchRucan());
        return extendInfoMap;
    }

    private static String getCombinedpayData() {
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

    private static String getTerminalDeviceData() {
        JSONObject dto = new JSONObject();
        // 交易设备ip
        dto.put("device_ip", "106.33.180.238");
        // 设备类型
        dto.put("device_type", "1");
        // 交易设备gps
        // dto.put("device_gps", "");
        // 交易设备iccid
        // dto.put("device_icc_id", "");
        // 交易设备imei
        // dto.put("device_imei", "");
        // 交易设备imsi
        // dto.put("device_imsi", "");
        // 交易设备mac
        // dto.put("device_mac", "");
        // 交易设备wifimac
        // dto.put("device_wifi_mac", "");

        return dto.toJSONString();
    }

    private static String getRiskCheckData() {
        JSONObject dto = new JSONObject();
        // ip地址
        dto.put("ip_addr", "106.33.180.238");
        // 基站地址
        // dto.put("base_atation", "");
        // 纬度
        // dto.put("latitude", "");
        // 经度
        // dto.put("longitude", "");

        return dto.toJSONString();
    }

    private static JSON getAcctInfos() {
        JSONObject dto = new JSONObject();
        // 分账金额
        // dto.put("div_amt", "");
        // 被分账方ID
        // dto.put("huifu_id", "");
        // 账户号
        // dto.put("acct_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getExtendPayData() {
        JSONObject dto = new JSONObject();
        // 业务种类
        // dto.put("biz_tp", "test");
        // 商品简称
        // dto.put("goods_short_name", "test");
        // 网关支付受理渠道
        dto.put("gw_chnnl_tp", "99");

        return dto.toJSONString();
    }

    private static String getAcctSplitBunchRucan() {
        JSONObject dto = new JSONObject();
        // 分账信息列表
        // dto.put("acct_infos", getAcctInfos());

        return dto.toJSONString();
    }

}
