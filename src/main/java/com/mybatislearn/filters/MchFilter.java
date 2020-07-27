package com.mybatislearn.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.FilterConfig;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MchFilter implements Filter {
	private static Logger log = LoggerFactory.getLogger("MchFilter");
    @Override

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    	 HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
    	 BodyReaderHttpServletRequestWrapper requestWrapper = new BodyReaderHttpServletRequestWrapper(httpServletRequest);
         filterChain.doFilter(requestWrapper,servletResponse);
    }
    @Override

    public void destroy() {



    }

}
