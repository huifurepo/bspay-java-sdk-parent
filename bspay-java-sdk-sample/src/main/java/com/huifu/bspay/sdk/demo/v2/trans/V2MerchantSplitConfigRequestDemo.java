package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantSplitConfigRequest;

/**
 * 商户分账配置 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantSplitConfigRequest.class)
public class V2MerchantSplitConfigRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantSplitConfigRequest request = new V2MerchantSplitConfigRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户汇付Id
        request.setHuifuId("6666000105582434");
        // 分账规则来源
        request.setRuleOrigin("02");
        // 分账是否支持撤销交易
        request.setRepealFlag("Y");
        // 分账是否支持退货交易
        request.setRefundFlag("Y");
        // 分账开关
        request.setDivFlag("Y");
        // 最大分账比例
        request.setApplyRatio("100");
        // 生效类型
        request.setStartType("0");

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
        // 分账明细
        extendInfoMap.put("acct_split_bunch_list", getAcctSplitBunchList());
        // 交易手续费外扣开关
        extendInfoMap.put("out_fee_flag", "1");
        // 交易手续费外扣时的账户类型
        extendInfoMap.put("out_fee_acct_type", "01");
        // 交易手续费外扣汇付ID
        extendInfoMap.put("out_fee_huifuid", "6666000105582434");
        // 固定手续费
        extendInfoMap.put("split_fee_rate", "10.89");
        // 百分比手续费
        extendInfoMap.put("per_amt", "99");
        // 异步地址
        extendInfoMap.put("async_return_url", "http://192.168.85.157:30031/sspm/testVirgo");
        return extendInfoMap;
    }

    private static JSON getAcctSplitBunchList() {
        JSONObject dto = new JSONObject();
        // 分账比例
        dto.put("fee_rate", "100");
        // 汇付Id
        dto.put("huifu_id", "6666000105582434");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

}
