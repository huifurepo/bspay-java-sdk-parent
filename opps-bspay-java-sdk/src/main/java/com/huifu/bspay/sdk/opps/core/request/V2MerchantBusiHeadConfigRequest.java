package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 开通下级商户权限配置接口
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBusiHeadConfigRequest extends BaseRequest {

    /**
     * 请求流水号
     */
    @JSONField(name = "req_seq_id")
    private String reqSeqId;
    /**
     * 请求时间
     */
    @JSONField(name = "req_date")
    private String reqDate;
    /**
     * 汇付客户Id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 产品编号
     */
    @JSONField(name = "product_id")
    private String productId;
    /**
     * 直属渠道号该商户进件完成后归属的渠道商huifu_id；；&lt;br/&gt;sys_id主体为渠道商时填写； &lt;br/&gt;sys_id主体为总部商户时选填；&lt;br/&gt; 示例值：6666000123123123
     */
    @JSONField(name = "upper_huifu_id")
    private String upperHuifuId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BUSI_HEAD_CONFIG;
    }

    public V2MerchantBusiHeadConfigRequest() {
    }

    public V2MerchantBusiHeadConfigRequest(String reqSeqId, String reqDate, String huifuId, String productId, String upperHuifuId) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.productId = productId;
        this.upperHuifuId = upperHuifuId;
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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUpperHuifuId() {
        return upperHuifuId;
    }

    public void setUpperHuifuId(String upperHuifuId) {
        this.upperHuifuId = upperHuifuId;
    }

}
