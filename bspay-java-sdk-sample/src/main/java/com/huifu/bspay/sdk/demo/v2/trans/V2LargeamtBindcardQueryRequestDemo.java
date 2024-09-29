package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2LargeamtBindcardQueryRequest;

/**
 * 银行大额支付绑卡查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2LargeamtBindcardQueryRequest.class)
public class V2LargeamtBindcardQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2LargeamtBindcardQueryRequest request = new V2LargeamtBindcardQueryRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000108312997");
        // 银行卡号密文
        request.setCardNo("GCMghaHLsWffNmBl/uuvVnv+kzwvBSLaZR+AsldnabAMzjPUzw4SMe2DX8IvVTM/Qb/tbiQwayeQ+TwkeSyQ0IB6oy/BNgM3rl7wZsdTzKbyigyGQvtOYsauk3IUuiJ8ptJ1k0C4Ysd5Z4+6ApLmOZhAem1pqu+DUk8EpKMj37RDgk3zWgVIf1wX9nBaSN1IGIoVjmweg8/r/UVWqCKoYrEWHxO1R0elZM9+hXTwXEKHFc2L2yossgDGjJDKuykaN0DzVunz1uQbxuvg4lMCmycSRjlQ1MCsIzqs4oiVNW3PCqAwoFkdRKL879e5/EsvohJJNVuX6YOeefFdJOC8Ug==");
        // 每页条数
        request.setPageSize("2");
        // 分页页码
        request.setPageNum("1");

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
        // 卡类型
        extendInfoMap.put("card_type", "");
        // 银行账户名
        extendInfoMap.put("card_name", "");
        // 账户号
        extendInfoMap.put("acct_id", "");
        return extendInfoMap;
    }

}
