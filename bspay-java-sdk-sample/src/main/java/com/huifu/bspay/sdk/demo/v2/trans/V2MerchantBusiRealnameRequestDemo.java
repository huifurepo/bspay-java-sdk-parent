package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBusiRealnameRequest;

/**
 * 微信实名认证 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantBusiRealnameRequest.class)
public class V2MerchantBusiRealnameRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBusiRealnameRequest request = new V2MerchantBusiRealnameRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付ID
        request.setHuifuId("6666000104854510");
        // 联系人姓名
        request.setName("小枫");
        // 联系人手机号
        request.setMobile("17521205027");
        // 联系人身份证号码
        request.setIdCardNumber("130224198806083798");
        // 联系人类型
        request.setContactType("SUPER");

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
        // 子渠道号
        extendInfoMap.put("pay_channel_id", "JP00001");
        // 支付场景
        extendInfoMap.put("pay_scene", "01");
        // 经营者/法人是否为受益人
        extendInfoMap.put("owner", "N");
        // 法人证件居住地址
        extendInfoMap.put("identification_address", "上海市徐汇区宜山路789号789室");
        // 受益人信息
        extendInfoMap.put("ubo_info_list", getUboInfoList());
        // 联系人证件类型
        extendInfoMap.put("contact_id_doc_type", "01");
        // 联系人证件有效期开始时间
        extendInfoMap.put("contact_period_begin", "1990-03-07");
        // 联系人证件有效期结束时间
        extendInfoMap.put("contact_period_end", "长期");
        // 证书类型
        extendInfoMap.put("cert_type", "CERTIFICATE_TYPE_2389");
        // 证书编号
        extendInfoMap.put("cert_number", "1234567892");
        // 证书照片
        extendInfoMap.put("cert_copy", "");
        // 小微经营类型
        extendInfoMap.put("micro_biz_type", "");
        // 门店名称
        extendInfoMap.put("store_name", "");
        // 门店门头照片
        extendInfoMap.put("store_header_copy", "");
        // 店内环境照片
        extendInfoMap.put("store_indoor_copy", "");
        // 门店省市编码
        extendInfoMap.put("store_address_code", "");
        // 门店地址
        extendInfoMap.put("store_address", "");
        // 身份证件人像面
        extendInfoMap.put("identification_front_copy", "c7faf0e6-39e9-3c35-9075-2312ad6f4ea4");
        // 身份证件国徽面
        extendInfoMap.put("identification_back_copy", "c7faf0e6-39e9-3c35-9075-2312ad6f4ea4");
        // 单位证明函照片
        extendInfoMap.put("company_prove_copy", "");
        // 是否金融机构
        extendInfoMap.put("finance_institution_flag", "N");
        // 金融机构类型
        extendInfoMap.put("finance_type", "");
        // 特殊行业Id
        extendInfoMap.put("category_id", "");
        // 文件列表
        extendInfoMap.put("special_file_info_list", getSpecialFileInfoList());
        return extendInfoMap;
    }

    private static String getUboInfoList() {
        JSONObject dto = new JSONObject();
        // 受益人证件类型
        dto.put("ubo_id_doc_type", "00");
        // 证件正面照片
        dto.put("ubo_id_doc_copy", "c7faf0e6-39e9-3c35-9075-2312ad6f4ea4");
        // 受益人证件姓名
        dto.put("ubo_id_doc_name", "杨雷");
        // 受益人证件号码
        dto.put("ubo_id_doc_number", "110101199003072631");
        // 证件居住地址
        dto.put("ubo_id_doc_address", "上海市徐汇区宜山路789号");
        // 证件有效期开始时间
        dto.put("ubo_period_begin", "19900307");
        // 证件有效期结束时间
        dto.put("ubo_period_end", "长期");
        // 证件反面照片
        dto.put("ubo_id_doc_copy_back", "c7faf0e6-39e9-3c35-9075-2312ad6f4ea4");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getSpecialFileInfoList() {
        JSONObject dto = new JSONObject();
        // 文件类型
        dto.put("file_type", "F33");
        // 文件jfileID
        dto.put("file_id", "49ac7d9b-851c-31b4-8b21-2983ea97b98c");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
