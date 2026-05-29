package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantFapiaoGoodsEditRequest;

/**
 * 开票商品修改 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantFapiaoGoodsEditRequest.class)
public class V2MerchantFapiaoGoodsEditRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantFapiaoGoodsEditRequest request = new V2MerchantFapiaoGoodsEditRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 汇付商户号
        request.setHuifuId("6666000123123123");
        // 商品id
        request.setGoodsId("G558461047849918464");
        // 是否默认
        request.setIsDefault("Y");

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
        // 商品名称
        extendInfoMap.put("goods_name", "irure aliqua dolore sed");
        // 税率
        extendInfoMap.put("tax_rate", "1");
        // 订单商品明细
        extendInfoMap.put("order_goods_detail", "你好");
        // 规格型号
        extendInfoMap.put("goods_model", "12345678901234567890123456789012");
        // 计量单位
        extendInfoMap.put("goods_unit", "2");
        // 单价
        extendInfoMap.put("goods_price", "2");
        // 含税标识
        extendInfoMap.put("is_price_con_tax", "0");
        // 优惠政策标识
        extendInfoMap.put("preferential_flag", "0");
        // 零税率标示
        extendInfoMap.put("zero_tax_rate_flag", "");
        // 增值税特殊管理
        extendInfoMap.put("add_tax_spec_manage", "");
        // 说明
        extendInfoMap.put("ivc_remark", "sss");
        // 生效状态
        extendInfoMap.put("stat", "N");
        return extendInfoMap;
    }

}
