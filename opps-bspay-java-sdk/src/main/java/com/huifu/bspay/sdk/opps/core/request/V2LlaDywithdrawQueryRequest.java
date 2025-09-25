package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 提现记录查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2LlaDywithdrawQueryRequest extends BaseRequest {

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
     * 代运营汇付id
     */
    @JSONField(name = "agency_huifu_id")
    private String agencyHuifuId;
    /**
     * 商家汇付id
     */
    @JSONField(name = "merchant_huifu_id")
    private String merchantHuifuId;
    /**
     * 平台
     */
    @JSONField(name = "platform_type")
    private String platformType;
    /**
     * 提现发起开始日期
     */
    @JSONField(name = "start_date")
    private String startDate;
    /**
     * 查询游标
     */
    @JSONField(name = "cursor")
    private String cursor;
    /**
     * 页大小
     */
    @JSONField(name = "size")
    private String size;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_LLA_DYWITHDRAW_QUERY;
    }

    public V2LlaDywithdrawQueryRequest() {
    }

    public V2LlaDywithdrawQueryRequest(String reqSeqId, String reqDate, String agencyHuifuId, String merchantHuifuId, String platformType, String startDate, String cursor, String size) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.agencyHuifuId = agencyHuifuId;
        this.merchantHuifuId = merchantHuifuId;
        this.platformType = platformType;
        this.startDate = startDate;
        this.cursor = cursor;
        this.size = size;
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

    public String getAgencyHuifuId() {
        return agencyHuifuId;
    }

    public void setAgencyHuifuId(String agencyHuifuId) {
        this.agencyHuifuId = agencyHuifuId;
    }

    public String getMerchantHuifuId() {
        return merchantHuifuId;
    }

    public void setMerchantHuifuId(String merchantHuifuId) {
        this.merchantHuifuId = merchantHuifuId;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
