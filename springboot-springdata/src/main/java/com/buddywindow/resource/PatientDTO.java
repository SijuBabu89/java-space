package com.buddywindow.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {

	private Long patientId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;
}
