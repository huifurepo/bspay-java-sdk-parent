package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBusiAtModifyRequest;

/**
 * 微信支付宝入驻信息修改 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantBusiAtModifyRequest.class)
public class V2MerchantBusiAtModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBusiAtModifyRequest request = new V2MerchantBusiAtModifyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // AT信息修改列表
        request.setAtRegList(getAtRegList());

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
        // 业务开通结果异步消息接收地址
        extendInfoMap.put("busi_async_return_url", "http://service.example.com/to/path");
        // 支付成功页商户LOGO图片
        // extendInfoMap.put("ali_mer_logo", "");
        return extendInfoMap;
    }

    private static String getAtRegList() {
        JSONObject dto = new JSONObject();
        // 商户汇付ID
        dto.put("huifu_id", "6666000***456098");
        // 产品号
        dto.put("product_id", "ZDTEST");
        // 业务开通类型
        dto.put("fee_type", "03");
        // 支付通道
        dto.put("pay_way", "W");
        // 子渠道号
        dto.put("pay_channel_id", "JP00001");
        // 经营简称
        dto.put("short_name", "盈盈超市3.0");
        // 客服电话
        dto.put("service_phone", "1752***5001");
        // 商户名称
        // dto.put("mer_name", "");
        // 营业执照类型
        // dto.put("business_license_type", "");
        // 商户营业执照号
        // dto.put("license_code", "");
        // 法人身份证号
        // dto.put("legal_cert_no", "");
        // 行业分类
        // dto.put("cls_id", "");
        // 申请服务
        // dto.put("service_codes", "");
        // 结算卡
        // dto.put("settle_card_no", "");
        // 结算卡户名
        // dto.put("settle_card_name", "");
        // 商户结算卡开卡行支行名称
        // dto.put("mer_card_bank_branch_name", "");
        // 支付宝登录账号
        // dto.put("alipay_account", "");
        // 联系人类型
        // dto.put("contact_type", "");
        // 联系人姓名
        // dto.put("contact_name", "");
        // 联系人手机号
        // dto.put("contact_mobile", "");
        // 联系人邮箱
        // dto.put("contact_email", "");
        // 商户地址
        // dto.put("mer_addr", "");
        // 省份编码
        // dto.put("province_code", "");
        // 城市编码
        // dto.put("city_code", "");
        // 区县编码
        // dto.put("district_code", "");
        // 拟申请的间联商户等级
        // dto.put("indirect_level", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
