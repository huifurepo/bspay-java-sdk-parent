package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBasicdataEntRequest;

/**
 * 企业商户进件 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantBasicdataEntRequest.class)
public class V2MerchantBasicdataEntRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBasicdataEntRequest request = new V2MerchantBasicdataEntRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 渠道商号
        request.setUpperHuifuId("6666000003080000");
        // 商户名称
        request.setRegName("集成企业商户8664");
        // 商户简称
        request.setShortName("企业商户3471");
        // 小票名称
        request.setReceiptName("盈盈超市");
        // 公司类型
        request.setEntType("1");
        // 所属行业参考[汇付MCC编码](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_hfmccbm) ；当use_head_info_flag&#x3D;Y时不填&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：5311&lt;/font&gt;
        request.setMcc("5411");
        // 经营类型1：实体，2：虚拟 ；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1&lt;/font&gt; ；当use_head_info_flag&#x3D;Y时不填
        request.setBusiType("1");
        // 场景类型
        // request.setSceneType("test");
        // 证照图片
        // request.setLicensePic("test");
        // 证照编号
        request.setLicenseCode("20220422267883697");
        // 证照有效期类型
        request.setLicenseValidityType("1");
        // 证照有效期开始日期
        request.setLicenseBeginDate("20200401");
        // 证照有效期截止日期格式：yyyyMMdd。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;  当license_validity_type&#x3D;0时必填；当license_validity_type&#x3D;1时为空；当use_head_info_flag&#x3D;Y时不填
        request.setLicenseEndDate("");
        // 成立时间
        // request.setFoundDate("test");
        // 注册资本保留两位小数；条件选填，国营企业、私营企业、外资企业、事业单位、其他、集体经济必填，政府机构、个体工商户可为空；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：100.00&lt;/font&gt;
        // request.setRegCapital("test");
        // 注册区
        request.setRegDistrictId("350203");
        // 注册详细地址
        request.setRegDetail("吉林省长春市思明区解放2路59096852");
        // 经营区
        request.setDistrictId("310104");
        // 经营详细地址scene_type&#x3D;OFFLINE/ALL时必填；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：上海市徐汇区XX路XX号&lt;/font&gt;
        request.setDetailAddr("吉林省长春市思明区解放1路49227677");
        // 法人姓名
        request.setLegalName("陈立一");
        // 法人证件类型
        request.setLegalCertType("00");
        // 法人证件号码
        request.setLegalCertNo("321084198912060000");
        // 法人证件有效期类型
        request.setLegalCertValidityType("1");
        // 法人证件有效期开始日期
        request.setLegalCertBeginDate("20121201");
        // 法人证件有效期截止日期日期格式：yyyyMMdd， &lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;当legal_cert_validity_type&#x3D;0时必填；&lt;br/&gt;当legal_cert_validity_type&#x3D;1时为空；&lt;br/&gt;当use_head_info_flag&#x3D;Y时不填
        request.setLegalCertEndDate("20301201");
        // 法人证件地址
        // request.setLegalAddr("test");
        // 法人身份证国徽面
        // request.setLegalCertBackPic("test");
        // 法人身份证人像面
        // request.setLegalCertFrontPic("test");
        // 联系人手机号
        request.setContactMobileNo("13111112222");
        // 联系人电子邮箱
        request.setContactEmail("jeff.peng@huifu.com");
        // 管理员账号
        request.setLoginName("LG20220422267883697");
        // 开户许可证企业商户需要，结算账号为对公账户必填；通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F08；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setRegAcctPic("test");
        // 基本存款账户编号或核准号条件选填；当use_head_info_flag&#x3D;Y时不填 ；&lt;br/&gt;基本存款账户信息请填写基本存款账户编号；开户许可证请填写核准号。&lt;br/&gt;当注册地址或经营地址为如下地区时必填：江苏省、浙江省、湖南省、湖北省、云南省、贵州省、陕西省、河南省、吉林省、黑龙江省、福建省、海南省、重庆市、青海省、宁夏回族自治区；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：J2900123456789&lt;/font&gt;
        request.setOpenLicenceNo("");
        // 银行卡信息配置
        request.setCardInfo(getB2327a4a46a74af1B6da314607ca4387());
        // 卡正面**对私必填**。通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F13；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setSettleCardFrontPic("test");
        // 持卡人身份证国徽面**对私必填**。通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F56；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setSettleCertBackPic("test");
        // 持卡人身份证人像面**对私必填**。通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F55；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setSettleCertFrontPic("test");
        // 授权委托书**对私非法人、对公非同名结算必填**；通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F15；开通银行电子账户（中信E管家）需提供F520；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setAuthEnturstPic("test");
        // 上级汇付Id如果head_office_flag&#x3D;0，则字段必填，如果head_office_flag&#x3D;1，上级汇付Id不可传&lt;br/&gt;如果headOfficeFlag&#x3D;0，useHeadInfoFlag&#x3D;Y,且head_huifu_id不为空则基本信息部分复用上级的基本信息。&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123&lt;/font&gt;
        // request.setHeadHuifuId("test");
        // 商户ICP备案编号商户ICP备案编号或网站许可证号；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：沪ICP备06046402号-28 &lt;/font&gt;&lt;br/&gt;类型为PC网站时，且为企业商户，且开通快捷或网银，或大额转账，或余额支付或分账业务（20%（不含）-100%），或为个人商户开通分账业务（10%（不含）-100%），必填
        request.setMerIcp("");
        // 店铺门头照
        // request.setStoreHeaderPic("test");
        // 店铺内景/工作区域照
        // request.setStoreIndoorPic("test");
        // 店铺收银台/公司前台照
        // request.setStoreCashierDeskPic("test");

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
        // 商户英文名称
        extendInfoMap.put("mer_en_name", "");
        // 证照类型
        extendInfoMap.put("license_type", "");
        // 经营范围
        // extendInfoMap.put("business_scope", "");
        // 注册省
        extendInfoMap.put("reg_prov_id", "350000");
        // 注册市
        extendInfoMap.put("reg_area_id", "350200");
        // 经营省
        extendInfoMap.put("prov_id", "310000");
        // 经营市
        extendInfoMap.put("area_id", "310100");
        // 法人手机号
        // extendInfoMap.put("legal_mobile_no", "");
        // 受益人列表
        // extendInfoMap.put("beneficiary_info", getF13a0b43F23d4aab91a0E326ec89a351());
        // 联系人姓名
        extendInfoMap.put("contact_name", "联系人");
        // 商户通知标识
        extendInfoMap.put("sms_send_flag", "Y");
        // 客服电话
        extendInfoMap.put("service_phone", "021-121111221");
        // 结算业务配置
        extendInfoMap.put("settle_config", getA908da42065845b8852550b11a12c8c0());
        // 取现业务配置
        extendInfoMap.put("cash_config", get33768d6aA9394ce5A369A88b918d2ea8());
        // 商户身份
        // extendInfoMap.put("head_office_flag", "");
        // 使用上级资料信息
        // extendInfoMap.put("use_head_info_flag", "");
        // 商户主页URL
        extendInfoMap.put("mer_url", "");
        // 外部商户号
        // extendInfoMap.put("ext_mer_id", "");
        // 备注
        // extendInfoMap.put("remarks", "");
        // 异步请求地址
        extendInfoMap.put("async_return_url", "virgo://http://192.168.85.157:30031/sspm/testVirgo");
        // 斗拱e账户功能配置
        // extendInfoMap.put("elec_acct_config", get0882475c315d4249A27dFd4dc2d278a6());
        // 股东信息
        // extendInfoMap.put("share_holder_info_list", getC12a6d98Fae14c13B3b1Eb20462fa0af());
        // 扩展资料包
        // extendInfoMap.put("extended_material_list", get008cc24b42ff4cd88c31663c087a4836());
        return extendInfoMap;
    }

    private static String getF13a0b43F23d4aab91a0E326ec89a351() {
        JSONObject dto = new JSONObject();
        // 受益人名称
        // dto.put("bo_name", "test");
        // 受益人证件类型
        // dto.put("bo_type", "test");
        // 受益人证件号
        // dto.put("bo_no", "test");
        // 受益人证件有效期开始时间
        // dto.put("bo_date_start", "test");
        // 受益人证件有效期结束时间
        // dto.put("bo_dead_line", "test");
        // 受益人证件地址
        // dto.put("bo_address", "test");
        // 受益人手机号开通全域资金管理业务时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：13911111111&lt;/font&gt;
        // dto.put("bo_mobile_no", "test");
        // 最终受益人受益方式A01：直接或间接控股25%（含）以上 &lt;br/&gt;A02：通过人事、财务等其他方式对公司进行控制 &lt;br/&gt;A03：高级管理人员 &lt;br/&gt;A04：法人或公司负责人 &lt;br/&gt;A05：其他&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：A01&lt;/font&gt;&lt;br/&gt;开通全域资金管理业务时必填
        // dto.put("final_beneficiary_mode", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getB2327a4a46a74af1B6da314607ca4387() {
        JSONObject dto = new JSONObject();
        // 银行账户类型
        dto.put("card_type", "0");
        // 银行账户名
        dto.put("card_name", "上海以道数据服务中心");
        // 银行账号
        dto.put("card_no", "698043508");
        // 银行所在市
        // dto.put("area_id", "test");
        // 银行编码当card_type&#x3D;0时必填；参考： [银行编码](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_yhbm)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：01020000&lt;/font&gt;；
        // dto.put("bank_code", "test");
        // 联行号当card_type&#x3D;0时必填，参考：[银行支行编码](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_yhzhbm) 当card_type&#x3D;0时必填， 当card_type&#x3D;1或2时非必填 &lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：102290026507&lt;/font&gt;
        dto.put("branch_code", "305290002096");
        // 持卡人证件类型持卡人证件类型，参见《[自然人证件类型](https://paas.huifu.com/open/doc/api/#/api_ggcsbm?id&#x3D;%e8%87%aa%e7%84%b6%e4%ba%ba%e8%af%81%e4%bb%b6%e7%b1%bb%e5%9e%8b)》。&lt;br/&gt; 当card_type&#x3D;0时为空， 当card_type&#x3D;1或2时必填； &lt;font color&#x3D;&quot;green&quot;&gt;示例值：00&lt;/font&gt;&lt;br/&gt;持卡人证件类型04、11需要补充 F101【结算人】港澳台居民来往内地通行证&lt;br/&gt;持卡人证件类型13需要补充 F513【结算人】外国人居留证&lt;br/&gt;持卡人证件类型14、15需要补充 F514【结算人】港澳台居住证&lt;br/&gt;其它持卡人证件类型补充F102【结算人】其它证件材料&lt;br/&gt;补充材料填写在extended_material_list 扩展资料包中
        // dto.put("cert_type", "test");
        // 持卡人证件号码对私必填；年龄不小于18岁且不能大于80岁；如持卡人证件类型为00：身份证，则填写身份证号码 ；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：310112200001018888&lt;/font&gt;
        // dto.put("cert_no", "test");
        // 持卡人证件有效期截止日期日期格式：yyyyMMdd，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;  当cert_validity_type&#x3D;0时必填；当cert_validity_type&#x3D;1时为空
        // dto.put("cert_end_date", "test");
        // 银行所在省
        // dto.put("prov_id", "");
        // 持卡人证件有效期类型
        // dto.put("cert_validity_type", "");
        // 持卡人证件有效期开始日期
        // dto.put("cert_begin_date", "");
        // 银行卡绑定手机号
        // dto.put("mp", "");
        // 默认结算卡标志
        // dto.put("is_settle_default", "");

        return dto.toJSONString();
    }

    private static String getA908da42065845b8852550b11a12c8c0() {
        JSONObject dto = new JSONObject();
        // 结算周期
        dto.put("settle_cycle", "D1");
        // 结算手续费外扣商户号填写承担手续费的汇付商户号；当out_settle_flag&#x3D;1时必填，否则非必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123&lt;/font&gt;
        dto.put("out_settle_huifuid", "");
        // 结算批次号settle_cycle为TS时不填。当settle_pattern&#x3D;P0批次结算时必填，即将按指定结算批次号进行资金结算；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：100&lt;/font&gt;；[参见结算批次说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_jspc)
        dto.put("settle_batch_no", "");
        // 自定义结算处理时间settle_cycle为TS时不填。当settle_pattern&#x3D;P1/P2自定义时间结算时必填；注意：00:00到00:30不能指定&lt;br/&gt;到账时间，格式：HHmmss；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：103000&lt;/font&gt;
        dto.put("settle_time", "");
        // 节假日结算手续费率settle_cycle为D1、TS时必填。单位%，需保留小数点后两位。取值范围[0.00，100.00]，不收费请填写0.00；settle_cycle&#x3D;T1时，不生效 ；settle_cycle为D1时，遇节假日按此费率结算 ；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;
        dto.put("fixed_ratio", "5.00");
        // 节假日结算手续费固定金额settle_cycle为D1、TS时必填。单位元，需保留小数点后两位。不收费请填写0.00；settle_cycle结算周期为D1时，遇节假日按此费率结算 ；&lt;br/&gt; &lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;
        // dto.put("constant_amt", "test");
        // 起结金额
        dto.put("min_amt", "1.00");
        // 留存金额
        dto.put("remained_amt", "2.00");
        // 结算摘要
        dto.put("settle_abstract", "abstract");
        // 手续费外扣标记
        dto.put("out_settle_flag", "2");
        // 结算手续费外扣账户类型
        dto.put("out_settle_acct_type", "");
        // 结算方式
        dto.put("settle_pattern", "");
        // 是否优先到账
        dto.put("is_priority_receipt", "");
        // 工作日结算手续费率
        // dto.put("workday_fixed_ratio", "");
        // 工作日结算手续费固定金额
        // dto.put("workday_constant_amt", "");

        return dto.toJSONString();
    }

    private static String get33768d6aA9394ce5A369A88b918d2ea8() {
        JSONObject dto = new JSONObject();
        // 取现手续费（固定/元）fix_amt与fee_rate至少填写一项， 需保留小数点后两位，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;注：当cash_type&#x3D;D1时为节假日取现手续费；当cash_type&#x3D;T1时为工作日取现手续费
        dto.put("fix_amt", "1.00");
        // 取现手续费率（%）fix_amt与fee_rate至少填写一项，需保留小数点后两位，取值范围[0.00,100.00]，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;注：1、如果fix_amt与fee_rate都填写了则手续费&#x3D;fix_amt+支付金额\*fee_rate2、当cash_type&#x3D;D1时为节假日取现手续费；当cash_type&#x3D;T1时为工作日取现手续费
        dto.put("fee_rate", "");
        // D1工作日取现手续费固定金额单位元，需保留小数点后两位。不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;cash_type&#x3D;T1时，不生效 ；cash_type取现类型为D1时，遇工作日按此费率结算，若未配置则默认按照节假日手续费计算
        // dto.put("weekday_fix_amt", "test");
        // D1工作日取现手续费率单位%，需保留小数点后两位。取值范围[0.00，100.00]，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;cash_type&#x3D;T1时，不生效 ；cash_type取现类型为D1时，遇工作日按此费率结算 ，若未配置则默认按照节假日手续费计算
        // dto.put("weekday_fee_rate", "test");
        // 手续费承担方手续费外扣时必需指定手续费承担方ID ；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123&lt;/font&gt;
        // dto.put("out_fee_huifu_id", "test");
        // 取现类型
        dto.put("cash_type", "D0");
        // 是否取现手续费外扣
        // dto.put("out_fee_flag", "");
        // 手续费外扣的账户类型
        // dto.put("out_fee_acct_type", "");
        // 是否优先到账
        // dto.put("is_priority_receipt", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static JSON get622ded0e267647a8Ba6b9a7009c3ef51() {
        JSONObject dto = new JSONObject();
        // 银行编码
        // dto.put("bank_code", "test");
        // 支行联行号
        // dto.put("branch_code", "test");
        // 支行名称
        // dto.put("branch_name", "test");
        // 银行账户名
        // dto.put("card_name", "test");
        // 银行卡号
        // dto.put("card_no", "test");
        // 银行账户类型
        // dto.put("card_type", "test");
        // 银行所在省
        // dto.put("prov_id", "");
        // 银行所在市
        // dto.put("area_id", "");
        // 默认卡标识
        // dto.put("default_cash_flag", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get0882475c315d4249A27dFd4dc2d278a6() {
        JSONObject dto = new JSONObject();
        // 电子账户开关
        // dto.put("switch_state", "test");
        // 账户类型
        // dto.put("acct_type", "test");
        // 电子账户取现手续费承担方
        // dto.put("cash_fee_party", "test");
        // 场景类型
        // dto.put("scene", "test");
        // 角色类型
        // dto.put("role_type", "test");
        // 签约成功标志
        // dto.put("sign_success_flag", "test");
        // 银行卡信息
        // dto.put("elec_card_list", get622ded0e267647a8Ba6b9a7009c3ef51());
        // 中信签约短信流水号
        // dto.put("elec_acct_sign_seq_id", "");

        return dto.toJSONString();
    }

    private static String getC12a6d98Fae14c13B3b1Eb20462fa0af() {
        JSONObject dto = new JSONObject();
        // 股东姓名
        // dto.put("name", "test");
        // 股东证件类型
        // dto.put("cert_type", "test");
        // 股东证件号码
        // dto.put("cert_no", "test");
        // 股东证件有效期类型
        // dto.put("cert_validity_type", "test");
        // 股东证件有效期起始日
        // dto.put("cert_begin_date", "test");
        // 股东证件有效期到期日
        // dto.put("cert_end_date", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get008cc24b42ff4cd88c31663c087a4836() {
        JSONObject dto = new JSONObject();
        // 文件id
        // dto.put("file_id", "test");
        // 文件类型
        // dto.put("file_type", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
