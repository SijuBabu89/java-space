package com.buddywindow.searchalgorithm;

/*
 * 
 * Linear search is nothing but the normal search that we usually do.
 * We we asked to find an element in an array we check each element by element and
 * get the result and if check end the array without any matching then we say that
 * the element is not found. Such search is called linear search
 * 
 * Time complexity = O(n)
 */
public class LinearSearch {

	public static void main(String[] args) {
		int intArray[] = {3,6,4,77,-22,2,0,11,23};
		System.out.println(findElement(intArray, 11));
		System.out.println(findElement(intArray, 99));
		
	}
	
	public static int findElement(int[] input, int element) {
		if(input.length == 0) {
			return -1;
		}
		
		for(int i=0; i<input.length-1;i++) {
			if(input[i] == element) {
				return i;
			}
		}
		return -1;
	}

}
