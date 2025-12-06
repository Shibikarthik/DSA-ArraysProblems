package com.amazon;

public class Check_If_Array_sorted {

	public static void main(String[] args) {
		
		//int [] arr = {1,2,4,3,5};
		int [] arr = {3,4,5,1,2};
		
		System.out.println(isSorted_inAscending(arr));
		System.out.println(rotated_sorted_array(arr));
	}
	
	public static boolean isSorted_inAscending(int [] arr) {
		
		for(int i = 1; i<arr.length;i++) {
			
			if(arr[i]<arr[i-1]) {
				
				return false;
			}
		}
		
		return true;
	}
	// check if rotated sorted array
	
	public static boolean rotated_sorted_array(int [] arr) {
		
		int count = 0;
		
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i]>arr[(i+1)%arr.length]) {
				
				count++;
			}
			
			if(count>1) return false;
		}
		
		
		return true;
	}	

}
