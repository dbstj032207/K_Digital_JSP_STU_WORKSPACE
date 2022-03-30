package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.glass.ui.Application;


@WebServlet("/TestController2")
public class TestController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestController2.doGet");
		
		String v1 = (String) request.getAttribute("request");
		HttpSession session = request.getSession();
		String v2 = (String) session.getAttribute("session");
		session.setAttribute("session", "이순신");
		ServletContext ctx = getServletContext();
		String v3 = (String) ctx.getAttribute("application");
		
		System.out.println("=================================");
		System.out.println("request: " + v1);
		System.out.println("session: " + v2);
		System.out.println("application: " + v3);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
