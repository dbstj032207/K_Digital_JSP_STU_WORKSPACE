package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/MemberInfoServlet")
public class MemberInfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		MemberDTO dto =(MemberDTO)session.getAttribute("login");

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");

		if (dto == null) {//로그인 안된 경우 
			out.print("잘못된 접근입니다.");
			out.print("<a href='loginForm.html'>로그인 화면</a>");
		} else {
			
			out.print("이름:" + dto.getUsername()+"<br>");
			out.print("주소:" + dto.getAddress()+"<br>");
			out.print("이메일:" + dto.getEmail()+"<br>");
			out.print("<a href='LogoutServlet'>로그아웃</a>");
		}
		out.print("</body>");
		out.print("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
