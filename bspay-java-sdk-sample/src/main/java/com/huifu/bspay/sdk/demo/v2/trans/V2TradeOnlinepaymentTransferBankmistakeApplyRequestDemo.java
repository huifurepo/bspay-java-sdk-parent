package com.huifu.bspay.sdk.demo.v2.trans;

import java.util.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.huifu.bspay.sdk.demo.init.OppsMerchantConfigDemo;
import com.huifu.bspay.sdk.opps.core.utils.DateTools;
import com.huifu.bspay.sdk.opps.core.utils.SequenceTools;
import com.huifu.bspay.sdk.demo.core.Identify;
import com.huifu.bspay.sdk.opps.core.request.V2TradeOnlinepaymentTransferBankmistakeApplyRequest;

/**
 * 银行大额支付差错申请 - 示例
 *
 * @author sdk-generator
 * @Description
 */
@Identify(requestClass = V2TradeOnlinepaymentTransferBankmistakeApplyRequest.class)
public class V2TradeOnlinepaymentTransferBankmistakeApplyRequestDemo extends BaseCommonDemo {

    public static void main(String[] args) throws Exception {

        // 1. 数据初始化
        doInit(OppsMerchantConfigDemo.getMerchantConfig());

        // 2.组装请求参数
        V2TradeOnlinepaymentTransferBankmistakeApplyRequest request = new V2TradeOnlinepaymentTransferBankmistakeApplyRequest();
        // 请求流水号
        request.setReqSeqId(SequenceTools.getReqSeqId32());
        // 请求日期
        request.setReqDate(DateTools.getCurrentDateYYYYMMDD());
        // 商户号
        request.setHuifuId("6666000110468104");
        // 交易金额
        request.setTransAmt("0.01");
        // 订单类型
        request.setOrderType("REFUND");
        // 原请求流水号
        request.setOrgReqSeqId("202308312345678931");
        // 原请求日期
        request.setOrgReqDate("20230831");
        // 实际打款日期
        request.setRemitDate("20230615");
        // 实际付款方姓名
        request.setCertificateName("孙洁");
        // 实际付款方银行卡号
        request.setBankCardNo("V2olJv4Srh…………78M8A==");
        // 实际付款方银行名称
        request.setBankName("招商银行");
        // 异步通知地址
        request.setNotifyUrl("http://www.baidu.com");
        // 商品描述
        // request.setGoodsDesc("test");
        // 汇款凭证文件id
        // request.setCertificateFileId("test");

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
        // 备注
        extendInfoMap.put("remark", "大额支付补入账验证");
        // 银行信息数据
        extendInfoMap.put("bank_info_data", getBankInfoData());
        // 延时标记
        // extendInfoMap.put("delay_acct_flag", "");
        // 分账对象
        // extendInfoMap.put("acct_split_bunch", getAcctSplitBunch());
        return extendInfoMap;
    }

    private static String getBankInfoData() {
        JSONObject dto = new JSONObject();
        // 省份对公代发必填，[参见省市地区码](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/area/%E6%96%97%E6%8B%B1%E4%BB%A3%E5%8F%91%E7%9C%81%E4%BB%BD%E5%9C%B0%E5%8C%BA%E7%BC%96%E7%A0%81.xlsx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0013&lt;/font&gt;
        dto.put("province", "0031");
        // 地区对公代发必填，[参见省市地区码](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/area/%E6%96%97%E6%8B%B1%E4%BB%A3%E5%8F%91%E7%9C%81%E4%BB%BD%E5%9C%B0%E5%8C%BA%E7%BC%96%E7%A0%81.xlsx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1301&lt;/font&gt;
        dto.put("area", "3100");
        // 银行编号
        dto.put("bank_code", "03080000");
        // 联行号选填，参见：[银行支行编码](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_yhzhbm)； &lt;font color&#x3D;&quot;green&quot;&gt;示例值：102290026507&lt;/font&gt;&lt;br/&gt;对私代发非必填；
        dto.put("correspondent_code", "103290076178");
        // 对公对私标识
        dto.put("card_acct_type", "P");
        // 证件类型
        dto.put("certificate_type", "01");
        // 手机号
        dto.put("mobile_no", "oO6XYz…………Is3nZb/5dFj860Z+nQ==");
        // 证件号
        dto.put("certify_no", "yL09mhS5…………WK04Kdfyg==");
        // 支行名
        dto.put("subbranch_bank_name", "中国农业银行股份有限公司上海联洋支行");
        // 付款方三证合一码
        dto.put("bank_acct_three_in_one", "92650109MA79R8E308");

        return dto.toJSONString();
    }

    private static JSON getAcctInfos() {
        JSONObject dto = new JSONObject();
        // 支付金额
        // dto.put("div_amt", "");
        // 商户号
        // dto.put("huifu_id", "");

        JSONArray dtoList = new JSONArray();
        dtoList.add(dto);
        return dtoList;
    }

    private static JSON getAcctSplitBunch() {
        JSONObject dto = new JSONObject();
        // 分账信息列表
        // dto.put("acct_infos", getAcctInfos());

        return dto;
    }

}
