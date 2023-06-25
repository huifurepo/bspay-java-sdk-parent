package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 交易查询接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePaymentScanpayQueryRequest extends BaseRequest {

    /**
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 汇付服务订单号out_order_no,org_hf_seq_id,org_req_seq_id 必填其一；汇付生成的服务订单号；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1234323JKHDFE1243252&lt;/font&gt;
     */
    @JSONField(name = "out_order_no")
    private String outOrderNo;
    /**
     * 创建服务订单返回的汇付全局流水号out_order_no,org_hf_seq_id,org_req_seq_id 必填其一；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：00290TOP1GR210919004230P853ac13262200000&lt;/font&gt;
     */
    @JSONField(name = "org_hf_seq_id")
    private String orgHfSeqId;
    /**
     * 服务订单创建请求流水号out_order_no,org_hf_seq_id,org_req_seq_id 必填其一；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：202110210012100005&lt;/font&gt;
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 原机构请求日期
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_SCANPAY_QUERY;
    }

    public V2TradePaymentScanpayQueryRequest() {
    }

    public V2TradePaymentScanpayQueryRequest(String huifuId, String outOrderNo, String orgHfSeqId, String orgReqSeqId, String orgReqDate) {
        this.huifuId = huifuId;
        this.outOrderNo = outOrderNo;
        this.orgHfSeqId = orgHfSeqId;
        this.orgReqSeqId = orgReqSeqId;
        this.orgReqDate = orgReqDate;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getOrgHfSeqId() {
        return orgHfSeqId;
    }

    public void setOrgHfSeqId(String orgHfSeqId) {
        this.orgHfSeqId = orgHfSeqId;
    }

    public String getOrgReqSeqId() {
        return orgReqSeqId;
    }

    public void setOrgReqSeqId(String orgReqSeqId) {
        this.orgReqSeqId = orgReqSeqId;
    }

    public String getOrgReqDate() {
        return orgReqDate;
    }

    public void setOrgReqDate(String orgReqDate) {
        this.orgReqDate = orgReqDate;
    }

}
