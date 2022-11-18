package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantDirectZftRegRequest;

/**
 * 直付通商户入驻 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantDirectZftRegRequest.class)
public class V2MerchantDirectZftRegRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantDirectZftRegRequest request = new V2MerchantDirectZftRegRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付ID
        request.setHuifuId("6666000103521825");
        // 开发者的应用ID
        request.setAppId("2021002122659346");
        // 进件的二级商户名称
        request.setName("雷均一");
        // 商家类型
        request.setMerchantType("0");
        // 商户经营类目
        request.setMcc("5331");
        // 商户证件类型
        request.setCertType("100");
        // 商户证件编号
        request.setCertNo("120101199003071300");
        // 证件名称目前只有个体工商户商户类型要求填入本字段，填写值为个体工商户营业执照上的名称。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：xxxx小卖铺&lt;/font&gt;
        request.setCertName("I_cert_name");
        // 法人名称仅个人商户非必填，其他必填。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：张三&lt;/font&gt;
        request.setLegalName("雷均一");
        // 法人证件号码仅个人商户非必填，其他必填。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：3209261975120284333&lt;/font&gt;
        request.setLegalCertNo("120101199003071300");
        // 客服电话
        request.setServicePhone("10086");
        // 经营省
        request.setProvId("310000");
        // 经营市
        request.setAreaId("310100");
        // 经营区
        request.setDistrictId("310104");
        // 经营详细地址
        request.setDetailAddr("上海市徐汇区");
        // 联系人姓名
        request.setContactName("张三");
        // 商户联系人业务标识
        request.setContactTag("02");
        // 联系人类型
        request.setContactType("LEGAL_PERSON");
        // 联系人手机号
        request.setContactMobileNo("13576266246");
        // 商户结算卡信息jsonArray格式。本业务当前只允许传入一张结算卡。与支付宝账号字段二选一必填
        request.setZftCardInfoList("[{\"card_type\":\"1\",\"card_flag\":\"D\",\"card_name\":\"雷均一\",\"card_no\":\"6228480123456789\",\"prov_id\":\"310000\",\"area_id\":\"310100\",\"bank_code\":\"01030000\",\"bank_name\":\"中国农业银行\",\"branch_code\":\"103290076178\",\"branch_name\":\"中国农业银行股份有限公司上海徐汇支行\"}]");
        // 商户支付宝账号商户支付宝账号，用作结算账号。与银行卡对象字段二选一必填。&lt;br/&gt;本字段要求支付宝账号的名称与商户名称mch_name同名，且是实名认证过的支付宝账户。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：test@huifu.com&lt;/font&gt;
        request.setAlipayLogonId("13576266246");
        // 商户行业资质类型当商户是特殊行业时必填，具体取值[参见表格](https://mif-pub.alipayobjects.com/QualificationType.xlsx)。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：310&lt;/font&gt;
        request.setIndustryQualificationType("");
        // 商户使用服务
        request.setService("2");
        // 商户与服务商的签约时间
        request.setSignTimeWithIsv("2021-01-27");
        // 商户支付宝账户用于协议确认。目前商业场景（除医疗、中小学教育等）下必填。本字段要求上送的支付宝账号的名称与商户名称name同名，且是实名认证支付宝账户。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：test@huifu.com&lt;/font&gt;
        request.setBindingAlipayLogonId("13576266246");
        // 默认结算类型
        request.setDefaultSettleType("alipayAccount");
        // 文件列表
        request.setFileList("[{\"file_type\":\"F41\",\"file_id\":\"c679752a-9abc-326d-bb02-8cf770f56d12\",\"file_name\":\"身份证国徽面\"},{\"file_type\":\"F40\",\"file_id\":\"c679752a-9abc-326d-bb02-8cf770f56d12\",\"file_name\":\"身份证人像面\"},{\"file_type\":\"F40\",\"file_id\":\"c679752a-9abc-326d-bb02-8cf770f56d12\",\"file_name\":\"身份证人像面\"}]");

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
        // 渠道商汇付ID
        extendInfoMap.put("upper_huifu_id", "6666000103521824");
        // 商户别名
        extendInfoMap.put("alias_name", "哈市盈超市");
        // 法人证件类型
        extendInfoMap.put("legal_cert_type", "100");
        // 联系人身份证号
        extendInfoMap.put("contact_id_card_no", "120101199003071300");
        // 联系人电话
        extendInfoMap.put("contact_phone", "13576266246");
        // 联系人电子邮箱
        extendInfoMap.put("contact_email", "a066545074@qq.com");
        // 商户站点信息
        extendInfoMap.put("zft_site_info_list", "[{\"site_type\":\"02\",\"site_url\":\"站点地址\",\"site_name\":\"站点名称\",\"account\":\"\",\"password\":\"测试密码\"}]");
        // 开票资料信息
        extendInfoMap.put("zft_invoice_info_list", "[{\"auto_invoice_flag\":\"N\",\"accept_electronic_flag\":\"N\",\"tax_payer_qualification\":\"01\",\"title\":\"发票抬头\",\"tax_no\":\"纳税人识别号\",\"tax_payer_valid\":\"20210127\",\"address\":\"开票地址\",\"telephone\":\"10087\",\"bank_account\":\"6228480123456789\",\"mail_name\":\"雷均一\",\"prov_id\":\"310000\",\"area_id\":\"310100\",\"district_id\":\"310104\",\"detail_addr\":\"经营详细地址\",\"mail_telephone\":\"13576266246\",\"bank_name\":\"中国农业银行\"}]");
        // 审核结果异步通知地址
        extendInfoMap.put("async_return_url", "http://192.168.85.157:30031/sspm/testVirgo");
        return extendInfoMap;
    }

}
