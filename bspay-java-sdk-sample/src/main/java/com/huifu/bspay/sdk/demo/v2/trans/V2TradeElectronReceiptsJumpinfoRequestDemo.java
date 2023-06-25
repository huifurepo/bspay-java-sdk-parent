package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeElectronReceiptsJumpinfoRequest;

/**
 * 跳转电子小票页面 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeElectronReceiptsJumpinfoRequest.class)
public class V2TradeElectronReceiptsJumpinfoRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeElectronReceiptsJumpinfoRequest request = new V2TradeElectronReceiptsJumpinfoRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户汇付Id
        request.setHuifuId("6666000103334211");
        // 原请求日期
        request.setOrgReqDate("20230517");
        // 原请求流水号原请求流水号、原交易返回的全局流水号至少要送其中一项；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：2021091708126665001&lt;/font&gt;
        request.setOrgReqSeqId("20230517111710E83514");
        // 汇付全局流水号原请求流水号、原交易返回的全局流水号至少要送其中一项；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：00290TOP1GR210919004230P853ac13262200000&lt;/font&gt;
        request.setOrgHfSeqId("0036000topB230517111710P034c0a8304100000");
        // 票据信息
        request.setReceiptData(getReceiptDataRucan());

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
        return extendInfoMap;
    }

    private static JSON getJumpInfo() {
        JSONObject dto = new JSONObject();
        // 小票跳转信息小程序AppID
        dto.put("merchant_app_id", "wxcaced8415a866378");
        // 小票跳转信息小程序路径
        dto.put("merchant_path", "pages/cashier/paySuccess");

        return dto;
    }

    private static JSON getWxReceiptDataRucan() {
        JSONObject dto = new JSONObject();
        // 跳转信息
        dto.put("jump_info", getJumpInfo());

        return dto;
    }

    private static String getReceiptDataRucan() {
        JSONObject dto = new JSONObject();
        // 三方通道类型
        dto.put("third_channel_type", "T");
        // 微信票据信息
        dto.put("wx_receipt_data", getWxReceiptDataRucan());

        return dto.toJSONString();
    }

}
