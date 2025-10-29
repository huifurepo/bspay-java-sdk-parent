package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2WalletCreateRequest;

/**
 * 钱包开户 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2WalletCreateRequest.class)
public class V2WalletCreateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2WalletCreateRequest request = new V2WalletCreateRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000107309462");
        // 个人姓名钱包账户开户人的本人真实姓名；wallet_type&#x3D;1时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：张三&lt;/font&gt;
        request.setName("张三");
        // 钱包绑定手机号
        request.setMobileNo("DezMPeP4zos5Y5ltOuuXBaJ7WshobdsrWiNDaWRdIcrUWoF4S8HXlm7bXkuC92nxWMHS2iw2qs3bBbKibS3BcVYFAwPZXyFr+LRFVcfskWSVnBU97JA3ARUbMmGKPqAOwp0I1S0ybtDdhQUodgjtUrAGWHUObzx0Qw0hhU/0ZEnfOV4HNrXGTmI1+z4JDubi07wJ1NsB5XDb62U3ops2aJUVNSWwzzFQnHu6YJG9wgc40PeJYxZNJXzSh0WaLOhxWFeAzpz4Fe+D0xYB9cigB6DKM51YkO0oTk28Xz5TuPJzmSz3Nl36wWVruekAamrv0W7o0PqmPOIOQIyqc8bfOw==");
        // 手机短信验证码
        request.setVerifyCode("244372");
        // 短信验证流水号
        request.setVerifySeqId("WALLET0000000054024905");
        // 跳转地址
        request.setFrontUrl("https://www.huifu.com/products-services/");

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
        // 请求失效时间
        extendInfoMap.put("time_expired", "30");
        // 钱包类型
        extendInfoMap.put("wallet_type", "1");
        // 电子邮箱
        extendInfoMap.put("email", "123@huifu.com");
        // 实名验证信息
        extendInfoMap.put("real_name_veri_info", get3613c586Fd964505Bd3b2800414cdda9());
        // 风险验证方式
        extendInfoMap.put("risk_check_type", "2");
        // 是否开通免密支付
        extendInfoMap.put("encryption_free_flag", "Y");
        // 单笔支付免密额度
        extendInfoMap.put("encryption_free_quota", "100.00");
        // 单日支付免密次数
        extendInfoMap.put("encryption_free_times", "5");
        // 异步通知地址
        extendInfoMap.put("notify_url", "https://bspay-stag.cloudpnr.com/sw/manager/callback/store");
        return extendInfoMap;
    }

    private static String getDf164c15A52847d9A0181e4daef79b30() {
        JSONObject dto = new JSONObject();
        // 银行预留手机号
        dto.put("trx_mobile_num", "13771817106");
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

    private static String get7a7acd703a074a32A9efF955346fbeb3() {
        JSONObject dto = new JSONObject();
        // IP类型
        dto.put("ip_type", "04");
        // IP值
        dto.put("source_ip", "10.10.0.1");
        // 设备标识
        dto.put("device_id", "030147441006000182623");
        // 设备类型
        dto.put("device_type", "");
        // 银行预留手机号
        dto.put("mobile", "13771817106");

        return dto.toJSONString();
    }

    private static String get7d399beb4ea64062Bdd8D448e1526d07() {
        JSONObject dto = new JSONObject();
        // 银行卡号
        dto.put("card_no", "Fihn3upMcPZThzo60j6zj8NJmmqSTc/dWUQGo5VaF/+BZHUNKUDPqd++rVhS18on4bNMKv7k8tUBlWUS8caZLdKhrouE5WvYlYGkWZZfArol0XUOftwryGdBL/YY7q1DyDBCe6VV9ZZTRb17BTTQrV8whfiVXSo1LKjLS4jesm182OJSmz5fZ3RB6MlpT1PmQWQjh/GEaOAV3isF0N314Y2Sp5WNanekXd4uaOXVX8MIecL/ykAZjp4gOgzOMm5gQo/JR3mrbcv7+ifL2+4SXXeSkH2fkuplGGZjEKUZOAvTGL9WN+VlZspVp+H5QJ+LiBw/4Hdti1eiNVCf2U3EqA==");
        // 银行卡绑定手机号
        dto.put("card_mobile", "AWWRBrehFsnxJgaxHH3WMH9wMpwT6rIVIRyenCU5VAe3l2oKI5u5VUXGChUu2XYNaI5chBzLatH1hepwkKjLUXccaNZ1v2SSttOhVBX3J8eLGQ8aHtrbeQMetIglC+6yH+dg7MBRYtSJQT/hB8x/EB68394BHe6vDHDbJly4HFc3jy2ScJVwfNtrtEKeckSK3id2x/qSLtMNAl/QYc/CEQ4QBVFJzKvIPAUooaXMOmtbQrP9QNyDeXDfe9w1+Q3q0No6+m6hgRNkPTP92RnYVzqXf8TaXm7KCQg+Gj3B6dX0bxqoJ6gMvFZOR/Aq5MXvvbYZMyRYgOWO/YFsfdJdUg==");
        // 身份证照片人像面首次绑定银行卡时，需上传身份证照片。文件类型：F40  &lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        dto.put("cert_img_portrait", "57cc7f00-600a-33ab-b614-6221bbf2e529");
        // 身份证照片国徽面首次绑定银行卡时，需上传身份证照片。文件类型：F41  &lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        dto.put("cert_img_emblem", "57cc7f00-600a-33ab-b614-6221bbf2e530");
        // 设备信息域
        dto.put("trx_device_info", getDf164c15A52847d9A0181e4daef79b30());
        // 银行卡类型
        dto.put("dc_type", "D");
        // 风控信息
        dto.put("risk_info", get7a7acd703a074a32A9efF955346fbeb3());

        return dto.toJSONString();
    }

    private static String get3613c586Fd964505Bd3b2800414cdda9() {
        JSONObject dto = new JSONObject();
        // 个人证件类型
        dto.put("cert_type", "00");
        // 个人证件号码
        dto.put("cert_no", "Jv9/zMKdL3r50MQsQxvsq1rhm45P1Fv/sS8Hvp5XsMV+/lSI10onYqUFGbyv5AWrktbG+EUa6oe6/+0gbDQrFHCuGR2VAUpFPxWbQmQqQbT2x3aWcqpXS/9szoFILe7y7QC2ggwzwxE5sY7T/sCGDvpbbNo7ROZkosKUrGN3WWG81hcOLuAXhmB9qezUCuXzlejbt2RGWYsKz4Kdr+15zPakPr6jaF8ay8VXhFhEmdTPp51Z/nuuXXk6qbsmTU/e4+HUCY2v8By/XSybdie299fD/vHUK/gyvZLiG1t/WYsnvPLDnbhmxkRWEYXYMxijaQxOF7ZAqM7NyfVythO0ag==");
        // 证件有效期开始日期
        dto.put("cert_begin_date", "20230426");
        // 证件有效期类型
        dto.put("cert_validity_type", "0");
        // 开户人职业支付账户必填，填入钱包开户人的职业信息。枚举值：1A:各类专业,技术人员1B:国家机关,党群组织,企事业单位的负责人1C:办事人员和有关人员1D:商业工作人员1E:服务性工作人员1F:农林牧渔劳动者1G:生产工作,运输工作和部分体力劳动者1H:不便分类的其他劳动者&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1A&lt;/font&gt;
        dto.put("occupation", "1A");
        // 开户人地址支付账户必填，填入钱包开户人的地址信息。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：上海市徐汇区宜山路699号&lt;/font&gt;
        dto.put("address", "上海市徐汇区桂林路");
        // 证件有效期结束日期
        dto.put("cert_end_date", "20230626");
        // 钱包绑定卡信息
        dto.put("bind_card_info", get7d399beb4ea64062Bdd8D448e1526d07());

        return dto.toJSONString();
    }

}
