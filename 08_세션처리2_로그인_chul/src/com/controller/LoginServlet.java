package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String userid = (String)request.getParameter("userid");
		String passwd = (String)request.getParameter("passwd");
		
		if(userid.equals("abcd") && passwd.equals("1234")) {
			HttpSession session = request.getSession();
			session.setAttribute("userid", userid);
			session.setAttribute("passwd", passwd);
			response.sendRedirect("loginInfo.jsp");
		}else {
			response.sendRedirect("loginForm.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
