package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 微信实名认证
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBusiRealnameRequest extends BaseRequest {

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
     * 联系人姓名
     */
    @JSONField(name = "name")
    private String name;
    /**
     * 联系人手机号
     */
    @JSONField(name = "mobile")
    private String mobile;
    /**
     * 联系人身份证号码
     */
    @JSONField(name = "id_card_number")
    private String idCardNumber;
    /**
     * 联系人类型
     */
    @JSONField(name = "contact_type")
    private String contactType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BUSI_REALNAME;
    }

    public V2MerchantBusiRealnameRequest() {
    }

    public V2MerchantBusiRealnameRequest(String reqSeqId, String reqDate, String huifuId, String name, String mobile, String idCardNumber, String contactType) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.name = name;
        this.mobile = mobile;
        this.idCardNumber = idCardNumber;
        this.contactType = contactType;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

}
