package com.drakend.reposistorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drakend.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	public UserEntity findOneByUserNameAndIsDelete(String username, int isdelete);
}
