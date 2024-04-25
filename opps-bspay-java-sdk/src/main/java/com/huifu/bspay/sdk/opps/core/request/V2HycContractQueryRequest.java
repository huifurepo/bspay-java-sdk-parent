package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 个人签约状态查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2HycContractQueryRequest extends BaseRequest {

    /**
     * 系统号
     */
    @JSONField(name = "sys_id")
    private String sysId;
    /**
     * 产品号
     */
    @JSONField(name = "product_id")
    private String productId;
    /**
     * 加签结果
     */
    @JSONField(name = "sign")
    private String sign;
    /**
     * 数据
     */
    @JSONField(name = "data")
    private String data;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_HYC_CONTRACT_QUERY;
    }

    public V2HycContractQueryRequest() {
    }

    public V2HycContractQueryRequest(String sysId, String productId, String sign, String data) {
        this.sysId = sysId;
        this.productId = productId;
        this.sign = sign;
        this.data = data;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}