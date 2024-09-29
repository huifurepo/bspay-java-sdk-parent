package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 银行大额支付绑卡查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2LargeamtBindcardQueryRequest extends BaseRequest {

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
     * 银行卡号密文
     */
    @JSONField(name = "card_no")
    private String cardNo;
    /**
     * 每页条数
     */
    @JSONField(name = "page_size")
    private String pageSize;
    /**
     * 分页页码
     */
    @JSONField(name = "page_num")
    private String pageNum;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_LARGEAMT_BINDCARD_QUERY;
    }

    public V2LargeamtBindcardQueryRequest() {
    }

    public V2LargeamtBindcardQueryRequest(String reqSeqId, String reqDate, String huifuId, String cardNo, String pageSize, String pageNum) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.cardNo = cardNo;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

}
