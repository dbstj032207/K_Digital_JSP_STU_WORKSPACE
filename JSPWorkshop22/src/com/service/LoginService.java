package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.LoginDAO;
import com.dto.MemberDTO;

public class LoginService {
	
	private LoginDAO dao;
	
	public LoginService() {
		dao = new  LoginDAO();
	}

	public MemberDTO loginCheck( MemberDTO dto) {

		SqlSession session = MySqlSessionFactory.getSession();
		try {
			return dao.loginCheck(session, dto);
		}finally {
			session.close();
		}
	}
	
}
