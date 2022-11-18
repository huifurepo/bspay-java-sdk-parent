package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 银行卡分期支持银行查询
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeBankinstallmentinfoQueryRequest extends BaseRequest {

    /**
     * 页码
     */
    @JSONField(name = "page_num")
    private String pageNum;
    /**
     * 每页条数
     */
    @JSONField(name = "page_size")
    private String pageSize;
    /**
     * 产品号
     */
    @JSONField(name = "product_id")
    private String productId;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_BANKINSTALLMENTINFO_QUERY;
    }

    public V2TradeBankinstallmentinfoQueryRequest() {
    }

    public V2TradeBankinstallmentinfoQueryRequest(String pageNum, String pageSize, String productId) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.productId = productId;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

}
