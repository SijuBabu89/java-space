package com.buddywindow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buddywindow.dto.LoginDTO;
import com.buddywindow.model.LoginModel;
import com.buddywindow.service.AuthenticationService;

@RestController
@RequestMapping("/buddywindow")
public class AuthResource {
	
	@Autowired
	private AuthenticationService authenticationService;
	
	@PostMapping("/login")
	public String authenticate(@RequestBody LoginDTO loginDTO) {
		LoginModel loginModel = new LoginModel();
		loginModel.setUsername(loginDTO.getUsername());
		loginModel.setPassword(loginDTO.getPassword());
		String token = authenticationService.authenticateUser(loginModel);
		return token;
	}

}
