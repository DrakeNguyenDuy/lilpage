package com.drakend.service;

import java.util.List;

import com.drakend.model.BlogModel;

public interface IBlogsService {
	List<BlogModel> findAll();
}
