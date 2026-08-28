package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantUrlForwardRequest;

/**
 * 商户统一进件（页面版） - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantUrlForwardRequest.class)
public class V2MerchantUrlForwardRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantUrlForwardRequest request = new V2MerchantUrlForwardRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 渠道商号汇付分配的渠道商号，该商户进件完成后将隶属该渠道商/代理商&lt;br/&gt;sys_id主体为渠道商时填写； &lt;br/&gt;sys_id主体为总部商户时选填；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123&lt;/font&gt;
        request.setUpperHuifuId("6666000108290240");
        // 门店号
        request.setStoreId("store128");

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
        // 手机号
        extendInfoMap.put("phone", "13917352618");
        // 跳转地址失效时间
        extendInfoMap.put("expires", "50000");
        // 返回页面URL
        // extendInfoMap.put("back_page_url", "");
        // 异步接收URL
        // extendInfoMap.put("async_receive_url", "");
        // 模版编号
        extendInfoMap.put("template_id", "155625");
        // 商户身份
        // extendInfoMap.put("head_office_flag", "");
        // 上级汇付Id
        // extendInfoMap.put("head_huifu_id", "");
        // 使用上级微信、支付宝商户号发起交易
        // extendInfoMap.put("use_chains_flag", "");
        // 小微经营类型
        // extendInfoMap.put("micro_biz_type", "");
        return extendInfoMap;
    }

}
