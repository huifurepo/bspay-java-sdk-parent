package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2QuickbuckleOnekeyCardbindRequest;

/**
 * 一键绑卡 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2QuickbuckleOnekeyCardbindRequest.class)
public class V2QuickbuckleOnekeyCardbindRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2QuickbuckleOnekeyCardbindRequest request = new V2QuickbuckleOnekeyCardbindRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付Id
        request.setHuifuId("6666000109133323");
        // 顾客用户号 
        request.setOutCustId("6666000150648142");
        // 银行号
        request.setBankId("01050000");
        // 银行卡开户姓名 
        request.setCardName("eWXk+x2M4XaCIc4Iu4etjyhnFQ7V+tFfdED6YYJJ5G55ElXs9fxi+JM7mcC7ASWQDVi6asQqSdbRfFFVDNv80HGYHa/59aFmeshMeoQHO2vqkwNfNGV5Pk305v1H+MVzkj0LVuxab1a0+O6Vz4QBwySA/2UbPL4CAw0tPxaNpCqGxZN78Esy6snVlShUW+FH1jRJCHDIOhJpcWw9/ijTBksQNojIqokGeCpQThyigBVa6P55X90N7l077vTeBbFCfRMoLdQP8XrTJbke1r3dRlrPh8UNi+ryJloEeK2hfp30njbcEjFu0lVPAF6bNqmAq6IN0pgww+Ra/UtuNDhWFA==");
        // 银行卡绑定身份证
        request.setCertId("WLUrnJN6/uaYbSTiVSCeMeYFgLLWdDHAPvz1yiHZdFeImh070m3sxDOW/fiWrNAL0crePQFN3svX+kpmPCri53mB5/IvSpqZapftUC9/0FdkzlOT7KTeyIcDoP4BiqJdHhfJFwf0oyX6meAmYJPZAuvs+OsW6wGi/ckFND+sHcDy3Zc6n6qHxv1Z+wcDzVkOeH2zkjaubbBTzGlpZQ2CnsMKmAh8jfuY7tj6GDQyp65MLL64Po3e5LUr4KRYwWlLgi1uB29kLJCTmdRzrVbOh+7RfMHVgjciyM7/6qFQrvNOgcnl4hWfk45FZFpbhM1aj+GrecgCiTwvxHuHx86R3g==");
        // 银行卡绑定证件类型
        request.setCertType("00");
        // 证件有效期到期日长期有效不填.格式：yyyyMMdd。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20311111&lt;/font&gt;
        request.setCertEndDate("20370121");
        // 银行卡绑定手机号 
        request.setCardMp("fD4awMK+JdxQi+Qzl1xgJbgq4jlNTKFSKlts2C9hJhFbu0J6K7mHmViRh5wG3bDdYAKbKEAz+Uzd1xyEeYZsFNi3jQgu8gRv5sTsjHZHYIbvvq1ju2nLXrzq8kTzVXnWRXB0oHxy6EnN2xuvaC3mT89sW5BND09J7qy+Va3Y/t1nTqz4oEE5qL+TTjm6Fv6BY8ac/T2mKaeHtN27Ufj4hmJnGTtcTuoS0uQ6bEksQiTHwK2QG7EBMInnoYiJD15cAPwQeR0xmZNAwEXehtxvIAAfFpAiLqe/2G9whSyoT/BlsrhYf+958bis856dTm6Lf6nAVjQbNvh6Iyhdu7H1Rw==");
        // 卡的借贷类型
        request.setDcType("D");
        // 异步请求地址
        request.setAsyncReturnUrl("http://192.168.85.157:30031/sspm/testVirgo");
        // 设备信息域
        request.setTrxDeviceInf(getTrxDeviceInf());

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
        // 证件有效期类型
        extendInfoMap.put("cert_validity_type", "0");
        // 证件有效期起始日
        extendInfoMap.put("cert_begin_date", "20170121");
        // 挂网协议编号
        extendInfoMap.put("protocol_no", "");
        // 风控信息
        // extendInfoMap.put("risk_info", getRiskInfo());
        // 回调页面地址
        // extendInfoMap.put("verify_front_url", "");
        return extendInfoMap;
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
        // 应用提供方账户ID
        // dto.put("account_id_hash", "");
        // 银行预留手机号
        // dto.put("mobile", "");

        return dto.toJSONString();
    }

    private static String getTrxDeviceInf() {
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

        return dto.toJSONString();
    }

}
