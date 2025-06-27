package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2UserBusiOpenRequest;

/**
 * 用户业务入驻 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2UserBusiOpenRequest.class)
public class V2UserBusiOpenRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2UserBusiOpenRequest request = new V2UserBusiOpenRequest();
        // 汇付ID
        request.setHuifuId("6666000105765113");
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 渠道商/商户汇付Id
        request.setUpperHuifuId("6666000003084836");
        // 乐接活配置当合作平台为乐接活，必填
        // request.setLjhData(get392ac4cc91ff4e4499df1b8129f53b63());

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
        // 结算信息配置
        extendInfoMap.put("settle_config", get4efc24c81c7b4a29Af5003ddb8e54f81());
        // 结算卡信息
        extendInfoMap.put("card_info", get13b02e818d1d4999A1b9Bb6b6d026539());
        // 取现配置列表
        extendInfoMap.put("cash_config", get2f2cd701De284c2f8297A4a757c46872());
        // 文件列表
        extendInfoMap.put("file_list", get4bef8a345cd84606B08cB735b387281e());
        // 延迟入账开关
        // extendInfoMap.put("delay_flag", "");
        // 斗拱e账户功能配置
        // extendInfoMap.put("elec_acct_config", get10057f0084234bf7Be696035c59f6d8f());
        // 灵活用工开关
        // extendInfoMap.put("open_tax_flag", "");
        // 异步请求地址
        extendInfoMap.put("async_return_url", "");
        // 合作平台
        // extendInfoMap.put("lg_platform_type", "");
        return extendInfoMap;
    }

    private static String get4efc24c81c7b4a29Af5003ddb8e54f81() {
        JSONObject dto = new JSONObject();
        // 结算周期
        dto.put("settle_cycle", "D1");
        // 结算手续费外扣时的汇付ID外扣手续费承担方的汇付ID。外扣时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123&lt;/font&gt;
        dto.put("out_settle_huifuid", "");
        // 结算手续费外扣时的账户类型外扣手续费账户类型； 01：基本户（为空时默认值）， 05：充值户；外扣时必填；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：01&lt;/font&gt;
        dto.put("out_settle_acct_type", "");
        // 结算批次号settle_pattern为P0时必填；[参见结算批次说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_jspc)
        dto.put("settle_batch_no", "300");
        // 是否优先到账settle_pattern为P0时选填， Y：是 N：否（为空默认取值）；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：Y&lt;/font&gt;
        dto.put("is_priority_receipt", "");
        // 自定义结算处理时间settle_pattern为P1/P2时必填，注意：00:00到00:30不能指定；格式：HHmmss；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：103000&lt;/font&gt;
        dto.put("settle_time", "");
        // 节假日结算手续费率settle_cycle为D1时必填。单位%，需保留小数点后两位。取值范围[0.00，100.00]，不收费请填写0.00；settle_cycle&#x3D;T1时，不生效 ；settle_cycle为D1时，遇节假日按此费率结算 ；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;
        dto.put("fixed_ratio", "2");
        // 节假日结算手续费固定金额settle_cycle为D1时必填。单位元，需保留小数点后两位。不收费请填写0.00；settle_cycle结算周期为D1时，遇节假日按此费率结算 ；&lt;br/&gt; &lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;
        // dto.put("constant_amt", "test");
        // 起结金额
        dto.put("min_amt", "0.01");
        // 留存金额
        dto.put("remained_amt", "10.00");
        // 结算摘要
        dto.put("settle_abstract", "结算摘要");
        // 手续费外扣标记
        dto.put("out_settle_flag", "2");
        // 结算方式
        dto.put("settle_pattern", "");
        // 工作日结算手续费率
        // dto.put("workday_fixed_ratio", "");
        // 工作日结算手续费固定金额
        // dto.put("workday_constant_amt", "");

        return dto.toJSONString();
    }

    private static String get13b02e818d1d4999A1b9Bb6b6d026539() {
        JSONObject dto = new JSONObject();
        // 卡类型
        dto.put("card_type", "0");
        // 卡户名
        dto.put("card_name", "交通银行股份有限公司");
        // 卡号
        dto.put("card_no", "6217001210064762121");
        // 银行所在省
        dto.put("prov_id", "310000");
        // 银行所在市
        dto.put("area_id", "310100");
        // 银行号当card_type&#x3D;0时必填，对私可以为空[点击查看](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_yhbm)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：01040000&lt;/font&gt;
        dto.put("bank_code", "01050000");
        // 支行联行号当card_type&#x3D;0时必填，[点击查看](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_yhzhbm)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：103124075619&lt;/font&gt;
        dto.put("branch_code", "105305264815");
        // 持卡人证件类型对私必填；参见《[自然人证件类型](https://paas.huifu.com/open/doc/api/#/api_ggcsbm?id&#x3D;%e8%87%aa%e7%84%b6%e4%ba%ba%e8%af%81%e4%bb%b6%e7%b1%bb%e5%9e%8b)》说明；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：00&lt;/font&gt;
        dto.put("cert_type", "00");
        // 持卡人证件号码对私必填； 如:证件类型为身份证, 则填写身份证号码；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：320926198412032059&lt;/font&gt;
        dto.put("cert_no", "110101197003077513");
        // 持卡人证件有效期类型对私必填；1：长期有效；0：非长期有效；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0&lt;/font&gt;
        dto.put("cert_validity_type", "0");
        // 持卡人证件有效期（起始）对私必填；日期格式：yyyyMMdd，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20110112&lt;/font&gt;
        dto.put("cert_begin_date", "20210806");
        // 持卡人证件有效期（截止）当cert_validity_type&#x3D;0时必须填写；日期格式yyyyMMdd，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20110112&lt;/font&gt;&lt;br/&gt;当cert_validity_type&#x3D;1可不填
        dto.put("cert_end_date", "20410806");
        // 银行卡绑定手机号
        dto.put("mp", "15556622368");
        // 默认结算卡标志
        // dto.put("is_settle_default", "");

        return dto.toJSONString();
    }

    private static String get2f2cd701De284c2f8297A4a757c46872() {
        JSONObject dto = new JSONObject();
        // 提现手续费（固定/元）fix_amt与fee_rate至少填写一项， 需保留小数点后两位，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;注：当cash_type&#x3D;D1时为节假日取现手续费
        dto.put("fix_amt", "0.03");
        // 提现手续费率（%）fix_amt与fee_rate至少填写一项，需保留小数点后两位，取值范围[0.00,100.00]，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;注：1、如果fix_amt与fee_rate都填写了则手续费&#x3D;fix_amt+支付金额\*fee_rate2、当cash_type&#x3D;D1时为节假日取现手续费
        dto.put("fee_rate", "2");
        // D1工作日取现手续费固定金额单位元，需保留小数点后两位。不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;D1取现配置时选填，其他取现配置无效；cash_type取现类型为D1时，遇工作日按此费率结算，若未配置则默认按照节假日手续费计算
        // dto.put("weekday_fix_amt", "test");
        // D1工作日取现手续费率单位%，需保留小数点后两位。取值范围[0.00，100.00]，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;D1取现配置时选填，其他取现配置无效；cash_type取现类型为D1时，遇工作日按此费率结算 ，若未配置则默认按照节假日手续费计算
        // dto.put("weekday_fee_rate", "test");
        // 业务类型
        dto.put("cash_type", "D1");
        // 是否交易手续费外扣
        dto.put("out_fee_flag", "");
        // 手续费承担方
        dto.put("out_fee_huifu_id", "");
        // 交易手续费外扣的账户类型
        dto.put("out_fee_acct_type", "");
        // 是否优先到账
        // dto.put("is_priority_receipt", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get4bef8a345cd84606B08cB735b387281e() {
        JSONObject dto = new JSONObject();
        // 文件类型
        dto.put("file_type", "F02");
        // 文件jfileID
        dto.put("file_id", "71da066c-5d15-3658-a86d-4e85ee67808a");
        // 文件名称
        dto.put("file_name", "企业营业执照1.jpg");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static JSON get038155786dfc4801Abaf3c39fc590d48() {
        JSONObject dto = new JSONObject();
        // 银行编码
        // dto.put("bank_code", "test");
        // 支行联行号
        // dto.put("branch_code", "test");
        // 支行名称
        // dto.put("branch_name", "test");
        // 结算账户名
        // dto.put("card_name", "test");
        // 银行卡号
        // dto.put("card_no", "test");
        // 卡类型
        // dto.put("card_type", "test");
        // 银行所在省
        // dto.put("prov_id", "");
        // 银行所在市
        // dto.put("area_id", "");
        // 银行绑定手机号
        // dto.put("mp", "");
        // 默认卡标识
        // dto.put("default_cash_flag", "");
        // 用户授权协议版本号
        // dto.put("auth_version", "");
        // 用户授权协议号
        // dto.put("auth_no", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get10057f0084234bf7Be696035c59f6d8f() {
        JSONObject dto = new JSONObject();
        // 电子账户开关
        // dto.put("switch_state", "test");
        // 账户类型
        // dto.put("acct_type", "test");
        // 电子账户提现手续费承担方
        // dto.put("cash_fee_party", "test");
        // 场景
        // dto.put("scene", "test");
        // 角色类型(角色编号)
        // dto.put("role_type", "test");
        // 签约成功标志
        // dto.put("sign_success_flag", "test");
        // 银行卡信息
        // dto.put("elec_card_list", get038155786dfc4801Abaf3c39fc590d48());
        // 用户类型
        // dto.put("user_type", "");
        // 中信签约短信流水号
        // dto.put("elec_acct_sign_seq_id", "");

        return dto.toJSONString();
    }

    private static String get392ac4cc91ff4e4499df1b8129f53b63() {
        JSONObject dto = new JSONObject();
        // 税源地id当合作平台为乐接活，必填
        // dto.put("tax_area_id", "test");

        return dto.toJSONString();
    }

}
