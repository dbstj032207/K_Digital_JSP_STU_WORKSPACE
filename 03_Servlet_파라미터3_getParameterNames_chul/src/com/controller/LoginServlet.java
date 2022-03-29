package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 한글처리
			request.setCharacterEncoding("UTF-8"); 	// 1. 요청된 데이터의 한글 처리
			
			Enumeration<String> keys = request.getParameterNames();	// key값만 꺼내옴
			
			// 응답처리
			response.setContentType("text/html;charset=UTF-8"); 
			PrintWriter out = response.getWriter();	// 2. PrintWriter 얻기
			
			out.print("<html><body>"); 	
			while(keys.hasMoreElements()) {
				String key = keys.nextElement();
				String value = request.getParameter(key);	// 데이터 파싱
				out.print(key + ": " + value + "<br>");
			}
			out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
