package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 企业商户进件
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBasicdataEntRequest extends BaseRequest {

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
     * 小票名称
     */
    @JSONField(name = "receipt_name")
    private String receiptName;
    /**
     * 公司类型
     */
    @JSONField(name = "ent_type")
    private String entType;
    /**
     * 所属行业参考[汇付MCC编码](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_hfmccbm) ；当use_head_info_flag&#x3D;Y时不填&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：5311&lt;/font&gt;
     */
    @JSONField(name = "mcc")
    private String mcc;
    /**
     * 经营类型1：实体，2：虚拟 ；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：1&lt;/font&gt; ；当use_head_info_flag&#x3D;Y时不填
     */
    @JSONField(name = "busi_type")
    private String busiType;
    /**
     * 场景类型
     */
    @JSONField(name = "scene_type")
    private String sceneType;
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
     * 证照有效期截止日期格式：yyyyMMdd。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;  当license_validity_type&#x3D;0时必填；当license_validity_type&#x3D;1时为空；当use_head_info_flag&#x3D;Y时不填
     */
    @JSONField(name = "license_end_date")
    private String licenseEndDate;
    /**
     * 成立时间
     */
    @JSONField(name = "found_date")
    private String foundDate;
    /**
     * 注册资本保留两位小数；条件选填，国营企业、私营企业、外资企业、事业单位、其他、集体经济必填，政府机构、个体工商户可为空；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：100.00&lt;/font&gt;
     */
    @JSONField(name = "reg_capital")
    private String regCapital;
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
     * 经营区
     */
    @JSONField(name = "district_id")
    private String districtId;
    /**
     * 经营详细地址scene_type&#x3D;OFFLINE/ALL时必填；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：上海市徐汇区XX路XX号&lt;/font&gt;
     */
    @JSONField(name = "detail_addr")
    private String detailAddr;
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
     * 法人证件有效期截止日期日期格式：yyyyMMdd， &lt;font color&#x3D;&quot;green&quot;&gt;示例值：20220125&lt;/font&gt;&lt;br/&gt;当legal_cert_validity_type&#x3D;0时必填；&lt;br/&gt;当legal_cert_validity_type&#x3D;1时为空；&lt;br/&gt;当use_head_info_flag&#x3D;Y时不填
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
     * 开户许可证企业商户需要，结算账号为对公账户必填；通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F08；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "reg_acct_pic")
    private String regAcctPic;
    /**
     * 基本存款账户编号或核准号条件选填；当use_head_info_flag&#x3D;Y时不填 ；&lt;br/&gt;基本存款账户信息请填写基本存款账户编号；开户许可证请填写核准号。&lt;br/&gt;当注册地址或经营地址为如下地区时必填：江苏省、浙江省、湖南省、湖北省、云南省、贵州省、陕西省、河南省、吉林省、黑龙江省、福建省、海南省、重庆市、青海省、宁夏回族自治区；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：J2900123456789&lt;/font&gt;
     */
    @JSONField(name = "open_licence_no")
    private String openLicenceNo;
    /**
     * 银行卡信息配置
     */
    @JSONField(name = "card_info")
    private String cardInfo;
    /**
     * 卡正面**对私必填**。通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F13；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "settle_card_front_pic")
    private String settleCardFrontPic;
    /**
     * 持卡人身份证国徽面**对私必填**。通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F56；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "settle_cert_back_pic")
    private String settleCertBackPic;
    /**
     * 持卡人身份证人像面**对私必填**。通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F55；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "settle_cert_front_pic")
    private String settleCertFrontPic;
    /**
     * 授权委托书**对私非法人、对公非同名结算必填**；通过[图片上传接口](https://paas.huifu.com/open/doc/api/#/shgl/shjj/api_shjj_shtpsc)上传材料；文件类型：F15；开通银行电子账户（中信E管家）需提供F520；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "auth_entrust_pic")
    private String authEntrustPic;
    /**
     * 上级汇付Id如果head_office_flag&#x3D;0，则字段必填，如果head_office_flag&#x3D;1，上级汇付Id不可传&lt;br/&gt;如果headOfficeFlag&#x3D;0，useHeadInfoFlag&#x3D;Y,且head_huifu_id不为空则基本信息部分复用上级的基本信息。&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123&lt;/font&gt;
     */
    @JSONField(name = "head_huifu_id")
    private String headHuifuId;
    /**
     * 商户ICP备案编号商户ICP备案编号或网站许可证号；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：沪ICP备06046402号-28 &lt;/font&gt;&lt;br/&gt;类型为PC网站时，且为企业商户，且开通快捷或网银，或大额转账，或余额支付或分账业务（20%（不含）-100%），或为个人商户开通分账业务（10%（不含）-100%），必填
     */
    @JSONField(name = "mer_icp")
    private String merIcp;
    /**
     * 店铺门头照
     */
    @JSONField(name = "store_header_pic")
    private String storeHeaderPic;
    /**
     * 店铺内景/工作区域照
     */
    @JSONField(name = "store_indoor_pic")
    private String storeIndoorPic;
    /**
     * 店铺收银台/公司前台照
     */
    @JSONField(name = "store_cashier_desk_pic")
    private String storeCashierDeskPic;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BASICDATA_ENT;
    }

    public V2MerchantBasicdataEntRequest() {
    }

    public V2MerchantBasicdataEntRequest(String reqSeqId, String reqDate, String upperHuifuId, String regName, String shortName, String receiptName, String entType, String mcc, String busiType, String sceneType, String licensePic, String licenseCode, String licenseValidityType, String licenseBeginDate, String licenseEndDate, String foundDate, String regCapital, String regDistrictId, String regDetail, String districtId, String detailAddr, String legalName, String legalCertType, String legalCertNo, String legalCertValidityType, String legalCertBeginDate, String legalCertEndDate, String legalAddr, String legalCertBackPic, String legalCertFrontPic, String contactMobileNo, String contactEmail, String loginName, String regAcctPic, String openLicenceNo, String cardInfo, String settleCardFrontPic, String settleCertBackPic, String settleCertFrontPic, String authEntrustPic, String headHuifuId, String merIcp, String storeHeaderPic, String storeIndoorPic, String storeCashierDeskPic) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.upperHuifuId = upperHuifuId;
        this.regName = regName;
        this.shortName = shortName;
        this.receiptName = receiptName;
        this.entType = entType;
        this.mcc = mcc;
        this.busiType = busiType;
        this.sceneType = sceneType;
        this.licensePic = licensePic;
        this.licenseCode = licenseCode;
        this.licenseValidityType = licenseValidityType;
        this.licenseBeginDate = licenseBeginDate;
        this.licenseEndDate = licenseEndDate;
        this.foundDate = foundDate;
        this.regCapital = regCapital;
        this.regDistrictId = regDistrictId;
        this.regDetail = regDetail;
        this.districtId = districtId;
        this.detailAddr = detailAddr;
        this.legalName = legalName;
        this.legalCertType = legalCertType;
        this.legalCertNo = legalCertNo;
        this.legalCertValidityType = legalCertValidityType;
        this.legalCertBeginDate = legalCertBeginDate;
        this.legalCertEndDate = legalCertEndDate;
        this.legalAddr = legalAddr;
        this.legalCertBackPic = legalCertBackPic;
        this.legalCertFrontPic = legalCertFrontPic;
        this.contactMobileNo = contactMobileNo;
        this.contactEmail = contactEmail;
        this.loginName = loginName;
        this.regAcctPic = regAcctPic;
        this.openLicenceNo = openLicenceNo;
        this.cardInfo = cardInfo;
        this.settleCardFrontPic = settleCardFrontPic;
        this.settleCertBackPic = settleCertBackPic;
        this.settleCertFrontPic = settleCertFrontPic;
        this.authEntrustPic = authEntrustPic;
        this.headHuifuId = headHuifuId;
        this.merIcp = merIcp;
        this.storeHeaderPic = storeHeaderPic;
        this.storeIndoorPic = storeIndoorPic;
        this.storeCashierDeskPic = storeCashierDeskPic;
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getReceiptName() {
        return receiptName;
    }

    public void setReceiptName(String receiptName) {
        this.receiptName = receiptName;
    }

    public String getEntType() {
        return entType;
    }

    public void setEntType(String entType) {
        this.entType = entType;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getSceneType() {
        return sceneType;
    }

    public void setSceneType(String sceneType) {
        this.sceneType = sceneType;
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

    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital;
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

    public String getRegAcctPic() {
        return regAcctPic;
    }

    public void setRegAcctPic(String regAcctPic) {
        this.regAcctPic = regAcctPic;
    }

    public String getOpenLicenceNo() {
        return openLicenceNo;
    }

    public void setOpenLicenceNo(String openLicenceNo) {
        this.openLicenceNo = openLicenceNo;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }

    public String getSettleCardFrontPic() {
        return settleCardFrontPic;
    }

    public void setSettleCardFrontPic(String settleCardFrontPic) {
        this.settleCardFrontPic = settleCardFrontPic;
    }

    public String getSettleCertBackPic() {
        return settleCertBackPic;
    }

    public void setSettleCertBackPic(String settleCertBackPic) {
        this.settleCertBackPic = settleCertBackPic;
    }

    public String getSettleCertFrontPic() {
        return settleCertFrontPic;
    }

    public void setSettleCertFrontPic(String settleCertFrontPic) {
        this.settleCertFrontPic = settleCertFrontPic;
    }

    public String getAuthEntrustPic() {
        return authEntrustPic;
    }

    public void setAuthEntrustPic(String authEntrustPic) {
        this.authEntrustPic = authEntrustPic;
    }

    public String getHeadHuifuId() {
        return headHuifuId;
    }

    public void setHeadHuifuId(String headHuifuId) {
        this.headHuifuId = headHuifuId;
    }

    public String getMerIcp() {
        return merIcp;
    }

    public void setMerIcp(String merIcp) {
        this.merIcp = merIcp;
    }

    public String getStoreHeaderPic() {
        return storeHeaderPic;
    }

    public void setStoreHeaderPic(String storeHeaderPic) {
        this.storeHeaderPic = storeHeaderPic;
    }

    public String getStoreIndoorPic() {
        return storeIndoorPic;
    }

    public void setStoreIndoorPic(String storeIndoorPic) {
        this.storeIndoorPic = storeIndoorPic;
    }

    public String getStoreCashierDeskPic() {
        return storeCashierDeskPic;
    }

    public void setStoreCashierDeskPic(String storeCashierDeskPic) {
        this.storeCashierDeskPic = storeCashierDeskPic;
    }

}
