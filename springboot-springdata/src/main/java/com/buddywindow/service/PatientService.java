package com.buddywindow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.buddywindow.entity.PatientEntity;
import com.buddywindow.repository.PatientRepository;

@Component
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	public Long savePatient(PatientEntity entity) {
		PatientEntity patientEntity = patientRepository.save(entity);
		return patientEntity.getPatientId();
	}
}
