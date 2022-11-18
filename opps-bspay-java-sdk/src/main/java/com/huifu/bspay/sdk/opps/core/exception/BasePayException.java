/**
 * 汇付天下有限公司
 * Copyright (c) 2006-2021 ChinaPnR,Inc.All Rights Reserved.
 */
package com.huifu.bspay.sdk.opps.core.exception;

/**
 * @Description: 基础的异常类
 * @author: xianlong.shen
 * @date:2021年6月24日下午6:01:07
 * @version V1.0 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class BasePayException extends Exception {
	private static final long serialVersionUID = 4159911175795169063L;
	private String code;
	private String message;

	public BasePayException(String message) {
		this.message = message;
	}

	public BasePayException(String code, String message) {
		this.message = message;
		this.code = code;
	}

	public BasePayException(FailureCode codes) {
		this.message = codes.getFailureMsg();
		this.code = codes.getFailureCode();
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	public String getCode() {
		return this.code;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("BasePayException{");
		sb.append("message='").append(this.message).append('\'');
		sb.append(", code='").append(this.code).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
