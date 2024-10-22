package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 服务单创建
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePayafteruseCreditbizorderCreateRequest extends BaseRequest {

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
     * 订单总金额
     */
    @JSONField(name = "trans_amt")
    private String transAmt;
    /**
     * 追踪ID
     */
    @JSONField(name = "source_id")
    private String sourceId;
    /**
     * 支付宝用户ID
     */
    @JSONField(name = "buyer_id")
    private String buyerId;
    /**
     * 订单标题
     */
    @JSONField(name = "title")
    private String title;
    /**
     * 订单类型
     */
    @JSONField(name = "merchant_biz_type")
    private String merchantBizType;
    /**
     * 订单详情地址
     */
    @JSONField(name = "path")
    private String path;
    /**
     * 芝麻信用服务ID
     */
    @JSONField(name = "zm_service_id")
    private String zmServiceId;
    /**
     * 商品详细信息
     */
    @JSONField(name = "item_infos")
    private String itemInfos;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYAFTERUSE_CREDITBIZORDER_CREATE;
    }

    public V2TradePayafteruseCreditbizorderCreateRequest() {
    }

    public V2TradePayafteruseCreditbizorderCreateRequest(String reqSeqId, String reqDate, String huifuId, String transAmt, String sourceId, String buyerId, String title, String merchantBizType, String path, String zmServiceId, String itemInfos) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.transAmt = transAmt;
        this.sourceId = sourceId;
        this.buyerId = buyerId;
        this.title = title;
        this.merchantBizType = merchantBizType;
        this.path = path;
        this.zmServiceId = zmServiceId;
        this.itemInfos = itemInfos;
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

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMerchantBizType() {
        return merchantBizType;
    }

    public void setMerchantBizType(String merchantBizType) {
        this.merchantBizType = merchantBizType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getZmServiceId() {
        return zmServiceId;
    }

    public void setZmServiceId(String zmServiceId) {
        this.zmServiceId = zmServiceId;
    }

    public String getItemInfos() {
        return itemInfos;
    }

    public void setItemInfos(String itemInfos) {
        this.itemInfos = itemInfos;
    }

}
