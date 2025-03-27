package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 新增绑定卡
 *
 * @author sdk-generator
 * @Description
 */
public class V2WalletCardAddRequest extends BaseRequest {

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 钱包用户ID
     */
    @JSONField(name = "user_huifu_id")
    private String userHuifuId;
    /**
     * 跳转地址
     */
    @JSONField(name = "front_url")
    private String frontUrl;
    /**
     * 设备信息域
     */
    @JSONField(name = "trx_device_info ")
    private String trxDeviceInfo ;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_WALLET_CARD_ADD;
    }

    public V2WalletCardAddRequest() {
    }

    public V2WalletCardAddRequest(String reqSeqId, String reqDate, String huifuId, String userHuifuId, String frontUrl, String trxDeviceInfo ) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.userHuifuId = userHuifuId;
        this.frontUrl = frontUrl;
        this.trxDeviceInfo  = trxDeviceInfo ;
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

    public String getUserHuifuId() {
        return userHuifuId;
    }

    public void setUserHuifuId(String userHuifuId) {
        this.userHuifuId = userHuifuId;
    }

    public String getFrontUrl() {
        return frontUrl;
    }

    public void setFrontUrl(String frontUrl) {
        this.frontUrl = frontUrl;
    }

    public String getTrxDeviceInfo () {
        return trxDeviceInfo ;
    }

    public void setTrxDeviceInfo (String trxDeviceInfo ) {
        this.trxDeviceInfo  = trxDeviceInfo ;
    }

}
