package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 发货信息录入
 *
 * @author sdk-generator
 * @Description
 */
public class V3TradeHostingPaymentShippinginfoUploadRequest extends BaseRequest {

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 订单信息
     */
    @JSONField(name = "order_key")
    private String orderKey;
    /**
     * 物流模式
     */
    @JSONField(name = "logistics_type")
    private String logisticsType;
    /**
     * 发货模式
     */
    @JSONField(name = "delivery_mode")
    private String deliveryMode;
    /**
     * 否已全部发货完成分拆发货模式时必填，用于标识分拆发货模式下是否已全部发货完成，只有全部发货完成的情况下才会向用户推送发货完成通知。&lt;br/&gt;枚举值: true，false&lt;br/&gt;&lt;font color&#x3D;&quot;green&quot;&gt;示例值：true&lt;/font&gt;
     */
    @JSONField(name = "is_all_delivered")
    private String isAllDelivered;
    /**
     * 上传时间
     */
    @JSONField(name = "upload_time")
    private String uploadTime;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V3_TRADE_HOSTING_PAYMENT_SHIPPINGINFO_UPLOAD;
    }

    public V3TradeHostingPaymentShippinginfoUploadRequest() {
    }

    public V3TradeHostingPaymentShippinginfoUploadRequest(String reqDate, String reqSeqId, String huifuId, String orderKey, String logisticsType, String deliveryMode, String isAllDelivered, String uploadTime) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.orderKey = orderKey;
        this.logisticsType = logisticsType;
        this.deliveryMode = deliveryMode;
        this.isAllDelivered = isAllDelivered;
        this.uploadTime = uploadTime;
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

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getOrderKey() {
        return orderKey;
    }

    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
    }

    public String getLogisticsType() {
        return logisticsType;
    }

    public void setLogisticsType(String logisticsType) {
        this.logisticsType = logisticsType;
    }

    public String getDeliveryMode() {
        return deliveryMode;
    }

    public void setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    public String getIsAllDelivered() {
        return isAllDelivered;
    }

    public void setIsAllDelivered(String isAllDelivered) {
        this.isAllDelivered = isAllDelivered;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

}
