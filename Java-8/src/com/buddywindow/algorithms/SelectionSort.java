package com.buddywindow.algorithms;

/**
 * [88,7,22,-5,0,4,11,2,-5,8]
 * Selection sort is noting but it consider the first element as the largest element.
 * And it start compare the remaining element with 88 if it finds any other element greater than 88 
 * then that element will consider as largest and finally the largest element will move to last index 
 * and last index element will move to the largest element position if the largest element is not in the last position
 * In the above array after sorting below will be the result
 * Step 1 : [8,7,22,-5,0,4,11,2,-5,88]
 * Step 1 : [8,7,-5,-5,0,4,11,2,22,88]
 * Step 1 : [8,7,-5,-5,0,4,2,11,22,88]
 * Step 1 : [2,7,-5,-5,0,4,8,11,22,88]
 * Step 1 : [2,4,-5,-5,0,7,8,11,22,88]
 * Step 1 : [2,0,-5,-5,4,7,8,11,22,88]
 * Step 1 : [-5,0,-5,2,4,7,8,11,22,88]
 * Step 1 : [-5,-5,0,2,4,7,8,11,22,88]
 * @author sijus
 *
 */
public class SelectionSort {

	public static void main(String ar[]) {
		int intArray[] = {77,9,11,3,8,1,-3,9,-11};
		int index = intArray.length - 1;
		while(index > 0) {
			int start = intArray[0];
			int currentIndex = 0;
			for(int j =0 ; j<=index; j++) {				
				if(intArray[j] > start) {
					start = intArray[j];
					currentIndex = j;
				}
			}
			int last = intArray[index];
			intArray[index] = start;
			intArray[currentIndex] = last;
			index --;
			
		}
		for(int m = 0; m< intArray.length ; m++) {
			System.out.println(intArray[m]);
		}
	}
}
