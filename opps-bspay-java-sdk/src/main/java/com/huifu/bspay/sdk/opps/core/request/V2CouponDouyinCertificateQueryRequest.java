package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 抖音券状态批量查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2CouponDouyinCertificateQueryRequest extends BaseRequest {

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
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 门店绑定流水号
     */
    @JSONField(name = "bind_id")
    private String bindId;
    /**
     * 验券准备接口返回的加密券码encrypted_code和order_id二选一必传，encrypted_code和order_id不能同时传入
     */
    @JSONField(name = "encrypted_code")
    private String encryptedCode;
    /**
     * 订单id验券准备等接口获得，encrypted_code和order_id二选一必传，encrypted_code和order_id不能同时传入
     */
    @JSONField(name = "order_id")
    private String orderId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_COUPON_DOUYIN_CERTIFICATE_QUERY;
    }

    public V2CouponDouyinCertificateQueryRequest() {
    }

    public V2CouponDouyinCertificateQueryRequest(String reqSeqId, String reqDate, String huifuId, String bindId, String encryptedCode, String orderId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.bindId = bindId;
        this.encryptedCode = encryptedCode;
        this.orderId = orderId;
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

    public String getBindId() {
        return bindId;
    }

    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    public String getEncryptedCode() {
        return encryptedCode;
    }

    public void setEncryptedCode(String encryptedCode) {
        this.encryptedCode = encryptedCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

}
