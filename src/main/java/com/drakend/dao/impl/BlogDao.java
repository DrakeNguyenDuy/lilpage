package com.drakend.dao.impl;

import java.util.List;

import com.drakend.dao.IBlogDao;
import com.drakend.mapper.BlogMapper;
import com.drakend.mapper.NewMapper;
import com.drakend.model.NewModel;

public class BlogDao extends AbstractDAO<BlogDao> implements IBlogDao {
	@Override
	public List<BlogDao> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM blog");
		return query(sql.toString(), new BlogMapper());
	}
}
