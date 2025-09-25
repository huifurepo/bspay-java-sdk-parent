package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2LlaWithholdRefundRequest;

/**
 * 代运营佣金代扣退款 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2LlaWithholdRefundRequest.class)
public class V2LlaWithholdRefundRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2LlaWithholdRefundRequest request = new V2LlaWithholdRefundRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 原请求日期
        request.setOrgReqDate("20250822");
        // 原请求流水号org_hf_seq_id与org_req_seq_id二选一必填。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：2021091708126665001&lt;/font&gt;
        request.setOrgReqSeqId("");
        // 原全局流水号org_hf_seq_id与org_req_seq_id二选一必填。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：00470topo1A221019132207P068ac1362af00000&lt;/font&gt;
        request.setOrgHfSeqId("00470topotB250827093537P979c0a8408100000");
        // 代运营汇付id
        request.setAgencyHuifuId("6666000108967194");
        // 退款金额
        request.setTransAmt("25.00");
        // 设备信息
        request.setTerminalDeviceData(get401cdbafBf0248b9Bd22Fc29c064ec90());
        // 安全信息
        request.setRiskCheckData(get5f9a6c9a2f274b58B08b898a909edb95());

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
        // 备注
        extendInfoMap.put("remark", "部分退款看看");
        // 异步通知地址
        extendInfoMap.put("notify_url", "http://www.baidu.com");
        return extendInfoMap;
    }

    private static String get401cdbafBf0248b9Bd22Fc29c064ec90() {
        JSONObject dto = new JSONObject();
        // 交易设备类型
        dto.put("device_type", "4");
        // 交易设备IP
        dto.put("device_ip", "172.31.11.11");

        return dto.toJSONString();
    }

    private static String get5f9a6c9a2f274b58B08b898a909edb95() {
        JSONObject dto = new JSONObject();
        // 经度
        // dto.put("longitude", "");
        // 纬度
        // dto.put("latitude", "");
        // 基站地址
        // dto.put("base_station", "");
        // IP地址
        dto.put("ip_addr", "172.31.11.11");

        return dto.toJSONString();
    }

}
