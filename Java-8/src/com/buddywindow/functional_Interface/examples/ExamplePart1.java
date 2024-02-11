package com.buddywindow.functional_Interface.examples;

interface Examples {
//	//Example 1
//	public void getMessage();
	
//	//Example 2
//	public void getMessage(String name);
	
	//Example 3
	
	public String getMessage(String name);
}

public class ExamplePart1 {

	public static void main(String ar[]) {
//		//Example 1
//--------------------------------
//		
//		//Detailed Code
//		Examples examples = () -> {System.out.println("This is my message");};
//		examples.getMessage();
//		
//		//Short code 
//		Examples examples1 = () -> System.out.println("This is my message");
//		examples1.getMessage();
		
//		//Example 2
//---------------------------------
//		
//		Examples examples = (siju) -> System.out.println("My Name is "+siju);
//		examples.getMessage("Siju");
		
		//Example 3
		
		Examples examples = (siju) -> "My Name is "+siju;
		System.out.println(examples.getMessage("Siju"));
		
		
	}
}
