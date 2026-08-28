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
     * 银行类型switch_state有值时需填写； ht1-华通银行，xw0-XW银行，ss0-苏商银行,wz1-微众银行&lt;font color&#x3D;&quot;green&quot;&gt;示例值：ht1&lt;/font&gt;
     */
    @JSONField(name = "out_funds_gate_id")
    private String outFundsGateId;
    /**
     * 签约人信息switch_state为1时必填 jsonObject格式
     */
    @JSONField(name = "sign_user_info")
    private String signUserInfo;
    /**
     * 入账来源开通全域资金时需填写；01:抖音 02:美团 03:快手 04:拼多多 05:小红书 06:淘宝/天猫/飞猪 07:微信视频号/微信小店 08:京东 09:饿了么 11:得物 12:唯品会 13:携程 14:支付宝直连 15:微信直连 16:滴滴加油 17:团油 18:通联 19:易宝 20:百度 21:顺丰22:希音23:高德 24:贝壳 多个逗号分隔；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：01,02,05&lt;/font&gt;；
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
    /**
     * 贝壳合作证明材料入账来源包含24:贝壳时必填 文件类型F802；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "bk_cooperation_prove_pic")
    private String bkCooperationProvePic;
    /**
     * 抖音平台后台交易数据截屏开通微众银行且入账来源包含01:抖音时必填 文件类型F730；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dy_platform_trans_data_pic")
    private String dyPlatformTransDataPic;
    /**
     * 抖音平台后台店铺信息截屏开通微众银行且入账来源包含01:抖音时必填 文件类型F731；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dy_platform_store_info_pic")
    private String dyPlatformStoreInfoPic;
    /**
     * 抖音平台后台经营主体截屏开通微众银行且入账来源包含01:抖音时必填 文件类型F732；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dy_platform_busi_ent_pic")
    private String dyPlatformBusiEntPic;
    /**
     * 抖音平台后台订单明细截屏开通微众银行且入账来源包含01:抖音时必填 文件类型F733；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dy_platform_order_detail_pic")
    private String dyPlatformOrderDetailPic;
    /**
     * 抖音平台后台资金流水截屏开通微众银行且入账来源包含01:抖音时必填 文件类型F734；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dy_platform_fund_flow_pic")
    private String dyPlatformFundFlowPic;
    /**
     * 抖音移动端店铺橱窗截屏开通微众银行且入账来源包含01:抖音时必填 文件类型F735；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dy_mobile_store_showcase_pic")
    private String dyMobileStoreShowcasePic;
    /**
     * 抖音移动端商家资质截屏开通微众银行且入账来源包含01:抖音时必填 文件类型F736；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dy_mobile_busi_qualification_pic")
    private String dyMobileBusiQualificationPic;
    /**
     * 抖音移动端店铺详情截屏开通微众银行且入账来源包含01:抖音时必填 文件类型F737；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dy_mobile_store_detail_pic")
    private String dyMobileStoreDetailPic;
    /**
     * 快手平台后台交易数据截屏开通微众银行且入账来源包含03:快手时必填 文件类型F738；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "ks_platform_trans_data_pic")
    private String ksPlatformTransDataPic;
    /**
     * 快手平台后台店铺信息截屏开通微众银行且入账来源包含03:快手时必填 文件类型F739；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "ks_platform_store_info_pic")
    private String ksPlatformStoreInfoPic;
    /**
     * 快手平台后台经营主体截屏开通微众银行且入账来源包含03:快手时必填 文件类型F740；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "ks_platform_busi_ent_pic")
    private String ksPlatformBusiEntPic;
    /**
     * 快手平台后台订单明细截屏开通微众银行且入账来源包含03:快手时必填 文件类型F741；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "ks_platform_order_detail_pic")
    private String ksPlatformOrderDetailPic;
    /**
     * 快手平台后台资金流水截屏开通微众银行且入账来源包含03:快手时必填 文件类型F742；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "ks_platform_fund_flow_pic")
    private String ksPlatformFundFlowPic;
    /**
     * 快手移动端店铺橱窗截屏开通微众银行且入账来源包含03:快手时必填 文件类型F743；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "ks_mobile_store_showcase_pic")
    private String ksMobileStoreShowcasePic;
    /**
     * 快手移动端商家资质截屏开通微众银行且入账来源包含03:快手时必填 文件类型F744；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "ks_mobile_busi_qualification_pic")
    private String ksMobileBusiQualificationPic;
    /**
     * 快手移动端店铺详情截屏开通微众银行且入账来源包含03:快手时必填 文件类型F745；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "ks_mobile_store_detail_pic")
    private String ksMobileStoreDetailPic;
    /**
     * 拼多多平台后台交易数据截屏开通微众银行且入账来源包含04:拼多多时必填 文件类型F746；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "pdd_platform_trans_data_pic")
    private String pddPlatformTransDataPic;
    /**
     * 拼多多平台后台店铺信息截屏开通微众银行且入账来源包含04:拼多多时必填 文件类型F747；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "pdd_platform_store_info_pic")
    private String pddPlatformStoreInfoPic;
    /**
     * 拼多多平台后台经营主体截屏开通微众银行且入账来源包含04:拼多多时必填 文件类型F748；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "pdd_platform_busi_ent_pic")
    private String pddPlatformBusiEntPic;
    /**
     * 拼多多平台后台订单明细截屏开通微众银行且入账来源包含04:拼多多时必填 文件类型F749；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "pdd_platform_order_detail_pic")
    private String pddPlatformOrderDetailPic;
    /**
     * 拼多多平台后台资金流水截屏开通微众银行且入账来源包含04:拼多多时必填 文件类型F750；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "pdd_platform_fund_flow_pic")
    private String pddPlatformFundFlowPic;
    /**
     * 拼多多移动端店铺橱窗截屏开通微众银行且入账来源包含04:拼多多时必填 文件类型F751；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "pdd_mobile_store_showcase_pic")
    private String pddMobileStoreShowcasePic;
    /**
     * 拼多多移动端商家资质截屏开通微众银行且入账来源包含04:拼多多时必填 文件类型F752；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "pdd_mobile_busi_qualification_pic")
    private String pddMobileBusiQualificationPic;
    /**
     * 拼多多移动端店铺详情截屏开通微众银行且入账来源包含04:拼多多时必填 文件类型F753；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "pdd_mobile_store_detail_pic")
    private String pddMobileStoreDetailPic;
    /**
     * 小红书平台后台交易数据截屏开通微众银行且入账来源包含05:小红书时必填 文件类型F754；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "xhs_platform_trans_data_pic")
    private String xhsPlatformTransDataPic;
    /**
     * 小红书平台后台店铺信息截屏开通微众银行且入账来源包含05:小红书时必填 文件类型F755；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "xhs_platform_store_info_pic")
    private String xhsPlatformStoreInfoPic;
    /**
     * 小红书平台后台经营主体截屏开通微众银行且入账来源包含05:小红书时必填 文件类型F756；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "xhs_platform_busi_ent_pic")
    private String xhsPlatformBusiEntPic;
    /**
     * 小红书平台后台订单明细截屏开通微众银行且入账来源包含05:小红书时必填 文件类型F757；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "xhs_platform_order_detail_pic")
    private String xhsPlatformOrderDetailPic;
    /**
     * 小红书平台后台资金流水截屏开通微众银行且入账来源包含05:小红书时必填 文件类型F758；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "xhs_platform_fund_flow_pic")
    private String xhsPlatformFundFlowPic;
    /**
     * 小红书移动端店铺橱窗截屏开通微众银行且入账来源包含05:小红书时必填 文件类型F759；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "xhs_mobile_store_showcase_pic")
    private String xhsMobileStoreShowcasePic;
    /**
     * 小红书移动端商家资质截屏开通微众银行且入账来源包含05:小红书时必填 文件类型F760；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "xhs_mobile_busi_qualification_pic")
    private String xhsMobileBusiQualificationPic;
    /**
     * 小红书移动端店铺详情截屏开通微众银行且入账来源包含05:小红书时必填 文件类型F761；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "xhs_mobile_store_detail_pic")
    private String xhsMobileStoreDetailPic;
    /**
     * 微信视频号平台后台交易数据截屏开通微众银行且入账来源包含07:微信视频号时必填 文件类型F762；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wxsph_platform_trans_data_pic")
    private String wxsphPlatformTransDataPic;
    /**
     * 微信视频号平台后台店铺信息截屏开通微众银行且入账来源包含07:微信视频号时必填 文件类型F763；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wxsph_platform_store_info_pic")
    private String wxsphPlatformStoreInfoPic;
    /**
     * 微信视频号平台后台经营主体截屏开通微众银行且入账来源包含07:微信视频号时必填 文件类型F764；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wxsph_platform_busi_ent_pic")
    private String wxsphPlatformBusiEntPic;
    /**
     * 微信视频号平台后台订单明细截屏开通微众银行且入账来源包含07:微信视频号时必填 文件类型F765；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wxsph_platform_order_detail_pic")
    private String wxsphPlatformOrderDetailPic;
    /**
     * 微信视频号平台后台资金流水截屏开通微众银行且入账来源包含07:微信视频号时必填 文件类型F766；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wxsph_platform_fund_flow_pic")
    private String wxsphPlatformFundFlowPic;
    /**
     * 微信视频号移动端店铺橱窗截屏开通微众银行且入账来源包含07:微信视频号时必填 文件类型F767；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wxsph_mobile_store_showcase_pic")
    private String wxsphMobileStoreShowcasePic;
    /**
     * 微信视频号移动端商家资质截屏开通微众银行且入账来源包含07:微信视频号时必填 文件类型F768；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wxsph_mobile_busi_qualification_pic")
    private String wxsphMobileBusiQualificationPic;
    /**
     * 微信视频号移动端店铺详情截屏开通微众银行且入账来源包含07:微信视频号时必填 文件类型F769；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wxsph_mobile_store_detail_pic")
    private String wxsphMobileStoreDetailPic;
    /**
     * 京东平台后台交易数据截屏开通微众银行且入账来源包含08:京东时必填 文件类型F770；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "jd_platform_trans_data_pic")
    private String jdPlatformTransDataPic;
    /**
     * 京东平台后台店铺信息截屏开通微众银行且入账来源包含08:京东时必填 文件类型F771；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "jd_platform_store_info_pic")
    private String jdPlatformStoreInfoPic;
    /**
     * 京东平台后台经营主体截屏开通微众银行且入账来源包含08:京东时必填 文件类型F772；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "jd_platform_busi_ent_pic")
    private String jdPlatformBusiEntPic;
    /**
     * 京东平台后台订单明细截屏开通微众银行且入账来源包含08:京东时必填 文件类型F773；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "jd_platform_order_detail_pic")
    private String jdPlatformOrderDetailPic;
    /**
     * 京东平台后台资金流水截屏开通微众银行且入账来源包含08:京东时必填 文件类型F774；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "jd_platform_fund_flow_pic")
    private String jdPlatformFundFlowPic;
    /**
     * 京东移动端店铺橱窗截屏开通微众银行且入账来源包含08:京东时必填 文件类型F775；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "jd_mobile_store_showcase_pic")
    private String jdMobileStoreShowcasePic;
    /**
     * 京东移动端商家资质截屏开通微众银行且入账来源包含08:京东时必填 文件类型F776；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "jd_mobile_busi_qualification_pic")
    private String jdMobileBusiQualificationPic;
    /**
     * 京东移动端店铺详情截屏开通微众银行且入账来源包含08:京东时必填 文件类型F777；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "jd_mobile_store_detail_pic")
    private String jdMobileStoreDetailPic;
    /**
     * 得物平台后台交易数据截屏开通微众银行且入账来源包含11:得物时必填 文件类型F778；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dw_platform_trans_data_pic")
    private String dwPlatformTransDataPic;
    /**
     * 得物平台后台店铺信息截屏开通微众银行且入账来源包含11:得物时必填 文件类型F779；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dw_platform_store_info_pic")
    private String dwPlatformStoreInfoPic;
    /**
     * 得物平台后台经营主体截屏开通微众银行且入账来源包含11:得物时必填 文件类型F780；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dw_platform_busi_ent_pic")
    private String dwPlatformBusiEntPic;
    /**
     * 得物平台后台订单明细截屏开通微众银行且入账来源包含11:得物时必填 文件类型F781；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dw_platform_order_detail_pic")
    private String dwPlatformOrderDetailPic;
    /**
     * 得物平台后台资金流水截屏开通微众银行且入账来源包含11:得物时必填 文件类型F782；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dw_platform_fund_flow_pic")
    private String dwPlatformFundFlowPic;
    /**
     * 得物移动端店铺橱窗截屏开通微众银行且入账来源包含11:得物时必填 文件类型F783；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dw_mobile_store_showcase_pic")
    private String dwMobileStoreShowcasePic;
    /**
     * 得物移动端商家资质截屏开通微众银行且入账来源包含11:得物时必填 文件类型F784；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dw_mobile_busi_qualification_pic")
    private String dwMobileBusiQualificationPic;
    /**
     * 得物移动端店铺详情截屏开通微众银行且入账来源包含11:得物时必填 文件类型F785；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "dw_mobile_store_detail_pic")
    private String dwMobileStoreDetailPic;
    /**
     * 美团平台后台交易数据截屏开通微众银行且入账来源包含02:美团时必填 文件类型F786；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "mt_platform_trans_data_pic")
    private String mtPlatformTransDataPic;
    /**
     * 美团平台后台店铺信息截屏开通微众银行且入账来源包含02:美团时必填 文件类型F787；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "mt_platform_store_info_pic")
    private String mtPlatformStoreInfoPic;
    /**
     * 美团平台后台经营主体截屏开通微众银行且入账来源包含02:美团时必填 文件类型F788；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "mt_platform_busi_ent_pic")
    private String mtPlatformBusiEntPic;
    /**
     * 美团平台后台订单明细截屏开通微众银行且入账来源包含02:美团时必填 文件类型F789；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "mt_platform_order_detail_pic")
    private String mtPlatformOrderDetailPic;
    /**
     * 美团平台后台资金流水截屏开通微众银行且入账来源包含02:美团时必填 文件类型F790；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "mt_platform_fund_flow_pic")
    private String mtPlatformFundFlowPic;
    /**
     * 美团移动端店铺橱窗截屏开通微众银行且入账来源包含02:美团时必填 文件类型F791；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "mt_mobile_store_showcase_pic")
    private String mtMobileStoreShowcasePic;
    /**
     * 美团移动端商家资质截屏开通微众银行且入账来源包含02:美团时必填 文件类型F792；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "mt_mobile_busi_qualification_pic")
    private String mtMobileBusiQualificationPic;
    /**
     * 美团移动端店铺详情截屏开通微众银行且入账来源包含02:美团时必填 文件类型F793；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "mt_mobile_store_detail_pic")
    private String mtMobileStoreDetailPic;
    /**
     * 唯品会平台后台交易数据截屏开通微众银行且入账来源包含12:唯品会时必填 文件类型F794；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wph_platform_trans_data_pic")
    private String wphPlatformTransDataPic;
    /**
     * 唯品会平台后台店铺信息截屏开通微众银行且入账来源包含12:唯品会时必填 文件类型F795；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wph_platform_store_info_pic")
    private String wphPlatformStoreInfoPic;
    /**
     * 唯品会平台后台经营主体截屏开通微众银行且入账来源包含12:唯品会时必填 文件类型F796；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wph_platform_busi_ent_pic")
    private String wphPlatformBusiEntPic;
    /**
     * 唯品会平台后台订单明细截屏开通微众银行且入账来源包含12:唯品会时必填 文件类型F797；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wph_platform_order_detail_pic")
    private String wphPlatformOrderDetailPic;
    /**
     * 唯品会平台后台资金流水截屏开通微众银行且入账来源包含12:唯品会时必填 文件类型F798；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wph_platform_fund_flow_pic")
    private String wphPlatformFundFlowPic;
    /**
     * 唯品会移动端店铺橱窗截屏开通微众银行且入账来源包含12:唯品会时必填 文件类型F799；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wph_mobile_store_showcase_pic")
    private String wphMobileStoreShowcasePic;
    /**
     * 唯品会移动端商家资质截屏开通微众银行且入账来源包含12:唯品会时必填 文件类型F800；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wph_mobile_busi_qualification_pic")
    private String wphMobileBusiQualificationPic;
    /**
     * 唯品会移动端店铺详情截屏开通微众银行且入账来源包含12:唯品会时必填 文件类型F801；详见[文件类型说明](https://paas.huifu.com/open/doc/api/#/csfl/api_csfl_wjlx)；&lt;font color&#x3D;&quot;green&quot;&gt;示例值：57cc7f00-600a-33ab-b614-6221bbf2e530&lt;/font&gt;
     */
    @JSONField(name = "wph_mobile_store_detail_pic")
    private String wphMobileStoreDetailPic;

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.V2_MERCHANT_BUSI_EFPCONFIG;
    }

    public V2MerchantBusiEfpconfigRequest() {
    }

    public V2MerchantBusiEfpconfigRequest(String reqSeqId, String reqDate, String huifuId, String upperHuifuId, String outFeeHuifuid, String outOrderAcctCard, String outOrderAcctOpenFees, String businessModel, String outFundsGateId, String signUserInfo, String acctSource, String dyCooperationProvePic, String mtCooperationProvePic, String ksCooperationProvePic, String pddCooperationProvePic, String xhsCooperationProvePic, String zfbCooperationProvePic, String wxCooperationProvePic, String jdCooperationProvePic, String elmCooperationProvePic, String dwCooperationProvePic, String wphCooperationProvePic, String xcCooperationProvePic, String zfbzlCooperationProvePic, String wxzlCooperationProvePic, String ddjyCooperationProvePic, String tyCooperationProvePic, String tlCooperationProvePic, String ybCooperationProvePic, String efpPaperAgreementFile, String bdCooperationProvePic, String mainStoreHuifuId, String sfCooperationProvePic, String xyCooperationProvePic, String gdCooperationProvePic, String bkCooperationProvePic, String dyPlatformTransDataPic, String dyPlatformStoreInfoPic, String dyPlatformBusiEntPic, String dyPlatformOrderDetailPic, String dyPlatformFundFlowPic, String dyMobileStoreShowcasePic, String dyMobileBusiQualificationPic, String dyMobileStoreDetailPic, String ksPlatformTransDataPic, String ksPlatformStoreInfoPic, String ksPlatformBusiEntPic, String ksPlatformOrderDetailPic, String ksPlatformFundFlowPic, String ksMobileStoreShowcasePic, String ksMobileBusiQualificationPic, String ksMobileStoreDetailPic, String pddPlatformTransDataPic, String pddPlatformStoreInfoPic, String pddPlatformBusiEntPic, String pddPlatformOrderDetailPic, String pddPlatformFundFlowPic, String pddMobileStoreShowcasePic, String pddMobileBusiQualificationPic, String pddMobileStoreDetailPic, String xhsPlatformTransDataPic, String xhsPlatformStoreInfoPic, String xhsPlatformBusiEntPic, String xhsPlatformOrderDetailPic, String xhsPlatformFundFlowPic, String xhsMobileStoreShowcasePic, String xhsMobileBusiQualificationPic, String xhsMobileStoreDetailPic, String wxsphPlatformTransDataPic, String wxsphPlatformStoreInfoPic, String wxsphPlatformBusiEntPic, String wxsphPlatformOrderDetailPic, String wxsphPlatformFundFlowPic, String wxsphMobileStoreShowcasePic, String wxsphMobileBusiQualificationPic, String wxsphMobileStoreDetailPic, String jdPlatformTransDataPic, String jdPlatformStoreInfoPic, String jdPlatformBusiEntPic, String jdPlatformOrderDetailPic, String jdPlatformFundFlowPic, String jdMobileStoreShowcasePic, String jdMobileBusiQualificationPic, String jdMobileStoreDetailPic, String dwPlatformTransDataPic, String dwPlatformStoreInfoPic, String dwPlatformBusiEntPic, String dwPlatformOrderDetailPic, String dwPlatformFundFlowPic, String dwMobileStoreShowcasePic, String dwMobileBusiQualificationPic, String dwMobileStoreDetailPic, String mtPlatformTransDataPic, String mtPlatformStoreInfoPic, String mtPlatformBusiEntPic, String mtPlatformOrderDetailPic, String mtPlatformFundFlowPic, String mtMobileStoreShowcasePic, String mtMobileBusiQualificationPic, String mtMobileStoreDetailPic, String wphPlatformTransDataPic, String wphPlatformStoreInfoPic, String wphPlatformBusiEntPic, String wphPlatformOrderDetailPic, String wphPlatformFundFlowPic, String wphMobileStoreShowcasePic, String wphMobileBusiQualificationPic, String wphMobileStoreDetailPic) {
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
        this.bkCooperationProvePic = bkCooperationProvePic;
        this.dyPlatformTransDataPic = dyPlatformTransDataPic;
        this.dyPlatformStoreInfoPic = dyPlatformStoreInfoPic;
        this.dyPlatformBusiEntPic = dyPlatformBusiEntPic;
        this.dyPlatformOrderDetailPic = dyPlatformOrderDetailPic;
        this.dyPlatformFundFlowPic = dyPlatformFundFlowPic;
        this.dyMobileStoreShowcasePic = dyMobileStoreShowcasePic;
        this.dyMobileBusiQualificationPic = dyMobileBusiQualificationPic;
        this.dyMobileStoreDetailPic = dyMobileStoreDetailPic;
        this.ksPlatformTransDataPic = ksPlatformTransDataPic;
        this.ksPlatformStoreInfoPic = ksPlatformStoreInfoPic;
        this.ksPlatformBusiEntPic = ksPlatformBusiEntPic;
        this.ksPlatformOrderDetailPic = ksPlatformOrderDetailPic;
        this.ksPlatformFundFlowPic = ksPlatformFundFlowPic;
        this.ksMobileStoreShowcasePic = ksMobileStoreShowcasePic;
        this.ksMobileBusiQualificationPic = ksMobileBusiQualificationPic;
        this.ksMobileStoreDetailPic = ksMobileStoreDetailPic;
        this.pddPlatformTransDataPic = pddPlatformTransDataPic;
        this.pddPlatformStoreInfoPic = pddPlatformStoreInfoPic;
        this.pddPlatformBusiEntPic = pddPlatformBusiEntPic;
        this.pddPlatformOrderDetailPic = pddPlatformOrderDetailPic;
        this.pddPlatformFundFlowPic = pddPlatformFundFlowPic;
        this.pddMobileStoreShowcasePic = pddMobileStoreShowcasePic;
        this.pddMobileBusiQualificationPic = pddMobileBusiQualificationPic;
        this.pddMobileStoreDetailPic = pddMobileStoreDetailPic;
        this.xhsPlatformTransDataPic = xhsPlatformTransDataPic;
        this.xhsPlatformStoreInfoPic = xhsPlatformStoreInfoPic;
        this.xhsPlatformBusiEntPic = xhsPlatformBusiEntPic;
        this.xhsPlatformOrderDetailPic = xhsPlatformOrderDetailPic;
        this.xhsPlatformFundFlowPic = xhsPlatformFundFlowPic;
        this.xhsMobileStoreShowcasePic = xhsMobileStoreShowcasePic;
        this.xhsMobileBusiQualificationPic = xhsMobileBusiQualificationPic;
        this.xhsMobileStoreDetailPic = xhsMobileStoreDetailPic;
        this.wxsphPlatformTransDataPic = wxsphPlatformTransDataPic;
        this.wxsphPlatformStoreInfoPic = wxsphPlatformStoreInfoPic;
        this.wxsphPlatformBusiEntPic = wxsphPlatformBusiEntPic;
        this.wxsphPlatformOrderDetailPic = wxsphPlatformOrderDetailPic;
        this.wxsphPlatformFundFlowPic = wxsphPlatformFundFlowPic;
        this.wxsphMobileStoreShowcasePic = wxsphMobileStoreShowcasePic;
        this.wxsphMobileBusiQualificationPic = wxsphMobileBusiQualificationPic;
        this.wxsphMobileStoreDetailPic = wxsphMobileStoreDetailPic;
        this.jdPlatformTransDataPic = jdPlatformTransDataPic;
        this.jdPlatformStoreInfoPic = jdPlatformStoreInfoPic;
        this.jdPlatformBusiEntPic = jdPlatformBusiEntPic;
        this.jdPlatformOrderDetailPic = jdPlatformOrderDetailPic;
        this.jdPlatformFundFlowPic = jdPlatformFundFlowPic;
        this.jdMobileStoreShowcasePic = jdMobileStoreShowcasePic;
        this.jdMobileBusiQualificationPic = jdMobileBusiQualificationPic;
        this.jdMobileStoreDetailPic = jdMobileStoreDetailPic;
        this.dwPlatformTransDataPic = dwPlatformTransDataPic;
        this.dwPlatformStoreInfoPic = dwPlatformStoreInfoPic;
        this.dwPlatformBusiEntPic = dwPlatformBusiEntPic;
        this.dwPlatformOrderDetailPic = dwPlatformOrderDetailPic;
        this.dwPlatformFundFlowPic = dwPlatformFundFlowPic;
        this.dwMobileStoreShowcasePic = dwMobileStoreShowcasePic;
        this.dwMobileBusiQualificationPic = dwMobileBusiQualificationPic;
        this.dwMobileStoreDetailPic = dwMobileStoreDetailPic;
        this.mtPlatformTransDataPic = mtPlatformTransDataPic;
        this.mtPlatformStoreInfoPic = mtPlatformStoreInfoPic;
        this.mtPlatformBusiEntPic = mtPlatformBusiEntPic;
        this.mtPlatformOrderDetailPic = mtPlatformOrderDetailPic;
        this.mtPlatformFundFlowPic = mtPlatformFundFlowPic;
        this.mtMobileStoreShowcasePic = mtMobileStoreShowcasePic;
        this.mtMobileBusiQualificationPic = mtMobileBusiQualificationPic;
        this.mtMobileStoreDetailPic = mtMobileStoreDetailPic;
        this.wphPlatformTransDataPic = wphPlatformTransDataPic;
        this.wphPlatformStoreInfoPic = wphPlatformStoreInfoPic;
        this.wphPlatformBusiEntPic = wphPlatformBusiEntPic;
        this.wphPlatformOrderDetailPic = wphPlatformOrderDetailPic;
        this.wphPlatformFundFlowPic = wphPlatformFundFlowPic;
        this.wphMobileStoreShowcasePic = wphMobileStoreShowcasePic;
        this.wphMobileBusiQualificationPic = wphMobileBusiQualificationPic;
        this.wphMobileStoreDetailPic = wphMobileStoreDetailPic;
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

    public String getBkCooperationProvePic() {
        return bkCooperationProvePic;
    }

    public void setBkCooperationProvePic(String bkCooperationProvePic) {
        this.bkCooperationProvePic = bkCooperationProvePic;
    }

    public String getDyPlatformTransDataPic() {
        return dyPlatformTransDataPic;
    }

    public void setDyPlatformTransDataPic(String dyPlatformTransDataPic) {
        this.dyPlatformTransDataPic = dyPlatformTransDataPic;
    }

    public String getDyPlatformStoreInfoPic() {
        return dyPlatformStoreInfoPic;
    }

    public void setDyPlatformStoreInfoPic(String dyPlatformStoreInfoPic) {
        this.dyPlatformStoreInfoPic = dyPlatformStoreInfoPic;
    }

    public String getDyPlatformBusiEntPic() {
        return dyPlatformBusiEntPic;
    }

    public void setDyPlatformBusiEntPic(String dyPlatformBusiEntPic) {
        this.dyPlatformBusiEntPic = dyPlatformBusiEntPic;
    }

    public String getDyPlatformOrderDetailPic() {
        return dyPlatformOrderDetailPic;
    }

    public void setDyPlatformOrderDetailPic(String dyPlatformOrderDetailPic) {
        this.dyPlatformOrderDetailPic = dyPlatformOrderDetailPic;
    }

    public String getDyPlatformFundFlowPic() {
        return dyPlatformFundFlowPic;
    }

    public void setDyPlatformFundFlowPic(String dyPlatformFundFlowPic) {
        this.dyPlatformFundFlowPic = dyPlatformFundFlowPic;
    }

    public String getDyMobileStoreShowcasePic() {
        return dyMobileStoreShowcasePic;
    }

    public void setDyMobileStoreShowcasePic(String dyMobileStoreShowcasePic) {
        this.dyMobileStoreShowcasePic = dyMobileStoreShowcasePic;
    }

    public String getDyMobileBusiQualificationPic() {
        return dyMobileBusiQualificationPic;
    }

    public void setDyMobileBusiQualificationPic(String dyMobileBusiQualificationPic) {
        this.dyMobileBusiQualificationPic = dyMobileBusiQualificationPic;
    }

    public String getDyMobileStoreDetailPic() {
        return dyMobileStoreDetailPic;
    }

    public void setDyMobileStoreDetailPic(String dyMobileStoreDetailPic) {
        this.dyMobileStoreDetailPic = dyMobileStoreDetailPic;
    }

    public String getKsPlatformTransDataPic() {
        return ksPlatformTransDataPic;
    }

    public void setKsPlatformTransDataPic(String ksPlatformTransDataPic) {
        this.ksPlatformTransDataPic = ksPlatformTransDataPic;
    }

    public String getKsPlatformStoreInfoPic() {
        return ksPlatformStoreInfoPic;
    }

    public void setKsPlatformStoreInfoPic(String ksPlatformStoreInfoPic) {
        this.ksPlatformStoreInfoPic = ksPlatformStoreInfoPic;
    }

    public String getKsPlatformBusiEntPic() {
        return ksPlatformBusiEntPic;
    }

    public void setKsPlatformBusiEntPic(String ksPlatformBusiEntPic) {
        this.ksPlatformBusiEntPic = ksPlatformBusiEntPic;
    }

    public String getKsPlatformOrderDetailPic() {
        return ksPlatformOrderDetailPic;
    }

    public void setKsPlatformOrderDetailPic(String ksPlatformOrderDetailPic) {
        this.ksPlatformOrderDetailPic = ksPlatformOrderDetailPic;
    }

    public String getKsPlatformFundFlowPic() {
        return ksPlatformFundFlowPic;
    }

    public void setKsPlatformFundFlowPic(String ksPlatformFundFlowPic) {
        this.ksPlatformFundFlowPic = ksPlatformFundFlowPic;
    }

    public String getKsMobileStoreShowcasePic() {
        return ksMobileStoreShowcasePic;
    }

    public void setKsMobileStoreShowcasePic(String ksMobileStoreShowcasePic) {
        this.ksMobileStoreShowcasePic = ksMobileStoreShowcasePic;
    }

    public String getKsMobileBusiQualificationPic() {
        return ksMobileBusiQualificationPic;
    }

    public void setKsMobileBusiQualificationPic(String ksMobileBusiQualificationPic) {
        this.ksMobileBusiQualificationPic = ksMobileBusiQualificationPic;
    }

    public String getKsMobileStoreDetailPic() {
        return ksMobileStoreDetailPic;
    }

    public void setKsMobileStoreDetailPic(String ksMobileStoreDetailPic) {
        this.ksMobileStoreDetailPic = ksMobileStoreDetailPic;
    }

    public String getPddPlatformTransDataPic() {
        return pddPlatformTransDataPic;
    }

    public void setPddPlatformTransDataPic(String pddPlatformTransDataPic) {
        this.pddPlatformTransDataPic = pddPlatformTransDataPic;
    }

    public String getPddPlatformStoreInfoPic() {
        return pddPlatformStoreInfoPic;
    }

    public void setPddPlatformStoreInfoPic(String pddPlatformStoreInfoPic) {
        this.pddPlatformStoreInfoPic = pddPlatformStoreInfoPic;
    }

    public String getPddPlatformBusiEntPic() {
        return pddPlatformBusiEntPic;
    }

    public void setPddPlatformBusiEntPic(String pddPlatformBusiEntPic) {
        this.pddPlatformBusiEntPic = pddPlatformBusiEntPic;
    }

    public String getPddPlatformOrderDetailPic() {
        return pddPlatformOrderDetailPic;
    }

    public void setPddPlatformOrderDetailPic(String pddPlatformOrderDetailPic) {
        this.pddPlatformOrderDetailPic = pddPlatformOrderDetailPic;
    }

    public String getPddPlatformFundFlowPic() {
        return pddPlatformFundFlowPic;
    }

    public void setPddPlatformFundFlowPic(String pddPlatformFundFlowPic) {
        this.pddPlatformFundFlowPic = pddPlatformFundFlowPic;
    }

    public String getPddMobileStoreShowcasePic() {
        return pddMobileStoreShowcasePic;
    }

    public void setPddMobileStoreShowcasePic(String pddMobileStoreShowcasePic) {
        this.pddMobileStoreShowcasePic = pddMobileStoreShowcasePic;
    }

    public String getPddMobileBusiQualificationPic() {
        return pddMobileBusiQualificationPic;
    }

    public void setPddMobileBusiQualificationPic(String pddMobileBusiQualificationPic) {
        this.pddMobileBusiQualificationPic = pddMobileBusiQualificationPic;
    }

    public String getPddMobileStoreDetailPic() {
        return pddMobileStoreDetailPic;
    }

    public void setPddMobileStoreDetailPic(String pddMobileStoreDetailPic) {
        this.pddMobileStoreDetailPic = pddMobileStoreDetailPic;
    }

    public String getXhsPlatformTransDataPic() {
        return xhsPlatformTransDataPic;
    }

    public void setXhsPlatformTransDataPic(String xhsPlatformTransDataPic) {
        this.xhsPlatformTransDataPic = xhsPlatformTransDataPic;
    }

    public String getXhsPlatformStoreInfoPic() {
        return xhsPlatformStoreInfoPic;
    }

    public void setXhsPlatformStoreInfoPic(String xhsPlatformStoreInfoPic) {
        this.xhsPlatformStoreInfoPic = xhsPlatformStoreInfoPic;
    }

    public String getXhsPlatformBusiEntPic() {
        return xhsPlatformBusiEntPic;
    }

    public void setXhsPlatformBusiEntPic(String xhsPlatformBusiEntPic) {
        this.xhsPlatformBusiEntPic = xhsPlatformBusiEntPic;
    }

    public String getXhsPlatformOrderDetailPic() {
        return xhsPlatformOrderDetailPic;
    }

    public void setXhsPlatformOrderDetailPic(String xhsPlatformOrderDetailPic) {
        this.xhsPlatformOrderDetailPic = xhsPlatformOrderDetailPic;
    }

    public String getXhsPlatformFundFlowPic() {
        return xhsPlatformFundFlowPic;
    }

    public void setXhsPlatformFundFlowPic(String xhsPlatformFundFlowPic) {
        this.xhsPlatformFundFlowPic = xhsPlatformFundFlowPic;
    }

    public String getXhsMobileStoreShowcasePic() {
        return xhsMobileStoreShowcasePic;
    }

    public void setXhsMobileStoreShowcasePic(String xhsMobileStoreShowcasePic) {
        this.xhsMobileStoreShowcasePic = xhsMobileStoreShowcasePic;
    }

    public String getXhsMobileBusiQualificationPic() {
        return xhsMobileBusiQualificationPic;
    }

    public void setXhsMobileBusiQualificationPic(String xhsMobileBusiQualificationPic) {
        this.xhsMobileBusiQualificationPic = xhsMobileBusiQualificationPic;
    }

    public String getXhsMobileStoreDetailPic() {
        return xhsMobileStoreDetailPic;
    }

    public void setXhsMobileStoreDetailPic(String xhsMobileStoreDetailPic) {
        this.xhsMobileStoreDetailPic = xhsMobileStoreDetailPic;
    }

    public String getWxsphPlatformTransDataPic() {
        return wxsphPlatformTransDataPic;
    }

    public void setWxsphPlatformTransDataPic(String wxsphPlatformTransDataPic) {
        this.wxsphPlatformTransDataPic = wxsphPlatformTransDataPic;
    }

    public String getWxsphPlatformStoreInfoPic() {
        return wxsphPlatformStoreInfoPic;
    }

    public void setWxsphPlatformStoreInfoPic(String wxsphPlatformStoreInfoPic) {
        this.wxsphPlatformStoreInfoPic = wxsphPlatformStoreInfoPic;
    }

    public String getWxsphPlatformBusiEntPic() {
        return wxsphPlatformBusiEntPic;
    }

    public void setWxsphPlatformBusiEntPic(String wxsphPlatformBusiEntPic) {
        this.wxsphPlatformBusiEntPic = wxsphPlatformBusiEntPic;
    }

    public String getWxsphPlatformOrderDetailPic() {
        return wxsphPlatformOrderDetailPic;
    }

    public void setWxsphPlatformOrderDetailPic(String wxsphPlatformOrderDetailPic) {
        this.wxsphPlatformOrderDetailPic = wxsphPlatformOrderDetailPic;
    }

    public String getWxsphPlatformFundFlowPic() {
        return wxsphPlatformFundFlowPic;
    }

    public void setWxsphPlatformFundFlowPic(String wxsphPlatformFundFlowPic) {
        this.wxsphPlatformFundFlowPic = wxsphPlatformFundFlowPic;
    }

    public String getWxsphMobileStoreShowcasePic() {
        return wxsphMobileStoreShowcasePic;
    }

    public void setWxsphMobileStoreShowcasePic(String wxsphMobileStoreShowcasePic) {
        this.wxsphMobileStoreShowcasePic = wxsphMobileStoreShowcasePic;
    }

    public String getWxsphMobileBusiQualificationPic() {
        return wxsphMobileBusiQualificationPic;
    }

    public void setWxsphMobileBusiQualificationPic(String wxsphMobileBusiQualificationPic) {
        this.wxsphMobileBusiQualificationPic = wxsphMobileBusiQualificationPic;
    }

    public String getWxsphMobileStoreDetailPic() {
        return wxsphMobileStoreDetailPic;
    }

    public void setWxsphMobileStoreDetailPic(String wxsphMobileStoreDetailPic) {
        this.wxsphMobileStoreDetailPic = wxsphMobileStoreDetailPic;
    }

    public String getJdPlatformTransDataPic() {
        return jdPlatformTransDataPic;
    }

    public void setJdPlatformTransDataPic(String jdPlatformTransDataPic) {
        this.jdPlatformTransDataPic = jdPlatformTransDataPic;
    }

    public String getJdPlatformStoreInfoPic() {
        return jdPlatformStoreInfoPic;
    }

    public void setJdPlatformStoreInfoPic(String jdPlatformStoreInfoPic) {
        this.jdPlatformStoreInfoPic = jdPlatformStoreInfoPic;
    }

    public String getJdPlatformBusiEntPic() {
        return jdPlatformBusiEntPic;
    }

    public void setJdPlatformBusiEntPic(String jdPlatformBusiEntPic) {
        this.jdPlatformBusiEntPic = jdPlatformBusiEntPic;
    }

    public String getJdPlatformOrderDetailPic() {
        return jdPlatformOrderDetailPic;
    }

    public void setJdPlatformOrderDetailPic(String jdPlatformOrderDetailPic) {
        this.jdPlatformOrderDetailPic = jdPlatformOrderDetailPic;
    }

    public String getJdPlatformFundFlowPic() {
        return jdPlatformFundFlowPic;
    }

    public void setJdPlatformFundFlowPic(String jdPlatformFundFlowPic) {
        this.jdPlatformFundFlowPic = jdPlatformFundFlowPic;
    }

    public String getJdMobileStoreShowcasePic() {
        return jdMobileStoreShowcasePic;
    }

    public void setJdMobileStoreShowcasePic(String jdMobileStoreShowcasePic) {
        this.jdMobileStoreShowcasePic = jdMobileStoreShowcasePic;
    }

    public String getJdMobileBusiQualificationPic() {
        return jdMobileBusiQualificationPic;
    }

    public void setJdMobileBusiQualificationPic(String jdMobileBusiQualificationPic) {
        this.jdMobileBusiQualificationPic = jdMobileBusiQualificationPic;
    }

    public String getJdMobileStoreDetailPic() {
        return jdMobileStoreDetailPic;
    }

    public void setJdMobileStoreDetailPic(String jdMobileStoreDetailPic) {
        this.jdMobileStoreDetailPic = jdMobileStoreDetailPic;
    }

    public String getDwPlatformTransDataPic() {
        return dwPlatformTransDataPic;
    }

    public void setDwPlatformTransDataPic(String dwPlatformTransDataPic) {
        this.dwPlatformTransDataPic = dwPlatformTransDataPic;
    }

    public String getDwPlatformStoreInfoPic() {
        return dwPlatformStoreInfoPic;
    }

    public void setDwPlatformStoreInfoPic(String dwPlatformStoreInfoPic) {
        this.dwPlatformStoreInfoPic = dwPlatformStoreInfoPic;
    }

    public String getDwPlatformBusiEntPic() {
        return dwPlatformBusiEntPic;
    }

    public void setDwPlatformBusiEntPic(String dwPlatformBusiEntPic) {
        this.dwPlatformBusiEntPic = dwPlatformBusiEntPic;
    }

    public String getDwPlatformOrderDetailPic() {
        return dwPlatformOrderDetailPic;
    }

    public void setDwPlatformOrderDetailPic(String dwPlatformOrderDetailPic) {
        this.dwPlatformOrderDetailPic = dwPlatformOrderDetailPic;
    }

    public String getDwPlatformFundFlowPic() {
        return dwPlatformFundFlowPic;
    }

    public void setDwPlatformFundFlowPic(String dwPlatformFundFlowPic) {
        this.dwPlatformFundFlowPic = dwPlatformFundFlowPic;
    }

    public String getDwMobileStoreShowcasePic() {
        return dwMobileStoreShowcasePic;
    }

    public void setDwMobileStoreShowcasePic(String dwMobileStoreShowcasePic) {
        this.dwMobileStoreShowcasePic = dwMobileStoreShowcasePic;
    }

    public String getDwMobileBusiQualificationPic() {
        return dwMobileBusiQualificationPic;
    }

    public void setDwMobileBusiQualificationPic(String dwMobileBusiQualificationPic) {
        this.dwMobileBusiQualificationPic = dwMobileBusiQualificationPic;
    }

    public String getDwMobileStoreDetailPic() {
        return dwMobileStoreDetailPic;
    }

    public void setDwMobileStoreDetailPic(String dwMobileStoreDetailPic) {
        this.dwMobileStoreDetailPic = dwMobileStoreDetailPic;
    }

    public String getMtPlatformTransDataPic() {
        return mtPlatformTransDataPic;
    }

    public void setMtPlatformTransDataPic(String mtPlatformTransDataPic) {
        this.mtPlatformTransDataPic = mtPlatformTransDataPic;
    }

    public String getMtPlatformStoreInfoPic() {
        return mtPlatformStoreInfoPic;
    }

    public void setMtPlatformStoreInfoPic(String mtPlatformStoreInfoPic) {
        this.mtPlatformStoreInfoPic = mtPlatformStoreInfoPic;
    }

    public String getMtPlatformBusiEntPic() {
        return mtPlatformBusiEntPic;
    }

    public void setMtPlatformBusiEntPic(String mtPlatformBusiEntPic) {
        this.mtPlatformBusiEntPic = mtPlatformBusiEntPic;
    }

    public String getMtPlatformOrderDetailPic() {
        return mtPlatformOrderDetailPic;
    }

    public void setMtPlatformOrderDetailPic(String mtPlatformOrderDetailPic) {
        this.mtPlatformOrderDetailPic = mtPlatformOrderDetailPic;
    }

    public String getMtPlatformFundFlowPic() {
        return mtPlatformFundFlowPic;
    }

    public void setMtPlatformFundFlowPic(String mtPlatformFundFlowPic) {
        this.mtPlatformFundFlowPic = mtPlatformFundFlowPic;
    }

    public String getMtMobileStoreShowcasePic() {
        return mtMobileStoreShowcasePic;
    }

    public void setMtMobileStoreShowcasePic(String mtMobileStoreShowcasePic) {
        this.mtMobileStoreShowcasePic = mtMobileStoreShowcasePic;
    }

    public String getMtMobileBusiQualificationPic() {
        return mtMobileBusiQualificationPic;
    }

    public void setMtMobileBusiQualificationPic(String mtMobileBusiQualificationPic) {
        this.mtMobileBusiQualificationPic = mtMobileBusiQualificationPic;
    }

    public String getMtMobileStoreDetailPic() {
        return mtMobileStoreDetailPic;
    }

    public void setMtMobileStoreDetailPic(String mtMobileStoreDetailPic) {
        this.mtMobileStoreDetailPic = mtMobileStoreDetailPic;
    }

    public String getWphPlatformTransDataPic() {
        return wphPlatformTransDataPic;
    }

    public void setWphPlatformTransDataPic(String wphPlatformTransDataPic) {
        this.wphPlatformTransDataPic = wphPlatformTransDataPic;
    }

    public String getWphPlatformStoreInfoPic() {
        return wphPlatformStoreInfoPic;
    }

    public void setWphPlatformStoreInfoPic(String wphPlatformStoreInfoPic) {
        this.wphPlatformStoreInfoPic = wphPlatformStoreInfoPic;
    }

    public String getWphPlatformBusiEntPic() {
        return wphPlatformBusiEntPic;
    }

    public void setWphPlatformBusiEntPic(String wphPlatformBusiEntPic) {
        this.wphPlatformBusiEntPic = wphPlatformBusiEntPic;
    }

    public String getWphPlatformOrderDetailPic() {
        return wphPlatformOrderDetailPic;
    }

    public void setWphPlatformOrderDetailPic(String wphPlatformOrderDetailPic) {
        this.wphPlatformOrderDetailPic = wphPlatformOrderDetailPic;
    }

    public String getWphPlatformFundFlowPic() {
        return wphPlatformFundFlowPic;
    }

    public void setWphPlatformFundFlowPic(String wphPlatformFundFlowPic) {
        this.wphPlatformFundFlowPic = wphPlatformFundFlowPic;
    }

    public String getWphMobileStoreShowcasePic() {
        return wphMobileStoreShowcasePic;
    }

    public void setWphMobileStoreShowcasePic(String wphMobileStoreShowcasePic) {
        this.wphMobileStoreShowcasePic = wphMobileStoreShowcasePic;
    }

    public String getWphMobileBusiQualificationPic() {
        return wphMobileBusiQualificationPic;
    }

    public void setWphMobileBusiQualificationPic(String wphMobileBusiQualificationPic) {
        this.wphMobileBusiQualificationPic = wphMobileBusiQualificationPic;
    }

    public String getWphMobileStoreDetailPic() {
        return wphMobileStoreDetailPic;
    }

    public void setWphMobileStoreDetailPic(String wphMobileStoreDetailPic) {
        this.wphMobileStoreDetailPic = wphMobileStoreDetailPic;
    }

}
