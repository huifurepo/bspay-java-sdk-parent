package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 支付宝实名申请提交
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBusiAliRealnameApplyRequest extends BaseRequest {

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
     * 汇付ID
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 联系人信息
     */
    @JSONField(name = "contact_person_info")
    private String contactPersonInfo;
    /**
     * 主体信息
     */
    @JSONField(name = "auth_identity_info")
    private String authIdentityInfo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BUSI_ALI_REALNAME_APPLY;
    }

    public V2MerchantBusiAliRealnameApplyRequest() {
    }

    public V2MerchantBusiAliRealnameApplyRequest(String reqSeqId, String reqDate, String huifuId, String contactPersonInfo, String authIdentityInfo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.contactPersonInfo = contactPersonInfo;
        this.authIdentityInfo = authIdentityInfo;
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

    public String getContactPersonInfo() {
        return contactPersonInfo;
    }

    public void setContactPersonInfo(String contactPersonInfo) {
        this.contactPersonInfo = contactPersonInfo;
    }

    public String getAuthIdentityInfo() {
        return authIdentityInfo;
    }

    public void setAuthIdentityInfo(String authIdentityInfo) {
        this.authIdentityInfo = authIdentityInfo;
    }

}
