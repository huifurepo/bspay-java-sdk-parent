package com.huifu.bspay.sdk.opps.core.enums;

/**
 * @Description: 函数代码枚举
 * @Author: sdk-generator
 */
public enum FunctionCodeEnum {
    /**
     * 支付分扣款
     */
    V2_TRADE_PAYSCORE_PAY_PAYSCOREPAY("v2.trade.payscore.pay.payscorepay", "支付分扣款"),
    /**
     * 完结支付分订单
     */
    V2_TRADE_PAYSCORE_SERVICEORDER_COMPLETE("v2.trade.payscore.serviceorder.complete", "完结支付分订单"),
    /**
     * 取消支付分订单
     */
    V2_TRADE_PAYSCORE_SERVICEORDER_CANCEL("v2.trade.payscore.serviceorder.cancel", "取消支付分订单"),
    /**
     * 登记扣款信息
     */
    V2_TRADE_PAYSCORE_DEDUCT_REGITSTER("v2.trade.payscore.deduct.regitster", "登记扣款信息"),
    /**
     * 查询扣款信息
     */
    V2_TRADE_PAYSCORE_DEDUCT_QUERY("v2.trade.payscore.deduct.query", "查询扣款信息"),
    /**
     * 查询支付分订单
     */
    V2_TRADE_PAYSCORE_SERVICEORDER_QUERY("v2.trade.payscore.serviceorder.query", "查询支付分订单"),
    /**
     * 创建支付分订单
     */
    V2_TRADE_PAYSCORE_SERVICEORDER_CREATE("v2.trade.payscore.serviceorder.create", "创建支付分订单"),
    /**
     * 交易确认退款查询
     */
    V2_TRADE_PAYMENT_DELAYTRANS_CONFIRMREFUNDQUERY("v2.trade.payment.delaytrans.confirmrefundquery", "交易确认退款查询"),
    /**
     * 代扣绑卡页面版
     */
    V2_QUICKBUCKLE_WITHHOLD_PAGE_GET("v2.quickbuckle.withhold.page.get", "代扣绑卡页面版"),
    /**
     * 统一进件页面版查询
     */
    V2_MERCHANT_BUSI_STATUS_QUERY("v2.merchant.busi.status.query", "统一进件页面版查询"),
    /**
     * 银行列表查询
     */
    V2_QUICKBUCKLE_BANK_QUERY("v2.quickbuckle.bank.query", "银行列表查询"),
    /**
     * 商户短信发送
     */
    V2_MERCHANT_BASICDATA_SMS_SEND("v2.merchant.basicdata.sms.send", "商户短信发送"),
    /**
     * 批量出金交易查询
     */
    V2_TRADE_BATCHTRANSLOG_QUERY("v2.trade.batchtranslog.query", "批量出金交易查询"),
    /**
     * 快捷支付页面版接口
     */
    V2_TRADE_ONLINEPAYMENT_QUICKPAY_FRONTPAY("v2.trade.onlinepayment.quickpay.frontpay", "快捷支付页面版接口"),
    /**
     * 快捷支付短信预校验
     */
    V2_TRADE_ONLINEPAYMENT_QUICKPAY_SMSCHECK("v2.trade.onlinepayment.quickpay.smscheck", "快捷支付短信预校验"),
    /**
     * 跳转电子小票页面
     */
    V2_TRADE_ELECTRON_RECEIPTS_JUMPINFO("v2.trade.electron.receipts.jumpinfo", "跳转电子小票页面"),
    /**
     * 图片上传
     */
    V2_TRADE_ELECTRON_RECEIPTS_PICTURE_UPLOAD("v2.trade.electron.receipts.picture.upload", "图片上传"),
    /**
     * 上传电子小票图片
     */
    V2_TRADE_ELECTRON_RECEIPTS_UPLOAD("v2.trade.electron.receipts.upload", "上传电子小票图片"),
    /**
     * 查询小票自定义入口
     */
    V2_TRADE_ELECTRON_RECEIPTS_CUSTOMENTRANCES_QUERY("v2.trade.electron.receipts.customentrances.query", "查询小票自定义入口"),
    /**
     * 创建修改小票自定义入口
     */
    V2_TRADE_ELECTRON_RECEIPTS_CUSTOMENTRANCES_CREATE("v2.trade.electron.receipts.customentrances.create", "创建修改小票自定义入口"),
    /**
     * 代扣支付
     */
    V2_TRADE_ONLINEPAYMENT_WITHHOLDPAY("v2.trade.onlinepayment.withholdpay", "代扣支付"),
    /**
     * 代扣绑卡申请
     */
    V2_QUICKBUCKLE_WITHHOLD_APPLY("v2.quickbuckle.withhold.apply", "代扣绑卡申请"),
    /**
     * 代扣绑卡查询
     */
    V2_QUICKBUCKLE_WITHHOLD_QUERY("v2.quickbuckle.withhold.query", "代扣绑卡查询"),
    /**
     * 汇付入账确认
     */
    V2_TRADE_ONLINEPAYMENT_TRANSFER_REMITTANCE("v2.trade.onlinepayment.transfer.remittance", "汇付入账确认"),
    /**
     * 汇付入账查询
     */
    V2_TRADE_ONLINEPAYMENT_TRANSFER_REMITTANCEORDER("v2.trade.onlinepayment.transfer.remittanceorder", "汇付入账查询"),
    /**
     * 一键绑卡
     */
    V2_QUICKBUCKLE_ONEKEY_CARDBIND("v2.quickbuckle.onekey.cardbind", "一键绑卡"),
    /**
     * DM取现额度查询
     */
    V2_TRADE_SETTLEMENT_ENCHASHMENT_DMAMT_QUERY("v2.trade.settlement.enchashment.dmamt.query", "DM取现额度查询"),
    /**
     * 子账户开通配置(2022)
     */
    V2_MERCHANT_SETTLE_CONFIG("v2.merchant.settle.config", "子账户开通配置(2022)"),
    /**
     * 修改子账户配置(2022)
     */
    V2_MERCHANT_SETTLE_MODIFY("v2.merchant.settle.modify", "修改子账户配置(2022)"),
    /**
     * 批量交易状态查询
     */
    V2_TRADE_TRANSSTAT_QUERY("v2.trade.transstat.query", "批量交易状态查询"),
    /**
     * 网银支付接口
     */
    V2_TRADE_ONLINEPAYMENT_BANKING_FRONTPAY("v2.trade.onlinepayment.banking.frontpay", "网银支付接口"),
    /**
     * 微信支付宝预授权完成撤销
     */
    V2_TRADE_PAYMENT_PREAUTHPAYCANCEL_REFUND("v2.trade.payment.preauthpaycancel.refund", "微信支付宝预授权完成撤销"),
    /**
     * 微信支付宝预授权完成
     */
    V2_TRADE_PREAUTHPAY("v2.trade.preauthpay", "微信支付宝预授权完成"),
    /**
     * 微信支付宝预授权撤销
     */
    V2_TRADE_PAYMENT_PREAUTHCANCEL_REFUND("v2.trade.payment.preauthcancel.refund", "微信支付宝预授权撤销"),
    /**
     * 微信支付宝预授权
     */
    V2_TRADE_PREAUTH("v2.trade.preauth", "微信支付宝预授权"),
    /**
     * 支付宝申诉提交凭证
     */
    V2_MERCHANT_COMPLAINT_SUBMIT_CERTIFICATES("v2.merchant.complaint.submit.certificates", "支付宝申诉提交凭证"),
    /**
     * 支付宝申诉查询
     */
    V2_MERCHANT_COMPLAINT_QUERY_STATUS("v2.merchant.complaint.query.status", "支付宝申诉查询"),
    /**
     * 支付宝申诉请求凭证
     */
    V2_MERCHANT_COMPLAINT_REQUEST_CERTIFICATES("v2.merchant.complaint.request.certificates", "支付宝申诉请求凭证"),
    /**
     * 支付宝投诉查询
     */
    V2_MERCHANT_COMPLAINT_ALI_RISKINFO_QUERY("v2.merchant.complaint.ali.riskinfo.query", "支付宝投诉查询"),
    /**
     * 查询投诉协商历史
     */
    V2_MERCHANT_COMPLAINT_HISTORY_QUERY("v2.merchant.complaint.history.query", "查询投诉协商历史"),
    /**
     * 查询投诉单列表及详情
     */
    V2_MERCHANT_COMPLAINT_LIST_INFO_QUERY("v2.merchant.complaint.list.info.query", "查询投诉单列表及详情"),
    /**
     * 投诉图片下载
     */
    V2_MERCHANT_COMPLAINT_DOWNLOAD_PICTURE("v2.merchant.complaint.download.picture", "投诉图片下载"),
    /**
     * 更新退款审批结果
     */
    V2_MERCHANT_COMPLAINT_UPDATE_REFUNDPROGRESS("v2.merchant.complaint.update.refundprogress", "更新退款审批结果"),
    /**
     * 回复用户
     */
    V2_MERCHANT_COMPLAINT_REPLY("v2.merchant.complaint.reply", "回复用户"),
    /**
     * 反馈处理完成
     */
    V2_MERCHANT_COMPLAINT_COMPLETE("v2.merchant.complaint.complete", "反馈处理完成"),
    /**
     * 商户统一进件（页面版）
     */
    V2_MERCHANT_URL_FORWARD("v2.merchant.url.forward", "商户统一进件（页面版）"),
    /**
     * 商户微信支付宝ID查询
     */
    V2_MERCHANT_BUSI_MERCODE_QUERY("v2.merchant.busi.mercode.query", "商户微信支付宝ID查询"),
    /**
     * 银行转账资金流水查询
     */
    V2_TRADE_ONLINEPAYMENT_TRANSFER_ACCOUNT_QUERY("v2.trade.onlinepayment.transfer.account.query", "银行转账资金流水查询"),
    /**
     * 银行大额转账关单
     */
    V2_TRADE_ONLINEPAYMENT_TRANSFER_ACCOUNT_CLOSE("v2.trade.onlinepayment.transfer.account.close", "银行大额转账关单"),
    /**
     * 银行大额转账
     */
    V2_TRADE_ONLINEPAYMENT_TRANSFER_ACCOUNT("v2.trade.onlinepayment.transfer.account", "银行大额转账"),
    /**
     * 银行卡代发
     */
    V2_TRADE_SETTLEMENT_SURROGATE("v2.trade.settlement.surrogate", "银行卡代发"),
    /**
     * 微信代发查询
     */
    V2_TRADE_TRANS_WXSURROGATE_QUERY("v2.trade.trans.wxsurrogate.query", "微信代发查询"),
    /**
     * 微信代发
     */
    V2_TRADE_TRANS_WX_SURROGATE("v2.trade.trans.wx.surrogate", "微信代发"),
    /**
     * 商户状态变更
     */
    V2_MERCHANT_BUSI_MODIFY_BUSISTATUS("v2.merchant.busi.modify.busistatus", "商户状态变更"),
    /**
     * 服务商终端列表查询
     */
    V2_TERMINALDEVICE_MANAGE_QUERY("v2.terminaldevice.manage.query", "服务商终端列表查询"),
    /**
     * 终端解绑
     */
    V2_TERMINALDEVICE_MANAGE_UNBIND("v2.terminaldevice.manage.unbind", "终端解绑"),
    /**
     * 终端绑定
     */
    V2_TERMINALDEVICE_MANAGE_BIND("v2.terminaldevice.manage.bind", "终端绑定"),
    /**
     * 手续费试算
     */
    V2_TRADE_FEECALC("v2.trade.feecalc", "手续费试算"),
    /**
     * 支付宝实名申请提交
     */
    V2_MERCHANT_BUSI_ALI_REALNAME_APPLY("v2.merchant.busi.ali.realname.apply", "支付宝实名申请提交"),
    /**
     * 支付宝实名申请单查询
     */
    V2_MERCHANT_BUSI_ALI_REALNAME_QUERY("v2.merchant.busi.ali.realname.query", "支付宝实名申请单查询"),
    /**
     * 图片上传
     */
    V2_SUPPLEMENTARY_PICTURE("v2.supplementary.picture", "图片上传"),
    /**
     * 用户业务入驻修改
     */
    V2_USER_BUSI_MODIFY("v2.user.busi.modify", "用户业务入驻修改"),
    /**
     * 用户业务入驻
     */
    V2_USER_BUSI_OPEN("v2.user.busi.open", "用户业务入驻"),
    /**
     * 用户信息查询
     */
    V2_USER_BASICDATA_QUERY("v2.user.basicdata.query", "用户信息查询"),
    /**
     * 企业用户基本信息开户
     */
    V2_USER_BASICDATA_ENT("v2.user.basicdata.ent", "企业用户基本信息开户"),
    /**
     * 企业用户基本信息修改
     */
    V2_USER_BASICDATA_ENT_MODIFY("v2.user.basicdata.ent.modify", "企业用户基本信息修改"),
    /**
     * 个人用户基本信息开户
     */
    V2_USER_BASICDATA_INDV("v2.user.basicdata.indv", "个人用户基本信息开户"),
    /**
     * 个人用户基本信息修改
     */
    V2_USER_BASICDATA_INDV_MODIFY("v2.user.basicdata.indv.modify", "个人用户基本信息修改"),
    /**
     * 快捷支付页面版接口
     */
    V2_TRADE_ONLINEPAYMENT_QUICKPAY_PAGEINFO("v2.trade.onlinepayment.quickpay.pageinfo", "快捷支付页面版接口"),
    /**
     * 直付通分账关系查询
     */
    V2_MERCHANT_DIRECT_ZFT_RECEIVER_QUERY("v2.merchant.direct.zft.receiver.query", "直付通分账关系查询"),
    /**
     * 直付通分账关系绑定解绑
     */
    V2_MERCHANT_DIRECT_ZFT_RECEIVER_CONFIG("v2.merchant.direct.zft.receiver.config", "直付通分账关系绑定解绑"),
    /**
     * 终端自助申请单创建
     */
    V2_TERMINALDEVICE_ORDER_CREATE("v2.terminaldevice.order.create", "终端自助申请单创建"),
    /**
     * 终端申请列表查询
     */
    V2_TERMINALDEVICE_ORDER_QUERY("v2.terminaldevice.order.query", "终端申请列表查询"),
    /**
     * 终端申请订单详情
     */
    V2_TERMINALDEVICE_ORDER_DETAIL("v2.terminaldevice.order.detail", "终端申请订单详情"),
    /**
     * 终端申请订单取消
     */
    V2_TERMINALDEVICE_ORDER_CANCEL("v2.terminaldevice.order.cancel", "终端申请订单取消"),
    /**
     * 查询商户或渠道商销售策略
     */
    V2_TERMINALDEVICE_ORDER_SALESSTRATEGY("v2.terminaldevice.order.salesstrategy", "查询商户或渠道商销售策略"),
    /**
     * 注销终端
     */
    V2_TERMINALDEVICE_DEVICEINFO_CANCEL("v2.terminaldevice.deviceInfo.cancel", "注销终端"),
    /**
     * 新增终端报备
     */
    V2_TERMINALDEVICE_DEVICEINFO_ADD("v2.terminaldevice.deviceInfo.add", "新增终端报备"),
    /**
     * 绑定终端信息查询
     */
    V2_TERMINALDEVICE_DEVICEINFO_QUERY("v2.terminaldevice.deviceInfo.query", "绑定终端信息查询"),
    /**
     * 银联活动商户信息查询
     */
    V2_MERCHANT_ACTIVITY_UNIONPAY_MERBASEINFO_QUERY("v2.merchant.activity.unionpay.merbaseInfo.query", "银联活动商户信息查询"),
    /**
     * 银联活动商户入驻状态查询
     */
    V2_MERCHANT_ACTIVITY_UNIONPAY_REGISTE_STATUS_QUERY("v2.merchant.activity.unionpay.registe.status.query", "银联活动商户入驻状态查询"),
    /**
     * 银联活动商户入驻
     */
    V2_MERCHANT_ACTIVITY_UNIONPAY_MERBASEINFO_APPLY("v2.merchant.activity.unionpay.merbaseInfo.apply", "银联活动商户入驻"),
    /**
     * 银联活动列表查询
     */
    V2_MERCHANT_ACTIVITY_UNIONPAY_QUERY("v2.merchant.activity.unionpay.query", "银联活动列表查询"),
    /**
     * 银联活动报名进度查询
     */
    V2_MERCHANT_ACTIVITY_UNIONPAY_SIGN_STATUS("v2.merchant.activity.unionpay.sign.status", "银联活动报名进度查询"),
    /**
     * 银联活动报名
     */
    V2_MERCHANT_ACTIVITY_UNIONPAY_SIGN("v2.merchant.activity.unionpay.sign", "银联活动报名"),
    /**
     * 线上交易退款查询
     */
    V2_TRADE_ONLINEPAYMENT_REFUND_QUERY("v2.trade.onlinepayment.refund.query", "线上交易退款查询"),
    /**
     * 线上交易退款
     */
    V2_TRADE_ONLINEPAYMENT_REFUND("v2.trade.onlinepayment.refund", "线上交易退款"),
    /**
     * 线上交易查询
     */
    V2_TRADE_ONLINEPAYMENT_QUERY("v2.trade.onlinepayment.query", "线上交易查询"),
    /**
     * 网银支持银行列表查询
     */
    V2_TRADE_ONLINEPAYMENT_BANKPAY_BANKLIST("v2.trade.onlinepayment.bankpay.banklist", "网银支持银行列表查询"),
    /**
     * 网银支付
     */
    V2_TRADE_ONLINEPAYMENT_BANKPAY_PAGEINFO("v2.trade.onlinepayment.bankpay.pageinfo", "网银支付"),
    /**
     * 手机WAP支付
     */
    V2_TRADE_ONLINEPAYMENT_WAPPAY("v2.trade.onlinepayment.wappay", "手机WAP支付"),
    /**
     * 网银付款银行账户查询
     */
    V2_TRADE_ONLINEPAYMENT_BANKPAY_PAYERQUERY("v2.trade.onlinepayment.bankpay.payerquery", "网银付款银行账户查询"),
    /**
     * 微信用户标识查询接口
     */
    V2_TRADE_WXUSERMARK_QUERY("v2.trade.wxusermark.query", "微信用户标识查询接口"),
    /**
     * 银联统一在线收银台接口
     */
    V2_TRADE_ONLINEPAYMENT_UNIONPAY("v2.trade.onlinepayment.unionpay", "银联统一在线收银台接口"),
    /**
     * 获取银联用户标识接口
     */
    V2_TRADE_PAYMENT_USERMARK2_QUERY("v2.trade.payment.usermark2.query", "获取银联用户标识接口"),
    /**
     * 交易退款查询接口
     */
    V2_TRADE_PAYMENT_SCANPAY_REFUNDQUERY("v2.trade.payment.scanpay.refundquery", "交易退款查询接口"),
    /**
     * 扫码交易退款
     */
    V2_TRADE_PAYMENT_SCANPAY_REFUND("v2.trade.payment.scanpay.refund", "扫码交易退款"),
    /**
     * 交易关单接口
     */
    V2_TRADE_PAYMENT_SCANPAY_CLOSE("v2.trade.payment.scanpay.close", "交易关单接口"),
    /**
     * 交易查询接口
     */
    V2_TRADE_PAYMENT_SCANPAY_QUERY("v2.trade.payment.scanpay.query", "交易查询接口"),
    /**
     * 交易确认退款接口
     */
    V2_TRADE_PAYMENT_DELAYTRANS_CONFIRMREFUND("v2.trade.payment.delaytrans.confirmrefund", "交易确认退款接口"),
    /**
     * 交易确认查询接口
     */
    V2_TRADE_PAYMENT_DELAYTRANS_CONFIRMQUERY("v2.trade.payment.delaytrans.confirmquery", "交易确认查询接口"),
    /**
     * 交易确认接口
     */
    V2_TRADE_PAYMENT_DELAYTRANS_CONFIRM("v2.trade.payment.delaytrans.confirm", "交易确认接口"),
    /**
     * 交易关单查询接口
     */
    V2_TRADE_PAYMENT_SCANPAY_CLOSEQUERY("v2.trade.payment.scanpay.closequery", "交易关单查询接口"),
    /**
     * 聚合正扫接口
     */
    V2_TRADE_PAYMENT_JSPAY("v2.trade.payment.jspay", "聚合正扫接口"),
    /**
     * 聚合反扫接口
     */
    V2_TRADE_PAYMENT_MICROPAY("v2.trade.payment.micropay", "聚合反扫接口"),
    /**
     * 交易分账明细查询接口
     */
    V2_TRADE_TRANS_SPLIT_QUERY("v2.trade.trans.split.query", "交易分账明细查询接口"),
    /**
     * 电子回单查询
     */
    V2_TRADE_PAYMENT_GETELECTRONICRECEIPT("v2.trade.payment.getelectronicreceipt", "电子回单查询"),
    /**
     * 卡bin信息查询
     */
    V2_TRADE_CARDBIN_QUERY("v2.trade.cardbin.query", "卡bin信息查询"),
    /**
     * 余额支付
     */
    V2_TRADE_ACCTPAYMENT_PAY("v2.trade.acctpayment.pay", "余额支付"),
    /**
     * 余额支付退款查询
     */
    V2_TRADE_ACCTPAYMENT_REFUND_QUERY("v2.trade.acctpayment.refund.query", "余额支付退款查询"),
    /**
     * 余额支付退款
     */
    V2_TRADE_ACCTPAYMENT_REFUND("v2.trade.acctpayment.refund", "余额支付退款"),
    /**
     * 余额支付查询
     */
    V2_TRADE_ACCTPAYMENT_PAY_QUERY("v2.trade.acctpayment.pay.query", "余额支付查询"),
    /**
     * 账务流水查询
     */
    V2_TRADE_ACCTPAYMENT_ACCTLOG_QUERY("v2.trade.acctpayment.acctlog.query", "账务流水查询"),
    /**
     * 直付通商户入驻
     */
    V2_MERCHANT_DIRECT_ZFT_REG("v2.merchant.direct.zft.reg", "直付通商户入驻"),
    /**
     * 支付宝直连-查询申请状态
     */
    V2_MERCHANT_DIRECT_ALIPAY_APPLYORDERSTATUS_QUERY("v2.merchant.direct.alipay.applyorderstatus.query", "支付宝直连-查询申请状态"),
    /**
     * 支付宝直连-换取应用授权令牌
     */
    V2_MERCHANT_DIRECT_ALIPAY_APPAUTHTOKEN_EXCHANGE("v2.merchant.direct.alipay.appauthtoken.exchange", "支付宝直连-换取应用授权令牌"),
    /**
     * 支付宝直连-申请当面付代签约
     */
    V2_MERCHANT_DIRECT_ALIPAY_FACETOFACESIGN_APPLY("v2.merchant.direct.alipay.facetofacesign.apply", "支付宝直连-申请当面付代签约"),
    /**
     * 证书登记
     */
    V2_MERCHANT_DIRECT_CERTINFO_ADD("v2.merchant.direct.certinfo.add", "证书登记"),
    /**
     * 微信直连-修改微信结算帐号
     */
    V2_MERCHANT_DIRECT_WECHAT_SETTLEMENTINFO_MODIFY("v2.merchant.direct.wechat.settlementInfo.modify", "微信直连-修改微信结算帐号"),
    /**
     * 微信特约商户进件
     */
    V2_MERCHANT_DIRECT_WECHAT_SIGN("v2.merchant.direct.wechat.sign", "微信特约商户进件"),
    /**
     * 微信直连-微信关注配置查询
     */
    V2_MERCHANT_DIRECT_WECHAT_SUBSCRIBE_QUERY("v2.merchant.direct.wechat.subscribe.query", "微信直连-微信关注配置查询"),
    /**
     * 微信直连-微信关注配置
     */
    V2_MERCHANT_DIRECT_WECHAT_SUBSCRIBE_CONFIG("v2.merchant.direct.wechat.subscribe.config", "微信直连-微信关注配置"),
    /**
     * 查询微信申请状态
     */
    V2_MERCHANT_DIRECT_WECHAT_QUERY("v2.merchant.direct.wechat.query", "查询微信申请状态"),
    /**
     * 微信直连-查询微信结算账户
     */
    V2_MERCHANT_DIRECT_WECHAT_SETTLEMENTINFO_QUERY("v2.merchant.direct.wechat.settlementInfo.query", "微信直连-查询微信结算账户"),
    /**
     * 商户业务开通修改(2022)
     */
    V2_MERCHANT_BUSI_MODIFY("v2.merchant.busi.modify", "商户业务开通修改(2022)"),
    /**
     * 商户业务开通(2022)
     */
    V2_MERCHANT_BUSI_OPEN("v2.merchant.busi.open", "商户业务开通(2022)"),
    /**
     * 快捷支付申请
     */
    V2_TRADE_ONLINEPAYMENT_QUICKPAY_APPLY("v2.trade.onlinepayment.quickpay.apply", "快捷支付申请"),
    /**
     * 快捷支付确认
     */
    V2_TRADE_ONLINEPAYMENT_QUICKPAY_CONFIRM("v2.trade.onlinepayment.quickpay.confirm", "快捷支付确认"),
    /**
     * 新增快捷/代扣解绑接口
     */
    V2_QUICKBUCKLE_UNBIND("v2.quickbuckle.unbind", "新增快捷/代扣解绑接口"),
    /**
     * 更新花呗分期方案
     */
    V2_PCREDIT_SOLUTION_MODIFY("v2.pcredit.solution.modify", "更新花呗分期方案"),
    /**
     * 快捷绑卡申请接口
     */
    V2_QUICKBUCKLE_APPLY("v2.quickbuckle.apply", "快捷绑卡申请接口"),
    /**
     * 快捷绑卡确认接口
     */
    V2_QUICKBUCKLE_CONFIRM("v2.quickbuckle.confirm", "快捷绑卡确认接口"),
    /**
     * 账户余额信息查询接口
     */
    V2_TRADE_ACCTPAYMENT_BALANCE_QUERY("v2.trade.acctpayment.balance.query", "账户余额信息查询接口"),
    /**
     * 交易结算对账单配置查询
     */
    V2_MERCHANT_BUSI_BILL_QUERY("v2.merchant.busi.bill.query", "交易结算对账单配置查询"),
    /**
     * 交易结算对账文件配置
     */
    V2_MERCHANT_BUSI_BILL_CONFIG("v2.merchant.busi.bill.config", "交易结算对账文件配置"),
    /**
     * 交易结算对账单查询
     */
    V2_TRADE_CHECK_FILEQUERY("v2.trade.check.filequery", "交易结算对账单查询"),
    /**
     * 交易结算对账文件重新生成
     */
    V2_TRADE_CHECK_REPLAY("v2.trade.check.replay", "交易结算对账文件重新生成"),
    /**
     * 商户分期配置详情查询
     */
    V2_PCREDIT_FEE_DETAIL("v2.pcredit.fee.detail", "商户分期配置详情查询"),
    /**
     * 商户分期配置
     */
    V2_PCREDIT_FEE_CONFIG("v2.pcredit.fee.config", "商户分期配置"),
    /**
     * 银行卡分期支持银行查询
     */
    V2_TRADE_BANKINSTALLMENTINFO_QUERY("v2.trade.bankinstallmentinfo.query", "银行卡分期支持银行查询"),
    /**
     * 分期证书配置
     */
    V2_PCREDIT_CERTIFICATE_CONFIG("v2.pcredit.certificate.config", "分期证书配置"),
    /**
     * 花呗分期活动查询
     */
    V2_PCREDIT_SOLUTION_QUERY("v2.pcredit.solution.query", "花呗分期活动查询"),
    /**
     * 上架下架分期活动接口
     */
    V2_PCREDIT_STATUE_MODIFY("v2.pcredit.statue.modify", "上架下架分期活动接口"),
    /**
     * 花呗分期贴息查询
     */
    V2_PCREDIT_ORDER_QUERY("v2.pcredit.order.query", "花呗分期贴息查询"),
    /**
     * 创建花呗分期方案
     */
    V2_PCREDIT_SOLUTION_CREATE("v2.pcredit.solution.create", "创建花呗分期方案"),
    /**
     * 商户分账配置查询(2022)
     */
    V2_MERCHANT_SPLIT_QUERY("v2.merchant.split.query", "商户分账配置查询(2022)"),
    /**
     * 商户分账配置(2022)
     */
    V2_MERCHANT_SPLIT_CONFIG("v2.merchant.split.config", "商户分账配置(2022)"),
    /**
     * 支付宝小程序预下单接口
     */
    V2_TRADE_HOSTING_PAYMENT_PREORDER("v2.trade.hosting.payment.preorder", "支付宝小程序预下单接口"),
    /**
     * 微信实名认证状态查询
     */
    V2_MERCHANT_BUSI_REALNAME_QUERY("v2.merchant.busi.realname.query", "微信实名认证状态查询"),
    /**
     * 微信实名认证
     */
    V2_MERCHANT_BUSI_REALNAME("v2.merchant.busi.realname", "微信实名认证"),
    /**
     * 微信配置查询
     */
    V2_MERCHANT_BUSI_CONFIG_QUERY("v2.merchant.busi.config.query", "微信配置查询"),
    /**
     * 微信商户配置
     */
    V2_MERCHANT_BUSI_CONFIG("v2.merchant.busi.config", "微信商户配置"),
    /**
     * 申请单状态查询
     */
    V2_MERCHANT_BASICDATA_STATUS_QUERY("v2.merchant.basicdata.status.query", "申请单状态查询"),
    /**
     * 商户详细信息查询(2022)
     */
    V2_MERCHANT_BASICDATA_QUERY("v2.merchant.basicdata.query", "商户详细信息查询(2022)"),
    /**
     * 商户基本信息修改(2022)
     */
    V2_MERCHANT_BASICDATA_MODIFY("v2.merchant.basicdata.modify", "商户基本信息修改(2022)"),
    /**
     * 商户活动报名查询
     */
    V2_MERCHANT_ACTIVITY_QUERY("v2.merchant.activity.query", "商户活动报名查询"),
    /**
     * 商户活动报名
     */
    V2_MERCHANT_ACTIVITY_ADD("v2.merchant.activity.add", "商户活动报名"),
    /**
     * 企业商户基本信息入驻(2022)
     */
    V2_MERCHANT_BASICDATA_ENT("v2.merchant.basicdata.ent", "企业商户基本信息入驻(2022)"),
    /**
     * 个人商户基本信息入驻(2022)
     */
    V2_MERCHANT_BASICDATA_INDV("v2.merchant.basicdata.indv", "个人商户基本信息入驻(2022)"),
    /**
     * 微信支付宝入驻信息修改
     */
    V2_MERCHANT_BUSI_AT_MODIFY("v2.merchant.busi.at.modify", "微信支付宝入驻信息修改"),
    /**
     * 取现接口
     */
    V2_TRADE_SETTLEMENT_ENCHASHMENT("v2.trade.settlement.enchashment", "取现接口"),
    /**
     * 结算记录查询
     */
    V2_MERCHANT_BASICDATA_SETTLEMENT_QUERY("v2.merchant.basicdata.settlement.query", "结算记录查询"),
    /**
     * 出金交易查询接口
     */
    V2_TRADE_SETTLEMENT_QUERY("v2.trade.settlement.query", "出金交易查询接口"),
    /**
     * 商户统一进件接口(2022)
     */
    V2_MERCHANT_INTEGRATE_REG("v2.merchant.integrate.reg", "商户统一进件接口(2022)"),
    /**
     * 商户统一变更接口(2022)
     */
    V2_MERCHANT_INTEGRATE_UPDATE("v2.merchant.integrate.update", "商户统一变更接口(2022)"),
    ;

    private final String code;

    private final String name;

    FunctionCodeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
