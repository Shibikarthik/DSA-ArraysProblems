package com.amazon;

import java.util.Arrays;

public class Second_Largest_Element {

	public static void main(String[] args) {
		
		//int [] arr = {855,450,132,359,233,825,604,481,262,337,720,525,652,300,906,219,926,906,293,864,817,498,30,639,661};
		
		int[] arr  = {1,2,3,4};
		
	//	System.out.println(bruteForce(arr));
	//  System.out.println(better_approach(arr));
	    System.out.println(optimal_solution(arr));	
	}
	
	/*
	 *Brute force approach
	 *
	 *Thought Process:
	 *  i)Sort the array either you can use sorting algorithm with better time complexity(merge sort) or use inbuilt sort
	 * ii)Iterate it from the backward and find the second largest
	 * 
	 */
	
	public static int bruteForce(int [] arr) {
		
		
		int second_largest = Integer.MIN_VALUE;
		
		Arrays.sort(arr);  // T.C  = O(NlogN)
		
		int largest = arr[arr.length-1];
		
		for(int i =arr.length-2; i>0;i--) {
			
			if(arr.length<3) return arr[i=2];
			
			if(arr[i]!=largest) {
				second_largest=arr[i];
				break;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		return second_largest;
	}
	
	
	/*
	 * Better Approach
	 * Thought process:
	 *   i)find the largest element and store it
	 *  ii)use the same approach to find the second largest , initiate the second_largest value to Integer.MIN_VALUE.
	 *  
	 */
	
	public static int better_approach(int [] arr) {
		
		int first_largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
	
		// 1st pass to find largest element
		
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i]>first_largest) {
				
				first_largest=arr[i];
			}
		} // T.C  = O(N)
		
		//2nd pass to find the second largest element
		
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i]>second_largest && arr[i]!=first_largest) {
				
				second_largest = arr[i];
			}
			
		} // T.C  = O(N)
		
		return second_largest;
		
	} // T.C  = O(N)+O(N)= O(2N)
	
	
	/*
	 * Optimal approach
	 * 
	 * Though Process:
	 *   i)Initiate the value of first largest to arr[0] and second largest to Integer.MINVALUE
	 *   ii)iterate over the array if u find the first and second largest, replace the values accordingly and by the end of the iteration you will have the correct value of the second largest element.
	 *   
	 * 
	 */
	
	public static int optimal_solution(int [] arr) {
		
		int first_largest = arr[0];
		int second_largest = Integer.MIN_VALUE;
		
		for(int i = 1; i<arr.length;i++) {
			
			if(arr[i]>first_largest) {
				   
				second_largest = first_largest;
				first_largest = arr[i];
				
			}else if(arr[i]<first_largest && arr[i]>second_largest) {
				
				second_largest=arr[i];
			}
			
		}
		
		return second_largest;
	}
	
	
}
