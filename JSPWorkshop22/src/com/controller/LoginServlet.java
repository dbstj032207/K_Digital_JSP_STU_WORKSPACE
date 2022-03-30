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
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");

		MemberDTO xxx = new MemberDTO();
		xxx.setUserid(userid);
		xxx.setPasswd(passwd);

		LoginService service = new LoginService();
		MemberDTO dto = service.loginCheck(xxx);
		System.out.println(dto);

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");

		if (dto == null) {
			out.print("아이디와 비밀번호를 확인하세요.<br>");
			out.print("<a href='loginForm.html'>로그인 화면</a>");
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("login", dto);
			
			out.print("환영합니다." + dto.getUsername()+"<br>");
			out.print("<a href='LogoutServlet'>로그아웃</a><br>");
			out.print("<a href='MemberInfoServlet'>회원정보보기</a>");
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
