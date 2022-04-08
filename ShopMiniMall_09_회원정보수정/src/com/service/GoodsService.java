package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.GoodsDAO;
import com.dao.MemberDAO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;

public class GoodsService {

	public List<GoodsDTO> goodsList(String category) {
		SqlSession session = MySqlSessionFactory.getSession();
		List<GoodsDTO> n = null;
		System.out.println(category);
		try {
			GoodsDAO dao = new GoodsDAO();
			n = dao.goodsList(session, category);
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return n;
	}

}
