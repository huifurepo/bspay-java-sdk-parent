package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBusiConfigRequest;

/**
 * 微信商户配置 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantBusiConfigRequest.class)
public class V2MerchantBusiConfigRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBusiConfigRequest request = new V2MerchantBusiConfigRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付客户Id
        request.setHuifuId("6666000108854952");
        // 业务开通类型
        request.setFeeType("02");
        // 公众号支付Appid条件必填，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx3767c5bd01df5061&lt;/font&gt; ；wx_woa_app_id 和 wx_applet_app_id两者不能同时为空
        request.setWxWoaAppId("wx3767c5bd01df5061");
        // 微信小程序APPID条件必填，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx8523175fea790f10&lt;/font&gt; ；wx_woa_app_id，wx_applet_app_id两者不能同时为空
        request.setWxAppletAppId("wx8523175fea790f10");

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
        // 微信公众号授权目录
        extendInfoMap.put("wx_woa_path", "https://paas.huifu.com/shouyin/demo/h5/");
        // 微信公众号APPID对应的秘钥
        extendInfoMap.put("wx_woa_secret", "64afb60bef3a22ac282aa7880cdaca98");
        // 微信小程序APPID对应的秘钥
        extendInfoMap.put("wx_applet_secret", "1323a4165a662d6e4f9f51b3f7a58e3f");
        // 渠道号
        extendInfoMap.put("bank_channel_no", "JQF00001");
        return extendInfoMap;
    }

}
