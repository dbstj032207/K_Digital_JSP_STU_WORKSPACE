package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/GetScopeServlet")
public class GetScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mesg = (String) request.getAttribute("request");	// value값 꺼내오기
		
		HttpSession session = request.getSession();
		String x2 = (String) session.getAttribute("session");
		
		ServletContext ctx = getServletContext();
		String x3 =  (String) ctx.getAttribute("application");
		
		System.out.println("GetScopeServlet request === " + mesg);
		System.out.println("GetScopeServlet session === " + x2);	
		System.out.println("GetScopeServlet pplication === " + x3);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
