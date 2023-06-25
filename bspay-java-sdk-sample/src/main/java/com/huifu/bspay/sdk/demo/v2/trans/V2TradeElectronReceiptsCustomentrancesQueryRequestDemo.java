package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeElectronReceiptsCustomentrancesQueryRequest;

/**
 * 查询小票自定义入口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeElectronReceiptsCustomentrancesQueryRequest.class)
public class V2TradeElectronReceiptsCustomentrancesQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeElectronReceiptsCustomentrancesQueryRequest request = new V2TradeElectronReceiptsCustomentrancesQueryRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000103334211");

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
        // 票据信息
        extendInfoMap.put("receipt_data", getReceiptDataRucan());
        return extendInfoMap;
    }

    private static JSON getWxReceiptDataRucan() {
        JSONObject dto = new JSONObject();
        // 品牌ID
        dto.put("brand_id", "11");

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
