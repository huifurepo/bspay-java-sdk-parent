package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantDirectAlipayFacetofacesignApplyRequest;

/**
 * 支付宝直连-申请当面付代签约 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantDirectAlipayFacetofacesignApplyRequest.class)
public class V2MerchantDirectAlipayFacetofacesignApplyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantDirectAlipayFacetofacesignApplyRequest request = new V2MerchantDirectAlipayFacetofacesignApplyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 汇付客户Id
        request.setHuifuId("6666000003080750");
        // 上级主体ID
        request.setUpperHuifuId("6666000003078903");
        // 支付宝经营类目
        request.setDirectCategory("A_A01_4119");
        // 开发者的应用ID
        request.setAppId("AE150003019");
        // 联系人姓名
        request.setContactName("hqqTEST");
        // 联系人手机号
        request.setContactMobileNo("15800718101");
        // 联系人电子邮箱
        request.setContactEmail("24324@qq.com");
        // 商户账号
        request.setAccount("288000000345345");
        // 服务费率（%）0.38~3之间，精确到0.01。当签约且授权sign_and_auth&#x3D;Y时，必填。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.38&lt;/font&gt;
        request.setRate("0.38");
        // 文件列表
        request.setFileList(getFileList());

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
        // 订单授权凭证
        extendInfoMap.put("order_ticket", "werwe234234234");
        // 签约且授权标识
        extendInfoMap.put("sign_and_auth", "Y");
        // 应用授权令牌
        extendInfoMap.put("app_auth_token", "test0004");
        // 营业执照编号
        extendInfoMap.put("license_code", "");
        // 营业执照有效期类型
        extendInfoMap.put("license_validity_type", "0");
        // 营业执照有效期开始日期
        extendInfoMap.put("license_begin_date", "20200429");
        // 营业执照有效期截止日期
        extendInfoMap.put("license_end_date", "29200429");
        return extendInfoMap;
    }

    private static String getFileList() {
        JSONObject dto = new JSONObject();
        // 文件类型
        dto.put("file_type", "F50");
        // 文件jfileID
        dto.put("file_id", "b53e18b3-f933-357f-9a6f-952c6a021ba5");
        // 文件名称
        dto.put("file_name", "360huxi.jpg");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
