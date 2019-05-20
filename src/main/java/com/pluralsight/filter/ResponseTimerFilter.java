package com.pluralsight.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResponseTimerFilter implements Filter {
	private static Logger LOGGER = LogManager.getLogger();
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		long startTime = System.currentTimeMillis();
		
		chain.doFilter(request, response);
		
		long elapsed = System.currentTimeMillis() - startTime;
		
		String name = "servlet";
		
		if (request instanceof HttpServletRequest) {
			name = ((HttpServletRequest) request).getRequestURI();
		}
		
		LOGGER.info("{} took {} ms", name, elapsed);
	}

	@Override
	public void destroy() {
		
	}

}
