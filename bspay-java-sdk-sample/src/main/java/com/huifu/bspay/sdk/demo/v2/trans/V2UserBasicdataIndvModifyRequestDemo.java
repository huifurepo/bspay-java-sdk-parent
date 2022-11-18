package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2UserBasicdataIndvModifyRequest;

/**
 * 个人用户基本信息修改 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2UserBasicdataIndvModifyRequest.class)
public class V2UserBasicdataIndvModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2UserBasicdataIndvModifyRequest request = new V2UserBasicdataIndvModifyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付客户Id
        request.setHuifuId("6666000103854106");

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
        // 个人证件有效期类型
        extendInfoMap.put("cert_validity_type", "2");
        // 个人证件有效期开始日期
        extendInfoMap.put("cert_begin_date", "20200111");
        // 个人证件有效期截止日期
        extendInfoMap.put("cert_end_date", "20400111");
        // 电子邮箱
        extendInfoMap.put("email", "jeff.peng@huifu.com");
        // 手机号
        extendInfoMap.put("mobile_no", "15556622000");
        // 文件列表
        extendInfoMap.put("file_list", getFileList());
        return extendInfoMap;
    }

    private static String getFileList() {
        JSONObject dto = new JSONObject();
        // 文件类型
        dto.put("file_type", "test");
        // 文件jfileID
        dto.put("file_id", "test");
        // 文件名称
        dto.put("file_name", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
