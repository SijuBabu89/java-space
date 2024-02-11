package com.buddywindow.entity;

public class Person {

	private String firstName;
	private String lastName;
	private String addres;
	private int id;
	int serialNumber;
	
	public Person(String firstName, String lastName, String addres, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.addres = addres;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", addres=" + addres + ", id=" + id + "]";
	}
	
	
	
	
	
	
}
