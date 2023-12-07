package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 支付分扣款
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePayscorePayPayscorepayRequest extends BaseRequest {

    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 扣款登记创建请求流水号deduct_req_seq_id与deduct_hf_seq_id二选一；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：2022012614120615001&lt;/font&gt;
     */
    @JSONField(name = "deduct_req_seq_id")
    private String deductReqSeqId;
    /**
     * 扣款登记返回的汇付全局流水号deduct_req_seq_id与deduct_hf_seq_id二选一；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：00470topo1A211015160805P090ac132fef00000&lt;/font&gt;
     */
    @JSONField(name = "deduct_hf_seq_id")
    private String deductHfSeqId;
    /**
     * 微信扣款单号
     */
    @JSONField(name = "out_trade_no")
    private String outTradeNo;
    /**
     * 商品描述
     */
    @JSONField(name = "goods_desc")
    private String goodsDesc;
    /**
     * 安全信息
     */
    @JSONField(name = "risk_check_data")
    private String riskCheckData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYSCORE_PAY_PAYSCOREPAY;
    }

    public V2TradePayscorePayPayscorepayRequest() {
    }

    public V2TradePayscorePayPayscorepayRequest(String reqDate, String reqSeqId, String huifuId, String deductReqSeqId, String deductHfSeqId, String outTradeNo, String goodsDesc, String riskCheckData) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.deductReqSeqId = deductReqSeqId;
        this.deductHfSeqId = deductHfSeqId;
        this.outTradeNo = outTradeNo;
        this.goodsDesc = goodsDesc;
        this.riskCheckData = riskCheckData;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getDeductReqSeqId() {
        return deductReqSeqId;
    }

    public void setDeductReqSeqId(String deductReqSeqId) {
        this.deductReqSeqId = deductReqSeqId;
    }

    public String getDeductHfSeqId() {
        return deductHfSeqId;
    }

    public void setDeductHfSeqId(String deductHfSeqId) {
        this.deductHfSeqId = deductHfSeqId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getRiskCheckData() {
        return riskCheckData;
    }

    public void setRiskCheckData(String riskCheckData) {
        this.riskCheckData = riskCheckData;
    }

}
