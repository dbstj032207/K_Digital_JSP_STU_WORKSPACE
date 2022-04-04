package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.Person;


@WebServlet("/TestServlet3")
public class TestServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Person>list = new ArrayList<Person>();
		list.add(new Person("이순신", 10));
		list.add(new Person("유관순", 20));
		
		request.setAttribute("xxx", list);
		
		String mesg = "A/B/C";
		request.setAttribute("yyy", mesg);
		RequestDispatcher dis = request.getRequestDispatcher("03_forEach.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
