package com.buddywindow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.buddywindow.entity.User;
import com.buddywindow.entity.UserInfoDetails;
import com.buddywindow.util.JWTUtil;

@Service
public class AuthenticationService {
	
	@Autowired
	private UserService userService;
	@Autowired
	private JWTUtil jwtUtil;

	public String authenticateUser(String username, String password) {
		UserDetails user = userService.loadUserByUsername(username);
		if(user == null) {
			throw new RuntimeException("User Not Found!");
		}
		String token = jwtUtil.generateToken(username);
		return token;
	}
}
