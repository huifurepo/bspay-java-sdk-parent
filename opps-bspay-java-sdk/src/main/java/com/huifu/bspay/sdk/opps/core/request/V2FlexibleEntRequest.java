package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 灵工企业商户进件接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2FlexibleEntRequest extends BaseRequest {

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
     * 渠道商号
     */
    @JSONField(name = "upper_huifu_id")
    private String upperHuifuId;
    /**
     * 商户角色
     */
    @JSONField(name = "mer_role")
    private String merRole;
    /**
     * 落地公司类型当选择落地公司时，必填;SELF-自有，COOPERATE-合作
     */
    @JSONField(name = "local_company_type")
    private String localCompanyType;
    /**
     * 商户名称
     */
    @JSONField(name = "reg_name")
    private String regName;
    /**
     * 商户简称
     */
    @JSONField(name = "short_name")
    private String shortName;
    /**
     * 证照图片
     */
    @JSONField(name = "license_pic")
    private String licensePic;
    /**
     * 证照编号
     */
    @JSONField(name = "license_code")
    private String licenseCode;
    /**
     * 证照有效期类型
     */
    @JSONField(name = "license_validity_type")
    private String licenseValidityType;
    /**
     * 证照有效期开始日期
     */
    @JSONField(name = "license_begin_date")
    private String licenseBeginDate;
    /**
     * 证照有效期截止日期格式：yyyyMMdd。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;  当license_validity_type&#x3D;0时必填；当license_validity_type&#x3D;1时为空；
     */
    @JSONField(name = "license_end_date")
    private String licenseEndDate;
    /**
     * 成立时间
     */
    @JSONField(name = "found_date")
    private String foundDate;
    /**
     * 注册区
     */
    @JSONField(name = "reg_district_id")
    private String regDistrictId;
    /**
     * 注册详细地址
     */
    @JSONField(name = "reg_detail")
    private String regDetail;
    /**
     * 法人姓名
     */
    @JSONField(name = "legal_name")
    private String legalName;
    /**
     * 法人证件类型
     */
    @JSONField(name = "legal_cert_type")
    private String legalCertType;
    /**
     * 法人证件号码
     */
    @JSONField(name = "legal_cert_no")
    private String legalCertNo;
    /**
     * 法人证件有效期类型
     */
    @JSONField(name = "legal_cert_validity_type")
    private String legalCertValidityType;
    /**
     * 法人证件有效期开始日期
     */
    @JSONField(name = "legal_cert_begin_date")
    private String legalCertBeginDate;
    /**
     * 法人证件有效期截止日期日期格式：yyyyMMdd， &lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;当legal_cert_validity_type&#x3D;0时必填；&lt;br/&gt;当legal_cert_validity_type&#x3D;1时为空；&lt;br/&gt;
     */
    @JSONField(name = "legal_cert_end_date")
    private String legalCertEndDate;
    /**
     * 法人证件地址
     */
    @JSONField(name = "legal_addr")
    private String legalAddr;
    /**
     * 法人身份证国徽面
     */
    @JSONField(name = "legal_cert_back_pic")
    private String legalCertBackPic;
    /**
     * 法人身份证人像面
     */
    @JSONField(name = "legal_cert_front_pic")
    private String legalCertFrontPic;
    /**
     * 店铺门头照
     */
    @JSONField(name = "store_header_pic")
    private String storeHeaderPic;
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
     * 管理员账号
     */
    @JSONField(name = "login_name")
    private String loginName;
    /**
     * 银行卡信息配置
     */
    @JSONField(name = "card_info")
    private String cardInfo;
    /**
     * 签约人
     */
    @JSONField(name = "sign_user_info")
    private String signUserInfo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_FLEXIBLE_ENT;
    }

    public V2FlexibleEntRequest() {
    }

    public V2FlexibleEntRequest(String reqSeqId, String reqDate, String upperHuifuId, String merRole, String localCompanyType, String regName, String shortName, String licensePic, String licenseCode, String licenseValidityType, String licenseBeginDate, String licenseEndDate, String foundDate, String regDistrictId, String regDetail, String legalName, String legalCertType, String legalCertNo, String legalCertValidityType, String legalCertBeginDate, String legalCertEndDate, String legalAddr, String legalCertBackPic, String legalCertFrontPic, String storeHeaderPic, String contactMobileNo, String contactEmail, String loginName, String cardInfo, String signUserInfo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.upperHuifuId = upperHuifuId;
        this.merRole = merRole;
        this.localCompanyType = localCompanyType;
        this.regName = regName;
        this.shortName = shortName;
        this.licensePic = licensePic;
        this.licenseCode = licenseCode;
        this.licenseValidityType = licenseValidityType;
        this.licenseBeginDate = licenseBeginDate;
        this.licenseEndDate = licenseEndDate;
        this.foundDate = foundDate;
        this.regDistrictId = regDistrictId;
        this.regDetail = regDetail;
        this.legalName = legalName;
        this.legalCertType = legalCertType;
        this.legalCertNo = legalCertNo;
        this.legalCertValidityType = legalCertValidityType;
        this.legalCertBeginDate = legalCertBeginDate;
        this.legalCertEndDate = legalCertEndDate;
        this.legalAddr = legalAddr;
        this.legalCertBackPic = legalCertBackPic;
        this.legalCertFrontPic = legalCertFrontPic;
        this.storeHeaderPic = storeHeaderPic;
        this.contactMobileNo = contactMobileNo;
        this.contactEmail = contactEmail;
        this.loginName = loginName;
        this.cardInfo = cardInfo;
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

    public String getUpperHuifuId() {
        return upperHuifuId;
    }

    public void setUpperHuifuId(String upperHuifuId) {
        this.upperHuifuId = upperHuifuId;
    }

    public String getMerRole() {
        return merRole;
    }

    public void setMerRole(String merRole) {
        this.merRole = merRole;
    }

    public String getLocalCompanyType() {
        return localCompanyType;
    }

    public void setLocalCompanyType(String localCompanyType) {
        this.localCompanyType = localCompanyType;
    }

    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLicensePic() {
        return licensePic;
    }

    public void setLicensePic(String licensePic) {
        this.licensePic = licensePic;
    }

    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    public String getLicenseValidityType() {
        return licenseValidityType;
    }

    public void setLicenseValidityType(String licenseValidityType) {
        this.licenseValidityType = licenseValidityType;
    }

    public String getLicenseBeginDate() {
        return licenseBeginDate;
    }

    public void setLicenseBeginDate(String licenseBeginDate) {
        this.licenseBeginDate = licenseBeginDate;
    }

    public String getLicenseEndDate() {
        return licenseEndDate;
    }

    public void setLicenseEndDate(String licenseEndDate) {
        this.licenseEndDate = licenseEndDate;
    }

    public String getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(String foundDate) {
        this.foundDate = foundDate;
    }

    public String getRegDistrictId() {
        return regDistrictId;
    }

    public void setRegDistrictId(String regDistrictId) {
        this.regDistrictId = regDistrictId;
    }

    public String getRegDetail() {
        return regDetail;
    }

    public void setRegDetail(String regDetail) {
        this.regDetail = regDetail;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalCertType() {
        return legalCertType;
    }

    public void setLegalCertType(String legalCertType) {
        this.legalCertType = legalCertType;
    }

    public String getLegalCertNo() {
        return legalCertNo;
    }

    public void setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
    }

    public String getLegalCertValidityType() {
        return legalCertValidityType;
    }

    public void setLegalCertValidityType(String legalCertValidityType) {
        this.legalCertValidityType = legalCertValidityType;
    }

    public String getLegalCertBeginDate() {
        return legalCertBeginDate;
    }

    public void setLegalCertBeginDate(String legalCertBeginDate) {
        this.legalCertBeginDate = legalCertBeginDate;
    }

    public String getLegalCertEndDate() {
        return legalCertEndDate;
    }

    public void setLegalCertEndDate(String legalCertEndDate) {
        this.legalCertEndDate = legalCertEndDate;
    }

    public String getLegalAddr() {
        return legalAddr;
    }

    public void setLegalAddr(String legalAddr) {
        this.legalAddr = legalAddr;
    }

    public String getLegalCertBackPic() {
        return legalCertBackPic;
    }

    public void setLegalCertBackPic(String legalCertBackPic) {
        this.legalCertBackPic = legalCertBackPic;
    }

    public String getLegalCertFrontPic() {
        return legalCertFrontPic;
    }

    public void setLegalCertFrontPic(String legalCertFrontPic) {
        this.legalCertFrontPic = legalCertFrontPic;
    }

    public String getStoreHeaderPic() {
        return storeHeaderPic;
    }

    public void setStoreHeaderPic(String storeHeaderPic) {
        this.storeHeaderPic = storeHeaderPic;
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

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }

    public String getSignUserInfo() {
        return signUserInfo;
    }

    public void setSignUserInfo(String signUserInfo) {
        this.signUserInfo = signUserInfo;
    }

}
