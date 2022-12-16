package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2UserBusiOpenRequest;

/**
 * 用户业务入驻 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2UserBusiOpenRequest.class)
public class V2UserBusiOpenRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2UserBusiOpenRequest request = new V2UserBusiOpenRequest();
        // 汇付ID
        request.setHuifuId("6666000105765113");
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 渠道商/商户汇付Id
        request.setUpperHuifuId("6666000003084836");

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
        // 结算信息配置
        // extendInfoMap.put("&lt;span class&#x3D;&quot;extend settle_config&quot;&gt;settle_config&lt;/span&gt;", "");
        // 结算卡信息
        // extendInfoMap.put("&lt;span class&#x3D;&quot;extend card_info&quot;&gt;card_info&lt;/span&gt;", "");
        // 取现配置列表
        // extendInfoMap.put("&lt;span class&#x3D;&quot;extend cash_config&quot;&gt;cash_config&lt;/span&gt;", "");
        // 文件列表
        // extendInfoMap.put("&lt;span class&#x3D;&quot;extend file_list&quot;&gt;file_list&lt;/span&gt;", "");
        // 延迟入账开关
        // extendInfoMap.put("delay_flag", "");
        return extendInfoMap;
    }

}
