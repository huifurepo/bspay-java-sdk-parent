package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2FlexibleIndvModifyRequest;

/**
 * 灵工个人用户修改 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2FlexibleIndvModifyRequest.class)
public class V2FlexibleIndvModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2FlexibleIndvModifyRequest request = new V2FlexibleIndvModifyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 渠道商/商户汇付Id
        request.setUpperHuifuId("6666000108329682");
        // 汇付ID
        request.setHuifuId("6666000108894951");

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
        // 基本信息
        // extendInfoMap.put("basic_info", get85557b1d7f4945348f719444c35fef3e());
        // 取现配置列表
        extendInfoMap.put("cash_config", getFab986af2f5a46c293be27111b433af5());
        // 卡信息
        extendInfoMap.put("card_info", get7e4fcf80B2eb4346Ae2709b1139d8a3f());
        return extendInfoMap;
    }

    private static String get85557b1d7f4945348f719444c35fef3e() {
        JSONObject dto = new JSONObject();
        // 个人证件有效期类型
        // dto.put("cert_validity_type", "");
        // 个人证件有效期开始日期
        // dto.put("cert_begin_date", "");
        // 个人证件有效期截止日期
        // dto.put("cert_end_date", "");
        // 手机号
        // dto.put("mobile_no", "");

        return dto.toJSONString();
    }

    private static String getFab986af2f5a46c293be27111b433af5() {
        JSONObject dto = new JSONObject();
        // 提现手续费（固定/元）fix_amt与fee_rate至少填写一项， 需保留小数点后两位，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;注：当cash_type&#x3D;D1时为节假日取现手续费
        dto.put("fix_amt", "");
        // 提现手续费率（%）fix_amt与fee_rate至少填写一项，需保留小数点后两位，取值范围[0.00,100.00]，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;注：1、如果fix_amt与fee_rate都填写了则手续费&#x3D;fix_amt+支付金额\*fee_rate2、当cash_type&#x3D;D1时为节假日取现手续费
        dto.put("fee_rate", "10.00");
        // D1工作日取现手续费固定金额单位元，需保留小数点后两位。不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;D1取现配置时选填，其他取现配置无效；cash_type取现类型为D1时，遇工作日按此费率结算，若未配置则默认按照节假日手续费计算
        dto.put("weekday_fix_amt", "");
        // D1工作日取现手续费率单位%，需保留小数点后两位。取值范围[0.00，100.00]，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;D1取现配置时选填，其他取现配置无效；cash_type取现类型为D1时，遇工作日按此费率结算 ，若未配置则默认按照节假日手续费计算
        dto.put("weekday_fee_rate", "");
        // 开通状态
        dto.put("switch_state", "1");
        // 业务类型
        dto.put("cash_type", "D0");
        // 是否交易手续费外扣
        dto.put("out_fee_flag", "");
        // 手续费承担方
        dto.put("out_fee_huifu_id", "");
        // 交易手续费外扣的账户类型
        dto.put("out_fee_acct_type", "");
        // 是否优先到账
        dto.put("is_priority_receipt", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String get7e4fcf80B2eb4346Ae2709b1139d8a3f() {
        JSONObject dto = new JSONObject();
        // 卡号
        dto.put("card_no", "6228481269040908115");
        // 银行所在省
        dto.put("prov_id", "310000");
        // 银行所在市
        dto.put("area_id", "310100");

        return dto.toJSONString();
    }

}
