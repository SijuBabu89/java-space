package com.buddywindow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Patient")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long patientId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;

}
