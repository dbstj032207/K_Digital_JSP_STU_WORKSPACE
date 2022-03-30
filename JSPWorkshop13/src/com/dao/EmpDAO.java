package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;


public class EmpDAO {
	
	public List<EmpDTO> selectAllEmp(SqlSession session){
		
		List<EmpDTO> list = session.selectList("com.dto.selectAll");
		return list;
	}
	
}
