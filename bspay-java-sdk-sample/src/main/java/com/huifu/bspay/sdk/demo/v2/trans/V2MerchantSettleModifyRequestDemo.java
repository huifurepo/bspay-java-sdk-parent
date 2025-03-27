package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2MerchantSettleModifyRequest;

/**
 * 修改子账户配置 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2MerchantSettleModifyRequest.class)
public class V2MerchantSettleModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2MerchantSettleModifyRequest request = new V2MerchantSettleModifyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户汇付Id
        request.setHuifuId("6666000106071234");
        // 上级汇付Id
        request.setUpperHuifuId("6666000106065087");
        // 子账户号
        request.setAcctId("C01571234");
        // 结算规则配置
        request.setSettleConfig(getBba81a50640243a6A37cBa656e0f396c());
        // 结算卡信息配置新账户绑定的结算银行账户。jsonObject格式。若结算规则中上送token_no，则card_info不填。
        request.setCardInfo(get0abd73495f2b4147B17b45cc26cbaa48());

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
        // 异步请求地址
        extendInfoMap.put("async_return_url", "");
        return extendInfoMap;
    }

    private static String getBba81a50640243a6A37cBa656e0f396c() {
        JSONObject dto = new JSONObject();
        // 状态
        dto.put("settle_status", "0");
        // 结算周期
        dto.put("settle_cycle", "D1");
        // 结算手续费外扣商户号填写承担手续费的汇付商户号；当out_settle_flag&#x3D;1时必填，否则非必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123&lt;/font&gt;
        dto.put("out_settle_huifuid", "6666000106071234");
        // 结算批次号结算方式为P0：批次结算时必填，即将按指定结算批次号进行资金结算；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：100&lt;/font&gt;；[参见结算批次说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_jspc)
        dto.put("settle_batch_no", "0");
        // 自定义结算处理时间当settle_pattern&#x3D;P1/P2自定义时间结算时必填；注意：00:00到00:30不能指定&lt;br/&gt;到账时间，格式：HHmmss；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：103000&lt;/font&gt;
        dto.put("settle_time", "211221");
        // 节假日结算手续费率settle_cycle为D1时必填。单位%，需保留小数点后两位。取值范围[0.00，100.00]，不收费请填写0.00；settle_cycle&#x3D;T1时，不生效 ；settle_cycle为D1时，遇节假日按此费率结算 ；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;
        dto.put("fixed_ratio", "66.88");
        // 节假日结算手续费固定金额settle_cycle为D1时必填。单位元，需保留小数点后两位。不收费请填写0.00；settle_cycle结算周期为D1时，遇节假日按此费率结算 ；&lt;br/&gt; &lt;font color&#x3D;&quot;green&quot;&gt;示例值：1.00&lt;/font&gt;
        dto.put("constant_amt", "66.99");
        // 起结金额
        dto.put("min_amt", "1");
        // 留存金额
        dto.put("remained_amt", "2");
        // 结算摘要
        dto.put("settle_abstract", "abstract");
        // 手续费外扣标记
        dto.put("out_settle_flag", "1");
        // 结算手续费外扣账户类型
        dto.put("out_settle_acct_type", "01");
        // 结算方式
        dto.put("settle_pattern", "P0");
        // 是否优先到账
        dto.put("is_priority_receipt", "N");
        // 卡序列号
        dto.put("token_no", "");
        // 工作日结算手续费率
        // dto.put("workday_fixed_ratio", "");
        // 工作日结算手续费固定金额
        // dto.put("workday_constant_amt", "");

        return dto.toJSONString();
    }

    private static String get0abd73495f2b4147B17b45cc26cbaa48() {
        JSONObject dto = new JSONObject();
        // 结算账户类型
        dto.put("card_type", "0");
        // 结算账户名
        dto.put("card_name", "张三");
        // 结算账号
        dto.put("card_no", "6225682141111111111");
        // 银行所在省
        dto.put("prov_id", "310000");
        // 银行所在市
        dto.put("area_id", "310100");
        // 银行编号参考： [银行编码](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_yhbm) ； &lt;font color&#x3D;&quot;green&quot;&gt;示例值：01020000 &lt;/font&gt; &lt;br/&gt;当card_type&#x3D;0时必填
        dto.put("bank_code", "01030000");
        // 联行号参考：[银行支行编码](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_yhzhbm) 当card_type&#x3D;0时必填。&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：102290026507&lt;/font&gt;
        dto.put("branch_code", "103290040169");
        // 持卡人证件类型参见《[自然人证件类型](https://paas.huifu.com/open/doc/api/#/api_ggcsbm?id&#x3D;%e8%87%aa%e7%84%b6%e4%ba%ba%e8%af%81%e4%bb%b6%e7%b1%bb%e5%9e%8b)》 当card_type&#x3D;0时为空， 当card_type&#x3D;1或2时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：00&lt;/font&gt;
        dto.put("cert_type", "00");
        // 持卡人证件有效期开始日期格式：yyyyMMdd，以北京时间为准；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;，当cert_validity_type&#x3D;0时必填；当cert_validity_type&#x3D;1时为空
        dto.put("cert_end_date", "20221212");
        // 持卡人证件号码
        dto.put("cert_no", "220105198806082098");
        // 持卡人证件有效期类型
        dto.put("cert_validity_type", "0");
        // 持卡人证件有效期开始
        dto.put("cert_begin_date", "20220101");
        // 结算人手机号
        dto.put("mp", "17521216927");
        // *验证码*
        // dto.put("verify_code", "");
        // *适用子账户*
        // dto.put("acct_ids", "");

        return dto.toJSONString();
    }

}
