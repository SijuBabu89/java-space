package com.buddywindow.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buddywindow.entity.Person;
import com.buddywindow.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonResource {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/{id}")
	public Person getPerson(@PathVariable Long id) {
		return personService.getPerson(id);
	}
	
	@GetMapping
	public List<Person> getAllPerson() {
		return personService.getAllPerson();
	}
	
	@PostMapping
	public Long createPerson(@RequestBody Person person) {
		return personService.createPerson(person);
	}
}
