package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MyProductDAO;
import com.dto.MyProductDTO;

public class MyProductService {
	
	private MyProductDAO dao;
	
	public MyProductService() {
		dao = new   MyProductDAO();
	}

	public List<MyProductDTO> select() {
		 SqlSession session = MySqlSessionFactory.getSession();
		 List<MyProductDTO> list = null; 
		 try {
	      list = dao.select(session);
	   
	     }finally {
			session.close();
	     }
	     return list;
	}//end select
	
	public int delete(String prodId) {
		 SqlSession session = MySqlSessionFactory.getSession();
		 int num = 0; 
		 try {
			 num = dao.delete(session, prodId);
	    	 session.commit();

	     }finally {
			 session.close();
	     }
	     return num;
	}
	
	
	
}
