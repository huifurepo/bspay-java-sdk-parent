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
        // 开关
        request.setSwitchState("1");
        // 自动入账开关0:关闭 1:开通；switch_state为1时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1&lt;/font&gt;
        request.setOutOrderAutoAcctFlag("1");
        // 支付手续费外扣汇付ID支付手续费外扣标记为1时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812123&lt;/font&gt;
        request.setOutFeeHuifuid("");
        // 全域资金开户使用的银行卡信息首次开通时必填 jsonObject格式
        request.setOutOrderAcctCard("{\"area_id\":\"310100\",\"card_name\":\"圆务铁白事\",\"card_no\":\"4340622119959288\",\"card_type\":\"0\",\"prov_id\":\"310000\",\"bank_code\":\"01050000\",\"branch_code\":\"105290071113\",\"branch_name\":\"中国建设银行股份有限公司上海市中支行\",\"cert_begin_date\":\"20240314\",\"cert_end_date\":\"\",\"cert_no\":\"340000199810170714\",\"cert_type\":\"00\",\"cert_validity_type\":\"1\",\"mp\":\"13777842539\",\"open_licence_no\":\"123456789\"}");
        // 全域资金开户手续费首次开通时必填 jsonObject格式
        request.setOutOrderAcctOpenFees("{\"fee_fix_amt\":\"0\",\"out_fee_acct_type\":\"\",\"out_fee_huifuid\":\"\"}");
        // 全渠道资金管理补充材料id涉及文件类型：[F504-全渠道资金管理补充材料](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        request.setOtherPaymentInstitutionsPic("8c4f6254-6c36-3b3c-ae8b-efcf24ca215e");
        // 新网银行数字证书及电子签名授权委托书out_funds_gate_id为xw0时必填；涉及文件类型：[F534-银行数字证书及电子签名授权委托书](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setXwDigitalCertificatePic("test");
        // 银行类型
        request.setOutFundsGateId("xw0");
        // 签约人信息switch_state为1时必填 jsonObject格式
        request.setSignUserInfo("{\"type\":\"LEGAL\",\"mobile_no\":\"13777842539\"}");
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
        // 全域资金分账规则
        // extendInfoMap.put("efp_spb_config", "");
        return extendInfoMap;
    }

}
