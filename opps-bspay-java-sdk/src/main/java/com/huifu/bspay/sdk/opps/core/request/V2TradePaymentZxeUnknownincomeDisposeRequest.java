package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 不明来账处理
 *
 * @author sdk-generator
 * @Description
 */
public class V2TradePaymentZxeUnknownincomeDisposeRequest extends BaseRequest {

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
     * 商户号
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 银行侧交易流水号参照异步通知里的bank_serial_no；&lt;br/&gt;“银行侧交易流水号”和“来账银行账号，来账账户名称，交易金额，交易日期”二选一必填。
     */
    @JSONField(name = "bank_serial_no")
    private String bankSerialNo;
    /**
     * 来账银行账号需要密文传输，使用汇付RSA公钥加密(加密前64位，加密后最长2048位），参见[参考文档](https://paas.huifu.com/open/doc/guide/#/api_jiami_jiemi)；示例值：Ly+fnExeyPOTzfOtgRRur77nJB9TAe4PGgK9M……fc6XJXZss&#x3D;“银行侧交易流水号”和“来账银行账号，来账账户名称，交易金额，交易日期”二选一必填。
     */
    @JSONField(name = "pay_acct")
    private String payAcct;
    /**
     * 来账账户名称“银行侧交易流水号”和“来账银行账号，来账账户名称，交易金额，交易日期”二选一必填。
     */
    @JSONField(name = "pay_acct_name")
    private String payAcctName;
    /**
     * 交易金额“银行侧交易流水号”和“来账银行账号，来账账户名称，交易金额，交易日期”二选一必填。
     */
    @JSONField(name = "trans_amt")
    private String transAmt;
    /**
     * 交易日期“银行侧交易流水号”和“来账银行账号，来账账户名称，交易金额，交易日期”二选一必填。
     */
    @JSONField(name = "trans_date")
    private String transDate;
    /**
     * 操作类型
     */
    @JSONField(name = "operate_type")
    private String operateType;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_TRADE_PAYMENT_ZXE_UNKNOWNINCOME_DISPOSE;
    }

    public V2TradePaymentZxeUnknownincomeDisposeRequest() {
    }

    public V2TradePaymentZxeUnknownincomeDisposeRequest(String reqSeqId, String reqDate, String huifuId, String bankSerialNo, String payAcct, String payAcctName, String transAmt, String transDate, String operateType) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.bankSerialNo = bankSerialNo;
        this.payAcct = payAcct;
        this.payAcctName = payAcctName;
        this.transAmt = transAmt;
        this.transDate = transDate;
        this.operateType = operateType;
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

    public String getBankSerialNo() {
        return bankSerialNo;
    }

    public void setBankSerialNo(String bankSerialNo) {
        this.bankSerialNo = bankSerialNo;
    }

    public String getPayAcct() {
        return payAcct;
    }

    public void setPayAcct(String payAcct) {
        this.payAcct = payAcct;
    }

    public String getPayAcctName() {
        return payAcctName;
    }

    public void setPayAcctName(String payAcctName) {
        this.payAcctName = payAcctName;
    }

    public String getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

}
