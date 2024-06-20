package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2InvoiceMerRegRequest;

/**
 * 商户注册 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2InvoiceMerRegRequest.class)
public class V2InvoiceMerRegRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2InvoiceMerRegRequest request = new V2InvoiceMerRegRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 开票方汇付ID
        request.setHuifuId("6666000149801800");
        // 纳税人识别号
        request.setTaxPayerId("91310000795605184T");
        // 销方名称
        request.setTaxPayerName("汇付网络技术（上海）有限公司");
        // 公司电话
        request.setTelNo("021-33323999");
        // 公司地址
        request.setRegAddress("徐汇宜山路700号C5栋021-33323999");
        // 开户银行
        request.setBankName("民生银行徐汇支行");
        // 开户账户
        request.setAccountNo("0206014180001609");
        // 联系人手机号
        request.setContactPhoneNo("17621100776");
        // 开票方式
        request.setOpenMode("2");
        // 所属省
        request.setProvId("310000");

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
        // 联系人
        extendInfoMap.put("contact", "王姗");
        // 联系人身份证号
        extendInfoMap.put("id_card_no", "210123198702122747");
        // 所属市
        extendInfoMap.put("city_id", "310100");
        // 业务到期年限
        extendInfoMap.put("valid_period", "1");
        // 自动续约
        extendInfoMap.put("auto_renewal", "Y");
        // 开票结果异步通知地址
        extendInfoMap.put("callback_url", "http: //service.example.com/to/path");
        return extendInfoMap;
    }

}
