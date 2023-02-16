package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeOnlinepaymentBankingFrontpayRequest;

/**
 * 网银支付接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeOnlinepaymentBankingFrontpayRequest.class)
public class V2TradeOnlinepaymentBankingFrontpayRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeOnlinepaymentBankingFrontpayRequest request = new V2TradeOnlinepaymentBankingFrontpayRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000108854952");
        // 订单金额
        request.setTransAmt("0.02");
        // 商品描述
        request.setGoodsDesc("网银支付下单");
        // 网联扩展数据
        request.setExtendPayData(getExtendPayData());
        // 设备信息
        request.setTerminalDeviceData(getTerminalDeviceData());
        // 安全信息
        request.setRiskCheckData(getRiskCheckData());
        // 异步通知地址
        request.setNotifyUrl("http://www.chinapnr.com");

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
        // 收款用户客户号
        extendInfoMap.put("user_huifu_id", "");
        // 收款汇付账户号
        extendInfoMap.put("acct_id", "");
        // 订单类型
        extendInfoMap.put("order_type", "P");
        // 卡类型
        extendInfoMap.put("card_type", "D");
        // 订单失效时间
        extendInfoMap.put("time_expire", "");
        // 网关支付类型
        extendInfoMap.put("gate_type", "01");
        // 付款方银行编号
        extendInfoMap.put("bank_id", "");
        // 延时标记
        extendInfoMap.put("delay_acct_flag", "N");
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", getAcctSplitBunchRucan());
        // 备注
        extendInfoMap.put("remark", "网银支付接口");
        // 页面跳转地址
        extendInfoMap.put("front_url", "http://www.chinapnr.com");
        return extendInfoMap;
    }

    private static String getExtendPayData() {
        JSONObject dto = new JSONObject();
        // 商品简称
        dto.put("goods_short_name", "011111");
        // 网关支付受理渠道
        dto.put("gw_chnnl_tp", "01");
        // 业务种类
        dto.put("biz_tp", "123451");

        return dto.toJSONString();
    }

    private static String getTerminalDeviceData() {
        JSONObject dto = new JSONObject();
        // 交易设备类型
        dto.put("device_type", "1");
        // 交易设备IP
        dto.put("device_ip", "127.0.0.1");
        // 交易设备MAC
        // dto.put("device_mac", "");
        // 交易终端设备IMEI
        // dto.put("device_imei", "");
        // 交易设备IMSI
        // dto.put("device_imsi", "");
        // 交易设备ICCID
        // dto.put("device_icc_id", "");
        // 交易设备WIFIMAC
        // dto.put("device_wifi_mac", "");
        // 交易设备GPS
        // dto.put("device_gps", "");

        return dto.toJSONString();
    }

    private static JSON getAcctInfos() {
        JSONObject dto = new JSONObject();
        // 分账金额
        // dto.put("div_amt", "");
        // 被分账方ID
        // dto.put("huifu_id", "");
        // 被分账户号
        // dto.put("acct_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getAcctSplitBunchRucan() {
        JSONObject dto = new JSONObject();
        // 分账明细
        // dto.put("acct_infos", getAcctInfos());

        return dto.toJSONString();
    }

    private static String getRiskCheckData() {
        JSONObject dto = new JSONObject();
        // ip地址
        dto.put("ip_addr", "1");
        // 基站地址
        // dto.put("base_atation", "");
        // 纬度
        dto.put("latitude", "3");
        // 经度
        dto.put("longitude", "4");

        return dto.toJSONString();
    }

}
