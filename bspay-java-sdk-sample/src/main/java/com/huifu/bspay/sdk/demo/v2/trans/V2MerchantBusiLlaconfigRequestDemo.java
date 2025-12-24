package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBusiLlaconfigRequest;

/**
 * 代运营代扣业务配置 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantBusiLlaconfigRequest.class)
public class V2MerchantBusiLlaconfigRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBusiLlaconfigRequest request = new V2MerchantBusiLlaconfigRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户汇付id
        request.setHuifuId("6666000123123123");
        // 所属渠道商
        request.setUpperHuifuId("6666000109812120");
        // 代运营配置json字符串，业务角色为AGENCY:代运营时必填
        // request.setLlaAgencyConfig(get15beffc28d39428cA44fC4cbd476b5c3());
        // 商家配置json字符串，业务角色为MERCHANT:商家时必填
        request.setLlaMerchantConfig(getD955cca1Bb5248be8fab9e7b96593480());
        // 纸质协议文件协议类型为纸质且业务角色不为空时必填，文件类型F633；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // request.setPaperAgreementFile("test");
        // 签约人信息json字符串，协议类型为电子时必填
        request.setSignUserInfo(get152fc503351e411cBb1433ff7dd3a4c7());

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
        // 业务角色
        extendInfoMap.put("busi_role", "MERCHANT");
        // 协议类型
        extendInfoMap.put("agreement_type", "0");
        // 审核异步消息接收地址
        // extendInfoMap.put("audit_async_return_url", "");
        // 电子协议签约链接异步通知地址
        // extendInfoMap.put("agreement_async_return_url", "");
        // 交易异步应答地址
        // extendInfoMap.put("recon_resp_addr", "");
        return extendInfoMap;
    }

    private static String get15beffc28d39428cA44fC4cbd476b5c3() {
        JSONObject dto = new JSONObject();
        // 代运营配置开关
        // dto.put("switch_state", "test");
        // 佣金手续费百分比代运营配置开关为开时必填,[0-100]区间的数,小数位最多两位 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;；&lt;br/&gt;
        // dto.put("fee_rate", "test");
        // 佣金手续费内外扣标记代运营配置开关为开时必填,1:外扣 2:内扣 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：2&lt;/font&gt;；&lt;br/&gt;
        // dto.put("out_fee_flag", "test");
        // 佣金手续费外扣汇付ID佣金手续费内外扣标记为 1:外扣时必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812120&lt;/font&gt;
        // dto.put("out_fee_huifuid", "test");
        // 佣金手续费外扣子账户类型01-基本户，05-充值户，09：营销户，佣金手续费内外扣标记为 1:外扣时必填 &lt;font color&#x3D;&quot;green&quot;&gt;示例值：01&lt;/font&gt;
        // dto.put("out_fee_acct_type", "test");
        // 商家与代运营合作协议代运营配置开关为开时必填，商家与代运营方的扣款协议，文件类型F634；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // dto.put("ma_cooperation_agreement_file", "test");
        // 代运营服务证明材料代运营配置开关为开时必填，文件类型F635；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        // dto.put("agency_service_prove_file", "test");

        return dto.toJSONString();
    }

    private static JSON getEcdf2f447bdd4595A23cF5e5b837b2cf() {
        JSONObject dto = new JSONObject();
        // 抖音来客配置开关
        dto.put("switch_state", "1");
        // 关联代运营汇付id抖音来客配置开关为开时必填,&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812124&lt;/font&gt;
        dto.put("agency_huifu_id", "6666000109812124");
        // 代扣卡token抖音来客配置开关为开时必填
        dto.put("token_no", "32231131111");
        // 抖音账户号
        dto.put("dy_acct_no", "132123111");
        // 抖音网店名称抖音来客配置开关为开时必填
        dto.put("dy_online_store_name", "网店名称");
        // 抖音业务类型
        dto.put("dy_busi_type", "1");
        // 商家与代运营合作协议(抖音来客)抖音来客配置开关为开时必填，商家与代运营方的扣款协议，文件类型F636；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        dto.put("madylk_cooperation_agreement_file", "57cc7f00-600a-33ab-b614-6221bbf2e530");
        // 商家抖音来客平台材料抖音来客配置开关为开时必填，提供商家在抖音来客平台的店铺名称、结算账户截图、经营照片等信息，文件类型F637；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
        dto.put("merchant_dylk_file", "57cc7f00-600a-33ab-b614-6221bbf2e530");

        return dto;
    }

    private static String getD955cca1Bb5248be8fab9e7b96593480() {
        JSONObject dto = new JSONObject();
        // 商家配置开关
        dto.put("switch_state", "1");
        // 最大代扣比例(0,100]区间的整数,商家配置开关为开时必填&lt;font color&#x3D;&quot;green&quot;&gt;示例值：50&lt;/font&gt;
        dto.put("max_withhold_percent", "50");
        // 抖音来客配置json对象,商家配置开关为开时,抖音来客配置和美团外卖配置不能都为空
        dto.put("lla_dylk_config", getEcdf2f447bdd4595A23cF5e5b837b2cf());

        return dto.toJSONString();
    }

    private static String get152fc503351e411cBb1433ff7dd3a4c7() {
        JSONObject dto = new JSONObject();
        // 签约人类型
        dto.put("type", "LEGAL");
        // 签约人手机号
        dto.put("mobile_no", "18611111111");
        // 签约人邮箱
        // dto.put("email", "");

        return dto.toJSONString();
    }

}
