package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2HycInvoiceApplyRequest;

/**
 * 申请开票 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2HycInvoiceApplyRequest.class)
public class V2HycInvoiceApplyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2HycInvoiceApplyRequest request = new V2HycInvoiceApplyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户汇付id
        request.setHuifuId("6666000109133323");
        // 开票类目
        request.setInvoiceCategory("信息技术服务*软件测试服务");
        // 汇付全局流水号集合
        request.setHfSeqIds("0035000topB250922101351P997c0a8414a00000,0035000topB250922092931P351c0a8414a00000");

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
        // 异步地址
        extendInfoMap.put("asyn_url", "https://www.baidu.com");
        // 接收人手机号
        extendInfoMap.put("receive_mobile", "13945641357");
        // 接收人姓名
        extendInfoMap.put("receive_name", "黄二");
        // 快递地址
        extendInfoMap.put("courier_address", "长江大街161号上海长江经济园");
        // 购方税号
        extendInfoMap.put("invoice_tax_no", "91310230MA1JTWAK98");
        // 购方公司名称
        extendInfoMap.put("invoice_name", "上海汇涵信息科技服务有限公司");
        // 购方公司地址
        extendInfoMap.put("invoice_address", "长江大街161号上海长江经济园");
        // 购方公司银行账号
        extendInfoMap.put("invoice_card_num", "631252533");
        // 购方银行名称
        extendInfoMap.put("invoice_bank_name", "中国民生银行股份有限公司");
        // 购方联系电话
        extendInfoMap.put("invoice_phone", "400-820-2819");
        // 发票类型
        extendInfoMap.put("invoice_type", "1");
        // 备注
        extendInfoMap.put("remarks", "");
        // 合作平台
        // extendInfoMap.put("lg_platform_type", "");
        return extendInfoMap;
    }

}
