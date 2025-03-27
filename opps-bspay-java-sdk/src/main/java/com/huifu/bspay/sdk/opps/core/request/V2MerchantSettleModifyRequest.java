package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 修改子账户配置
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantSettleModifyRequest extends BaseRequest {

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
     * 商户汇付Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 上级汇付Id
     */
    @JSONField(name = "upper_huifu_id")
    private String upperHuifuId;
    /**
     * 子账户号
     */
    @JSONField(name = "acct_id")
    private String acctId;
    /**
     * 结算规则配置
     */
    @JSONField(name = "settle_config")
    private String settleConfig;
    /**
     * 结算卡信息配置新账户绑定的结算银行账户。jsonObject格式。若结算规则中上送token_no，则card_info不填。
     */
    @JSONField(name = "card_info")
    private String cardInfo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_SETTLE_MODIFY;
    }

    public V2MerchantSettleModifyRequest() {
    }

    public V2MerchantSettleModifyRequest(String reqSeqId, String reqDate, String huifuId, String upperHuifuId, String acctId, String settleConfig, String cardInfo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.upperHuifuId = upperHuifuId;
        this.acctId = acctId;
        this.settleConfig = settleConfig;
        this.cardInfo = cardInfo;
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

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getSettleConfig() {
        return settleConfig;
    }

    public void setSettleConfig(String settleConfig) {
        this.settleConfig = settleConfig;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }

}
