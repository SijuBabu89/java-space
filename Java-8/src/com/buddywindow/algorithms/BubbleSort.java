package com.buddywindow.algorithms;

/**
 * Bubble sort is nothing it will traverse all element from top to bottom and it repeat the steps till the array is in sorted order 
 * [*76,22,3,25,7,9,-4,55,-9,11] -> Length 10
 * Here the unsorted index is 9 (10 -1)
 * In this step the array will traverse 9 times that first it will check element at 0 and 1 if 0 > 1 then 0 index value will swap to index 1 and index 1 value swap to 0 index
 * Next it will compare 1,2 
 * Then 2,3
 * Then 3,4
 * Then 4,5
 * Then 5,6
 * Then 6,7
 * Then 7,8
 * Then 8,9
 * After this step the largest element will be in the last position
 * [22,3,25,7,9,-4,55,-9,11,*76]
 * Now the unsorted index will set to 8, and the steps will repeat
 * 
 * Time Complexity is O(n[power]2)
 * 10 index element will take 100 times to get the array sorted
 * 100 index item -> 10000 etc
 * **
 * @author sijus
 *
 */

public class BubbleSort {

	public static void main(String[] args) {
		int intArray[] = new int[8];
		intArray[0] = 22;
		intArray[1] = 33;
		intArray[2] = 43;
		intArray[3] = 1;
		intArray[4] = -9;
		intArray[5] = 7;
		intArray[6] = 12;
		intArray[7] = 2;
		int i = intArray.length -1;
		for(int m = 0; m <= intArray.length-1 ; m ++) {
			System.out.println(intArray[m]);
		}
		while(i > 0) {
			for(int j = 0; j<i; j++) {
				int a = intArray[j];
				int b = intArray[j + 1];
				
				if(a > b) {
					intArray[j + 1] = a;
					intArray[j] = b;
				}
			}
			
			i--;
		}
		
		for(int n = 0; n <= intArray.length-1 ; n ++) {
			System.out.println(intArray[n]);
		}
		

	}

}
