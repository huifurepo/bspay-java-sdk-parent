package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 微信商户配置
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBusiConfigRequest extends BaseRequest {

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
     * 业务开通类型
     */
    @JSONField(name = "fee_type")
    private String feeType;
    /**
     * 公众号支付Appid条件必填，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx3767c5bd01df5061&lt;/font&gt; ；wx_woa_app_id 、wx_woa_path和 wx_applet_app_id三者不能同时为空
     */
    @JSONField(name = "wx_woa_app_id")
    private String wxWoaAppId;
    /**
     * 微信公众号授权目录条件必填，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：https://paas.huifu.com/shouyintai/demo/h5/&lt;/font&gt;；wx_woa_app_id 、wx_woa_path和 wx_applet_app_id三者不能同时为空
     */
    @JSONField(name = "wx_woa_path")
    private String wxWoaPath;
    /**
     * 微信小程序APPID条件必填，&lt;font color&#x3D;&quot;green&quot;&gt;示例值：wx8523175fea790f10&lt;/font&gt; ；wx_woa_app_id 、wx_woa_path和 wx_applet_app_id三者不能同时为空
     */
    @JSONField(name = "wx_applet_app_id")
    private String wxAppletAppId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BUSI_CONFIG;
    }

    public V2MerchantBusiConfigRequest() {
    }

    public V2MerchantBusiConfigRequest(String reqSeqId, String reqDate, String huifuId, String feeType, String wxWoaAppId, String wxWoaPath, String wxAppletAppId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.feeType = feeType;
        this.wxWoaAppId = wxWoaAppId;
        this.wxWoaPath = wxWoaPath;
        this.wxAppletAppId = wxAppletAppId;
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

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getWxWoaAppId() {
        return wxWoaAppId;
    }

    public void setWxWoaAppId(String wxWoaAppId) {
        this.wxWoaAppId = wxWoaAppId;
    }

    public String getWxWoaPath() {
        return wxWoaPath;
    }

    public void setWxWoaPath(String wxWoaPath) {
        this.wxWoaPath = wxWoaPath;
    }

    public String getWxAppletAppId() {
        return wxAppletAppId;
    }

    public void setWxAppletAppId(String wxAppletAppId) {
        this.wxAppletAppId = wxAppletAppId;
    }

}
