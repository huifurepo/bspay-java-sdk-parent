package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 用户业务入驻修改
 *
 * @author sdk-generator
 * @Description
 */
public class V2UserBusiModifyRequest extends BaseRequest {

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
     * 汇付ID
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 乐接活配置当合作平台为乐接活，必填
     */
    @JSONField(name = "ljh_data")
    private String ljhData;
    /**
     * 签约人信息当电子回单配置开关为开通时必填
     */
    @JSONField(name = "sign_user_info")
    private String signUserInfo;
    /**
     * 汇薪云配置当合作平台为汇薪云时，该参数必填
     */
    @JSONField(name = "hxy_data")
    private String hxyData;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_USER_BUSI_MODIFY;
    }

    public V2UserBusiModifyRequest() {
    }

    public V2UserBusiModifyRequest(String reqSeqId, String reqDate, String upperHuifuId, String huifuId, String ljhData, String signUserInfo, String hxyData) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.upperHuifuId = upperHuifuId;
        this.huifuId = huifuId;
        this.ljhData = ljhData;
        this.signUserInfo = signUserInfo;
        this.hxyData = hxyData;
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

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getLjhData() {
        return ljhData;
    }

    public void setLjhData(String ljhData) {
        this.ljhData = ljhData;
    }

    public String getSignUserInfo() {
        return signUserInfo;
    }

    public void setSignUserInfo(String signUserInfo) {
        this.signUserInfo = signUserInfo;
    }

    public String getHxyData() {
        return hxyData;
    }

    public void setHxyData(String hxyData) {
        this.hxyData = hxyData;
    }

}
