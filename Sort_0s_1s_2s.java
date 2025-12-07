package com.amazon;

import java.util.Arrays;

public class Sort_0s_1s_2s {

	public static void main(String[] args) {
		
		int [] arr = {0, 1, 2, 0, 1, 2};
		
		//better_solution(arr);
		
		optimal_solution(arr);	
		System.out.println(Arrays.toString(arr));
		
	}
	/*
	 * DO MERGE SORT
	 * TC: O(NLOGN)
	 * SC: O(N)
	 */
	public static void brute_force(int [] arr) {
		
		
	}
	
	/*
	 * Better solution:
	 * 
	 * have 3 counter variables to count 0,1, & 2
	 * then run loops for each count and override the values in the original array
	 * 
	 */
	
	public static void better_solution(int [] arr) {
		
		int count0=0;
		int count1=0;
		int count2=0;
		
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i]==0)count0++;
			if(arr[i]==1)count1++;
			if(arr[i]==2)count2++;
			
		}// TC: O(N)
		
		
		for(int i = 0; i<count0;i++) {
			arr[i]=0;
		}
		for(int i = count0; i<count0+count1;i++) {
			arr[i]=1;
		}
		for(int i = arr.length-count2;i<arr.length;i++) {
			arr[i]=2;
		}
		
	}//T.C = O(N)+O(N) = O(2N)
	
	
	/*
	 * Dutch national flag algorithm (also apple, orange problem like)
	 * 
	 * 
	 * 
	 *  
	 */
	
	public static void optimal_solution(int [] arr) {
		
		int low= 0;
		int mid = 0;
		int high = arr.length-1;
		
		while(mid<=high) {
			
			if(arr[mid]==0) {
				
				int temp =arr[mid];
				arr[mid]=arr[low];
				arr[low] = temp;
				
				low++;
				mid++;
				
			}else if(arr[mid]==1) {
				
				mid++;
			}else {
				
				int temp = arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				
				high--;
			}
		}
		
	}
	
	
	
	
	
}
