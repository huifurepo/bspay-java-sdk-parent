package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2EfpEncashRequest;

/**
 * 全渠道资金提现申请 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2EfpEncashRequest.class)
public class V2EfpEncashRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2EfpEncashRequest request = new V2EfpEncashRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户汇付id
        request.setHuifuId("6666000108422302");
        // 交易金额.单位:元，2位小数
        request.setCashAmt("0.01");
        // 取现卡序列号
        request.setTokenNo("10001933531");

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
        // 原请求流水号
        extendInfoMap.put("efp_req_seq_id", "20241128164919defaultit687891821");
        // 原请求日期
        extendInfoMap.put("efp_req_date", "20241128");
        // 备注
        extendInfoMap.put("remark", "saas取现");
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.service.com/getresp");
        return extendInfoMap;
    }

}
