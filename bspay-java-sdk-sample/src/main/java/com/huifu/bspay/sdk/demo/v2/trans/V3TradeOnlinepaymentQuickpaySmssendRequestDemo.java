package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V3TradeOnlinepaymentQuickpaySmssendRequest;

/**
 * 快捷短信发送 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V3TradeOnlinepaymentQuickpaySmssendRequest.class)
public class V3TradeOnlinepaymentQuickpaySmssendRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V3TradeOnlinepaymentQuickpaySmssendRequest request = new V3TradeOnlinepaymentQuickpaySmssendRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 用户客户号
        request.setUserHuifuId("6666000149909053");
        // 绑卡id
        request.setCardBindId("10049847200");
        // 订单金额
        request.setTransAmt("10.00");
        // 异步通知地址
        request.setNotifyUrl("http://tianyi.demo.test.cn/core/extend/BsPaySdk/notify_quick.php");
        // 网联数据
        // request.setNuccData(getA552c831Cd0846b8830f0ce1be990e53());
        // 设备数据
        request.setTerminalDeviceData(getEb10401d27a0468aA840Fd020391c341());
        // 安全信息
        request.setRiskCheckData(getBe09da814577476eA71c6d47f2fac2ac());

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
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", get0fda4a7803b94a2fB5f17a083f8b015f());
        // 是否延迟交易
        // extendInfoMap.put("delay_acct_flag", "");
        // 账户号
        // extendInfoMap.put("acct_id", "");
        // 手续费扣款标志
        // extendInfoMap.put("fee_flag", "");
        // 补贴支付信息
        // extendInfoMap.put("combinedpay_data", get79bd2ee956e844ee8bb65e2f3ebf8096());
        return extendInfoMap;
    }

    private static JSON getAdfb77e661f444deB2ddF0631bb7f4d4() {
        JSONObject dto = new JSONObject();
        // 分账接收方ID
        // dto.put("huifu_id", "test");
        // 分账金额
        // dto.put("div_amt", "");
        // 账户号
        // dto.put("acct_id", "");
        // 分账百分比%
        // dto.put("percentage_div", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get0fda4a7803b94a2fB5f17a083f8b015f() {
        JSONObject dto = new JSONObject();
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 是否净值分账
        // dto.put("is_clean_split", "");
        // 分账信息列表，Array格式
        // dto.put("acct_infos", getAdfb77e661f444deB2ddF0631bb7f4d4());

        return dto.toJSONString();
    }

    private static String getA552c831Cd0846b8830f0ce1be990e53() {
        JSONObject dto = new JSONObject();
        // 商品简称
        // dto.put("goods_short_name", "test");
        // 网关支付受理渠道
        // dto.put("gw_chnnl_tp", "test");
        // 业务种类
        // dto.put("biz_tp", "test");

        return dto.toJSONString();
    }

    private static String getEb10401d27a0468aA840Fd020391c341() {
        JSONObject dto = new JSONObject();
        // 设备类型
        dto.put("device_type", "1");
        // 交易设备ip
        dto.put("device_ip", "106.33.180.238");
        // 交易设备mac
        // dto.put("device_mac", "");
        // 交易设备imei
        // dto.put("device_imei", "");
        // 交易设备imsi
        // dto.put("device_imsi", "");
        // 交易设备iccid
        // dto.put("device_icc_id", "");
        // 交易设备wifimac
        // dto.put("device_wifi_mac", "");
        // 交易设备gps
        // dto.put("device_gps", "");

        return dto.toJSONString();
    }

    private static String getBe09da814577476eA71c6d47f2fac2ac() {
        JSONObject dto = new JSONObject();
        // ip地址
        dto.put("ip_addr", "106.33.180.238");
        // 基站地址
        // dto.put("base_station", "");
        // 纬度
        // dto.put("latitude", "");
        // 经度
        // dto.put("longitude", "");

        return dto.toJSONString();
    }

    private static String get79bd2ee956e844ee8bb65e2f3ebf8096() {
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

}
