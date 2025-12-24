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
        request.setOutOrderAcctCard(getBbdf0aaaC9024de885de77f32236a24b());
        // 全域资金开户手续费首次开通时必填 jsonObject格式
        request.setOutOrderAcctOpenFees(getC8760c77B61f4112Acd1E66dcb97a14a());
        // 业务模式acquiringMode:收单模式 switch_state为1时必填
        request.setBusinessModel("acquiringMode");
        // 银行类型switch_state有值时需填写； ht1-华通银行，xw0-XW银行，ss0-苏商银行；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：ht1&lt;/font&gt;
        request.setOutFundsGateId("xw0");
        // 签约人信息switch_state为1时必填 jsonObject格式
        request.setSignUserInfo(get1efc2b7747644a5cB28e12d9a749fb34());
        // 入账来源开通全域资金时需填写；01:抖音 02:美团 03:快手 04:拼多多 05:小红书 06:淘宝/天猫/飞猪 07:微信视频号/微信小店 08:京东 09:饿了么 11:得物 12:唯品会 13:携程 14:支付宝直连 15:微信直连 16:滴滴加油 17:团油 18:通联 19:易宝 20:百度 21:顺丰22:希音23:高德 多个逗号分隔；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：01,02,05&lt;/font&gt;；
        request.setAcctSource("01");
        // 抖音合作证明材料入账来源包含01:抖音时必填 文件类型F535；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setDyCooperationProvePic("test");
        // 美团合作证明材料入账来源包含02:美团时必填 文件类型F536；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setMtCooperationProvePic("test");
        // 快手合作证明材料入账来源包含03:快手时必填 文件类型F537；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setKsCooperationProvePic("test");
        // 拼多多合作证明材料入账来源包含04:拼多多时必填 文件类型F538；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setPddCooperationProvePic("test");
        // 小红书合作证明材料入账来源包含05:小红书时必填 文件类型F539；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setXhsCooperationProvePic("test");
        // 淘宝天猫飞猪合作证明材料入账来源包含06:淘宝天猫飞猪时必填 文件类型F540；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setZfbCooperationProvePic("test");
        // 微信视频号合作证明材料入账来源包含07:微信视频号时必填 文件类型F541；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setWxCooperationProvePic("test");
        // 京东合作证明材料入账来源包含08:京东时必填 文件类型F542；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setJdCooperationProvePic("test");
        // 饿了么合作证明材料入账来源包含09:饿了么时必填 文件类型F543；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setElmCooperationProvePic("test");
        // 得物合作证明材料入账来源包含11:得物时必填 文件类型F591；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setDwCooperationProvePic("test");
        // 唯品会合作证明材料入账来源包含12:唯品会时必填 文件类型F592；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setWphCooperationProvePic("test");
        // 携程合作证明材料入账来源包含13:携程时必填 文件类型F593；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setXcCooperationProvePic("test");
        // 支付宝直连合作证明材料入账来源包含14:支付宝直连时必填 文件类型F594；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setZfbzlCooperationProvePic("test");
        // 微信直连合作证明材料入账来源包含15:微信直连时必填 文件类型F595；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setWxzlCooperationProvePic("test");
        // 滴滴加油合作证明材料入账来源包含16:滴滴加油时必填 文件类型F596；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setDdjyCooperationProvePic("test");
        // 团油合作证明材料入账来源包含17:团油时必填 文件类型F597；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setTyCooperationProvePic("test");
        // 通联合作证明材料入账来源包含18:通联时必填 文件类型F598；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setTlCooperationProvePic("test");
        // 易宝合作证明材料入账来源包含19:易宝时必填 文件类型F599；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setYbCooperationProvePic("test");
        // 全渠道资金纸质协议文件协议类型为纸质时必填，文件类型F605；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setEfpPaperAgreementFile("test");
        // 百度合作证明材料入账来源包含20:百度时必填 文件类型F616；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setBdCooperationProvePic("test");
        // 主店商户号是否店群为是时必填
        // request.setMainStoreHuifuId("test");
        // 顺丰合作证明材料入账来源包含21:顺丰时必填 文件类型F618；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setSfCooperationProvePic("test");
        // 希音合作证明材料入账来源包含22:希音时必填 文件类型F619；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setXyCooperationProvePic("test");
        // 高德合作证明材料入账来源包含23:高德时必填 文件类型F615；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setGdCooperationProvePic("test");

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
        // 全渠道资金管理补充材料id
        extendInfoMap.put("other_payment_institutions_pic", "8c4f6254-6c36-3b3c-ae8b-efcf24ca215e");
        // XW银行数字证书及电子签名授权委托书
        // extendInfoMap.put("xw_digital_certificate_pic", "");
        // 异步消息接收地址
        extendInfoMap.put("async_return_url", "http://service.example.com/to/path");
        // 业务开通结果异步消息接收地址
        extendInfoMap.put("busi_async_return_url", "http://service.example.com/to/path");
        // 申请单笔限额
        extendInfoMap.put("pay_every_deal", "");
        // 申请单日限额
        extendInfoMap.put("pay_every_day", "");
        // 全域资金分账规则
        // extendInfoMap.put("efp_spb_config", getB407724e0e4644e08d520fcdd7932d21());
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
        // 协议类型
        // extendInfoMap.put("agreement_type", "");
        // 全域资金取现手续费配置
        // extendInfoMap.put("efp_encash_fee_config", getC51d3b223ba942a4A1e47deab78dc490());
        // 全域资金付款手续费配置
        // extendInfoMap.put("efp_payment_fee_config", get8a168bac8d3b46078ad91c6c29da43e1());
        // 纸质协议开始日期
        // extendInfoMap.put("agree_begin_date", "");
        // 纸质协议结束日期
        // extendInfoMap.put("agree_end_date", "");
        // 是否店群
        // extendInfoMap.put("store_group_flag", "");
        // 商户经营类型
        // extendInfoMap.put("store_busi_type", "");
        // 行业类型
        // extendInfoMap.put("store_industry_type", "");
        // 经营信息材料
        // extendInfoMap.put("management_file", "");
        // 全域资金分账手续费配置
        // extendInfoMap.put("efp_spb_fee_config", getC1edd560Bc6a4488998dAcedd6da2f89());
        return extendInfoMap;
    }

    private static String getBbdf0aaaC9024de885de77f32236a24b() {
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

    private static String getC8760c77B61f4112Acd1E66dcb97a14a() {
        JSONObject dto = new JSONObject();
        // 开户固定手续费(元)
        dto.put("fee_fix_amt", "0");
        // 开户手续费外扣时的账户类型
        dto.put("out_fee_acct_type", "");
        // 开户手续费外扣汇付ID
        dto.put("out_fee_huifuid", "");

        return dto.toJSONString();
    }

    private static String get1efc2b7747644a5cB28e12d9a749fb34() {
        JSONObject dto = new JSONObject();
        // 签约人类型
        dto.put("type", "LEGAL");
        // 签约人手机号
        dto.put("mobile_no", "13777842539");
        // 签约人姓名签约人类型为OTHER时必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：张三&lt;/font&gt;
        // dto.put("name", "test");
        // 签约人身份证签约人类型为OTHER时必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：321012313213222133&lt;/font&gt;
        // dto.put("cert_no", "test");
        // 签约人邮箱
        // dto.put("email", "");

        return dto.toJSONString();
    }

    private static String getEbe7a585672047a8B0f392fec60c44a0() {
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

    private static String getB407724e0e4644e08d520fcdd7932d21() {
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
        // dto.put("rule_detail", getEbe7a585672047a8B0f392fec60c44a0());

        return dto.toJSONString();
    }

    private static String getC51d3b223ba942a4A1e47deab78dc490() {
        JSONObject dto = new JSONObject();
        // 全域资金取现手续费百分比
        // dto.put("fee_rate", "test");
        // 全域资金取现手续费固定值
        // dto.put("fee_fix_amt", "test");
        // 全域资金取现手续费收取类型
        // dto.put("fee_charge_type", "test");
        // 全域资金取现手续费内外扣标记
        // dto.put("out_fee_flag", "test");
        // 全域资金取现手续费外扣汇付ID全域资金取现手续费内外扣标记为1:外扣时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812123&lt;/font&gt;
        // dto.put("out_fee_huifuid", "test");
        // 全域资金取现手续费外扣子账户号全域资金取现手续费内外扣标记为1:外扣时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：F00598600&lt;/font&gt;
        // dto.put("out_fee_acctid", "test");

        return dto.toJSONString();
    }

    private static String get8a168bac8d3b46078ad91c6c29da43e1() {
        JSONObject dto = new JSONObject();
        // 全域资金付款手续费百分比
        // dto.put("fee_rate", "test");
        // 全域资金付款手续费固定值
        // dto.put("fee_fix_amt", "test");
        // 全域资金付款手续费收取类型
        // dto.put("fee_charge_type", "test");
        // 全域资金付款手续费内外扣标记
        // dto.put("out_fee_flag", "test");
        // 全域资金付款手续费外扣汇付ID全域资金付款手续费内外扣标记为1:外扣时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812123&lt;/font&gt;
        // dto.put("out_fee_huifuid", "test");
        // 全域资金付款手续费外扣子账户号全域资金付款手续费内外扣标记为1:外扣时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：F00598600&lt;/font&gt;
        // dto.put("out_fee_acctid", "test");

        return dto.toJSONString();
    }

    private static String getC1edd560Bc6a4488998dAcedd6da2f89() {
        JSONObject dto = new JSONObject();
        // 全域资金分账配置开关
        // dto.put("switch_state", "test");
        // 全域资金分账手续费百分比全域资金分账配置开关为开时必填，0-100之间的数,&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.21&lt;/font&gt;
        // dto.put("fee_rate", "test");
        // 全域资金分账手续费固定值全域资金分账配置开关为开时必填，整数位最多12位，小数位最多2位；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;
        // dto.put("fee_fix_amt", "test");

        return dto.toJSONString();
    }

}
