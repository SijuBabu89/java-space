package com.buddywindow.datastructure;

public class ExampleArray {

	
	public static void main(String ar[]) {
		String str[] = new String[5];
		str[1] = "Siju";
		str[2] = "Babu";
		str[3] = "Sanu";
		str[4] = "TVM";
		System.out.println(str[0]);
		System.out.println(str[2]);
		str[2] = null;
		System.out.println(str[2]);
	}
}
