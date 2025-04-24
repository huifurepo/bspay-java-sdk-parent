package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 银联统一在线收银台签约接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeOnlinepaymentUnionsignRequest extends BaseRequest {

    /**
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 请求日期
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 支付场景
     */
    @JSONField(name = "pay_scene")
    private String payScene;
    /**
     * 异步通知地址
     */
    @JSONField(name = "notify_url")
    private String notifyUrl;
    /**
     * 设备信息
     */
    @JSONField(name = "terminal_device_data")
    private String terminalDeviceData;
    /**
     * 三方支付数据jsonObject；&lt;br/&gt;
     */
    @JSONField(name = "third_pay_data")
    private String thirdPayData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_ONLINEPAYMENT_UNIONSIGN;
    }

    public V2TradeOnlinepaymentUnionsignRequest() {
    }

    public V2TradeOnlinepaymentUnionsignRequest(String huifuId, String reqDate, String reqSeqId, String payScene, String notifyUrl, String terminalDeviceData, String thirdPayData) {
        this.huifuId = huifuId;
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.payScene = payScene;
        this.notifyUrl = notifyUrl;
        this.terminalDeviceData = terminalDeviceData;
        this.thirdPayData = thirdPayData;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getReqSeqId() {
        return reqSeqId;
    }

    public void setReqSeqId(String reqSeqId) {
        this.reqSeqId = reqSeqId;
    }

    public String getPayScene() {
        return payScene;
    }

    public void setPayScene(String payScene) {
        this.payScene = payScene;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getTerminalDeviceData() {
        return terminalDeviceData;
    }

    public void setTerminalDeviceData(String terminalDeviceData) {
        this.terminalDeviceData = terminalDeviceData;
    }

    public String getThirdPayData() {
        return thirdPayData;
    }

    public void setThirdPayData(String thirdPayData) {
        this.thirdPayData = thirdPayData;
    }

}
