package com.amazon;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_repeating_missing_number {

	public static void main(String[] args) {
		
		int [] arr  = {1,2,2,5,3};
		
		System.out.println(missing_number(arr));
		System.out.println(brute_force(arr));
		System.out.println(Arrays.toString(better_solution(arr)));
		System.out.println(Arrays.toString(optimal_sol_01(arr)));
		
	}
	
	// just missing number
	/*
	 *  
	 * 
	 */
	
	public static int missing_number(int [] arr) {
		
	/*	int arr_sum = 0;
		int n = arr.length;
		for(int i = 0; i<arr.length;i++) {
			
			arr_sum+=arr[i];
		}
	
		int total_sum = n *(n+1)/2;
		
		return total_sum-arr_sum;
	*/
		
		int n = arr.length;
        int sum1=0;
        int sum2 = 0;
        for(int i = 0; i<n;i++){
            
            sum1+=arr[i];
        }
      
        for(int i = 0; i<n+1;i++) {
        	
        	sum2 += i+1;
        	
        }
        
        return sum2-sum1;
	}
	
	
	//Brute force
	public static ArrayList<Integer> brute_force(int [] arr) {
		
		int repeating = -1;
		int missing = -1;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i<=arr.length;i++) {
			
			int count = 0;
			
			for(int j = 0; j<arr.length;j++) {
				
				if(arr[j]==i) {
					count++;
				}
			}
			
			if(count>1)repeating = i;
			else if(count==0)missing=i;
			
			if(repeating!=-1 && missing !=-1) {
				break;
			}
		}
		
		list.add(repeating);
		list.add(missing);
		
		return list;
		
	}
	
	//Better solution
	/*
	 * Thought process check striver
	 */
	
	public static int [] better_solution(int [] arr) {
		
		int repeating = -1;
		int missing =-1;
		
		int [] hash = new int [arr.length+1];
		
		for(int i = 0;i<arr.length;i++) {
			
			hash[arr[i]]++;
		}
		
		for(int i = 1;i<=arr.length;i++) {
			
			if(hash[i]>1) repeating=i;	
			
			if(hash[i]==0) missing=i;
			
			if(repeating!=-1 && missing !=-1) break;
			
		}
		return new int [] {repeating, missing};
		
	}
	
	/*
	 * Optimal solution 1 (using sum of natural numbers)
 	 * 
	 * Thought process check striver
	 * 
	 * 
	 */
	
	
	public static int[] optimal_sol_01(int [] arr) {
		
		long n = arr.length;
		long s=0;
		long sn=0;
		long s2=0;
		long s2n=0;
		
		long x=0;
		long y=0;
		
		for(int i  = 0; i<arr.length;i++) {
			
			s+=(long)arr[i];
			s2+=(long)arr[i]*(long)arr[i];
		}
		
		sn = (n*(n+1))/2;
		s2n = (n*(n+1)*((2*n)+1))/6;
		
		long val1 = s-sn;
		long val2 = s2-s2n;
		
		val2 = val2/val1;
		
		x = (val1+val2)/2;
		y = x-val1;
		
		return new int []{(int)x,(int)y};
		
		
	}
	
	/*
	 * optimal solution 2  - uses XOR so learn it and do it
	 */
}

