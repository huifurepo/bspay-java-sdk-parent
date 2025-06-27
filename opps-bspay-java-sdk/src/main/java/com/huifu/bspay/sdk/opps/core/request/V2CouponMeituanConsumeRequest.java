package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 美团卡券核销
 *
 * @author sdk-generator
 * @Description
 */
public class V2CouponMeituanConsumeRequest extends BaseRequest {

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
     * 汇付商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 门店绑定流水号
     */
    @JSONField(name = "bind_id")
    private String bindId;
    /**
     * 核销券
     */
    @JSONField(name = "receipt_code_infos")
    private String receiptCodeInfos;
    /**
     * 登录账号
     */
    @JSONField(name = "app_shop_account")
    private String appShopAccount;
    /**
     * 登录用户名
     */
    @JSONField(name = "app_shop_account_name")
    private String appShopAccountName;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_COUPON_MEITUAN_CONSUME;
    }

    public V2CouponMeituanConsumeRequest() {
    }

    public V2CouponMeituanConsumeRequest(String reqSeqId, String reqDate, String huifuId, String bindId, String receiptCodeInfos, String appShopAccount, String appShopAccountName) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.bindId = bindId;
        this.receiptCodeInfos = receiptCodeInfos;
        this.appShopAccount = appShopAccount;
        this.appShopAccountName = appShopAccountName;
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

    public String getBindId() {
        return bindId;
    }

    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    public String getReceiptCodeInfos() {
        return receiptCodeInfos;
    }

    public void setReceiptCodeInfos(String receiptCodeInfos) {
        this.receiptCodeInfos = receiptCodeInfos;
    }

    public String getAppShopAccount() {
        return appShopAccount;
    }

    public void setAppShopAccount(String appShopAccount) {
        this.appShopAccount = appShopAccount;
    }

    public String getAppShopAccountName() {
        return appShopAccountName;
    }

    public void setAppShopAccountName(String appShopAccountName) {
        this.appShopAccountName = appShopAccountName;
    }

}
