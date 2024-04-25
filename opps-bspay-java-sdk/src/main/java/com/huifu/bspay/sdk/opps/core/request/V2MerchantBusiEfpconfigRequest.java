package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 全域资金管理配置
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBusiEfpconfigRequest extends BaseRequest {

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
     * 商户汇付id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 所属渠道商
     */
    @JSONField(name = "upper_huifu_id")
    private String upperHuifuId;
    /**
     * 开关
     */
    @JSONField(name = "switch_state")
    private String switchState;
    /**
     * 自动入账开关0:关闭 1:开通；switch_state为1时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1&lt;/font&gt;
     */
    @JSONField(name = "out_order_auto_acct_flag")
    private String outOrderAutoAcctFlag;
    /**
     * 支付手续费外扣汇付ID支付手续费外扣标记为1时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812123&lt;/font&gt;
     */
    @JSONField(name = "out_fee_huifuid")
    private String outFeeHuifuid;
    /**
     * 全域资金开户使用的银行卡信息首次开通时必填 jsonObject格式
     */
    @JSONField(name = "out_order_acct_card")
    private String outOrderAcctCard;
    /**
     * 全域资金开户手续费首次开通时必填 jsonObject格式
     */
    @JSONField(name = "out_order_acct_open_fees")
    private String outOrderAcctOpenFees;
    /**
     * 商户与其他支付机构签署的收单协议文件id首次开通时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "other_payment_institutions_pic")
    private String otherPaymentInstitutionsPic;
    /**
     * 银行类型
     */
    @JSONField(name = "out_funds_gate_id")
    private String outFundsGateId;
    /**
     * 签约人信息switch_state为1时必填 jsonObject格式
     */
    @JSONField(name = "sign_user_info")
    private String signUserInfo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BUSI_EFPCONFIG;
    }

    public V2MerchantBusiEfpconfigRequest() {
    }

    public V2MerchantBusiEfpconfigRequest(String reqSeqId, String reqDate, String huifuId, String upperHuifuId, String switchState, String outOrderAutoAcctFlag, String outFeeHuifuid, String outOrderAcctCard, String outOrderAcctOpenFees, String otherPaymentInstitutionsPic, String outFundsGateId, String signUserInfo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.upperHuifuId = upperHuifuId;
        this.switchState = switchState;
        this.outOrderAutoAcctFlag = outOrderAutoAcctFlag;
        this.outFeeHuifuid = outFeeHuifuid;
        this.outOrderAcctCard = outOrderAcctCard;
        this.outOrderAcctOpenFees = outOrderAcctOpenFees;
        this.otherPaymentInstitutionsPic = otherPaymentInstitutionsPic;
        this.outFundsGateId = outFundsGateId;
        this.signUserInfo = signUserInfo;
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

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getUpperHuifuId() {
        return upperHuifuId;
    }

    public void setUpperHuifuId(String upperHuifuId) {
        this.upperHuifuId = upperHuifuId;
    }

    public String getSwitchState() {
        return switchState;
    }

    public void setSwitchState(String switchState) {
        this.switchState = switchState;
    }

    public String getOutOrderAutoAcctFlag() {
        return outOrderAutoAcctFlag;
    }

    public void setOutOrderAutoAcctFlag(String outOrderAutoAcctFlag) {
        this.outOrderAutoAcctFlag = outOrderAutoAcctFlag;
    }

    public String getOutFeeHuifuid() {
        return outFeeHuifuid;
    }

    public void setOutFeeHuifuid(String outFeeHuifuid) {
        this.outFeeHuifuid = outFeeHuifuid;
    }

    public String getOutOrderAcctCard() {
        return outOrderAcctCard;
    }

    public void setOutOrderAcctCard(String outOrderAcctCard) {
        this.outOrderAcctCard = outOrderAcctCard;
    }

    public String getOutOrderAcctOpenFees() {
        return outOrderAcctOpenFees;
    }

    public void setOutOrderAcctOpenFees(String outOrderAcctOpenFees) {
        this.outOrderAcctOpenFees = outOrderAcctOpenFees;
    }

    public String getOtherPaymentInstitutionsPic() {
        return otherPaymentInstitutionsPic;
    }

    public void setOtherPaymentInstitutionsPic(String otherPaymentInstitutionsPic) {
        this.otherPaymentInstitutionsPic = otherPaymentInstitutionsPic;
    }

    public String getOutFundsGateId() {
        return outFundsGateId;
    }

    public void setOutFundsGateId(String outFundsGateId) {
        this.outFundsGateId = outFundsGateId;
    }

    public String getSignUserInfo() {
        return signUserInfo;
    }

    public void setSignUserInfo(String signUserInfo) {
        this.signUserInfo = signUserInfo;
    }

}
