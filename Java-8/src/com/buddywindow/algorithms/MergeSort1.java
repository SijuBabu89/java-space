package com.buddywindow.algorithms;

public class MergeSort1 {

	public static void main (String ar[]) {
		 int[] intArray = {22,4,7,-11,-4,32,77,5,-6};
		 mergeSort(intArray, 0, intArray.length-1);
			for(int m = 0;m<intArray.length-1;m++) {
			System.out.print(intArray[m]);
			System.out.println(" ");
		}
		 
	}
	
	public static void mergeSort(int intArray[], int start, int end) {
		
	
		
		if((end - start) < 2) {
			return;
		}
		int mid = (start + end)/2;
		mergeSort(intArray, start, mid);
		mergeSort(intArray, mid, end);
		merge(intArray, start, mid, end);
	}
	
	public static void merge(int[] input, int start, int mid, int end) {
		

		if(input[mid-1] <= input[mid]) {
			return;
		}
		int i = start;
		int j = mid;
		int tempArray[] = new int[end-start];
		int temp = 0;
		while(i < mid && j < end) {
			tempArray[temp++] = input[i] <= input[j] ? input[i++] : input[j++];
		}
//		for(int m = 0; m<tempArray.length; m++) {
//			System.out.println(tempArray[m]);
//		}
//		System.out.println("-------------------------");
		System.arraycopy(input, i, input, start + temp, mid - i);
        System.arraycopy(tempArray, 0, input, start, temp);
	}
	
	
}
