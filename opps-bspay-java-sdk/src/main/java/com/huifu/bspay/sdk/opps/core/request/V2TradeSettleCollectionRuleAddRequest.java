package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 新增归集配置
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeSettleCollectionRuleAddRequest extends BaseRequest {

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
     * 转入方商户号
     */
    @JSONField(name = "in_huifu_id")
    private String inHuifuId;
    /**
     * 转出方商户号
     */
    @JSONField(name = "out_huifu_id")
    private String outHuifuId;
    /**
     * 签约人手机号协议类型为电子协议时必填，必须为法人手机号。&lt;font color&#x3D;&quot;green&quot;&gt;示例值：13911111111&lt;/font&gt;
     */
    @JSONField(name = "sign_user_mobile_no")
    private String signUserMobileNo;
    /**
     * 协议文件Id协议类型为纸质协议时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e529&lt;/font&gt;
     */
    @JSONField(name = "file_id")
    private String fileId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_SETTLE_COLLECTION_RULE_ADD;
    }

    public V2TradeSettleCollectionRuleAddRequest() {
    }

    public V2TradeSettleCollectionRuleAddRequest(String reqDate, String reqSeqId, String inHuifuId, String outHuifuId, String signUserMobileNo, String fileId) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.inHuifuId = inHuifuId;
        this.outHuifuId = outHuifuId;
        this.signUserMobileNo = signUserMobileNo;
        this.fileId = fileId;
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

    public String getInHuifuId() {
        return inHuifuId;
    }

    public void setInHuifuId(String inHuifuId) {
        this.inHuifuId = inHuifuId;
    }

    public String getOutHuifuId() {
        return outHuifuId;
    }

    public void setOutHuifuId(String outHuifuId) {
        this.outHuifuId = outHuifuId;
    }

    public String getSignUserMobileNo() {
        return signUserMobileNo;
    }

    public void setSignUserMobileNo(String signUserMobileNo) {
        this.signUserMobileNo = signUserMobileNo;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

}
