package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantBasicdataIndvRequest;

/**
 * 个人商户基本信息入驻(2022) - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantBasicdataIndvRequest.class)
public class V2MerchantBasicdataIndvRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantBasicdataIndvRequest request = new V2MerchantBasicdataIndvRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 上级主体ID
        request.setUpperHuifuId("6666000107803321");
        // 商户名
        request.setRegName("张天德");
        // 经营省
        request.setProvId("310000");
        // 经营市
        request.setAreaId("310100");
        // 经营区
        request.setDistrictId("310105");
        // 经营详细地址
        request.setDetailAddr("上海市长宁区定西路1310号");
        // 联系人姓名
        request.setContactName("张天德");
        // 联系人手机号
        request.setContactMobileNo("13111112222");
        // 联系人电子邮箱
        request.setContactEmail("jeff.peng@huifu.com");
        // 结算卡信息配置
        request.setCardInfo(getCardInfo());

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
        // 商户简称
        extendInfoMap.put("short_name", "张天德");
        // 商户通知标识
        extendInfoMap.put("sms_send_flag", "1");
        // 管理员账号
        extendInfoMap.put("login_name", "tinysword0116");
        // 取现信息配置
        extendInfoMap.put("cash_config", getCashConfig());
        // 结算规则配置
        extendInfoMap.put("settle_config", getSettleConfig());
        // 异步通知地址
        extendInfoMap.put("async_return_url", "http://192.168.85.157:30031/sspm/testVirgo");
        // D1结算协议图片文件
        extendInfoMap.put("settle_agree_pic", "119bc780-b1c5-3a9c-8b18-f911de6ff28c");
        // 商户主页URL
        // extendInfoMap.put("mer_url", "");
        // 商户ICP备案编号
        // extendInfoMap.put("mer_icp", "");
        // 结算卡反面
        // extendInfoMap.put("settle_card_back_pic", "");
        // 结算卡正面
        // extendInfoMap.put("settle_card_front_pic", "");
        // 授权委托书
        // extendInfoMap.put("auth_enturst_pic", "");
        return extendInfoMap;
    }

    private static String getCardInfo() {
        JSONObject dto = new JSONObject();
        // 卡户名
        dto.put("card_name", "张天德");
        // 结算账号
        dto.put("card_no", "4367421217494235081");
        // 银行所在省
        dto.put("prov_id", "310000");
        // 银行所在市
        dto.put("area_id", "310100");
        // 持卡人证件类型
        dto.put("cert_type", "00");
        // 持卡人证件号码
        dto.put("cert_no", "321084198912066512");
        // 持卡人证件有效期类型
        dto.put("cert_validity_type", "0");
        // 持卡人证件有效期开始
        dto.put("cert_begin_date", "20180824");
        // 持卡人证件有效期截止日期格式yyyyMMdd，以北京时间为准。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;当cert_validity_type&#x3D;0时必填  &lt;br/&gt;当cert_validity_type&#x3D;1时为空
        dto.put("cert_end_date", "20380824");
        // 结算人手机号
        dto.put("mp", "13700000214");
        // 银行编号
        dto.put("bank_code", "01030000");

        return dto.toJSONString();
    }

    private static String getCashConfig() {
        JSONObject dto = new JSONObject();
        // 取现类型
        dto.put("cash_type", "D1");
        // 取现固定手续费（元）fix_amt与fee_rate至少填写一项，单位元，需保留小数点后两位，不收费请填写0.00； &lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;
        dto.put("fix_amt", "1.00");
        // 取现手续费率（%）fix_amt与fee_rate至少填写一项，单位%，需保留小数点后两位，取值范围[0.00,100.00]，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;&lt;br/&gt;注：如果fix_amt与fee_rate都填写了则手续费&#x3D;fix_amt+支付金额\*fee_rate
        dto.put("fee_rate", "");
        // 是否交易手续费外扣
        // dto.put("out_fee_flag", "");
        // 手续费承担方
        // dto.put("out_fee_huifu_id", "");
        // 交易手续费外扣的账户类型
        // dto.put("out_fee_acct_type", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getSettleConfig() {
        JSONObject dto = new JSONObject();
        // 结算周期
        dto.put("settle_cycle", "D1");
        // 结算手续费外扣商户号结算手续费外扣商户号，填写承担手续费的汇付商户号&lt;br/&gt;当out_settle_flag&#x3D;1时必填，否则非必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123&lt;/font&gt;
        dto.put("out_settle_huifuid", "");
        // 起结金额
        dto.put("min_amt", "1.00");
        // 留存金额
        dto.put("remained_amt", "2.00");
        // 结算摘要
        dto.put("settle_abstract", "我这里显示结算摘要");
        // 手续费外扣标记
        dto.put("out_settle_flag", "2");
        // 结算手续费外扣账户类型
        // dto.put("out_settle_acct_type", "");
        // 节假日结算手续费率（%）
        dto.put("fixed_ratio", "5.00");
        // 结算方式
        // dto.put("settle_pattern", "");
        // 结算批次号
        // dto.put("settle_batch_no", "");
        // 是否优先到账
        // dto.put("is_priority_receipt", "");
        // 自定义结算处理时间
        // dto.put("settle_time", "");
        // 节假日结算手续费固定金额（元）
        // dto.put("constant_amt", "");

        return dto.toJSONString();
    }

}
