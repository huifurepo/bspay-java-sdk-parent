package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBusiEfpconfigRequest;

/**
 * 全渠道资金管理配置 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantBusiEfpconfigRequest.class)
public class V2MerchantBusiEfpconfigRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBusiEfpconfigRequest request = new V2MerchantBusiEfpconfigRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户汇付id
        request.setHuifuId("6666000108139646");
        // 所属渠道商
        request.setUpperHuifuId("6666000108120249");
        // 支付手续费外扣汇付ID支付手续费外扣标记为1时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812123&lt;/font&gt;
        request.setOutFeeHuifuid("");
        // 全域资金开户使用的银行卡信息首次开通时必填 jsonObject格式
        request.setOutOrderAcctCard(get15450004Aee5439a91ea27335c38848e());
        // 全域资金开户手续费首次开通时必填 jsonObject格式
        request.setOutOrderAcctOpenFees(getB5b41bb39d8540b0Bc4966794b8df5ba());
        // 全渠道资金管理补充材料id涉及文件类型：[F504-全渠道资金管理补充材料](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        request.setOtherPaymentInstitutionsPic("8c4f6254-6c36-3b3c-ae8b-efcf24ca215e");
        // XW银行数字证书及电子签名授权委托书out_funds_gate_id为xw0时必填；涉及文件类型：[F534-银行数字证书及电子签名授权委托书](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setXwDigitalCertificatePic("test");
        // 银行类型
        request.setOutFundsGateId("xw0");
        // 签约人信息switch_state为1时必填 jsonObject格式
        request.setSignUserInfo(getFf52f12c32fa410b99011a3ff546d82a());
        // 入账来源
        request.setAcctSource("01");

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
        // 开关
        extendInfoMap.put("switch_state", "1");
        // 支付手续费百分比
        extendInfoMap.put("fee_rate", "0.04");
        // 支付手续费最小值
        extendInfoMap.put("fee_min_amt", "");
        // 支付手续费外扣账户类型
        extendInfoMap.put("out_fee_acct_type", "");
        // 支付手续费外扣标记
        extendInfoMap.put("out_fee_flag", "2");
        // 业务模式
        extendInfoMap.put("business_model", "acquiringMode");
        // 异步消息接收地址
        extendInfoMap.put("async_return_url", "http://service.example.com/to/path");
        // 业务开通结果异步消息接收地址
        extendInfoMap.put("busi_async_return_url", "http://service.example.com/to/path");
        // 申请单笔限额
        extendInfoMap.put("pay_every_deal", "");
        // 申请单日限额
        extendInfoMap.put("pay_every_day", "");
        // 抖音合作证明材料
        // extendInfoMap.put("dy_cooperation_prove_pic", "");
        // 美团合作证明材料
        // extendInfoMap.put("mt_cooperation_prove_pic", "");
        // 快手合作证明材料
        // extendInfoMap.put("ks_cooperation_prove_pic", "");
        // 拼多多合作证明材料
        // extendInfoMap.put("pdd_cooperation_prove_pic", "");
        // 小红书合作证明材料
        // extendInfoMap.put("xhs_cooperation_prove_pic", "");
        // 支付宝相关平台合作证明材料
        // extendInfoMap.put("zfb_cooperation_prove_pic", "");
        // 微信相关平台合作证明材料
        // extendInfoMap.put("wx_cooperation_prove_pic", "");
        // 京东合作证明材料
        // extendInfoMap.put("jd_cooperation_prove_pic", "");
        // 饿了么合作证明材料
        // extendInfoMap.put("elm_cooperation_prove_pic", "");
        // 得物合作证明材料
        // extendInfoMap.put("dw_cooperation_prove_pic", "");
        // 唯品会合作证明材料
        // extendInfoMap.put("wph_cooperation_prove_pic", "");
        // 携程合作证明材料
        // extendInfoMap.put("xc_cooperation_prove_pic", "");
        // 全域资金分账规则
        // extendInfoMap.put("efp_spb_config", get4e79720c366f4c8587218bebf0ef3080());
        // 客户ip地址
        // extendInfoMap.put("ip_address", "");
        // 是否线上场景
        // extendInfoMap.put("online_scene_flag", "");
        // 网店网址
        // extendInfoMap.put("online_store_website", "");
        // 网店名称
        // extendInfoMap.put("online_store_name", "");
        // 是否加盟连锁
        // extendInfoMap.put("franchise_chain_flag", "");
        // 交易异步应答地址
        // extendInfoMap.put("recon_resp_addr", "");
        return extendInfoMap;
    }

    private static String get15450004Aee5439a91ea27335c38848e() {
        JSONObject dto = new JSONObject();
        // 结算账户名
        dto.put("card_name", "圆务铁白事");
        // 银行卡号
        dto.put("card_no", "4340622119959288");
        // 卡类型
        dto.put("card_type", "0");
        // 银行卡绑定手机号
        dto.put("mp", "13777842539");
        // 开户许可证核准号对公卡必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：J2900123456789&lt;/font&gt;
        dto.put("open_licence_no", "123456789");
        // 银行所在省
        dto.put("prov_id", "310000");
        // 银行所在市
        dto.put("area_id", "310100");
        // 银行编码
        dto.put("bank_code", "01050000");
        // 支行联行号
        dto.put("branch_code", "105290071113");
        // 支行名称
        dto.put("branch_name", "中国建设银行股份有限公司上海市中支行");
        // 持卡人证件有效期（起始）
        dto.put("cert_begin_date", "20240314");
        // 持卡人证件有效期（截止）
        dto.put("cert_end_date", "");
        // 持卡人证件号码
        dto.put("cert_no", "340000199810170714");
        // 持卡人证件类型
        dto.put("cert_type", "00");
        // 持卡人证件有效期类型
        dto.put("cert_validity_type", "1");

        return dto.toJSONString();
    }

    private static String getB5b41bb39d8540b0Bc4966794b8df5ba() {
        JSONObject dto = new JSONObject();
        // 开户固定手续费(元)
        dto.put("fee_fix_amt", "0");
        // 开户手续费外扣时的账户类型
        dto.put("out_fee_acct_type", "");
        // 开户手续费外扣汇付ID
        dto.put("out_fee_huifuid", "");

        return dto.toJSONString();
    }

    private static String getFf52f12c32fa410b99011a3ff546d82a() {
        JSONObject dto = new JSONObject();
        // 签约人类型
        dto.put("type", "LEGAL");
        // 签约人手机号
        dto.put("mobile_no", "13777842539");
        // 签约人姓名签约人类型为OTHER时必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：张三&lt;/font&gt;
        // dto.put("name", "test");
        // 签约人身份证签约人类型为OTHER时必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：321012313213222133&lt;/font&gt;
        // dto.put("cert_no", "test");

        return dto.toJSONString();
    }

    private static String get3aad6229A4ae4cde92287d824f92ef1c() {
        JSONObject dto = new JSONObject();
        // 分账接收方汇付ID
        // dto.put("huifu_id", "test");
        // 分账接收方账户类型
        // dto.put("acct_type", "test");
        // 分账比例(百分比)
        // dto.put("split_bill_rate", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get4e79720c366f4c8587218bebf0ef3080() {
        JSONObject dto = new JSONObject();
        // 分账规则来源
        // dto.put("rule_origin", "test");
        // 全域资金分账手续费外扣标记1:外扣 2:内扣 规则来源为01时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1&lt;/font&gt;；
        // dto.put("out_fee_flag", "test");
        // 全域资金分账内扣规则01-商户承担02-分账接收方承担 交易手续费外扣标记为2时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：01&lt;/font&gt;；
        // dto.put("in_fee_rule", "test");
        // 全域资金分账手续费外扣汇付ID交易手续费外扣标记为1时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812123&lt;/font&gt;；
        // dto.put("out_fee_huifuid", "test");
        // 全域资金分账手续费外扣账户类型交易手续费外扣标记为1时必填 01-基本户05-充值户 09-营销户；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：01&lt;/font&gt;；
        // dto.put("out_fee_acct_type", "test");
        // 分账规则明细规则来源为01时必填 jsonArray格式 最多7条
        // dto.put("rule_detail", get3aad6229A4ae4cde92287d824f92ef1c());

        return dto.toJSONString();
    }

}
