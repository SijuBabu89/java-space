package com.buddywindow.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String username;
	private String password;
	private String roles;
}
