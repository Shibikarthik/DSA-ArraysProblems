package com.amazon;

import java.util.HashMap;
import java.util.Map;

public class Check_Equal_Arrays {

	public static void main(String[] args) {
		
		int [] a = {1, 1, 1,2};
		int [] b = {2, 2,2,1};
		
		System.out.println(checkEqual(a,b));
	}
	
	public static boolean checkEqual(int [] a, int [] b) {
		
		Map<Integer,Integer> mapA = new HashMap<Integer, Integer>();
		Map<Integer,Integer> mapB = new HashMap<Integer, Integer>();
		
		for(int a1 : a) {
			
			mapA.put(a1,mapA.getOrDefault(a1,0)+1);
			
		}
		
		for(int b1 : b) {
			
			mapB.put(b1,mapB.getOrDefault(b1,0)+1);
			
		}
			
	
		for(int i = 0; i<b.length;i++) {
			
			if(mapA.containsKey(b[i]) && mapA.get(b[i])!=0) {
				
				mapA.put(b[i], mapA.get(b[i])-1);
				
			}else {
				return false;
			}
			
			System.out.println(mapA);
		}
		
		return true;
	
	
	
	}
	
	
	
}
