package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantActivityAddRequest;

/**
 * 商户活动报名 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantActivityAddRequest.class)
public class V2MerchantActivityAddRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantActivityAddRequest request = new V2MerchantActivityAddRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 汇付客户Id
        request.setHuifuId("6666000103627938");
        // 营业执照图片
        request.setBlPhoto("42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 店内环境图片
        request.setDhPhoto("42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 手续费类型
        request.setFeeType("7");
        // 整体门面图片（门头照）
        request.setMmPhoto("42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 收银台照片
        request.setSytPhoto("42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 支付通道
        request.setPayWay("W");

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
        // 活动类型
        extendInfoMap.put("activity_type", "BLUE_SEA");
        // 二级商户号
        extendInfoMap.put("sub_mer_id", "W5503418657189757903");
        // 二级商户名称
        extendInfoMap.put("sub_mer_name", "");
        // 异步通知地址
        extendInfoMap.put("async_return_url", "http://192.168.85.157:30031/sspm/testVirgo");
        // 证明文件图片
        extendInfoMap.put("certificate_file_photo", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 收费样本
        extendInfoMap.put("charge_sample_photo", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 照会
        extendInfoMap.put("diplomatic_note_photo", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 事业单位法人证书图片
        extendInfoMap.put("inst_org_photo", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 法人身份证图片
        extendInfoMap.put("legal_person_photo", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 法人登记证书图片
        extendInfoMap.put("legal_person_reg_photo", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 医疗执业许可证图片
        extendInfoMap.put("medical_license_photo", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 民办非企业单位登记证书图片
        extendInfoMap.put("nonenterprise_photo", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 组织机构代码证图片
        extendInfoMap.put("org_cert_photo", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 机构资质证明照片
        extendInfoMap.put("org_qualifi_photo", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 办学资质图片
        extendInfoMap.put("school_license_photo", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 门店省市区编码
        extendInfoMap.put("shop_add_code", "110101");
        // 门店街道名称
        extendInfoMap.put("shop_street", "门店街道名称");
        // 门店租赁证明
        extendInfoMap.put("store_tenancy_proof_photo", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 合作资质证明
        extendInfoMap.put("cooper_certi_photo", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 优惠费率承诺函
        extendInfoMap.put("activity_rate_commit_photo", "42204258-967e-373c-88d2-1afa4c7bb8ef");
        // 商户同名银行账户信息
        extendInfoMap.put("bank_account", getBankAccount());
        // 银行开户证明图片
        extendInfoMap.put("bank_account_prove_photo", "");
        // 机构银行合作授权函图
        extendInfoMap.put("bank_agreement_photo", "");
        // 行业编码
        extendInfoMap.put("industry_code", "");
        // 商户行业资质图片
        extendInfoMap.put("industry_photo", "");
        // 负责人授权函图片
        extendInfoMap.put("legal_person_auth_photo", "");
        // 食堂经营相关资质
        // extendInfoMap.put("food_qualification_proof", "");
        // 活动费率%
        // extendInfoMap.put("preferential_rate", "");
        // 活动到期后费率%
        // extendInfoMap.put("expiration_rate", "");
        // 学校号
        // extendInfoMap.put("school_id", "");
        return extendInfoMap;
    }

    private static String getBankAccount() {
        JSONObject dto = new JSONObject();
        // 账户名
        dto.put("card_name", "张三");
        // 银行账号
        dto.put("card_no", "6228480402637874213");
        // 开户行名称
        dto.put("bank_branch_name", "招商银行");

        return dto.toJSONString();
    }

}
