package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2QuickbuckleConfirmRequest;

/**
 * 快捷绑卡确认接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2QuickbuckleConfirmRequest.class)
public class V2QuickbuckleConfirmRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2QuickbuckleConfirmRequest request = new V2QuickbuckleConfirmRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 汇付商户Id
        request.setHuifuId("6666000003078984");
        // 用户id
        request.setOutCustId("6666000103633622");
        // 订单号
        request.setOrderId("20220408105303542461831");
        // 订单日期
        request.setOrderDate("20220408");
        // 银行卡号
        request.setCardId("Ly+fnExeyPOTzfOtgRRur77nJB9TAe4PGgK9MB96o3LW2xINIxSA+B1jXDyvKNmJ5iE3wL+bbNoGd6tQXn6fmrY4vgeX8diCtP0PQVyS4UZkXzH4w8twgI+FduIukqTTl7o5/rrnL3H1HaP/Vutw3yBWrGq0l0NTebfc6XJXZss=");
        // 银行卡开户姓名
        request.setCardName("CDszEs+NOr7m3rh7qJhciqMN4mP1yXJtwXX6HFzBJ3rwJYUxSXFEv4f6AAQychfVPB2BgZeEoK6gtjrTPfv4G3SHqoow0Way6kdsGZYmXotcq1TFmmL+QKJSAhE4tl+vs69wCHh/l4X+Rxp4AyDK7zb8XG1GWOZOwshU/SOUukM=");
        // 银行卡绑定证件类型
        request.setCertType("00");
        // 银行卡绑定身份证
        request.setCertId("EXDKKVOSFZCFyB5p7VWlYYH+M1Y2dg9PzVBtX9LqF3w4NWtWg/id+XTFtLuC2ntaflB9ioohwPUuiSg/mp15MKV86u7/DPT84DuM/NTOTRS/ajO8rJ1ERhtyRxT5czJWGbpysQOBA+msxOjIG5k0MkP18nZDhpg07HoGArjmp08=");
        // 银行卡绑定手机号
        request.setCardMp("Qb6AcD/EaT0gKP7d2ercByeTw2oe5loZayPuKEzQi75nZKxCyJPoIvUHTvFLRqpLDNzkpvy/aAg6xvbsw1WXdKYWB15D9LpCnYQ7qHw16IjfnPA4FDR3CE5h+nU6lGoJDj+hNRkn3y73aCeNpp5E//uDKJdjrJv6ciACf4lofAo=");
        // 验证码
        request.setVerifyCode("111111");
        // CVV2信用卡代扣专用需要密文传输，使用汇付RSA公钥加密(加密前3位，加密后最长2048位），[参见参考文档](https://paas.huifu.com/partners/guide/#/api_jiami_jiemi)；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：Ly+fnExeyPOTzf……rGq0l0NTebfc6XJXZss&#x3D;&lt;/font&gt;
        request.setVipCode("BndOZvPCXIMcRJi1uCkw4DiNHht+KkARa+sbKbiLh4cXhjywxYM8GMl7g1a5cc1aD2PD6rVvnGzhhgpJ8mzeb/gbzNcYbU5hEXJZm5HShghGucQJB/SoqCIlyaWlz3hnclaGzznWJa5qNa50mCxVqX4zbpuGPWXv+8AnYTu8/Vk=");
        // 卡有效期信用卡代扣专用，格式：MMYY，需要密文传输。&lt;br/&gt;使用汇付RSA公钥加密(加密前4位，加密后最长2048位），[参见参考文档](https://paas.huifu.com/partners/guide/#/api_jiami_jiemi)；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：Ly+fnExeyPO……ebfc6XJXZss&#x3D;&lt;/font&gt;
        // request.setExpiration("test");
        // 设备信息域 
        // request.setTrxDeviceInf(getTrxDeviceInf());

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
        // 商户名称
        extendInfoMap.put("merch_name", "测试");
        // 验卡流水号
        extendInfoMap.put("trans_id", "20220408105303542461831");
        // 卡的借贷类型
        // extendInfoMap.put("dc_type", "");
        // 风控信息
        // extendInfoMap.put("risk_info", getRiskInfo());
        return extendInfoMap;
    }

    private static String getTrxDeviceInf() {
        JSONObject dto = new JSONObject();
        // 银行预留手机号
        // dto.put("trx_mobile_num", "test");
        // 设备类型
        // dto.put("trx_device_type", "test");
        // 交易设备IP
        // dto.put("trx_device_ip", "test");
        // 交易设备MAC
        // dto.put("trx_device_mac", "");
        // 交易设备IMEI
        // dto.put("trx_device_imei", "");
        // 交易设备IMSI
        // dto.put("trx_device_imsi", "");
        // 交易设备ICCID
        // dto.put("trx_device_icc_id", "");
        // 交易设备WIFIMAC
        // dto.put("trx_device_wfifi_mac", "");
        // 交易设备GPS
        // dto.put("trx_device_gps", "");

        return dto.toJSONString();
    }

    private static String getRiskInfo() {
        JSONObject dto = new JSONObject();
        // IP类型
        // dto.put("ip_type", "test");
        // IP值
        // dto.put("source_ip", "test");
        // 设备标识
        // dto.put("device_id", "");
        // 设备类型
        // dto.put("device_type", "");
        // 银行预留手机号
        // dto.put("mobile", "");

        return dto.toJSONString();
    }

}
