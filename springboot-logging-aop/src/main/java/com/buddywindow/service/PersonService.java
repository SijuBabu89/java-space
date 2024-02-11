package com.buddywindow.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buddywindow.entity.Person;
import com.buddywindow.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public List<Person> getAllPerson() {
		return personRepository.findAll();
	}
	
	public Long createPerson(Person person) {
		person = personRepository.save(person);
		return person.getId();
	}
	
	public Person getPerson(Long id) {
		Optional<Person> person = personRepository.findById(id);
		return person.get();
	}
}
