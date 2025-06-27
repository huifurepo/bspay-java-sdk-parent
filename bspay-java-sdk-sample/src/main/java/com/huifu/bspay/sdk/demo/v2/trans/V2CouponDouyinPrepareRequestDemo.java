package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2CouponDouyinPrepareRequest;

/**
 * 抖音卡券校验 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2CouponDouyinPrepareRequest.class)
public class V2CouponDouyinPrepareRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2CouponDouyinPrepareRequest request = new V2CouponDouyinPrepareRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付商户号
        request.setHuifuId("6666000107767088");
        // 门店绑定流水号
        request.setBindId("88fd7c9b63e84a259dfe3eecb811fce8");

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
        // 抖音团购券码
        extendInfoMap.put("coupon_code", "5729740654");
        // 从二维码解析出来的标识（传参前需要先进行URL编码，注意不要有空格)
        // extendInfoMap.put("encrypted_data", "");
        return extendInfoMap;
    }

}
