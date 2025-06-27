package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 美团卡券撤销
 *
 * @author sdk-generator
 * @Description
 */
public class V2CouponMeituanCancelRequest extends BaseRequest {

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
     * 登录账号
     */
    @JSONField(name = "app_shop_account")
    private String appShopAccount;
    /**
     * 登录用户名
     */
    @JSONField(name = "app_shop_account_name")
    private String appShopAccountName;
    /**
     * 券码
     */
    @JSONField(name = "receipt_code")
    private String receiptCode;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_COUPON_MEITUAN_CANCEL;
    }

    public V2CouponMeituanCancelRequest() {
    }

    public V2CouponMeituanCancelRequest(String reqSeqId, String reqDate, String huifuId, String bindId, String appShopAccount, String appShopAccountName, String receiptCode) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.bindId = bindId;
        this.appShopAccount = appShopAccount;
        this.appShopAccountName = appShopAccountName;
        this.receiptCode = receiptCode;
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

    public String getReceiptCode() {
        return receiptCode;
    }

    public void setReceiptCode(String receiptCode) {
        this.receiptCode = receiptCode;
    }

}
