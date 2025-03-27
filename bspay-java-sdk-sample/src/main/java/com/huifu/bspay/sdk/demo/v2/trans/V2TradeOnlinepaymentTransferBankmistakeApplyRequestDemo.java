package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeOnlinepaymentTransferBankmistakeApplyRequest;

/**
 * 银行大额支付差错申请 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeOnlinepaymentTransferBankmistakeApplyRequest.class)
public class V2TradeOnlinepaymentTransferBankmistakeApplyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeOnlinepaymentTransferBankmistakeApplyRequest request = new V2TradeOnlinepaymentTransferBankmistakeApplyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000110468104");
        // 交易金额
        request.setTransAmt("0.01");
        // 订单类型
        request.setOrderType("REFUND");
        // 原请求流水号order_flag&#x3D;Y时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：2022012514120615009&lt;/font&gt;
        request.setOrgReqSeqId("202308312345678931");
        // 原请求日期格式:yyyyMMdd；order_flag&#x3D;Y时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;
        request.setOrgReqDate("20230831");
        // 异步通知地址
        request.setNotifyUrl("http://www.baidu.com");

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
        // 下单标识
        // extendInfoMap.put("order_flag", "");
        // 备注
        extendInfoMap.put("remark", "大额支付补入账验证");
        // 银行信息数据
        extendInfoMap.put("bank_info_data", getAbecf41199e2427189e378ecb5bc0872());
        // 延时标记
        // extendInfoMap.put("delay_acct_flag", "");
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", get887cec5eC9324ee3B2b5282eb708eb87());
        // 实际打款信息
        // extendInfoMap.put("actual_remit_data", get8bcd25edC7614d4181cf7d7f6bd6e4b5());
        return extendInfoMap;
    }

    private static String getAbecf41199e2427189e378ecb5bc0872() {
        JSONObject dto = new JSONObject();
        // 银行编号
        dto.put("bank_code", "03080000");
        // 对公对私标识
        dto.put("card_acct_type", "P");

        return dto.toJSONString();
    }

    private static JSON get7cb41945E40f4907Ab1e1dd0dcfaee14() {
        JSONObject dto = new JSONObject();
        // 支付金额
        // dto.put("div_amt", "");
        // 商户号
        // dto.put("huifu_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get887cec5eC9324ee3B2b5282eb708eb87() {
        JSONObject dto = new JSONObject();
        // 分账信息列表
        // dto.put("acct_infos", get7cb41945E40f4907Ab1e1dd0dcfaee14());

        return dto.toJSONString();
    }

    private static String get8bcd25edC7614d4181cf7d7f6bd6e4b5() {
        JSONObject dto = new JSONObject();
        // 实际打款日期
        // dto.put("actual_remit_date", "test");
        // 实际打款方姓名
        // dto.put("actual_remit_name", "test");
        // 实际打款金额
        // dto.put("actual_remit_amt", "test");
        // 实际打款方银行卡号
        // dto.put("actual_remit_card_no", "test");
        // 汇款凭证文件ID
        // dto.put("certificate_file_id", "test");
        // 退款卡标识
        // dto.put("refund_card_flag", "test");
        // 实际打款卡号银行名称
        // dto.put("actual_bank_name", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
