package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 商户基本信息修改
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBasicdataModifyRequest extends BaseRequest {

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
     * 汇付客户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 签约人jsonObject格式；agreement_info中选择电子签约时必填；个人商户填本人信息。
     */
    @JSONField(name = "sign_user_info")
    private String signUserInfo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BASICDATA_MODIFY;
    }

    public V2MerchantBasicdataModifyRequest() {
    }

    public V2MerchantBasicdataModifyRequest(String reqSeqId, String reqDate, String upperHuifuId, String huifuId, String signUserInfo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.upperHuifuId = upperHuifuId;
        this.huifuId = huifuId;
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

    public String getUpperHuifuId() {
        return upperHuifuId;
    }

    public void setUpperHuifuId(String upperHuifuId) {
        this.upperHuifuId = upperHuifuId;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getSignUserInfo() {
        return signUserInfo;
    }

    public void setSignUserInfo(String signUserInfo) {
        this.signUserInfo = signUserInfo;
    }

}
