package com.yht.exception;

/**
 * 自定义异常类
 * @author 22134
 *
 */
public class SysException extends Exception {
	//储存提示信息
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public SysException(String message) {
		super();
		this.message = message;
	}
}
