package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 抖音卡券撤销
 *
 * @author sdk-generator
 * @Description
 */
public class V2CouponDouyinCancelRequest extends BaseRequest {

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
     * 加密抖音券码
     */
    @JSONField(name = "encrypted_code")
    private String encryptedCode;
    /**
     * 核销标识
     */
    @JSONField(name = "verify_id")
    private String verifyId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_COUPON_DOUYIN_CANCEL;
    }

    public V2CouponDouyinCancelRequest() {
    }

    public V2CouponDouyinCancelRequest(String reqSeqId, String reqDate, String huifuId, String bindId, String encryptedCode, String verifyId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.bindId = bindId;
        this.encryptedCode = encryptedCode;
        this.verifyId = verifyId;
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

    public String getVerifyId() {
        return verifyId;
    }

    public void setVerifyId(String verifyId) {
        this.verifyId = verifyId;
    }

}
