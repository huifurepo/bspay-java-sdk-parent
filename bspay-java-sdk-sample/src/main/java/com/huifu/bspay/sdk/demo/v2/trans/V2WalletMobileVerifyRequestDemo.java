package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2WalletMobileVerifyRequest;

/**
 * 钱包绑定手机号验证 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2WalletMobileVerifyRequest.class)
public class V2WalletMobileVerifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2WalletMobileVerifyRequest request = new V2WalletMobileVerifyRequest();
        // 请求流水号
        // request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        // request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000107309462");
        // 钱包用户ID斗拱系统生成的钱包用户ID。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123122343&lt;/font&gt;&lt;br/&gt;验证类型为2-密码修改和3-密码重置时，必须提供钱包用户的汇付ID。
        request.setUserHuifuId("6666000107355468");
        // 用户手机号
        request.setMobileNo("13771817106");
        // 验证类型
        request.setType("3");

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
        return extendInfoMap;
    }

}
