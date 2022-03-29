package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 한글처리
		request.setCharacterEncoding("UTF-8"); 	// 1. 요청된 데이터의 한글 처리
				
		// 요청작업 처리(파싱)
		String[] fruits = request.getParameterValues("fruit");
		
		// 콘솔에 출력
		for (String s : fruits) {
			System.out.println(s);
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
