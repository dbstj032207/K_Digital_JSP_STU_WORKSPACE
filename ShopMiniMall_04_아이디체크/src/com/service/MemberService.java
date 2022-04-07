package com.service;

import javax.websocket.Session;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MemberDAO;
import com.dto.MemberDTO;

public class MemberService {

	public int memberAdd(MemberDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			MemberDAO dao = new MemberDAO();
			n = dao.memberAdd(session, dto);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	public int idCheck(String userid) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			MemberDAO dao = new MemberDAO();
			n = dao.idCheck(session, userid);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

}
