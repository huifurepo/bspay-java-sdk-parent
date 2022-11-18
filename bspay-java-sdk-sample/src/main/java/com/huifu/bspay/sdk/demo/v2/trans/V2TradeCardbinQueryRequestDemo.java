package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeCardbinQueryRequest;

/**
 * 卡bin信息查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeCardbinQueryRequest.class)
public class V2TradeCardbinQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeCardbinQueryRequest request = new V2TradeCardbinQueryRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 银行卡号密文
        request.setBankCardNoCrypt("b9LE5RccVVLChrHgo9lvpLB1XIyJlEeETa1APmkRQ35z06zJ8zD7cnqypNSnA8iK3uAYVDJtCfrz1Hqu1qTCdu5eVWkjBYaAUtuy1ZD4HkEkqbY9/z5lN4jdDyF8xlzonfxhxzm3OM1fWRoYl39Te+pW71ag0SSbQGu6yhWzFD9mBllbj2RR5fWm9BZVtJTLmitIO/HZfirXkRiCPHBjosQJm2bCrVSuzxqJgqmB9Cp1ADIB+f7fG1/G8RElkJ5zyqhDyinlB5b2+fy3hoyuPqB44GCSLEeOF8V0C9uMNNVor1DwvPRLYleNSw43lW4mFx4PhWhjKrWg2NPfbe0mkQ==");

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

}
