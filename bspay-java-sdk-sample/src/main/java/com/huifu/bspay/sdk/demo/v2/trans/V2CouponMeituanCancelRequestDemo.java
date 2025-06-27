package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2CouponMeituanCancelRequest;

/**
 * 美团卡券撤销 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2CouponMeituanCancelRequest.class)
public class V2CouponMeituanCancelRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2CouponMeituanCancelRequest request = new V2CouponMeituanCancelRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付商户号
        request.setHuifuId("6666000106057033");
        // 门店绑定流水号
        request.setBindId("9c2d91f68ba045a998df46ffe395a9ca");
        // 登录账号
        request.setAppShopAccount("123");
        // 登录用户名
        request.setAppShopAccountName("12345");
        // 券码
        request.setReceiptCode("5729740654");

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
        // 机具id
        // extendInfoMap.put("device_id", "");
        // 操作人id
        // extendInfoMap.put("operator_id", "");
        // 操作人姓名
        // extendInfoMap.put("operator_name", "");
        return extendInfoMap;
    }

}
