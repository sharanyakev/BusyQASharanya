package com.learning.basicsofjava;

public class A2Q3EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 8, 9, 14};
        System.out.print("Even numbers: ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.print("\nOdd numbers: ");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
	}

}
