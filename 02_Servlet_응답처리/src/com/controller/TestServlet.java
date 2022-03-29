package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); 	// 1. 응답헤더 설정
		PrintWriter out = response.getWriter();	// 2. PrintWriter 얻기
		out.print("<html><body>"); 	// 3. 응답할 html코드 작업
		out.print("<h1>서블릿 응답처리 실습</h1>");
		out.print("<p>Hello World</p>");
		out.print("</body></html>");
		// 4. 사용자 브라우저에서 응답을 받아 html 부분을 출력 후 연결 종료
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
