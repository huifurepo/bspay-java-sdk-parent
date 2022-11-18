package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 银联活动报名进度查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantActivityUnionpaySignStatusRequest extends BaseRequest {

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
     * 报名编号与serialNumber二选一；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：521724026796785664&lt;/font&gt;
     */
    @JSONField(name = "enlist_id")
    private String enlistId;
    /**
     * 报名请求流水号报名时传递的reqSysId；与enlistId二选一；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：ZDTESTrQ202011054108473959671&lt;/font&gt;
     */
    @JSONField(name = "serial_number")
    private String serialNumber;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_ACTIVITY_UNIONPAY_SIGN_STATUS;
    }

    public V2MerchantActivityUnionpaySignStatusRequest() {
    }

    public V2MerchantActivityUnionpaySignStatusRequest(String reqSeqId, String reqDate, String huifuId, String enlistId, String serialNumber) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.enlistId = enlistId;
        this.serialNumber = serialNumber;
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

    public String getEnlistId() {
        return enlistId;
    }

    public void setEnlistId(String enlistId) {
        this.enlistId = enlistId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

}
