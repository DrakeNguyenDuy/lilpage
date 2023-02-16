package com.drakend.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtil {
	@SuppressWarnings("unchecked")
	public static List<String> getAuthorties() {
		List<String> result = new ArrayList<String>();
		List<GrantedAuthority> authorities = (List<GrantedAuthority>) SecurityContextHolder.getContext()
				.getAuthentication().getAuthorities();
		for (GrantedAuthority grantedAuthority : authorities) {
			result.add(grantedAuthority.getAuthority());
		}
		return result;
	}
}
