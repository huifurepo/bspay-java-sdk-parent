package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantComplaintReplyRequest;

/**
 * 回复用户 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantComplaintReplyRequest.class)
public class V2MerchantComplaintReplyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantComplaintReplyRequest request = new V2MerchantComplaintReplyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 微信投诉单号
        request.setComplaintId("200000020221020220032603511");
        // 被诉商户微信号
        request.setComplaintedMchid("535295270");
        // 回复内容
        request.setResponseContent("该问题请联系商家处理，谢谢。");
        // 跳转链接
        request.setJumpUrl("");
        // 跳转链接文案
        request.setJumpUrlText("");
        // 微信商户号
        request.setMchId("1502073961");

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
        // 文件列表
        // extendInfoMap.put("file_info", getFileInfo());
        return extendInfoMap;
    }

    private static String getFileInfo() {
        JSONObject dto = new JSONObject();
        // 回复图片1
        // dto.put("response_pic1", "");
        // 回复图片2
        // dto.put("response_pic2", "");
        // 回复图片3
        // dto.put("response_pic3", "");
        // 回复图片4
        // dto.put("response_pic4", "");

        return dto.toJSONString();
    }

}
