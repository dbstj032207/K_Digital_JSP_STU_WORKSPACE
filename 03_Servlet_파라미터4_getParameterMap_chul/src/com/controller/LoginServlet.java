package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

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
			
			Map<String, String[]> map = request.getParameterMap();	// key값만 꺼내옴
			// key / String[] value
			// userid / String[] aaaa
			// passwd / String[] 1111
			
			// 응답처리
			response.setContentType("text/html;charset=UTF-8"); 
			PrintWriter out = response.getWriter();	// 2. PrintWriter 얻기
			
			out.print("<html><body>"); 	
			Set<String> keys = map.keySet();
			for (String key : keys) {
				String[] values = map.get(key);
				String mesg = "";
				for (String s : values) {
					mesg += s;
				}
				out.print(key + "======" + mesg + "<br>");
			}
			out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
