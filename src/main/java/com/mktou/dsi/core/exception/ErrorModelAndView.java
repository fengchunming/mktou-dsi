package com.mktou.dsi.core.exception;

import org.springframework.web.servlet.ModelAndView;

public class ErrorModelAndView extends ModelAndView {

	public ErrorModelAndView(Exception e) {
		this.addObject("name", e.getClass().getSimpleName());
		this.addObject("exception", e.getMessage());
	}

}
