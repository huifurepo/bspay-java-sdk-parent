package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2EfpAcctpaymentRefundRequest;

/**
 * 全渠道资金付款到账户退款 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2EfpAcctpaymentRefundRequest.class)
public class V2EfpAcctpaymentRefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2EfpAcctpaymentRefundRequest request = new V2EfpAcctpaymentRefundRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付商户号
        request.setHuifuId("6666000123123123");
        // 原交易全局流水号org_hf_seq_id和org_req_seq_id二选一； &lt;font color&#x3D;&quot;green&quot;&gt;示例值：00470topo1A211015160805P090ac132fef00000&lt;/font&gt;
        request.setOrgHfSeqId("00470topo1A211015160805P090ac132fef00000");
        // 原交易请求流水号org_hf_seq_id和org_req_seq_id二选一；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：2021091708126665002&lt;/font&gt;
        request.setOrgReqSeqId("2021091708126665002");
        // 原交易请求日期
        request.setOrgReqDate("20221022");
        // 退款金额
        request.setRefundAmt("10.00");
        // 接收方退款对象
        request.setAcctSplitBunch(get5bf3321f6c604d67Ad10C58a4cce226c());

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
        extendInfoMap.put("remark", "备注");
        return extendInfoMap;
    }

    private static JSON getE1cff61a45374e07B6a5Fd58a85a8f13() {
        JSONObject dto = new JSONObject();
        // 退款金额
        dto.put("div_amt", "1.00");
        // 退款方ID
        dto.put("huifu_id", "6666000123123123");
        // 退款方账户号
        dto.put("acct_id", "F00598600");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get5bf3321f6c604d67Ad10C58a4cce226c() {
        JSONObject dto = new JSONObject();
        // 退账明细
        dto.put("acct_infos", getE1cff61a45374e07B6a5Fd58a85a8f13());

        return dto.toJSONString();
    }

}
