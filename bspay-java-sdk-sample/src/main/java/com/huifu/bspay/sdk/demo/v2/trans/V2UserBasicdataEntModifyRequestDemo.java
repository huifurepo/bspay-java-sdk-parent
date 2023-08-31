package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2UserBasicdataEntModifyRequest;

/**
 * 企业用户基本信息修改 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2UserBasicdataEntModifyRequest.class)
public class V2UserBasicdataEntModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2UserBasicdataEntModifyRequest request = new V2UserBasicdataEntModifyRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 汇付客户Id
        request.setHuifuId("6666000103862211");

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
        // 企业用户名称
        // extendInfoMap.put("reg_name", "");
        // 经营简称
        extendInfoMap.put("short_name", "企业商户测试22");
        // 公司类型
        // extendInfoMap.put("ent_type", "");
        // 法人姓名
        extendInfoMap.put("legal_name", "陈立一");
        // 法人证件类型
        extendInfoMap.put("legal_cert_type", "00");
        // 法人证件号码
        extendInfoMap.put("legal_cert_no", "370684198903061000");
        // 法人证件有效期类型
        extendInfoMap.put("legal_cert_validity_type", "0");
        // 法人证件有效期开始日期
        extendInfoMap.put("legal_cert_begin_date", "20121010");
        // 法人证件有效期截止日期
        extendInfoMap.put("legal_cert_end_date", "20301010");
        // 联系人姓名
        extendInfoMap.put("contact_name", "花朵");
        // 联系人电子邮箱
        extendInfoMap.put("contact_email", "chang@huifu.com");
        // 联系人手机号
        extendInfoMap.put("contact_mobile", "13764462000");
        // 证照有效期类型
        extendInfoMap.put("license_validity_type", "1");
        // 证照有效期起始日期
        extendInfoMap.put("license_begin_date", "20200117");
        // 证照有效期结束日期
        extendInfoMap.put("license_end_date", "20400117");
        // 注册地址(省)
        extendInfoMap.put("reg_prov_id", "310000");
        // 注册地址(市)
        extendInfoMap.put("reg_area_id", "310100");
        // 注册地址(区)
        extendInfoMap.put("reg_district_id", "310104");
        // 注册地址(详细信息)
        extendInfoMap.put("reg_detail", "上海市宜山路");
        // 文件列表
        extendInfoMap.put("file_list", getFileList());
        return extendInfoMap;
    }

    private static String getFileList() {
        JSONObject dto = new JSONObject();
        // 文件类型
        dto.put("file_type", "F01");
        // 文件jfileID
        dto.put("file_id", "71da066c-5d15-3658-a86d-4e85ee67808a");
        // 文件名称
        dto.put("file_name", "企业营业执照1.jpg");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
