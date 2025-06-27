package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2UserBusiModifyRequest;

/**
 * 用户业务入驻修改 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2UserBusiModifyRequest.class)
public class V2UserBusiModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2UserBusiModifyRequest request = new V2UserBusiModifyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 渠道商/商户汇付Id
        request.setUpperHuifuId("6666000104633228");
        // 汇付ID
        request.setHuifuId("6666000104896342");
        // 乐接活配置当合作平台为乐接活，必填
        // request.setLjhData(get227ff58e9d324d2dAd101f2bd69dc897());
        // 签约人信息当电子回单配置开关为开通时必填
        // request.setSignUserInfo(getB1ac007bC0c44d0eBcdb3aefb3cd39dd());

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
        extendInfoMap.put("settle_config", get992b137833674f96A560Ee630d0ae64e());
        // 结算卡信息
        extendInfoMap.put("card_info", get4734bf2969a34ee8866fC3d3361636a5());
        // 取现配置列表
        extendInfoMap.put("cash_config", get2e4aca2655154384A4b740c12d965e9f());
        // 文件列表
        extendInfoMap.put("file_list", getC60fa582Fe1a4905A048C62f2188a0ce());
        // 延迟入账开关
        // extendInfoMap.put("delay_flag", "");
        // 异步请求地址
        extendInfoMap.put("async_return_url", "//http://service.example.com/to/path");
        // 斗拱e账户功能配置
        // extendInfoMap.put("elec_acct_config", getB07e8323Ca1d4338Ab36A6e7081b9477());
        // 灵活用工开关
        // extendInfoMap.put("open_tax_flag", "");
        // 合作平台
        // extendInfoMap.put("lg_platform_type", "");
        // 电子回单配置
        // extendInfoMap.put("elec_receipt_config", get6682326eC7ed43f29630Eb4a03e4f92f());
        return extendInfoMap;
    }

    private static String get992b137833674f96A560Ee630d0ae64e() {
        JSONObject dto = new JSONObject();
        // 开通状态
        dto.put("settle_status", "1");
        // 结算周期
        dto.put("settle_cycle", "D1");
        // 结算批次号settle_pattern为P0时必填；[参见结算批次说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_jspc)
        dto.put("settle_batch_no", "0");
        // 是否优先到账settle_pattern为P0时选填， Y：是 N：否（为空默认取值）；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：Y&lt;/font&gt;
        dto.put("is_priority_receipt", "Y");
        // 自定义结算处理时间settle_pattern为P1/P2时必填，注意：00:00到00:30不能指定；格式：HHmmss；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：103000&lt;/font&gt;
        dto.put("settle_time", "");
        // 节假日结算手续费率settle_cycle为D1时必填。单位%，需保留小数点后两位。取值范围[0.00，100.00]，不收费请填写0.00；settle_cycle&#x3D;T1时，不生效 ；settle_cycle为D1时，遇节假日按此费率结算 ；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;
        dto.put("fixed_ratio", "0.1");
        // 节假日结算手续费固定金额settle_cycle为D1时必填。单位元，需保留小数点后两位。不收费请填写0.00；settle_cycle结算周期为D1时，遇节假日按此费率结算 ；&lt;br/&gt; &lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;
        // dto.put("constant_amt", "test");
        // 起结金额
        dto.put("min_amt", "0.1");
        // 结算手续费外扣时的账户类型
        dto.put("out_settle_acct_type", "05");
        // 手续费外扣标记
        dto.put("out_settle_flag", "1");
        // 结算手续费外扣时的汇付ID
        dto.put("out_settle_huifuid", "6666000104633228");
        // 留存金额
        dto.put("remained_amt", "0.1");
        // 结算摘要
        dto.put("settle_abstract", "吃吃");
        // 结算方式
        dto.put("settle_pattern", "P0");
        // 工作日结算手续费率
        // dto.put("workday_fixed_ratio", "");
        // 工作日结算手续费固定金额
        // dto.put("workday_constant_amt", "");

        return dto.toJSONString();
    }

    private static String get4734bf2969a34ee8866fC3d3361636a5() {
        JSONObject dto = new JSONObject();
        // 卡类型
        dto.put("card_type", "0");
        // 卡户名
        dto.put("card_name", "陈立一");
        // 卡号
        dto.put("card_no", "6217001210064762000");
        // 银行所在省
        dto.put("prov_id", "310000");
        // 银行所在市
        dto.put("area_id", "310100");
        // 银行号当card_type&#x3D;0时必填，对私可以为空；[参见银行编码](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_yhbm)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：01020000&lt;/font&gt;
        dto.put("bank_code", "01050000");
        // 支行联行号当card_type&#x3D;0时必填，[点击查看](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_yhzhbm)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：102290026507&lt;/font&gt;
        dto.put("branch_code", "105305264815");
        // 持卡人证件类型
        dto.put("cert_type", "00");
        // 持卡人证件号码
        dto.put("cert_no", "110101197003077000");
        // 持卡人证件有效期类型
        dto.put("cert_validity_type", "0");
        // 持卡人证件有效期起始日期
        dto.put("cert_begin_date", "20210806");
        // 持卡人证件有效期截止日期
        dto.put("cert_end_date", "20410806");
        // 银行卡绑定手机号
        dto.put("mp", "15556622000");
        // 默认结算卡标志
        // dto.put("is_settle_default", "");

        return dto.toJSONString();
    }

    private static String get2e4aca2655154384A4b740c12d965e9f() {
        JSONObject dto = new JSONObject();
        // 开通状态
        dto.put("switch_state", "1");
        // 提现手续费（固定/元）fix_amt与fee_rate至少填写一项， 需保留小数点后两位，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;注：当cash_type&#x3D;D1时为节假日取现手续费
        dto.put("fix_amt", "3");
        // 提现手续费率（%）fix_amt与fee_rate至少填写一项，需保留小数点后两位，取值范围[0.00,100.00]，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;注：1、如果fix_amt与fee_rate都填写了则手续费&#x3D;fix_amt+支付金额\*fee_rate2、当cash_type&#x3D;D1时为节假日取现手续费
        dto.put("fee_rate", "0.05");
        // D1工作日取现手续费固定金额单位元，需保留小数点后两位。不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;cash_type&#x3D;D1时，不生效 ；cash_type取现类型为D1时，遇工作日按此费率结算，若未配置则默认按照节假日手续费计算
        // dto.put("weekday_fix_amt", "test");
        // D1工作日取现手续费率单位%，需保留小数点后两位。取值范围[0.00，100.00]，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;cash_type&#x3D;D1时，不生效 ；cash_type取现类型为D1时，遇工作日按此费率结算 ，若未配置则默认按照节假日手续费计算
        // dto.put("weekday_fee_rate", "test");
        // 业务类型
        dto.put("cash_type", "D0");
        // 是否交易手续费外扣
        dto.put("out_fee_flag", "1");
        // 手续费承担方
        dto.put("out_fee_huifu_id", "6666000104633228");
        // 交易手续费外扣的账户类型
        dto.put("out_fee_acct_type", "05");
        // 是否优先到账
        // dto.put("is_priority_receipt", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getC60fa582Fe1a4905A048C62f2188a0ce() {
        JSONObject dto = new JSONObject();
        // 文件类型
        dto.put("file_type", "F02");
        // 文件jfileID
        dto.put("file_id", "99e00421-dad7-3334-9538-4f2ad10612d5");
        // 文件名称
        dto.put("file_name", "企业营业执照1.jpg");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static JSON get5672df459a9c4682991eA2d89c821531() {
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

    private static String getB07e8323Ca1d4338Ab36A6e7081b9477() {
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
        // 电子账户开通状态
        // dto.put("bank_status", "test");
        // 银行卡信息
        // dto.put("elec_card_list", get5672df459a9c4682991eA2d89c821531());
        // 银行信息
        // dto.put("bank_message", "");
        // 中信签约短信流水号
        // dto.put("elec_acct_sign_seq_id", "");
        // 签约成功标志
        // dto.put("sign_success_flag", "");

        return dto.toJSONString();
    }

    private static String get227ff58e9d324d2dAd101f2bd69dc897() {
        JSONObject dto = new JSONObject();
        // 税源地id当合作平台为乐接活，必填
        // dto.put("tax_area_id", "test");

        return dto.toJSONString();
    }

    private static JSON get6682326eC7ed43f29630Eb4a03e4f92f() {
        JSONObject dto = new JSONObject();
        // 电子回单开关
        // dto.put("switch_state", "test");

        return dto;
    }

    private static JSON getB1ac007bC0c44d0eBcdb3aefb3cd39dd() {
        JSONObject dto = new JSONObject();
        // 签约人类型
        // dto.put("type", "test");
        // 签约人手机号
        // dto.put("mobile_no", "test");
        // 签约人身份证
        // dto.put("cert_no", "");
        // 签约人姓名
        // dto.put("name", "");

        return dto;
    }

}
