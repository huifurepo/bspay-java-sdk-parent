package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeLgwxSurrogateRequest;

/**
 * 灵工微信代发 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeLgwxSurrogateRequest.class)
public class V2TradeLgwxSurrogateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeLgwxSurrogateRequest request = new V2TradeLgwxSurrogateRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 出款方商户号
        request.setHuifuId("6666000107755175");
        // 支付金额(元)
        request.setCashAmt("0.11");
        // 代发模式
        request.setSalaryModleType("1");
        // 落地公司商户号
        request.setBmemberId("396117173653968220");
        // 子商户应用ID
        request.setSubAppid("123213");
        // 异步通知地址
        request.setNotifyUrl("virgo://http://www.gangcai.com");
        // 分账明细
        request.setAcctSplitBunch(get2cc87980007348a7A86e461ee467b2db());

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
        // 出款方账户号
        extendInfoMap.put("acct_id", "C02418374");
        return extendInfoMap;
    }

    private static String get2cc87980007348a7A86e461ee467b2db() {
        JSONObject dto = new JSONObject();
        // 用户号
        dto.put("huifu_id", "6666000107979716");
        // 分配金额(元)
        dto.put("div_amt", "0.11");
        // 微信openid
        dto.put("sub_openid", "13232");
        // 转账备注
        dto.put("remark", "灵工代发1");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
