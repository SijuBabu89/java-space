package com.buddywindow.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buddywindow.service.AuthenticationService;

@RestController
@RequestMapping("/app")
public class AuthenticationResource {
	
	@Autowired
	private AuthenticationService authenticationService;

	@PostMapping("/login")
	public String authenticateRequest(@RequestBody final LoginDTO loginDTO) {
		return authenticationService.authenticateUser(loginDTO.getUsername(), loginDTO.getPassword());		
	}
	@PostMapping("/token")
	public String token(@RequestBody final LoginDTO loginDTO) {
		return authenticationService.authenticateUser(loginDTO.getUsername(), loginDTO.getPassword());		
	}
}
