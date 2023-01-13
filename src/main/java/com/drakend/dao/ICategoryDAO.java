package com.drakend.dao;

import java.util.List;

import com.drakend.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
	List<CategoryModel> findAll();
	CategoryModel findOne(long id);
	CategoryModel findOneByCode(String code);
}
