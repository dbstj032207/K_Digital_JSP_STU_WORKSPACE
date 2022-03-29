package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.EmpDAO;
import com.dto.EmpDTO;


public class EmpService {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "scott";
	private String pass = "tiger";
    private EmpDAO dao;
	
	public EmpService() {
		dao = new EmpDAO();
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공 ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<EmpDTO> selectAllEmp(){
		ArrayList<EmpDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			list = dao.selectAllEmp(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		return list;
	}
	
	
}
