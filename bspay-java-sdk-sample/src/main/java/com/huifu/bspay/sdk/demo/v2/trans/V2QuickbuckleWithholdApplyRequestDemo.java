package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2QuickbuckleWithholdApplyRequest;

/**
 * 代扣绑卡申请 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2QuickbuckleWithholdApplyRequest.class)
public class V2QuickbuckleWithholdApplyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2QuickbuckleWithholdApplyRequest request = new V2QuickbuckleWithholdApplyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付Id
        request.setHuifuId("6666000003078984");
        // 返回地址
        request.setReturnUrl("http://www.huifu1234.com/");
        // 用户id
        request.setOutCustId("16666000106789536");
        // 绑卡订单号
        request.setOrderId("20230525081932677893621");
        // 绑卡订单日期
        request.setOrderDate("20230525");
        // 银行卡号
        request.setCardId("ZSSW+34A2soLbwLQ5SkZJO4Azy6BknTGkk6EYDTbGA+G0v+zcF3TnU4iYH171KB4ReLjJlY+hSy8MvgVbAx7dL9V7LvLFJd8RE+Lp6XKiIbVUCA1wd2Otp2jI2D32z5gUFqUbB4clRZyRyltXV3xmAWH4fLZDER3H+QwC0/UNF4=");
        // 银行卡开户姓名 
        request.setCardName("H12ShtAyV4I4sOQqbISH4eMQUcmzpYOHggxRcXhxNoForh5qLyFgDrsSTn0nnepnPO8okfZYSWQlWIBzsRyyHYwAk94s2sO2Sz/6q4Jg2xDieeGDGrnrAphc8/OAN2OK8dMdbQzL12MvPQU/GX148MCxJzGvvdRFqTEPRLOLXTs=");
        // 银行卡绑定证件类型 
        request.setCertType("00");
        // 银行卡绑定身份证
        request.setCertId("FviSPp2Xv6QYfRSYRZcouGAz4BvfZRS9nFKI/7daIUtn4JmBVMTDtrqKLCWeoY7WP4hQAz3rptjOe8WsuynRG3kQhBsXZB0v6e1X1+POD5FXVojquKQb1BF5tKlaOqTj/+G62URC3SWui26JzQQmjGhCORXXHFD7PPNJKusYhHI=");
        // 银行卡绑定手机号 
        request.setCardMp("GmMLD+v2Mfc/vr9HOVFKOon3Dl4Q9cjze21X902G8Dnl2/2rpH8wpJUnufoYnI0nR9D2XkOm0ApOJL3ShiZxgLvnTaKrTDjRdrBJexhXbbhbfDx/2x+ZULvZHOEjzRI21tK2WKUzxDhX/lw/iXMjslKNVYlQ7as/aH5bLipf12g=");
        // CVV2信用卡代扣专用 需要密文传输，需要密文传输，使用汇付RSA公钥加密(加密前64位，加密后最长2048位），参见[参考文档](https://paas.huifu.com/partners/guide/#/api_jiami_jiemi)；
        request.setVipCode("HOVFKOon3Dl4Q9cjze21X902G8Dnl2LvLFJd8RE+Lp6XKiIbVUCA1wd2Otp2jI2D32z5gUFqUbB4clRZyRyltXV3xmAWH4fLZDER3H+YwAk94s2sO2Sz/6q4Jg2xDieesO2Sz/6q4Jg2xDieeGDGbQzL12MvPQU/GX14xJzGvvd=");
        // 卡有效期 信用卡代扣专用，格式：MMYY 需要密文传输，使用汇付RSA公钥加密(加密前64位，加密后最长2048位），参见[参考文档](https://paas.huifu.com/partners/guide/#/api_jiami_jiemi)；
        request.setExpiration("IUtn4JmBVMTDtrqKLCWeoY7WP4hQAz3rptjOe8WsuySW+34SkZJO4Azy6BknTGkk6EA2soLbwLQ5SkZJO4Azy6BknTGkk6EX902G8Dnl2/2rpH8wpJUnufoYnI0nR9YDTbGA+G0v+ApOJL3ShiZxgLvnTaKrnU4iYH171KB4=");
        // 个人证件有效期类型
        request.setCertValidityType("0");
        // 个人证件有效期起始日
        request.setCertBeginDate("20140504");
        // 个人证件有效期到期日长期有效不填.格式：YYYYMMDD；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20450112&lt;/font&gt;
        request.setCertEndDate("20260504");
        // 卡的借贷类型
        // request.setDcType("test");

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
        extendInfoMap.put("expire_time", "15");
        // 设备信息域
        extendInfoMap.put("trx_device_info", getTrxDeviceInfo());
        // 风控信息
        extendInfoMap.put("risk_info", getRiskInfo());
        return extendInfoMap;
    }

    private static JSON getTrxDeviceInfo() {
        JSONObject dto = new JSONObject();
        // 银行预留手机号
        dto.put("trx_mobile_num", "15556622368");
        // 设备类型
        dto.put("trx_device_type", "1");
        // 交易设备IP
        dto.put("trx_device_ip", "10.10.0.1");
        // 交易设备MAC
        dto.put("trx_device_mac", "10.10.0.1");
        // 交易设备IMEI
        dto.put("trx_device_imei", "030147441006000182623");
        // 交易设备IMSI
        dto.put("trx_device_imsi", "030147441006000182623");
        // 交易设备ICCID
        dto.put("trx_device_icc_id", "030147441006000182623");
        // 交易设备WIFIMAC
        dto.put("trx_device_wfifi_mac", "030147441006000182623");
        // 交易设备GPS
        dto.put("trx_device_gps", "030147441006000182623");

        return dto;
    }

    private static String getRiskInfo() {
        JSONObject dto = new JSONObject();
        // IP类型
        dto.put("ip_type", "04");
        // IP值
        dto.put("source_ip", "192.168.1.2");
        // 设备标识
        dto.put("device_id", "123");
        // 设备类型
        dto.put("device_type", "1");
        // 银行预留手机号
        dto.put("mobile", "13778787106");

        return dto.toJSONString();
    }

}
