package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePaymentDelaytransConfirmRequest;

/**
 * 交易确认 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePaymentDelaytransConfirmRequest.class)
public class V2TradePaymentDelaytransConfirmRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePaymentDelaytransConfirmRequest request = new V2TradePaymentDelaytransConfirmRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 交易类型**原交易为快捷支付必填：QUICK_PAY**；&lt;br/&gt;**原交易为余额支付必填：ACCT_PAYMENT**；&lt;br/&gt;原交易为全域资金必填：REMITTANCE_PAY；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：ACCT_PAYMENT&lt;/font&gt;
        // request.setPayType("test");

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
        // 原交易请求日期
        extendInfoMap.put("org_req_date", "20220512");
        // 原交易请求流水号
        extendInfoMap.put("org_req_seq_id", "20220512195832E06521");
        // 原交易商户订单号
        // extendInfoMap.put("org_mer_ord_id", "");
        // 原交易全局流水号
        extendInfoMap.put("org_hf_seq_id", "");
        // 分账对象
        extendInfoMap.put("acct_split_bunch", getA7256caaCe6b490680ba86babafe4967());
        // 安全信息
        extendInfoMap.put("risk_check_data", get5dc1f4fb2ca7478382dc4811aa4903f8());
        // 备注
        extendInfoMap.put("remark", "remark123");
        // 灵活用工标志
        // extendInfoMap.put("hyc_flag", "");
        // 灵活用工平台
        // extendInfoMap.put("lg_platform_type", "");
        // 代发模式
        // extendInfoMap.put("salary_modle_type", "");
        // 落地公司商户号
        // extendInfoMap.put("bmember_id", "");
        // 乐接活请求参数集合
        // extendInfoMap.put("ljh_data", get4da1733e10a041c7Aa241338ac87fac0());
        // 异步通知地址
        // extendInfoMap.put("notify_url", "");
        return extendInfoMap;
    }

    private static JSON getF77aaa99F28d44d5820628512e341eac() {
        JSONObject dto = new JSONObject();
        // 分账金额(元)单位元，需保留小数点后两位，最低传入0.01 ，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt; ，percentage_flag非Y时必填；&lt;br/&gt;percentage_flag&#x3D;Y时div_amt不填，div_amt&#x3D;total_div_amt*percentage_div
        dto.put("div_amt", "0.01");
        // 分账接收方ID
        dto.put("huifu_id", "6666000109133323");
        // 分账百分比%
        // dto.put("percentage_div", "");
        // 分账接收方账户号
        // dto.put("acct_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getA7256caaCe6b490680ba86babafe4967() {
        JSONObject dto = new JSONObject();
        // 分账总金额（元）本次交易确认总额。需保留小数点后两位&lt;br/&gt;percentage_flag&#x3D;Y时必填。该金额与分账百分比用来计算分账金额。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：10.00&lt;/font&gt;；
        // dto.put("total_div_amt", "test");
        // 百分比分账标志
        // dto.put("percentage_flag", "");
        // 分账明细
        dto.put("acct_infos", getF77aaa99F28d44d5820628512e341eac());

        return dto.toJSONString();
    }

    private static String get5dc1f4fb2ca7478382dc4811aa4903f8() {
        JSONObject dto = new JSONObject();
        // ip地址
        // dto.put("ip_addr", "");
        // 基站地址
        dto.put("base_station", "3");
        // 纬度
        dto.put("latitude", "2");
        // 经度
        dto.put("longitude", "1");
        // 产品子类
        // dto.put("sub_product", "");
        // 转账原因
        // dto.put("transfer_type", "");

        return dto.toJSONString();
    }

    private static String get4da1733e10a041c7Aa241338ac87fac0() {
        JSONObject dto = new JSONObject();
        // 税源地ID
        // dto.put("tax_area_id", "");
        // 任务模板ID
        // dto.put("template_id", "");

        return dto.toJSONString();
    }

}
