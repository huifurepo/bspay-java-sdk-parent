package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantDirectCertinfoAddRequest;

/**
 * 证书登记 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantDirectCertinfoAddRequest.class)
public class V2MerchantDirectCertinfoAddRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantDirectCertinfoAddRequest request = new V2MerchantDirectCertinfoAddRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 渠道商汇付Id
        request.setUpperHuifuId("6666000103509367");
        // 开通类型
        request.setPayWay("W");
        // 开发者的应用ID
        request.setAppId("20220818198665087");
        // 文件列表
        request.setFileList(getD3445b35252c4ebd855b4f1aeb23cfbc());

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
        // 商户号
        extendInfoMap.put("mch_id", "360634064");
        // 证书序列号
        extendInfoMap.put("cert_sn", "20220818883326714");
        // 服务商密钥
        extendInfoMap.put("secret_key", "RERE202208182319");
        // 证书类型标记
        extendInfoMap.put("cert_flag", "");
        return extendInfoMap;
    }

    private static String getD3445b35252c4ebd855b4f1aeb23cfbc() {
        JSONObject dto = new JSONObject();
        // 文件类型
        dto.put("file_type", "F53");
        // 文件jfileID
        dto.put("file_id", "9aec5b9e-816f-3ebf-8fe8-4146348ce2b0");
        // 文件名称
        dto.put("file_name", "证书1202208189390.crt");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
