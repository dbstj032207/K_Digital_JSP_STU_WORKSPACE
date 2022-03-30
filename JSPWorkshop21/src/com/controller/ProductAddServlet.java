package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.*;


@WebServlet("/ProductAddServlet")
public class ProductAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		int amount = Integer.parseInt(request.getParameter("amount"));
		
		HttpSession session = request.getSession();
		Product p = (Product) session.getAttribute(id);
		
		if (p == null) {
			p = new Product(name, id, amount);
			session.setAttribute(id, p);
		} else {
			p.setAmount(p.getAmount() + amount);
		}
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8"); 
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h2>상품 등록 성공</h2>");
		out.println("<a href='productForm.html'>등록화면보기</a><br>");
		out.println("<a href='ProductListServlet'>상품목록보기</a><br>");
		out.println("</body></html>");

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
