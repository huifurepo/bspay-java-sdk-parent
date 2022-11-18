package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 个人商户基本信息入驻
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBasicdataIndvRequest extends BaseRequest {

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
     * 上级主体ID
     */
    @JSONField(name = "upper_huifu_id")
    private String upperHuifuId;
    /**
     * 商户名
     */
    @JSONField(name = "reg_name")
    private String regName;
    /**
     * 经营省
     */
    @JSONField(name = "prov_id")
    private String provId;
    /**
     * 经营市
     */
    @JSONField(name = "area_id")
    private String areaId;
    /**
     * 经营区
     */
    @JSONField(name = "district_id")
    private String districtId;
    /**
     * 经营详细地址
     */
    @JSONField(name = "detail_addr")
    private String detailAddr;
    /**
     * 联系人姓名
     */
    @JSONField(name = "contact_name")
    private String contactName;
    /**
     * 联系人手机号
     */
    @JSONField(name = "contact_mobile_no")
    private String contactMobileNo;
    /**
     * 联系人电子邮箱
     */
    @JSONField(name = "contact_email")
    private String contactEmail;
    /**
     * 结算卡信息配置
     */
    @JSONField(name = "card_info")
    private String cardInfo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BASICDATA_INDV;
    }

    public V2MerchantBasicdataIndvRequest() {
    }

    public V2MerchantBasicdataIndvRequest(String reqSeqId, String reqDate, String upperHuifuId, String regName, String provId, String areaId, String districtId, String detailAddr, String contactName, String contactMobileNo, String contactEmail, String cardInfo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.upperHuifuId = upperHuifuId;
        this.regName = regName;
        this.provId = provId;
        this.areaId = areaId;
        this.districtId = districtId;
        this.detailAddr = detailAddr;
        this.contactName = contactName;
        this.contactMobileNo = contactMobileNo;
        this.contactEmail = contactEmail;
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

    public String getUpperHuifuId() {
        return upperHuifuId;
    }

    public void setUpperHuifuId(String upperHuifuId) {
        this.upperHuifuId = upperHuifuId;
    }

    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getDetailAddr() {
        return detailAddr;
    }

    public void setDetailAddr(String detailAddr) {
        this.detailAddr = detailAddr;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMobileNo() {
        return contactMobileNo;
    }

    public void setContactMobileNo(String contactMobileNo) {
        this.contactMobileNo = contactMobileNo;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }

}
