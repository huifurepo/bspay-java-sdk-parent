package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2BillEntCreateRequest;

/**
 * 创建企业账单 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2BillEntCreateRequest.class)
public class V2BillEntCreateRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2BillEntCreateRequest request = new V2BillEntCreateRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求时间
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000003100615");
        // 付款人
        request.setPayerId("P2024082286286456");
        // 账单名称
        request.setBillName("账单名称是水电费吧");
        // 账单金额
        request.setBillAmt("0.02");
        // 可支持的付款方式
        request.setSupportPayType("wx,alipay,online_b2c,online_b2b");
        // 账单截止日期
        request.setBillEndDate("20990909");
        // 收款人信息
        request.setPayeeInfo(get7cb71210B6e945638ed7D26989882224());

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
        // 账单说明
        extendInfoMap.put("bill_remark", "您本次 SaaS 服务周期为[开始日期]至[结束日期]。费用包括基础服务套餐[X]元，高级功能模块[X]元，总计[X]元。");
        // 汇总信息
        // extendInfoMap.put("bill_summary_info", getB7fe106a1ade4660865e83374ad40fbf());
        // 更多信息
        // extendInfoMap.put("bill_extend_info", get31ba075559984fd7B7d0C256e889b5c0());
        // 账单推送方式
        extendInfoMap.put("push_type", "EMAIL");
        // 抄送邮箱
        extendInfoMap.put("copy_email", "xuemei.ren@huifu.com,guowen.jiang@huifu.com");
        // 备注信息
        extendInfoMap.put("remark", "I_remark");
        // 账单信息异步通知地址
        extendInfoMap.put("notify_url", "https://spin-test.cloudpnr.com/trade/billing/pcredit/status");
        // 回调地址
        extendInfoMap.put("front_url", "https://spin-test.cloudpnr.com/trade/billing/pcredit/status");
        return extendInfoMap;
    }

    private static String getB7fe106a1ade4660865e83374ad40fbf() {
        JSONObject dto = new JSONObject();
        // 字段名
        // dto.put("extend_name", "test");
        // 字段值
        // dto.put("extend_value", "test");

        return dto.toJSONString();
    }

    private static String get31ba075559984fd7B7d0C256e889b5c0() {
        JSONObject dto = new JSONObject();
        // 字段名
        // dto.put("extend_name", "test");
        // 字段值
        // dto.put("extend_value", "test");

        return dto.toJSONString();
    }

    private static String get7cb71210B6e945638ed7D26989882224() {
        JSONObject dto = new JSONObject();
        // 收款联系人姓名
        dto.put("payee_name", "黄云");
        // 收款联系人手机payee_mobile_no、payee_tel、payee_email 三选一必填
        dto.put("payee_mobile_no", "13456787678");
        // 收款联系人座机payee_mobile_no、payee_tel、payee_email 三选一必填
        dto.put("payee_tel", "0211234444");
        // 收款联系人邮箱payee_mobile_no、payee_tel、payee_email 三选一必填
        dto.put("payee_email", "lieecho@163.com");

        return dto.toJSONString();
    }

}
