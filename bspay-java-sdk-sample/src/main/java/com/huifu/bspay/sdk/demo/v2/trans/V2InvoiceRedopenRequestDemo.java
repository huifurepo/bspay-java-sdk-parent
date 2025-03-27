package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2InvoiceRedopenRequest;

/**
 * 红字发票开具接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2InvoiceRedopenRequest.class)
public class V2InvoiceRedopenRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2InvoiceRedopenRequest request = new V2InvoiceRedopenRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付商户号
        request.setHuifuId("6666000107430944");
        // 原发票号码
        request.setOriIvcNumber("25317000000132667193");
        // 红冲原因
        request.setRedApplyReason("02");
        // 红冲申请来源
        request.setRedApplySource("01");

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
        extendInfoMap.put("resv", "备注");
        // 开票结果异步通知地址
        extendInfoMap.put("callback_url", "virgo://http://192.168.85.157:30031/sspm/testVirgo");
        return extendInfoMap;
    }

}
