package com.huifu.bspay.sdk.opps.core.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.huifu.bspay.sdk.opps.core.enums.FunctionCodeEnum;

/**
 * 全渠道资金管理配置
 *
 * @author sdk-generator
 * @Description
 */
public class V2MerchantBusiEfpconfigRequest extends BaseRequest {

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
     * 商户汇付id
     */
    @JSONField(name = "huifu_id")
    private String huifuId;
    /**
     * 所属渠道商
     */
    @JSONField(name = "upper_huifu_id")
    private String upperHuifuId;
    /**
     * 支付手续费外扣汇付ID支付手续费外扣标记为1时必填；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：6666000109812123&lt;/font&gt;
     */
    @JSONField(name = "out_fee_huifuid")
    private String outFeeHuifuid;
    /**
     * 全域资金开户使用的银行卡信息首次开通时必填 jsonObject格式
     */
    @JSONField(name = "out_order_acct_card")
    private String outOrderAcctCard;
    /**
     * 全域资金开户手续费首次开通时必填 jsonObject格式
     */
    @JSONField(name = "out_order_acct_open_fees")
    private String outOrderAcctOpenFees;
    /**
     * 业务模式acquiringMode:收单模式 switch_state为1时必填
     */
    @JSONField(name = "business_model")
    private String businessModel;
    /**
     * 银行类型switch_state有值时需填写； ht1-华通银行，xw0-XW银行，ss0-苏商银行；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：ht1&lt;/font&gt;
     */
    @JSONField(name = "out_funds_gate_id")
    private String outFundsGateId;
    /**
     * 签约人信息switch_state为1时必填 jsonObject格式
     */
    @JSONField(name = "sign_user_info")
    private String signUserInfo;
    /**
     * 入账来源开通全域资金时需填写；01:抖音 02:美团 03:快手 04:拼多多 05:小红书 06:淘宝/天猫/飞猪 07:微信视频号/微信小店 08:京东 09:饿了么 11:得物 12:唯品会 13:携程 14:支付宝直连 15:微信直连 16:滴滴加油 17:团油 18:通联 19:易宝 20:百度 21:顺丰22:希音23:高德 多个逗号分隔；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：01,02,05&lt;/font&gt;；
     */
    @JSONField(name = "acct_source")
    private String acctSource;
    /**
     * 抖音合作证明材料入账来源包含01:抖音时必填 文件类型F535；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dy_cooperation_prove_pic")
    private String dyCooperationProvePic;
    /**
     * 美团合作证明材料入账来源包含02:美团时必填 文件类型F536；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "mt_cooperation_prove_pic")
    private String mtCooperationProvePic;
    /**
     * 快手合作证明材料入账来源包含03:快手时必填 文件类型F537；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "ks_cooperation_prove_pic")
    private String ksCooperationProvePic;
    /**
     * 拼多多合作证明材料入账来源包含04:拼多多时必填 文件类型F538；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "pdd_cooperation_prove_pic")
    private String pddCooperationProvePic;
    /**
     * 小红书合作证明材料入账来源包含05:小红书时必填 文件类型F539；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "xhs_cooperation_prove_pic")
    private String xhsCooperationProvePic;
    /**
     * 淘宝天猫飞猪合作证明材料入账来源包含06:淘宝天猫飞猪时必填 文件类型F540；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "zfb_cooperation_prove_pic")
    private String zfbCooperationProvePic;
    /**
     * 微信视频号合作证明材料入账来源包含07:微信视频号时必填 文件类型F541；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wx_cooperation_prove_pic")
    private String wxCooperationProvePic;
    /**
     * 京东合作证明材料入账来源包含08:京东时必填 文件类型F542；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "jd_cooperation_prove_pic")
    private String jdCooperationProvePic;
    /**
     * 饿了么合作证明材料入账来源包含09:饿了么时必填 文件类型F543；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "elm_cooperation_prove_pic")
    private String elmCooperationProvePic;
    /**
     * 得物合作证明材料入账来源包含11:得物时必填 文件类型F591；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dw_cooperation_prove_pic")
    private String dwCooperationProvePic;
    /**
     * 唯品会合作证明材料入账来源包含12:唯品会时必填 文件类型F592；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wph_cooperation_prove_pic")
    private String wphCooperationProvePic;
    /**
     * 携程合作证明材料入账来源包含13:携程时必填 文件类型F593；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "xc_cooperation_prove_pic")
    private String xcCooperationProvePic;
    /**
     * 支付宝直连合作证明材料入账来源包含14:支付宝直连时必填 文件类型F594；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "zfbzl_cooperation_prove_pic")
    private String zfbzlCooperationProvePic;
    /**
     * 微信直连合作证明材料入账来源包含15:微信直连时必填 文件类型F595；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wxzl_cooperation_prove_pic")
    private String wxzlCooperationProvePic;
    /**
     * 滴滴加油合作证明材料入账来源包含16:滴滴加油时必填 文件类型F596；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "ddjy_cooperation_prove_pic")
    private String ddjyCooperationProvePic;
    /**
     * 团油合作证明材料入账来源包含17:团油时必填 文件类型F597；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "ty_cooperation_prove_pic")
    private String tyCooperationProvePic;
    /**
     * 通联合作证明材料入账来源包含18:通联时必填 文件类型F598；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "tl_cooperation_prove_pic")
    private String tlCooperationProvePic;
    /**
     * 易宝合作证明材料入账来源包含19:易宝时必填 文件类型F599；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "yb_cooperation_prove_pic")
    private String ybCooperationProvePic;
    /**
     * 全渠道资金纸质协议文件协议类型为纸质时必填，文件类型F605；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "efp_paper_agreement_file")
    private String efpPaperAgreementFile;
    /**
     * 百度合作证明材料入账来源包含20:百度时必填 文件类型F616；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "bd_cooperation_prove_pic")
    private String bdCooperationProvePic;
    /**
     * 主店商户号是否店群为是时必填
     */
    @JSONField(name = "main_store_huifu_id")
    private String mainStoreHuifuId;
    /**
     * 顺丰合作证明材料入账来源包含21:顺丰时必填 文件类型F618；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "sf_cooperation_prove_pic")
    private String sfCooperationProvePic;
    /**
     * 希音合作证明材料入账来源包含22:希音时必填 文件类型F619；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "xy_cooperation_prove_pic")
    private String xyCooperationProvePic;
    /**
     * 高德合作证明材料入账来源包含23:高德时必填 文件类型F615；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "gd_cooperation_prove_pic")
    private String gdCooperationProvePic;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BUSI_EFPCONFIG;
    }

    public V2MerchantBusiEfpconfigRequest() {
    }

    public V2MerchantBusiEfpconfigRequest(String reqSeqId, String reqDate, String huifuId, String upperHuifuId, String outFeeHuifuid, String outOrderAcctCard, String outOrderAcctOpenFees, String businessModel, String outFundsGateId, String signUserInfo, String acctSource, String dyCooperationProvePic, String mtCooperationProvePic, String ksCooperationProvePic, String pddCooperationProvePic, String xhsCooperationProvePic, String zfbCooperationProvePic, String wxCooperationProvePic, String jdCooperationProvePic, String elmCooperationProvePic, String dwCooperationProvePic, String wphCooperationProvePic, String xcCooperationProvePic, String zfbzlCooperationProvePic, String wxzlCooperationProvePic, String ddjyCooperationProvePic, String tyCooperationProvePic, String tlCooperationProvePic, String ybCooperationProvePic, String efpPaperAgreementFile, String bdCooperationProvePic, String mainStoreHuifuId, String sfCooperationProvePic, String xyCooperationProvePic, String gdCooperationProvePic) {
        this.reqSeqId = reqSeqId;
        this.reqDate = reqDate;
        this.huifuId = huifuId;
        this.upperHuifuId = upperHuifuId;
        this.outFeeHuifuid = outFeeHuifuid;
        this.outOrderAcctCard = outOrderAcctCard;
        this.outOrderAcctOpenFees = outOrderAcctOpenFees;
        this.businessModel = businessModel;
        this.outFundsGateId = outFundsGateId;
        this.signUserInfo = signUserInfo;
        this.acctSource = acctSource;
        this.dyCooperationProvePic = dyCooperationProvePic;
        this.mtCooperationProvePic = mtCooperationProvePic;
        this.ksCooperationProvePic = ksCooperationProvePic;
        this.pddCooperationProvePic = pddCooperationProvePic;
        this.xhsCooperationProvePic = xhsCooperationProvePic;
        this.zfbCooperationProvePic = zfbCooperationProvePic;
        this.wxCooperationProvePic = wxCooperationProvePic;
        this.jdCooperationProvePic = jdCooperationProvePic;
        this.elmCooperationProvePic = elmCooperationProvePic;
        this.dwCooperationProvePic = dwCooperationProvePic;
        this.wphCooperationProvePic = wphCooperationProvePic;
        this.xcCooperationProvePic = xcCooperationProvePic;
        this.zfbzlCooperationProvePic = zfbzlCooperationProvePic;
        this.wxzlCooperationProvePic = wxzlCooperationProvePic;
        this.ddjyCooperationProvePic = ddjyCooperationProvePic;
        this.tyCooperationProvePic = tyCooperationProvePic;
        this.tlCooperationProvePic = tlCooperationProvePic;
        this.ybCooperationProvePic = ybCooperationProvePic;
        this.efpPaperAgreementFile = efpPaperAgreementFile;
        this.bdCooperationProvePic = bdCooperationProvePic;
        this.mainStoreHuifuId = mainStoreHuifuId;
        this.sfCooperationProvePic = sfCooperationProvePic;
        this.xyCooperationProvePic = xyCooperationProvePic;
        this.gdCooperationProvePic = gdCooperationProvePic;
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

    public String getUpperHuifuId() {
        return upperHuifuId;
    }

    public void setUpperHuifuId(String upperHuifuId) {
        this.upperHuifuId = upperHuifuId;
    }

    public String getOutFeeHuifuid() {
        return outFeeHuifuid;
    }

    public void setOutFeeHuifuid(String outFeeHuifuid) {
        this.outFeeHuifuid = outFeeHuifuid;
    }

    public String getOutOrderAcctCard() {
        return outOrderAcctCard;
    }

    public void setOutOrderAcctCard(String outOrderAcctCard) {
        this.outOrderAcctCard = outOrderAcctCard;
    }

    public String getOutOrderAcctOpenFees() {
        return outOrderAcctOpenFees;
    }

    public void setOutOrderAcctOpenFees(String outOrderAcctOpenFees) {
        this.outOrderAcctOpenFees = outOrderAcctOpenFees;
    }

    public String getBusinessModel() {
        return businessModel;
    }

    public void setBusinessModel(String businessModel) {
        this.businessModel = businessModel;
    }

    public String getOutFundsGateId() {
        return outFundsGateId;
    }

    public void setOutFundsGateId(String outFundsGateId) {
        this.outFundsGateId = outFundsGateId;
    }

    public String getSignUserInfo() {
        return signUserInfo;
    }

    public void setSignUserInfo(String signUserInfo) {
        this.signUserInfo = signUserInfo;
    }

    public String getAcctSource() {
        return acctSource;
    }

    public void setAcctSource(String acctSource) {
        this.acctSource = acctSource;
    }

    public String getDyCooperationProvePic() {
        return dyCooperationProvePic;
    }

    public void setDyCooperationProvePic(String dyCooperationProvePic) {
        this.dyCooperationProvePic = dyCooperationProvePic;
    }

    public String getMtCooperationProvePic() {
        return mtCooperationProvePic;
    }

    public void setMtCooperationProvePic(String mtCooperationProvePic) {
        this.mtCooperationProvePic = mtCooperationProvePic;
    }

    public String getKsCooperationProvePic() {
        return ksCooperationProvePic;
    }

    public void setKsCooperationProvePic(String ksCooperationProvePic) {
        this.ksCooperationProvePic = ksCooperationProvePic;
    }

    public String getPddCooperationProvePic() {
        return pddCooperationProvePic;
    }

    public void setPddCooperationProvePic(String pddCooperationProvePic) {
        this.pddCooperationProvePic = pddCooperationProvePic;
    }

    public String getXhsCooperationProvePic() {
        return xhsCooperationProvePic;
    }

    public void setXhsCooperationProvePic(String xhsCooperationProvePic) {
        this.xhsCooperationProvePic = xhsCooperationProvePic;
    }

    public String getZfbCooperationProvePic() {
        return zfbCooperationProvePic;
    }

    public void setZfbCooperationProvePic(String zfbCooperationProvePic) {
        this.zfbCooperationProvePic = zfbCooperationProvePic;
    }

    public String getWxCooperationProvePic() {
        return wxCooperationProvePic;
    }

    public void setWxCooperationProvePic(String wxCooperationProvePic) {
        this.wxCooperationProvePic = wxCooperationProvePic;
    }

    public String getJdCooperationProvePic() {
        return jdCooperationProvePic;
    }

    public void setJdCooperationProvePic(String jdCooperationProvePic) {
        this.jdCooperationProvePic = jdCooperationProvePic;
    }

    public String getElmCooperationProvePic() {
        return elmCooperationProvePic;
    }

    public void setElmCooperationProvePic(String elmCooperationProvePic) {
        this.elmCooperationProvePic = elmCooperationProvePic;
    }

    public String getDwCooperationProvePic() {
        return dwCooperationProvePic;
    }

    public void setDwCooperationProvePic(String dwCooperationProvePic) {
        this.dwCooperationProvePic = dwCooperationProvePic;
    }

    public String getWphCooperationProvePic() {
        return wphCooperationProvePic;
    }

    public void setWphCooperationProvePic(String wphCooperationProvePic) {
        this.wphCooperationProvePic = wphCooperationProvePic;
    }

    public String getXcCooperationProvePic() {
        return xcCooperationProvePic;
    }

    public void setXcCooperationProvePic(String xcCooperationProvePic) {
        this.xcCooperationProvePic = xcCooperationProvePic;
    }

    public String getZfbzlCooperationProvePic() {
        return zfbzlCooperationProvePic;
    }

    public void setZfbzlCooperationProvePic(String zfbzlCooperationProvePic) {
        this.zfbzlCooperationProvePic = zfbzlCooperationProvePic;
    }

    public String getWxzlCooperationProvePic() {
        return wxzlCooperationProvePic;
    }

    public void setWxzlCooperationProvePic(String wxzlCooperationProvePic) {
        this.wxzlCooperationProvePic = wxzlCooperationProvePic;
    }

    public String getDdjyCooperationProvePic() {
        return ddjyCooperationProvePic;
    }

    public void setDdjyCooperationProvePic(String ddjyCooperationProvePic) {
        this.ddjyCooperationProvePic = ddjyCooperationProvePic;
    }

    public String getTyCooperationProvePic() {
        return tyCooperationProvePic;
    }

    public void setTyCooperationProvePic(String tyCooperationProvePic) {
        this.tyCooperationProvePic = tyCooperationProvePic;
    }

    public String getTlCooperationProvePic() {
        return tlCooperationProvePic;
    }

    public void setTlCooperationProvePic(String tlCooperationProvePic) {
        this.tlCooperationProvePic = tlCooperationProvePic;
    }

    public String getYbCooperationProvePic() {
        return ybCooperationProvePic;
    }

    public void setYbCooperationProvePic(String ybCooperationProvePic) {
        this.ybCooperationProvePic = ybCooperationProvePic;
    }

    public String getEfpPaperAgreementFile() {
        return efpPaperAgreementFile;
    }

    public void setEfpPaperAgreementFile(String efpPaperAgreementFile) {
        this.efpPaperAgreementFile = efpPaperAgreementFile;
    }

    public String getBdCooperationProvePic() {
        return bdCooperationProvePic;
    }

    public void setBdCooperationProvePic(String bdCooperationProvePic) {
        this.bdCooperationProvePic = bdCooperationProvePic;
    }

    public String getMainStoreHuifuId() {
        return mainStoreHuifuId;
    }

    public void setMainStoreHuifuId(String mainStoreHuifuId) {
        this.mainStoreHuifuId = mainStoreHuifuId;
    }

    public String getSfCooperationProvePic() {
        return sfCooperationProvePic;
    }

    public void setSfCooperationProvePic(String sfCooperationProvePic) {
        this.sfCooperationProvePic = sfCooperationProvePic;
    }

    public String getXyCooperationProvePic() {
        return xyCooperationProvePic;
    }

    public void setXyCooperationProvePic(String xyCooperationProvePic) {
        this.xyCooperationProvePic = xyCooperationProvePic;
    }

    public String getGdCooperationProvePic() {
        return gdCooperationProvePic;
    }

    public void setGdCooperationProvePic(String gdCooperationProvePic) {
        this.gdCooperationProvePic = gdCooperationProvePic;
    }

}
