package com.mktou.dsi.core.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public final class LoggingFilter implements Filter {
	private FilterConfig filterConfig = null;

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		long start = System.currentTimeMillis();
		String address = request.getRemoteAddr();
		String file = ((HttpServletRequest) request).getRequestURI();
		chain.doFilter(request, response);
		filterConfig.getServletContext().log(
				"User Access! " + " User IP: " + address + " Resource: " + file
						+ " Milliseconds used: "
						+ (System.currentTimeMillis() - start));
	}

	public void destroy() {

	}

	public void init(FilterConfig filterConfig) {
		this.filterConfig = filterConfig;
	}
}