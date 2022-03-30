package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.*;

@WebServlet("/ProductListServlet")
public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Enumeration<String> key = session.getAttributeNames();
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8"); 
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>상품입력결과</title></head><body>");
		out.print("<b>상품입력결과</b>");

		out.print("<table border='1'>");
			out.print("<tr>");
				out.print("<th>상품명</th>");
				out.print("<th>상품아이디</th>");
				out.print("<th>상품수량</th>");
			out.print("</tr>");
			while(key.hasMoreElements()){
				String id = key.nextElement();
				Product p = (Product)session.getAttribute(id);
				out.print("<tr>");
				out.print("<td>" + p.getName() + "</td>");
				out.print("<td>" + p.getId() + "</td>");
				out.print("<td>" + p.getAmount() + "</td>");
				out.print("</tr>");
			}
		out.print("</table><br>");
		out.print("<a href='productForm.html'>등록화면보기</a><br>");
		out.print("</body></html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
