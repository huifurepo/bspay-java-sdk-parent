package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2QuickbuckleApplyRequest;

/**
 * 快捷绑卡申请接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2QuickbuckleApplyRequest.class)
public class V2QuickbuckleApplyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2QuickbuckleApplyRequest request = new V2QuickbuckleApplyRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 汇付客户Id
        request.setHuifuId("6666000109133323");
        // 商户用户id
        request.setOutCustId("6666000150648142");
        // 订单号
        request.setOrderId("20220408105303542461831");
        // 订单日期
        request.setOrderDate("20220408");
        // 银行卡号
        request.setCardId("VDFveDULoK6qhWuN34P8XF7tuZow4eg74zEPKjNVwSjQTW572jqmYjpRDbEtX0f56hMQUfFv5wFRjvDIY+yTl+SFKgBmoNlPDm9B3mDjOa8er5FEnI5QWgvyuqSxHWJf2eIjU7OHt3q3/0ZsbetNzIAiaAZdicn9Sawsr9yZ8ZOdBmhIPO5tqJyDkoKO5Tpj0VyZMJ5ugSDx/2XGSmX3dHQ1JKlZ/7rovB+WchA9BzZQzSTcvmmdV6mzuyTPWRzxfhyVPAVLzh5XhKyl6SMKmzOM1zSNMPtzDhTaUG4XLSM5A0+Tqt3O4tSi16f5zn2csgwbN6TMd5jrXNzC8UTpdQ==");
        // 银行卡开户姓名
        request.setCardName("dj1TYq2WxbX8ti/7QjuSCqYKzCusdDe/+1wIVx23iFvxMcxkiV0rUK8Hc1PTw4H+qy+6RkgDh06ZNH4EXmYpl/AhfSjyMlSgF1O1YR4/WvKzRciwo1FvEOtRU6X0isOjA+NA+lv4A7ejGTtJP3dyam0j/IsOYlOriT8aGtBgfsTw+Dc+e3coZ3iCTP0Iwk6fC/BSs/GpM7H21qcXR9OyewIgSQnU5PaV/TKTaCxtLZM+6xf8Cuulg/LK5Jth3pzEkLrY+eziftxd2jCn5E7a3pyRHVD4d5VeQZQ9kF87JFjWKhMTAOVV7znXE0hutZP124UNN48FgAyAEZa+k4fWfg==");
        // 银行卡绑定证件类型
        request.setCertType("00");
        // 银行卡绑定身份证
        request.setCertId("OLOxrl809XmVIMmPRTIyIpJHxi4HFMJNmxGz1nhZAtps9xPEVDysU3UZPBZfsNFLFcXEMENPsJ+tymbYt42dNQ+76hyEtx+qz0BQhU8SKV8H5itrI4kaXpaJf+sV8OewrJkhDidPdz01vqMEDQRhaMnNwl8snHZxDdpu7HVUz5JwsLYfBbZP2Q4CZpVWS3NunQahZ8zHQ+8EhvYVH1vE7f/M6nJt1/4GoHz9C/UnuYudV0S2uBhlywbX+YkRGNMl/oz5+UNeMDA2jqhtTreSD4+w7S82L53rqKsAbosodOPo4OAMZk4/0QOH5LDbqFByVM97mzHfw7z+Tx/dsXJ8QQ==");
        // 个人证件有效期类型
        request.setCertValidityType("1");
        // 个人证件有效期起始日
        request.setCertBeginDate("20210806");
        // 个人证件有效期到期日长期有效不填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20420905&lt;/font&gt;
        request.setCertEndDate("20410806");
        // 银行卡绑定手机号
        request.setCardMp("fD4awMK+JdxQi+Qzl1xgJbgq4jlNTKFSKlts2C9hJhFbu0J6K7mHmViRh5wG3bDdYAKbKEAz+Uzd1xyEeYZsFNi3jQgu8gRv5sTsjHZHYIbvvq1ju2nLXrzq8kTzVXnWRXB0oHxy6EnN2xuvaC3mT89sW5BND09J7qy+Va3Y/t1nTqz4oEE5qL+TTjm6Fv6BY8ac/T2mKaeHtN27Ufj4hmJnGTtcTuoS0uQ6bEksQiTHwK2QG7EBMInnoYiJD15cAPwQeR0xmZNAwEXehtxvIAAfFpAiLqe/2G9whSyoT/BlsrhYf+958bis856dTm6Lf6nAVjQbNvh6Iyhdu7H1Rw==");
        // CVV2信用卡交易专用需要密文传输。&lt;br/&gt;使用汇付RSA公钥加密(加密前3位，加密后最长2048位），[参见参考文档](https://paas.huifu.com/partners/guide/#/api_jiami_jiemi)；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：Ly+fnExeyPOTzfOtgRRur77nJB9TAe4PGgK9M……fc6XJXZss&#x3D;&lt;/font&gt;
        // request.setVipCode("test");
        // 卡有效期信用卡交易专用，格式：MMYY，需要密文传输；&lt;br/&gt;使用汇付RSA公钥加密(加密前4位，加密后最长2048位），[参见参考文档](https://paas.huifu.com/partners/guide/#/api_jiami_jiemi)；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：Ly+fnExeyPOTzfOtgRRur77nJB9TAe4PGgK9M……fc6XJXZss&#x3D;JXZss&#x3D;&lt;/font&gt;
        // request.setExpiration("test");
        // 挂网协议编号授权信息(招行绑卡需要上送)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：34463343&lt;/font&gt;
        // request.setProtocolNo("test");
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
        // 电子邮箱
        extendInfoMap.put("email", "changliang.wang@huifu.com");
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
        // dto.put("trx_device_mac", "test");
        // 交易设备IMEI
        // dto.put("trx_device_imei", "test");
        // 交易设备IMSI
        // dto.put("trx_device_imsi", "test");
        // 交易设备ICCID
        // dto.put("trx_device_icc_id", "test");
        // 交易设备WIFIMAC
        // dto.put("trx_device_wfifi_mac", "test");
        // 交易设备GPS
        // dto.put("trx_device_gps", "test");

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
