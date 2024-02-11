package com.buddywindow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buddywindow.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
