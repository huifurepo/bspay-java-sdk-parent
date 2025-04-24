package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 发票开具
 *
 * @author sdk-generator
 * @Description
 */
public class V2InvoiceOpenRequest extends BaseRequest {

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
     * 汇付商户号huifu_id与ext_mer_id二选一必填，汇付商户号优先；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812123&lt;/font&gt;
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 外部商户号&lt;font color&#x3D;&quot;green&quot;&gt;示例值：&lt;/font&gt;
     */
    @JSONField(name = "ext_mer_id")
    private String extMerId;
    /**
     * 渠道号汇付商户号为空时，必传；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812124&lt;/font&gt;
     */
    @JSONField(name = "channel_id")
    private String channelId;
    /**
     * 发票类型
     */
    @JSONField(name = "ivc_type")
    private String ivcType;
    /**
     * 开票类型
     */
    @JSONField(name = "open_type")
    private String openType;
    /**
     * 购方单位名称
     */
    @JSONField(name = "buyer_name")
    private String buyerName;
    /**
     * 含税合计金额(元)
     */
    @JSONField(name = "order_amt")
    private String orderAmt;
    /**
     * 冲红原因open_type&#x3D;1时必填01：开票有误02：销货退回03：服务终止04：销售转让
     */
    @JSONField(name = "red_apply_reason")
    private String redApplyReason;
    /**
     * 冲红申请来源open_type&#x3D;1时必填01：销方02：购方
     */
    @JSONField(name = "red_apply_source")
    private String redApplySource;
    /**
     * 原发票代码openType&#x3D;1时必填；参见[发票右上角](https://paas.huifu.com/open/doc/api/#/fp/api_fp_yanglitu.md)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：144032209110&lt;/font&gt;
     */
    @JSONField(name = "ori_ivc_code")
    private String oriIvcCode;
    /**
     * 原发票号码openType&#x3D;1时必填；参见[发票右上角](https://paas.huifu.com/open/doc/api/#/fp/api_fp_yanglitu.md)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20685767&lt;/font&gt;
     */
    @JSONField(name = "ori_ivc_number")
    private String oriIvcNumber;
    /**
     * 开票商品信息
     */
    @JSONField(name = "goods_infos")
    private String goodsInfos;
    /**
     * 不动产销售特殊字段specialFlag为05时，必填；jsonArray格式
     */
    @JSONField(name = "estate_sales")
    private String estateSales;
    /**
     * 不动产租赁特殊字段specialFlag为16时，必填；jsonArray格式
     */
    @JSONField(name = "estate_lease")
    private String estateLease;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_INVOICE_OPEN;
    }

    public V2InvoiceOpenRequest() {
    }

    public V2InvoiceOpenRequest(String reqSeqId, String reqDate, String huifuId, String extMerId, String channelId, String ivcType, String openType, String buyerName, String orderAmt, String redApplyReason, String redApplySource, String oriIvcCode, String oriIvcNumber, String goodsInfos, String estateSales, String estateLease) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.extMerId = extMerId;
        this.channelId = channelId;
        this.ivcType = ivcType;
        this.openType = openType;
        this.buyerName = buyerName;
        this.orderAmt = orderAmt;
        this.redApplyReason = redApplyReason;
        this.redApplySource = redApplySource;
        this.oriIvcCode = oriIvcCode;
        this.oriIvcNumber = oriIvcNumber;
        this.goodsInfos = goodsInfos;
        this.estateSales = estateSales;
        this.estateLease = estateLease;
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

    public String getExtMerId() {
        return extMerId;
    }

    public void setExtMerId(String extMerId) {
        this.extMerId = extMerId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getIvcType() {
        return ivcType;
    }

    public void setIvcType(String ivcType) {
        this.ivcType = ivcType;
    }

    public String getOpenType() {
        return openType;
    }

    public void setOpenType(String openType) {
        this.openType = openType;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(String orderAmt) {
        this.orderAmt = orderAmt;
    }

    public String getRedApplyReason() {
        return redApplyReason;
    }

    public void setRedApplyReason(String redApplyReason) {
        this.redApplyReason = redApplyReason;
    }

    public String getRedApplySource() {
        return redApplySource;
    }

    public void setRedApplySource(String redApplySource) {
        this.redApplySource = redApplySource;
    }

    public String getOriIvcCode() {
        return oriIvcCode;
    }

    public void setOriIvcCode(String oriIvcCode) {
        this.oriIvcCode = oriIvcCode;
    }

    public String getOriIvcNumber() {
        return oriIvcNumber;
    }

    public void setOriIvcNumber(String oriIvcNumber) {
        this.oriIvcNumber = oriIvcNumber;
    }

    public String getGoodsInfos() {
        return goodsInfos;
    }

    public void setGoodsInfos(String goodsInfos) {
        this.goodsInfos = goodsInfos;
    }

    public String getEstateSales() {
        return estateSales;
    }

    public void setEstateSales(String estateSales) {
        this.estateSales = estateSales;
    }

    public String getEstateLease() {
        return estateLease;
    }

    public void setEstateLease(String estateLease) {
        this.estateLease = estateLease;
    }

}
