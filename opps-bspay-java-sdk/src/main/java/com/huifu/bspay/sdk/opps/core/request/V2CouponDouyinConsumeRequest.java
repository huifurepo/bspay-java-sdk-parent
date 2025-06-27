package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 抖音卡券核销
 *
 * @author sdk-generator
 * @Description
 */
public class V2CouponDouyinConsumeRequest extends BaseRequest {

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
     * 加密抖音券码列表
     */
    @JSONField(name = "encrypted_codes")
    private String encryptedCodes;
    /**
     * 校验标识
     */
    @JSONField(name = "verify_token")
    private String verifyToken;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_COUPON_DOUYIN_CONSUME;
    }

    public V2CouponDouyinConsumeRequest() {
    }

    public V2CouponDouyinConsumeRequest(String reqSeqId, String reqDate, String huifuId, String bindId, String encryptedCodes, String verifyToken) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.bindId = bindId;
        this.encryptedCodes = encryptedCodes;
        this.verifyToken = verifyToken;
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

    public String getEncryptedCodes() {
        return encryptedCodes;
    }

    public void setEncryptedCodes(String encryptedCodes) {
        this.encryptedCodes = encryptedCodes;
    }

    public String getVerifyToken() {
        return verifyToken;
    }

    public void setVerifyToken(String verifyToken) {
        this.verifyToken = verifyToken;
    }

}
