package com.buddywindow.functional_Interface;

@FunctionalInterface
public interface FunctionalInterfaceExplained {

	public abstract String getName();
	//public abstract String getEmail();
	
	public default String getFirstName() {
		return "NameA";
	}
	
	public default String getLastName() {
		return "NameB";
	}
	
	public static String getAddress() {
		return "Address";
	}
	
	public static String getPhone() {
		return "9895951345";
	}
	
	/**
	 * Functional interface is noting but to qualify an interface to a functional interface 
	 * it should contain only one abstract method and can have multiple default or static methods
	 * 
	 * Here at line number 7 we have second abstract method getEmail. Currently that is commented
	 * because at the interface level we have @FunctionalInterface annotation so have more than
	 * one abstract method will throw compilation error
	 * 
	 * Please Note : It is not necessary that we need to mention @FunctionalInterface annotation to define
	 * a functional interface, have single abstract method itself will consider it as functional interface
	 * 
	 */
}
