package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 直付通商户入驻
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantDirectZftRegRequest extends BaseRequest {

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
     * 汇付ID
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 进件的二级商户名称
     */
    @JSONField(name = "name")
    private String name;
    /**
     * 商家类型
     */
    @JSONField(name = "merchant_type")
    private String merchantType;
    /**
     * 商户经营类目
     */
    @JSONField(name = "mcc")
    private String mcc;
    /**
     * 商户证件类型
     */
    @JSONField(name = "cert_type")
    private String certType;
    /**
     * 商户证件编号
     */
    @JSONField(name = "cert_no")
    private String certNo;
    /**
     * 证件名称目前只有个体工商户商户类型要求填入本字段，填写值为个体工商户营业执照上的名称。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：xxxx小卖铺&lt;/font&gt;
     */
    @JSONField(name = "cert_name")
    private String certName;
    /**
     * 法人名称仅个人商户非必填，其他必填。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：张三&lt;/font&gt;
     */
    @JSONField(name = "legal_name")
    private String legalName;
    /**
     * 法人证件号码仅个人商户非必填，其他必填。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：3209261975120284333&lt;/font&gt;
     */
    @JSONField(name = "legal_cert_no")
    private String legalCertNo;
    /**
     * 客服电话
     */
    @JSONField(name = "service_phone")
    private String servicePhone;
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
     * 商户联系人业务标识
     */
    @JSONField(name = "contact_tag")
    private String contactTag;
    /**
     * 联系人类型
     */
    @JSONField(name = "contact_type")
    private String contactType;
    /**
     * 联系人手机号
     */
    @JSONField(name = "contact_mobile_no")
    private String contactMobileNo;
    /**
     * 商户结算卡信息jsonArray格式。本业务当前只允许传入一张结算卡。与支付宝账号字段二选一必填
     */
    @JSONField(name = "zft_card_info_list")
    private String zftCardInfoList;
    /**
     * 商户支付宝账号商户支付宝账号，用作结算账号。与银行卡对象字段二选一必填。&lt;br/&gt;本字段要求支付宝账号的名称与商户名称mch_name同名，且是实名认证过的支付宝账户。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：test@huifu.com&lt;/font&gt;
     */
    @JSONField(name = "alipay_logon_id")
    private String alipayLogonId;
    /**
     * 商户行业资质类型当商户是特殊行业时必填，具体取值[参见表格](https://mif-pub.alipayobjects.com/QualificationType.xlsx)。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：310&lt;/font&gt;
     */
    @JSONField(name = "industry_qualification_type")
    private String industryQualificationType;
    /**
     * 商户使用服务
     */
    @JSONField(name = "service")
    private String service;
    /**
     * 商户与服务商的签约时间
     */
    @JSONField(name = "sign_time_with_isv")
    private String signTimeWithIsv;
    /**
     * 商户支付宝账户用于协议确认。目前商业场景（除医疗、中小学教育等）下必填。本字段要求上送的支付宝账号的名称与商户名称name同名，且是实名认证支付宝账户。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：test@huifu.com&lt;/font&gt;
     */
    @JSONField(name = "binding_alipay_logon_id")
    private String bindingAlipayLogonId;
    /**
     * 默认结算类型
     */
    @JSONField(name = "default_settle_type")
    private String defaultSettleType;
    /**
     * 文件列表
     */
    @JSONField(name = "file_list")
    private String fileList;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_DIRECT_ZFT_REG;
    }

    public V2MerchantDirectZftRegRequest() {
    }

    public V2MerchantDirectZftRegRequest(String reqSeqId, String reqDate, String huifuId, String name, String merchantType, String mcc, String certType, String certNo, String certName, String legalName, String legalCertNo, String servicePhone, String provId, String areaId, String districtId, String detailAddr, String contactName, String contactTag, String contactType, String contactMobileNo, String zftCardInfoList, String alipayLogonId, String industryQualificationType, String service, String signTimeWithIsv, String bindingAlipayLogonId, String defaultSettleType, String fileList) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.name = name;
        this.merchantType = merchantType;
        this.mcc = mcc;
        this.certType = certType;
        this.certNo = certNo;
        this.certName = certName;
        this.legalName = legalName;
        this.legalCertNo = legalCertNo;
        this.servicePhone = servicePhone;
        this.provId = provId;
        this.areaId = areaId;
        this.districtId = districtId;
        this.detailAddr = detailAddr;
        this.contactName = contactName;
        this.contactTag = contactTag;
        this.contactType = contactType;
        this.contactMobileNo = contactMobileNo;
        this.zftCardInfoList = zftCardInfoList;
        this.alipayLogonId = alipayLogonId;
        this.industryQualificationType = industryQualificationType;
        this.service = service;
        this.signTimeWithIsv = signTimeWithIsv;
        this.bindingAlipayLogonId = bindingAlipayLogonId;
        this.defaultSettleType = defaultSettleType;
        this.fileList = fileList;
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

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalCertNo() {
        return legalCertNo;
    }

    public void setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
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

    public String getContactTag() {
        return contactTag;
    }

    public void setContactTag(String contactTag) {
        this.contactTag = contactTag;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getContactMobileNo() {
        return contactMobileNo;
    }

    public void setContactMobileNo(String contactMobileNo) {
        this.contactMobileNo = contactMobileNo;
    }

    public String getZftCardInfoList() {
        return zftCardInfoList;
    }

    public void setZftCardInfoList(String zftCardInfoList) {
        this.zftCardInfoList = zftCardInfoList;
    }

    public String getAlipayLogonId() {
        return alipayLogonId;
    }

    public void setAlipayLogonId(String alipayLogonId) {
        this.alipayLogonId = alipayLogonId;
    }

    public String getIndustryQualificationType() {
        return industryQualificationType;
    }

    public void setIndustryQualificationType(String industryQualificationType) {
        this.industryQualificationType = industryQualificationType;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getSignTimeWithIsv() {
        return signTimeWithIsv;
    }

    public void setSignTimeWithIsv(String signTimeWithIsv) {
        this.signTimeWithIsv = signTimeWithIsv;
    }

    public String getBindingAlipayLogonId() {
        return bindingAlipayLogonId;
    }

    public void setBindingAlipayLogonId(String bindingAlipayLogonId) {
        this.bindingAlipayLogonId = bindingAlipayLogonId;
    }

    public String getDefaultSettleType() {
        return defaultSettleType;
    }

    public void setDefaultSettleType(String defaultSettleType) {
        this.defaultSettleType = defaultSettleType;
    }

    public String getFileList() {
        return fileList;
    }

    public void setFileList(String fileList) {
        this.fileList = fileList;
    }

}
