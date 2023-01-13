package com.drakend.dao;

import java.util.List;

import com.drakend.dao.impl.BlogDao;

public interface IBlogDao {
	public List<BlogDao> findAll();
}
