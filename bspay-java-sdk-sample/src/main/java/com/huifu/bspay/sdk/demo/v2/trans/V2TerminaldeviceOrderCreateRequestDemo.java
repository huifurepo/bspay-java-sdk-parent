package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TerminaldeviceOrderCreateRequest;

/**
 * 终端自助申请单创建 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TerminaldeviceOrderCreateRequest.class)
public class V2TerminaldeviceOrderCreateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TerminaldeviceOrderCreateRequest request = new V2TerminaldeviceOrderCreateRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 订单状态
        request.setOrderStatus("10");

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
        // 订单号
        extendInfoMap.put("order_id", "");
        // 商户类型
        extendInfoMap.put("nature", "1");
        // 汇付Id
        extendInfoMap.put("huifu_id", "6666000105386629");
        // 产品编号
        extendInfoMap.put("product_id", "");
        // 流程类型
        extendInfoMap.put("flow_type", "00");
        // 仓库编号
        extendInfoMap.put("dep_number", "0001");
        // 收获详细地址
        extendInfoMap.put("con_address", "自动化测试专用产品");
        // 收货人
        extendInfoMap.put("consignee", "小寒");
        // 收货人联系电话
        extendInfoMap.put("con_phone", "13456789023");
        // 给审核方备注
        extendInfoMap.put("audit_remark", "");
        // 给发货方备注
        extendInfoMap.put("shipping_remark", "");
        // 付款类型
        extendInfoMap.put("payment_type", "");
        // 付款后补原因
        extendInfoMap.put("payment_after_reason", "");
        // 付款凭证/后补凭证
        extendInfoMap.put("payment_file_id", "");
        // 销售策略
        extendInfoMap.put("sale_strategy", "黄义红专用");
        // 实付金额
        extendInfoMap.put("real_pay_amt", 1400);
        // 购买明细
        extendInfoMap.put("goods_list", getGoodsList());
        return extendInfoMap;
    }

    private static String getGoodsList() {
        JSONObject dto = new JSONObject();
        // 厂商编号
        dto.put("oem_id", "01");
        // 商品型号编码
        dto.put("goods_model", "01");
        // 商品数量
        dto.put("quantity", "1");
        // 单价
        dto.put("unit_price", "10");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
