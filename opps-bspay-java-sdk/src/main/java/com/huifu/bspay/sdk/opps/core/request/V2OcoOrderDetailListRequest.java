package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 全渠道订单分账接收方查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2OcoOrderDetailListRequest extends BaseRequest {

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

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_OCO_ORDER_DETAIL_LIST;
    }

    public V2OcoOrderDetailListRequest() {
    }

    public V2OcoOrderDetailListRequest(String reqSeqId, String reqDate, String huifuId, String busiSource, String ocoOrderId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.busiSource = busiSource;
        this.ocoOrderId = ocoOrderId;
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

}
