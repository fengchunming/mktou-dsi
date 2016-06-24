package com.mktou.dsi.core.exception;

public class AuthorizationException extends RuntimeException {

	private static final long serialVersionUID = 6072336265362502069L;

	public AuthorizationException() {
		super();
	}

	public AuthorizationException(String msg) {
		super(msg);
	}

	public AuthorizationException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public AuthorizationException(Throwable cause) {
		super(cause);
	}
}