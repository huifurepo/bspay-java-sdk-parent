package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 快捷绑卡申请接口
 *
 * @author sdk-generator
 * @Description
 */
public class V3QuickbuckleApplyRequest extends BaseRequest {

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
     * 商户用户id
     */
    @JSONField(name = "out_cust_id")
    private String outCustId;
    /**
     * 银行卡号
     */
    @JSONField(name = "card_no")
    private String cardNo;
    /**
     * 银行卡开户姓名
     */
    @JSONField(name = "card_name")
    private String cardName;
    /**
     * 银行卡绑定身份证
     */
    @JSONField(name = "cert_no")
    private String certNo;
    /**
     * 个人证件有效期类型
     */
    @JSONField(name = "cert_validity_type")
    private String certValidityType;
    /**
     * 个人证件有效期起始日
     */
    @JSONField(name = "cert_begin_date")
    private String certBeginDate;
    /**
     * 个人证件有效期到期日长期有效不填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：20420905&lt;/font&gt;
     */
    @JSONField(name = "cert_end_date")
    private String certEndDate;
    /**
     * 银行卡绑定手机号
     */
    @JSONField(name = "mobile_no")
    private String mobileNo;
    /**
     * 挂网协议编号授权信息(招行绑卡需要上送)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：34463343&lt;/font&gt;
     */
    @JSONField(name = "protocol_no")
    private String protocolNo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V3_QUICKBUCKLE_APPLY;
    }

    public V3QuickbuckleApplyRequest() {
    }

    public V3QuickbuckleApplyRequest(String reqDate, String reqSeqId, String huifuId, String outCustId, String cardNo, String cardName, String certNo, String certValidityType, String certBeginDate, String certEndDate, String mobileNo, String protocolNo) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.outCustId = outCustId;
        this.cardNo = cardNo;
        this.cardName = cardName;
        this.certNo = certNo;
        this.certValidityType = certValidityType;
        this.certBeginDate = certBeginDate;
        this.certEndDate = certEndDate;
        this.mobileNo = mobileNo;
        this.protocolNo = protocolNo;
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

    public String getOutCustId() {
        return outCustId;
    }

    public void setOutCustId(String outCustId) {
        this.outCustId = outCustId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCertValidityType() {
        return certValidityType;
    }

    public void setCertValidityType(String certValidityType) {
        this.certValidityType = certValidityType;
    }

    public String getCertBeginDate() {
        return certBeginDate;
    }

    public void setCertBeginDate(String certBeginDate) {
        this.certBeginDate = certBeginDate;
    }

    public String getCertEndDate() {
        return certEndDate;
    }

    public void setCertEndDate(String certEndDate) {
        this.certEndDate = certEndDate;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getProtocolNo() {
        return protocolNo;
    }

    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo;
    }

}
