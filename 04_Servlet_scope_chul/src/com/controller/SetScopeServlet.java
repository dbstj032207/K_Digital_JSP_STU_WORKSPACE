package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SetScopeServlet")
public class SetScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("request", "홍길동");	// key, value
		String mesg = (String) request.getAttribute("request");	// value값 꺼내오기
		//System.out.println("SetScopeServlet: " + mesg);
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out= response.getWriter();
		out.print("<a href='GetScopeServlet'>GetScopeServlet</a>");
		
		// Session Scope에 저장 // 브라우저의 라이프 사이클과 같음
		HttpSession session = request.getSession();
		session.setAttribute("session", "이순신");
		
		// application scope에 저장 / 모든 브라우저, 모든 servlet에서 다 읽을 수 있음, 브라우저 종료시도 살아 있음
		ServletContext ctx = getServletContext();
		ctx.setAttribute("application", "유관순");
		
		System.out.println("request: 홍길동");
		System.out.println("session: 이순신");
		System.out.println("application: 유관순");
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
