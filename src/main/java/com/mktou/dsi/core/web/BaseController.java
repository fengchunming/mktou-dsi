package com.mktou.dsi.core.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mktou.dsi.core.entity.ResponseEntity;
import com.mktou.dsi.core.exception.AuthorizationException;
import com.mktou.dsi.core.exception.BusinessException;
import com.mktou.dsi.core.exception.ParameterException;

public class BaseController {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@ExceptionHandler(ParameterException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public Object parameterException(Exception e) {
		System.out.println("parameterException");
		logger.error(e.getMessage(), e);
		return ResponseEntity.fail(e.getMessage(), e.toString());
	}
	
	@ExceptionHandler(AuthorizationException.class)
	@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
	public Object authorizationException(Exception e) {
		System.out.println("AuthorizationException");
		logger.error(e.getMessage(), e);
		return ResponseEntity.fail(e.getMessage(), e.toString());
	}
	
	@ExceptionHandler(BusinessException.class)
	@ResponseStatus(value = HttpStatus.FORBIDDEN)
	public Object businessException(Exception e) {
		System.out.println("BusinessException");
		logger.error(e.getMessage(), e);
		return ResponseEntity.fail(e.getMessage(), e.toString());
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public Object otherException(Exception e) {
		System.out.println("Exception");
		logger.warn(e.getMessage(), e);
		return ResponseEntity.fail(e.getMessage(), e.toString());
	}

}
