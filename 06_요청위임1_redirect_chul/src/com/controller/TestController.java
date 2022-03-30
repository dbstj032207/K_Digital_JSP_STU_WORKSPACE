package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/TestController")
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TestController.doGet");
		
		request.setAttribute("request", "홍길동");
		HttpSession session = request.getSession();
		session.setAttribute("session", "이순신");
		ServletContext ctx= getServletContext();
		ctx.setAttribute("application", "유관순");
		
		// 요청 위임
		// 1. redirect방법
		// 데이터 전달없이 단순하게 화면전화만 할 경우 주로 사용
		response.sendRedirect("TestController2");	// request의 전달은 이루어지지 않음

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
