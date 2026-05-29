package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2InvoiceManageGoodsAddRequest;

/**
 * 开票商品新增 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2InvoiceManageGoodsAddRequest.class)
public class V2InvoiceManageGoodsAddRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2InvoiceManageGoodsAddRequest request = new V2InvoiceManageGoodsAddRequest();
        // 汇付商户号
        request.setHuifuId("6666000123123123");
        // 商品名称
        request.setGoodsName("sint amet minim");
        // 税收分类编码
        // request.setTaxCode("test");
        // 税率
        request.setTaxRate("0.130");
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
        // 请求日期
        extendInfoMap.put("req_date", DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        extendInfoMap.put("req_seq_id", SequenceTools.getReqSeqId32());
        // 订单商品明细
        extendInfoMap.put("order_goods_detail", "order_goods_detail");
        // 规格型号
        extendInfoMap.put("goods_model", "id dolor ");
        // 计量单位
        extendInfoMap.put("goods_unit", "单位元");
        // 单价
        extendInfoMap.put("goods_price", "1.23");
        // 含税标识
        extendInfoMap.put("is_price_con_tax", "0");
        // 优惠政策标识
        extendInfoMap.put("preferential_flag", "0");
        // 零税率标示
        extendInfoMap.put("zero_tax_rate_flag", "");
        // 增值税特殊管理
        extendInfoMap.put("add_tax_spec_manage", "");
        // 说明
        extendInfoMap.put("ivc_remark", "ivc_remark");
        return extendInfoMap;
    }

}
