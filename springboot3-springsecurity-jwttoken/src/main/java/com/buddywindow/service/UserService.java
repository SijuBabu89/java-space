package com.buddywindow.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.buddywindow.entity.User;
import com.buddywindow.model.UserModel;
import com.buddywindow.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public Optional<User> getUserByUsername(String username) {
		return repository.findByUsername(username);
	}
	
	public Long saveUser(UserModel userModel) {
		User user = new User();
		user.setFirstName(userModel.getFirstName());
		user.setLastName(userModel.getLastName());
		user.setEmail(userModel.getEmail());
		user.setPassword(passwordEncoder.encode(userModel.getPassword()));
		user.setPhoneNumber(userModel.getPhoneNumber());
		user.setRoles(userModel.getRoles());
		user.setUsername(userModel.getUsername());
		user = repository.save(user);
		return user.getId();
	}
	
	public UserModel getUser(Integer id) {
		Optional<User> userOptional = repository.findById(id);
		if(userOptional.isEmpty()) {
			throw new UsernameNotFoundException("User Not Found");
		}
		User user = userOptional.get();
		UserModel model = new UserModel();
		model.setId(user.getId());
		model.setEmail(user.getEmail());
		model.setFirstName(user.getFirstName());
		model.setLastName(user.getLastName());
		model.setPhoneNumber(user.getPhoneNumber());
		model.setRoles(user.getRoles());
		model.setUsername(user.getUsername());
		return model;
	}

}
