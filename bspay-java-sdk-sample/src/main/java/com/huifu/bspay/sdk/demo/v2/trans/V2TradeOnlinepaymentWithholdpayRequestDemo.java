package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeOnlinepaymentWithholdpayRequest;

/**
 * 代扣支付 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeOnlinepaymentWithholdpayRequest.class)
public class V2TradeOnlinepaymentWithholdpayRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeOnlinepaymentWithholdpayRequest request = new V2TradeOnlinepaymentWithholdpayRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000109812884");
        // 用户客户号
        request.setUserHuifuId("6666000109818115");
        // 绑卡id
        request.setCardBindId("10024597199");
        // 订单金额
        request.setTransAmt("0.01");
        // 商品描述
        request.setGoodsDesc("代扣test");
        // 代扣类型
        request.setWithholdType("2");
        // 银行扩展数据
        request.setExtendPayData(getExtendPayData());
        // 风控信息
        request.setRiskCheckData(getRiskCheckData());
        // 设备信息数据
        request.setTerminalDeviceData(getTerminalDeviceData());
        // 异步通知地址
        request.setNotifyUrl("http://www.chinapnr.com/");

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
        // 备注
        extendInfoMap.put("remark", "reamrk123");
        // 账户号
        // extendInfoMap.put("acct_id", "");
        // 订单失效时间
        extendInfoMap.put("time_expire", "20221212121212");
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", getAcctSplitBunch());
        return extendInfoMap;
    }

    private static JSON getAcctInfos() {
        JSONObject dto = new JSONObject();
        // 支付金额
        // dto.put("div_amt", "");
        // 商户号
        // dto.put("huifu_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON getAcctSplitBunch() {
        JSONObject dto = new JSONObject();
        // 分账信息列表
        // dto.put("acct_infos", getAcctInfos());

        return dto;
    }

    private static String getExtendPayData() {
        JSONObject dto = new JSONObject();
        // 业务种类
        dto.put("biz_tp", "012345");
        // 商品简称
        dto.put("goods_short_name", "看看");
        // 网关支付受理渠道
        // dto.put("gw_chnnl_tp", "test");

        return dto.toJSONString();
    }

    private static String getRiskCheckData() {
        JSONObject dto = new JSONObject();
        // 基站地址经纬度、基站地址、IP地址三组信息至少填写一组；&lt;br/&gt;【mcc】+【mnc】+【location_cd】+【lbs_num】&lt;br/&gt;- mcc:移动国家代码，460代表中国；3位长&lt;br/&gt;- mnc：移动网络号码；2位长；&lt;br/&gt;- location_cd：位置区域码，16进制，5位长&lt;br/&gt;- lbs_num：基站编号，16进制，5位长&lt;br/&gt;- 注意若位数不足用空格补足；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：460001039217563&lt;/font&gt;，460（mcc)， 00(mnc)，10392(location_cd)， 17563(lbs_num)
        dto.put("base_station", "");
        // ip地址经纬度、基站地址、IP地址三组信息至少填写一组；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：172.28.52.52&lt;/font&gt;
        dto.put("ip_addr", "192.168.1.1");
        // 纬度纬度整数位不超过2位，小数位不超过6位。格式为：+表示北纬，-表示南纬。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：+37.12&lt;/font&gt;；&lt;br/&gt;经纬度、基站地址、IP地址三组信息至少填写一组
        dto.put("latitude", "");
        // 经度经度整数位不超过3位，小数位不超过5位；格式为:+表示东经，-表示西经。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：-121.213&lt;/font&gt;；&lt;br/&gt;经纬度、基站地址、IP地址三组信息至少填写一组
        dto.put("longitude", "");

        return dto.toJSONString();
    }

    private static String getTerminalDeviceData() {
        JSONObject dto = new JSONObject();
        // 交易设备ip
        dto.put("device_ip", "172.31.31.145");
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

}
