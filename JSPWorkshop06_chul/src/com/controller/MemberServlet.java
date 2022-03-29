package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 	// 1. 요청된 데이터의 한글 처리
		
		String username = request.getParameter("username");
		String ssn = request.getParameter("ssn");
		
		String gender = (ssn.substring(7, 8)).equals("1") ? "남자" : "여자";
		String[] hobby = request.getParameterValues("hobby");
		String mesg="";
		for (String x : hobby) {
			System.out.println(x);
			mesg += x + " ";
		}
		String marry = request.getParameter("marry");
		
		// 응답처리
		response.setContentType("text/html;charset=UTF-8"); 
		PrintWriter out = response.getWriter();	// 2. PrintWriter 얻기
		out.print("<html><body>"); 	
		String my = "이름은" + username + "<br>";
		my += "성별은 " + gender + "<br>";
		my += "취미는 " + mesg + "<br>";
		my += "결혼여부는 " + marry + "<br>";
		out.print(my);
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
