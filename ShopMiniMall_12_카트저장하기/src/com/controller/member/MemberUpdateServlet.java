package com.controller.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;

@WebServlet("/MemberUpdateServlet")
public class MemberUpdateServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		
		String nextPage = null;
		if(dto != null) {	// 회원인 경우
			
			request.setCharacterEncoding("utf-8");
			
			String userid = request.getParameter("userid");	
			String passwd = request.getParameter("passwd");	// null
			String username = request.getParameter("username"); // null
			String post = request.getParameter("post");
			String addr1 = request.getParameter("addr1");
			String addr2 = request.getParameter("addr2");
			String phone1 = request.getParameter("phone1");
			String phone2 = request.getParameter("phone2");
			String phone3 = request.getParameter("phone3");
			String email1 = request.getParameter("email1");
			String email2 = request.getParameter("email2");
			
			MemberDTO dtoM = new MemberDTO(userid,passwd,username,post,addr1,addr2,
                    phone1,phone2,phone3,email1,email2);
			
			MemberService service = new MemberService();
			int num = service.memberUpdate(dtoM);
			
			if(num == 1) {	// Update에 성공했을 경우
				
				dtoM = service.mypage(userid);	// 최신화 된 정보를 다시 뽑아옴
				
				session.setAttribute("login", dtoM); // session의 로그인 정보 설정
				session.setAttribute("memberAdd", "회원정보가 수정되었습니다.");
			}
			
			nextPage = "main";

		}else {	// 회원이 아닌 경우
			nextPage = "LoginUIServlet";
			session.setAttribute("mesg", "로그인이 필요한 작업입니다.");
		}
		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
