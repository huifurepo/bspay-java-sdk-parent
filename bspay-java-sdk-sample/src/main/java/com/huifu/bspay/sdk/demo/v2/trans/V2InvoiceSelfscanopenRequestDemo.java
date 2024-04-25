package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2InvoiceSelfscanopenRequest;

/**
 * 自助扫码开票 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2InvoiceSelfscanopenRequest.class)
public class V2InvoiceSelfscanopenRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2InvoiceSelfscanopenRequest request = new V2InvoiceSelfscanopenRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付商户号
        request.setHuifuId("6666000103675282");
        // 发票类型
        // request.setIvcType("test");
        // 开票类型
        // request.setOpenType("test");
        // 含税合计金额（元）
        // request.setOrderAmt("test");
        // 开票商品信息
        // request.setGoodsInfos(getGoodsInfosRc());
        // 开票人信息
        // request.setPayerInfo(getPayerInfo());

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
        // 税控盘编号
        // extendInfoMap.put("tax_device_id", "");
        // 备注
        // extendInfoMap.put("resv", "");
        // 特殊票种标识
        // extendInfoMap.put("special_flag", "");
        // 开票结果异步通知地址
        // extendInfoMap.put("callback_url", "");
        return extendInfoMap;
    }

    private static String getGoodsInfosRc() {
        JSONObject dto = new JSONObject();
        // 发票行性质
        // dto.put("ivc_nature", "test");
        // 商品名称goods_code不为空时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：电视机&lt;/font&gt;
        // dto.put("goods_name", "test");
        // 税率goods_code不为空时必填，最多三位小数 如：税率13% 则传入&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.13&lt;/font&gt;
        // dto.put("tax_rate", "test");
        // 金额（元）
        // dto.put("trans_amt", "test");
        // 商品id
        // dto.put("goods_id", "");
        // 商品税收分类编码
        // dto.put("goods_code", "");
        // 规格型号
        // dto.put("goods_model", "");
        // 计量单位
        // dto.put("goods_unit", "");
        // 优惠政策标识
        // dto.put("preferential_flag", "");
        // 零税率标示
        // dto.put("zero_tax_rate_flag", "");
        // 增值税特殊管理
        // dto.put("add_tax_spec_manage", "");
        // 含税标识
        // dto.put("is_price_con_tax", "");
        // 数量
        // dto.put("goods_count", "");
        // 单价
        // dto.put("goods_price", "");
        // 折扣金额(元)
        // dto.put("sale_amt", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getPayerInfo() {
        JSONObject dto = new JSONObject();
        // 开票人
        // dto.put("payer_name", "test");
        // 收款人
        // dto.put("payee", "");
        // 复核人
        // dto.put("reviewer", "");

        return dto.toJSONString();
    }

}
