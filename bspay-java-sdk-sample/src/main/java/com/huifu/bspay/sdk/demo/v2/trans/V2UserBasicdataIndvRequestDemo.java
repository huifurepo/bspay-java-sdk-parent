package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2UserBasicdataIndvRequest;

/**
 * 个人用户基本信息开户 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2UserBasicdataIndvRequest.class)
public class V2UserBasicdataIndvRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2UserBasicdataIndvRequest request = new V2UserBasicdataIndvRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 个人姓名
        request.setName("个人用户名称3657");
        // 个人证件类型
        request.setCertType("00");
        // 个人证件号码
        request.setCertNo("321084198912066512");
        // 个人证件有效期类型
        request.setCertValidityType("1");
        // 个人证件有效期开始日期
        request.setCertBeginDate("20200117");
        // 手机号
        request.setMobileNo("13764462205");

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
        // 个人证件有效期截止日期
        extendInfoMap.put("cert_end_date", "20400117");
        // 电子邮箱
        extendInfoMap.put("email", "jeff.peng@huifu.com");
        // 管理员账号
        extendInfoMap.put("login_name", "Lg2022022201394910571");
        // 是否发送短信标识
        extendInfoMap.put("sms_send_flag", "1");
        // 拓展方字段
        extendInfoMap.put("expand_id", "");
        // 文件列表
        extendInfoMap.put("file_list", getFileList());
        // 地址
        // extendInfoMap.put("**address**", "");
        return extendInfoMap;
    }

    private static String getFileList() {
        JSONObject dto = new JSONObject();
        // 文件类型
        dto.put("file_type", "F04");
        // 文件jfileID
        dto.put("file_id", "2022022201394949297117211");
        // 文件名称
        dto.put("file_name", "企业营业执照1.jpg");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
