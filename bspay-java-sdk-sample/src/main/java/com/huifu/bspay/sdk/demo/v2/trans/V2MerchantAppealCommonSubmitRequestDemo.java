package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantAppealCommonSubmitRequest;

/**
 * 提交申诉 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantAppealCommonSubmitRequest.class)
public class V2MerchantAppealCommonSubmitRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantAppealCommonSubmitRequest request = new V2MerchantAppealCommonSubmitRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户经营模式
        request.setBusinessPattern("03");
        // 协查单号
        request.setAssistId("202407021808060672701923328");
        // 申诉单号
        request.setAppealId("202407021808060674786492416");
        // 商户类型
        request.setMerType("01");
        // 申诉人姓名
        request.setAppealPersonName("张三");
        // 申诉人身份证号
        request.setAppealPersonCertNo("41162719213519");
        // 申诉人联系电话
        request.setAppealPersonPhoneNo("186234508");
        // 法人姓名
        request.setLegalName("张三");
        // 法人身份证号
        request.setLegalCertNo("411627199509123");
        // 法人联系电话
        request.setLegalPhoneNo("186234502");
        // 商户主营业务
        request.setMainBusiness("批发零食饮料");
        // 申诉理由
        request.setAppealDesc("因XX申诉");

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
        // 商户营业执照号
        extendInfoMap.put("mer_business_license_no", "916501042135");
        // app名称
        extendInfoMap.put("app_name", "app名称");
        // app下载链接
        extendInfoMap.put("app_url", "XXX");
        // 电商网址
        extendInfoMap.put("commerce_url", "www.baidu.com");
        // ICP备案号
        extendInfoMap.put("icp_record_no", "京ICP21003632-7");
        // 实际经营地址
        extendInfoMap.put("business_address", "实际经营地址");
        // 营业用地性质
        extendInfoMap.put("business_location_nature", "01");
        // 经营时长
        extendInfoMap.put("business_time", "09:00:00-21:30:00");
        // 经营地段
        extendInfoMap.put("business_location_type", "01");
        // 员工人数
        extendInfoMap.put("employee_cnt", "10");
        // 申诉文件列表
        extendInfoMap.put("appeal_file_list", get0c986afe8b424cad8c63F947666296c8());
        return extendInfoMap;
    }

    private static String get0c986afe8b424cad8c63F947666296c8() {
        JSONObject dto = new JSONObject();
        // 申诉文件名称
        dto.put("item_name", "法人身份证正面");
        // 申诉文件Id
        dto.put("file_id", "fede0ba8-4994-386c-966a-sd23");
        // 申诉文件类型
        dto.put("file_code", "F01");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
