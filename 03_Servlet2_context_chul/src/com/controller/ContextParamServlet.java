package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ContextParamServlet")
public class ContextParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ContextParamServlet.doGet() 호출됨");
		
		ServletContext ctx = getServletContext();	// web.xml에 설정된 context-param 데이터를 가지고 있는 객체 얻기
		String userid = ctx.getInitParameter("userid");
		String email = ctx.getInitParameter("email");
		System.out.println(userid + "\t" + email);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
