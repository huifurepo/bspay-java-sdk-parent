package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 灵工个人用户进件
 *
 * @author sdk-generator
 * @Description
 */
public class V2FlexibleIndvRequest extends BaseRequest {

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
     * 渠道商/商户汇付Id
     */
    @JSONField(name = "upper_huifu_id")
    private String upperHuifuId;
    /**
     * 基本信息
     */
    @JSONField(name = "basic_info")
    private String basicInfo;
    /**
     * 卡信息
     */
    @JSONField(name = "card_info")
    private String cardInfo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_FLEXIBLE_INDV;
    }

    public V2FlexibleIndvRequest() {
    }

    public V2FlexibleIndvRequest(String reqSeqId, String reqDate, String upperHuifuId, String basicInfo, String cardInfo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.upperHuifuId = upperHuifuId;
        this.basicInfo = basicInfo;
        this.cardInfo = cardInfo;
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

    public String getUpperHuifuId() {
        return upperHuifuId;
    }

    public void setUpperHuifuId(String upperHuifuId) {
        this.upperHuifuId = upperHuifuId;
    }

    public String getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(String basicInfo) {
        this.basicInfo = basicInfo;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }

}
