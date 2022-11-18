package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantActivityUnionpayMerbaseinfoApplyRequest;

/**
 * 银联活动商户入驻 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantActivityUnionpayMerbaseinfoApplyRequest.class)
public class V2MerchantActivityUnionpayMerbaseinfoApplyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantActivityUnionpayMerbaseinfoApplyRequest request = new V2MerchantActivityUnionpayMerbaseinfoApplyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付客户Id
        request.setHuifuId("6666000103391467");
        // 商户类型
        request.setMerType("MERCHANT_03");
        // 经营类型
        request.setDealType("01");
        // 所属行业（MCC）MERCHANT_01-自然人 需要传入，参考[银联MCC编码](https://paas.huifu.com/partners/api/#/csfl/api_csfl_ylmccbm) ；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：5311&lt;/font&gt;
        request.setMcc("");
        // 负责人手机号
        request.setLegalMobile("18900458938");
        // 联系人身份证号
        request.setContractIdNo("110101199003071874");

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
        // 文件列表
        extendInfoMap.put("file_list", getFileList());
        return extendInfoMap;
    }

    private static String getFileList() {
        JSONObject dto = new JSONObject();
        // 文件类型
        dto.put("file_type", "F02");
        // 文件jfileID
        dto.put("file_id", "e2113798-ee67-30ac-9981-9dd742510adb");
        // 文件名称
        dto.put("file_name", "身份证正面照片");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
