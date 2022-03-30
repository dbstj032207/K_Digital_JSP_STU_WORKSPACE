package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyEncodingFiter implements Filter{

	@Override
	public void destroy() {
		System.out.println("MyEncodingFiter.destroy");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("MyEncodingFiter.doFilter 요청");
		// request 인코딩 설정
		request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response); 	// request와 response를 연결시켜줌
		
		System.out.println("MyEncodingFiter.doFilter 응답");
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("MyEncodingFiter.doFilter init");
		
	}
	
	

}
