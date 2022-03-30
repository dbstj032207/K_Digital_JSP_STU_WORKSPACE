package com.dao;

import org.apache.ibatis.session.SqlSession;

import com.dto.MemberDTO;

public class LoginDAO {

	public MemberDTO loginCheck(SqlSession session, MemberDTO dto) {
		return session.selectOne("loginCheck", dto);
	}
	
}
