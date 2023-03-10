package com.drakend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.drakend.dao.IBlogDao;
import com.drakend.dao.impl.BlogDao;
import com.drakend.entity.BlogEntity;
import com.drakend.model.BlogModel;
import com.drakend.reposistorys.BlogReposistory;
import com.drakend.service.IBlogsService;
@Service
public class BlogService implements IBlogsService{
	@Autowired
	private IBlogDao blogDao;

	@Override
	public List<BlogModel> findAll() {
		return blogDao.findAll();
	}
}
