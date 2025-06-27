package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2CouponDouyinProductQueryRequest;

/**
 * 抖音套餐映射接口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2CouponDouyinProductQueryRequest.class)
public class V2CouponDouyinProductQueryRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2CouponDouyinProductQueryRequest request = new V2CouponDouyinProductQueryRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付商户号
        request.setHuifuId("6666000108412345");
        // 门店绑定流水号
        request.setBindId("7123fc6e5c564f539e73031c08912345");

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
        // 区分商品创建者的查询方式
        extendInfoMap.put("goods_creator_type", "0");
        // 商品名称
        // extendInfoMap.put("product_name", "");
        // 是否查询商品全量关联门店
        // extendInfoMap.put("query_all_poi", "");
        // 筛选在线状态
        extendInfoMap.put("status", "1");
        // 光标
        // extendInfoMap.put("cursor", "");
        // 分页数量
        // extendInfoMap.put("count", "");
        // 门店ID list
        extendInfoMap.put("poi_ids", "[23,45]");
        // 外部门店ID list
        // extendInfoMap.put("ext_ids", "");
        return extendInfoMap;
    }

}
