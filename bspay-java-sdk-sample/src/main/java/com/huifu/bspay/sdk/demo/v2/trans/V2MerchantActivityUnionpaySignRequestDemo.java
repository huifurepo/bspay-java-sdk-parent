package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantActivityUnionpaySignRequest;

/**
 * 银联活动报名 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantActivityUnionpaySignRequest.class)
public class V2MerchantActivityUnionpaySignRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantActivityUnionpaySignRequest request = new V2MerchantActivityUnionpaySignRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付客户Id
        request.setHuifuId("6666000103391467");
        // 活动编号
        request.setActivityId("306530984470249472");
        // 银联活动商户号
        request.setMerNo("MH20220707155729AFIIZ");

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
        // 报名补充说明
        extendInfoMap.put("remark", "报名补充说明");
        // 报名文本材料
        extendInfoMap.put("enlist_txt_makings", getEnlistTxtMakings());
        // 报名图片材料
        extendInfoMap.put("enlist_img_makings", getEnlistImgMakings());
        return extendInfoMap;
    }

    private static String getEnlistTxtMakings() {
        JSONObject dto = new JSONObject();
        // 活动材料编号
        dto.put("makings_id", "17");
        // 活动材料类型
        dto.put("makings_type", "TXT");
        // 活动材料名称
        dto.put("makings_name", "银联云闪付商户号");
        // 材料值
        dto.put("makings_value", "82339SP5411019L");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getEnlistImgMakings() {
        JSONObject dto = new JSONObject();
        // 活动材料编号
        dto.put("makings_id", "18");
        // 活动材料类型
        dto.put("makings_type", "IMG");
        // 活动材料名称
        dto.put("makings_name", "门头照片");
        // 材料值
        dto.put("makings_value", "42204258-967e-373c-88d2-1afa4c7bb8ef");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
