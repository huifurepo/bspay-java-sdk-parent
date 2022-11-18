package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 支付宝直连-申请当面付代签约
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantDirectAlipayFacetofacesignApplyRequest extends BaseRequest {

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
     * 汇付客户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 上级主体ID
     */
    @JSONField(name = "upper_huifu_id")
    private String upperHuifuId;
    /**
     * 支付宝经营类目
     */
    @JSONField(name = "direct_category")
    private String directCategory;
    /**
     * 开发者的应用ID
     */
    @JSONField(name = "app_id")
    private String appId;
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
     * 商户账号
     */
    @JSONField(name = "account")
    private String account;
    /**
     * 服务费率（%）0.38~3之间，精确到0.01。当签约且授权sign_and_auth&#x3D;Y时，必填。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：0.38&lt;/font&gt;
     */
    @JSONField(name = "rate")
    private String rate;
    /**
     * 文件列表
     */
    @JSONField(name = "file_list")
    private String fileList;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_DIRECT_ALIPAY_FACETOFACESIGN_APPLY;
    }

    public V2MerchantDirectAlipayFacetofacesignApplyRequest() {
    }

    public V2MerchantDirectAlipayFacetofacesignApplyRequest(String reqSeqId, String reqDate, String huifuId, String upperHuifuId, String directCategory, String appId, String contactName, String contactMobileNo, String contactEmail, String account, String rate, String fileList) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.upperHuifuId = upperHuifuId;
        this.directCategory = directCategory;
        this.appId = appId;
        this.contactName = contactName;
        this.contactMobileNo = contactMobileNo;
        this.contactEmail = contactEmail;
        this.account = account;
        this.rate = rate;
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

    public String getUpperHuifuId() {
        return upperHuifuId;
    }

    public void setUpperHuifuId(String upperHuifuId) {
        this.upperHuifuId = upperHuifuId;
    }

    public String getDirectCategory() {
        return directCategory;
    }

    public void setDirectCategory(String directCategory) {
        this.directCategory = directCategory;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getFileList() {
        return fileList;
    }

    public void setFileList(String fileList) {
        this.fileList = fileList;
    }

}
