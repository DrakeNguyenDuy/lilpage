package com.drakend.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.drakend.dao.IBlogDao;
import com.drakend.mapper.BlogMapper;
import com.drakend.mapper.NewMapper;
import com.drakend.mapper.RowMapper;
import com.drakend.model.BlogModel;
import com.drakend.model.NewModel;

@Repository
public class BlogDao extends AbstractDAO<BlogDao> implements IBlogDao {
	@Override
	public List<BlogModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM blog");
		return query(sql.toString(), new BlogMapper());
	}
}
