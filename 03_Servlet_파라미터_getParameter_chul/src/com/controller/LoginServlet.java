package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 한글처리
		request.setCharacterEncoding("UTF-8"); 	// 1. 요청된 데이터의 한글 처리
		
		// 요청작업 처리(파싱)
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		System.out.println("LoginServlet.doGet() : " + userid + "\t" + passwd);
		
		// 응답처리
		response.setContentType("text/html;charset=UTF-8"); 
		PrintWriter out = response.getWriter();	// 2. PrintWriter 얻기
		out.print("<html><body>"); 	
		out.print("이름은: " + userid + "<br>");
		out.print("비번은: " + passwd);
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet.doPost() 호출됨");
		doGet(request, response);
	}

}
