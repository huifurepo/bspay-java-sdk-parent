package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantComplaintUpdateRefundprogressRequest;

/**
 * 更新退款审批结果 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantComplaintUpdateRefundprogressRequest.class)
public class V2MerchantComplaintUpdateRefundprogressRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantComplaintUpdateRefundprogressRequest request = new V2MerchantComplaintUpdateRefundprogressRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 投诉单号
        request.setComplaintId("200000020221020220032600930");
        // 审批动作
        request.setAction("APPROVE");
        // 微信商户号
        request.setMchId("1502074862");

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
        // 预计发起退款时间
        extendInfoMap.put("launch_refund_day", "");
        // 拒绝退款原因
        extendInfoMap.put("reject_reason", "");
        // 文件列表
        extendInfoMap.put("file_info", "{\"reject_media_pic1\":\"a8a096a3-0dd4-3b0e-886c-9afb20d23b1a\",\"reject_media_pic2\":\"a8a096a3-0dd4-3b0e-886c-9afb20d23b2a\",\"reject_media_pic3\":\"a8a096a3-0dd4-3b0e-886c-9afb20d23b3a\",\"reject_media_pic4\":\"a8a096a3-0dd4-3b0e-886c-9afb20d23b4a\"}");
        // 备注
        extendInfoMap.put("remark", "我是备注1111101");
        return extendInfoMap;
    }

}
