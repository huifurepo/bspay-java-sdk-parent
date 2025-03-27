package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 灵工微信代发
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradeLgwxSurrogateRequest extends BaseRequest {

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
     * 出款方商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 支付金额(元)
     */
    @JSONField(name = "cash_amt")
    private String cashAmt;
    /**
     * 代发模式
     */
    @JSONField(name = "salary_modle_type")
    private String salaryModleType;
    /**
     * 落地公司商户号
     */
    @JSONField(name = "bmember_id")
    private String bmemberId;
    /**
     * 子商户应用ID
     */
    @JSONField(name = "sub_appid")
    private String subAppid;
    /**
     * 异步通知地址
     */
    @JSONField(name = "notify_url")
    private String notifyUrl;
    /**
     * 分账明细
     */
    @JSONField(name = "acct_split_bunch")
    private String acctSplitBunch;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_LGWX_SURROGATE;
    }

    public V2TradeLgwxSurrogateRequest() {
    }

    public V2TradeLgwxSurrogateRequest(String reqDate, String reqSeqId, String huifuId, String cashAmt, String salaryModleType, String bmemberId, String subAppid, String notifyUrl, String acctSplitBunch) {
        this.reqDate = reqDate;
        this.reqSeqId = reqSeqId;
        this.huifuId = huifuId;
        this.cashAmt = cashAmt;
        this.salaryModleType = salaryModleType;
        this.bmemberId = bmemberId;
        this.subAppid = subAppid;
        this.notifyUrl = notifyUrl;
        this.acctSplitBunch = acctSplitBunch;
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

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getCashAmt() {
        return cashAmt;
    }

    public void setCashAmt(String cashAmt) {
        this.cashAmt = cashAmt;
    }

    public String getSalaryModleType() {
        return salaryModleType;
    }

    public void setSalaryModleType(String salaryModleType) {
        this.salaryModleType = salaryModleType;
    }

    public String getBmemberId() {
        return bmemberId;
    }

    public void setBmemberId(String bmemberId) {
        this.bmemberId = bmemberId;
    }

    public String getSubAppid() {
        return subAppid;
    }

    public void setSubAppid(String subAppid) {
        this.subAppid = subAppid;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getAcctSplitBunch() {
        return acctSplitBunch;
    }

    public void setAcctSplitBunch(String acctSplitBunch) {
        this.acctSplitBunch = acctSplitBunch;
    }

}
