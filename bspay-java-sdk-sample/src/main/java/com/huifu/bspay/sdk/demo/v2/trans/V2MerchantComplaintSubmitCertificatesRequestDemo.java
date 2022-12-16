package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantComplaintSubmitCertificatesRequest;

/**
 * 支付宝申诉提交凭证 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantComplaintSubmitCertificatesRequest.class)
public class V2MerchantComplaintSubmitCertificatesRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantComplaintSubmitCertificatesRequest request = new V2MerchantComplaintSubmitCertificatesRequest();
        // 请求汇付流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求汇付时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 支付宝推送流水号
        request.setRiskBizId("b1e11c97badf1ba025399ee0332d8fb1-ISV");
        // 申诉解限的唯一ID
        request.setRelievingId("653739ab36362810b7203b304d6f3883");
        // 解限风险类型
        request.setRelieveRiskType("SMID_MERCHANT");
        // 提交的凭证数据
        request.setRelieveCertDataList(getRelieveCertDataList());

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

    private static String getRelieveCertDataList() {
        JSONObject dto = new JSONObject();
        // 凭证的唯一ID
        dto.put("request_id", "1efc8c73afd64fc1b1fc50a834a54be0");
        // 凭证类型
        dto.put("type", "IMAGE");
        // 凭证code
        dto.put("code", "904");
        // 凭证的内容
        dto.put("info_data", "edd2d893-d3c2-342b-9ded-993913effce9");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
