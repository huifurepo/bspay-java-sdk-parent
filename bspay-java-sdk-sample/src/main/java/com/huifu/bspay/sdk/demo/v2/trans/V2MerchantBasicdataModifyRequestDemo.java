package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBasicdataModifyRequest;

/**
 * 商户基本信息修改 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantBasicdataModifyRequest.class)
public class V2MerchantBasicdataModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBasicdataModifyRequest request = new V2MerchantBasicdataModifyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 上级主体ID
        request.setUpperHuifuId("6666000021000000");
        // 汇付客户Id
        request.setHuifuId("6666000107932702");

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
        // 商户简称
        extendInfoMap.put("short_name", "尼博网络");
        // 营业执照类型
        // extendInfoMap.put("license_type", "");
        // 营业执照有效期类型
        extendInfoMap.put("license_validity_type", "0");
        // 营业执照有效期开始日期
        extendInfoMap.put("license_begin_date", "20200814");
        // 营业执照有效期截止日期
        extendInfoMap.put("license_end_date", "20400813");
        // 注册省
        extendInfoMap.put("reg_prov_id", "310000");
        // 注册市
        extendInfoMap.put("reg_area_id", "310100");
        // 注册区
        extendInfoMap.put("reg_district_id", "310120");
        // 注册详细地址
        extendInfoMap.put("reg_detail", "台州市宜山路700解放2路715");
        // 法人姓名
        extendInfoMap.put("legal_name", "沈荣");
        // 法人证件类型
        extendInfoMap.put("legal_cert_type", "00");
        // 法人证件号码
        extendInfoMap.put("legal_cert_no", "320923199111206319");
        // 法人证件有效期类型
        extendInfoMap.put("legal_cert_validity_type", "0");
        // 法人证件有效期开始日期
        extendInfoMap.put("legal_cert_begin_date", "20200814");
        // 法人证件有效期截止日期
        extendInfoMap.put("legal_cert_end_date", "20400813");
        // 经营省
        extendInfoMap.put("prov_id", "310000");
        // 经营市
        extendInfoMap.put("area_id", "310100");
        // 经营区
        extendInfoMap.put("district_id", "310105");
        // 经营详细地址
        extendInfoMap.put("detail_addr", "徐州市徐汇区宜山路7497号");
        // 联系人姓名
        extendInfoMap.put("contact_name", "我是联系人");
        // 联系人手机号
        extendInfoMap.put("contact_mobile_no", "15556622331");
        // 联系人电子邮箱
        extendInfoMap.put("contact_email", "mei.zhang@huifu.com");
        // 客服电话
        extendInfoMap.put("service_phone", "15556622368");
        // 小票名称
        extendInfoMap.put("receipt_name", "小票上的名称");
        // 所属行业（MCC）
        extendInfoMap.put("mcc", "5411");
        // 结算卡信息配置
        extendInfoMap.put("card_info", getCardInfo());
        // 取现信息配置
        extendInfoMap.put("cash_config", getCashConfig());
        // 结算规则配置
        extendInfoMap.put("settle_config", getSettleConfig());
        // 异步通知地址
        extendInfoMap.put("async_return_url", "archer://C_SSPM_NSPOSM_BUSIRESULT");
        // D1结算协议图片文件
        // extendInfoMap.put("settle_agree_pic", "");
        // 商户英文名称
        // extendInfoMap.put("mer_en_name", "");
        // 商户主页URL
        // extendInfoMap.put("mer_url", "");
        // 商户ICP备案编号
        // extendInfoMap.put("mer_icp", "");
        // 基本存款账户编号或核准号
        // extendInfoMap.put("open_licence_no", "");
        // 签约人
        // extendInfoMap.put("sign_user_info", getSignUserInfo());
        // 营业执照图片
        // extendInfoMap.put("license_pic", "");
        // 授权委托书
        // extendInfoMap.put("auth_enturst_pic", "");
        // 组织机构代码证
        // extendInfoMap.put("org_code_pic", "");
        // 税务登记证
        // extendInfoMap.put("tax_reg_pic", "");
        return extendInfoMap;
    }

    private static String getCardInfo() {
        JSONObject dto = new JSONObject();
        // 结算账户类型
        dto.put("card_type", "0");
        // 结算账户名
        dto.put("card_name", "上海尼博网络科技有限公司");
        // 结算账号
        dto.put("card_no", "1001265009300682579");
        // 银行所在省参考[地区编码](https://paas.huifu.com/partners/api/#/csfl/api_csfl_dqbm)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：310000 &lt;/font&gt;；如修改省市要级联修改&lt;br/&gt;当card_type&#x3D;0时非必填， 当card_type&#x3D;1或2时必填
        dto.put("prov_id", "310000");
        // 银行所在市参考[地区编码](https://paas.huifu.com/partners/api/#/csfl/api_csfl_dqbm)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：310100 &lt;/font&gt;；如修改省市要级联修改&lt;br/&gt;当card_type&#x3D;0时非必填， 当card_type&#x3D;1或2时必填
        dto.put("area_id", "310100");
        // 支行联行号参考：[银行支行编码](https://paas.huifu.com/partners/api/#/csfl/api_csfl_yhzhbm) 当card_type&#x3D;0时必填， 当card_type&#x3D;1或2时非必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：102290026507&lt;/font&gt;
        dto.put("branch_code", "102290026507");
        // 持卡人证件类型持卡人证件类型，参见《[自然人证件类型](https://paas.huifu.com/partners/api/#/api_ggcsbm?id&#x3D;%e8%87%aa%e7%84%b6%e4%ba%ba%e8%af%81%e4%bb%b6%e7%b1%bb%e5%9e%8b)》。&lt;br/&gt; 当card_type&#x3D;0时为空， 当card_type&#x3D;1或2时必填； &lt;font color&#x3D;&quot;green&quot;&gt;示例值：00&lt;/font&gt;
        dto.put("cert_type", "00");
        // 持卡人证件有效期类型0：非长期有效, 1：长期有效, &lt;font color&#x3D;&quot;green&quot;&gt;示例值：0&lt;/font&gt;&lt;br/&gt;当card_type&#x3D;0时为空； 当card_type&#x3D;1或2时必填；
        dto.put("cert_validity_type", "0");
        // 持卡人证件有效期开始日期日期格式：yyyyMMdd，以北京时间为准； 当card_type&#x3D;0时为空， 当card_type&#x3D;1或2时必填， &lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125 &lt;/font&gt;
        dto.put("cert_begin_date", "20180106");
        // 持卡人证件有效期截止日期日期格式：yyyyMMdd，以北京时间为准。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;  当cert_validity_type&#x3D;0时必填；当cert_validity_type&#x3D;1时为空
        dto.put("cert_end_date", "20380106");
        // 开户许可证开户许可证图片文件，请填写图片file_id，可通过 [商户图片上传](https://paas.huifu.com/partners/api/#/shgl/shjj/api_shjj_shtpsc) 接口获取，文件类型F08；&lt;br/&gt;企业商户需要，结算账号为对公账户，且开通全域资金管理必填；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        dto.put("reg_acct_pic", "d1451277-85c6-3177-ac3d-a8be47b9ae9d");
        // 法人身份证正面法人身份证正面图片文件，请填写图片file_id，可通过 [商户图片上传](https://paas.huifu.com/partners/api/#/shgl/shjj/api_shjj_shtpsc) 接口获取，文件类型F02；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529 &lt;/font&gt;
        dto.put("legal_cert_front_pic", "d1451277-85c6-3177-ac3d-a8be47b9ae9d");
        // 法人身份证反面法人身份证反面图片文件，请填写图片file_id，可通过 [商户图片上传](https://paas.huifu.com/partners/api/#/shgl/shjj/api_shjj_shtpsc) 接口获取，文件类型F03；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        dto.put("legal_cert_back_pic", "d1451277-85c6-3177-ac3d-a8be47b9ae9d");
        // 公司照片一公司照片一图片文件，请填写图片file_id，可通过 [商户图片上传](https://paas.huifu.com/partners/api/#/shgl/shjj/api_shjj_shtpsc) 接口获取，文件类型F22（店铺门头照）；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        dto.put("comp_pic1", "d1451277-85c6-3177-ac3d-a8be47b9ae9d");
        // 公司照片二公司照片二图片文件，请填写图片file_id，可通过 [商户图片上传](https://paas.huifu.com/partners/api/#/shgl/shjj/api_shjj_shtpsc) 接口获取，文件类型F24（店铺内景照）；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        dto.put("comp_pic2", "d1451277-85c6-3177-ac3d-a8be47b9ae9d");
        // 公司照片三公司照片三图片文件，请填写图片file_id，可通过 [商户图片上传](https://paas.huifu.com/partners/api/#/shgl/shjj/api_shjj_shtpsc) 接口获取，文件类型F105（店铺收银台或前台）；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        dto.put("comp_pic3", "d1451277-85c6-3177-ac3d-a8be47b9ae9d");
        // 结算卡正面结算卡正面图片文件对私结算必填，请填写图片file_id，可通过 [商户图片上传](https://paas.huifu.com/partners/api/#/shgl/shjj/api_shjj_shtpsc) 接口获取，文件类型F13；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        dto.put("settle_card_front_pic", "1277-85c6-3177-ac3d-a8be47b9ae9d");
        // 结算卡反面结算卡反面图片文件对私结算必填，请填写图片file_id，可通过 [商户图片上传](https://paas.huifu.com/partners/api/#/shgl/shjj/api_shjj_shtpsc) 接口获取，文件类型F14；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        dto.put("settle_card_back_pic", "d1451277-85c6-3177-ac3d-a8be47b9ae9d");
        // 结算人身份证正面结算人身份证正面图片文件对私结算必填，请填写图片file_id，可通过 [商户图片上传](https://paas.huifu.com/partners/api/#/shgl/shjj/api_shjj_shtpsc) 接口获取，文件类型F55；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
        dto.put("settle_cert_front_pic", "d1451277-85c6-3177-ac3d-a8be47b9ae9d");
        // 结算人身份证反面结算人身份证反面图片文件对私结算必填，请填写图片file_id，可通过 [商户图片上传](https://paas.huifu.com/partners/api/#/shgl/shjj/api_shjj_shtpsc) 接口获取，文件类型F56；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529  &lt;/font&gt;
        dto.put("settle_cert_back_pic", "d1451277-85c6-3177-ac3d-a8be47b9ae9d");
        // 银行编码
        dto.put("bank_code", "01020000");
        // 开户支行名称
        dto.put("branch_name", "中国工商银行股份有限公司上海市中山北路支行");
        // 持卡人证件号码
        dto.put("cert_no", "320923199111206319");
        // 结算人手机号
        dto.put("mp", "18221987178");

        return dto.toJSONString();
    }

    private static String getCashConfig() {
        JSONObject dto = new JSONObject();
        // 状态
        dto.put("switch_state", "1");
        // 取现手续费率（%）fix_amt与fee_rat至少填写一项，单位%，需保留小数点后两位，取值范围[0.00,100.00]，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;&lt;br/&gt;注：如果fix_amt与fee_rate都填写了则手续费&#x3D;fix_amt+支付金额\*fee_rate
        dto.put("fee_rate", "5.50");
        // 业务类型
        dto.put("cash_type", "D0");
        // 提现手续费（固定/元）
        dto.put("fix_amt", "4.00");
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "");
        // 手续费承担方
        // dto.put("out_fee_huifu_id", "");
        // 手续费外扣的账户类型
        // dto.put("out_fee_acct_type", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getSettleConfig() {
        JSONObject dto = new JSONObject();
        // 结算开关
        dto.put("settle_status", "1");
        // 结算周期
        dto.put("settle_cycle", "T1");
        // 结算手续费外扣商户号结算手续费外扣商户号，填写承担手续费的汇付商户号；当out_settle_flag&#x3D;1时必填，否则非必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123 &lt;/font&gt;
        dto.put("out_settle_huifuid", "6666000003078904");
        // 起结金额
        dto.put("min_amt", "3.00");
        // 留存金额
        dto.put("remained_amt", "22.00");
        // 结算摘要
        dto.put("settle_abstract", "我这里显示结算摘要");
        // 手续费外扣标记
        dto.put("out_settle_flag", "2");
        // 结算手续费外扣时的账户类型
        dto.put("out_settle_acct_type", "");
        // 节假日结算手续费率
        dto.put("fixed_ratio", "2.00");
        // 结算批次号
        // dto.put("settle_batch_no", "");
        // 结算方式
        // dto.put("settle_pattern", "");
        // 是否优先到账
        // dto.put("is_priority_receipt", "");
        // 自定义结算处理时间
        // dto.put("settle_time", "");

        return dto.toJSONString();
    }

    private static String getSignUserInfo() {
        JSONObject dto = new JSONObject();
        // 签约人类型
        // dto.put("type", "test");
        // 姓名
        // dto.put("name", "");
        // 手机号
        // dto.put("mobile_no", "");
        // 身份证
        // dto.put("cert_no", "");
        // 身份证照片-人像面
        // dto.put("identity_front_file_id", "");
        // 身份证照片-国徽面
        // dto.put("identity_back_file_id", "");
        // 法人授权书
        // dto.put("auth_file_id", "");

        return dto.toJSONString();
    }

}
