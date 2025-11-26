package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 个人商户进件
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
     * 直属渠道号
     */
    @JSONField(name = "upper_huifu_id")
    private String upperHuifuId;
    /**
     * 商户名
     */
    @JSONField(name = "reg_name")
    private String regName;
    /**
     * 所属行业
     */
    @JSONField(name = "mcc")
    private String mcc;
    /**
     * 场景类型
     */
    @JSONField(name = "scene_type")
    private String sceneType;
    /**
     * 经营区
     */
    @JSONField(name = "district_id")
    private String districtId;
    /**
     * 经营详细地址scene_type字段含有线下场景时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：上海市徐汇区XX路XX号&lt;/font&gt;
     */
    @JSONField(name = "detail_addr")
    private String detailAddr;
    /**
     * 负责人证件号码
     */
    @JSONField(name = "legal_cert_no")
    private String legalCertNo;
    /**
     * 负责人证件有效期开始日期
     */
    @JSONField(name = "legal_cert_begin_date")
    private String legalCertBeginDate;
    /**
     * 负责人证件有效期截止日期
     */
    @JSONField(name = "legal_cert_end_date")
    private String legalCertEndDate;
    /**
     * 负责人身份证地址
     */
    @JSONField(name = "legal_addr")
    private String legalAddr;
    /**
     * 负责人身份证国徽面
     */
    @JSONField(name = "legal_cert_back_pic")
    private String legalCertBackPic;
    /**
     * 负责人身份证人像面
     */
    @JSONField(name = "legal_cert_front_pic")
    private String legalCertFrontPic;
    /**
     * 负责人手机号
     */
    @JSONField(name = "contact_mobile_no")
    private String contactMobileNo;
    /**
     * 负责人电子邮箱
     */
    @JSONField(name = "contact_email")
    private String contactEmail;
    /**
     * 结算卡信息配置
     */
    @JSONField(name = "card_info")
    private String cardInfo;
    /**
     * 银行卡卡号面
     */
    @JSONField(name = "settle_card_front_pic")
    private String settleCardFrontPic;
    /**
     * 商户ICP备案编号商户ICP备案编号或网站许可证号；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：沪ICP备06046402号-28 &lt;/font&gt;&lt;br/&gt;类型为PC网站时，且为企业商户，且开通快捷或网银，或大额转账，或余额支付或分账业务（20%（不含）-100%），或为个人商户开通分账业务（10%（不含）-100%），必填
     */
    @JSONField(name = "mer_icp")
    private String merIcp;
    /**
     * 店铺门头照文件类型：F22；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;&lt;br/&gt;微信/支付宝实名认证个人商户，门头照也使用此字段； &lt;br/&gt;门店场所：提交门店门口照片，要求招牌清晰可见; &lt;br/&gt;小微商户流动经营/便民服务：提交经营/服务现场照片
     */
    @JSONField(name = "store_header_pic")
    private String storeHeaderPic;
    /**
     * 店铺内景/工作区域照文件类型：F24；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;&lt;br/&gt;微信/支付宝实名认证个人商户，内景照也使用此字段； &lt;br/&gt;门店场所：提交店内环境照片 &lt;br/&gt;小微商户流动经营/便民服务：可提交另一张经营/服务现场照片
     */
    @JSONField(name = "store_indoor_pic")
    private String storeIndoorPic;
    /**
     * 店铺收银台/公司前台照商户线下场景需要提供；文件类型：F105；&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "store_cashier_desk_pic")
    private String storeCashierDeskPic;
    /**
     * 上级商户汇付ID如果head_office_flag&#x3D;0，则字段必填&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123123&lt;/font&gt;
     */
    @JSONField(name = "head_huifu_id")
    private String headHuifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BASICDATA_INDV;
    }

    public V2MerchantBasicdataIndvRequest() {
    }

    public V2MerchantBasicdataIndvRequest(String reqSeqId, String reqDate, String upperHuifuId, String regName, String mcc, String sceneType, String districtId, String detailAddr, String legalCertNo, String legalCertBeginDate, String legalCertEndDate, String legalAddr, String legalCertBackPic, String legalCertFrontPic, String contactMobileNo, String contactEmail, String cardInfo, String settleCardFrontPic, String merIcp, String storeHeaderPic, String storeIndoorPic, String storeCashierDeskPic, String headHuifuId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.upperHuifuId = upperHuifuId;
        this.regName = regName;
        this.mcc = mcc;
        this.sceneType = sceneType;
        this.districtId = districtId;
        this.detailAddr = detailAddr;
        this.legalCertNo = legalCertNo;
        this.legalCertBeginDate = legalCertBeginDate;
        this.legalCertEndDate = legalCertEndDate;
        this.legalAddr = legalAddr;
        this.legalCertBackPic = legalCertBackPic;
        this.legalCertFrontPic = legalCertFrontPic;
        this.contactMobileNo = contactMobileNo;
        this.contactEmail = contactEmail;
        this.cardInfo = cardInfo;
        this.settleCardFrontPic = settleCardFrontPic;
        this.merIcp = merIcp;
        this.storeHeaderPic = storeHeaderPic;
        this.storeIndoorPic = storeIndoorPic;
        this.storeCashierDeskPic = storeCashierDeskPic;
        this.headHuifuId = headHuifuId;
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

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getSceneType() {
        return sceneType;
    }

    public void setSceneType(String sceneType) {
        this.sceneType = sceneType;
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

    public String getLegalCertNo() {
        return legalCertNo;
    }

    public void setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo;
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

    public String getHeadHuifuId() {
        return headHuifuId;
    }

    public void setHeadHuifuId(String headHuifuId) {
        this.headHuifuId = headHuifuId;
    }

}
