package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeElectronReceiptsUploadRequest;

/**
 * 上传电子小票图片 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeElectronReceiptsUploadRequest.class)
public class V2TradeElectronReceiptsUploadRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeElectronReceiptsUploadRequest request = new V2TradeElectronReceiptsUploadRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户汇付Id
        request.setHuifuId("6666000103334211");
        // 原请求日期
        request.setOrgReqDate("20230517");
        // 原请求流水号原请求流水号、原交易返回的全局流水号至少要送其中一项；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：2021091708126665001&lt;/font&gt;
        request.setOrgReqSeqId("20230517111710E83514");
        // 汇付全局流水号原请求流水号、原交易返回的全局流水号至少要送其中一项；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：00290TOP1GR210919004230P853ac13262200000&lt;/font&gt;
        request.setOrgHfSeqId("0036000topB230517111710P034c0a8304100000");
        // 票据信息
        request.setReceiptData(getReceiptDataRucan());
        // 文件名称
        request.setFileName("电子小票1.jpg");
        // 图片内容
        request.setImageContent("/9j/4AAQSkZJRgABAQAASABIAUAf//Z……");

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
        return extendInfoMap;
    }

    private static JSON getMerchantContactInformation() {
        JSONObject dto = new JSONObject();
        // 商户售后咨询电话
        // dto.put("consultation_phone_number", "");

        return dto;
    }

    private static JSON getWxReceiptDataRucan() {
        JSONObject dto = new JSONObject();
        // 商户与商家的联系渠道
        dto.put("merchant_contact_information", getMerchantContactInformation());

        return dto;
    }

    private static String getReceiptDataRucan() {
        JSONObject dto = new JSONObject();
        // 三方通道类型
        dto.put("third_channel_type", "T");
        // 微信票据信息
        dto.put("wx_receipt_data", getWxReceiptDataRucan());

        return dto.toJSONString();
    }

}
