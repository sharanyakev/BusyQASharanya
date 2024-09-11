package com.learning.basicsofjava;

public class A2Q1Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 8, 9, 14};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of array values: " + sum);
    }

}
