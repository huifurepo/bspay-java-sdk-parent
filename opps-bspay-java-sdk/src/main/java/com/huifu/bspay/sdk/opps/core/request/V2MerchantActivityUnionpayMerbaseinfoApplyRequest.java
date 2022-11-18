package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 银联活动商户入驻
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantActivityUnionpayMerbaseinfoApplyRequest extends BaseRequest {

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
     * 商户类型
     */
    @JSONField(name = "mer_type")
    private String merType;
    /**
     * 经营类型
     */
    @JSONField(name = "deal_type")
    private String dealType;
    /**
     * 所属行业（MCC）MERCHANT_01-自然人 需要传入，参考[银联MCC编码](https://paas.huifu.com/partners/api/#/csfl/api_csfl_ylmccbm) ；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：5311&lt;/font&gt;
     */
    @JSONField(name = "mcc")
    private String mcc;
    /**
     * 负责人手机号
     */
    @JSONField(name = "legal_mobile")
    private String legalMobile;
    /**
     * 联系人身份证号
     */
    @JSONField(name = "contract_id_no")
    private String contractIdNo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_ACTIVITY_UNIONPAY_MERBASEINFO_APPLY;
    }

    public V2MerchantActivityUnionpayMerbaseinfoApplyRequest() {
    }

    public V2MerchantActivityUnionpayMerbaseinfoApplyRequest(String reqSeqId, String reqDate, String huifuId, String merType, String dealType, String mcc, String legalMobile, String contractIdNo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.merType = merType;
        this.dealType = dealType;
        this.mcc = mcc;
        this.legalMobile = legalMobile;
        this.contractIdNo = contractIdNo;
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

    public String getMerType() {
        return merType;
    }

    public void setMerType(String merType) {
        this.merType = merType;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getLegalMobile() {
        return legalMobile;
    }

    public void setLegalMobile(String legalMobile) {
        this.legalMobile = legalMobile;
    }

    public String getContractIdNo() {
        return contractIdNo;
    }

    public void setContractIdNo(String contractIdNo) {
        this.contractIdNo = contractIdNo;
    }

}
