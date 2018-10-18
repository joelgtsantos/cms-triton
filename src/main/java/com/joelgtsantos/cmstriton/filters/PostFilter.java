/**
 * 
 */
package com.joelgtsantos.cmstriton.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;

/**
 * @author Joel Santos
 *
 * cms-triton 2018
 */
public class PostFilter extends ZuulFilter {
	Logger logger = LoggerFactory.getLogger(PostFilter.class);

	@Override
	public String filterType() {
		return "post";
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
		logger.info("Inside Response Filter");
		return null;
	}
}
