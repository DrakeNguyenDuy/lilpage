package com.drakend.dao;

import java.util.List;

import com.drakend.dao.impl.BlogDao;
import com.drakend.model.BlogModel;

public interface IBlogDao {
	public List<BlogModel> findAll();
}
