package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeSettleCollectionDetailQueryRequest;

/**
 * 资金归集明细查询 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeSettleCollectionDetailQueryRequest.class)
public class V2TradeSettleCollectionDetailQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeSettleCollectionDetailQueryRequest request = new V2TradeSettleCollectionDetailQueryRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 开始日期
        request.setBeginDate("20240711");
        // 结束日期
        request.setEndDate("20240718");
        // 转出方商户号转出方商户号和转入方商户号必填一个；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123124&lt;/font&gt;
        request.setOutHuifuId("");
        // 转入方商户号转出方商户号和转入方商户号必填一个；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123124&lt;/font&gt;
        request.setInHuifuId("6666000146178696");

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
        // 分页页码
        extendInfoMap.put("page_num", "0");
        // 分页条数
        extendInfoMap.put("page_size", "5");
        // 归集状态
        extendInfoMap.put("status", "");
        // 转出方账户号
        extendInfoMap.put("out_acct_id", "");
        // 转入方账户号
        extendInfoMap.put("in_acct_id", "");
        return extendInfoMap;
    }

}
