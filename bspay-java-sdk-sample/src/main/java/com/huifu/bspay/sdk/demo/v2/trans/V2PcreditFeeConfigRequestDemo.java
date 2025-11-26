package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2PcreditFeeConfigRequest;

/**
 * 商户分期配置 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2PcreditFeeConfigRequest.class)
public class V2PcreditFeeConfigRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2PcreditFeeConfigRequest request = new V2PcreditFeeConfigRequest();
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());

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
        // 异步通知地址
        extendInfoMap.put("async_return_url", "http://192.168.85.157:30031/sspm/testVirgo");
        // 花呗分期费率
        extendInfoMap.put("hb_fq_fee_list", get33058a553e95455aA0255248d770c221());
        // 白条分期配置对象
        // extendInfoMap.put("jdbt_data", get5c64baa01d644dac8995286b4cffca1b());
        // 银联聚分期配置对象
        // extendInfoMap.put("yljfq_data", getD940990307634ddcBaafDcdb0dd06c87());
        return extendInfoMap;
    }

    private static String get33058a553e95455aA0255248d770c221() {
        JSONObject dto = new JSONObject();
        // 商户汇付Id
        dto.put("huifu_id", "6666000003156435");
        // 花呗分期状态
        // dto.put("hb_fq_status", "");
        // 花呗分期3期开关
        dto.put("hb_three_period_switch", "Y");
        // 花呗收单分期3期费率（%）
        dto.put("hb_three_acq_period", "5");
        // 花呗分期3期利率（%）
        dto.put("hb_three_period", "10");
        // 花呗分期6期开关
        dto.put("hb_six_period_switch", "Y");
        // 花呗收单分期6期费率（%）
        dto.put("hb_six_acq_period", "5");
        // 花呗分期6期利率（%）
        dto.put("hb_six_period", "10");
        // 花呗分期12期开关
        dto.put("hb_twelve_period_switch", "Y");
        // 花呗收单分期12期费率（%）
        dto.put("hb_twelve_acq_period", "15");
        // 花呗分期12期利率（%）
        dto.put("hb_twelve_period", "11");
        // 交易手续费外扣标记
        dto.put("out_fee_flag", "");
        // 手续费外扣的汇付商户号
        dto.put("out_fee_huifu_id", "");
        // 花呗分期24期开关
        // dto.put("hb_twentyfour_period_switch", "");
        // 花呗收单分期24期费率（%）
        // dto.put("hb_twentyfour_acq_period", "");
        // 花呗分期24期利率（%）
        // dto.put("hb_twentyfour_period", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static JSON get8e5138faDdb344b6805a94d933246d0d() {
        JSONObject dto = new JSONObject();
        // 支付场景
        // dto.put("pay_scene", "test");
        // 业务开通标识
        // dto.put("open_flag", "test");
        // 手续费率(%)
        // dto.put("fee_rate", "");
        // 手续费扣取方式
        // dto.put("fee_rec_type", "");
        // 交易手续费扣款标记
        // dto.put("fee_flag", "");
        // 手续费外扣的汇付商户号
        // dto.put("out_fee_huifu_id", "");
        // 手续费外扣的汇付账户号
        // dto.put("out_fee_acct_id", "");
        // 斗拱终端付息方式
        // dto.put("discount_model", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String get5c64baa01d644dac8995286b4cffca1b() {
        JSONObject dto = new JSONObject();
        // 商户汇付Id
        // dto.put("huifu_id", "test");
        // 签约人类型
        // dto.put("sign_user_type", "test");
        // 签约人手机号
        // dto.put("mobile_no", "test");
        // 挂网协议地址3-挂网协议必填；示例值：https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/dg_gwxy/PaymentServiceAgreement_xxxx.html
        // dto.put("agreement_url", "test");
        // 京东白条费率数据
        // dto.put("jdbt_fee_data", get8e5138faDdb344b6805a94d933246d0d());
        // 签约人姓名
        // dto.put("name", "");
        // 签约人身份证号
        // dto.put("cert_no", "");
        // 协议类型
        // dto.put("agreement_type", "");

        return dto.toJSONString();
    }

    private static JSON get582500aeD6b3421eAfa3Aacb46bbc89c() {
        JSONObject dto = new JSONObject();
        // 支付场景
        // dto.put("pay_scene", "test");
        // 业务开通标识
        // dto.put("open_flag", "test");
        // 贴息模式
        // dto.put("discount_model", "");
        // 手续费率(%)
        // dto.put("fee_rate", "");
        // 手续费扣取方式
        // dto.put("fee_rec_type", "");
        // 交易手续费扣款标记
        // dto.put("fee_flag", "");
        // 手续费外扣的汇付商户号
        // dto.put("out_fee_huifu_id", "");
        // 手续费外扣的汇付账户号
        // dto.put("out_fee_acct_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON get5b3906c269e9412387cf7c5707a32c92() {
        JSONObject dto = new JSONObject();
        // 文件id
        // dto.put("file_id", "test");
        // 文件类型
        // dto.put("file_type", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static String getD940990307634ddcBaafDcdb0dd06c87() {
        JSONObject dto = new JSONObject();
        // 商户汇付Id
        // dto.put("huifu_id", "test");
        // 签约人类型
        // dto.put("sign_user_type", "test");
        // 签约人手机号
        // dto.put("mobile_no", "test");
        // 银联聚分期费率数据
        // dto.put("yljfq_fee_data", get582500aeD6b3421eAfa3Aacb46bbc89c());
        // 签约人姓名
        // dto.put("name", "");
        // 签约人身份证号
        // dto.put("cert_no", "");
        // 补充业务信息
        // dto.put("file_list", get5b3906c269e9412387cf7c5707a32c92());

        return dto.toJSONString();
    }

}
