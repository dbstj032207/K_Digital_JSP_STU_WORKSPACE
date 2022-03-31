package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



import org.apache.ibatis.session.SqlSession;
import com.dto.MyProductDTO;

public class MyProductDAO {
	

	public List<MyProductDTO> select(SqlSession session) {
		List<MyProductDTO> list =  session.selectList("com.dto.selectAll");
		return list;
	}
	
}
