package com.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InitParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InitParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("InitParamServlet.doGet() 호출됨");
		
		String userid = getInitParameter("userid");
		String email = getInitParameter("email");
		System.out.println(userid + "\t" + email);
		
		Enumeration<String> enu = getInitParameterNames();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			String value = getInitParameter(key);
			System.out.println(">>>" + key + "\t" + value);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
