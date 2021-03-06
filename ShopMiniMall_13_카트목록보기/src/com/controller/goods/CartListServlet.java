package com.controller.goods;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.service.CartService;


@WebServlet("/CartListServlet")
public class CartListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO)session.getAttribute("login");	
		String nextPage = null;
		
		if (dto != null) {	// 회원인 경우
			
			String userid = dto.getUserid();
			
			CartService service = new CartService();
			List<CartDTO> list = service.cartList(userid);
			
			request.setAttribute("cartList", list);
			nextPage = "cartList.jsp";
			
		}else {	// 회원이 아닌 경우
			nextPage = "LoginUIServlet";
			session.setAttribute("mesg", "로그인이 필요한 작업입니다.");
		}
		
		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		dis.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
