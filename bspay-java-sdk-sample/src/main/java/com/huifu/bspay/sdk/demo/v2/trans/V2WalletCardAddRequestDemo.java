package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2WalletCardAddRequest;

/**
 * 新增绑定卡 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2WalletCardAddRequest.class)
public class V2WalletCardAddRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2WalletCardAddRequest request = new V2WalletCardAddRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000103423237");
        // 钱包用户ID
        request.setUserHuifuId("6666000103423833");
        // 跳转地址
        request.setFrontUrl("https://www.huifu.com/products-services/");
        // 设备信息域
        // request.setTrxDeviceInfo (getBbe177cf039a4567A0891ce62fea3820());

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
        extendInfoMap.put("time_expired", "");
        // 钱包绑定卡信息
        // extendInfoMap.put(" bind_card_info", getBd56beb5B3424befBeff624685462a90());
        // 密码页面类型
        extendInfoMap.put("request_type", "M");
        // 异步通知地址
        extendInfoMap.put("notify_url", "https://bspay-stag.cloudpnr.com/sw/manager/callback/store");
        // 风控信息
        // extendInfoMap.put("risk_info ", get52dc979d32ba4938Be366011f7b0b5ff());
        return extendInfoMap;
    }

    private static String getBd56beb5B3424befBeff624685462a90() {
        JSONObject dto = new JSONObject();
        // 银行卡号
        // dto.put("card_no", "test");
        // 银行卡绑定手机号
        // dto.put("card_mobile", "test");
        // CVV2银联卡类型为&quot;C&quot;信用卡时，该字段必传。需要密文传输，请参考[加密解密说明](https://paas.huifu.com/open/doc/guide/#/api_jiami_jiemi)使用汇付RSA公钥加密。  &lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：17BTTQrV8whfiVXSo1LKjLS4jesm182OJSmz5fZ3&lt;/font&gt;
        // dto.put("vip_code", "test");
        // 卡有效期银联卡类型为&quot;C&quot;信用卡时，该字段必传。格式：MMYY。 &lt;br/&gt;需要密文传输，使用汇付RSA公钥加密(加密前4位，加密后99999）需要密文传输，请参考[加密解密说明](https://paas.huifu.com/open/doc/guide/#/api_jiami_jiemi)使用汇付RSA公钥加密。  &lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：5TuPJzmSz3Nl36wWVruekAamrv0W7o0PqmPOIOQIyq&lt;/font&gt;
        // dto.put("expiration", "test");
        // 身份证照片人像面首次绑定银行卡时，需上传身份证照片。文件类型：F40  &lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        // dto.put("cert_img_portrait", "test");
        // 身份证照片国徽面首次绑定银行卡时，需上传身份证照片。文件类型：F41  &lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        // dto.put("cert_img_emblem", "test");
        // 银行卡类型
        // dto.put("dc_type", "");

        return dto.toJSONString();
    }

    private static String getBbe177cf039a4567A0891ce62fea3820() {
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

    private static String get52dc979d32ba4938Be366011f7b0b5ff() {
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
