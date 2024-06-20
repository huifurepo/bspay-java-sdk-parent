package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2InvoiceMerModifyRequest;

/**
 * 商户注册信息修改 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2InvoiceMerModifyRequest.class)
public class V2InvoiceMerModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2InvoiceMerModifyRequest request = new V2InvoiceMerModifyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 开票方汇付ID
        request.setHuifuId("6666000149801800");

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
        // 销方名称
        extendInfoMap.put("tax_payer_name", "汇付网络技术（上海）有限公司");
        // 公司电话
        extendInfoMap.put("tel_no", "021-33323999");
        // 公司地址
        extendInfoMap.put("reg_address", "徐汇宜山路700号C5栋021-33323999");
        // 开户银行
        extendInfoMap.put("bank_name", "民生银行徐汇支行");
        // 开户账户
        extendInfoMap.put("account_no", "0206014180001609");
        // 联系人手机号
        extendInfoMap.put("contact_phone_no", "17621100776");
        // 联系人
        extendInfoMap.put("contact", "王姗");
        // 联系人身份证号
        extendInfoMap.put("id_card_no", "210123198702122747");
        // 所属省
        extendInfoMap.put("prov_id", "310000");
        // 所属市
        extendInfoMap.put("city_id", "310100");
        return extendInfoMap;
    }

}
