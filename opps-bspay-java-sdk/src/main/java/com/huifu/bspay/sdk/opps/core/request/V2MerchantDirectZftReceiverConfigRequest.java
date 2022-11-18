package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 直付通分账关系绑定解绑
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantDirectZftReceiverConfigRequest extends BaseRequest {

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
     * 汇付ID
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 开发者的应用ID
     */
    @JSONField(name = "app_id")
    private String appId;
    /**
     * 分账开关
     */
    @JSONField(name = "split_flag")
    private String splitFlag;
    /**
     * 分账接收方列表
     */
    @JSONField(name = "zft_split_receiver_list")
    private String zftSplitReceiverList;
    /**
     * 状态
     */
    @JSONField(name = "status")
    private String status;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_DIRECT_ZFT_RECEIVER_CONFIG;
    }

    public V2MerchantDirectZftReceiverConfigRequest() {
    }

    public V2MerchantDirectZftReceiverConfigRequest(String reqSeqId, String reqDate, String huifuId, String appId, String splitFlag, String zftSplitReceiverList, String status) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.appId = appId;
        this.splitFlag = splitFlag;
        this.zftSplitReceiverList = zftSplitReceiverList;
        this.status = status;
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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSplitFlag() {
        return splitFlag;
    }

    public void setSplitFlag(String splitFlag) {
        this.splitFlag = splitFlag;
    }

    public String getZftSplitReceiverList() {
        return zftSplitReceiverList;
    }

    public void setZftSplitReceiverList(String zftSplitReceiverList) {
        this.zftSplitReceiverList = zftSplitReceiverList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
