package com.buddywindow.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.buddywindow.entity.User;
import com.buddywindow.model.LoginModel;

@Component
public class AuthenticationService {

	@Autowired
	private UserService userService;	
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JWTService jwtService;
	
	public String authenticateUser(LoginModel loginModel) {
		Optional<User> userOptional = userService.getUserByUsername(loginModel.getUsername());
		if(userOptional.isEmpty()) {
			throw new UsernameNotFoundException("User Not Found!");
		}
		User user = userOptional.get();
		if(!passwordEncoder.matches(loginModel.getPassword(), user.getPassword())) {
			throw new UsernameNotFoundException("Invalid Credentials!");
		}
		Map<String,Object> claims = new HashMap<String, Object>();
		claims.put("email", user.getEmail());
		claims.put("phonenumber", user.getPassword());
		claims.put("roles", user.getRoles());
		String token = jwtService.generateToken(user.getUsername(), claims);
		return token;
		
	}
}
