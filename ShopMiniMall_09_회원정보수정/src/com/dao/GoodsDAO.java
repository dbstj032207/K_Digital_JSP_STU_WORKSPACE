package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.GoodsDTO;
import com.dto.MemberDTO;

public class GoodsDAO {

	public List<GoodsDTO> goodsList(SqlSession session, String category) {
		List<GoodsDTO> n = session.selectList("GoodsMapper.goodslist", category);
		return n;
	}

}
