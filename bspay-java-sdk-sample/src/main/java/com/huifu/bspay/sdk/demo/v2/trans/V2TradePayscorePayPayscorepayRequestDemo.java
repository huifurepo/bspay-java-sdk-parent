package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePayscorePayPayscorepayRequest;

/**
 * 支付分扣款 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePayscorePayPayscorepayRequest.class)
public class V2TradePayscorePayPayscorepayRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePayscorePayPayscorepayRequest request = new V2TradePayscorePayPayscorepayRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000141569791");
        // 扣款登记创建请求流水号deduct_req_seq_id与deduct_hf_seq_id二选一；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：2022012614120615001&lt;/font&gt;
        request.setDeductReqSeqId("1726841301594394626");
        // 扣款登记返回的汇付全局流水号deduct_req_seq_id与deduct_hf_seq_id二选一；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：00470topo1A211015160805P090ac132fef00000&lt;/font&gt;
        // request.setDeductHfSeqId("test");
        // 微信扣款单号
        request.setOutTradeNo("03212311224952047516172");
        // 商品描述
        request.setGoodsDesc("bp充电");
        // 安全信息
        request.setRiskCheckData(get7b611856F3284acbB2b933e5277201fd());

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
        // 聚合反扫微信参数集合
        // extendInfoMap.put("wx_data", get26abfe33D15b4d88969eE4b82e981c40());
        // 是否延迟交易
        // extendInfoMap.put("delay_acct_flag", "");
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", getB4a7c01e8049417cBfaf23cca015476e());
        // 设备信息
        // extendInfoMap.put("terminal_device_info", get18bf806b138f41fb9eb85470b909b79b());
        // 交易备注
        // extendInfoMap.put("remark", "");
        // 商户回调地址
        // extendInfoMap.put("notify_url", "");
        return extendInfoMap;
    }

    private static String get26abfe33D15b4d88969eE4b82e981c40() {
        JSONObject dto = new JSONObject();
        // 子商户用户标识
        // dto.put("sub_openid", "test");
        // 子商户公众账号id
        // dto.put("sub_appid", "");
        // 用户标识
        // dto.put("openid", "");
        // 设备号
        // dto.put("device_info", "");

        return dto.toJSONString();
    }

    private static JSON get74fe15d7F3cf4781880dA528d270b475() {
        JSONObject dto = new JSONObject();
        // 分账金额
        // dto.put("div_amt", "test");
        // 分账接收方ID
        // dto.put("huifu_id", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getB4a7c01e8049417cBfaf23cca015476e() {
        JSONObject dto = new JSONObject();
        // 分账明细
        // dto.put("acct_infos", get74fe15d7F3cf4781880dA528d270b475());

        return dto.toJSONString();
    }

    private static String get7b611856F3284acbB2b933e5277201fd() {
        JSONObject dto = new JSONObject();
        // ip地址
        dto.put("ip_address", "127.0.0.1");
        // 基站地址
        // dto.put("base_station", "");
        // 纬度
        // dto.put("latitude", "");
        // 经度
        // dto.put("longitude", "");

        return dto.toJSONString();
    }

    private static String get18bf806b138f41fb9eb85470b909b79b() {
        JSONObject dto = new JSONObject();
        // 设备类型
        // dto.put("device_type", "");
        // 交易设备IP
        // dto.put("device_ip", "");
        // 交易设备MAC
        // dto.put("device_mac", "");
        // 交易设备IMEI
        // dto.put("device_imei", "");
        // 交易设备IMSI
        // dto.put("device_imsi", "");
        // 交易设备ICCID
        // dto.put("device_icc_id", "");
        // 交易设备WIFIMAC
        // dto.put("device_wifi_mac", "");
        // 交易设备GPS
        // dto.put("device_gps", "");
        // 商户终端应用程序版
        // dto.put("app_version", "");

        return dto.toJSONString();
    }

}
