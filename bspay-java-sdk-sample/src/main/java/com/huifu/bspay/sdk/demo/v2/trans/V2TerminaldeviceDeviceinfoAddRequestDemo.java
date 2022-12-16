package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TerminaldeviceDeviceinfoAddRequest;

/**
 * 新增终端报备 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TerminaldeviceDeviceinfoAddRequest.class)
public class V2TerminaldeviceDeviceinfoAddRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TerminaldeviceDeviceinfoAddRequest request = new V2TerminaldeviceDeviceinfoAddRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000104575213");

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
        // 终端信息
        extendInfoMap.put("terminal_info_list", getTerminalInfoList());
        return extendInfoMap;
    }

    private static String getTerminalInfoList() {
        JSONObject dto = new JSONObject();
        // 终端硬件序列号
        dto.put("sn", "433333");
        // 终端21号文编号
        dto.put("tusn", "J434445679");
        // 终端型号代号
        dto.put("dev_model_code", "01");
        // 终端布放地址
        dto.put("terminal_address", "上海额的发");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
