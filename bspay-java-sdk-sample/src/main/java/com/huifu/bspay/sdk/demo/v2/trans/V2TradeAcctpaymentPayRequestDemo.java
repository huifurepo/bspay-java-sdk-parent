package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeAcctpaymentPayRequest;

/**
 * 余额支付 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeAcctpaymentPayRequest.class)
public class V2TradeAcctpaymentPayRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeAcctpaymentPayRequest request = new V2TradeAcctpaymentPayRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 出款方商户号
        request.setOutHuifuId("6666000018344461");
        // 支付金额
        request.setOrdAmt("0.01");
        // 分账对象
        request.setAcctSplitBunch(getAcctSplitBunch());
        // 安全信息
        request.setRiskCheckData(getRiskCheckData());
        // 资金类型资金类型。支付渠道为中信E管家时，资金类型必填（[详见说明](https://paas.huifu.com/partners/api/#/yuer/api_zxegjzllx)）
        // request.setFundType("test");
        // 手续费承担方标识余额支付手续费承担方标识；商户余额支付扣收规则为接口指定承担方时必填！枚举值：&lt;br/&gt;OUT：出款方；&lt;br/&gt;IN：分账接受方。&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：IN&lt;/font&gt;
        // request.setTransFeeTakeFlag("test");

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
        // ~~发起方商户号~~
        // extendInfoMap.put("~~huifu_id~~", "");
        // 商品描述
        // extendInfoMap.put("good_desc", "");
        // 备注
        // extendInfoMap.put("remark", "");
        // 是否延迟交易
        // extendInfoMap.put("delay_acct_flag", "");
        // 出款方账户号
        // extendInfoMap.put("out_acct_id", "");
        // 支付渠道
        // extendInfoMap.put("acct_channel", "");
        // 灵活用工标志
        // extendInfoMap.put("hyc_flag", "");
        // 代发模式
        // extendInfoMap.put("salary_modle_type", "");
        // 落地公司商户号
        // extendInfoMap.put("bmember_id", "");
        // 异步通知地址
        // extendInfoMap.put("notify_url", "");
        return extendInfoMap;
    }

    private static JSON getAcctInfos() {
        JSONObject dto = new JSONObject();
        // 分账金额
        dto.put("div_amt", "0.01");
        // 分账接收方ID
        dto.put("huifu_id", "6666000018344461");
        // 账户号
        // dto.put("acct_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getAcctSplitBunch() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", getAcctInfos());

        return dto.toJSONString();
    }

    private static String getRiskCheckData() {
        JSONObject dto = new JSONObject();
        // 转账原因
        dto.put("transfer_type", "04");
        // 产品子类
        dto.put("sub_product", "1");
        // 纬度
        // dto.put("latitude", "");
        // 经度
        // dto.put("longitude", "");
        // 基站地址
        // dto.put("base_station", "");
        // IP地址
        // dto.put("ip_addr", "");

        return dto.toJSONString();
    }

}
