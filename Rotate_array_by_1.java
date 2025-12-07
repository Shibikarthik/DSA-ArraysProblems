package com.amazon;

import java.util.Arrays;

public class Rotate_array_by_1 {

	public static void main(String[] args) {
		
		int [] arr = {1, 2, 3, 4, 5};
		
		brute_force(arr);
		System.out.println(Arrays.toString(arr));
		rotate(arr);
		System.out.println(Arrays.toString(arr));
	
	}
	
	public static void brute_force(int [] arr) {
		
		int temp = arr[0];
		
		for(int i = 0; i<arr.length-1;i++) {
			
		arr[i]=arr[i+1];	
			
		}
		
		arr[arr.length-1]=temp;
	}
	public static void rotate(int [] arr) {
		
		int i = 0;
		int j = arr.length-2;
		
		while(i<=j) {
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
		int k = 0;
		int l = arr.length-1;
		
		while(k<=l) {
			
			int temp = arr[k];
			arr[k] = arr[l];
			arr[l] = temp;
			
			k++;
			l--;
		}
		
	}

}
