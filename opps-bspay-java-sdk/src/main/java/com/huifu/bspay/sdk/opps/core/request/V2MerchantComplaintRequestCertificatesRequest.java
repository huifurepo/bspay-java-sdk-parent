package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 支付宝申诉请求凭证
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantComplaintRequestCertificatesRequest extends BaseRequest {

    /**
     * 请求汇付流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 请求汇付时间
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 支付宝推送流水号
     */
    @JSONField(name = "risk_biz_id")
    private String riskBizId;
    /**
     * 商户类型
     */
    @JSONField(name = "merchant_type")
    private String merchantType;
    /**
     * 商户经营模式
     */
    @JSONField(name = "operation_type")
    private String operationType;
    /**
     * 收款应用场景
     */
    @JSONField(name = "payment_scene")
    private String paymentScene;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_COMPLAINT_REQUEST_CERTIFICATES;
    }

    public V2MerchantComplaintRequestCertificatesRequest() {
    }

    public V2MerchantComplaintRequestCertificatesRequest(String reqSeqId, String reqDate, String riskBizId, String merchantType, String operationType, String paymentScene) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.riskBizId = riskBizId;
        this.merchantType = merchantType;
        this.operationType = operationType;
        this.paymentScene = paymentScene;
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

    public String getRiskBizId() {
        return riskBizId;
    }

    public void setRiskBizId(String riskBizId) {
        this.riskBizId = riskBizId;
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getPaymentScene() {
        return paymentScene;
    }

    public void setPaymentScene(String paymentScene) {
        this.paymentScene = paymentScene;
    }

}
