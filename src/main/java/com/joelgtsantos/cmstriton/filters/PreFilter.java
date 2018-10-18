/**
 * 
 */
package com.joelgtsantos.cmstriton.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * @author Joel Santos
 *
 * cms-triton 2018
 */
public class PreFilter extends ZuulFilter {
	Logger logger = LoggerFactory.getLogger(PostFilter.class);

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		
		logger.info("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
		return null;
	}
}
