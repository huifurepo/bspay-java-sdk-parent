package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantAtpreventApplyRequest;

/**
 * 防断链入驻 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantAtpreventApplyRequest.class)
public class V2MerchantAtpreventApplyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantAtpreventApplyRequest request = new V2MerchantAtpreventApplyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户汇付Id
        request.setHuifuId("6666000108460751");

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
        // 异步通知地址
        extendInfoMap.put("async_url", "http://service.example.com/to/path");
        // 微信开通明细
        extendInfoMap.put("wx_open_list", get4ee5a21dCd974031Aaff86bc6a77ad6e());
        // 支付宝开通明细
        extendInfoMap.put("ali_open_list", getAf3f6e6aB58f47f99761E0107d9733be());
        return extendInfoMap;
    }

    private static JSON get4ee5a21dCd974031Aaff86bc6a77ad6e() {
        JSONObject dto = new JSONObject();
        // 渠道号
        dto.put("pay_channel_id", "10000001");
        // 线上开通数
        dto.put("online_open_count", "1");
        // 线下开通数
        dto.put("offline_open_count", "1");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON getAf3f6e6aB58f47f99761E0107d9733be() {
        JSONObject dto = new JSONObject();
        // 渠道号
        dto.put("pay_channel_id", "10000001");
        // 线上开通数
        dto.put("online_open_count", "1");
        // 线下开通数
        dto.put("offline_open_count", "1");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

}
