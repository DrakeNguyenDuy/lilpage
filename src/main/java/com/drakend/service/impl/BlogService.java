package com.drakend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.drakend.dao.impl.BlogDao;
import com.drakend.model.BlogModel;
import com.drakend.service.IBlogsService;

public class BlogService implements IBlogsService{
	@Autowired
	private BlogDao blogDao;

	@Override
	public List<BlogModel> findAll() {
		return blogDao.findAll();
	}
}
