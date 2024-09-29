package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 资金归集明细查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeSettleCollectionDetailQueryRequest extends BaseRequest {

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
     * 开始日期
     */
    @JSONField(name = "begin_date")
    private String beginDate;
    /**
     * 结束日期
     */
    @JSONField(name = "end_date")
    private String endDate;
    /**
     * 转出方商户号转出方商户号和转入方商户号必填一个；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123124&lt;/font&gt;
     */
    @JSONField(name = "out_huifu_id")
    private String outHuifuId;
    /**
     * 转入方商户号转出方商户号和转入方商户号必填一个；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000123123124&lt;/font&gt;
     */
    @JSONField(name = "in_huifu_id")
    private String inHuifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_SETTLE_COLLECTION_DETAIL_QUERY;
    }

    public V2TradeSettleCollectionDetailQueryRequest() {
    }

    public V2TradeSettleCollectionDetailQueryRequest(String reqDate, String reqSeqId, String beginDate, String endDate, String outHuifuId, String inHuifuId) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.outHuifuId = outHuifuId;
        this.inHuifuId = inHuifuId;
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

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getOutHuifuId() {
        return outHuifuId;
    }

    public void setOutHuifuId(String outHuifuId) {
        this.outHuifuId = outHuifuId;
    }

    public String getInHuifuId() {
        return inHuifuId;
    }

    public void setInHuifuId(String inHuifuId) {
        this.inHuifuId = inHuifuId;
    }

}
