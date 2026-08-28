package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2InvoiceQueryecmsapplylistRequest;

/**
 * 电子合同申请列表查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2InvoiceQueryecmsapplylistRequest.class)
public class V2InvoiceQueryecmsapplylistRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2InvoiceQueryecmsapplylistRequest request = new V2InvoiceQueryecmsapplylistRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 汇付商户号
        request.setHuifuId("6666000103334211");
        // 协议类型
        request.setAgreementType("ELECT");
        // 当前页
        request.setPageNum("1");
        // 分页大小
        // request.setPageSize("test");

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
        // 协议编号
        extendInfoMap.put("agreement_id", "202505210201439711");
        // 场景类型
        extendInfoMap.put("scene_code", "MER_KYC");
        // 协议状态
        // extendInfoMap.put("sign_status", "");
        // 申请单号
        extendInfoMap.put("order_id", "2025052118403054");
        // 商户名称
        // extendInfoMap.put("mer_name", "");
        // 产品号
        // extendInfoMap.put("product_id", "");
        return extendInfoMap;
    }

}
