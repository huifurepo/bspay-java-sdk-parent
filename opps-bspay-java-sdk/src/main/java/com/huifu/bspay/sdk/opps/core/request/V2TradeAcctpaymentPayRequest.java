package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 余额支付
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeAcctpaymentPayRequest extends BaseRequest {

    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 出款方商户号
     */
    @JSONField(name = "out_huifu_id")
    private String outHuifuId;
    /**
     * 支付金额
     */
    @JSONField(name = "ord_amt")
    private String ordAmt;
    /**
     * 分账对象
     */
    @JSONField(name = "acct_split_bunch")
    private String acctSplitBunch;
    /**
     * 安全信息
     */
    @JSONField(name = "risk_check_data")
    private String riskCheckData;
    /**
     * 资金类型资金类型。支付渠道为中信E管家时，资金类型必填（[详见说明](https://paas.huifu.com/partners/api/#/yuer/api_zxegjzllx)）
     */
    @JSONField(name = "fund_type")
    private String fundType;
    /**
     * 手续费承担方标识余额支付手续费承担方标识；商户余额支付扣收规则为接口指定承担方时必填！枚举值：&lt;br/&gt;OUT：出款方；&lt;br/&gt;IN：分账接受方。&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：IN&lt;/font&gt;
     */
    @JSONField(name = "trans_fee_take_flag")
    private String transFeeTakeFlag;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ACCTPAYMENT_PAY;
    }

    public V2TradeAcctpaymentPayRequest() {
    }

    public V2TradeAcctpaymentPayRequest(String reqSeqId, String reqDate, String outHuifuId, String ordAmt, String acctSplitBunch, String riskCheckData, String fundType, String transFeeTakeFlag) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.outHuifuId = outHuifuId;
        this.ordAmt = ordAmt;
        this.acctSplitBunch = acctSplitBunch;
        this.riskCheckData = riskCheckData;
        this.fundType = fundType;
        this.transFeeTakeFlag = transFeeTakeFlag;
    }

    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getOutHuifuId() {
        return outHuifuId;
    }

    public void setOutHuifuId(String outHuifuId) {
        this.outHuifuId = outHuifuId;
    }

    public String getOrdAmt() {
        return ordAmt;
    }

    public void setOrdAmt(String ordAmt) {
        this.ordAmt = ordAmt;
    }

    public String getAcctSplitBunch() {
        return acctSplitBunch;
    }

    public void setAcctSplitBunch(String acctSplitBunch) {
        this.acctSplitBunch = acctSplitBunch;
    }

    public String getRiskCheckData() {
        return riskCheckData;
    }

    public void setRiskCheckData(String riskCheckData) {
        this.riskCheckData = riskCheckData;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getTransFeeTakeFlag() {
        return transFeeTakeFlag;
    }

    public void setTransFeeTakeFlag(String transFeeTakeFlag) {
        this.transFeeTakeFlag = transFeeTakeFlag;
    }

}
