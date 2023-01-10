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
 * 交易确认接口 - 示例
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
        request.setHuifuId("6666000103423237");

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
        extendInfoMap.put("org_req_date", "20221108");
        // 原交易请求流水号
        extendInfoMap.put("org_req_seq_id", "2022072724398620211667900766");
        // 原交易全局流水号
        extendInfoMap.put("org_hf_seq_id", "");
        // 分账对象
        extendInfoMap.put("acct_split_bunch", getAcctSplitBunch());
        // 安全信息
        extendInfoMap.put("risk_check_data", getRiskCheckData());
        // 交易类型
        // extendInfoMap.put("pay_type", "");
        // 备注
        extendInfoMap.put("remark", "remark123");
        // 原交易商户订单号
        // extendInfoMap.put("org_mer_ord_id", "");
        return extendInfoMap;
    }

    private static JSON getAcctInfosRucan() {
        JSONObject dto = new JSONObject();
        // 分账金额
        dto.put("div_amt", "0.01");
        // 被分账方ID
        dto.put("huifu_id", "6666000103423237");
        // 被分账方账户号
        dto.put("acct_id", "C01400109");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getAcctSplitBunch() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", getAcctInfosRucan());

        return dto.toJSONString();
    }

    private static String getRiskCheckData() {
        JSONObject dto = new JSONObject();
        // ip地址
        // dto.put("ip_addr", "");
        // 基站地址
        // dto.put("base_atation", "");
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

}
