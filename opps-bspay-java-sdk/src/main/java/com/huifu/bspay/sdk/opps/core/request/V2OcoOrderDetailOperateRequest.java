package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 全渠道订单分账明细操作
 *
 * @author sdk-generator
 * @Description
 */
public class V2OcoOrderDetailOperateRequest extends BaseRequest {

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 分账数据源
     */
    @JSONField(name = "busi_source")
    private String busiSource;
    /**
     * 业务订单号
     */
    @JSONField(name = "oco_order_id")
    private String ocoOrderId;
    /**
     * 操作类型
     */
    @JSONField(name = "operate_type")
    private String operateType;
    /**
     * 支付方式枚举：BALANCE-余额支付 EFP-全域资金付款；备注：当operate_type&#x3D;SPLIT 立即分账时，pay_type必填，且若为退款，按原交易类型原路返回；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：BALANCE&lt;/font&gt;
     */
    @JSONField(name = "pay_type")
    private String payType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_OCO_ORDER_DETAIL_OPERATE;
    }

    public V2OcoOrderDetailOperateRequest() {
    }

    public V2OcoOrderDetailOperateRequest(String reqSeqId, String reqDate, String huifuId, String busiSource, String ocoOrderId, String operateType, String payType) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.busiSource = busiSource;
        this.ocoOrderId = ocoOrderId;
        this.operateType = operateType;
        this.payType = payType;
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

    public String getBusiSource() {
        return busiSource;
    }

    public void setBusiSource(String busiSource) {
        this.busiSource = busiSource;
    }

    public String getOcoOrderId() {
        return ocoOrderId;
    }

    public void setOcoOrderId(String ocoOrderId) {
        this.ocoOrderId = ocoOrderId;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

}
