package com.learning.basicsofjava;

import java.util.HashSet;

public class A2Q6Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] array = {1, 2, 3, 4, 8, 9, 14, 2, 4}; 
	        HashSet<Integer> set = new HashSet<>();
	        System.out.print("Duplicate elements: ");
	        for (int num : array) {
	            if (!set.add(num)) {
	                System.out.print(num + " ");
	            }
	        }
	}

}
