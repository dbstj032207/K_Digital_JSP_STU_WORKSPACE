package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
		// 2. forwad방법
		// 다른 페이지로 화면전환 되나 request가 넘어가서 사용됨, 즉 request에 저장된 데이터를 다른 페이지에서 위임받아 사용할 수 있음
		//RequestDispatcher dis = request.getRequestDispatcher("TestController2");
		RequestDispatcher dis = request.getRequestDispatcher("hello.jsp");
		dis.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
