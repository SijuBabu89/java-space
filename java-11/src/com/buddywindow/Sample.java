package com.buddywindow;

public class Sample {
//	public static void main(String ar[]) {
//		User user = new User("Siju", "Babu");
//		user = new User("Sanu", "Bbau");
//		System.out.println("Hello");
//		System.gc();
//		Runtime.getRuntime().gc();
//		System.out.println(user);
//		
//		for(int i =0; i<10000 ; i++) {
//			System.out.println(" ");
//		}
//	}
	
	public void test(int[] ...days) {
		System.out.println(days[1]);
		
	}
	
	
	public static void main(String args[]) {
		User p = new User();
		p.firstName = "EJava";
		anotherMethod(p);
		System.out.println(p.firstName);
		someMethod(p);
		System.out.println(p.firstName);
		}
		static void someMethod(User p) {
		p.firstName = "someMethod";
		System.out.println(p.firstName);
		}
		static User anotherMethod(User p) {
		p = new User();
		p.firstName = "anotherMethod";
		System.out.println(p.firstName);
		return p;
		}
}
