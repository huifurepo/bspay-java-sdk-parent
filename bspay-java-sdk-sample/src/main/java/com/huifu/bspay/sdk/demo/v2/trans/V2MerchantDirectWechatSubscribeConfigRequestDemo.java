package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantDirectWechatSubscribeConfigRequest;

/**
 * 微信直连-微信关注配置 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantDirectWechatSubscribeConfigRequest.class)
public class V2MerchantDirectWechatSubscribeConfigRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantDirectWechatSubscribeConfigRequest request = new V2MerchantDirectWechatSubscribeConfigRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付ID
        request.setHuifuId("6666000003099420");
        // 开发者的应用ID
        request.setAppId("wx3767c5bd01df5061");
        // 商户号
        request.setMchId("1552470931");
        // 特约商户号
        request.setSubMchid("10888880");

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
        // 绑定APPID配置
        extendInfoMap.put("bind_app_id_conf_list", getBindAppIdConfList());
        // 关注配置
        extendInfoMap.put("subscribe_conf_list", getSubscribeConfList());
        // 支付目录配置
        extendInfoMap.put("pay_path_conf_list", getPayPathConfList());
        return extendInfoMap;
    }

    private static String getSubscribeConfList() {
        JSONObject dto = new JSONObject();
        // 关联APPID
        dto.put("sub_appid", "wx5934540532");
        // 推荐关注APPID服务商的公众号APPID；与receipt_appid二选一；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx5934540532&lt;/font&gt;
        dto.put("subscribe_appid", "oQOa46X2FxRqEy6F4YmwIRCrA7Mk");
        // 支付凭证推荐小程序appid需为通过微信认证的小程序appid，且认证主体与服务商主体一致；与subscribe_appid二选一；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx852a790f100000fe&lt;/font&gt;
        dto.put("receipt_appid", "wx852a790f100000fe");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getBindAppIdConfList() {
        JSONObject dto = new JSONObject();
        // 关联APPID
        dto.put("sub_appid", "oQOa46X2FxRqEy6F4YmwIRCrA7Mk");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getPayPathConfList() {
        JSONObject dto = new JSONObject();
        // 授权目录
        dto.put("jsapi_path", "http://www.dsf.com/init");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
