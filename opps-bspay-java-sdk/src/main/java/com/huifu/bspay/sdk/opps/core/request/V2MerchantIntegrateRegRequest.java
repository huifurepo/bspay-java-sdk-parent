package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 商户统一进件接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantIntegrateRegRequest extends BaseRequest {

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
     * 渠道商汇付id
     */
    @JSONField(name = "upper_huifu_id")
    private String upperHuifuId;
    /**
     * 公司类型
     */
    @JSONField(name = "ent_type")
    private String entType;
    /**
     * 商户名称
     */
    @JSONField(name = "reg_name")
    private String regName;
    /**
     * 经营类型
     */
    @JSONField(name = "busi_type")
    private String busiType;
    /**
     * 经营详细地址
     */
    @JSONField(name = "detail_addr")
    private String detailAddr;
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
     * 联系人信息
     */
    @JSONField(name = "contact_info")
    private String contactInfo;
    /**
     * 卡信息配置实体
     */
    @JSONField(name = "card_info")
    private String cardInfo;
    /**
     * 取现配置列表jsonArray格式 ；
     */
    @JSONField(name = "cash_config")
    private String cashConfig;
    /**
     * 结算配置jsonObject格式；
     */
    @JSONField(name = "settle_config")
    private String settleConfig;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_INTEGRATE_REG;
    }

    public V2MerchantIntegrateRegRequest() {
    }

    public V2MerchantIntegrateRegRequest(String reqSeqId, String reqDate, String upperHuifuId, String entType, String regName, String busiType, String detailAddr, String provId, String areaId, String districtId, String contactInfo, String cardInfo, String cashConfig, String settleConfig) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.upperHuifuId = upperHuifuId;
        this.entType = entType;
        this.regName = regName;
        this.busiType = busiType;
        this.detailAddr = detailAddr;
        this.provId = provId;
        this.areaId = areaId;
        this.districtId = districtId;
        this.contactInfo = contactInfo;
        this.cardInfo = cardInfo;
        this.cashConfig = cashConfig;
        this.settleConfig = settleConfig;
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

    public String getEntType() {
        return entType;
    }

    public void setEntType(String entType) {
        this.entType = entType;
    }

    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getDetailAddr() {
        return detailAddr;
    }

    public void setDetailAddr(String detailAddr) {
        this.detailAddr = detailAddr;
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

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }

    public String getCashConfig() {
        return cashConfig;
    }

    public void setCashConfig(String cashConfig) {
        this.cashConfig = cashConfig;
    }

    public String getSettleConfig() {
        return settleConfig;
    }

    public void setSettleConfig(String settleConfig) {
        this.settleConfig = settleConfig;
    }

}
