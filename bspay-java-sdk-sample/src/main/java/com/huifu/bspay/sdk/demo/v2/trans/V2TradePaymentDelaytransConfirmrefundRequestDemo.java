package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradePaymentDelaytransConfirmrefundRequest;

/**
 * 交易确认退款 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradePaymentDelaytransConfirmrefundRequest.class)
public class V2TradePaymentDelaytransConfirmrefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradePaymentDelaytransConfirmrefundRequest request = new V2TradePaymentDelaytransConfirmrefundRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 商户号
        request.setHuifuId("6666000109133323");
        // 原交易请求日期
        request.setOrgReqDate("20240513");
        // 原交易请求流水号
        request.setOrgReqSeqId("20240513105825239x0lp7ldbus4sji");

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
        // 分账对象
        extendInfoMap.put("acct_split_bunch", get52147df86c694d86B9305a431b675f29());
        // 是否垫资退款
        // extendInfoMap.put("loan_flag", "");
        // 垫资承担者
        // extendInfoMap.put("loan_undertaker", "");
        // 垫资账户类型
        // extendInfoMap.put("loan_acct_type", "");
        // 备注
        // extendInfoMap.put("remark", "");
        return extendInfoMap;
    }

    private static JSON get8b3eddeaB8474c7f905e858f0050be27() {
        JSONObject dto = new JSONObject();
        // 分账接收方ID
        dto.put("huifu_id", "6666000109133323");
        // 分账金额(元)
        dto.put("div_amt", "0.01");
        // 垫资金额(元)
        // dto.put("part_loan_amt", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get52147df86c694d86B9305a431b675f29() {
        JSONObject dto = new JSONObject();
        // 分账明细
        dto.put("acct_infos", get8b3eddeaB8474c7f905e858f0050be27());

        return dto.toJSONString();
    }

}
