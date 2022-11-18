/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
package com.huifu.bspay.sdk.opps.core.exception;

/**
 * @author kefeng.zheng
 * @version v 0.1
 */
public enum FailureCode {
    REQUEST_PARAMETER_ERROR("request_parameter_error", "请求参数错误"),
    SYSTEM_EXCEPTION("system_exception", "系统异常"),
    CONFIG_EXCEPTION("config_exception", "配置错误"),
    SECURITY_EXCEPTION("security_exception", "签名错误"),
    CHARGE_ID_NOT_EXISTS("charge_id_not_exists", "对应支付记录不存在"),
    REQUEST_ORDER_NO_REPEATE("request_order_no_repeate", "请求订单号重复"),
    CHANNEL_ERROR("channel_error", "通道异常"),
    CHANNEL_RESPONSE_CODE_ERROR("channel_response_code_fail", "支付渠道响应码错误"),
	
	SOCKET_TIME_EXCEPTION("socket_timeout_exception", "SocketTimeoutException"),
	
	CONNECT_EXCEPTION("connect_exception", "ConnectException"),
	
	POST_REQUEST_FALI("post_request_fail", "POST请求失败"),
	
	POST_REQUEST_FALI_NULL("post_reponse_null", "POST请求返回结果为空");


    private String failureCode;
    private String failureMsg;

    private FailureCode(String failureCode, String failureMsg) {
        this.failureCode = failureCode;
        this.failureMsg = failureMsg;
    }

    public String getFailureCode() {
        return this.failureCode;
    }

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    public String getFailureMsg() {
        return this.failureMsg;
    }

    public void setFailureMsg(String failureMsg) {
        this.failureMsg = failureMsg;
    }
}
