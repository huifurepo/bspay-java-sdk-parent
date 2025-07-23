package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2CouponDouyinConsumeRequest;

/**
 * 抖音卡券核销 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2CouponDouyinConsumeRequest.class)
public class V2CouponDouyinConsumeRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2CouponDouyinConsumeRequest request = new V2CouponDouyinConsumeRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付商户号
        request.setHuifuId("6666000107767088");
        // 门店绑定流水号
        request.setBindId("88fd7c9b63e84a259dfe3eecb811fce8");
        // 加密抖音券码列表
        request.setEncryptedCodes("[\"2343\",\"5462\"]");
        // 校验标识
        request.setVerifyToken("EfdAdS3");

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
        // 核销额外参数
        // extendInfoMap.put("verify_extra", get11f3d825Aad642ec886f1867af6dfb8e());
        return extendInfoMap;
    }

    private static JSON get11f3d825Aad642ec886f1867af6dfb8e() {
        JSONObject dto = new JSONObject();
        // 开台时间（秒）
        // dto.put("biz_time", "test");
        // 实际抵扣金额（分））
        // dto.put("actual_deduction_amount", "test");

        return dto;
    }

}
