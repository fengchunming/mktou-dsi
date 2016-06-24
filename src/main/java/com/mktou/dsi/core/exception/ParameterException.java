package com.mktou.dsi.core.exception;

public class ParameterException extends RuntimeException {

	private static final long serialVersionUID = 7357719852959374074L;

	public ParameterException() {
		super();
	}

	public ParameterException(String msg) {
		super(msg);
	}

	public ParameterException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public ParameterException(Throwable cause) {
		super(cause);
	}

}
