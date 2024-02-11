package com.buddywindow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buddywindow.entity.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, Long>{

}
