package com.buddywindow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buddywindow.dto.UserDTO;
import com.buddywindow.model.UserModel;
import com.buddywindow.service.UserService;

@RestController
@RequestMapping("/buddywindow")
public class UserResource {

	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public Long addUser(@RequestBody UserDTO userDTO) {
		UserModel model = new UserModel();
		model.setFirstName(userDTO.getFirstName());
		model.setLastName(userDTO.getLastName());
		model.setPassword(userDTO.getPassword());
		model.setPhoneNumber(userDTO.getPhoneNumber());
		model.setRoles(userDTO.getRoles());
		model.setUsername(userDTO.getUsername());
		model.setEmail(userDTO.getEmail());
		return userService.saveUser(model);
	}
	
	@GetMapping("/users/{userId}")
	public UserDTO getUser(@PathVariable int userId) {		
		UserModel model = userService.getUser(userId);
		UserDTO dto = new UserDTO();
		dto.setEmail(model.getEmail());
		dto.setFirstName(model.getFirstName());
		dto.setId(model.getId());
		dto.setLastName(model.getLastName());
		dto.setPhoneNumber(model.getPhoneNumber());
		dto.setRoles(model.getRoles());
		dto.setUsername(model.getUsername());
		return dto;
		
	}
}
