package com.mktou.dsi.core.exception;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = -4338629102451978461L;

	public BusinessException() {
		super();
	}

	public BusinessException(String msg) {
		super(msg);
	}

	public BusinessException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}

}
