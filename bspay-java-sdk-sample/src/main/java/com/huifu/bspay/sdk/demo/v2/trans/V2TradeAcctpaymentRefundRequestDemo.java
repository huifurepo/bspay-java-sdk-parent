package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeAcctpaymentRefundRequest;

/**
 * 余额支付退款 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeAcctpaymentRefundRequest.class)
public class V2TradeAcctpaymentRefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeAcctpaymentRefundRequest request = new V2TradeAcctpaymentRefundRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000108854952");
        // 原余额支付请求日期
        request.setOrgReqDate("20211021");
        // 退款金额
        request.setOrdAmt("0.01");

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
        // 备注
        extendInfoMap.put("remark", "1234567890");
        // 原余额支付请求流水号
        extendInfoMap.put("org_req_seq_id", "202110210012100005");
        // 原余额支付支付全局流水号
        extendInfoMap.put("org_hf_seq_id", "");
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", getAcctSplitBunch());
        // 安全信息
        extendInfoMap.put("risk_check_data", getRiskCheckData());
        return extendInfoMap;
    }

    private static String getAcctSplitBunch() {
        JSONObject dto = new JSONObject();
        // 退账明细
        // dto.put("acct_infos", getAcctInfos());

        return dto.toJSONString();
    }

    private static String getRiskCheckData() {
        JSONObject dto = new JSONObject();
        // 转账原因
        dto.put("transfer_type", "04");
        // 产品子类
        dto.put("sub_product", "卡券推广类");

        return dto.toJSONString();
    }

    private static JSON getAcctInfos() {
        JSONObject dto = new JSONObject();
        // 退款金额
        // dto.put("div_amt", "test");
        // 退款方ID
        // dto.put("huifu_id", "test");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

}
