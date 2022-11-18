package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2UserBusiModifyRequest;

/**
 * 用户业务入驻修改 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2UserBusiModifyRequest.class)
public class V2UserBusiModifyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2UserBusiModifyRequest request = new V2UserBusiModifyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 渠道商汇付Id
        request.setUpperHuifuId("6666000104633228");
        // 汇付ID
        request.setHuifuId("6666000104896342");

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
        // 结算信息配置
        extendInfoMap.put("settle_config", getSettleConfig());
        // 结算卡信息
        extendInfoMap.put("card_info", getCardInfo());
        // 取现配置列表
        extendInfoMap.put("cash_config", getCashConfig());
        // 文件列表
        extendInfoMap.put("file_list", getFileList());
        // 延迟入账开关
        extendInfoMap.put("delay_flag", "");
        // 异步请求地址
        extendInfoMap.put("async_return_url", "//http://service.example.com/to/path");
        return extendInfoMap;
    }

    private static String getFileList() {
        JSONObject dto = new JSONObject();
        // 文件类型
        dto.put("file_type", "F02");
        // 文件jfileID
        dto.put("file_id", "99e00421-dad7-3334-9538-4f2ad10612d5");
        // 文件名称
        dto.put("file_name", "企业营业执照1.jpg");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

    private static String getSettleConfig() {
        JSONObject dto = new JSONObject();
        // 开通状态
        dto.put("settle_status", "1");
        // 结算周期
        dto.put("settle_cycle", "D1");
        // 结算批次号settle_pattern为P0时选填；&lt;br/&gt;0点昨日余额结算批次:0,&lt;/br&gt;1点余额结算批次:100,&lt;/br&gt;2点余额结算批次:200,&lt;/br&gt;3点余额结算批次:300,&lt;/br&gt;4点余额结算批次:400,&lt;/br&gt;5点余额结算批次:500,&lt;/br&gt;6点余额结算批次:600,&lt;/br&gt;7点余额结算批次:700,&lt;/br&gt;8点余额结算批次:800,&lt;/br&gt;9点余额结算批次:900,&lt;/br&gt;10点余额结算批次:1000,&lt;/br&gt;11点余额结算批次:1100,&lt;/br&gt;12点余额结算批次:1200&lt;/br&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1000&lt;/font&gt;
        dto.put("settle_batch_no", "0");
        // 是否优先到账settle_pattern为P0时选填， Y：是 N：否（为空默认取值）；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：Y&lt;/font&gt;
        dto.put("is_priority_receipt", "Y");
        // 自定义结算处理时间settle_pattern为P1时必填， 格式：HHmmss；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：103000&lt;/font&gt;
        dto.put("settle_time", "");
        // 节假日结算手续费率(%)
        dto.put("fixed_ratio", "0.1");
        // 起结金额
        dto.put("min_amt", "0.1");
        // 结算手续费外扣时的账户类型
        dto.put("out_settle_acct_type", "05");
        // 手续费外扣标记
        dto.put("out_settle_flag", "1");
        // 结算手续费外扣时的汇付ID
        dto.put("out_settle_huifuid", "6666000104633228");
        // 留存金额
        dto.put("remained_amt", "0.1");
        // 结算摘要
        dto.put("settle_abstract", "吃吃");
        // 结算方式
        dto.put("settle_pattern", "P0");

        return dto.toJSONString();
    }

    private static String getCardInfo() {
        JSONObject dto = new JSONObject();
        // 结算类型
        dto.put("card_type", "0");
        // 卡户名
        dto.put("card_name", "陈立健");
        // 卡号
        dto.put("card_no", "6217001210064762121");
        // 银行所在省
        dto.put("prov_id", "310000");
        // 银行所在市
        dto.put("area_id", "310100");
        // 银行号对公时必填，[参见银行编码](https://paas.huifu.com/partners/api/#/csfl/api_csfl_yhbm)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：01020000&lt;/font&gt;
        dto.put("bank_code", "01050000");
        // 支行联行号对公时联行号、支行名称二选一必填，[点击查看](https://paas.huifu.com/partners/api/#/csfl/api_csfl_yhzhbm)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：102290026507&lt;/font&gt;
        dto.put("branch_code", "105305264815");
        // 支行名称对公时联行号、支行名称二选一必填，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：中国工商银行上海市中山北路支行&lt;/font&gt;
        dto.put("branch_name", "中国建设银行股份有限公司上海平凉路支行");
        // 持卡人证件类型
        dto.put("cert_type", "00");
        // 持卡人证件号码
        dto.put("cert_no", "110101197003077513");
        // 持卡人证件有效期类型
        dto.put("cert_validity_type", "0");
        // 持卡人证件有效期起始日期
        dto.put("cert_begin_date", "20210806");
        // 持卡人证件有效期截止日期
        dto.put("cert_end_date", "20410806");
        // 银行卡绑定手机号
        dto.put("mp", "15556622368");

        return dto.toJSONString();
    }

    private static String getCashConfig() {
        JSONObject dto = new JSONObject();
        // 开通状态
        dto.put("switch_state", "1");
        // 取现手续费率（%）fix_amt与fee_rate至少填写一项，单位%，需保留小数点后两位，取值范围[0.00,100.00]，不收费请填写0.00；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.05&lt;/font&gt;&lt;br/&gt;注：如果fix_amt与fee_rate都填写了则手续费&#x3D;fix_amt+支付金额*fee_rate
        dto.put("fee_rate", "0.05");
        // 业务类型
        dto.put("cash_type", "D0");
        // 提现手续费（固定/元）
        dto.put("fix_amt", "3");
        // 是否交易手续费外扣
        dto.put("out_fee_flag", "1");
        // 手续费承担方
        dto.put("out_fee_huifu_id", "6666000104633228");
        // 交易手续费外扣的账户类型
        dto.put("out_fee_acct_type", "05");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList.toJSONString();
    }

}
