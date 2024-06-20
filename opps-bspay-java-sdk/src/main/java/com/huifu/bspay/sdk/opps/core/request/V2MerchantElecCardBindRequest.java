package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 电子账户绑卡
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantElecCardBindRequest extends BaseRequest {

    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 请求时间
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 汇付Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 电子卡信息
     */
    @JSONField(name = "elec_card_info")
    private String elecCardInfo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_ELEC_CARD_BIND;
    }

    public V2MerchantElecCardBindRequest() {
    }

    public V2MerchantElecCardBindRequest(String reqSeqId, String reqDate, String huifuId, String elecCardInfo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.elecCardInfo = elecCardInfo;
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

    public String getElecCardInfo() {
        return elecCardInfo;
    }

    public void setElecCardInfo(String elecCardInfo) {
        this.elecCardInfo = elecCardInfo;
    }

}
