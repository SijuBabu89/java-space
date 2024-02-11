package com.buddywindow.datastructure.implementation.doublylinkedlist;

import com.buddywindow.entity.Person;

public class PersonNode {

	private Person person;
	private PersonNode next;
	private PersonNode previous;
		
	public PersonNode(Person person) {
		this.person = person;		
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public PersonNode getNext() {
		return next;
	}

	public void setNext(PersonNode next) {
		this.next = next;
	}	
	
	public PersonNode getPrevious() {
		return previous;
	}

	public void setPrevious(PersonNode previous) {
		this.previous = previous;
	}

	public String toString() {
		return person.toString();
	}
	
}
