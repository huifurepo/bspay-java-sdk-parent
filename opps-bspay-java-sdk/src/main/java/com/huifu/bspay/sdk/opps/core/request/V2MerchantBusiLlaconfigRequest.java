package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 代运营代扣业务配置
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBusiLlaconfigRequest extends BaseRequest {

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
     * 商户汇付id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 所属渠道商
     */
    @JSONField(name = "upper_huifu_id")
    private String upperHuifuId;
    /**
     * 代运营配置json字符串，业务角色为AGENCY:代运营时必填
     */
    @JSONField(name = "lla_agency_config")
    private String llaAgencyConfig;
    /**
     * 商家配置json字符串，业务角色为MERCHANT:商家时必填
     */
    @JSONField(name = "lla_merchant_config")
    private String llaMerchantConfig;
    /**
     * 纸质协议文件协议类型为纸质且业务角色不为空时必填，文件类型F633；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "paper_agreement_file")
    private String paperAgreementFile;
    /**
     * 签约人信息json字符串，协议类型为电子时必填
     */
    @JSONField(name = "sign_user_info")
    private String signUserInfo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BUSI_LLACONFIG;
    }

    public V2MerchantBusiLlaconfigRequest() {
    }

    public V2MerchantBusiLlaconfigRequest(String reqSeqId, String reqDate, String huifuId, String upperHuifuId, String llaAgencyConfig, String llaMerchantConfig, String paperAgreementFile, String signUserInfo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.upperHuifuId = upperHuifuId;
        this.llaAgencyConfig = llaAgencyConfig;
        this.llaMerchantConfig = llaMerchantConfig;
        this.paperAgreementFile = paperAgreementFile;
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

    public String getLlaAgencyConfig() {
        return llaAgencyConfig;
    }

    public void setLlaAgencyConfig(String llaAgencyConfig) {
        this.llaAgencyConfig = llaAgencyConfig;
    }

    public String getLlaMerchantConfig() {
        return llaMerchantConfig;
    }

    public void setLlaMerchantConfig(String llaMerchantConfig) {
        this.llaMerchantConfig = llaMerchantConfig;
    }

    public String getPaperAgreementFile() {
        return paperAgreementFile;
    }

    public void setPaperAgreementFile(String paperAgreementFile) {
        this.paperAgreementFile = paperAgreementFile;
    }

    public String getSignUserInfo() {
        return signUserInfo;
    }

    public void setSignUserInfo(String signUserInfo) {
        this.signUserInfo = signUserInfo;
    }

}
