package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/productReg")
public class productRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private HashMap<String, Product> products = new HashMap<String, Product>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 	// 1. 요청된 데이터의 한글 처리
		response.setContentType("text/html;charset=UTF-8"); 
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>상품입력결과</title></head><body>");
		out.print("<b>상품입력결과</b>");
		try {
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			int amount = Integer.parseInt(request.getParameter("amount"));
			Product temp = products.get(id);
			if (temp == null) {
				temp = new Product(name, id, amount);
				products.put(id,  temp);
			} else {
				temp.setAmount(temp.getAmount() + amount);
			}
			out.print("<table border='1'>");
				out.print("<tr>");
					out.print("<th>상품명</th>");
					out.print("<th>상품아이디</th>");
					out.print("<th>상품수량</th>");
				out.print("</tr>");
				for (Product p : products.values()) {
					out.print("<tr>");
					out.print("<td>" + p.name + "</td>");
					out.print("<td>" + p.id + "</td>");
					out.print("<td>" + p.amount + "</td>");
					out.print("</tr>");
				}
				out.print("</table><br>");
		} catch (Exception e) {
			out.println("입력항목확인 요망<br>");
		}
		
		out.print("<a href='productForm.html'>상품입력하기</a><br>");
		out.print("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
