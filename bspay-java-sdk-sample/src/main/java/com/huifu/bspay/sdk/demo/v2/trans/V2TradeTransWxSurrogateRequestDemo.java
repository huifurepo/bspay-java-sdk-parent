package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeTransWxSurrogateRequest;

/**
 * 微信代发 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeTransWxSurrogateRequest.class)
public class V2TradeTransWxSurrogateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeTransWxSurrogateRequest request = new V2TradeTransWxSurrogateRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 出账商户号
        request.setOutHuifuId("6666000000041651");
        // 代发金额
        request.setTransAmt("9.00");
        // 收款用户openid
        request.setOpenId("o-MYE42l80oelYMDE34nYD456Xoy");
        // 微信收款用户姓名
        request.setUserName("王大锤");
        // 代发备注
        request.setRemark("测试用");

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
        // 账户类型
        extendInfoMap.put("out_acct_type", "05");
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.gangcai.com");
        // 子商户号
        // extendInfoMap.put("sub_mch_id", "");
        // 子商户应用Id
        // extendInfoMap.put("sub_app_id", "");
        return extendInfoMap;
    }

}
