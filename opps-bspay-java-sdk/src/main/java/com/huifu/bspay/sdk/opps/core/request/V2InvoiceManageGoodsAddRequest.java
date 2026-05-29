package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 开票商品新增
 *
 * @author sdk-generator
 * @Description
 */
public class V2InvoiceManageGoodsAddRequest extends BaseRequest {

    /**
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 商品名称
     */
    @JSONField(name = "goods_name")
    private String goodsName;
    /**
     * 税收分类编码
     */
    @JSONField(name = "tax_code")
    private String taxCode;
    /**
     * 税率
     */
    @JSONField(name = "tax_rate")
    private String taxRate;
    /**
     * 是否默认
     */
    @JSONField(name = "is_default")
    private String isDefault;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_INVOICE_MANAGE_GOODS_ADD;
    }

    public V2InvoiceManageGoodsAddRequest() {
    }

    public V2InvoiceManageGoodsAddRequest(String huifuId, String goodsName, String taxCode, String taxRate, String isDefault) {
        this.huifuId = huifuId;
        this.goodsName = goodsName;
        this.taxCode = taxCode;
        this.taxRate = taxRate;
        this.isDefault = isDefault;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

}
