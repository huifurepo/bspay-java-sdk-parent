package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 商户分账配置
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantSplitConfigRequest extends BaseRequest {

    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 请求时间
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 商户汇付Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 分账规则来源
     */
    @JSONField(name = "rule_origin")
    private String ruleOrigin;
    /**
     * 分账开关
     */
    @JSONField(name = "div_flag")
    private String divFlag;
    /**
     * 最大分账比例
     */
    @JSONField(name = "apply_ratio")
    private String applyRatio;
    /**
     * 生效类型
     */
    @JSONField(name = "start_type")
    private String startType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_SPLIT_CONFIG;
    }

    public V2MerchantSplitConfigRequest() {
    }

    public V2MerchantSplitConfigRequest(String reqSeqId, String reqDate, String huifuId, String ruleOrigin, String divFlag, String applyRatio, String startType) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.ruleOrigin = ruleOrigin;
        this.divFlag = divFlag;
        this.applyRatio = applyRatio;
        this.startType = startType;
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

    public String getRuleOrigin() {
        return ruleOrigin;
    }

    public void setRuleOrigin(String ruleOrigin) {
        this.ruleOrigin = ruleOrigin;
    }

    public String getDivFlag() {
        return divFlag;
    }

    public void setDivFlag(String divFlag) {
        this.divFlag = divFlag;
    }

    public String getApplyRatio() {
        return applyRatio;
    }

    public void setApplyRatio(String applyRatio) {
        this.applyRatio = applyRatio;
    }

    public String getStartType() {
        return startType;
    }

    public void setStartType(String startType) {
        this.startType = startType;
    }

}
