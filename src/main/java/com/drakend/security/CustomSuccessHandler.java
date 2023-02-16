package com.drakend.security;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import com.drakend.constans.SystemConstants;
import com.drakend.utils.SecurityUtil;

public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	@Override
	protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		super.handle(request, response, authentication);
		String targetURL = determineTargetUrl(authentication);
		if (response.isCommitted()) {
			return;
		}
		redirectStrategy.sendRedirect(request, response, targetURL);
	}

	public RedirectStrategy getRedirectStrategy() {
		return redirectStrategy;
	}

	public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
		this.redirectStrategy = redirectStrategy;
	}

	private String determineTargetUrl(Authentication authentication) {
		List<String> roles = SecurityUtil.getAuthorties();
		return isAdmin(roles) ? "/admin-home" : isUser(roles) ? "/home" : "/home";
	}

	private boolean isAdmin(List<String> roles) {
		return roles.contains(SystemConstants.ADMIN);
	}

	private boolean isUser(List<String> roles) {
		return roles.contains(SystemConstants.USER);
	}
}
