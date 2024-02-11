package com.buddywindow.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buddywindow.entity.PatientEntity;
import com.buddywindow.service.PatientService;

@RestController
@RequestMapping("/buddywindow")
public class PatientResource {
	
	@Autowired
	private PatientService patientService;
	
	@PostMapping("/patient")
	public Long createPatient(@RequestBody PatientDTO patientDTO) {
		PatientEntity patientEntity = new PatientEntity();
		patientEntity.setFirstName(patientDTO.getFirstName());
		patientEntity.setLastName(patientDTO.getLastName());
		patientEntity.setEmail(patientDTO.getEmail());
		patientEntity.setPhone(patientDTO.getPhone());
		patientEntity.setAddress(patientDTO.getAddress());
		return patientService.savePatient(patientEntity);
	}

}
