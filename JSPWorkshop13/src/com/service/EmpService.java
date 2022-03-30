package com.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;


public class EmpService {

	EmpDAO dao = new EmpDAO();
	
	public List<EmpDTO> selectAllEmp(){
		
		SqlSession session = MySqlSessionFactory.getSession();
		List<EmpDTO> list = null;
		
		try {
			list = dao.selectAllEmp(session);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			session.close();
		}

		return list;
	}
	
	
}
