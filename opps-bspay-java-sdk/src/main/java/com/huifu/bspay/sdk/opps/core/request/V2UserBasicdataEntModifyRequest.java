package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 企业用户基本信息修改
 *
 * @author sdk-generator
 * @Description
 */
public class V2UserBasicdataEntModifyRequest extends BaseRequest {

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
     * 汇付客户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 法人国籍法人的证件类型为外国人居留证时，必填，参见《[国籍编码](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/area/%E5%9B%BD%E7%B1%8D.xlsx)》&lt;font color&#x3D;&quot;green&quot;&gt;示例值：CHN&lt;/font&gt;
     */
    @JSONField(name = "legal_cert_nationality")
    private String legalCertNationality;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_USER_BASICDATA_ENT_MODIFY;
    }

    public V2UserBasicdataEntModifyRequest() {
    }

    public V2UserBasicdataEntModifyRequest(String reqDate, String reqSeqId, String huifuId, String legalCertNationality) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.legalCertNationality = legalCertNationality;
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

    public String getLegalCertNationality() {
        return legalCertNationality;
    }

    public void setLegalCertNationality(String legalCertNationality) {
        this.legalCertNationality = legalCertNationality;
    }

}
