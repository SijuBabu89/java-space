package com.buddywindow.algorithms;

/**
 * 0! = 1
 * 1! = 1 * 0! = 1 * 1 = 1
 * 2! = 2 * 1 * 0 = 2 * 1! = 2 * 1 = 2
 * 3! = 3 * 2 * 1 * 0 = 3 * 2! = 3 * 2 = 6
 * 4! = 4 * 3 * 2 * 1 * 0 = 4 * 3! = 4 * 6 = 24
 * 
 * @author sijus
 *
 */
public class Recursion {

	public static void main(String[] args) {
		System.out.println(factorsUsingRecursion(4));

	}
	
	public static int factorsUsingLoop(int n) {
		if(n == 0) {
			return 1;
		}
		int recursionFactor = 1;
		for(int i =1; i <= n; i++) {
			recursionFactor *= i;
		}
		return recursionFactor;
	}
	
	public static int factorsUsingRecursion(int n) {
		//A recursive function should have below condition otherwise we make 
		//recursive call again and again and will not end that call
		
		//So in a recursive method there should be condition that should break the recursve call
		//And that condition is called breaking condition
		//It also called the basecase
		//Keep in mind when you use recursive method there should be a basecase condition that should break the call
		// If you didnt use breaking condition the recursive call keep calling the same method and end up stack overflow error.
		
		//Keep in mind below looping logic is more light weight since there is no method call involved
		if(n == 0) {
			return 1;
		}
		return n * factorsUsingRecursion(n-1);
	}

}
