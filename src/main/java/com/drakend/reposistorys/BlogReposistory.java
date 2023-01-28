package com.drakend.reposistorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drakend.entity.BlogEntity;
import com.drakend.model.BlogModel;

//JpaReposistory<Entity class, Type data primary key of entity>
public interface BlogReposistory extends JpaRepository<BlogEntity, Long> {
	public List<BlogEntity> findAll();
}
