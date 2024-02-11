package com.buddywindow.algorithms;

/**
 * 
 * @author sijus
 * 
 * In-Place Algorithm
 * Since it is splitting the array by two the time complexity is O(nlogn)
 * 
 *                       [12,7,99,1,5,-1,32,-7,11]
 *                                  |
 *                    [12,7,99,1]       [5,-1,32,-7,11]        
 *                         |                   |
 *                    [12,7] [99,1]      [5,-1] [32,-7,11]
 *                      |       |          |         |       
 *                  [12] [7] [99] [1]   [5] [-1] [32] [-7,11]
 *                                                       |   
 *                                                     [-7] [11]
 *                  [7] [12] [1] [99]   [-1] [5]  [32] [-7] [11]
 *                     |        |           |           |
 *                   [7,12]  [1,99]      [-1,5]    [32] [-7,11]
 *                          |              |           |       |
 *                    [1,7,12,99]        [-1,5]     [-7,11,32]  -> Example [32 compare with -7, -7 is greater so -7 will be added, then 32 is compared with 11, 11 will be added and last 32 will be added ]
 *                         |                     |
 *                    [1,7,12,99]         [-7,-1,5,11,32]
 *                                   |
 *                            [-7,-1,1,5,7,11,12,32,99]            
 */
public class MergeSort {
	
	public static void main(String ar[]) {
		int[] array = {7,5,2,23,-7,4,-11,32,2};
		mergesort(array, 0, 7);
//		for(int m = 0;m<array.length-1;m++) {
//			System.out.print(array[m]);
//			System.out.println(" ");
//		}
	}
	
	public static void mergesort(int[] input, int start, int end) {
		if(end - start < 2) {
			return;
		}
		int mid = (start + end )/2;
		
		mergesort(input, start, mid); 
		mergesort(input, mid, end);
		merge(input, start, mid, end);
		//System.out.println("Start : "+start+ " Mid : "+mid+" End : "+end);
		
	}
	
	public static void merge(int[] input, int start, int mid, int end) {
		//Here it says [7,5,2,23,-7,4,-11,32,2]
		//The start is 0 the end is 8. So mid is 4 and mid-1 is 3
		//So the element are input[3] <= input[4]. 
		//That is we are checking the last value of right array and first value of left array
		if(input[mid -1] <= input[mid]) {
			return;
		}

		int i = start;
		int j = mid;
		int tempIndex = 0;
		int[] temp = new int[end-start];
		//System.out.println(input[i]);
		//System.out.println(input[j]);
		while(i < mid && j < end) {
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}
		//System.out.println(tempIndex);
		for(int m = 0; m<temp.length; m++) {
			System.out.println(temp[m]);
		}
		System.out.println("-------------------------");
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
		
	}
	
	

}
