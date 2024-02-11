package com.buddywindow.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.buddywindow.entity.User;
import com.buddywindow.entity.UserInfoDetails;

@Component
public class UserService implements UserDetailsService{

	public List<User> list = Arrays.asList(
			new User("Siju", "Babu", "siju.babu@gmail.com", "9895951345", "sijub", "Password@123", "USER_ROLE"),
			new User("Sanu", "kb", "sanu.kb@gmail.com", "7897665534", "sanukb", "Sanu@KB@123", "USER_ROLE"),
			new User("Lakshmanan", "Mittal", "lakshmanan.mittal@gmail.com", "9987889877", "lk.mittal@affro.com", "LKMittal@afro123", "ADMIN_ROLE"),
			new User("Mishial", "Karkfa", "mi.kar.babu@gmail.com", "7878787878", "mishal", "Karkka@123", "ADMIN_ROLE, USER_ROLE"));
	
//	public UserInfoDetails getUser(String username) {
//		User user= list.stream().filter(usr -> usr.getUsername()
//				.equals(username)).findFirst().get();
//		return new UserInfoDetails(user);
//	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user= list.stream().filter(usr -> usr.getUsername()
				.equals(username)).findFirst().get();
		return new UserInfoDetails(user);
	}
}
