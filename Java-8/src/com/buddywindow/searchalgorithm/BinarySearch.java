package com.buddywindow.searchalgorithm;

/**
 * 
 * @author sijus
 *
 *Below are the steps and conditions for binary search
 *
 *Data must be in sorted order
 *Choose the element in the middle of the array and compare it against the search vale
 *If the element is equal to the value, we are done.
 *If the element is greater than the value, search the left half of the array
 *If the element is less than the value, search the right half of the array.
 *
 *intArray = [-22| -15| 1| 7| 20| 35| 55]
 *
 *Here start index = 0
 *end index = 7[we are taking the total length here which means index+1, we are doing the search in same array without creating any new array so for logical partitioning we are taking 7]
 *0+7/2 = 3
 *
 *So the middle index is 3 and the value is intArray[3] = 7
 *7 is greater the 1 so we will search the element to the left side,
 *intArray[2] = 1 which is equal to the search value 1 and we are done.
 *
 *Time complexity is O(nlogn) -> because we divide the array
 *
 */
public class BinarySearch {
	
	public static void main(String ar[]) {
		
		//int intArray[] = {5,1,8,-11,3,21,77,9,10};
		int intArray[] = {-7,-2,0,3,7,9,11,22,33,67,77};
//		System.out.println(findElement(intArray, 9));
//		System.out.println(recursiveBinarySearch(intArray, 9));
		System.out.println(binarySearchImpl2(intArray, -7));
		
		
	}
	/*
	 * Solution One
	 */
	public static int findElement(int intArray[], int element) {
		int start = 0;
		int end = intArray.length;
		 
		while(start < end) {
			int midPoint = (start + end )/2;
			//System.out.println("Mid Point is : "+midPoint);
			if(intArray[midPoint] == element) {
				return midPoint;
			} else if(intArray[midPoint] < element) {
				start = midPoint +1;
			} else {
				end = midPoint;
			}
		}
		return -1;
	}
	
	
	public static int recursiveBinarySearch(int input[], int element) {
		return recursiveBinarySearch(input, 0, input.length, element);
	}
	
	public static int recursiveBinarySearch(int input[], int start, int end, int element) {
		if(start >= end) {
			return -1;
		}
		
		int midPoint = (start + end)/2;
		//System.out.println("Mid Point : "+midPoint);
		
		if(input[midPoint] == element) {
			return midPoint;
		} else if(input[midPoint] < element){
			return recursiveBinarySearch(input, midPoint +1, end, element);
		} else {
			return recursiveBinarySearch(input, start, midPoint, element);
		}
	}

	public static int binarySearchImpl2(int[] input, int element) {
		return binarySearch2(input, element, 0, input.length);
	}
	
	public static int binarySearch2(int[] input, int element, int start, int end) {
		
		int mid = (start + end)/2;
		if(start >= end) {
			return -1;
		}
		if(input[mid] == element) {
			return mid;
		}
		if(input[mid] < element) {
			return binarySearch2(input, element, mid +1, end);
		} else {
			return binarySearch2(input, element, start, mid);
		}

	}
}
