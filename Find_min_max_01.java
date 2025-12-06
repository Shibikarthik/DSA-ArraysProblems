package com.amazon;

import java.util.ArrayList;
import java.util.List;

public class Find_min_max_01 {

	public static void main(String[] args) {
		
		int [] arr = {32011,123,1045,1205,254,28763,6537,3161};
		
		System.out.println(getMinMax(arr));

	}
	
	 public static ArrayList<Integer> getMinMax(int[] arr) {
	      
	      Integer max = Integer.MIN_VALUE;
	      Integer min = Integer.MAX_VALUE;
	      
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      
	      for(int i = 0; i<arr.length;i++){
	          
	          if(arr[i]<min){
	              
	              min = arr[i];
	              
	          }
	          if(arr[i]>max){
	              
	              max = arr[i];
	          }
	          
	      }
	      
	      list.add(min);
	      list.add(max);    
	            
	    return list;        
	    }

}
