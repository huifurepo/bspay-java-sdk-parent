package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeElectronReceiptsCustomentrancesCreateRequest;

/**
 * 创建修改小票自定义入口 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeElectronReceiptsCustomentrancesCreateRequest.class)
public class V2TradeElectronReceiptsCustomentrancesCreateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeElectronReceiptsCustomentrancesCreateRequest request = new V2TradeElectronReceiptsCustomentrancesCreateRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000103334211");
        // 操作类型
        request.setOperateType("A");

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
        // 票据信息
        extendInfoMap.put("receipt_data", getReceiptData());
        return extendInfoMap;
    }

    private static JSON getJumpLinkData() {
        JSONObject dto = new JSONObject();
        // 商家小程序AppID
        dto.put("mini_programs_app_id", "oBmItsxLKa6pd5dSHK4xRLXTt05M");
        // 商家小程序path
        dto.put("mini_programs_path", "https://wxpaylogo.qpic.cn/wxpaylogo/PiajxSqBRaEIPAeia7ImvtsoMpdQ8uEd23s8VtfKDXa04FZk8kXDeH9Q/0");

        return dto;
    }

    private static JSON getWxReceiptData() {
        JSONObject dto = new JSONObject();
        // 品牌ID
        dto.put("brand_id", "1");
        // 自定义入口种类
        dto.put("custom_entrance_type", "MERCHANT_ACTIVITY");
        // 副标题
        dto.put("sub_title", "1");
        // 商品缩略图URL
        dto.put("goods_thumbnail_url", "1");
        // 入口展示开始时间
        dto.put("start_time", "2023-08-17T13:20:00+08:00");
        // 入口展示结束时间
        dto.put("end_time", "2023-08-18T11:20:00+08:00");
        // 自定义入口状态
        dto.put("custom_entrance_state", "ONLINE");
        // 请求业务单据号
        dto.put("out_request_no", "1");
        // 跳转信息
        dto.put("jump_link_data", getJumpLinkData());

        return dto;
    }

    private static String getReceiptData() {
        JSONObject dto = new JSONObject();
        // 三方通道类型
        dto.put("third_channel_type", "T");
        // 微信票据信息
        dto.put("wx_receipt_data", getWxReceiptData());

        return dto.toJSONString();
    }

}
