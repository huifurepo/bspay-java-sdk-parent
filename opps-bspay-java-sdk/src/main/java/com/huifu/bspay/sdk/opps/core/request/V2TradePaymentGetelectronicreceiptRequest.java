package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 电子回单查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePaymentGetelectronicreceiptRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 是否展示手续费
     */
    @JSONField(name = "show_feemat")
    private String showFeemat;
    /**
     * 交易返回的全局流水号交易返回的全局流水号。org_hf_seq_id与（org_req_seq_id、org_req_date、pay_type） 不能同时为空
     */
    @JSONField(name = "org_hf_seq_id")
    private String orgHfSeqId;
    /**
     * 原交易请求日期转换描述:yyyyMMdd
     */
    @JSONField(name = "org_req_date")
    private String orgReqDate;
    /**
     * 原交易请求流水号org_hf_seq_id与（org_req_seq_id、org_req_date、pay_type） 不能同时为空
     */
    @JSONField(name = "org_req_seq_id")
    private String orgReqSeqId;
    /**
     * 支付类型原交易请求流水号不为空必填 &lt;br/&gt;BALANCE_PAY-余额支付，&lt;br/&gt;CASHOUT-取现，&lt;br/&gt;QUICK_PAY-快捷支付，&lt;br/&gt;ONLINE_PAY-网银，&lt;br/&gt;&lt;!--SURROGATE-代发&lt;br/&gt;许士通说暂不支持--&gt;PAY_CONFIRM-交易确认&lt;br/&gt;TRANSFER_ACCT-大额转账&lt;br/&gt;注意：&lt;br/&gt;选择交易确认类型时：请传入交易确认的请求流水号或全局流水号。
     */
    @JSONField(name = "pay_type")
    private String payType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_GETELECTRONICRECEIPT;
    }

    public V2TradePaymentGetelectronicreceiptRequest() {
    }

    public V2TradePaymentGetelectronicreceiptRequest(String huifuId, String showFeemat, String orgHfSeqId, String orgReqDate, String orgReqSeqId, String payType) {
        this.huifuId = huifuId;
        this.showFeemat = showFeemat;
        this.orgHfSeqId = orgHfSeqId;
        this.orgReqDate = orgReqDate;
        this.orgReqSeqId = orgReqSeqId;
        this.payType = payType;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getShowFeemat() {
        return showFeemat;
    }

    public void setShowFeemat(String showFeemat) {
        this.showFeemat = showFeemat;
    }

    public String getOrgHfSeqId() {
        return orgHfSeqId;
    }

    public void setOrgHfSeqId(String orgHfSeqId) {
        this.orgHfSeqId = orgHfSeqId;
    }

    public String getOrgReqDate() {
        return orgReqDate;
    }

    public void setOrgReqDate(String orgReqDate) {
        this.orgReqDate = orgReqDate;
    }

    public String getOrgReqSeqId() {
        return orgReqSeqId;
    }

    public void setOrgReqSeqId(String orgReqSeqId) {
        this.orgReqSeqId = orgReqSeqId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

}
