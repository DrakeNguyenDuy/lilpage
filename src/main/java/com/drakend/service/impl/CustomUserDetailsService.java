package com.drakend.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.drakend.constans.SystemConstants;
import com.drakend.dto.MyUser;
import com.drakend.entity.RoleEntity;
import com.drakend.entity.UserEntity;
import com.drakend.reposistorys.UserRepository;

@Service()
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity = userRepository.findOneByUserNameAndIsDelete(username, SystemConstants.ACTIVE);
		if (userEntity == null) {
			throw new UsernameNotFoundException("Username not found");
		}
		List<GrantedAuthority> authority = new ArrayList<>();
		for (RoleEntity role : userEntity.getRoles()) {
			authority.add(new SimpleGrantedAuthority(role.getCode()));
		}
		// put information of user to sustentive login
		MyUser user = new MyUser(userEntity.getUserName(), userEntity.getPassword(), true, true, true, true, authority);
		user.setFullname(userEntity.getFullname());
		return user;
	}

}
