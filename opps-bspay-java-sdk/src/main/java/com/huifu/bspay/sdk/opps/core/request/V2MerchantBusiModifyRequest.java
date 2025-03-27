package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 商户业务开通修改
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBusiModifyRequest extends BaseRequest {

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
     * 汇付客户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 是否交易手续费外扣
     */
    @JSONField(name = "out_fee_flag")
    private String outFeeFlag;
    /**
     * 交易手续费外扣汇付ID
     */
    @JSONField(name = "out_fee_huifuid")
    private String outFeeHuifuid;
    /**
     * *线上业务类型编码*开通快捷、网银、余额支付、分账必填；参见[线上业务类型编码及补充材料说明](https://cloudpnrcdn.oss-cn-shanghai.aliyuncs.com/opps/api/prod/download_file/kyc/KYC-%E7%BA%BF%E4%B8%8A%E4%B8%9A%E5%8A%A1%E7%B1%BB%E5%9E%8B%E7%BC%96%E7%A0%81%E5%8F%8A%E8%A1%A5%E5%85%85%E6%9D%90%E6%96%99%E8%AF%B4%E6%98%8E.xlsx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：H7999AL&lt;/font&gt;
     */
    @JSONField(name = "online_busi_type")
    private String onlineBusiType;
    /**
     * 签约人jsonObject格式；agreement_info中选择电子签约时必填；个人商户填本人信息。
     */
    @JSONField(name = "sign_user_info")
    private String signUserInfo;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BUSI_MODIFY;
    }

    public V2MerchantBusiModifyRequest() {
    }

    public V2MerchantBusiModifyRequest(String reqSeqId, String reqDate, String huifuId, String outFeeFlag, String outFeeHuifuid, String onlineBusiType, String signUserInfo) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.outFeeFlag = outFeeFlag;
        this.outFeeHuifuid = outFeeHuifuid;
        this.onlineBusiType = onlineBusiType;
        this.signUserInfo = signUserInfo;
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

    public String getOutFeeFlag() {
        return outFeeFlag;
    }

    public void setOutFeeFlag(String outFeeFlag) {
        this.outFeeFlag = outFeeFlag;
    }

    public String getOutFeeHuifuid() {
        return outFeeHuifuid;
    }

    public void setOutFeeHuifuid(String outFeeHuifuid) {
        this.outFeeHuifuid = outFeeHuifuid;
    }

    public String getOnlineBusiType() {
        return onlineBusiType;
    }

    public void setOnlineBusiType(String onlineBusiType) {
        this.onlineBusiType = onlineBusiType;
    }

    public String getSignUserInfo() {
        return signUserInfo;
    }

    public void setSignUserInfo(String signUserInfo) {
        this.signUserInfo = signUserInfo;
    }

}
